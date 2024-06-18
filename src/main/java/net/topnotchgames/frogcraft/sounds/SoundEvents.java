package net.topnotchgames.frogcraft.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.topnotchgames.frogcraft.Frogcraft;

public class SoundEvents {
	
	/* Initialize the Deferred SoundEvent Register */
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Frogcraft.MODID);
	
	/* Initialize SoundEvents */
	public static final RegistryObject<SoundEvent> LONE_LILYPAD_DISK = register("music_disc_lone_lilypad");
	
	public static final RegistryObject<SoundEvent> LIGHT_FIXTURE_BLOCK = register("light_fixture_block");
	
	/* Entity Sounds */
	public static final RegistryObject<SoundEvent> DESERT_FROG_CROAK_AMBIENT = register("desert_frog_croak_ambient");
	public static final RegistryObject<SoundEvent> DESERT_FROG_CROAK_HURT = register("desert_frog_croak_hurt");
	
	public static final RegistryObject<SoundEvent> CRIMSON_FROG_CROAK_AMBIENT = register("crimson_frog_croak_ambient");
	public static final RegistryObject<SoundEvent> CRIMSON_FROG_CROAK_HURT = register("crimson_frog_croak_hurt");
	
	/* Register Helpers */
	private static RegistryObject<SoundEvent> register(String name) {
		return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Frogcraft.MODID, name)));
	}
	
	/* Deferred Register */
	public static void registerSounds(IEventBus modEventBus) {
		SOUND_EVENTS.register(modEventBus);
	}
}
