package net.topnotchgames.frogcraft.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;

public abstract class ItemInit {
	/* Initialize the Deferred Block Register */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Frogcraft.MODID);
    /* Initialize a new creative tab to put the blocks into */
    public static final CreativeModeTab TAB_FROGCRAFT = new CreativeModeTab("frogcraft") {
    	public ItemStack makeIcon() {
        	return new ItemStack(YELLOW_LIMINAL_WALL.get());
        }
    	public void fillItemList(NonNullList<ItemStack> p_40778_) {
    		for(RegistryObject<Item> item : ITEMS.getEntries()) {
    			item.get().fillItemCategory(this, p_40778_);
    		}
	    }
    };
	/* Initialize all of the blocks */
    public static final RegistryObject<Item> LIGHT_FIXTURE_BLOCK = ITEMS.register("light_fixture_block", () -> new BlockItem(BlockInit.LIGHT_FIXTURE_BLOCK.get(), new Item.Properties().tab(TAB_FROGCRAFT)));

	//Liminal Walls
    public static final RegistryObject<Item> BLACK_LIMINAL_WALL = ITEMS.register("black_liminal_wall", () -> new BlockItem(BlockInit.BLACK_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> RED_LIMINAL_WALL = ITEMS.register("red_liminal_wall", () -> new BlockItem(BlockInit.RED_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> GREEN_LIMINAL_WALL = ITEMS.register("green_liminal_wall", () -> new BlockItem(BlockInit.GREEN_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> BROWN_LIMINAL_WALL = ITEMS.register("brown_liminal_wall", () -> new BlockItem(BlockInit.BROWN_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> BLUE_LIMINAL_WALL = ITEMS.register("blue_liminal_wall", () -> new BlockItem(BlockInit.BLUE_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> PURPLE_LIMINAL_WALL = ITEMS.register("purple_liminal_wall", () -> new BlockItem(BlockInit.PURPLE_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> CYAN_LIMINAL_WALL = ITEMS.register("cyan_liminal_wall", () -> new BlockItem(BlockInit.CYAN_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIGHT_GRAY_LIMINAL_WALL = ITEMS.register("light_gray_liminal_wall", () -> new BlockItem(BlockInit.LIGHT_GRAY_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> GRAY_LIMINAL_WALL = ITEMS.register("gray_liminal_wall", () -> new BlockItem(BlockInit.GRAY_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> PINK_LIMINAL_WALL = ITEMS.register("pink_liminal_wall", () -> new BlockItem(BlockInit.PINK_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIME_LIMINAL_WALL = ITEMS.register("lime_liminal_wall", () -> new BlockItem(BlockInit.LIME_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> YELLOW_LIMINAL_WALL = ITEMS.register("yellow_liminal_wall", () -> new BlockItem(BlockInit.YELLOW_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_LIMINAL_WALL = ITEMS.register("light_blue_liminal_wall", () -> new BlockItem(BlockInit.LIGHT_BLUE_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> MAGENTA_LIMINAL_WALL = ITEMS.register("magenta_liminal_wall", () -> new BlockItem(BlockInit.MAGENTA_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> ORANGE_LIMINAL_WALL = ITEMS.register("orange_liminal_wall", () -> new BlockItem(BlockInit.ORANGE_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> WHITE_LIMINAL_WALL = ITEMS.register("white_liminal_wall", () -> new BlockItem(BlockInit.WHITE_LIMINAL_WALL.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    //Liminal Carpet
    public static final RegistryObject<Item> BLACK_LIMINAL_CARPET = ITEMS.register("black_liminal_carpet", () -> new BlockItem(BlockInit.BLACK_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> RED_LIMINAL_CARPET = ITEMS.register("red_liminal_carpet", () -> new BlockItem(BlockInit.RED_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> GREEN_LIMINAL_CARPET = ITEMS.register("green_liminal_carpet", () -> new BlockItem(BlockInit.GREEN_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> BROWN_LIMINAL_CARPET = ITEMS.register("brown_liminal_carpet", () -> new BlockItem(BlockInit.BROWN_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> BLUE_LIMINAL_CARPET = ITEMS.register("blue_liminal_carpet", () -> new BlockItem(BlockInit.BLUE_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> PURPLE_LIMINAL_CARPET = ITEMS.register("purple_liminal_carpet", () -> new BlockItem(BlockInit.PURPLE_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> CYAN_LIMINAL_CARPET = ITEMS.register("cyan_liminal_carpet", () -> new BlockItem(BlockInit.CYAN_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIGHT_GRAY_LIMINAL_CARPET = ITEMS.register("light_gray_liminal_carpet", () -> new BlockItem(BlockInit.LIGHT_GRAY_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> GRAY_LIMINAL_CARPET = ITEMS.register("gray_liminal_carpet", () -> new BlockItem(BlockInit.GRAY_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> PINK_LIMINAL_CARPET = ITEMS.register("pink_liminal_carpet", () -> new BlockItem(BlockInit.PINK_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIME_LIMINAL_CARPET = ITEMS.register("lime_liminal_carpet", () -> new BlockItem(BlockInit.LIME_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> YELLOW_LIMINAL_CARPET = ITEMS.register("yellow_liminal_carpet", () -> new BlockItem(BlockInit.YELLOW_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_LIMINAL_CARPET = ITEMS.register("light_blue_liminal_carpet", () -> new BlockItem(BlockInit.LIGHT_BLUE_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> MAGENTA_LIMINAL_CARPET = ITEMS.register("magenta_liminal_carpet", () -> new BlockItem(BlockInit.MAGENTA_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> ORANGE_LIMINAL_CARPET = ITEMS.register("orange_liminal_carpet", () -> new BlockItem(BlockInit.ORANGE_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> WHITE_LIMINAL_CARPET = ITEMS.register("white_liminal_carpet", () -> new BlockItem(BlockInit.WHITE_LIMINAL_CARPET.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    // Liminal Tiles
    public static final RegistryObject<Item> BLACK_LIMINAL_TILES = ITEMS.register("black_liminal_tiles", () -> new BlockItem(BlockInit.BLACK_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> RED_LIMINAL_TILES = ITEMS.register("red_liminal_tiles", () -> new BlockItem(BlockInit.RED_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> GREEN_LIMINAL_TILES = ITEMS.register("green_liminal_tiles", () -> new BlockItem(BlockInit.GREEN_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> BROWN_LIMINAL_TILES = ITEMS.register("brown_liminal_tiles", () -> new BlockItem(BlockInit.BROWN_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> BLUE_LIMINAL_TILES = ITEMS.register("blue_liminal_tiles", () -> new BlockItem(BlockInit.BLUE_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> PURPLE_LIMINAL_TILES = ITEMS.register("purple_liminal_tiles", () -> new BlockItem(BlockInit.PURPLE_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> CYAN_LIMINAL_TILES = ITEMS.register("cyan_liminal_tiles", () -> new BlockItem(BlockInit.CYAN_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIGHT_GRAY_LIMINAL_TILES = ITEMS.register("light_gray_liminal_tiles", () -> new BlockItem(BlockInit.LIGHT_GRAY_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> GRAY_LIMINAL_TILES = ITEMS.register("gray_liminal_tiles", () -> new BlockItem(BlockInit.GRAY_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> PINK_LIMINAL_TILES = ITEMS.register("pink_liminal_tiles", () -> new BlockItem(BlockInit.PINK_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIME_LIMINAL_TILES = ITEMS.register("lime_liminal_tiles", () -> new BlockItem(BlockInit.LIME_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> YELLOW_LIMINAL_TILES = ITEMS.register("yellow_liminal_tiles", () -> new BlockItem(BlockInit.YELLOW_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> LIGHT_BLUE_LIMINAL_TILES = ITEMS.register("light_blue_liminal_tiles", () -> new BlockItem(BlockInit.LIGHT_BLUE_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> MAGENTA_LIMINAL_TILES = ITEMS.register("magenta_liminal_tiles", () -> new BlockItem(BlockInit.MAGENTA_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> ORANGE_LIMINAL_TILES = ITEMS.register("orange_liminal_tiles", () -> new BlockItem(BlockInit.ORANGE_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
    public static final RegistryObject<Item> WHITE_LIMINAL_TILES = ITEMS.register("white_liminal_tiles", () -> new BlockItem(BlockInit.WHITE_LIMINAL_TILES.get(), new Item.Properties().tab(TAB_FROGCRAFT)));
	
	public static void registerItems(IEventBus modEventBus) {
		ITEMS.register(modEventBus);
	}

}
