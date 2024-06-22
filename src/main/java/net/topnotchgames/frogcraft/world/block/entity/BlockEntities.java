package net.topnotchgames.frogcraft.world.block.entity;

import java.util.function.Supplier;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.BlockEntitySupplier;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.client.renderer.blockentity.FrogBlenderRenderer;
import net.topnotchgames.frogcraft.world.block.Blocks;

public class BlockEntities {
    /* Initialize the Deferred Block Register */
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Frogcraft.MODID);
    
    /* Initialize BlockEntities */
    public static final RegistryObject<BlockEntityType<FrogBlenderBlockEntity>> FROG_BLENDER_BLOCK_ENTITY = register("frog_blender_block_entity", FrogBlenderBlockEntity::new, Blocks.FROG_BLENDER_BLOCK);

	/* Register Helpers */
    private static <T extends BlockEntity, S extends Block & EntityBlock> RegistryObject<BlockEntityType<T>> register(String name, BlockEntitySupplier<T> blockEntity, Supplier<S> entityBlock) {
    	return BLOCK_ENTITY_TYPES.register(name, () -> BlockEntityType.Builder.of(blockEntity, entityBlock.get()).build(null));
	}
    		
    /* Deferred Register */
    public static void registerBlockEntities(IEventBus modEventBus) {
    	BLOCK_ENTITY_TYPES.register(modEventBus);
	}
    
    /* Registered Entity EventHandlers */
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FROG_BLENDER_BLOCK_ENTITY.get(), FrogBlenderRenderer::new);
	}
	
	public static void registerEntityLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
//        event.registerLayerDefinition(FrogBlenderBlockEntityRenderer.LAYER_LOCATION, FrogBlenderBlockEntityRenderer::createBodyLayer);
    }
}
