package net.topnotchgames.frogcraft;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraftforge.registries.ForgeRegistries;

import net.topnotchgames.frogcraft.init.BlockInit;
import net.topnotchgames.frogcraft.init.EntityInit;
import net.topnotchgames.frogcraft.init.ItemInit;
import net.topnotchgames.frogcraft.init.SoundInit;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Frogcraft.MODID)
public class Frogcraft
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "frogcraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    
    public Frogcraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
        // Register deferred block register
        BlockInit.registerBlocks(modEventBus);
        // Register deferred item register
        ItemInit.registerItems(modEventBus);
        // Register deferred block entity register
        EntityInit.registerEntities(modEventBus);
        // Register deferred Sound register
        SoundInit.registerSounds(modEventBus);

        // Register ourselves for server and other game events we are interested in
        modEventBus.addListener((EntityAttributeCreationEvent event) -> EntityInit.registerEntityAttributes(event));
        modEventBus.addListener((EntityRenderersEvent.RegisterLayerDefinitions event) -> EntityInit.registerEntityLayerDefinitions(event));
        modEventBus.addListener((EntityRenderersEvent.RegisterRenderers event) -> EntityInit.registerEntityRenderers(event));
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
