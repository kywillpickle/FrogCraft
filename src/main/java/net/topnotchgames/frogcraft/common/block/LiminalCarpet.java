package net.topnotchgames.frogcraft.common.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;

public class LiminalCarpet extends LiminalBlock {
	public LiminalCarpet(DyeColor color) {
		super(BlockBehaviour.Properties.of().strength(0.8F)
				.instrument(NoteBlockInstrument.BASS)
				.sound(SoundType.WOOD)
				.ignitedByLava()
			, color);
	}
}
