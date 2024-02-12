//package net.topnotchgames.frogcraft.init;
//
//import com.mojang.serialization.Codec;
//
//import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//import net.topnotchgames.frogcraft.Frogcraft;
//
//public class GLMInit {
//	
//	private static final DeferredRegister<GlobalLootModifierSerializer<?>> GLM = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, Frogcraft.MODID);
//    private static final RegistryObject<Codec<DungeonLootEnhancerModifier>> DUNGEON_LOOT = GLM.register("dungeon_loot", DungeonLootEnhancerModifier.CODEC);
//    private static final RegistryObject<Codec<SmeltingEnchantmentModifier>> SMELTING = GLM.register("smelting", SmeltingEnchantmentModifier.CODEC);
//    private static final RegistryObject<Codec<WheatSeedsConverterModifier>> WHEATSEEDS = GLM.register("wheat_harvest", WheatSeedsConverterModifier.CODEC);
//    private static final RegistryObject<Codec<SilkTouchTestModifier>> SILKTOUCH = GLM.register("silk_touch_bamboo", SilkTouchTestModifier.CODEC);
//    private static final RegistryObject<Enchantment> SMELT = ENCHANTS.register("smelt", () -> new SmelterEnchantment(Rarity.UNCOMMON, EnchantmentCategory.DIGGER, EquipmentSlot.MAINHAND));
//    
//	public GLMInit()
//    {
//        GLM.register(FMLJavaModLoadingContext.get().getModEventBus());
//        ENCHANTS.register(FMLJavaModLoadingContext.get().getModEventBus());
//    }
//
//}
