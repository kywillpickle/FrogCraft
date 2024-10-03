package net.topnotchgames.frogcraft.client.renderer.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

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

public class FrogBlenderRenderer implements BlockEntityRenderer<FrogBlenderBlockEntity> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(Frogcraft.MODID, "textures/entity/frog_goop.png");
	
	public FrogBlenderRenderer(BlockEntityRendererProvider.Context ctx) {
	}
	
	@Override
	public void render(FrogBlenderBlockEntity blenderEntity, float partialTick, PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, int packedOverlay) {
		VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entitySolid(TEXTURE));
		MeshDefinition mesh = new MeshDefinition();
		PartDefinition root = mesh.getRoot();
		
		float goopHeight = blenderEntity.getGoopHeight();
		if(goopHeight != 0.0F) root.addOrReplaceChild("goop", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 16.0F, 2.0F+goopHeight, 16.0F, new CubeDeformation(-1.05F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		
		LayerDefinition layerDefinition = LayerDefinition.create(mesh, 64, 32);
		
		poseStack.pushPose();
		layerDefinition.bakeRoot().render(poseStack, vertexConsumer, packedLight, packedOverlay);
		poseStack.popPose();
	}

}
