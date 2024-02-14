package net.topnotchgames.frogcraft.common.datagen;

import java.util.List;
import java.util.Set;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.topnotchgames.frogcraft.common.datagen.loot.BlockLootSubProvider;
import net.topnotchgames.frogcraft.common.datagen.loot.EntityLootSubProvider;

public class LootTableProvider extends net.minecraft.data.loot.LootTableProvider {

	public LootTableProvider(PackOutput p_254123_) {
		super(p_254123_, Set.of(), List.of(
				new LootTableProvider.SubProviderEntry(BlockLootSubProvider::new, LootContextParamSets.BLOCK),
				new LootTableProvider.SubProviderEntry(EntityLootSubProvider::new, LootContextParamSets.ENTITY)
		));
	}

}
