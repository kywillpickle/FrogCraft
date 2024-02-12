package net.topnotchgames.frogcraft.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;

public abstract class ItemInit {
	/* Initialize the Deferred Block Register */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Frogcraft.MODID);
	
    /* Initialize a new creative tab to put the blocks into */
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Frogcraft.MODID);
    public static final RegistryObject<CreativeModeTab> TAB_FROGCRAFT = CREATIVE_TABS.register("frogcraft_tab", () -> CreativeModeTab.builder().title(Component.literal("Frogcraft")).icon(() -> ItemInit.getCreativeTabIcon()).displayItems((p_270425_, p_260158_) -> applyItemDisplays(p_270425_, p_260158_)).build());
    
    /* Initialize items */
    public static final RegistryObject<Item> FROG_LEG = ITEMS.register("frog_leg", () -> new Item((new Item.Properties()).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.2F).effect(() -> (Math.random() >= 0.666 ? new MobEffectInstance(MobEffects.POISON, 200, 0) : new MobEffectInstance(MobEffects.HUNGER, 300, 1)), 0.6f).meat().build())));
	public static final RegistryObject<Item> COOKED_FROG_LEG = ITEMS.register("cooked_frog_leg", () -> new Item((new Item.Properties()).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).meat().build())));
	public static final RegistryObject<Item> MUSIC_DISC_LONE_LILYPAD = ITEMS.register("music_disc_lone_lilypad", () ->
		new RecordItem(1, SoundInit.LONE_LILYPAD_DISK, (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE), 1400));
	
	/* Initialize spawn eggs */
	public static final RegistryObject<Item> DESERT_FROG_SPAWN_EGG = ITEMS.register("desert_frog_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.DESERT_FROG, 0x7b6046, 0xa99b8f, new Item.Properties()));
	/* Initialize all of the blocks */
    public static final RegistryObject<Item> LIGHT_FIXTURE_BLOCK = ITEMS.register("light_fixture_block", () -> new BlockItem(BlockInit.LIGHT_FIXTURE_BLOCK.get(), new Item.Properties()));
    
	//Liminal Walls
    public static final RegistryObject<Item> BLACK_LIMINAL_WALL = ITEMS.register("black_liminal_wall", () -> new BlockItem(BlockInit.BLACK_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_LIMINAL_WALL = ITEMS.register("red_liminal_wall", () -> new BlockItem(BlockInit.RED_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_LIMINAL_WALL = ITEMS.register("green_liminal_wall", () -> new BlockItem(BlockInit.GREEN_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_LIMINAL_WALL = ITEMS.register("brown_liminal_wall", () -> new BlockItem(BlockInit.BROWN_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_LIMINAL_WALL = ITEMS.register("blue_liminal_wall", () -> new BlockItem(BlockInit.BLUE_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIMINAL_WALL = ITEMS.register("purple_liminal_wall", () -> new BlockItem(BlockInit.PURPLE_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_LIMINAL_WALL = ITEMS.register("cyan_liminal_wall", () -> new BlockItem(BlockInit.CYAN_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_LIMINAL_WALL = ITEMS.register("light_gray_liminal_wall", () -> new BlockItem(BlockInit.LIGHT_GRAY_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_LIMINAL_WALL = ITEMS.register("gray_liminal_wall", () -> new BlockItem(BlockInit.GRAY_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_LIMINAL_WALL = ITEMS.register("pink_liminal_wall", () -> new BlockItem(BlockInit.PINK_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_LIMINAL_WALL = ITEMS.register("lime_liminal_wall", () -> new BlockItem(BlockInit.LIME_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_LIMINAL_WALL = ITEMS.register("yellow_liminal_wall", () -> new BlockItem(BlockInit.YELLOW_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_LIMINAL_WALL = ITEMS.register("light_blue_liminal_wall", () -> new BlockItem(BlockInit.LIGHT_BLUE_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_LIMINAL_WALL = ITEMS.register("magenta_liminal_wall", () -> new BlockItem(BlockInit.MAGENTA_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_LIMINAL_WALL = ITEMS.register("orange_liminal_wall", () -> new BlockItem(BlockInit.ORANGE_LIMINAL_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_LIMINAL_WALL = ITEMS.register("white_liminal_wall", () -> new BlockItem(BlockInit.WHITE_LIMINAL_WALL.get(), new Item.Properties()));
    //Liminal Carpet
    public static final RegistryObject<Item> BLACK_LIMINAL_CARPET = ITEMS.register("black_liminal_carpet", () -> new BlockItem(BlockInit.BLACK_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_LIMINAL_CARPET = ITEMS.register("red_liminal_carpet", () -> new BlockItem(BlockInit.RED_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_LIMINAL_CARPET = ITEMS.register("green_liminal_carpet", () -> new BlockItem(BlockInit.GREEN_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_LIMINAL_CARPET = ITEMS.register("brown_liminal_carpet", () -> new BlockItem(BlockInit.BROWN_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_LIMINAL_CARPET = ITEMS.register("blue_liminal_carpet", () -> new BlockItem(BlockInit.BLUE_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIMINAL_CARPET = ITEMS.register("purple_liminal_carpet", () -> new BlockItem(BlockInit.PURPLE_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_LIMINAL_CARPET = ITEMS.register("cyan_liminal_carpet", () -> new BlockItem(BlockInit.CYAN_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_LIMINAL_CARPET = ITEMS.register("light_gray_liminal_carpet", () -> new BlockItem(BlockInit.LIGHT_GRAY_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_LIMINAL_CARPET = ITEMS.register("gray_liminal_carpet", () -> new BlockItem(BlockInit.GRAY_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_LIMINAL_CARPET = ITEMS.register("pink_liminal_carpet", () -> new BlockItem(BlockInit.PINK_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_LIMINAL_CARPET = ITEMS.register("lime_liminal_carpet", () -> new BlockItem(BlockInit.LIME_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_LIMINAL_CARPET = ITEMS.register("yellow_liminal_carpet", () -> new BlockItem(BlockInit.YELLOW_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_LIMINAL_CARPET = ITEMS.register("light_blue_liminal_carpet", () -> new BlockItem(BlockInit.LIGHT_BLUE_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_LIMINAL_CARPET = ITEMS.register("magenta_liminal_carpet", () -> new BlockItem(BlockInit.MAGENTA_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_LIMINAL_CARPET = ITEMS.register("orange_liminal_carpet", () -> new BlockItem(BlockInit.ORANGE_LIMINAL_CARPET.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_LIMINAL_CARPET = ITEMS.register("white_liminal_carpet", () -> new BlockItem(BlockInit.WHITE_LIMINAL_CARPET.get(), new Item.Properties()));
    // Liminal Tiles
    public static final RegistryObject<Item> BLACK_LIMINAL_TILES = ITEMS.register("black_liminal_tiles", () -> new BlockItem(BlockInit.BLACK_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_LIMINAL_TILES = ITEMS.register("red_liminal_tiles", () -> new BlockItem(BlockInit.RED_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_LIMINAL_TILES = ITEMS.register("green_liminal_tiles", () -> new BlockItem(BlockInit.GREEN_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BROWN_LIMINAL_TILES = ITEMS.register("brown_liminal_tiles", () -> new BlockItem(BlockInit.BROWN_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_LIMINAL_TILES = ITEMS.register("blue_liminal_tiles", () -> new BlockItem(BlockInit.BLUE_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LIMINAL_TILES = ITEMS.register("purple_liminal_tiles", () -> new BlockItem(BlockInit.PURPLE_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYAN_LIMINAL_TILES = ITEMS.register("cyan_liminal_tiles", () -> new BlockItem(BlockInit.CYAN_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_LIMINAL_TILES = ITEMS.register("light_gray_liminal_tiles", () -> new BlockItem(BlockInit.LIGHT_GRAY_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAY_LIMINAL_TILES = ITEMS.register("gray_liminal_tiles", () -> new BlockItem(BlockInit.GRAY_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINK_LIMINAL_TILES = ITEMS.register("pink_liminal_tiles", () -> new BlockItem(BlockInit.PINK_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIME_LIMINAL_TILES = ITEMS.register("lime_liminal_tiles", () -> new BlockItem(BlockInit.LIME_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_LIMINAL_TILES = ITEMS.register("yellow_liminal_tiles", () -> new BlockItem(BlockInit.YELLOW_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_LIMINAL_TILES = ITEMS.register("light_blue_liminal_tiles", () -> new BlockItem(BlockInit.LIGHT_BLUE_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_LIMINAL_TILES = ITEMS.register("magenta_liminal_tiles", () -> new BlockItem(BlockInit.MAGENTA_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_LIMINAL_TILES = ITEMS.register("orange_liminal_tiles", () -> new BlockItem(BlockInit.ORANGE_LIMINAL_TILES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_LIMINAL_TILES = ITEMS.register("white_liminal_tiles", () -> new BlockItem(BlockInit.WHITE_LIMINAL_TILES.get(), new Item.Properties()));
    
    // Specify which items go where in creative tab
    private static ItemStack getCreativeTabIcon() {
    	return new ItemStack(ItemInit.FROG_LEG.get());
    }
    private static void applyItemDisplays(ItemDisplayParameters params, Output out) {
    	ITEMS.getEntries().forEach((item) -> {
    		out.accept(item.get());
    	});
    }
    
	public static void registerItems(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
		CREATIVE_TABS.register(modEventBus);
	}

}
