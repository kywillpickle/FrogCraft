package net.topnotchgames.frogcraft.data.datagen;

import java.util.function.Consumer;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.topnotchgames.frogcraft.data.tags.Tags;
import net.topnotchgames.frogcraft.world.block.LiminalBlock;
import net.topnotchgames.frogcraft.world.item.Items;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider implements IConditionBuilder{
	
	public RecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> writer) {
		
		/* Cooked Recipies */
		buildCooked(writer, Items.FROG_LEG, Items.COOKED_FROG_LEG);
		
		/* Butterfly Net */
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, Items.BUTTERFLY_NET.get(), 1)
			.define('/', net.minecraft.world.item.Items.STICK)
			.define('S', net.minecraft.world.item.Items.STRING)
			.define('W', net.minecraft.tags.ItemTags.WOOL)
				.pattern(" S/")
				.pattern(" /W")
				.pattern("/  ")
			.unlockedBy(getHasName(Items.FROG_LEG.get()), has(Items.FROG_LEG.get()))
		.save(writer);
		
		/* Light Fixture Block */
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_FIXTURE_BLOCK.get(), 1)
		.define('G', net.minecraft.world.item.Items.GLOWSTONE)
		.define('L', Items.FROG_LEG.get())
			.pattern("GGG")
			.pattern("GLG")
			.pattern("GGG")
		.unlockedBy(getHasName(Items.FROG_LEG.get()), has(Items.FROG_LEG.get()))
	.save(writer);
		
		/* Base Liminal Block Recipies */
		buildLiminalBlock(writer, Tags.Items.LIMINAL_WALL,   ItemTags.PLANKS,                            Items.YELLOW_LIMINAL_WALL);
		buildLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, ItemTags.WOOL,                              Items.YELLOW_LIMINAL_CARPET);
		buildLiminalBlock(writer, Tags.Items.LIMINAL_TILES,  net.minecraftforge.common.Tags.Items.STONE, Items.YELLOW_LIMINAL_TILES);
		
		/* Dyed Liminal Block Recipies */
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.BLACK_LIMINAL_WALL);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.RED_LIMINAL_WALL);       
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.GREEN_LIMINAL_WALL);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.BROWN_LIMINAL_WALL);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.BLUE_LIMINAL_WALL);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.PURPLE_LIMINAL_WALL);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.CYAN_LIMINAL_WALL);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.LIGHT_GRAY_LIMINAL_WALL);
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.GRAY_LIMINAL_WALL);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.PINK_LIMINAL_WALL);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.LIME_LIMINAL_WALL);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.YELLOW_LIMINAL_WALL);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.LIGHT_BLUE_LIMINAL_WALL);
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.MAGENTA_LIMINAL_WALL);   
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.ORANGE_LIMINAL_WALL);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_WALL, Items.WHITE_LIMINAL_WALL);     
		
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.BLACK_LIMINAL_CARPET);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.RED_LIMINAL_CARPET);       
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.GREEN_LIMINAL_CARPET);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.BROWN_LIMINAL_CARPET);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.BLUE_LIMINAL_CARPET);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.PURPLE_LIMINAL_CARPET);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.CYAN_LIMINAL_CARPET);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.LIGHT_GRAY_LIMINAL_CARPET);
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.GRAY_LIMINAL_CARPET);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.PINK_LIMINAL_CARPET);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.LIME_LIMINAL_CARPET);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.YELLOW_LIMINAL_CARPET);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.LIGHT_BLUE_LIMINAL_CARPET);
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.MAGENTA_LIMINAL_CARPET);   
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.ORANGE_LIMINAL_CARPET);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_CARPET, Items.WHITE_LIMINAL_CARPET);     
		
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.BLACK_LIMINAL_TILES);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.RED_LIMINAL_TILES);       
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.GREEN_LIMINAL_TILES);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.BROWN_LIMINAL_TILES);     
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.BLUE_LIMINAL_TILES);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.PURPLE_LIMINAL_TILES);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.CYAN_LIMINAL_TILES);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.LIGHT_GRAY_LIMINAL_TILES);
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.GRAY_LIMINAL_TILES);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.PINK_LIMINAL_TILES);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.LIME_LIMINAL_TILES);      
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.YELLOW_LIMINAL_TILES);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.LIGHT_BLUE_LIMINAL_TILES);
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.MAGENTA_LIMINAL_TILES);   
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.ORANGE_LIMINAL_TILES);    
		buildDyedLiminalBlock(writer, Tags.Items.LIMINAL_TILES, Items.WHITE_LIMINAL_TILES);     
	}
	
	/* Recipe Helpers */
	private void buildCooked(Consumer<FinishedRecipe> writer, RegistryObject<Item> item, RegistryObject<Item> product) {
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(item.get()), RecipeCategory.FOOD, product.get(), 0.1F, 100)
				.unlockedBy(getHasName(Items.FROG_LEG.get()), has(Items.FROG_LEG.get()))
			.save(writer, Items.COOKED_FROG_LEG.getId());
		SimpleCookingRecipeBuilder.smoking(Ingredient.of(item.get()), RecipeCategory.FOOD, product.get(), 0.1F, 50)
			.unlockedBy(getHasName(Items.FROG_LEG.get()), has(Items.FROG_LEG.get()))
		.save(writer, "smoker_"+Items.COOKED_FROG_LEG.getId());
	}
	private void buildLiminalBlock(Consumer<FinishedRecipe> writer, TagKey<Item> liminalItemTag, TagKey<Item> baseItemTag, RegistryObject<BlockItem> product) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, product.get(), 8)
				.define('#', baseItemTag)
				.define('L', Items.FROG_LEG.get())
					.pattern("###")
					.pattern("#L#")
					.pattern("###")
				.group(liminalItemTag.location().getPath())
				.unlockedBy(getHasName(Items.FROG_LEG.get()), has(Items.FROG_LEG.get()))
			.save(writer, liminalItemTag.location().getPath());
	}
	private void buildDyedLiminalBlock(Consumer<FinishedRecipe> writer, TagKey<Item> liminalItemTag, RegistryObject<BlockItem> product) {
		ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, product.get(), 8)
				.define('#', liminalItemTag)
				.define('D', ((LiminalBlock) product.get().getBlock()).COLOR.getTag())
					.pattern("###")
					.pattern("#D#")
					.pattern("###")
				.group(liminalItemTag.location().getPath())
				.unlockedBy(getHasName(Items.FROG_LEG.get()), has(Items.FROG_LEG.get()))
			.save(writer);
	}

}
