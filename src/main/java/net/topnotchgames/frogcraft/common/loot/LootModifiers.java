package net.topnotchgames.frogcraft.common.loot;

import com.mojang.serialization.Codec;

import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;

public abstract class LootModifiers {
	/* Initialize the Deferred Loot Modifier Serializers Register */
	public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
			DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Frogcraft.MODID);
	
	/* Initialize Item Modifier Classes */
	public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM =
			LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);
	
	/* Deferred Register */
	public static void registerLootModifiers(IEventBus eventBus) {
		LOOT_MODIFIER_SERIALIZERS.register(eventBus);
	}
}