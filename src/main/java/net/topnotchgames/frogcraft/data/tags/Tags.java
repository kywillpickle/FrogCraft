package net.topnotchgames.frogcraft.data.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.topnotchgames.frogcraft.Frogcraft;

public class Tags {
	public static class Blocks {
		public static final TagKey<Block> LIMINAL_CARPET = tag("liminal_carpet");
		public static final TagKey<Block> LIMINAL_TILES = tag("liminal_tiles");
		public static final TagKey<Block> LIMINAL_WALL = tag("liminal_wall");
		
		private static TagKey<Block> tag(String name) {
			return BlockTags.create(new ResourceLocation(Frogcraft.MODID, name));
		}
	}
	public static class Items {
		public static final TagKey<Item> LIMINAL_CARPET = tag("liminal_carpet");
		public static final TagKey<Item> LIMINAL_TILES = tag("liminal_tiles");
		public static final TagKey<Item> LIMINAL_WALL = tag("liminal_wall");
		
		private static TagKey<Item> tag(String name) {
			return ItemTags.create(new ResourceLocation(Frogcraft.MODID, name));
		}
	}
}
