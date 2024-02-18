package net.topnotchgames.frogcraft.world.block;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public abstract class LiminalBlock extends Block {
	private static final Map<DyeColor, MapColor> DYE_TO_MAP_COLOR = new HashMap<DyeColor, MapColor>(); static {
		DYE_TO_MAP_COLOR.put(DyeColor.BLACK, MapColor.COLOR_BLACK);
		DYE_TO_MAP_COLOR.put(DyeColor.RED, MapColor.COLOR_RED);
		DYE_TO_MAP_COLOR.put(DyeColor.GREEN, MapColor.COLOR_GREEN);
		DYE_TO_MAP_COLOR.put(DyeColor.BROWN, MapColor.COLOR_BROWN);
		DYE_TO_MAP_COLOR.put(DyeColor.BLUE, MapColor.COLOR_BLUE);
		DYE_TO_MAP_COLOR.put(DyeColor.PURPLE, MapColor.COLOR_PURPLE);
		DYE_TO_MAP_COLOR.put(DyeColor.CYAN, MapColor.COLOR_CYAN);
		DYE_TO_MAP_COLOR.put(DyeColor.LIGHT_GRAY, MapColor.COLOR_LIGHT_GRAY);
		DYE_TO_MAP_COLOR.put(DyeColor.GRAY, MapColor.COLOR_GRAY);
		DYE_TO_MAP_COLOR.put(DyeColor.PINK, MapColor.COLOR_PINK);
		DYE_TO_MAP_COLOR.put(DyeColor.LIME, MapColor.COLOR_LIGHT_GREEN);
		DYE_TO_MAP_COLOR.put(DyeColor.YELLOW, MapColor.COLOR_YELLOW);
		DYE_TO_MAP_COLOR.put(DyeColor.LIGHT_BLUE, MapColor.COLOR_LIGHT_BLUE);
		DYE_TO_MAP_COLOR.put(DyeColor.MAGENTA, MapColor.COLOR_MAGENTA);
		DYE_TO_MAP_COLOR.put(DyeColor.ORANGE, MapColor.COLOR_ORANGE);
		DYE_TO_MAP_COLOR.put(DyeColor.WHITE, MapColor.SNOW);
	}
	public final DyeColor COLOR;
	public LiminalBlock(Properties properties, DyeColor color) {
		super(properties.mapColor(DYE_TO_MAP_COLOR.get(color)));
		this.COLOR = color;
	}
}
