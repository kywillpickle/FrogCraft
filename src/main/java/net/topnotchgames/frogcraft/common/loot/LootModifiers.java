package net.topnotchgames.frogcraft.common.loot;
//package net.topnotchgames.frogcraft.loot;
//
//import org.jetbrains.annotations.NotNull;
//
//import com.google.common.base.Supplier;
//import com.google.common.base.Suppliers;
//import com.mojang.serialization.Codec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//
//import it.unimi.dsi.fastutil.objects.ObjectArrayList;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.storage.loot.LootContext;
//import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
//import net.minecraftforge.common.loot.IGlobalLootModifier;
//import net.minecraftforge.common.loot.LootModifier;
//import net.topnotchgames.frogcraft.init.ItemInit;
//
//public class LootModifiers {	
//	
//	  public LootModifiers() {
//		  
//	  }
//	  
//	  private class FrogLegLootModifier extends LootModifier {
//	      public static final Supplier<Codec<FrogLegLootModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> LootModifier.codecStart(inst).apply(inst, SmeltingEnchantmentModifier::new)));
//		  
//	      private FrogLegLootModifier(LootItemCondition[] conditionsIn, String prop1, int prop2, Item prop3) {
//			    super(conditionsIn);
//			    // Store the rest of the parameters
//		  }
//
//		  @NotNull
//		  @Override
//		  protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
//			  generatedLoot.add(new ItemStack(ItemInit.FROG_LEG.get(), 1));
//			  return generatedLoot;
//		  }
//	
//		  @Override
//		  public Codec<? extends IGlobalLootModifier> codec() {
//			  return CODEC.get();
//		  }
//	  }
//}