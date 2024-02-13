package net.topnotchgames.frogcraft.common.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.topnotchgames.frogcraft.Frogcraft;

public class FrogcraftItemTagsProvider extends ItemTagsProvider {

	public FrogcraftItemTagsProvider(PackOutput p_275343_, CompletableFuture<Provider> p_275729_,
			CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
		super(p_275343_, p_275729_, p_275322_, Frogcraft.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider p_256380_) {
		// TODO Auto-generated method stub
		
	}


}
