package net.topnotchgames.frogcraft;

import com.mojang.logging.LogUtils;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.topnotchgames.frogcraft.sounds.SoundEvents;
import net.topnotchgames.frogcraft.world.block.Blocks;
import net.topnotchgames.frogcraft.world.entity.Entities;
import net.topnotchgames.frogcraft.world.item.Items;
import net.topnotchgames.frogcraft.world.level.storage.loot.LootModifiers;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Frogcraft.MODID)
public class Frogcraft {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "frogcraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public Frogcraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
        // Register deferred registers
        Blocks.registerBlocks(modEventBus);
        
        Items.registerItems(modEventBus);
        
        LootModifiers.registerLootModifiers(modEventBus);

        Entities.registerEntities(modEventBus);
        
        SoundEvents.registerSounds(modEventBus);

        // Register ourselves for server and other game events we are interested in
        modEventBus.addListener((EntityAttributeCreationEvent event) -> Entities.registerEntityAttributes(event));
        modEventBus.addListener((EntityRenderersEvent.RegisterLayerDefinitions event) -> Entities.registerEntityLayerDefinitions(event));
        modEventBus.addListener((EntityRenderersEvent.RegisterRenderers event) -> Entities.registerEntityRenderers(event));
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
        }
    }
}
