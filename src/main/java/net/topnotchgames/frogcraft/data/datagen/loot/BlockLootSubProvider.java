package net.topnotchgames.frogcraft.data.datagen.loot;

import java.util.Set;

import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.world.block.Blocks;

public class BlockLootSubProvider extends net.minecraft.data.loot.BlockLootSubProvider {

	public BlockLootSubProvider() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		
		dropSelf(Blocks.FROG_BLENDER_BLOCK);
		dropSelf(Blocks.LIGHT_FIXTURE_BLOCK);
		
		/* Liminal Blocks */
		dropSelf(Blocks.BLACK_LIMINAL_WALL);
		dropSelf(Blocks.RED_LIMINAL_WALL);
		dropSelf(Blocks.GREEN_LIMINAL_WALL);
		dropSelf(Blocks.BROWN_LIMINAL_WALL);
		dropSelf(Blocks.BLUE_LIMINAL_WALL);
		dropSelf(Blocks.PURPLE_LIMINAL_WALL);
		dropSelf(Blocks.CYAN_LIMINAL_WALL);
		dropSelf(Blocks.LIGHT_GRAY_LIMINAL_WALL);
		dropSelf(Blocks.GRAY_LIMINAL_WALL);
		dropSelf(Blocks.PINK_LIMINAL_WALL);
		dropSelf(Blocks.LIME_LIMINAL_WALL);
		dropSelf(Blocks.YELLOW_LIMINAL_WALL);
		dropSelf(Blocks.LIGHT_BLUE_LIMINAL_WALL);
		dropSelf(Blocks.MAGENTA_LIMINAL_WALL);
		dropSelf(Blocks.ORANGE_LIMINAL_WALL);
		dropSelf(Blocks.WHITE_LIMINAL_WALL);
		
		dropSelf(Blocks.BLACK_LIMINAL_CARPET);
		dropSelf(Blocks.RED_LIMINAL_CARPET);
		dropSelf(Blocks.GREEN_LIMINAL_CARPET);
		dropSelf(Blocks.BROWN_LIMINAL_CARPET);
		dropSelf(Blocks.BLUE_LIMINAL_CARPET);
		dropSelf(Blocks.PURPLE_LIMINAL_CARPET);
		dropSelf(Blocks.CYAN_LIMINAL_CARPET);
		dropSelf(Blocks.LIGHT_GRAY_LIMINAL_CARPET);
		dropSelf(Blocks.GRAY_LIMINAL_CARPET);
		dropSelf(Blocks.PINK_LIMINAL_CARPET);
		dropSelf(Blocks.LIME_LIMINAL_CARPET);
		dropSelf(Blocks.YELLOW_LIMINAL_CARPET);
		dropSelf(Blocks.LIGHT_BLUE_LIMINAL_CARPET);
		dropSelf(Blocks.MAGENTA_LIMINAL_CARPET);
		dropSelf(Blocks.ORANGE_LIMINAL_CARPET);
		dropSelf(Blocks.WHITE_LIMINAL_CARPET);
		
		dropSelf(Blocks.BLACK_LIMINAL_TILES);
		dropSelf(Blocks.RED_LIMINAL_TILES);
		dropSelf(Blocks.GREEN_LIMINAL_TILES);
		dropSelf(Blocks.BROWN_LIMINAL_TILES);
		dropSelf(Blocks.BLUE_LIMINAL_TILES);
		dropSelf(Blocks.PURPLE_LIMINAL_TILES);
		dropSelf(Blocks.CYAN_LIMINAL_TILES);
		dropSelf(Blocks.LIGHT_GRAY_LIMINAL_TILES);
		dropSelf(Blocks.GRAY_LIMINAL_TILES);
		dropSelf(Blocks.PINK_LIMINAL_TILES);
		dropSelf(Blocks.LIME_LIMINAL_TILES);
		dropSelf(Blocks.YELLOW_LIMINAL_TILES);
		dropSelf(Blocks.LIGHT_BLUE_LIMINAL_TILES);
		dropSelf(Blocks.MAGENTA_LIMINAL_TILES);
		dropSelf(Blocks.ORANGE_LIMINAL_TILES);
		dropSelf(Blocks.WHITE_LIMINAL_TILES);
	}
	
	private void dropSelf(RegistryObject<? extends Block> block) {
		this.dropSelf(block.get());
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks() {
		return Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}
