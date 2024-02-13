package net.topnotchgames.frogcraft.common.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.topnotchgames.frogcraft.Frogcraft;

public class FrogcraftBlockTagsProvider extends BlockTagsProvider {

	public FrogcraftBlockTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider,
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, Frogcraft.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider p_256380_) {
		return;
	}
}
