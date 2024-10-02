package net.topnotchgames.frogcraft.world.block;

import java.util.Optional;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BellBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.topnotchgames.frogcraft.world.block.entity.BlockEntities;
import net.topnotchgames.frogcraft.world.block.entity.FrogBlenderBlockEntity;

public class FrogBlenderBlock extends MachineBlock {

	public FrogBlenderBlock() {
		super(BlockBehaviour.Properties.of());
	}
	
	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return Block.box(1.0F, 0.0F, 1.0F, 15.0F, 15.0F, 15.0F);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
		return new FrogBlenderBlockEntity(blockPos, blockState);
	}
	
	@Override
	public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
		Optional<FrogBlenderBlockEntity> blenderEntity = level.getBlockEntity(blockPos, BlockEntities.FROG_BLENDER_BLOCK_ENTITY.get());
		if(!level.isClientSide()) {
			if(blenderEntity.isPresent()) {
				blenderEntity.get().addFrog();
				level.sendBlockUpdated(blockPos, blockState, blockState, UPDATE_ALL);
				level.blockEntityChanged(blockPos);
			}
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.sidedSuccess(level.isClientSide());
	}
	
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_153212_, BlockState p_153213_, BlockEntityType<T> p_153214_) {
		return createTickerHelper(p_153214_, BlockEntities.FROG_BLENDER_BLOCK_ENTITY.get(), p_153212_.isClientSide ? FrogBlenderBlockEntity::clientTick : null);
	}
}
