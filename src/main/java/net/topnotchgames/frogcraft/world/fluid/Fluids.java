package net.topnotchgames.frogcraft.world.fluid;

import java.util.function.Supplier;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.block.Blocks;
import net.topnotchgames.frogcraft.world.item.Items;

public class Fluids {
	
	/* Initialize the Deferred Fluids Register */
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Frogcraft.MODID);
    
	public static final RegistryObject<FlowingFluid> FLOWING_GOOP = register("flowing_goop", () -> new ForgeFlowingFluid.Flowing(Fluids.GOOP_FLUID_PROPERTIES));
	public static final RegistryObject<FlowingFluid> GOOP = register("goop", () -> new ForgeFlowingFluid.Source(Fluids.GOOP_FLUID_PROPERTIES));
	
	/* Initialize Fluid Properties */
	public static final ForgeFlowingFluid.Properties GOOP_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(FluidTypes.GOOP_FLUID_TYPE, GOOP, FLOWING_GOOP)
			.slopeFindDistance(2).levelDecreasePerBlock(2).block(Blocks.GOOP)
			.bucket(Items.GOOP_BUCKET);
	
	/* Register Helpers */
	private static <T extends Fluid> RegistryObject<T> register(String name, Supplier<T> fluid) {
		return FLUIDS.register(name, fluid);
	}
	
	/* Deferred Register */
	public static void registerFluids(IEventBus modEventBus) {
		FLUIDS.register(modEventBus);
	}
}
