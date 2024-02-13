package net.topnotchgames.frogcraft.common.datagen;

import java.util.List;
import java.util.Set;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.topnotchgames.frogcraft.common.datagen.loot.FrogcraftBlockLootSubProvider;

public class FrogcraftLootTableProvider extends LootTableProvider {

	public FrogcraftLootTableProvider(PackOutput p_254123_) {
		super(p_254123_, Set.of(), List.of(
				new LootTableProvider.SubProviderEntry(FrogcraftBlockLootSubProvider::new, LootContextParamSets.BLOCK)
		));
	}

}
