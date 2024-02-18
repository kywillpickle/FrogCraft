package net.topnotchgames.frogcraft.world.level.storage.loot;

import java.util.function.Supplier;

import org.jetbrains.annotations.NotNull;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditions;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.NumberProvider;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class AddItemModifier extends LootModifier {

	public static final Supplier<Codec<AddItemModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder
			.create(inst -> LootModifier.codecStart(inst).and(ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(m -> m.item))
					.apply(inst, AddItemModifier::new)
	));
	private final Item item;
	private final NumberProvider numberProvider;
	
	public AddItemModifier(Item item) {
		this(new LootItemCondition[] {}, item);
	}
	
	public AddItemModifier(Item item, NumberProvider numberProvider) {
		this(new LootItemCondition[] {}, item, numberProvider);
	}
	
	public AddItemModifier(LootItemCondition[] conditionsIn, Item item) {
		this(conditionsIn, item, ConstantValue.exactly(1.0F));
	}
	
	public AddItemModifier(LootItemCondition[] conditionsIn, Item item, NumberProvider numberProvider) {
		    super(conditionsIn);
		    this.item = item;
		    this.numberProvider = numberProvider;
	}
	
	@NotNull
	@Override
	protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
		  for(LootItemCondition condition : this.conditions) {
			  if(!condition.test(context)) {
				  return generatedLoot;
			  }
		  }
		  generatedLoot.add(new ItemStack(this.item, this.numberProvider.getInt(context)));
		  
		  return generatedLoot;
	}
	
	@Override
	public Codec<? extends IGlobalLootModifier> codec() {
		  return CODEC.get();
	}
}
