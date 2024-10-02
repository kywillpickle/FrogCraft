package net.topnotchgames.frogcraft.world.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;

public class ButterflyNetItem extends Item {
	public ButterflyNetItem(Properties properties) {
		super(properties);
	}
	public void onCraftedBy(ItemStack itemStack, Level level, Player player) {
		this.setDamage(itemStack, 1);
	}

	public InteractionResult interactLivingEntity(ItemStack itemStack, Player player, LivingEntity entity, InteractionHand hand) {
		itemStack = player.getItemInHand(hand);
		CompoundTag compoundTag = itemStack.getTag();
		if (compoundTag == null) {
			compoundTag = new CompoundTag();
	        itemStack.setTag(compoundTag);
	    }
		if (compoundTag.get("frogType") == null && entity instanceof Frog) {
			compoundTag.putString("frogType", entity.getEncodeId());
			compoundTag.put("frogData", entity.serializeNBT());
			this.setDamage(itemStack, 0);
			entity.remove(Entity.RemovalReason.DISCARDED);
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}
	
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
	      ItemStack itemstack = player.getItemInHand(hand);
	      if (level.isClientSide()) {
	    	  return InteractionResultHolder.pass(itemstack);
	      }
	      BlockHitResult blockraytraceresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
	      if (blockraytraceresult.getType() != BlockHitResult.Type.BLOCK) {
	         return InteractionResultHolder.pass(itemstack);
	      } else if (!(level instanceof ServerLevel)) {
	         return InteractionResultHolder.success(itemstack);
	      } else {
	         BlockPos blockpos = blockraytraceresult.getBlockPos().offset(0, 1, 0);
	         CompoundTag compoundTag = itemstack.getTag();
	         if(compoundTag.get("frogType") != null) {
		         if (level.mayInteract(player, blockpos) && player.mayUseItemAt(blockpos, blockraytraceresult.getDirection(), itemstack)) {
		        	if (!(level.getBlockState(blockpos).getBlock() instanceof LiquidBlock)) {
			        	Entity summonedFrog = ForgeRegistries.ENTITY_TYPES.getValue(ResourceLocation.tryParse(compoundTag.getString("frogType"))).spawn((ServerLevel)level, blockpos, MobSpawnType.SPAWN_EGG);
			        	if (summonedFrog == null) {
			               return InteractionResultHolder.pass(itemstack);
			            } else {
			            	float yRot = summonedFrog.getYRot();
			            	float xRot = summonedFrog.getXRot();
			            	CompoundTag tag = (CompoundTag)compoundTag.get("frogData");
			            	summonedFrog.deserializeNBT(tag);
			            	summonedFrog.moveTo(blockpos, yRot, xRot);
			            	compoundTag.remove("frogType");
			            	compoundTag.remove("frogData");
			                player.awardStat(Stats.ITEM_USED.get(this));
			                itemstack.setDamageValue(1);
			                return InteractionResultHolder.consume(itemstack);
			            }
			         } else {
		            return InteractionResultHolder.fail(itemstack);
		         }
		      }
	      }
	      return InteractionResultHolder.pass(itemstack);
	   }
	}
	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
		super.appendHoverText(itemStack, level, components, flag);
		components.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY));
	}
}
