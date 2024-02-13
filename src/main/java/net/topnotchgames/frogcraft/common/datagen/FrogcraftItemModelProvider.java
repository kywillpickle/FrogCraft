package net.topnotchgames.frogcraft.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.topnotchgames.frogcraft.Frogcraft;

public class FrogcraftItemModelProvider extends ItemModelProvider {

	public FrogcraftItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, Frogcraft.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		// TODO Auto-generated method stub
	}

}
