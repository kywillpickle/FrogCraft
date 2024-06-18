package net.topnotchgames.frogcraft.world.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.EnderChestBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.topnotchgames.frogcraft.world.block.entity.FrogBlenderBlockEntity;

public class FrogBlenderBlock extends MachineBlock {

	public FrogBlenderBlock() {
		super(BlockBehaviour.Properties.of());
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return new FrogBlenderBlockEntity(blockPos, blockState);
	}

}
