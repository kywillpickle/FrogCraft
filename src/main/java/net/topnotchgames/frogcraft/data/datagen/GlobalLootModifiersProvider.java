package net.topnotchgames.frogcraft.data.datagen;

import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext.EntityTarget;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.item.Items;
import net.topnotchgames.frogcraft.world.level.storage.loot.AddItemModifier;

public class GlobalLootModifiersProvider extends net.minecraftforge.common.data.GlobalLootModifierProvider {

	public GlobalLootModifiersProvider(PackOutput output) {
		super(output, Frogcraft.MODID);
	}

	@Override
	protected void start() {
		add("frog_leg_from_frog", new AddItemModifier(new LootItemCondition[] {
						new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build(),
						LootItemRandomChanceCondition.randomChance(0.95F).build()
				}, Items.FROG_LEG.get(), UniformGenerator.between(0, 2)));
		add("cooked_frog_leg_from_frog", new AddItemModifier(new LootItemCondition[] {
				new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build(),
				LootItemRandomChanceCondition.randomChance(0.95F).build(),
				LootItemEntityPropertyCondition.hasProperties(EntityTarget.THIS, 
						EntityPredicate.Builder.entity().flags(
								EntityFlagsPredicate.Builder.flags().setOnFire(true).build()
						).build()
				).build()
		}, Items.COOKED_FROG_LEG.get(), UniformGenerator.between(0, 2)));
		
		add("frog_eye_from_frog", new AddItemModifier(new LootItemCondition[] {
				new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build(),
				LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.05F, 2.0F).build()
		}, Items.FROG_EYE.get(), ConstantValue.exactly(1.0F)));
	}
}
