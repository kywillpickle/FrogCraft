package net.topnotchgames.frogcraft.common.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.common.entity.CrimsonFrogEntity;
import net.topnotchgames.frogcraft.common.entity.DesertFrogEntity;
import net.topnotchgames.frogcraft.common.entity.model.CrimsonFrogModel;
import net.topnotchgames.frogcraft.common.entity.model.DesertFrogModel;

public class CrimsonFrogRenderer extends MobRenderer<CrimsonFrogEntity,CrimsonFrogModel> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Frogcraft.MODID, "textures/entity/crimson_frog.png");
	
	public CrimsonFrogRenderer(EntityRendererProvider.Context ctx) {
		super(ctx, new CrimsonFrogModel(ctx.bakeLayer(CrimsonFrogModel.LAYER_LOCATION)), 0.25F);
	}

	@Override
	public ResourceLocation getTextureLocation(CrimsonFrogEntity entity) {
		return TEXTURE;
	}

}