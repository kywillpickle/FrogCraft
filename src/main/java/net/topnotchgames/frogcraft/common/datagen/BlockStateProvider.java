package net.topnotchgames.frogcraft.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.block.Blocks;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {

	public BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Frogcraft.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		
		blockWithItem(Blocks.LIGHT_FIXTURE_BLOCK);
		
		/* Liminal Block Recipies */
		blockWithItem(Blocks.BLACK_LIMINAL_WALL);
		blockWithItem(Blocks.RED_LIMINAL_WALL);
		blockWithItem(Blocks.GREEN_LIMINAL_WALL);
		blockWithItem(Blocks.BROWN_LIMINAL_WALL);
		blockWithItem(Blocks.BLUE_LIMINAL_WALL);
		blockWithItem(Blocks.PURPLE_LIMINAL_WALL);
		blockWithItem(Blocks.CYAN_LIMINAL_WALL);
		blockWithItem(Blocks.LIGHT_GRAY_LIMINAL_WALL);
		blockWithItem(Blocks.GRAY_LIMINAL_WALL);
		blockWithItem(Blocks.PINK_LIMINAL_WALL);
		blockWithItem(Blocks.LIME_LIMINAL_WALL);
		blockWithItem(Blocks.YELLOW_LIMINAL_WALL);
		blockWithItem(Blocks.LIGHT_BLUE_LIMINAL_WALL);
		blockWithItem(Blocks.MAGENTA_LIMINAL_WALL);
		blockWithItem(Blocks.ORANGE_LIMINAL_WALL);
		blockWithItem(Blocks.WHITE_LIMINAL_WALL);
		
		blockWithItem(Blocks.BLACK_LIMINAL_CARPET);
		blockWithItem(Blocks.RED_LIMINAL_CARPET);
		blockWithItem(Blocks.GREEN_LIMINAL_CARPET);
		blockWithItem(Blocks.BROWN_LIMINAL_CARPET);
		blockWithItem(Blocks.BLUE_LIMINAL_CARPET);
		blockWithItem(Blocks.PURPLE_LIMINAL_CARPET);
		blockWithItem(Blocks.CYAN_LIMINAL_CARPET);
		blockWithItem(Blocks.LIGHT_GRAY_LIMINAL_CARPET);
		blockWithItem(Blocks.GRAY_LIMINAL_CARPET);
		blockWithItem(Blocks.PINK_LIMINAL_CARPET);
		blockWithItem(Blocks.LIME_LIMINAL_CARPET);
		blockWithItem(Blocks.YELLOW_LIMINAL_CARPET);
		blockWithItem(Blocks.LIGHT_BLUE_LIMINAL_CARPET);
		blockWithItem(Blocks.MAGENTA_LIMINAL_CARPET);
		blockWithItem(Blocks.ORANGE_LIMINAL_CARPET);
		blockWithItem(Blocks.WHITE_LIMINAL_CARPET);
		
		blockWithItem(Blocks.BLACK_LIMINAL_TILES);
		blockWithItem(Blocks.RED_LIMINAL_TILES);
		blockWithItem(Blocks.GREEN_LIMINAL_TILES);
		blockWithItem(Blocks.BROWN_LIMINAL_TILES);
		blockWithItem(Blocks.BLUE_LIMINAL_TILES);
		blockWithItem(Blocks.PURPLE_LIMINAL_TILES);
		blockWithItem(Blocks.CYAN_LIMINAL_TILES);
		blockWithItem(Blocks.LIGHT_GRAY_LIMINAL_TILES);
		blockWithItem(Blocks.GRAY_LIMINAL_TILES);
		blockWithItem(Blocks.PINK_LIMINAL_TILES);
		blockWithItem(Blocks.LIME_LIMINAL_TILES);
		blockWithItem(Blocks.YELLOW_LIMINAL_TILES);
		blockWithItem(Blocks.LIGHT_BLUE_LIMINAL_TILES);
		blockWithItem(Blocks.MAGENTA_LIMINAL_TILES);
		blockWithItem(Blocks.ORANGE_LIMINAL_TILES);
		blockWithItem(Blocks.WHITE_LIMINAL_TILES);
	}
	
	private void blockWithItem(RegistryObject<? extends Block> block) {
		simpleBlockWithItem(block.get(), cubeAll(block.get()));
	}

}
