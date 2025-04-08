package me.withers_overhaul.datagen.fabric;

import me.withers_overhaul.block.util.OverhaulBlockFamilies;
import me.withers_overhaul.registry.block.StoneBlocks;
import me.withers_overhaul.registry.item.BasicItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static me.withers_overhaul.block.util.OverhaulBlockFamilies.*;
import static me.withers_overhaul.registry.block.ColoredBlocks.*;
import static me.withers_overhaul.registry.block.NaturalBlocks.*;
import static me.withers_overhaul.registry.block.StoneBlocks.*;
import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.tag.OverhaulItemTags.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.data.family.BlockFamily.Variant.*;
import static net.minecraft.item.Items.PURPLE_DYE;
import static net.minecraft.recipe.book.RecipeCategory.BUILDING_BLOCKS;


public class RecipeGen extends FabricRecipeProvider {
    public RecipeGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {

            @Override
            public void generate() {

                BlockFamily[] woodFamilies = {
                        MAPLE, POPLAR, BEECH, HICKORY, WALNUT, CHESTNUT, CEDAR, REDWOOD, FIR, HEMLOCK, HOLLY, PINE, LARCH, ASPEN, KAPOK, MAHOGANY, EUCALYPTUS,
                        BAOBAB, PALO_VERDE, JOSHUA, JUNIPER, PALM, EBONY, TEAK, ELM, WILLOW, CYPRESS, SAKURA, MAGNOLIA, JACARANDA
                };

                for (BlockFamily woodFamily : woodFamilies) {
                    generateRecipes(exporter, woodFamily, false, STAIRS, SLAB, FENCE, FENCE_GATE, DOOR, TRAPDOOR, PRESSURE_PLATE, BUTTON, SIGN);
                }

                BlockFamily[] stoneFamilies = {
                        OverhaulBlockFamilies.GNEISS, OverhaulBlockFamilies.SHALE, OverhaulBlockFamilies.LIMESTONE,
                        OverhaulBlockFamilies.MARBLE, OverhaulBlockFamilies.GABBRO, OverhaulBlockFamilies.PHYLLITE,
                        OverhaulBlockFamilies.POLISHED_CALCITE, OverhaulBlockFamilies.POLISHED_DRIPSTONE,
                        OverhaulBlockFamilies.TERRACOTTA,
                        OverhaulBlockFamilies.WHITE_TERRACOTTA, OverhaulBlockFamilies.LIGHT_GRAY_TERRACOTTA, OverhaulBlockFamilies.GRAY_TERRACOTTA, OverhaulBlockFamilies.BLACK_TERRACOTTA,
                        OverhaulBlockFamilies.BROWN_TERRACOTTA, OverhaulBlockFamilies.RED_TERRACOTTA, OverhaulBlockFamilies.ORANGE_TERRACOTTA, OverhaulBlockFamilies.YELLOW_TERRACOTTA,
                        OverhaulBlockFamilies.LIME_TERRACOTTA, OverhaulBlockFamilies.GREEN_TERRACOTTA, OverhaulBlockFamilies.CYAN_TERRACOTTA, OverhaulBlockFamilies.LIGHT_BLUE_TERRACOTTA,
                        OverhaulBlockFamilies.BLUE_TERRACOTTA, OverhaulBlockFamilies.PURPLE_TERRACOTTA, OverhaulBlockFamilies.MAGENTA_TERRACOTTA, OverhaulBlockFamilies.PINK_TERRACOTTA,
                        OverhaulBlockFamilies.CHALK,
                        OverhaulBlockFamilies.WHITE_CHALK, OverhaulBlockFamilies.LIGHT_GRAY_CHALK, OverhaulBlockFamilies.GRAY_CHALK, OverhaulBlockFamilies.BLACK_CHALK,
                        OverhaulBlockFamilies.BROWN_CHALK, OverhaulBlockFamilies.RED_CHALK, OverhaulBlockFamilies.ORANGE_CHALK, OverhaulBlockFamilies.YELLOW_CHALK,
                        OverhaulBlockFamilies.LIME_CHALK, OverhaulBlockFamilies.GREEN_CHALK, OverhaulBlockFamilies.CYAN_CHALK, OverhaulBlockFamilies.LIGHT_BLUE_CHALK,
                        OverhaulBlockFamilies.BLUE_CHALK, OverhaulBlockFamilies.PURPLE_CHALK, OverhaulBlockFamilies.MAGENTA_CHALK, OverhaulBlockFamilies.PINK_CHALK,
                };

                for (BlockFamily stoneFamily : stoneFamilies) {
                    generateRecipes(exporter, stoneFamily, true, STAIRS, SLAB, WALL, POLISHED);
                }

                BlockFamily[] polishedStoneFamilies = {
                        OverhaulBlockFamilies.POLISHED_GNEISS, OverhaulBlockFamilies.POLISHED_SHALE, OverhaulBlockFamilies.POLISHED_LIMESTONE,
                        OverhaulBlockFamilies.POLISHED_MARBLE, OverhaulBlockFamilies.POLISHED_GABBRO, OverhaulBlockFamilies.POLISHED_PHYLLITE
                };

                for (BlockFamily polishedStoneFamily : polishedStoneFamilies) {
                    generateRecipes(exporter, polishedStoneFamily, true, STAIRS, SLAB, WALL, POLISHED, PRESSURE_PLATE, BUTTON);
                }

                BlockFamily[] stoneBrickFamilies = {
                        GRANITE_BRICK, DIORITE_BRICK, ANDESITE_BRICK, GNEISS_BRICK, SHALE_BRICK, LIMESTONE_BRICK, MARBLE_BRICK, GABBRO_BRICK, PHYLLITE_BRICK
                };

                for (BlockFamily stoneBrickFamily : stoneBrickFamilies) {
                    generateRecipes(exporter, stoneBrickFamily, true, STAIRS, SLAB, WALL, CRACKED, CHISELED);
                }

                BlockFamily[] basicFamilies = {
                        MOSSY_GRANITE_BRICK, MOSSY_DIORITE_BRICK, MOSSY_ANDESITE_BRICK, MOSSY_GNEISS_BRICK, MOSSY_SHALE_BRICK, MOSSY_LIMESTONE_BRICK,
                        MOSSY_MARBLE_BRICK, MOSSY_GABBRO_BRICK, MOSSY_PHYLLITE_BRICK, OverhaulBlockFamilies.ROUGH_SANDSTONE, OverhaulBlockFamilies.ROUGH_RED_SANDSTONE,
                        OverhaulBlockFamilies.CUT_FROSTED_SANDSTONE, OverhaulBlockFamilies.SMOOTH_FROSTED_SANDSTONE, OverhaulBlockFamilies.ROUGH_FROSTED_SANDSTONE,
                        OverhaulBlockFamilies.CUT_CHARRED_SANDSTONE, OverhaulBlockFamilies.SMOOTH_CHARRED_SANDSTONE, OverhaulBlockFamilies.ROUGH_CHARRED_SANDSTONE,
                        BLUE_NETHER_BRICK,
                        OverhaulBlockFamilies.WHITE_CONCRETE, OverhaulBlockFamilies.LIGHT_GRAY_CONCRETE, OverhaulBlockFamilies.GRAY_CONCRETE, OverhaulBlockFamilies.BLACK_CONCRETE,
                        OverhaulBlockFamilies.BROWN_CONCRETE, OverhaulBlockFamilies.RED_CONCRETE, OverhaulBlockFamilies.ORANGE_CONCRETE, OverhaulBlockFamilies.YELLOW_CONCRETE,
                        OverhaulBlockFamilies.LIME_CONCRETE, OverhaulBlockFamilies.GREEN_CONCRETE, OverhaulBlockFamilies.CYAN_CONCRETE, OverhaulBlockFamilies.LIGHT_BLUE_CONCRETE,
                        OverhaulBlockFamilies.BLUE_CONCRETE, OverhaulBlockFamilies.PURPLE_CONCRETE, OverhaulBlockFamilies.MAGENTA_CONCRETE, OverhaulBlockFamilies.PINK_CONCRETE,
                        TERRACOTTA_BRICK, WHITE_TERRACOTTA_BRICK, LIGHT_GRAY_TERRACOTTA_BRICK, GRAY_TERRACOTTA_BRICK, BLACK_TERRACOTTA_BRICK,
                        BROWN_TERRACOTTA_BRICK, RED_TERRACOTTA_BRICK, ORANGE_TERRACOTTA_BRICK, YELLOW_TERRACOTTA_BRICK,
                        LIME_TERRACOTTA_BRICK, GREEN_TERRACOTTA_BRICK, CYAN_TERRACOTTA_BRICK, LIGHT_BLUE_TERRACOTTA_BRICK,
                        BLUE_TERRACOTTA_BRICK, PURPLE_TERRACOTTA_BRICK, MAGENTA_TERRACOTTA_BRICK, PINK_TERRACOTTA_BRICK,
                        CHALK_BRICK, WHITE_CHALK_BRICK, LIGHT_GRAY_CHALK_BRICK, GRAY_CHALK_BRICK, BLACK_CHALK_BRICK,
                        BROWN_CHALK_BRICK, RED_CHALK_BRICK, ORANGE_CHALK_BRICK, YELLOW_CHALK_BRICK,
                        LIME_CHALK_BRICK, GREEN_CHALK_BRICK, CYAN_CHALK_BRICK, LIGHT_BLUE_CHALK_BRICK,
                        BLUE_CHALK_BRICK, PURPLE_CHALK_BRICK, MAGENTA_CHALK_BRICK, PINK_CHALK_BRICK
                };

                for (BlockFamily basicFamily : basicFamilies) {
                    generateRecipes(exporter, basicFamily, true, STAIRS, SLAB, WALL);
                }

                BlockFamily[] uniqueStoneFamilies = {
                        OverhaulBlockFamilies.CALCITE, DRIPSTONE, OverhaulBlockFamilies.FROSTED_SANDSTONE, OverhaulBlockFamilies.CHARRED_SANDSTONE,
                        AMETHYST, OverhaulBlockFamilies.DOLOMITE, OverhaulBlockFamilies.GYPSUM
                };

                for (BlockFamily uniqueStoneFamily : uniqueStoneFamilies) {
                    generateRecipes(exporter, uniqueStoneFamily, true, STAIRS, SLAB, WALL, POLISHED, CHISELED);
                }

                BlockFamily[] tileFamilies = {
                        CALCITE_BRICK, DRIPSTONE_BRICK, QUARTZ_BRICK, AMETHYST_TILE, DOLOMITE_TILE, GYPSUM_TILE
                };

                for (BlockFamily tileFamily : tileFamilies) {
                    generateRecipes(exporter, tileFamily, true, STAIRS, SLAB, WALL, CRACKED);
                }

                BlockFamily[] uniqueBrickFamilies = {
                        AMETHYST_BRICK, DOLOMITE_BRICK, GYPSUM_BRICK
                };

                for (BlockFamily uniqueBrickFamily : uniqueBrickFamilies) {
                    generateRecipes(exporter, uniqueBrickFamily, true, STAIRS, SLAB, WALL, POLISHED, CRACKED);
                }

                generateLogRecipes(MAPLE_LOGS, MAPLE_PLANKS, MAPLE_LOG, MAPLE_WOOD, STRIPPED_MAPLE_LOG, STRIPPED_MAPLE_WOOD, MAPLE_HANGING_SIGN);
                generateLogRecipes(POPLAR_LOGS, POPLAR_PLANKS, POPLAR_LOG, POPLAR_WOOD, STRIPPED_POPLAR_LOG, STRIPPED_POPLAR_WOOD, POPLAR_HANGING_SIGN);
                generateLogRecipes(BEECH_LOGS, BEECH_PLANKS, BEECH_LOG, BEECH_WOOD, STRIPPED_BEECH_LOG, STRIPPED_BEECH_WOOD, BEECH_HANGING_SIGN);
                generateLogRecipes(HICKORY_LOGS, HICKORY_PLANKS, HICKORY_LOG, HICKORY_WOOD, STRIPPED_HICKORY_LOG, STRIPPED_HICKORY_WOOD, HICKORY_HANGING_SIGN);
                generateLogRecipes(WALNUT_LOGS, WALNUT_PLANKS, WALNUT_LOG, WALNUT_WOOD, STRIPPED_WALNUT_LOG, STRIPPED_WALNUT_WOOD, WALNUT_HANGING_SIGN);
                generateLogRecipes(CHESTNUT_LOGS, CHESTNUT_PLANKS, CHESTNUT_LOG, CHESTNUT_WOOD, STRIPPED_CHESTNUT_LOG, STRIPPED_CHESTNUT_WOOD, CHESTNUT_HANGING_SIGN);
                generateLogRecipes(CEDAR_LOGS, CEDAR_PLANKS, CEDAR_LOG, CEDAR_WOOD, STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD, CEDAR_HANGING_SIGN);
                generateLogRecipes(REDWOOD_LOGS, REDWOOD_PLANKS, REDWOOD_LOG, REDWOOD_WOOD, STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD, REDWOOD_HANGING_SIGN);
                generateLogRecipes(FIR_LOGS, FIR_PLANKS, FIR_LOG, FIR_WOOD, STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD, FIR_HANGING_SIGN);
                generateLogRecipes(HEMLOCK_LOGS, HEMLOCK_PLANKS, HEMLOCK_LOG, HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD, HEMLOCK_HANGING_SIGN);
                generateLogRecipes(HOLLY_LOGS, HOLLY_PLANKS, HOLLY_LOG, HOLLY_WOOD, STRIPPED_HOLLY_LOG, STRIPPED_HOLLY_WOOD, HOLLY_HANGING_SIGN);
                generateLogRecipes(PINE_LOGS, PINE_PLANKS, PINE_LOG, PINE_WOOD, STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD, PINE_HANGING_SIGN);
                generateLogRecipes(LARCH_LOGS, LARCH_PLANKS, LARCH_LOG, LARCH_WOOD, STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD, LARCH_HANGING_SIGN);
                generateLogRecipes(ASPEN_LOGS, ASPEN_PLANKS, ASPEN_LOG, ASPEN_WOOD, STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD, ASPEN_HANGING_SIGN);
                generateLogRecipes(KAPOK_LOGS, KAPOK_PLANKS, KAPOK_LOG, KAPOK_WOOD, STRIPPED_KAPOK_LOG, STRIPPED_KAPOK_WOOD, KAPOK_HANGING_SIGN);
                generateLogRecipes(MAHOGANY_LOGS, MAHOGANY_PLANKS, MAHOGANY_LOG, MAHOGANY_WOOD, STRIPPED_MAHOGANY_LOG, STRIPPED_MAHOGANY_WOOD, MAHOGANY_HANGING_SIGN);
                generateLogRecipes(EUCALYPTUS_LOGS, EUCALYPTUS_PLANKS, EUCALYPTUS_LOG, EUCALYPTUS_WOOD, STRIPPED_EUCALYPTUS_LOG, STRIPPED_EUCALYPTUS_WOOD, EUCALYPTUS_HANGING_SIGN);
                generateLogRecipes(BAOBAB_LOGS, BAOBAB_PLANKS, BAOBAB_LOG, BAOBAB_WOOD, STRIPPED_BAOBAB_LOG, STRIPPED_BAOBAB_WOOD, BAOBAB_HANGING_SIGN);
                generateLogRecipes(PALO_VERDE_LOGS, PALO_VERDE_PLANKS, PALO_VERDE_LOG, PALO_VERDE_WOOD, STRIPPED_PALO_VERDE_LOG, STRIPPED_PALO_VERDE_WOOD, PALO_VERDE_HANGING_SIGN);
                generateLogRecipes(JOSHUA_LOGS, JOSHUA_PLANKS, JOSHUA_LOG, JOSHUA_WOOD, STRIPPED_JOSHUA_LOG, STRIPPED_JOSHUA_WOOD, JOSHUA_HANGING_SIGN);
                generateLogRecipes(JUNIPER_LOGS, JUNIPER_PLANKS, JUNIPER_LOG, JUNIPER_WOOD, STRIPPED_JUNIPER_LOG, STRIPPED_JUNIPER_WOOD, JUNIPER_HANGING_SIGN);
                generateLogRecipes(PALM_LOGS, PALM_PLANKS, PALM_LOG, PALM_WOOD, STRIPPED_PALM_LOG, STRIPPED_PALM_WOOD, PALM_HANGING_SIGN);
                generateLogRecipes(EBONY_LOGS, EBONY_PLANKS, EBONY_LOG, EBONY_WOOD, STRIPPED_EBONY_LOG, STRIPPED_EBONY_WOOD, EBONY_HANGING_SIGN);
                generateLogRecipes(TEAK_LOGS, TEAK_PLANKS, TEAK_LOG, TEAK_WOOD, STRIPPED_TEAK_LOG, STRIPPED_TEAK_WOOD, TEAK_HANGING_SIGN);
                generateLogRecipes(ELM_LOGS, ELM_PLANKS, ELM_LOG, ELM_WOOD, STRIPPED_ELM_LOG, STRIPPED_ELM_WOOD, ELM_HANGING_SIGN);
                generateLogRecipes(WILLOW_LOGS, WILLOW_PLANKS, WILLOW_LOG, WILLOW_WOOD, STRIPPED_WILLOW_LOG, STRIPPED_WILLOW_WOOD, WILLOW_HANGING_SIGN);
                generateLogRecipes(CYPRESS_LOGS, CYPRESS_PLANKS, CYPRESS_LOG, CYPRESS_WOOD, STRIPPED_CYPRESS_LOG, STRIPPED_CYPRESS_WOOD, CYPRESS_HANGING_SIGN);
                generateLogRecipes(SAKURA_LOGS, SAKURA_PLANKS, SAKURA_LOG, SAKURA_WOOD, STRIPPED_SAKURA_LOG, STRIPPED_SAKURA_WOOD, SAKURA_HANGING_SIGN);
                generateLogRecipes(MAGNOLIA_LOGS, MAGNOLIA_PLANKS, MAGNOLIA_LOG, MAGNOLIA_WOOD, STRIPPED_MAGNOLIA_LOG, STRIPPED_MAGNOLIA_WOOD, MAGNOLIA_HANGING_SIGN);
                generateLogRecipes(JACARANDA_LOGS, JACARANDA_PLANKS, JACARANDA_LOG, JACARANDA_WOOD, STRIPPED_JACARANDA_LOG, STRIPPED_JACARANDA_WOOD, JACARANDA_HANGING_SIGN);

                offerWallRecipe(BUILDING_BLOCKS, STONE_WALL, STONE);
                offerStairsRecipe(exporter, SMOOTH_STONE_STAIRS, SMOOTH_STONE);
                offerWallRecipe(BUILDING_BLOCKS, SMOOTH_STONE_WALL, SMOOTH_STONE);
                offerPillarRecipe(exporter, STONE_BRICK_PILLAR, STONE_BRICKS);

                offerWallRecipe(BUILDING_BLOCKS, POLISHED_GRANITE_WALL, POLISHED_GRANITE);
                offerPolishedStoneRecipe(BUILDING_BLOCKS, GRANITE_BRICKS, POLISHED_GRANITE);
                offerPressurePlateRecipe(POLISHED_GRANITE_PRESSURE_PLATE, POLISHED_GRANITE);
                offerButtonRecipe(exporter, POLISHED_GRANITE_BUTTON, POLISHED_GRANITE);
                offerPillarRecipe(exporter, GRANITE_BRICK_PILLAR, GRANITE_BRICKS);

                offerWallRecipe(BUILDING_BLOCKS, POLISHED_DIORITE_WALL, POLISHED_DIORITE);
                offerPolishedStoneRecipe(BUILDING_BLOCKS, DIORITE_BRICKS, POLISHED_DIORITE);
                offerPressurePlateRecipe(POLISHED_DIORITE_PRESSURE_PLATE, POLISHED_DIORITE);
                offerButtonRecipe(exporter, POLISHED_DIORITE_BUTTON, POLISHED_DIORITE);
                offerPillarRecipe(exporter, DIORITE_BRICK_PILLAR, DIORITE_BRICKS);

                offerWallRecipe(BUILDING_BLOCKS, POLISHED_ANDESITE_WALL, POLISHED_ANDESITE);
                offerPolishedStoneRecipe(BUILDING_BLOCKS, ANDESITE_BRICKS, POLISHED_ANDESITE);
                offerPressurePlateRecipe(POLISHED_ANDESITE_PRESSURE_PLATE, POLISHED_ANDESITE);
                offerButtonRecipe(exporter, POLISHED_ANDESITE_BUTTON, POLISHED_ANDESITE);
                offerPillarRecipe(exporter, ANDESITE_BRICK_PILLAR, ANDESITE_BRICKS);

                offerPillarRecipe(exporter, GNEISS_BRICK_PILLAR, GNEISS_BRICKS);
                offerPillarRecipe(exporter, SHALE_BRICK_PILLAR, SHALE_BRICKS);
                offerPillarRecipe(exporter, LIMESTONE_BRICK_PILLAR, LIMESTONE_BRICKS);
                offerPillarRecipe(exporter, MARBLE_BRICK_PILLAR, MARBLE_BRICKS);
                offerPillarRecipe(exporter, GABBRO_BRICK_PILLAR, GABBRO_BRICKS);
                offerPillarRecipe(exporter, PHYLLITE_BRICK_PILLAR, PHYLLITE_BRICKS);

                offerCrackingRecipe(CRACKED_TUFF_BRICKS, TUFF_BRICKS);

                offerCrackingRecipe(StoneBlocks.SMOOTH_FROSTED_SANDSTONE, StoneBlocks.FROSTED_SANDSTONE);
                offerCrackingRecipe(StoneBlocks.SMOOTH_CHARRED_SANDSTONE, StoneBlocks.CHARRED_SANDSTONE);

                offerCrackingRecipe(CRACKED_PRISMARINE_BRICKS, PRISMARINE_BRICKS);
                offerWallRecipe(BUILDING_BLOCKS, PRISMARINE_BRICK_WALL, PRISMARINE_BRICKS);
                offerWallRecipe(BUILDING_BLOCKS, DARK_PRISMARINE_WALL, DARK_PRISMARINE);
                offerChiseledBlockRecipe(BUILDING_BLOCKS, CHISELED_PRISMARINE_BRICKS, PRISMARINE_BRICK_SLAB);

                offerCrackingRecipe(CRACKED_RED_NETHER_BRICKS, RED_NETHER_BRICKS);
                offerCustomFenceRecipe(exporter, RED_NETHER_BRICK_FENCE, RED_NETHER_BRICKS, Items.NETHER_BRICK);
                offerChiseledBlockRecipe(BUILDING_BLOCKS, CHISELED_RED_NETHER_BRICKS, RED_NETHER_BRICK_SLAB);
                offerCustomFenceRecipe(exporter, BLUE_NETHER_BRICK_FENCE, BLUE_NETHER_BRICKS, Items.NETHER_BRICK);

                offerWallRecipe(BUILDING_BLOCKS, QUARTZ_WALL, QUARTZ_BLOCK);
                offerWallRecipe(BUILDING_BLOCKS, SMOOTH_QUARTZ_WALL, SMOOTH_QUARTZ);

                createShaped(BUILDING_BLOCKS, BLUE_NETHER_BRICKS)
                        .input('W', BasicItems.WARPED_WART)
                        .input('N', Items.NETHER_BRICK)
                        .pattern("WN")
                        .pattern("NW")
                        .criterion(hasItem(BasicItems.WARPED_WART), conditionsFromItem(BasicItems.WARPED_WART))
                        .offerTo(exporter);

                offerCompactingRecipe(BUILDING_BLOCKS, WARPED_WART_BLOCK, BasicItems.WARPED_WART);

                createShaped(BUILDING_BLOCKS, StoneBlocks.ROUGH_SANDSTONE, 4)
                        .input('S', SAND)
                        .input('T', SANDSTONE)
                        .pattern("ST")
                        .pattern("TS")
                        .criterion(hasItem(SANDSTONE), conditionsFromItem(SANDSTONE))
                        .offerTo(exporter);

                createShaped(BUILDING_BLOCKS, StoneBlocks.ROUGH_RED_SANDSTONE, 4)
                        .input('S', RED_SAND)
                        .input('T', RED_SANDSTONE)
                        .pattern("ST")
                        .pattern("TS")
                        .criterion(hasItem(RED_SANDSTONE), conditionsFromItem(RED_SANDSTONE))
                        .offerTo(exporter);

                offerPolishedStoneRecipe(BUILDING_BLOCKS, StoneBlocks.FROSTED_SANDSTONE, FROSTED_SAND);
                offerPolishedStoneRecipe(BUILDING_BLOCKS, StoneBlocks.CHARRED_SANDSTONE, CHARRED_SAND);

                createShaped(BUILDING_BLOCKS, StoneBlocks.ROUGH_FROSTED_SANDSTONE, 4)
                        .input('S', FROSTED_SAND)
                        .input('T', StoneBlocks.FROSTED_SANDSTONE)
                        .pattern("ST")
                        .pattern("TS")
                        .criterion(hasItem(StoneBlocks.FROSTED_SANDSTONE), conditionsFromItem(StoneBlocks.FROSTED_SANDSTONE))
                        .offerTo(exporter);

                createShaped(BUILDING_BLOCKS, StoneBlocks.ROUGH_CHARRED_SANDSTONE, 4)
                        .input('S', CHARRED_SAND)
                        .input('T', StoneBlocks.CHARRED_SANDSTONE)
                        .pattern("ST")
                        .pattern("TS")
                        .criterion(hasItem(StoneBlocks.CHARRED_SANDSTONE), conditionsFromItem(StoneBlocks.CHARRED_SANDSTONE))
                        .offerTo(exporter);

                offerShapelessRecipe(PURPLE_DYE, LAVENDER, RecipeCategory.MISC.getName(), 2);
                offerShapelessRecipe(PURPLE_DYE, PURPLE_PETALS, RecipeCategory.MISC.getName(), 1);

                // ` ------------------------------------------------------------------------------------------------------------------------------------------------------

                ItemConvertible[] graniteStonecuttables = new ItemConvertible[] {
                        POLISHED_GRANITE_WALL, GRANITE_BRICKS, GRANITE_BRICK_STAIRS, GRANITE_BRICK_WALL, GRANITE_BRICK_PILLAR,
                        CHISELED_GRANITE_BRICKS, POLISHED_GRANITE_PRESSURE_PLATE, POLISHED_GRANITE_BUTTON
                };

                ItemConvertible[] polishedGraniteStonecuttables = new ItemConvertible[] {
                        POLISHED_GRANITE_WALL, GRANITE_BRICK_STAIRS, GRANITE_BRICK_WALL, GRANITE_BRICK_PILLAR, CHISELED_GRANITE_BRICKS,
                };

                ItemConvertible[] dioriteStonecuttables = new ItemConvertible[] {
                        POLISHED_DIORITE_WALL, DIORITE_BRICKS, DIORITE_BRICK_STAIRS, DIORITE_BRICK_WALL, DIORITE_BRICK_PILLAR,
                        CHISELED_DIORITE_BRICKS, POLISHED_DIORITE_PRESSURE_PLATE, POLISHED_DIORITE_BUTTON
                };

                ItemConvertible[] polishedDioriteStonecuttables = new ItemConvertible[] {
                        POLISHED_DIORITE_WALL, DIORITE_BRICK_STAIRS, DIORITE_BRICK_WALL, DIORITE_BRICK_PILLAR, CHISELED_DIORITE_BRICKS,
                };

                ItemConvertible[] andesiteStonecuttables = new ItemConvertible[] {
                        POLISHED_ANDESITE_WALL, ANDESITE_BRICKS, ANDESITE_BRICK_STAIRS, ANDESITE_BRICK_WALL, ANDESITE_BRICK_PILLAR,
                        CHISELED_ANDESITE_BRICKS, POLISHED_ANDESITE_PRESSURE_PLATE, POLISHED_ANDESITE_BUTTON
                };

                ItemConvertible[] polishedAndesiteStonecuttables = new ItemConvertible[] {
                        POLISHED_ANDESITE_WALL, ANDESITE_BRICK_STAIRS, ANDESITE_BRICK_WALL, ANDESITE_BRICK_PILLAR, CHISELED_ANDESITE_BRICKS,
                };

                ItemConvertible[] gneissStonecuttables = new ItemConvertible[] {
                        POLISHED_GNEISS_STAIRS, POLISHED_GNEISS_WALL, GNEISS_BRICKS, GNEISS_BRICK_STAIRS, GNEISS_BRICK_WALL,
                        GNEISS_BRICK_PILLAR, CHISELED_GNEISS_BRICKS, POLISHED_GNEISS_PRESSURE_PLATE, POLISHED_GNEISS_BUTTON
                };

                ItemConvertible[] polishedGneissStonecuttables = new ItemConvertible[] {
                        GNEISS_BRICK_STAIRS, GNEISS_BRICK_WALL, GNEISS_BRICK_PILLAR, CHISELED_GNEISS_BRICKS,
                };

                ItemConvertible[] shaleStonecuttables = new ItemConvertible[] {
                        POLISHED_SHALE_STAIRS, POLISHED_SHALE_WALL, SHALE_BRICKS, SHALE_BRICK_STAIRS, SHALE_BRICK_WALL,
                        SHALE_BRICK_PILLAR, CHISELED_SHALE_BRICKS, POLISHED_SHALE_PRESSURE_PLATE, POLISHED_SHALE_BUTTON
                };

                ItemConvertible[] polishedShaleStonecuttables = new ItemConvertible[] {
                        SHALE_BRICK_STAIRS, SHALE_BRICK_WALL, SHALE_BRICK_PILLAR, CHISELED_SHALE_BRICKS,
                };

                ItemConvertible[] limestoneStonecuttables = new ItemConvertible[] {
                        POLISHED_LIMESTONE_STAIRS, POLISHED_LIMESTONE_WALL, LIMESTONE_BRICKS, LIMESTONE_BRICK_STAIRS, LIMESTONE_BRICK_WALL,
                        LIMESTONE_BRICK_PILLAR, CHISELED_LIMESTONE_BRICKS, POLISHED_LIMESTONE_PRESSURE_PLATE, POLISHED_LIMESTONE_BUTTON
                };

                ItemConvertible[] polishedLimestoneStonecuttables = new ItemConvertible[] {
                        LIMESTONE_BRICK_STAIRS, LIMESTONE_BRICK_WALL, LIMESTONE_BRICK_PILLAR, CHISELED_LIMESTONE_BRICKS,
                };

                ItemConvertible[] marbleStonecuttables = new ItemConvertible[] {
                    POLISHED_MARBLE_STAIRS, POLISHED_MARBLE_WALL, MARBLE_BRICKS, MARBLE_BRICK_STAIRS, MARBLE_BRICK_WALL,
                    MARBLE_BRICK_PILLAR, CHISELED_MARBLE_BRICKS, POLISHED_MARBLE_PRESSURE_PLATE, POLISHED_MARBLE_BUTTON
                };

                ItemConvertible[] polishedMarbleStonecuttables = new ItemConvertible[] {
                        MARBLE_BRICK_STAIRS, MARBLE_BRICK_WALL, MARBLE_BRICK_PILLAR, CHISELED_MARBLE_BRICKS,
                };

                ItemConvertible[] gabbroStonecuttables = new ItemConvertible[] {
                    POLISHED_GABBRO_STAIRS, POLISHED_GABBRO_WALL, GABBRO_BRICKS, GABBRO_BRICK_STAIRS, GABBRO_BRICK_WALL,
                    GABBRO_BRICK_PILLAR, CHISELED_GABBRO_BRICKS, POLISHED_GABBRO_PRESSURE_PLATE, POLISHED_GABBRO_BUTTON
                };

                ItemConvertible[] polishedGabbroStonecuttables = new ItemConvertible[] {
                        GABBRO_BRICK_STAIRS, GABBRO_BRICK_WALL, GABBRO_BRICK_PILLAR, CHISELED_GABBRO_BRICKS,
                };

                ItemConvertible[] phylliteStonecuttables = new ItemConvertible[] {
                    POLISHED_PHYLLITE_STAIRS, POLISHED_PHYLLITE_WALL, PHYLLITE_BRICKS, PHYLLITE_BRICK_STAIRS, PHYLLITE_BRICK_WALL,
                    PHYLLITE_BRICK_PILLAR, CHISELED_PHYLLITE_BRICKS, POLISHED_PHYLLITE_PRESSURE_PLATE, POLISHED_PHYLLITE_BUTTON
                };

                ItemConvertible[] polishedPhylliteStonecuttables = new ItemConvertible[] {
                        PHYLLITE_BRICK_STAIRS, PHYLLITE_BRICK_WALL, PHYLLITE_BRICK_PILLAR, CHISELED_PHYLLITE_BRICKS,
                };

                ItemConvertible[] calciteStonecuttables = {
                        POLISHED_CALCITE_STAIRS, POLISHED_CALCITE_WALL, CALCITE_BRICKS, CALCITE_BRICK_STAIRS, CALCITE_BRICK_WALL
                };

                ItemConvertible[] polishedCalciteStonecuttables = {
                        CALCITE_BRICK_STAIRS, CALCITE_BRICK_WALL
                };

                ItemConvertible[] dripstoneStonecuttables = {
                        POLISHED_DRIPSTONE_STAIRS, POLISHED_DRIPSTONE_WALL, DRIPSTONE_BRICKS, DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICK_WALL
                };

                ItemConvertible[] polishedDripstoneStonecuttables = {
                        DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICK_WALL
                };

                ItemConvertible[] sandstoneStonecuttables = {
                        CUT_SANDSTONE_STAIRS, CUT_SANDSTONE_WALL, SMOOTH_SANDSTONE_WALL,
                };

                ItemConvertible[] cutSandstoneStonecuttables = {
                        CUT_SANDSTONE_STAIRS, CUT_SANDSTONE_WALL
                };

                ItemConvertible[] redSandstoneStonecuttables = {
                        CUT_RED_SANDSTONE_STAIRS, CUT_RED_SANDSTONE_WALL, SMOOTH_RED_SANDSTONE_WALL,
                };

                ItemConvertible[] cutRedSandstoneStonecuttables = {
                        CUT_RED_SANDSTONE_STAIRS, CUT_RED_SANDSTONE_WALL
                };

                ItemConvertible[] prismarineStonecuttables = {
                        PRISMARINE_BRICK_WALL, CHISELED_PRISMARINE_BRICKS
                };

                ItemConvertible[] prismarineBrickStonecuttables = {
                        PRISMARINE_BRICK_STAIRS, PRISMARINE_BRICK_WALL
                };

                ItemConvertible[] darkPrismarineStonecuttables = {
                        DARK_PRISMARINE_WALL
                };

                ItemConvertible[] quartzStonecuttables = {
                    QUARTZ_WALL, QUARTZ_BRICK_STAIRS, QUARTZ_BRICK_WALL
                };

                ItemConvertible[] amethystStonecuttables = {
                        AMETHYST_BRICK_STAIRS, AMETHYST_BRICK_WALL, AMETHYST_TILES, AMETHYST_TILE_STAIRS, AMETHYST_TILE_WALL
                };

                ItemConvertible[] amethystBrickStonecuttables = {
                        AMETHYST_TILE_STAIRS, AMETHYST_TILE_WALL
                };

                ItemConvertible[] dolomiteStonecuttables = {
                        DOLOMITE_BRICK_STAIRS, DOLOMITE_BRICK_WALL, DOLOMITE_TILES, DOLOMITE_TILE_STAIRS, DOLOMITE_TILE_WALL
                };

                ItemConvertible[] dolomiteBrickStonecuttables = {
                        DOLOMITE_TILE_STAIRS, DOLOMITE_TILE_WALL
                };

                ItemConvertible[] gypsumStonecuttables = {
                        GYPSUM_BRICK_STAIRS, GYPSUM_BRICK_WALL, GYPSUM_TILES, GYPSUM_TILE_STAIRS, GYPSUM_TILE_WALL
                };

                ItemConvertible[] gypsumBrickStonecuttables = {
                        GYPSUM_TILE_STAIRS, GYPSUM_TILE_WALL
                };

                List<ItemConvertible[]> terracottaStonecuttables = new ArrayList<>();

                addToList(terracottaStonecuttables, TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, WHITE_TERRACOTTA_BRICK_STAIRS, WHITE_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, GRAY_TERRACOTTA_BRICK_STAIRS, GRAY_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, BLACK_TERRACOTTA_BRICK_STAIRS, BLACK_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, BROWN_TERRACOTTA_BRICK_STAIRS, BROWN_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, RED_TERRACOTTA_BRICK_STAIRS, RED_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, ORANGE_TERRACOTTA_BRICK_STAIRS, ORANGE_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, YELLOW_TERRACOTTA_BRICK_STAIRS, YELLOW_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, LIME_TERRACOTTA_BRICK_STAIRS, LIME_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, GREEN_TERRACOTTA_BRICK_STAIRS, GREEN_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, CYAN_TERRACOTTA_BRICK_STAIRS, CYAN_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, BLUE_TERRACOTTA_BRICK_STAIRS, BLUE_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, PURPLE_TERRACOTTA_BRICK_STAIRS, PURPLE_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, MAGENTA_TERRACOTTA_BRICK_STAIRS, MAGENTA_TERRACOTTA_BRICK_WALL);
                addToList(terracottaStonecuttables, PINK_TERRACOTTA_BRICK_STAIRS, PINK_TERRACOTTA_BRICK_WALL);

                Map<ItemConvertible[], ItemConvertible> stonecuttables = new HashMap<>();

                stonecuttables.put(new ItemConvertible[]{STONE_BRICK_PILLAR}, STONE_BRICKS);
                stonecuttables.put(graniteStonecuttables, Blocks.GRANITE);
                stonecuttables.put(polishedGraniteStonecuttables, Blocks.POLISHED_GRANITE);
                stonecuttables.put(new ItemConvertible[]{GRANITE_BRICK_PILLAR}, GRANITE_BRICKS);
                stonecuttables.put(dioriteStonecuttables, Blocks.DIORITE);
                stonecuttables.put(polishedDioriteStonecuttables, Blocks.POLISHED_DIORITE);
                stonecuttables.put(new ItemConvertible[]{DIORITE_BRICK_PILLAR}, DIORITE_BRICKS);
                stonecuttables.put(andesiteStonecuttables, Blocks.ANDESITE);
                stonecuttables.put(polishedAndesiteStonecuttables, Blocks.POLISHED_ANDESITE);
                stonecuttables.put(new ItemConvertible[]{ANDESITE_BRICK_PILLAR}, ANDESITE_BRICKS);
                stonecuttables.put(gneissStonecuttables, StoneBlocks.GNEISS);
                stonecuttables.put(polishedGneissStonecuttables, StoneBlocks.POLISHED_GNEISS);
                stonecuttables.put(new ItemConvertible[]{GNEISS_BRICK_PILLAR}, GNEISS_BRICKS);
                stonecuttables.put(shaleStonecuttables, StoneBlocks.SHALE);
                stonecuttables.put(polishedShaleStonecuttables, StoneBlocks.POLISHED_SHALE);
                stonecuttables.put(new ItemConvertible[]{SHALE_BRICK_PILLAR}, SHALE_BRICKS);
                stonecuttables.put(limestoneStonecuttables, StoneBlocks.LIMESTONE);
                stonecuttables.put(polishedLimestoneStonecuttables, StoneBlocks.POLISHED_LIMESTONE);
                stonecuttables.put(new ItemConvertible[]{LIMESTONE_BRICK_PILLAR}, LIMESTONE_BRICKS);
                stonecuttables.put(marbleStonecuttables, StoneBlocks.MARBLE);
                stonecuttables.put(polishedMarbleStonecuttables, StoneBlocks.POLISHED_MARBLE);
                stonecuttables.put(new ItemConvertible[]{MARBLE_BRICK_PILLAR}, MARBLE_BRICKS);
                stonecuttables.put(gabbroStonecuttables, StoneBlocks.GABBRO);
                stonecuttables.put(polishedGabbroStonecuttables, StoneBlocks.POLISHED_GABBRO);
                stonecuttables.put(new ItemConvertible[]{GABBRO_BRICK_PILLAR}, GABBRO_BRICKS);
                stonecuttables.put(phylliteStonecuttables, StoneBlocks.PHYLLITE);
                stonecuttables.put(polishedPhylliteStonecuttables, StoneBlocks.POLISHED_PHYLLITE);
                stonecuttables.put(new ItemConvertible[]{PHYLLITE_BRICK_PILLAR}, PHYLLITE_BRICKS);
                stonecuttables.put(calciteStonecuttables, Blocks.CALCITE);
                stonecuttables.put(polishedCalciteStonecuttables, StoneBlocks.POLISHED_CALCITE);
                stonecuttables.put(dripstoneStonecuttables, DRIPSTONE_BLOCK);
                stonecuttables.put(polishedDripstoneStonecuttables, StoneBlocks.POLISHED_DRIPSTONE);
                stonecuttables.put(new ItemConvertible[]{CHISELED_MUD_BRICKS}, MUD_BRICKS);
                stonecuttables.put(sandstoneStonecuttables, SANDSTONE);
                stonecuttables.put(cutSandstoneStonecuttables, CUT_SANDSTONE);
                stonecuttables.put(redSandstoneStonecuttables, RED_SANDSTONE);
                stonecuttables.put(cutRedSandstoneStonecuttables, CUT_RED_SANDSTONE);
                stonecuttables.put(prismarineStonecuttables, PRISMARINE);
                stonecuttables.put(prismarineBrickStonecuttables, PRISMARINE_BRICKS);
                stonecuttables.put(darkPrismarineStonecuttables, DARK_PRISMARINE);
                stonecuttables.put(new ItemConvertible[]{CHISELED_RED_NETHER_BRICKS}, RED_NETHER_BRICKS);
                stonecuttables.put(quartzStonecuttables, QUARTZ_BLOCK);
                stonecuttables.put(amethystStonecuttables, AMETHYST_BLOCK);
                stonecuttables.put(amethystBrickStonecuttables, AMETHYST_BRICKS);
                stonecuttables.put(dolomiteStonecuttables, StoneBlocks.DOLOMITE);
                stonecuttables.put(dolomiteBrickStonecuttables, StoneBlocks.DOLOMITE_BRICKS);
                stonecuttables.put(gypsumStonecuttables, StoneBlocks.GYPSUM);
                stonecuttables.put(gypsumBrickStonecuttables, StoneBlocks.GYPSUM_BRICKS);
                stonecuttables.put(terracottaStonecuttables.get(0), Blocks.TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(1), Blocks.WHITE_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(2), Blocks.LIGHT_GRAY_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(3), Blocks.GRAY_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(4), Blocks.BLACK_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(5), Blocks.BROWN_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(6), Blocks.RED_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(7), Blocks.ORANGE_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(8), Blocks.YELLOW_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(9), Blocks.LIME_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(10), Blocks.GREEN_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(11), Blocks.CYAN_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(12), Blocks.LIGHT_BLUE_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(13), Blocks.BLUE_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(14), Blocks.PURPLE_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(15), Blocks.MAGENTA_TERRACOTTA);
                stonecuttables.put(terracottaStonecuttables.get(16), Blocks.PINK_TERRACOTTA);

                for (Map.Entry<ItemConvertible[], ItemConvertible> entry : stonecuttables.entrySet()) {
                    for (ItemConvertible item : entry.getKey()) {
                        offerStonecuttingRecipe(BUILDING_BLOCKS, item, entry.getValue());
                    }
                }

                Map<ItemConvertible, ItemConvertible> stonecuttingSlabRecipes = new HashMap<>();

                stonecuttingSlabRecipes.put(GRANITE_BRICK_SLAB, GRANITE);
                stonecuttingSlabRecipes.put(DIORITE_BRICK_SLAB, DIORITE);
                stonecuttingSlabRecipes.put(ANDESITE_BRICK_SLAB, ANDESITE);

                stonecuttingSlabRecipes.put(GNEISS_BRICK_SLAB, StoneBlocks.GNEISS);
                stonecuttingSlabRecipes.put(SHALE_BRICK_SLAB, StoneBlocks.SHALE);
                stonecuttingSlabRecipes.put(LIMESTONE_BRICK_SLAB, StoneBlocks.LIMESTONE);
                stonecuttingSlabRecipes.put(MARBLE_BRICK_SLAB, StoneBlocks.MARBLE);
                stonecuttingSlabRecipes.put(GABBRO_BRICK_SLAB, StoneBlocks.GABBRO);
                stonecuttingSlabRecipes.put(PHYLLITE_BRICK_SLAB, StoneBlocks.PHYLLITE);

                stonecuttingSlabRecipes.put(POLISHED_CALCITE_SLAB, Blocks.CALCITE);
                stonecuttingSlabRecipes.put(CALCITE_BRICK_SLAB, Blocks.CALCITE);
                stonecuttingSlabRecipes.put(POLISHED_DRIPSTONE_SLAB, DRIPSTONE_BLOCK);
                stonecuttingSlabRecipes.put(DRIPSTONE_BRICK_SLAB, DRIPSTONE_BLOCK);
                stonecuttingSlabRecipes.put(QUARTZ_BRICK_SLAB, QUARTZ_BLOCK);

                stonecuttingSlabRecipes.put(AMETHYST_BRICK_SLAB, AMETHYST_BLOCK);
                stonecuttingSlabRecipes.put(DOLOMITE_BRICK_SLAB, StoneBlocks.DOLOMITE);
                stonecuttingSlabRecipes.put(GYPSUM_BRICK_SLAB, StoneBlocks.GYPSUM);
                stonecuttingSlabRecipes.put(AMETHYST_TILE_SLAB, AMETHYST_BLOCK);
                stonecuttingSlabRecipes.put(DOLOMITE_TILE_SLAB, StoneBlocks.DOLOMITE);
                stonecuttingSlabRecipes.put(GYPSUM_TILE_SLAB, StoneBlocks.GYPSUM);

                stonecuttingSlabRecipes.put(TERRACOTTA_BRICK_SLAB, Blocks.TERRACOTTA);
                stonecuttingSlabRecipes.put(WHITE_TERRACOTTA_BRICK_SLAB, Blocks.WHITE_TERRACOTTA);
                stonecuttingSlabRecipes.put(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
                stonecuttingSlabRecipes.put(GRAY_TERRACOTTA_BRICK_SLAB, Blocks.GRAY_TERRACOTTA);
                stonecuttingSlabRecipes.put(BLACK_TERRACOTTA_BRICK_SLAB, Blocks.BLACK_TERRACOTTA);
                stonecuttingSlabRecipes.put(BROWN_TERRACOTTA_BRICK_SLAB, Blocks.BROWN_TERRACOTTA);
                stonecuttingSlabRecipes.put(RED_TERRACOTTA_BRICK_SLAB, Blocks.RED_TERRACOTTA);
                stonecuttingSlabRecipes.put(ORANGE_TERRACOTTA_BRICK_SLAB, Blocks.ORANGE_TERRACOTTA);
                stonecuttingSlabRecipes.put(YELLOW_TERRACOTTA_BRICK_SLAB, Blocks.YELLOW_TERRACOTTA);
                stonecuttingSlabRecipes.put(LIME_TERRACOTTA_BRICK_SLAB, Blocks.LIME_TERRACOTTA);
                stonecuttingSlabRecipes.put(GREEN_TERRACOTTA_BRICK_SLAB, Blocks.GREEN_TERRACOTTA);
                stonecuttingSlabRecipes.put(CYAN_TERRACOTTA_BRICK_SLAB, Blocks.CYAN_TERRACOTTA);
                stonecuttingSlabRecipes.put(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
                stonecuttingSlabRecipes.put(BLUE_TERRACOTTA_BRICK_SLAB, Blocks.BLUE_TERRACOTTA);
                stonecuttingSlabRecipes.put(PURPLE_TERRACOTTA_BRICK_SLAB, Blocks.PURPLE_TERRACOTTA);
                stonecuttingSlabRecipes.put(MAGENTA_TERRACOTTA_BRICK_SLAB, Blocks.MAGENTA_TERRACOTTA);
                stonecuttingSlabRecipes.put(PINK_TERRACOTTA_BRICK_SLAB, Blocks.PINK_TERRACOTTA);

                for (Map.Entry<ItemConvertible, ItemConvertible> entry : stonecuttingSlabRecipes.entrySet()) {
                    offerStonecuttingRecipe(BUILDING_BLOCKS, entry.getKey(), entry.getValue(), 2);
                }

                Map<ItemConvertible, ItemConvertible> stonecuttingSlabRecipes2 = new HashMap<>();

                stonecuttingSlabRecipes2.put(GRANITE_BRICK_SLAB, POLISHED_GRANITE);
                stonecuttingSlabRecipes2.put(DIORITE_BRICK_SLAB, POLISHED_DIORITE);
                stonecuttingSlabRecipes2.put(ANDESITE_BRICK_SLAB, POLISHED_ANDESITE);

                stonecuttingSlabRecipes2.put(POLISHED_GNEISS_SLAB, StoneBlocks.GNEISS);
                stonecuttingSlabRecipes2.put(GNEISS_BRICK_SLAB, StoneBlocks.POLISHED_GNEISS);
                stonecuttingSlabRecipes2.put(POLISHED_SHALE_SLAB, StoneBlocks.SHALE);
                stonecuttingSlabRecipes2.put(SHALE_BRICK_SLAB, StoneBlocks.POLISHED_SHALE);
                stonecuttingSlabRecipes2.put(POLISHED_LIMESTONE_SLAB, StoneBlocks.LIMESTONE);
                stonecuttingSlabRecipes2.put(LIMESTONE_BRICK_SLAB, StoneBlocks.POLISHED_LIMESTONE);
                stonecuttingSlabRecipes2.put(POLISHED_MARBLE_SLAB, StoneBlocks.MARBLE);
                stonecuttingSlabRecipes2.put(MARBLE_BRICK_SLAB, StoneBlocks.POLISHED_MARBLE);
                stonecuttingSlabRecipes2.put(POLISHED_GABBRO_SLAB, StoneBlocks.GABBRO);
                stonecuttingSlabRecipes2.put(GABBRO_BRICK_SLAB, StoneBlocks.POLISHED_GABBRO);
                stonecuttingSlabRecipes2.put(POLISHED_PHYLLITE_SLAB, StoneBlocks.PHYLLITE);
                stonecuttingSlabRecipes2.put(PHYLLITE_BRICK_SLAB, StoneBlocks.POLISHED_PHYLLITE);

                stonecuttingSlabRecipes2.put(CALCITE_BRICK_SLAB, StoneBlocks.POLISHED_CALCITE);
                stonecuttingSlabRecipes2.put(DRIPSTONE_BRICK_SLAB, StoneBlocks.POLISHED_DRIPSTONE);

                stonecuttingSlabRecipes2.put(AMETHYST_TILE_SLAB, AMETHYST_BRICKS);
                stonecuttingSlabRecipes2.put(DOLOMITE_TILE_SLAB, DOLOMITE_BRICKS);
                stonecuttingSlabRecipes2.put(GYPSUM_TILE_SLAB, GYPSUM_BRICKS);

                for (Map.Entry<ItemConvertible, ItemConvertible> entry : stonecuttingSlabRecipes2.entrySet()) {
                    offerStonecuttingRecipe(BUILDING_BLOCKS, entry.getKey(), entry.getValue(), 2);
                }
            }

            // ` ---------------------------------------------------------------------------------------------------------------------------------------------------

            void generateLogRecipes(
                    TagKey<Item> logs, ItemConvertible planks, ItemConvertible log, ItemConvertible wood, ItemConvertible strippedLog, ItemConvertible strippedWood, ItemConvertible hangingSign
            ) {
                offerPlanksRecipe(planks, logs, 4);
                offerBarkBlockRecipe(wood, log);
                offerBarkBlockRecipe(strippedWood, strippedLog);
                offerHangingSignRecipe(hangingSign, strippedLog);
            }

            void generateRecipes(RecipeExporter exporter, BlockFamily blockFamily, boolean generateStonecuttingRecipes, BlockFamily.Variant... variants) {
                ItemConvertible baseBlock = blockFamily.getBaseBlock();
                for (BlockFamily.Variant variant : variants) {
                    switch (variant) {
                        case STAIRS ->
                                offerStairsRecipe(exporter, blockFamily.getVariant(STAIRS), baseBlock);
                        case SLAB -> {
                            offerSlabRecipe(BUILDING_BLOCKS, blockFamily.getVariant(SLAB), baseBlock);

                            if (generateStonecuttingRecipes) {
                                offerStonecuttingRecipe(BUILDING_BLOCKS, blockFamily.getVariant(SLAB), blockFamily.getBaseBlock(), 2);
                            }
                        }
                        case WALL ->
                                offerWallRecipe(BUILDING_BLOCKS, blockFamily.getVariant(WALL), baseBlock);
                        case FENCE ->
                                offerFenceRecipe(exporter, blockFamily.getVariant(FENCE), baseBlock);
                        case FENCE_GATE ->
                                offerFenceGateRecipe(exporter, blockFamily.getVariant(FENCE_GATE), baseBlock);
                        case DOOR ->
                                offerDoorRecipe(exporter, blockFamily.getVariant(DOOR), baseBlock);
                        case TRAPDOOR ->
                                offerTrapdoorRecipe(exporter, blockFamily.getVariant(TRAPDOOR), baseBlock);
                        case PRESSURE_PLATE ->
                                offerPressurePlateRecipe(blockFamily.getVariant(PRESSURE_PLATE), baseBlock);
                        case BUTTON ->
                                offerButtonRecipe(exporter, blockFamily.getVariant(BUTTON), baseBlock);
                        case CHISELED ->
                                offerChiseledBlockRecipe(BUILDING_BLOCKS, blockFamily.getVariant(CHISELED), blockFamily.getVariant(SLAB));
                        case CRACKED ->
                                offerCrackingRecipe(blockFamily.getVariant(CRACKED), baseBlock);
                        case SIGN ->
                                offerSignRecipe(exporter, blockFamily.getVariant(SIGN), baseBlock);
                        case POLISHED ->
                                offerPolishedStoneRecipe(BUILDING_BLOCKS, blockFamily.getVariant(POLISHED), baseBlock);
                    }

                    if (generateStonecuttingRecipes && variant != SLAB && variant != FENCE) {
                        offerStonecuttingRecipe(BUILDING_BLOCKS, blockFamily.getVariant(variant), blockFamily.getBaseBlock());
                    }
                }
            }

            // ` ------------------------------------------------------------------------------------------------------------------------------------------------------

            // * Recipe generators that don't exist for some reason

            public void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createFenceRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerFenceGateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createFenceGateRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerDoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createDoorRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerTrapdoorRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createTrapdoorRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerButtonRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createButtonRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerSignRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createSignRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
            }

            public void offerPillarRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
                createShaped(BUILDING_BLOCKS, output, 2)
                        .input('#', input)
                        .pattern("#")
                        .pattern("#")
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter);
            }

            public void offerCustomFenceRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible inputBlock, ItemConvertible inputItem) {
                createShaped(BUILDING_BLOCKS, output, 6)
                        .input('#', inputItem)
                        .input('W', inputBlock)
                        .pattern("W#W")
                        .pattern("W#W")
                        .criterion(hasItem(inputBlock), conditionsFromItem(inputBlock))
                        .offerTo(exporter);
            }
        };
    }

    // ` ------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void addToList(List<ItemConvertible[]> list, ItemConvertible item1, ItemConvertible item2) {
        list.add(new ItemConvertible[]{item1, item2});
    }

    @Override
    public String getName() {
        return "Overhaul Recipes";
    }
}
