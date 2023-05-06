package net.topnotchgames.frogcraft.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.blocks.entity.block.LightFixtureBlockEntity;

public class BlockEntityInit {
    /* Initialize the Deferred Block Register */
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Frogcraft.MODID);
    
    public static final RegistryObject<BlockEntityType<LightFixtureBlockEntity>> LIGHT_FIXTURE_BLOCK_ENTITY = BlockEntityInit.BLOCK_ENTITIES.register("light_fixture_block_entity", () -> BlockEntityType.Builder.of(LightFixtureBlockEntity::new).build(null));

    public static void registerBlockEntities(IEventBus modEventBus) {
		BLOCK_ENTITIES.register(modEventBus);
	}
}
