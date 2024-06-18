package net.topnotchgames.frogcraft.world.entity;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.entity.model.CrimsonFrogModel;
import net.topnotchgames.frogcraft.world.entity.model.DesertFrogModel;
import net.topnotchgames.frogcraft.world.entity.render.CrimsonFrogRenderer;
import net.topnotchgames.frogcraft.world.entity.render.DesertFrogRenderer;
import net.topnotchgames.frogcraft.world.entity.render.FrogBlenderBlockEntityRenderer;

public class Entities {
	
	/* Initialize the Deferred EntityType Register */
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Frogcraft.MODID);
	
	/* Initialize EntityTypes */
	public static final RegistryObject<EntityType<DesertFrogEntity>> DESERT_FROG = ENTITY_TYPES.register("desert_frog", () ->
		EntityType.Builder.of(DesertFrogEntity::new, MobCategory.CREATURE)
			.sized(0.5F, 0.5F).clientTrackingRange(5)
			.build(new ResourceLocation(Frogcraft.MODID, "upgradable_type").toString())
	);
	public static final RegistryObject<EntityType<CrimsonFrogEntity>> CRIMSON_FROG = ENTITY_TYPES.register("crimson_frog", () ->
	EntityType.Builder.of(CrimsonFrogEntity::new, MobCategory.CREATURE)
		.sized(0.6F, 0.6F).clientTrackingRange(5)
		.build(new ResourceLocation(Frogcraft.MODID, "upgradable_type").toString())
);
	
	/* Deferred Register */
	public static void registerEntities(IEventBus modEventBus) {
		ENTITY_TYPES.register(modEventBus);
	}
	
	/* Registered Entity EventHandlers */
	public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
	    event.put(DESERT_FROG.get(), DesertFrogEntity.createAttributes().build());
	    event.put(CRIMSON_FROG.get(), CrimsonFrogEntity.createAttributes().build());
	}
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DESERT_FROG.get(), DesertFrogRenderer::new);
		event.registerEntityRenderer(CRIMSON_FROG.get(), CrimsonFrogRenderer::new);
	}
	
	public static void registerEntityLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DesertFrogModel.LAYER_LOCATION, DesertFrogModel::createBodyLayer);
        event.registerLayerDefinition(CrimsonFrogModel.LAYER_LOCATION, CrimsonFrogModel::createBodyLayer);
    }
}
