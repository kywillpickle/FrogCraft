package net.topnotchgames.frogcraft.world.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class LiminalWall extends LiminalBlock {
	public LiminalWall(DyeColor color) {
		super(BlockBehaviour.Properties.of()
				.strength(2.0F, 6.0F)
				.requiresCorrectToolForDrops()
				.instrument(NoteBlockInstrument.BASEDRUM)
			, color);
	}
}