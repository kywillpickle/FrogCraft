package net.topnotchgames.frogcraft.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.blocks.LightFixtureBlock;
import net.topnotchgames.frogcraft.common.blocks.LiminalBlock;

public abstract class BlockInit {
	/* Initialize the Deferred Block Register */
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Frogcraft.MODID);
	/* Initialize all of the blocks */
	public static final RegistryObject<Block> LIGHT_FIXTURE_BLOCK = BLOCKS.register("light_fixture_block", () -> new LightFixtureBlock(BlockBehaviour.Properties.of(Material.GLASS).lightLevel(LightFixtureBlock.litBlockEmission()).randomTicks()));
	//Liminal Walls
    public static final RegistryObject<Block> BLACK_LIMINAL_WALL = BLOCKS.register("black_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> RED_LIMINAL_WALL = BLOCKS.register("red_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> GREEN_LIMINAL_WALL = BLOCKS.register("green_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> BROWN_LIMINAL_WALL = BLOCKS.register("brown_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> BLUE_LIMINAL_WALL = BLOCKS.register("blue_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> PURPLE_LIMINAL_WALL = BLOCKS.register("purple_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> CYAN_LIMINAL_WALL = BLOCKS.register("cyan_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> LIGHT_GRAY_LIMINAL_WALL = BLOCKS.register("light_gray_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> GRAY_LIMINAL_WALL = BLOCKS.register("gray_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> PINK_LIMINAL_WALL = BLOCKS.register("pink_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> LIME_LIMINAL_WALL = BLOCKS.register("lime_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> YELLOW_LIMINAL_WALL = BLOCKS.register("yellow_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> LIGHT_BLUE_LIMINAL_WALL = BLOCKS.register("light_blue_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> MAGENTA_LIMINAL_WALL = BLOCKS.register("magenta_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> ORANGE_LIMINAL_WALL = BLOCKS.register("orange_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    public static final RegistryObject<Block> WHITE_LIMINAL_WALL = BLOCKS.register("white_liminal_wall", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOD)));
    //Liminal Carpet
    public static final RegistryObject<Block> BLACK_LIMINAL_CARPET = BLOCKS.register("black_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> RED_LIMINAL_CARPET = BLOCKS.register("red_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> GREEN_LIMINAL_CARPET = BLOCKS.register("green_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> BROWN_LIMINAL_CARPET = BLOCKS.register("brown_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> BLUE_LIMINAL_CARPET = BLOCKS.register("blue_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> PURPLE_LIMINAL_CARPET = BLOCKS.register("purple_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> CYAN_LIMINAL_CARPET = BLOCKS.register("cyan_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_LIMINAL_CARPET = BLOCKS.register("light_gray_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> GRAY_LIMINAL_CARPET = BLOCKS.register("gray_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> PINK_LIMINAL_CARPET = BLOCKS.register("pink_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> LIME_LIMINAL_CARPET = BLOCKS.register("lime_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> YELLOW_LIMINAL_CARPET = BLOCKS.register("yellow_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_LIMINAL_CARPET = BLOCKS.register("light_blue_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> MAGENTA_LIMINAL_CARPET = BLOCKS.register("magenta_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> ORANGE_LIMINAL_CARPET = BLOCKS.register("orange_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    public static final RegistryObject<Block> WHITE_LIMINAL_CARPET = BLOCKS.register("white_liminal_carpet", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.WOOL)));
    // Liminal Tiles
    public static final RegistryObject<Block> BLACK_LIMINAL_TILES = BLOCKS.register("black_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> RED_LIMINAL_TILES = BLOCKS.register("red_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> GREEN_LIMINAL_TILES = BLOCKS.register("green_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> BROWN_LIMINAL_TILES = BLOCKS.register("brown_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> BLUE_LIMINAL_TILES = BLOCKS.register("blue_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> PURPLE_LIMINAL_TILES = BLOCKS.register("purple_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> CYAN_LIMINAL_TILES = BLOCKS.register("cyan_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_LIMINAL_TILES = BLOCKS.register("light_gray_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> GRAY_LIMINAL_TILES = BLOCKS.register("gray_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> PINK_LIMINAL_TILES = BLOCKS.register("pink_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> LIME_LIMINAL_TILES = BLOCKS.register("lime_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> YELLOW_LIMINAL_TILES = BLOCKS.register("yellow_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_LIMINAL_TILES = BLOCKS.register("light_blue_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> MAGENTA_LIMINAL_TILES = BLOCKS.register("magenta_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> ORANGE_LIMINAL_TILES = BLOCKS.register("orange_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> WHITE_LIMINAL_TILES = BLOCKS.register("white_liminal_tiles", () -> new LiminalBlock(BlockBehaviour.Properties.of(Material.STONE)));
	
	public static void registerBlocks(IEventBus modEventBus) {
		BLOCKS.register(modEventBus);
	}

}
