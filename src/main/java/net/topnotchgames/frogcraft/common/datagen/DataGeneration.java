package net.topnotchgames.frogcraft.common.datagen;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.topnotchgames.frogcraft.Frogcraft;

@Mod.EventBusSubscriber(modid = Frogcraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
		
		generator.addProvider(event.includeServer(), new ItemTagsGenerator(packOutput, lookupProvider, null, Frogcraft.MODID, existingFileHelper));
	}

}
