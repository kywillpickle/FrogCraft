package net.topnotchgames.frogcraft.data.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.item.Items;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

	public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, Frogcraft.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		simpleItem(Items.FROG_LEG);
		simpleItem(Items.COOKED_FROG_LEG);
		
		simpleItem(Items.FROG_EYE);
		
		simpleItem(Items.BUTTERFLY_NET);
		
		simpleItem(Items.MUSIC_DISC_LONE_LILYPAD);
		
		spawnEggItem(Items.DESERT_FROG_SPAWN_EGG);
		spawnEggItem(Items.CRIMSON_FROG_SPAWN_EGG);
	}
	
	private ItemModelBuilder simpleItem(RegistryObject<? extends Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Frogcraft.MODID,"item/" + item.getId().getPath()));
    }
	
	private ItemModelBuilder spawnEggItem(RegistryObject<? extends Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/template_spawn_egg"));
    }

}
