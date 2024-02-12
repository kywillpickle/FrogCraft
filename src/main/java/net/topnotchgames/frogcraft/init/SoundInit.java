package net.topnotchgames.frogcraft.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.topnotchgames.frogcraft.Frogcraft;
import net.minecraft.tags.ItemTags;

public abstract class SoundInit {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Frogcraft.MODID);
	
	public static final RegistryObject<SoundEvent> LONE_LILYPAD_DISK = SOUND_EVENTS.register("music_disc_lone_lilypad", () ->
		SoundEvent.createVariableRangeEvent(new ResourceLocation(Frogcraft.MODID, "music_disc_lone_lilypad")));
	
	public static final RegistryObject<SoundEvent> LIGHT_FIXTURE_BLOCK = SOUND_EVENTS.register("light_fixture_block", () ->
		SoundEvent.createVariableRangeEvent(new ResourceLocation(Frogcraft.MODID, "light_fixture_block")));
	
	public static final RegistryObject<SoundEvent> DESERT_FROG_CROAK_1 = SOUND_EVENTS.register("desert_frog_croak_1", () ->
		SoundEvent.createVariableRangeEvent(new ResourceLocation(Frogcraft.MODID, "desert_frog_croak_1")));
	public static final RegistryObject<SoundEvent> DESERT_FROG_CROAK_2 = SOUND_EVENTS.register("desert_frog_croak_2", () ->
		SoundEvent.createVariableRangeEvent(new ResourceLocation(Frogcraft.MODID, "desert_frog_croak_2")));

	public static void registerSounds(IEventBus modEventBus) {
		SOUND_EVENTS.register(modEventBus);
	}
}
