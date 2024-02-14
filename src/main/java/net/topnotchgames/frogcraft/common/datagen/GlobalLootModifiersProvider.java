package net.topnotchgames.frogcraft.common.datagen;

import net.minecraft.advancements.critereon.EntityFlagsPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext.EntityTarget;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.item.Items;
import net.topnotchgames.frogcraft.common.loot.AddItemModifier;

public class GlobalLootModifiersProvider extends net.minecraftforge.common.data.GlobalLootModifierProvider {

	public GlobalLootModifiersProvider(PackOutput output) {
		super(output, Frogcraft.MODID);
	}

	@Override
	protected void start() {
		add("frog_leg_from_frog", new AddItemModifier(new LootItemCondition[] {
						new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build()
				}, Items.FROG_LEG.get(), UniformGenerator.between(0, 2)));
		add("cooked_frog_leg_from_frog", new AddItemModifier(new LootItemCondition[] {
				new LootTableIdCondition.Builder(new ResourceLocation("entities/frog")).build(),
				LootItemEntityPropertyCondition.hasProperties(EntityTarget.THIS, 
						EntityPredicate.Builder.entity().flags(
								EntityFlagsPredicate.Builder.flags().setOnFire(true).build()
						).build()
				).build()
		}, Items.COOKED_FROG_LEG.get(), UniformGenerator.between(0, 2)));
	}
}
