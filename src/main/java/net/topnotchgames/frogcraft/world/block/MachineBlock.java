package net.topnotchgames.frogcraft.world.block;

import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public abstract class MachineBlock extends BaseEntityBlock {

	public MachineBlock(Properties properties) {
		super(BlockBehaviour.Properties.of()
				.ignitedByLava()
				.instrument(NoteBlockInstrument.IRON_XYLOPHONE)
				.mapColor(MapColor.METAL)
				.sound(SoundType.METAL)
				.strength(5.0F, 1200.0F)
			);
	}
}
