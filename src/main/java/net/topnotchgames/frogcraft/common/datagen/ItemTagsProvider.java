package net.topnotchgames.frogcraft.common.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.item.Items;
import net.topnotchgames.frogcraft.common.tags.Tags;

public class ItemTagsProvider extends net.minecraft.data.tags.ItemTagsProvider {

	public ItemTagsProvider(PackOutput p_275343_, CompletableFuture<Provider> p_275729_,
			CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
		super(p_275343_, p_275729_, p_275322_, Frogcraft.MODID, existingFileHelper);
	}

	@Override
	protected void addTags(Provider provider) {
		
		/* Minecraft Tags */
		this.tag(ItemTags.MUSIC_DISCS).add(
				Items.MUSIC_DISC_LONE_LILYPAD.get()
		);
		
		this.tag(ItemTags.WOOL).add(
				Items.BLACK_LIMINAL_CARPET.get(),
				Items.RED_LIMINAL_CARPET.get(),
				Items.GREEN_LIMINAL_CARPET.get(),
				Items.BROWN_LIMINAL_CARPET.get(),
				Items.BLUE_LIMINAL_CARPET.get(),
				Items.PURPLE_LIMINAL_CARPET.get(),
				Items.CYAN_LIMINAL_CARPET.get(),
				Items.LIGHT_GRAY_LIMINAL_CARPET.get(),
				Items.GRAY_LIMINAL_CARPET.get(),
				Items.PINK_LIMINAL_CARPET.get(),
				Items.LIME_LIMINAL_CARPET.get(),
				Items.YELLOW_LIMINAL_CARPET.get(),
				Items.LIGHT_BLUE_LIMINAL_CARPET.get(),
				Items.MAGENTA_LIMINAL_CARPET.get(),
				Items.ORANGE_LIMINAL_CARPET.get(),
				Items.WHITE_LIMINAL_CARPET.get()
		);
		
		/* Frogcraft Tags */
		this.tag(Tags.Items.LIMINAL_WALL).add(
				Items.BLACK_LIMINAL_WALL.get(),
				Items.RED_LIMINAL_WALL.get(),
				Items.GREEN_LIMINAL_WALL.get(),
				Items.BROWN_LIMINAL_WALL.get(),
				Items.BLUE_LIMINAL_WALL.get(),
				Items.PURPLE_LIMINAL_WALL.get(),
				Items.CYAN_LIMINAL_WALL.get(),
				Items.LIGHT_GRAY_LIMINAL_WALL.get(),
				Items.GRAY_LIMINAL_WALL.get(),
				Items.PINK_LIMINAL_WALL.get(),
				Items.LIME_LIMINAL_WALL.get(),
				Items.YELLOW_LIMINAL_WALL.get(),
				Items.LIGHT_BLUE_LIMINAL_WALL.get(),
				Items.MAGENTA_LIMINAL_WALL.get(),
				Items.ORANGE_LIMINAL_WALL.get(),
				Items.WHITE_LIMINAL_WALL.get()
		);
		
		this.tag(Tags.Items.LIMINAL_CARPET).add(
				Items.BLACK_LIMINAL_CARPET.get(),
				Items.RED_LIMINAL_CARPET.get(),
				Items.GREEN_LIMINAL_CARPET.get(),
				Items.BROWN_LIMINAL_CARPET.get(),
				Items.BLUE_LIMINAL_CARPET.get(),
				Items.PURPLE_LIMINAL_CARPET.get(),
				Items.CYAN_LIMINAL_CARPET.get(),
				Items.LIGHT_GRAY_LIMINAL_CARPET.get(),
				Items.GRAY_LIMINAL_CARPET.get(),
				Items.PINK_LIMINAL_CARPET.get(),
				Items.LIME_LIMINAL_CARPET.get(),
				Items.YELLOW_LIMINAL_CARPET.get(),
				Items.LIGHT_BLUE_LIMINAL_CARPET.get(),
				Items.MAGENTA_LIMINAL_CARPET.get(),
				Items.ORANGE_LIMINAL_CARPET.get(),
				Items.WHITE_LIMINAL_CARPET.get()
		);
		
		this.tag(Tags.Items.LIMINAL_TILES).add(
				Items.BLACK_LIMINAL_TILES.get(),
				Items.RED_LIMINAL_TILES.get(),
				Items.GREEN_LIMINAL_TILES.get(),
				Items.BROWN_LIMINAL_TILES.get(),
				Items.BLUE_LIMINAL_TILES.get(),
				Items.PURPLE_LIMINAL_TILES.get(),
				Items.CYAN_LIMINAL_TILES.get(),
				Items.LIGHT_GRAY_LIMINAL_TILES.get(),
				Items.GRAY_LIMINAL_TILES.get(),
				Items.PINK_LIMINAL_TILES.get(),
				Items.LIME_LIMINAL_TILES.get(),
				Items.YELLOW_LIMINAL_TILES.get(),
				Items.LIGHT_BLUE_LIMINAL_TILES.get(),
				Items.MAGENTA_LIMINAL_TILES.get(),
				Items.ORANGE_LIMINAL_TILES.get(),
				Items.WHITE_LIMINAL_TILES.get()
		);
	}


}
