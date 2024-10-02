package net.topnotchgames.frogcraft.world.fluid;

import java.util.function.Consumer;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;

public class GoopFluidType extends FluidType {
	
	private final ResourceLocation stillTexture;
	private final ResourceLocation flowingTexture;

	public GoopFluidType(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final Properties properties) {
		super(properties);
		this.stillTexture = stillTexture;
		this.flowingTexture = flowingTexture;
	}

	public ResourceLocation getStillTexture() {
		return stillTexture;
	}

	public ResourceLocation getFlowingTexture() {
		return flowingTexture;
	}
    
    @Override
	public void initializeClient(final Consumer<IClientFluidTypeExtensions> consumer) {
		consumer.accept(new IClientFluidTypeExtensions() {
			@Override
			public ResourceLocation getStillTexture() {
				return stillTexture;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return flowingTexture;
			}
		});
	}
}
