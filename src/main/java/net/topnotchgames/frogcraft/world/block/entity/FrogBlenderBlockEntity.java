package net.topnotchgames.frogcraft.world.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class FrogBlenderBlockEntity extends BlockEntity {

	public FrogBlenderBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(BlockEntities.FROG_BLENDER_BLOCK_ENTITY.get(), blockPos, blockState);
	}

}
