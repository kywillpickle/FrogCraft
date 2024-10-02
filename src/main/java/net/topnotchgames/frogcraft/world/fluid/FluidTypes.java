package net.topnotchgames.frogcraft.world.fluid;

import java.util.function.Supplier;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.FluidType.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;

public class FluidTypes {
	
	/* Initialize the Deferred FluidTypes Register */
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, Frogcraft.MODID);
    
    public static final ResourceLocation GOOP_FLOWING_RL = new ResourceLocation(Frogcraft.MODID, "block/goop_flow");
    public static final ResourceLocation GOOP_STILL_RL = new ResourceLocation(Frogcraft.MODID, "block/goop_still");
    public static final RegistryObject<FluidType> GOOP_FLUID_TYPE = register("goop_fluid",
            FluidType.Properties.create().lightLevel(1).density(15).viscosity(2).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));
    
    /* Register Helpers */
    private static RegistryObject<FluidType> register(String name, Properties properties) {
		return FLUID_TYPES.register(name, () -> new GoopFluidType(GOOP_STILL_RL, GOOP_FLOWING_RL, properties));
	}
    
    /* Deferred Register */
	public static void registerFluidTypes(IEventBus modEventBus) {
		FLUID_TYPES.register(modEventBus);
	}
}
