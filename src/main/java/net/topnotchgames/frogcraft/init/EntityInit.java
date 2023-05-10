package net.topnotchgames.frogcraft.init;

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
import net.topnotchgames.frogcraft.common.entity.DesertFrogEntity;
import net.topnotchgames.frogcraft.common.entity.model.DesertFrogModel;
import net.topnotchgames.frogcraft.common.entity.render.DesertFrogRenderer;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Frogcraft.MODID);
	
	//Add each entity to the DeferredRegister
	public static final RegistryObject<EntityType<DesertFrogEntity>> DESERT_FROG = ENTITIES.register("desert_frog", () ->
		EntityType.Builder.of(DesertFrogEntity::new, MobCategory.CREATURE)
			.sized(0.2F, 0.2F).clientTrackingRange(5)
			.build(new ResourceLocation(Frogcraft.MODID, "upgradable_type").toString())
	);
	
	public static void registerEntities(IEventBus modEventBus) {
		ENTITIES.register(modEventBus);
	}
	
	public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
	    event.put(DESERT_FROG.get(),
	    		Mob.createMobAttributes()
	    			.add(Attributes.MOVEMENT_SPEED, 1.0D)
	    			.add(Attributes.MAX_HEALTH, 10.0D)
	    			.add(Attributes.ATTACK_DAMAGE, 10.0D)
	            // ...
	    .build());
	}
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DESERT_FROG.get(), DesertFrogRenderer::new);
	}
	
	public static void registerEntityLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(DesertFrogModel.LAYER_LOCATION, DesertFrogModel::createBodyLayer);
    }
}
