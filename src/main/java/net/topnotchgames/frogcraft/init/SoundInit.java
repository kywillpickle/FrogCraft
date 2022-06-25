package net.topnotchgames.frogcraft.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.topnotchgames.frogcraft.Frogcraft;

public class SoundInit {
	public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Frogcraft.MODID);
	
	public static final RegistryObject<SoundEvent> LONE_LILYPAD_DISK = SOUND_EVENTS.register("music_disc_lone_lilypad", () ->
		new SoundEvent(new ResourceLocation(Frogcraft.MODID, "music_disc_lone_lilypad")));
	
	public static void registerSounds(IEventBus modEventBus) {
		SOUND_EVENTS.register(modEventBus);
	}
}
