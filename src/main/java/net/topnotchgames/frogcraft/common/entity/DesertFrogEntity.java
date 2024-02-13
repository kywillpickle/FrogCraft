package net.topnotchgames.frogcraft.common.entity;

import javax.annotation.Nullable;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.level.Level;
import net.topnotchgames.frogcraft.common.SoundEvents.SoundEvents;

public class DesertFrogEntity extends Frog{

	public DesertFrogEntity(EntityType<? extends Animal> p_218470_, Level p_218471_) {
	    super(p_218470_, p_218471_);
	}
	
	public static AttributeSupplier.Builder createAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 1.0D).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ATTACK_DAMAGE, 10.0D);
	}
	
	@Nullable
	protected SoundEvent getAmbientSound() {
		return SoundEvents.DESERT_FROG_CROAK_1.get();
	}
	
	@Nullable
	protected SoundEvent getHurtSound(DamageSource p_218510_) {
		return SoundEvents.DESERT_FROG_CROAK_2.get();
	}

	@Nullable
	protected SoundEvent getDeathSound() {
		return SoundEvents.DESERT_FROG_CROAK_2.get();
 	 }
}
