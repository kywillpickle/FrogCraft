package net.topnotchgames.frogcraft.world.entity.model;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.topnotchgames.frogcraft.world.entity.DesertFrogEntity;
import net.topnotchgames.frogcraft.world.entity.animation.DesertFrogAnimation;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class DesertFrogModel extends HierarchicalModel<DesertFrogEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "desert_frog"), "main");
	private final ModelPart root;

	public DesertFrogModel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition base = root.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = base.addOrReplaceChild("body", CubeListBuilder.create().texOffs(5, 5).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(25, 16).addBox(-3.5F, -3.0F, -3.5F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = base.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 3.5F));

		PartDefinition skull = head.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(25, 23).addBox(-3.5F, -2.0F, -3.5F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(2, 17).addBox(-3.5F, -3.0F, -3.5F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -3.5F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition l_eye = eyes.addOrReplaceChild("l_eye", CubeListBuilder.create().texOffs(0, 0).addBox(-3.25F, -5.25F, -4.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 2.0F, -3.5F));

		PartDefinition r_eye = eyes.addOrReplaceChild("r_eye", CubeListBuilder.create().texOffs(0, 6).addBox(0.25F, -5.25F, -4.75F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 2.0F, -3.5F));

		PartDefinition tongue = base.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(17, 16).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 3.5F));

		PartDefinition throat = base.addOrReplaceChild("throat", CubeListBuilder.create().texOffs(26, 5).addBox(-3.5F, -2.0F, -1.5F, 7.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -2.0F, -2.0F));

		PartDefinition fl_leg = root.addOrReplaceChild("fl_leg", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 34).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -2.0F, -2.0F));

		PartDefinition bl_leg = root.addOrReplaceChild("bl_leg", CubeListBuilder.create().texOffs(16, 27).addBox(0.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(6, 41).addBox(0.0F, 2.0F, -2.5F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -2.0F, 2.5F));

		PartDefinition br_leg = root.addOrReplaceChild("br_leg", CubeListBuilder.create().texOffs(2, 27).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 41).addBox(-3.0F, 2.0F, -2.5F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.0F, 2.5F));

		PartDefinition fr_leg = root.addOrReplaceChild("fr_leg", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(5, 34).addBox(-2.0F, 2.0F, -3.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -2.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void setupAnim(DesertFrogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root.getAllParts().forEach(ModelPart::resetPose);
	    this.animate(entity.jumpAnimationState, DesertFrogAnimation.MODEL_JUMP, ageInTicks);
	    this.animate(entity.croakAnimationState, DesertFrogAnimation.MODEL_CROAK, ageInTicks);
	    this.animate(entity.tongueAnimationState, DesertFrogAnimation.MODEL_TONGUE, ageInTicks);
	    this.animateWalk(DesertFrogAnimation.MODEL_WALK, limbSwing, limbSwingAmount, 1.5F, 2.5F);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}
}