package net.topnotchgames.frogcraft.common.datagen.loot;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootContext.EntityTarget;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.common.entity.Entities;
import net.topnotchgames.frogcraft.common.item.Items;

public class EntityLootSubProvider extends net.minecraft.data.loot.EntityLootSubProvider {

	public EntityLootSubProvider() {
		super(FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	public void generate() {
		 buildFrogLootTable(Entities.DESERT_FROG);
		 buildFrogLootTable(Entities.CRIMSON_FROG);
	}
	
	private <T extends Frog> void buildFrogLootTable(RegistryObject<EntityType<T>> entity) {
		this.add(entity.get(), LootTable.lootTable()
				.withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
				.add(LootItem.lootTableItem(Items.FROG_LEG.get())
						.setWeight(1)
						.apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 2)))
						.apply(SmeltItemFunction.smelted()
								.when(LootItemEntityPropertyCondition.hasProperties(EntityTarget.THIS, ENTITY_ON_FIRE))
						)
				)
		));	
	}
	
	@Override
	protected java.util.stream.Stream<EntityType<?>> getKnownEntityTypes() {
		return Entities.ENTITY_TYPES.getEntries().stream().map(RegistryObject::get);
	}
}
