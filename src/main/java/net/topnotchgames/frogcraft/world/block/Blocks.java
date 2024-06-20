package net.topnotchgames.frogcraft.world.block;

import java.util.function.Supplier;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;

public class Blocks {
	/* Initialize the Deferred Block Register */
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Frogcraft.MODID);
	
	/* Initialize Blocks */
	public static final RegistryObject<FrogBlenderBlock> FROG_BLENDER_BLOCK = register("frog_blender_block", () -> new FrogBlenderBlock());
	
	public static final RegistryObject<LightFixtureBlock> LIGHT_FIXTURE_BLOCK = register("light_fixture_block", () -> new LightFixtureBlock());

    public static final RegistryObject<LiminalWallBlock> BLACK_LIMINAL_WALL      = register("black_liminal_wall",      () -> new LiminalWallBlock(DyeColor.BLACK));
    public static final RegistryObject<LiminalWallBlock> RED_LIMINAL_WALL        = register("red_liminal_wall",        () -> new LiminalWallBlock(DyeColor.RED));
    public static final RegistryObject<LiminalWallBlock> GREEN_LIMINAL_WALL      = register("green_liminal_wall",      () -> new LiminalWallBlock(DyeColor.GREEN));
    public static final RegistryObject<LiminalWallBlock> BROWN_LIMINAL_WALL      = register("brown_liminal_wall",      () -> new LiminalWallBlock(DyeColor.BROWN));
    public static final RegistryObject<LiminalWallBlock> BLUE_LIMINAL_WALL       = register("blue_liminal_wall",       () -> new LiminalWallBlock(DyeColor.BLUE));
    public static final RegistryObject<LiminalWallBlock> PURPLE_LIMINAL_WALL     = register("purple_liminal_wall",     () -> new LiminalWallBlock(DyeColor.PURPLE));
    public static final RegistryObject<LiminalWallBlock> CYAN_LIMINAL_WALL       = register("cyan_liminal_wall",       () -> new LiminalWallBlock(DyeColor.CYAN));
    public static final RegistryObject<LiminalWallBlock> LIGHT_GRAY_LIMINAL_WALL = register("light_gray_liminal_wall", () -> new LiminalWallBlock(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<LiminalWallBlock> GRAY_LIMINAL_WALL       = register("gray_liminal_wall",       () -> new LiminalWallBlock(DyeColor.GRAY));
    public static final RegistryObject<LiminalWallBlock> PINK_LIMINAL_WALL       = register("pink_liminal_wall",       () -> new LiminalWallBlock(DyeColor.PINK));
    public static final RegistryObject<LiminalWallBlock> LIME_LIMINAL_WALL       = register("lime_liminal_wall",       () -> new LiminalWallBlock(DyeColor.LIME));
    public static final RegistryObject<LiminalWallBlock> YELLOW_LIMINAL_WALL     = register("yellow_liminal_wall",     () -> new LiminalWallBlock(DyeColor.YELLOW));
    public static final RegistryObject<LiminalWallBlock> LIGHT_BLUE_LIMINAL_WALL = register("light_blue_liminal_wall", () -> new LiminalWallBlock(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<LiminalWallBlock> MAGENTA_LIMINAL_WALL    = register("magenta_liminal_wall",    () -> new LiminalWallBlock(DyeColor.MAGENTA));
    public static final RegistryObject<LiminalWallBlock> ORANGE_LIMINAL_WALL     = register("orange_liminal_wall",     () -> new LiminalWallBlock(DyeColor.ORANGE));
    public static final RegistryObject<LiminalWallBlock> WHITE_LIMINAL_WALL      = register("white_liminal_wall",      () -> new LiminalWallBlock(DyeColor.WHITE));

    public static final RegistryObject<LiminalCarpetBlock> BLACK_LIMINAL_CARPET      = register("black_liminal_carpet",      () -> new LiminalCarpetBlock(DyeColor.BLACK));
    public static final RegistryObject<LiminalCarpetBlock> RED_LIMINAL_CARPET        = register("red_liminal_carpet",        () -> new LiminalCarpetBlock(DyeColor.RED));
    public static final RegistryObject<LiminalCarpetBlock> GREEN_LIMINAL_CARPET      = register("green_liminal_carpet",      () -> new LiminalCarpetBlock(DyeColor.GREEN));
    public static final RegistryObject<LiminalCarpetBlock> BROWN_LIMINAL_CARPET      = register("brown_liminal_carpet",      () -> new LiminalCarpetBlock(DyeColor.BROWN));
    public static final RegistryObject<LiminalCarpetBlock> BLUE_LIMINAL_CARPET       = register("blue_liminal_carpet",       () -> new LiminalCarpetBlock(DyeColor.BLUE));
    public static final RegistryObject<LiminalCarpetBlock> PURPLE_LIMINAL_CARPET     = register("purple_liminal_carpet",     () -> new LiminalCarpetBlock(DyeColor.PURPLE));
    public static final RegistryObject<LiminalCarpetBlock> CYAN_LIMINAL_CARPET       = register("cyan_liminal_carpet",       () -> new LiminalCarpetBlock(DyeColor.CYAN));
    public static final RegistryObject<LiminalCarpetBlock> LIGHT_GRAY_LIMINAL_CARPET = register("light_gray_liminal_carpet", () -> new LiminalCarpetBlock(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<LiminalCarpetBlock> GRAY_LIMINAL_CARPET       = register("gray_liminal_carpet",       () -> new LiminalCarpetBlock(DyeColor.GRAY));
    public static final RegistryObject<LiminalCarpetBlock> PINK_LIMINAL_CARPET       = register("pink_liminal_carpet",       () -> new LiminalCarpetBlock(DyeColor.PINK));
    public static final RegistryObject<LiminalCarpetBlock> LIME_LIMINAL_CARPET       = register("lime_liminal_carpet",       () -> new LiminalCarpetBlock(DyeColor.LIME));
    public static final RegistryObject<LiminalCarpetBlock> YELLOW_LIMINAL_CARPET     = register("yellow_liminal_carpet",     () -> new LiminalCarpetBlock(DyeColor.YELLOW));
    public static final RegistryObject<LiminalCarpetBlock> LIGHT_BLUE_LIMINAL_CARPET = register("light_blue_liminal_carpet", () -> new LiminalCarpetBlock(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<LiminalCarpetBlock> MAGENTA_LIMINAL_CARPET    = register("magenta_liminal_carpet",    () -> new LiminalCarpetBlock(DyeColor.MAGENTA));
    public static final RegistryObject<LiminalCarpetBlock> ORANGE_LIMINAL_CARPET     = register("orange_liminal_carpet",     () -> new LiminalCarpetBlock(DyeColor.ORANGE));
    public static final RegistryObject<LiminalCarpetBlock> WHITE_LIMINAL_CARPET      = register("white_liminal_carpet",      () -> new LiminalCarpetBlock(DyeColor.WHITE));

    public static final RegistryObject<LiminalTilesBlock> BLACK_LIMINAL_TILES      = register("black_liminal_tiles",      () -> new LiminalTilesBlock(DyeColor.BLACK));
    public static final RegistryObject<LiminalTilesBlock> RED_LIMINAL_TILES        = register("red_liminal_tiles",        () -> new LiminalTilesBlock(DyeColor.RED));
    public static final RegistryObject<LiminalTilesBlock> GREEN_LIMINAL_TILES      = register("green_liminal_tiles",      () -> new LiminalTilesBlock(DyeColor.GREEN));
    public static final RegistryObject<LiminalTilesBlock> BROWN_LIMINAL_TILES      = register("brown_liminal_tiles",      () -> new LiminalTilesBlock(DyeColor.BROWN));
    public static final RegistryObject<LiminalTilesBlock> BLUE_LIMINAL_TILES       = register("blue_liminal_tiles",       () -> new LiminalTilesBlock(DyeColor.BLUE));
    public static final RegistryObject<LiminalTilesBlock> PURPLE_LIMINAL_TILES     = register("purple_liminal_tiles",     () -> new LiminalTilesBlock(DyeColor.PURPLE));
    public static final RegistryObject<LiminalTilesBlock> CYAN_LIMINAL_TILES       = register("cyan_liminal_tiles",       () -> new LiminalTilesBlock(DyeColor.CYAN));
    public static final RegistryObject<LiminalTilesBlock> LIGHT_GRAY_LIMINAL_TILES = register("light_gray_liminal_tiles", () -> new LiminalTilesBlock(DyeColor.LIGHT_GRAY));
    public static final RegistryObject<LiminalTilesBlock> GRAY_LIMINAL_TILES       = register("gray_liminal_tiles",       () -> new LiminalTilesBlock(DyeColor.GRAY));
    public static final RegistryObject<LiminalTilesBlock> PINK_LIMINAL_TILES       = register("pink_liminal_tiles",       () -> new LiminalTilesBlock(DyeColor.PINK));
    public static final RegistryObject<LiminalTilesBlock> LIME_LIMINAL_TILES       = register("lime_liminal_tiles",       () -> new LiminalTilesBlock(DyeColor.LIME));
    public static final RegistryObject<LiminalTilesBlock> YELLOW_LIMINAL_TILES     = register("yellow_liminal_tiles",     () -> new LiminalTilesBlock(DyeColor.YELLOW));
    public static final RegistryObject<LiminalTilesBlock> LIGHT_BLUE_LIMINAL_TILES = register("light_blue_liminal_tiles", () -> new LiminalTilesBlock(DyeColor.LIGHT_BLUE));
    public static final RegistryObject<LiminalTilesBlock> MAGENTA_LIMINAL_TILES    = register("magenta_liminal_tiles",    () -> new LiminalTilesBlock(DyeColor.MAGENTA));
    public static final RegistryObject<LiminalTilesBlock> ORANGE_LIMINAL_TILES     = register("orange_liminal_tiles",     () -> new LiminalTilesBlock(DyeColor.ORANGE));
    public static final RegistryObject<LiminalTilesBlock> WHITE_LIMINAL_TILES      = register("white_liminal_tiles",      () -> new LiminalTilesBlock(DyeColor.WHITE));
    
    /* Register Helpers */
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
		return BLOCKS.register(name, block);
	}
    
    /* Deferred Register */
    public static void registerBlocks(IEventBus modEventBus) {
		BLOCKS.register(modEventBus);
	}
}
