package net.topnotchgames.frogcraft.world.item;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
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
	public ButterflyNetItem(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}
	public void onCraftedBy(ItemStack p_77622_1_, Level p_77622_2_, Player p_77622_3_) {
		this.setDamage(p_77622_1_, 1);
	}

	public InteractionResult interactLivingEntity(ItemStack p_111207_1_, Player p_111207_2_, LivingEntity p_111207_3_, InteractionHand p_111207_4_) {
		ItemStack itemStack = p_111207_2_.getItemInHand(p_111207_4_);
		CompoundTag compoundTag = itemStack.getTag();
		if (compoundTag == null) {
			compoundTag = new CompoundTag();
	        itemStack.setTag(compoundTag);
	      }
		if(compoundTag.get("frogType") == null && p_111207_4_.equals(InteractionHand.MAIN_HAND) && p_111207_3_ instanceof Frog) {
			compoundTag.putString("frogType", p_111207_3_.getEncodeId());
			compoundTag.put("frogData", p_111207_3_.serializeNBT());
			this.setDamage(itemStack, 0);
			p_111207_3_.remove(Entity.RemovalReason.DISCARDED);
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}
	
	public InteractionResultHolder<ItemStack> use(Level p_77659_1_, Player p_77659_2_, InteractionHand p_77659_3_) {
	      ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
	      if (p_77659_1_.isClientSide()) {
	    	  return InteractionResultHolder.pass(itemstack);
	      }
	      BlockHitResult blockraytraceresult = getPlayerPOVHitResult(p_77659_1_, p_77659_2_, ClipContext.Fluid.SOURCE_ONLY);
	      if (blockraytraceresult.getType() != BlockHitResult.Type.BLOCK) {
	         return InteractionResultHolder.pass(itemstack);
	      } else if (!(p_77659_1_ instanceof ServerLevel)) {
	         return InteractionResultHolder.success(itemstack);
	      } else {
	         BlockPos blockpos = blockraytraceresult.getBlockPos().offset(0, 1, 0);
	         CompoundTag compoundTag = itemstack.getTag();
	         if(compoundTag.get("frogType") != null) {
		         if (p_77659_1_.mayInteract(p_77659_2_, blockpos) && p_77659_2_.mayUseItemAt(blockpos, blockraytraceresult.getDirection(), itemstack)) {
		        	if (!(p_77659_1_.getBlockState(blockpos).getBlock() instanceof LiquidBlock)) {
			        	Entity summonedFrog = ForgeRegistries.ENTITY_TYPES.getValue(ResourceLocation.tryParse(compoundTag.getString("frogType"))).spawn((ServerLevel)p_77659_1_, blockpos, MobSpawnType.SPAWN_EGG);
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
			                p_77659_2_.awardStat(Stats.ITEM_USED.get(this));
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
	public void appendHoverText(ItemStack p_77624_1_, @Nullable Level p_77624_2_, List<Component> p_77624_3_, TooltipFlag p_77624_4_) {
		super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
		p_77624_3_.add(Component.literal("item.frogcraft.butterfly_net.description").withStyle(ChatFormatting.GRAY));
	}
}
