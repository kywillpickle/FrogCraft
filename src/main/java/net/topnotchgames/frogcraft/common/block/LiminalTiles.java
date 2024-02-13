package net.topnotchgames.frogcraft.common.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class LiminalTiles extends LiminalBlock {
	public LiminalTiles(DyeColor color) {
		super(BlockBehaviour.Properties.of()
				.strength(2.0F, 3.0F)
				.instrument(NoteBlockInstrument.GUITAR)
				.sound(SoundType.WOOL)
				.ignitedByLava()
			, color);
	}
}
