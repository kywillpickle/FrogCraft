package net.topnotchgames.frogcraft.common.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsGenerator extends ItemTagsProvider {

	public ItemTagsGenerator(PackOutput p_275343_, CompletableFuture<Provider> p_275729_,
			CompletableFuture<TagLookup<Block>> p_275322_, String modId,
			@Nullable ExistingFileHelper existingFileHelper) {
		super(p_275343_, p_275729_, p_275322_, modId, existingFileHelper);
	}

	@Override
	protected void addTags(Provider p_256380_) {
		// TODO Auto-generated method stub
		
	}

}
