package net.topnotchgames.frogcraft.common.blocks.entity.block;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.topnotchgames.frogcraft.common.blocks.LightFixtureBlock;
import net.topnotchgames.frogcraft.init.BlockEntityInit;

public class LightFixtureBlockEntity extends BlockEntity{
    /* Add each block entity to the DeferredRegister */
    private static final int TICK_INTERVAL = 7;
    private int tickIterator = 0;

    public LightFixtureBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.LIGHT_FIXTURE_BLOCK_ENTITY.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BlockEntity blockEntity) {
        if(((LightFixtureBlockEntity)blockEntity).tickIterator == TICK_INTERVAL-1) {
            List<Frog> frogsInRange = level.getEntitiesOfClass(Frog.class, state.getShape(level, pos).bounds().inflate(10d, 10d, 10d));
            if (frogsInRange != null && (frogsInRange.size() > 0) != (state.getValue(LightFixtureBlock.BLINKING))) {
                level.setBlock(pos, state.cycle(LightFixtureBlock.BLINKING).cycle(LightFixtureBlock.LIT), 2);
                level.scheduleTick(pos, state.getBlock(), 2);
            }
            ((LightFixtureBlockEntity)blockEntity).tickIterator = 0;
        }
        else {
            ((LightFixtureBlockEntity)blockEntity).tickIterator++;
        }
    }
}
