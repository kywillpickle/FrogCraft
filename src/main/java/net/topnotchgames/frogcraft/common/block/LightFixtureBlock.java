package net.topnotchgames.frogcraft.common.block;

import java.util.function.ToIntFunction;

import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.AABB;
import net.topnotchgames.frogcraft.common.SoundEvents.SoundEvents;

public class LightFixtureBlock extends RotatedPillarBlock {
	public static final int EMISSION_OFFSET = 6;
	public static final BooleanProperty LIT = BlockStateProperties.LIT;
	public static final BooleanProperty BLINKING = BooleanProperty.create("blinking");

	public LightFixtureBlock() {
		super(BlockBehaviour.Properties.of()
				.lightLevel(LightFixtureBlock
						.litBlockEmission())
				.randomTicks()
		);
		this.registerDefaultState(this.stateDefinition.any()
			.setValue(LIT, Boolean.valueOf(false))
			.setValue(BLINKING, Boolean.valueOf(false)));
	}
	
	public static ToIntFunction<BlockState> litBlockEmission() {
		return (state) -> {
			if (state.getValue(BLINKING)) {return state.getValue(LIT) ? 10 : 5;}
			else                          {return state.getValue(LIT) ? 15 : 0;}
		};
	}
	
	@Nullable
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		return this.defaultBlockState().setValue(LIT, Boolean.valueOf(ctx.getLevel().hasNeighborSignal(ctx.getClickedPos())));
    }
	
	public void neighborChanged(BlockState state, Level level, BlockPos thispos, Block block, BlockPos thatpos, boolean bool) {
		if (!level.isClientSide) {
		   boolean flag = state.getValue(LIT);
		   if (flag != level.hasNeighborSignal(thispos)) {
			  level.setBlock(thispos, state.cycle(LIT), 2);
		   }
		}
	}
	
	public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		boolean isfrog = false;
		if(level.getEntitiesOfClass(Frog.class, (new AABB((double)x, (double)(y - 2), (double)z, (double)x, (double)y, (double)z)).inflate(2.0D, 3.0D, 2.0D)).size() > 0) {
			isfrog = true;
		}
		boolean isblinking = state.getValue(BLINKING);
		if (isblinking) {
			level.scheduleTick(pos, this, 50 + rand.nextInt(50));
			level.setBlock(pos, state.cycle(BLINKING), 2);
		} else if (isfrog) {
			level.scheduleTick(pos, this, 5 + rand.nextInt(5));
			level.playSound(null, pos, SoundEvents.LIGHT_FIXTURE_BLOCK.get(), SoundSource.BLOCKS, 0.7F, 1.0F);
			level.setBlock(pos, state.cycle(BLINKING), 2);
		} else {
			level.scheduleTick(pos, this, 100);
		}
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(LIT).add(BLINKING);
	}
}
