package net.topnotchgames.frogcraft.common.item;

import java.util.function.Supplier;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.SoundEvents.SoundEvents;
import net.topnotchgames.frogcraft.common.block.Blocks;
import net.topnotchgames.frogcraft.common.entity.Entities;

public abstract class Items {
	
	/* Initialize the Deferred Items Register */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Frogcraft.MODID);
	
    /* Initialize a new CreativeModeTab to put the Blocks into */
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Frogcraft.MODID);
    public static final RegistryObject<CreativeModeTab> TAB_FROGCRAFT = CREATIVE_TABS.register("frogcraft_tab", () -> CreativeModeTab.builder().title(Component.literal("Frogcraft")).icon(() -> Items.getCreativeTabIcon()).displayItems((p_270425_, p_260158_) -> applyItemDisplays(p_270425_, p_260158_)).build());
    
    /* Initialize Items */
    public static final RegistryObject<Item> FROG_LEG        = register("frog_leg", () -> new Item((new Item.Properties()).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(() -> (Math.random() >= 0.666 ? new MobEffectInstance(MobEffects.POISON, 200, 0) : new MobEffectInstance(MobEffects.HUNGER, 300, 1)), 0.6f).meat().build())));
	public static final RegistryObject<Item> COOKED_FROG_LEG = register("cooked_frog_leg", () -> new Item((new Item.Properties()).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).meat().build())));
	
	public static final RegistryObject<RecordItem> MUSIC_DISC_LONE_LILYPAD = registerRecordItem("music_disc_lone_lilypad", SoundEvents.LONE_LILYPAD_DISK, 1400);
	
	/* Initialize SpawnEggItems */
	public static final RegistryObject<ForgeSpawnEggItem> DESERT_FROG_SPAWN_EGG = registerSpawnEggItem(Entities.DESERT_FROG, 0x7b6046, 0xa99b8f);
	
	/* Initialize BlockItems */
    public static final RegistryObject<BlockItem> LIGHT_FIXTURE_BLOCK = registerBlockItem(Blocks.LIGHT_FIXTURE_BLOCK);
    
    public static final RegistryObject<BlockItem> BLACK_LIMINAL_WALL      = registerBlockItem(Blocks.BLACK_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> RED_LIMINAL_WALL        = registerBlockItem(Blocks.RED_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> GREEN_LIMINAL_WALL      = registerBlockItem(Blocks.GREEN_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> BROWN_LIMINAL_WALL      = registerBlockItem(Blocks.BROWN_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> BLUE_LIMINAL_WALL       = registerBlockItem(Blocks.BLUE_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> PURPLE_LIMINAL_WALL     = registerBlockItem(Blocks.PURPLE_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> CYAN_LIMINAL_WALL       = registerBlockItem(Blocks.CYAN_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> LIGHT_GRAY_LIMINAL_WALL = registerBlockItem(Blocks.LIGHT_GRAY_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> GRAY_LIMINAL_WALL       = registerBlockItem(Blocks.GRAY_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> PINK_LIMINAL_WALL       = registerBlockItem(Blocks.PINK_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> LIME_LIMINAL_WALL       = registerBlockItem(Blocks.LIME_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> YELLOW_LIMINAL_WALL     = registerBlockItem(Blocks.YELLOW_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> LIGHT_BLUE_LIMINAL_WALL = registerBlockItem(Blocks.LIGHT_BLUE_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> MAGENTA_LIMINAL_WALL    = registerBlockItem(Blocks.MAGENTA_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> ORANGE_LIMINAL_WALL     = registerBlockItem(Blocks.ORANGE_LIMINAL_WALL);
    public static final RegistryObject<BlockItem> WHITE_LIMINAL_WALL      = registerBlockItem(Blocks.WHITE_LIMINAL_WALL);

    public static final RegistryObject<BlockItem> BLACK_LIMINAL_CARPET      = registerBlockItem(Blocks.BLACK_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> RED_LIMINAL_CARPET        = registerBlockItem(Blocks.RED_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> GREEN_LIMINAL_CARPET      = registerBlockItem(Blocks.GREEN_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> BROWN_LIMINAL_CARPET      = registerBlockItem(Blocks.BROWN_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> BLUE_LIMINAL_CARPET       = registerBlockItem(Blocks.BLUE_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> PURPLE_LIMINAL_CARPET     = registerBlockItem(Blocks.PURPLE_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> CYAN_LIMINAL_CARPET       = registerBlockItem(Blocks.CYAN_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> LIGHT_GRAY_LIMINAL_CARPET = registerBlockItem(Blocks.LIGHT_GRAY_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> GRAY_LIMINAL_CARPET       = registerBlockItem(Blocks.GRAY_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> PINK_LIMINAL_CARPET       = registerBlockItem(Blocks.PINK_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> LIME_LIMINAL_CARPET       = registerBlockItem(Blocks.LIME_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> YELLOW_LIMINAL_CARPET     = registerBlockItem(Blocks.YELLOW_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> LIGHT_BLUE_LIMINAL_CARPET = registerBlockItem(Blocks.LIGHT_BLUE_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> MAGENTA_LIMINAL_CARPET    = registerBlockItem(Blocks.MAGENTA_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> ORANGE_LIMINAL_CARPET     = registerBlockItem(Blocks.ORANGE_LIMINAL_CARPET);
    public static final RegistryObject<BlockItem> WHITE_LIMINAL_CARPET      = registerBlockItem(Blocks.WHITE_LIMINAL_CARPET);

    public static final RegistryObject<BlockItem> BLACK_LIMINAL_TILES      = registerBlockItem(Blocks.BLACK_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> RED_LIMINAL_TILES        = registerBlockItem(Blocks.RED_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> GREEN_LIMINAL_TILES      = registerBlockItem(Blocks.GREEN_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> BROWN_LIMINAL_TILES      = registerBlockItem(Blocks.BROWN_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> BLUE_LIMINAL_TILES       = registerBlockItem(Blocks.BLUE_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> PURPLE_LIMINAL_TILES     = registerBlockItem(Blocks.PURPLE_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> CYAN_LIMINAL_TILES       = registerBlockItem(Blocks.CYAN_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> LIGHT_GRAY_LIMINAL_TILES = registerBlockItem(Blocks.LIGHT_GRAY_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> GRAY_LIMINAL_TILES       = registerBlockItem(Blocks.GRAY_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> PINK_LIMINAL_TILES       = registerBlockItem(Blocks.PINK_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> LIME_LIMINAL_TILES       = registerBlockItem(Blocks.LIME_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> YELLOW_LIMINAL_TILES     = registerBlockItem(Blocks.YELLOW_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> LIGHT_BLUE_LIMINAL_TILES = registerBlockItem(Blocks.LIGHT_BLUE_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> MAGENTA_LIMINAL_TILES    = registerBlockItem(Blocks.MAGENTA_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> ORANGE_LIMINAL_TILES     = registerBlockItem(Blocks.ORANGE_LIMINAL_TILES);
    public static final RegistryObject<BlockItem> WHITE_LIMINAL_TILES      = registerBlockItem(Blocks.WHITE_LIMINAL_TILES);
    
    /* Specify which items go where in creative tab */
    private static ItemStack getCreativeTabIcon() {
    	return new ItemStack(Items.FROG_LEG.get());
    }
    private static void applyItemDisplays(ItemDisplayParameters params, Output out) {
    	ITEMS.getEntries().forEach((item) -> {
    		out.accept(item.get());
    	});
    }
    
    /* Register Helpers */
    private static RegistryObject<Item> register(String name, Supplier<Item> item) {
		return ITEMS.register(name, item);
	}
    
    private static RegistryObject<BlockItem> registerBlockItem(RegistryObject<? extends Block> block) {
		return ITEMS.register(block.getKey().location().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
    
    private static RegistryObject<RecordItem> registerRecordItem(String name, Supplier<SoundEvent> sound, int lengthInTicks) {
		return ITEMS.register(name, () -> new RecordItem(1, sound, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), lengthInTicks));
	}
    
    private static RegistryObject<ForgeSpawnEggItem> registerSpawnEggItem(RegistryObject<? extends EntityType<? extends Mob>> desertFrog, int color1, int color2) {
		return ITEMS.register(desertFrog.getKey().location().getPath()+"_spawn_egg", () -> new ForgeSpawnEggItem(desertFrog, color1, color2, new Item.Properties()));
	}
    
    /* Deferred Register */
	public static void registerItems(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
		CREATIVE_TABS.register(modEventBus);
	}

}
