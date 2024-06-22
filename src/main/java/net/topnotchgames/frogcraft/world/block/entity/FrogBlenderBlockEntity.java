package net.topnotchgames.frogcraft.world.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class FrogBlenderBlockEntity extends BlockEntity {

	public static final int CAPACITY = 4;
	private int numFrogs;
	
	private static final float LERP_COEF = 0.1F;
	private static final float MAX_GOOP_HEIGHT = 14.0F;
	private float goopHeight;
	
	public FrogBlenderBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(BlockEntities.FROG_BLENDER_BLOCK_ENTITY.get(), blockPos, blockState);
		this.numFrogs = 0;
		this.goopHeight = 0.0F;
	}
	
	public boolean addFrog() {
		if(this.numFrogs == CAPACITY) return false;
		++numFrogs;
		return true;
	}
	
	public int getNumFrogs() {
		return numFrogs;
	}
	
	public float getGoopHeight() {
		return goopHeight;
	}
	
	public static void clientTick(Level level, BlockPos blockPos, BlockState blockState, FrogBlenderBlockEntity blenderEntity) {
		blenderEntity.goopHeight += LERP_COEF*(MAX_GOOP_HEIGHT*(float)blenderEntity.numFrogs/(float)CAPACITY - blenderEntity.goopHeight);
	}
	
	@Override
	protected void saveAdditional(CompoundTag tag) {
		tag.putInt("frog_blender.num_frogs", this.numFrogs);
		super.saveAdditional(tag);
	}
	
	@Override
	public void load(CompoundTag tag) {
		super.load(tag);
		this.numFrogs = tag.getInt("frog_blender.num_frogs");
	}
	
	@Override
	public Packet<ClientGamePacketListener> getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}
	
	@Override
	public CompoundTag getUpdateTag() {
		return saveWithoutMetadata();
	}
}
