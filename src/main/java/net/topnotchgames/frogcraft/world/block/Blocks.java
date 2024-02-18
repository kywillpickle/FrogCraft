package net.topnotchgames.frogcraft.world.block;

import java.util.function.Supplier;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;

public abstract class Blocks {
	/* Initialize the Deferred Block Register */
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Frogcraft.MODID);
	
	/* Initialize Blocks */
	public static final RegistryObject<LightFixtureBlock> LIGHT_FIXTURE_BLOCK = register("light_fixture_block", () -> new LightFixtureBlock());

    public static final RegistryObject<LiminalWall> BLACK_LIMINAL_WALL      = register("black_liminal_wall",      () -> new LiminalWall(DyeColor.BLACK));
    public static final RegistryObject<LiminalWall> RED_LIMINAL_WALL        = register("red_liminal_wall",        () -> new LiminalWall(DyeColor.RED));
    public static final RegistryObject<LiminalWall> GREEN_LIMINAL_WALL      = register("green_liminal_wall",      () -> new LiminalWall(DyeColor.GREEN));
    public static final RegistryObject<LiminalWall> BROWN_LIMINAL_WALL      = register("brown_liminal_wall",      () -> new LiminalWall(DyeColor.BROWN));
    public static final RegistryObject<LiminalWall> BLUE_LIMINAL_WALL       = register("blue_liminal_wall",       () -> new LiminalWall(DyeColor.BLUE));
    public static final RegistryObject<LiminalWall> PURPLE_LIMINAL_WALL     = register("purple_liminal_wall",     () -> new LiminalWall(DyeColor.PURPLE));
    public static final RegistryObject<LiminalWall> CYAN_LIMINAL_WALL       = register("cyan_liminal_wall",       () -> new LiminalWall(DyeColor.CYAN));
    public static final RegistryObject<LiminalWall> LIGHT_GRAY_LIMINAL_WALL = register("light_gray_liminal_wall", () -> new LiminalWall(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<LiminalWall> GRAY_LIMINAL_WALL       = register("gray_liminal_wall",       () -> new LiminalWall(DyeColor.GRAY));
    public static final RegistryObject<LiminalWall> PINK_LIMINAL_WALL       = register("pink_liminal_wall",       () -> new LiminalWall(DyeColor.PINK));
    public static final RegistryObject<LiminalWall> LIME_LIMINAL_WALL       = register("lime_liminal_wall",       () -> new LiminalWall(DyeColor.LIME));
    public static final RegistryObject<LiminalWall> YELLOW_LIMINAL_WALL     = register("yellow_liminal_wall",     () -> new LiminalWall(DyeColor.YELLOW));
    public static final RegistryObject<LiminalWall> LIGHT_BLUE_LIMINAL_WALL = register("light_blue_liminal_wall", () -> new LiminalWall(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<LiminalWall> MAGENTA_LIMINAL_WALL    = register("magenta_liminal_wall",    () -> new LiminalWall(DyeColor.MAGENTA));
    public static final RegistryObject<LiminalWall> ORANGE_LIMINAL_WALL     = register("orange_liminal_wall",     () -> new LiminalWall(DyeColor.ORANGE));
    public static final RegistryObject<LiminalWall> WHITE_LIMINAL_WALL      = register("white_liminal_wall",      () -> new LiminalWall(DyeColor.WHITE));

    public static final RegistryObject<LiminalCarpet> BLACK_LIMINAL_CARPET      = register("black_liminal_carpet",      () -> new LiminalCarpet(DyeColor.BLACK));
    public static final RegistryObject<LiminalCarpet> RED_LIMINAL_CARPET        = register("red_liminal_carpet",        () -> new LiminalCarpet(DyeColor.RED));
    public static final RegistryObject<LiminalCarpet> GREEN_LIMINAL_CARPET      = register("green_liminal_carpet",      () -> new LiminalCarpet(DyeColor.GREEN));
    public static final RegistryObject<LiminalCarpet> BROWN_LIMINAL_CARPET      = register("brown_liminal_carpet",      () -> new LiminalCarpet(DyeColor.BROWN));
    public static final RegistryObject<LiminalCarpet> BLUE_LIMINAL_CARPET       = register("blue_liminal_carpet",       () -> new LiminalCarpet(DyeColor.BLUE));
    public static final RegistryObject<LiminalCarpet> PURPLE_LIMINAL_CARPET     = register("purple_liminal_carpet",     () -> new LiminalCarpet(DyeColor.PURPLE));
    public static final RegistryObject<LiminalCarpet> CYAN_LIMINAL_CARPET       = register("cyan_liminal_carpet",       () -> new LiminalCarpet(DyeColor.CYAN));
    public static final RegistryObject<LiminalCarpet> LIGHT_GRAY_LIMINAL_CARPET = register("light_gray_liminal_carpet", () -> new LiminalCarpet(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<LiminalCarpet> GRAY_LIMINAL_CARPET       = register("gray_liminal_carpet",       () -> new LiminalCarpet(DyeColor.GRAY));
    public static final RegistryObject<LiminalCarpet> PINK_LIMINAL_CARPET       = register("pink_liminal_carpet",       () -> new LiminalCarpet(DyeColor.PINK));
    public static final RegistryObject<LiminalCarpet> LIME_LIMINAL_CARPET       = register("lime_liminal_carpet",       () -> new LiminalCarpet(DyeColor.LIME));
    public static final RegistryObject<LiminalCarpet> YELLOW_LIMINAL_CARPET     = register("yellow_liminal_carpet",     () -> new LiminalCarpet(DyeColor.YELLOW));
    public static final RegistryObject<LiminalCarpet> LIGHT_BLUE_LIMINAL_CARPET = register("light_blue_liminal_carpet", () -> new LiminalCarpet(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<LiminalCarpet> MAGENTA_LIMINAL_CARPET    = register("magenta_liminal_carpet",    () -> new LiminalCarpet(DyeColor.MAGENTA));
    public static final RegistryObject<LiminalCarpet> ORANGE_LIMINAL_CARPET     = register("orange_liminal_carpet",     () -> new LiminalCarpet(DyeColor.ORANGE));
    public static final RegistryObject<LiminalCarpet> WHITE_LIMINAL_CARPET      = register("white_liminal_carpet",      () -> new LiminalCarpet(DyeColor.WHITE));

    public static final RegistryObject<LiminalTiles> BLACK_LIMINAL_TILES      = register("black_liminal_tiles",      () -> new LiminalTiles(DyeColor.BLACK));
    public static final RegistryObject<LiminalTiles> RED_LIMINAL_TILES        = register("red_liminal_tiles",        () -> new LiminalTiles(DyeColor.RED));
    public static final RegistryObject<LiminalTiles> GREEN_LIMINAL_TILES      = register("green_liminal_tiles",      () -> new LiminalTiles(DyeColor.GREEN));
    public static final RegistryObject<LiminalTiles> BROWN_LIMINAL_TILES      = register("brown_liminal_tiles",      () -> new LiminalTiles(DyeColor.BROWN));
    public static final RegistryObject<LiminalTiles> BLUE_LIMINAL_TILES       = register("blue_liminal_tiles",       () -> new LiminalTiles(DyeColor.BLUE));
    public static final RegistryObject<LiminalTiles> PURPLE_LIMINAL_TILES     = register("purple_liminal_tiles",     () -> new LiminalTiles(DyeColor.PURPLE));
    public static final RegistryObject<LiminalTiles> CYAN_LIMINAL_TILES       = register("cyan_liminal_tiles",       () -> new LiminalTiles(DyeColor.CYAN));
    public static final RegistryObject<LiminalTiles> LIGHT_GRAY_LIMINAL_TILES = register("light_gray_liminal_tiles", () -> new LiminalTiles(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<LiminalTiles> GRAY_LIMINAL_TILES       = register("gray_liminal_tiles",       () -> new LiminalTiles(DyeColor.GRAY));
    public static final RegistryObject<LiminalTiles> PINK_LIMINAL_TILES       = register("pink_liminal_tiles",       () -> new LiminalTiles(DyeColor.PINK));
    public static final RegistryObject<LiminalTiles> LIME_LIMINAL_TILES       = register("lime_liminal_tiles",       () -> new LiminalTiles(DyeColor.LIME));
    public static final RegistryObject<LiminalTiles> YELLOW_LIMINAL_TILES     = register("yellow_liminal_tiles",     () -> new LiminalTiles(DyeColor.YELLOW));
    public static final RegistryObject<LiminalTiles> LIGHT_BLUE_LIMINAL_TILES = register("light_blue_liminal_tiles", () -> new LiminalTiles(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<LiminalTiles> MAGENTA_LIMINAL_TILES    = register("magenta_liminal_tiles",    () -> new LiminalTiles(DyeColor.MAGENTA));
    public static final RegistryObject<LiminalTiles> ORANGE_LIMINAL_TILES     = register("orange_liminal_tiles",     () -> new LiminalTiles(DyeColor.ORANGE));
    public static final RegistryObject<LiminalTiles> WHITE_LIMINAL_TILES      = register("white_liminal_tiles",      () -> new LiminalTiles(DyeColor.WHITE));
    
    /* Register Helpers */
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		return BLOCKS.register(name, block);
	}
    
    /* Deferred Register */
    public static void registerBlocks(IEventBus modEventBus) {
		BLOCKS.register(modEventBus);
	}
}
