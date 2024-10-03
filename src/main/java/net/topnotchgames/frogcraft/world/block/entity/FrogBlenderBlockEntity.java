package net.topnotchgames.frogcraft.world.block.entity;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.topnotchgames.frogcraft.world.fluid.Fluids;

public class FrogBlenderBlockEntity extends BlockEntity {
	
	public static final int CAPACITY = FluidType.BUCKET_VOLUME;
	private FluidTank tank = new FluidTank(CAPACITY);
	private final LazyOptional<IFluidHandler> tank_holder = LazyOptional.of(() -> tank);
	
	public static final int GOOP_PER_FROG = 250;
	private static final float LERP_COEF = 0.2F;
	private static final float MAX_GOOP_HEIGHT = 14.0F;
	private float goopHeight = 0.0F;
	
	public FrogBlenderBlockEntity(BlockPos blockPos, BlockState blockState) {
		super(BlockEntities.FROG_BLENDER_BLOCK_ENTITY.get(), blockPos, blockState);
		tank.setFluid(new FluidStack(Fluids.GOOP.get(), 0));
	}
	
	public boolean addFrog() {
		return changeFluidAmount(GOOP_PER_FROG);
	}
	
	public boolean changeFluidAmount(int amount) {
		if(tank.getFluidAmount() + amount < 0 || tank.getFluidAmount() + amount > CAPACITY) return false;
		tank.getFluid().grow(amount);
		return true;
	}
	
	public void setFluid(Fluid fluid, int amount) {
		tank.setFluid(new FluidStack(fluid, amount));
	}
	
	public int getFluidLevel() {
		return tank.getFluidAmount();
	}
	
	public float getGoopHeight() {
		return goopHeight;
	}
	
	public static void clientTick(Level level, BlockPos blockPos, BlockState blockState, FrogBlenderBlockEntity blenderEntity) {
		blenderEntity.goopHeight += LERP_COEF*(MAX_GOOP_HEIGHT*(float)blenderEntity.getFluidLevel()/(float)CAPACITY - blenderEntity.goopHeight);
	}
	
	@Override
	@Nonnull
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction facing)
	{
		if (capability == ForgeCapabilities.FLUID_HANDLER)
			return tank_holder.cast();
		return super.getCapability(capability, facing);
	}

	public FluidTank getTank(){
		return this.tank;
	}
	
	@Override
	protected void saveAdditional(CompoundTag tag) {
		super.saveAdditional(tag);
		tank.writeToNBT(tag);
	}
	
	@Override
	public void load(CompoundTag tag) {
		super.load(tag);
		tank.readFromNBT(tag);
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
