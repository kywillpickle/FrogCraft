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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.topnotchgames.frogcraft.Frogcraft;
import net.topnotchgames.frogcraft.world.entity.CrimsonFrogEntity;
import net.topnotchgames.frogcraft.world.entity.animation.CrimsonFrogAnimation;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

@OnlyIn(Dist.CLIENT)
public class CrimsonFrogModel extends HierarchicalModel<CrimsonFrogEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Frogcraft.MODID, "crimson_frog"), "main");
	private final ModelPart root;

	public CrimsonFrogModel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition base = root.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = base.addOrReplaceChild("body", CubeListBuilder.create().texOffs(5, 1).addBox(-4.5F, -5.0F, -3.5F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(32, 10).addBox(-4.5F, -4.0F, -3.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = base.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 5.5F));

		PartDefinition skull = head.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(32, 19).addBox(-4.5F, -3.0F, -3.5F, 9.0F, 0.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(5, 15).addBox(-4.5F, -4.0F, -3.5F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -5.5F));

		PartDefinition spikes = skull.addOrReplaceChild("spikes", CubeListBuilder.create().texOffs(0, 20).addBox(-0.5F, -0.75F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 12).addBox(0.0F, -1.25F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(6, 21).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 2.0F));

		PartDefinition flora = skull.addOrReplaceChild("flora", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 2.0F));

		PartDefinition mushroom1 = flora.addOrReplaceChild("mushroom1", CubeListBuilder.create(), PartPose.offset(-2.2929F, 0.0F, 1.0F));

		PartDefinition side2_r1 = mushroom1.addOrReplaceChild("side2_r1", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -2.75F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));

		PartDefinition side1_r1 = mushroom1.addOrReplaceChild("side1_r1", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -2.75F, -1.5F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition mushroom2 = flora.addOrReplaceChild("mushroom2", CubeListBuilder.create(), PartPose.offset(2.75F, 0.0F, -0.75F));

		PartDefinition side2_r2 = mushroom2.addOrReplaceChild("side2_r2", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.25F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition side1_r2 = mushroom2.addOrReplaceChild("side1_r2", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition l_eye = eyes.addOrReplaceChild("l_eye", CubeListBuilder.create().texOffs(0, 0).addBox(-2.25F, -4.65F, -4.75F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offset(-2.0F, 2.0F, -3.5F));

		PartDefinition r_eye = eyes.addOrReplaceChild("r_eye", CubeListBuilder.create().texOffs(0, 5).addBox(0.25F, -4.65F, -4.75F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offset(0.0F, 2.0F, -3.5F));

		PartDefinition tongue = base.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(34, 28).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 5.5F));

		PartDefinition throat = base.addOrReplaceChild("throat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.5F, -3.0F, -1.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, -2.0F, -2.0F));

		PartDefinition fl_leg = root.addOrReplaceChild("fl_leg", CubeListBuilder.create().texOffs(31, 33).addBox(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 34).addBox(-1.0F, 2.0F, -3.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -2.0F, -2.0F));

		PartDefinition bl_leg = root.addOrReplaceChild("bl_leg", CubeListBuilder.create().texOffs(31, 27).addBox(0.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(19, 29).addBox(0.0F, 2.0F, -3.5F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -2.0F, 2.5F));

		PartDefinition br_leg = root.addOrReplaceChild("br_leg", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(9, 29).addBox(-4.0F, 2.0F, -3.5F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -2.0F, 2.5F));

		PartDefinition fr_leg = root.addOrReplaceChild("fr_leg", CubeListBuilder.create().texOffs(2, 33).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(10, 34).addBox(-3.0F, 2.0F, -3.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -2.0F, -2.0F));

		return LayerDefinition.create(meshdefinition, 64, 48);
	}

	@Override
	public void setupAnim(CrimsonFrogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root.getAllParts().forEach(ModelPart::resetPose);
	    this.animate(entity.jumpAnimationState, CrimsonFrogAnimation.MODEL_JUMP, ageInTicks);
	    this.animate(entity.croakAnimationState, CrimsonFrogAnimation.MODEL_CROAK, ageInTicks);
	    this.animate(entity.tongueAnimationState, CrimsonFrogAnimation.MODEL_TONGUE, ageInTicks);
	    this.animateWalk(CrimsonFrogAnimation.MODEL_WALK, limbSwing, limbSwingAmount, 1.5F, 2.5F);
	}

	@Override
	public ModelPart root() {
		return this.root;
	}
}