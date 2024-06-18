package net.topnotchgames.frogcraft.world.entity.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.block.entity.FrogBlenderBlockEntity;

public class FrogBlenderBlockEntityRenderer implements BlockEntityRenderer<FrogBlenderBlockEntity> {
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(Frogcraft.MODID, "textures/entity/frog_blender.png");
	
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Frogcraft.MODID, "frog_blender"), "main");

	private final ModelPart casing;
	private final ModelPart blades;
	private final ModelPart goop;
	
	public FrogBlenderBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
		ModelPart root = createBodyLayer().bakeRoot();
		this.casing = root.getChild("casing");
		this.blades = root.getChild("blades");
		this.goop = root.getChild("goop");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition casing = partdefinition.addOrReplaceChild("casing", CubeListBuilder.create().texOffs(-16, 0).addBox(0.0F, 0.0F, 0.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(-16, 0).addBox(0.0F, 16.0F, 0.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(0.0F, 0.0F, 16.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(16.0F, 0.0F, 0.0F, 0.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition blades = partdefinition.addOrReplaceChild("blades", CubeListBuilder.create().texOffs(32, 0).addBox(2.0F, 2.0F, 8.0F, 12.0F, 14.0F, 0.0F, new CubeDeformation(-0.05F))
		.texOffs(32, 2).addBox(8.0F, 2.0F, 2.0F, 0.0F, 14.0F, 12.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition goop = partdefinition.addOrReplaceChild("goop", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.0F, 0.0F, 16.0F, 8.0F, 16.0F, new CubeDeformation(-0.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
	
	@Override
	public void render(FrogBlenderBlockEntity p_112307_, float p_112308_, PoseStack p_112309_,
			MultiBufferSource p_112310_, int p_112311_, int p_112312_) {
		VertexConsumer vertexConsumer = p_112310_.getBuffer(RenderType.entityTranslucent(TEXTURE));
		p_112309_.pushPose();
		this.casing.render(p_112309_, vertexConsumer, p_112311_, p_112312_);
		this.blades.render(p_112309_, vertexConsumer, p_112311_, p_112312_);
		this.goop.render(p_112309_, vertexConsumer, p_112311_, p_112312_);
		p_112309_.popPose();
	}

}
