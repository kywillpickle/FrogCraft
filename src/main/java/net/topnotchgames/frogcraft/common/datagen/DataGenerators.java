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
public class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		PackOutput packOutput = generator.getPackOutput();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
		
		generator.addProvider(event.includeServer(), new RecipeProvider(packOutput));
//		generator.addProvider(event.includeServer(), new FrogcraftLootTableProvider(packOutput));
//		
//		generator.addProvider(event.includeServer(), new FrogcraftBlockStateProvider(packOutput, existingFileHelper));
//		generator.addProvider(event.includeServer(), new FrogcraftItemModelProvider(packOutput, existingFileHelper));
		
//		FrogcraftBlockTagsProvider blockTagsProvider = generator.addProvider(event.includeServer(),
//				new FrogcraftBlockTagsProvider(packOutput, lookupProvider, existingFileHelper));
//		generator.addProvider(event.includeServer(), new FrogcraftItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
	}

}