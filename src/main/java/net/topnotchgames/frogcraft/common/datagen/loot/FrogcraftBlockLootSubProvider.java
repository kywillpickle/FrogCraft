package net.topnotchgames.frogcraft.common.datagen.loot;

import java.util.Set;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.common.block.Blocks;

public class FrogcraftBlockLootSubProvider extends BlockLootSubProvider {

	public FrogcraftBlockLootSubProvider() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		// this.dropSelf(BlockInit.BLACK_LIMINAL_CARPET.get());
		// TODO Auto-generated method stub
	}
	
//	@Override
//	protected Iterable<Block> getKnownBlocks() {
//		return Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
//	}

}
