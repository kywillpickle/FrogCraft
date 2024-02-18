package net.topnotchgames.frogcraft.world.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.topnotchgames.frogcraft.Frogcraft;

public class BlockEntities {
    /* Initialize the Deferred Block Register */
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Frogcraft.MODID);
    
    /* Deferred Register */
    public static void registerBlockEntities(IEventBus modEventBus) {
    	BLOCK_ENTITY_TYPES.register(modEventBus);
	}
}
