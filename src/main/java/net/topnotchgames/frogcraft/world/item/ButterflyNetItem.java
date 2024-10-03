package net.topnotchgames.frogcraft.world.item;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;

public class ButterflyNetItem extends Item {
	public ButterflyNetItem(Properties properties) {
		super(properties);
	}
	
	public static boolean hasFrog(ItemStack itemStack) {
		return itemStack.getTag() != null && itemStack.getTag().get("frogType") != null;
	}
	
	public static <T extends Frog> void putFrog(ItemStack itemStack, T entity) {
		CompoundTag compoundTag = itemStack.getTag();
		if (compoundTag == null) {
			compoundTag = new CompoundTag();
	        itemStack.setTag(compoundTag);
	    }
		compoundTag.putString("frogType", entity.getEncodeId());
		compoundTag.put("frogData", entity.serializeNBT());
	}
	
	public static void clearFrog(ItemStack itemStack) {
		if(hasFrog(itemStack)) {
			CompoundTag compoundTag = itemStack.getTag();
			compoundTag.remove("frogType");
			compoundTag.remove("frogData");
		}
	}
	
	@Nullable
	public static EntityType<?> getFrogType(ItemStack itemStack) {
		if (!hasFrog(itemStack)) return null;
		return ForgeRegistries.ENTITY_TYPES.getValue(ResourceLocation.tryParse(itemStack.getTag().getString("frogType")));
	}
	
	public static String getFrogData(ItemStack itemStack) {
		if (!hasFrog(itemStack)) return "";
		return itemStack.getTag().getString("frogData");
	}
	
	public InteractionResult interactLivingEntity(ItemStack itemStack, Player player, LivingEntity entity, InteractionHand hand) {
		itemStack = player.getItemInHand(hand);
		if (!hasFrog(itemStack) && entity instanceof Frog) {
			putFrog(itemStack, (Frog)entity);
			entity.remove(Entity.RemovalReason.DISCARDED);
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}
	
	public InteractionResult useOn(UseOnContext ctx) {
		Player player = ctx.getPlayer();
		Level level = ctx.getLevel();
		ItemStack itemStack = ctx.getItemInHand();
		BlockPos blockPos = ctx.getClickedPos();
		Direction direction = ctx.getClickedFace();
		BlockState blockState = level.getBlockState(blockPos);
		if (hasFrog(itemStack) && !(blockState.getBlock() instanceof LiquidBlock)) {
			if (!(level instanceof ServerLevel)) return InteractionResult.SUCCESS;
			BlockPos blockpos1;
			if (blockState.getCollisionShape(level, blockPos).isEmpty())
				blockpos1 = blockPos;
			else
				blockpos1 = blockPos.relative(direction);
			Entity summonedFrog = getFrogType(itemStack).spawn((ServerLevel) level, itemStack, player, blockpos1, MobSpawnType.BUCKET, true,
					!Objects.equals(blockPos, blockpos1) && direction == Direction.UP);
			if (summonedFrog != null) {
				float yRot = summonedFrog.getYRot();
				float xRot = summonedFrog.getXRot();
				summonedFrog.deserializeNBT((CompoundTag) itemStack.getTag().get("frogData"));
				summonedFrog.moveTo(blockpos1, yRot, xRot);
				clearFrog(itemStack);
				level.gameEvent(player, GameEvent.ENTITY_PLACE, blockPos);
				player.awardStat(Stats.ITEM_USED.get(this));
			}
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.PASS;
	}
	
	@Override
	public boolean isBarVisible(ItemStack itemStack) {
		return true;
	}
	
	@Override
	public int getBarWidth(ItemStack itemStack) {
		return (itemStack.getTag() != null && itemStack.getTag().get("frogType") != null) ? 13 : 0;
	}
	
	@Override
	public int getBarColor(ItemStack p_150901_) {
		return Mth.hsvToRgb(getBarWidth(p_150901_) / 39.0F, 1.0F, 1.0F);
	}
	
	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
		super.appendHoverText(itemStack, level, components, flag);
		components.add(Component.translatable(this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY));
	}
}
