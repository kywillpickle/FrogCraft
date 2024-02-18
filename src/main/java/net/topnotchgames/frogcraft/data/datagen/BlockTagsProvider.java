package net.topnotchgames.frogcraft.data.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.data.tags.Tags;
import net.topnotchgames.frogcraft.world.block.Blocks;

public class BlockTagsProvider extends net.minecraftforge.common.data.BlockTagsProvider {

	public BlockTagsProvider(PackOutput output, CompletableFuture<Provider> lookupProvider,
			@Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, Frogcraft.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
		this.tag(Tags.Blocks.LIMINAL_WALL).add(
				Blocks.BLACK_LIMINAL_WALL.get(),
				Blocks.RED_LIMINAL_WALL.get(),
				Blocks.GREEN_LIMINAL_WALL.get(),
				Blocks.BROWN_LIMINAL_WALL.get(),
				Blocks.BLUE_LIMINAL_WALL.get(),
				Blocks.PURPLE_LIMINAL_WALL.get(),
				Blocks.CYAN_LIMINAL_WALL.get(),
				Blocks.LIGHT_GRAY_LIMINAL_WALL.get(),
				Blocks.GRAY_LIMINAL_WALL.get(),
				Blocks.PINK_LIMINAL_WALL.get(),
				Blocks.LIME_LIMINAL_WALL.get(),
				Blocks.YELLOW_LIMINAL_WALL.get(),
				Blocks.LIGHT_BLUE_LIMINAL_WALL.get(),
				Blocks.MAGENTA_LIMINAL_WALL.get(),
				Blocks.ORANGE_LIMINAL_WALL.get(),
				Blocks.WHITE_LIMINAL_WALL.get()
		);
		
		this.tag(Tags.Blocks.LIMINAL_CARPET).add(
				Blocks.BLACK_LIMINAL_CARPET.get(),
				Blocks.RED_LIMINAL_CARPET.get(),
				Blocks.GREEN_LIMINAL_CARPET.get(),
				Blocks.BROWN_LIMINAL_CARPET.get(),
				Blocks.BLUE_LIMINAL_CARPET.get(),
				Blocks.PURPLE_LIMINAL_CARPET.get(),
				Blocks.CYAN_LIMINAL_CARPET.get(),
				Blocks.LIGHT_GRAY_LIMINAL_CARPET.get(),
				Blocks.GRAY_LIMINAL_CARPET.get(),
				Blocks.PINK_LIMINAL_CARPET.get(),
				Blocks.LIME_LIMINAL_CARPET.get(),
				Blocks.YELLOW_LIMINAL_CARPET.get(),
				Blocks.LIGHT_BLUE_LIMINAL_CARPET.get(),
				Blocks.MAGENTA_LIMINAL_CARPET.get(),
				Blocks.ORANGE_LIMINAL_CARPET.get(),
				Blocks.WHITE_LIMINAL_CARPET.get()
		);
		
		this.tag(Tags.Blocks.LIMINAL_TILES).add(
				Blocks.BLACK_LIMINAL_TILES.get(),
				Blocks.RED_LIMINAL_TILES.get(),
				Blocks.GREEN_LIMINAL_TILES.get(),
				Blocks.BROWN_LIMINAL_TILES.get(),
				Blocks.BLUE_LIMINAL_TILES.get(),
				Blocks.PURPLE_LIMINAL_TILES.get(),
				Blocks.CYAN_LIMINAL_TILES.get(),
				Blocks.LIGHT_GRAY_LIMINAL_TILES.get(),
				Blocks.GRAY_LIMINAL_TILES.get(),
				Blocks.PINK_LIMINAL_TILES.get(),
				Blocks.LIME_LIMINAL_TILES.get(),
				Blocks.YELLOW_LIMINAL_TILES.get(),
				Blocks.LIGHT_BLUE_LIMINAL_TILES.get(),
				Blocks.MAGENTA_LIMINAL_TILES.get(),
				Blocks.ORANGE_LIMINAL_TILES.get(),
				Blocks.WHITE_LIMINAL_TILES.get()
		);
	}
}
