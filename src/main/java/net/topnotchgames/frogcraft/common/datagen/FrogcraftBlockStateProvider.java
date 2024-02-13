package net.topnotchgames.frogcraft.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.topnotchgames.frogcraft.Frogcraft;

public class FrogcraftBlockStateProvider extends BlockStateProvider {

	public FrogcraftBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Frogcraft.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		// TODO Auto-generated method stub
	}

}
