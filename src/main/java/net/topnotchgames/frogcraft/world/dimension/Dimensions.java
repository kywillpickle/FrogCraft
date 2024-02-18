package net.topnotchgames.frogcraft.world.dimension;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.DimensionType;
import net.topnotchgames.frogcraft.Frogcraft;

public abstract class Dimensions {
	public static final ResourceKey<DimensionType> THE_IN_BETWEEN = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(Frogcraft.MODID, "the_in_between"));
	public static final ResourceLocation THE_IN_BETWEEN_EFFECTS = new ResourceLocation(Frogcraft.MODID, "the_in_between");
}
