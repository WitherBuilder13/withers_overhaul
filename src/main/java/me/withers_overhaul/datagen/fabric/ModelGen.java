package me.withers_overhaul.datagen.fabric;

import me.withers_overhaul.block.util.OverhaulBlockFamilies;
import me.withers_overhaul.registry.block.ColoredBlocks;
import me.withers_overhaul.registry.block.StoneBlocks;
import me.withers_overhaul.registry.block.WoodBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static me.withers_overhaul.block.util.OverhaulBlockFamilies.*;
import static me.withers_overhaul.registry.block.ColoredBlocks.*;
import static me.withers_overhaul.registry.block.NaturalBlocks.*;
import static me.withers_overhaul.registry.block.StoneBlocks.*;
import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.registry.item.BasicItems.*;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.client.data.BlockStateModelGenerator.createSingletonBlockState;
import static net.minecraft.client.data.BlockStateModelGenerator.createWeightedVariant;

public class ModelGen extends FabricModelProvider {
    public ModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        Block[] simpleCubeAllBlocks = {
                CRACKED_TUFF_BRICKS, CRACKED_BRICKS, CRACKED_MUD_BRICKS, CHISELED_MUD_BRICKS,
                CRACKED_PRISMARINE_BRICKS, CHISELED_PRISMARINE_BRICKS, CRACKED_RED_NETHER_BRICKS, CHISELED_RED_NETHER_BRICKS,

                GRANITE_COAL_ORE, DIORITE_COAL_ORE, ANDESITE_COAL_ORE, TUFF_COAL_ORE, GNEISS_COAL_ORE,
                SHALE_COAL_ORE, LIMESTONE_COAL_ORE, MARBLE_COAL_ORE, GABBRO_COAL_ORE, PHYLLITE_COAL_ORE,
                GRANITE_IRON_ORE, DIORITE_IRON_ORE, ANDESITE_IRON_ORE, TUFF_IRON_ORE, GNEISS_IRON_ORE,
                SHALE_IRON_ORE, LIMESTONE_IRON_ORE, MARBLE_IRON_ORE, GABBRO_IRON_ORE, PHYLLITE_IRON_ORE,
                GRANITE_COPPER_ORE, DIORITE_COPPER_ORE, ANDESITE_COPPER_ORE, TUFF_COPPER_ORE, GNEISS_COPPER_ORE,
                SHALE_COPPER_ORE, LIMESTONE_COPPER_ORE, MARBLE_COPPER_ORE, GABBRO_COPPER_ORE, PHYLLITE_COPPER_ORE,
                GRANITE_GOLD_ORE, DIORITE_GOLD_ORE, ANDESITE_GOLD_ORE, TUFF_GOLD_ORE, GNEISS_GOLD_ORE,
                SHALE_GOLD_ORE, LIMESTONE_GOLD_ORE, MARBLE_GOLD_ORE, GABBRO_GOLD_ORE, PHYLLITE_GOLD_ORE,
                GRANITE_REDSTONE_ORE, DIORITE_REDSTONE_ORE, ANDESITE_REDSTONE_ORE, TUFF_REDSTONE_ORE, GNEISS_REDSTONE_ORE,
                SHALE_REDSTONE_ORE, LIMESTONE_REDSTONE_ORE, MARBLE_REDSTONE_ORE, GABBRO_REDSTONE_ORE, PHYLLITE_REDSTONE_ORE,
                GRANITE_EMERALD_ORE, DIORITE_EMERALD_ORE, ANDESITE_EMERALD_ORE, TUFF_EMERALD_ORE, GNEISS_EMERALD_ORE,
                SHALE_EMERALD_ORE, LIMESTONE_EMERALD_ORE, MARBLE_EMERALD_ORE, GABBRO_EMERALD_ORE, PHYLLITE_EMERALD_ORE,
                GRANITE_LAPIS_ORE, DIORITE_LAPIS_ORE, ANDESITE_LAPIS_ORE, TUFF_LAPIS_ORE, GNEISS_LAPIS_ORE,
                SHALE_LAPIS_ORE, LIMESTONE_LAPIS_ORE, MARBLE_LAPIS_ORE, GABBRO_LAPIS_ORE, PHYLLITE_LAPIS_ORE,
                GRANITE_DIAMOND_ORE, DIORITE_DIAMOND_ORE, ANDESITE_DIAMOND_ORE, TUFF_DIAMOND_ORE, GNEISS_DIAMOND_ORE,
                SHALE_DIAMOND_ORE, LIMESTONE_DIAMOND_ORE, MARBLE_DIAMOND_ORE, GABBRO_DIAMOND_ORE, PHYLLITE_DIAMOND_ORE,

                FROSTED_SAND, CHARRED_SAND,

                WALNUT_LEAVES, CHESTNUT_LEAVES, CEDAR_LEAVES, REDWOOD_LEAVES, FIR_LEAVES, HEMLOCK_LEAVES, HOLLY_LEAVES,
                PINE_LEAVES, LARCH_LEAVES, ASPEN_LEAVES, SAKURA_LEAVES, MAGNOLIA_LEAVES, FLOWERING_MAGNOLIA_LEAVES, JACARANDA_LEAVES
        };

        for (Block simpleCubeAllBlock : simpleCubeAllBlocks) blockStateModelGenerator.registerSimpleCubeAll(simpleCubeAllBlock);

        Map<Block, Block> logBlocks = new HashMap<>();

        logBlocks.put(MAPLE_LOG, MAPLE_WOOD);
        logBlocks.put(POPLAR_LOG, POPLAR_WOOD);
        logBlocks.put(BEECH_LOG, BEECH_WOOD);
        logBlocks.put(HICKORY_LOG, HICKORY_WOOD);
        logBlocks.put(WALNUT_LOG, WALNUT_WOOD);
        logBlocks.put(CHESTNUT_LOG, CHESTNUT_WOOD);
        logBlocks.put(CEDAR_LOG, CEDAR_WOOD);
        logBlocks.put(REDWOOD_LOG, REDWOOD_WOOD);
        logBlocks.put(FIR_LOG, FIR_WOOD);
        logBlocks.put(HEMLOCK_LOG, HEMLOCK_WOOD);
        logBlocks.put(HOLLY_LOG, HOLLY_WOOD);
        logBlocks.put(PINE_LOG, PINE_WOOD);
        logBlocks.put(LARCH_LOG, LARCH_WOOD);
        logBlocks.put(ASPEN_LOG, ASPEN_WOOD);
        logBlocks.put(KAPOK_LOG, KAPOK_WOOD);
        logBlocks.put(MAHOGANY_LOG, MAHOGANY_WOOD);
        logBlocks.put(EUCALYPTUS_LOG, EUCALYPTUS_WOOD);
        logBlocks.put(BAOBAB_LOG, BAOBAB_WOOD);
        logBlocks.put(PALO_VERDE_LOG, PALO_VERDE_WOOD);
        logBlocks.put(JOSHUA_LOG, JOSHUA_WOOD);
        logBlocks.put(JUNIPER_LOG, JUNIPER_WOOD);
        logBlocks.put(PALM_LOG, PALM_WOOD);
        logBlocks.put(EBONY_LOG, EBONY_WOOD);
        logBlocks.put(TEAK_LOG, TEAK_WOOD);
        logBlocks.put(ELM_LOG, ELM_WOOD);
        logBlocks.put(WILLOW_LOG, WILLOW_WOOD);
        logBlocks.put(CYPRESS_LOG, CYPRESS_WOOD);
        logBlocks.put(SAKURA_LOG, SAKURA_WOOD);
        logBlocks.put(MAGNOLIA_LOG, MAGNOLIA_WOOD);
        logBlocks.put(JACARANDA_LOG, JACARANDA_WOOD);

        logBlocks.put(STRIPPED_MAPLE_LOG, STRIPPED_MAPLE_WOOD);
        logBlocks.put(STRIPPED_POPLAR_LOG, STRIPPED_POPLAR_WOOD);
        logBlocks.put(STRIPPED_BEECH_LOG, STRIPPED_BEECH_WOOD);
        logBlocks.put(STRIPPED_HICKORY_LOG, STRIPPED_HICKORY_WOOD);
        logBlocks.put(STRIPPED_WALNUT_LOG, STRIPPED_WALNUT_WOOD);
        logBlocks.put(STRIPPED_CHESTNUT_LOG, STRIPPED_CHESTNUT_WOOD);
        logBlocks.put(STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
        logBlocks.put(STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
        logBlocks.put(STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
        logBlocks.put(STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
        logBlocks.put(STRIPPED_HOLLY_LOG, STRIPPED_HOLLY_WOOD);
        logBlocks.put(STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
        logBlocks.put(STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
        logBlocks.put(STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD);
        logBlocks.put(STRIPPED_KAPOK_LOG, STRIPPED_KAPOK_WOOD);
        logBlocks.put(STRIPPED_MAHOGANY_LOG, STRIPPED_MAHOGANY_WOOD);
        logBlocks.put(STRIPPED_EUCALYPTUS_LOG, STRIPPED_EUCALYPTUS_WOOD);
        logBlocks.put(STRIPPED_BAOBAB_LOG, STRIPPED_BAOBAB_WOOD);
        logBlocks.put(STRIPPED_PALO_VERDE_LOG, STRIPPED_PALO_VERDE_WOOD);
        logBlocks.put(STRIPPED_JOSHUA_LOG, STRIPPED_JOSHUA_WOOD);
        logBlocks.put(STRIPPED_JUNIPER_LOG, STRIPPED_JUNIPER_WOOD);
        logBlocks.put(STRIPPED_PALM_LOG, STRIPPED_PALM_WOOD);
        logBlocks.put(STRIPPED_EBONY_LOG, STRIPPED_EBONY_WOOD);
        logBlocks.put(STRIPPED_TEAK_LOG, STRIPPED_TEAK_WOOD);
        logBlocks.put(STRIPPED_ELM_LOG, STRIPPED_ELM_WOOD);
        logBlocks.put(STRIPPED_WILLOW_LOG, STRIPPED_WILLOW_WOOD);
        logBlocks.put(STRIPPED_CYPRESS_LOG, STRIPPED_CYPRESS_WOOD);
        logBlocks.put(STRIPPED_SAKURA_LOG, STRIPPED_SAKURA_WOOD);
        logBlocks.put(STRIPPED_MAGNOLIA_LOG, STRIPPED_MAGNOLIA_WOOD);
        logBlocks.put(STRIPPED_JACARANDA_LOG, STRIPPED_JACARANDA_WOOD);

        for (Map.Entry<Block, Block> entry : logBlocks.entrySet()) blockStateModelGenerator.createLogTexturePool(entry.getKey()).log(entry.getKey()).wood(entry.getValue());

        Block[] pillarBlocks = {
                STONE_BRICK_PILLAR, GRANITE_BRICK_PILLAR, DIORITE_BRICK_PILLAR, ANDESITE_BRICK_PILLAR, GNEISS_BRICK_PILLAR,
                SHALE_BRICK_PILLAR, LIMESTONE_BRICK_PILLAR, MARBLE_BRICK_PILLAR, GABBRO_BRICK_PILLAR, PHYLLITE_BRICK_PILLAR
        };

        for (Block pillarBlock : pillarBlocks) blockStateModelGenerator.registerAxisRotated(pillarBlock, TexturedModel.CUBE_COLUMN);

        Map<Block, BlockFamily> blockFamilies = new HashMap<>();

        blockFamilies.put(MAPLE_PLANKS, MAPLE);
        blockFamilies.put(POPLAR_PLANKS, POPLAR);
        blockFamilies.put(BEECH_PLANKS, BEECH);
        blockFamilies.put(HICKORY_PLANKS, HICKORY);
        blockFamilies.put(WALNUT_PLANKS, WALNUT);
        blockFamilies.put(CHESTNUT_PLANKS, CHESTNUT);
        blockFamilies.put(CEDAR_PLANKS, CEDAR);
        blockFamilies.put(REDWOOD_PLANKS, REDWOOD);
        blockFamilies.put(FIR_PLANKS, FIR);
        blockFamilies.put(HEMLOCK_PLANKS, HEMLOCK);
        blockFamilies.put(HOLLY_PLANKS, HOLLY);
        blockFamilies.put(PINE_PLANKS, PINE);
        blockFamilies.put(LARCH_PLANKS, LARCH);
        blockFamilies.put(ASPEN_PLANKS, ASPEN);
        blockFamilies.put(KAPOK_PLANKS, KAPOK);
        blockFamilies.put(MAHOGANY_PLANKS, MAHOGANY);
        blockFamilies.put(EUCALYPTUS_PLANKS, EUCALYPTUS);
        blockFamilies.put(BAOBAB_PLANKS, BAOBAB);
        blockFamilies.put(PALO_VERDE_PLANKS, PALO_VERDE);
        blockFamilies.put(JOSHUA_PLANKS, JOSHUA);
        blockFamilies.put(JUNIPER_PLANKS, JUNIPER);
        blockFamilies.put(PALM_PLANKS, PALM);
        blockFamilies.put(EBONY_PLANKS, EBONY);
        blockFamilies.put(TEAK_PLANKS, TEAK);
        blockFamilies.put(ELM_PLANKS, ELM);
        blockFamilies.put(WILLOW_PLANKS, WILLOW);
        blockFamilies.put(CYPRESS_PLANKS, CYPRESS);
        blockFamilies.put(SAKURA_PLANKS, SAKURA);
        blockFamilies.put(MAGNOLIA_PLANKS, MAGNOLIA);
        blockFamilies.put(JACARANDA_PLANKS, JACARANDA);

        blockFamilies.put(GRANITE_BRICKS, GRANITE_BRICK);
        blockFamilies.put(MOSSY_GRANITE_BRICKS, MOSSY_GRANITE_BRICK);
        blockFamilies.put(DIORITE_BRICKS, DIORITE_BRICK);
        blockFamilies.put(MOSSY_DIORITE_BRICKS, MOSSY_DIORITE_BRICK);
        blockFamilies.put(ANDESITE_BRICKS, ANDESITE_BRICK);
        blockFamilies.put(MOSSY_ANDESITE_BRICKS, MOSSY_ANDESITE_BRICK);

        blockFamilies.put(StoneBlocks.GNEISS, OverhaulBlockFamilies.GNEISS);
        blockFamilies.put(StoneBlocks.POLISHED_GNEISS, OverhaulBlockFamilies.POLISHED_GNEISS);
        blockFamilies.put(GNEISS_BRICKS, GNEISS_BRICK);
        blockFamilies.put(MOSSY_GNEISS_BRICKS, MOSSY_GNEISS_BRICK);
        blockFamilies.put(StoneBlocks.SHALE, OverhaulBlockFamilies.SHALE);
        blockFamilies.put(StoneBlocks.POLISHED_SHALE, OverhaulBlockFamilies.POLISHED_SHALE);
        blockFamilies.put(SHALE_BRICKS, SHALE_BRICK);
        blockFamilies.put(MOSSY_SHALE_BRICKS, MOSSY_SHALE_BRICK);
        blockFamilies.put(StoneBlocks.LIMESTONE, OverhaulBlockFamilies.LIMESTONE);
        blockFamilies.put(StoneBlocks.POLISHED_LIMESTONE, OverhaulBlockFamilies.POLISHED_LIMESTONE);
        blockFamilies.put(LIMESTONE_BRICKS, LIMESTONE_BRICK);
        blockFamilies.put(MOSSY_LIMESTONE_BRICKS, MOSSY_LIMESTONE_BRICK);
        blockFamilies.put(StoneBlocks.MARBLE, OverhaulBlockFamilies.MARBLE);
        blockFamilies.put(StoneBlocks.POLISHED_MARBLE, OverhaulBlockFamilies.POLISHED_MARBLE);
        blockFamilies.put(MARBLE_BRICKS, MARBLE_BRICK);
        blockFamilies.put(MOSSY_MARBLE_BRICKS, MOSSY_MARBLE_BRICK);
        blockFamilies.put(StoneBlocks.GABBRO, OverhaulBlockFamilies.GABBRO);
        blockFamilies.put(StoneBlocks.POLISHED_GABBRO, OverhaulBlockFamilies.POLISHED_GABBRO);
        blockFamilies.put(GABBRO_BRICKS, GABBRO_BRICK);
        blockFamilies.put(MOSSY_GABBRO_BRICKS, MOSSY_GABBRO_BRICK);
        blockFamilies.put(StoneBlocks.PHYLLITE, OverhaulBlockFamilies.PHYLLITE);
        blockFamilies.put(StoneBlocks.POLISHED_PHYLLITE, OverhaulBlockFamilies.POLISHED_PHYLLITE);
        blockFamilies.put(PHYLLITE_BRICKS, PHYLLITE_BRICK);
        blockFamilies.put(MOSSY_PHYLLITE_BRICKS, MOSSY_PHYLLITE_BRICK);

        blockFamilies.put(Blocks.CALCITE, OverhaulBlockFamilies.CALCITE);
        blockFamilies.put(StoneBlocks.POLISHED_CALCITE, OverhaulBlockFamilies.POLISHED_CALCITE);
        blockFamilies.put(CALCITE_BRICKS, CALCITE_BRICK);
        blockFamilies.put(DRIPSTONE_BLOCK, DRIPSTONE);
        blockFamilies.put(StoneBlocks.POLISHED_DRIPSTONE, OverhaulBlockFamilies.POLISHED_DRIPSTONE);
        blockFamilies.put(DRIPSTONE_BRICKS, DRIPSTONE_BRICK);
        blockFamilies.put(StoneBlocks.ROUGH_SANDSTONE, OverhaulBlockFamilies.ROUGH_SANDSTONE);
        blockFamilies.put(StoneBlocks.ROUGH_RED_SANDSTONE, OverhaulBlockFamilies.ROUGH_RED_SANDSTONE);
        blockFamilies.put(StoneBlocks.SMOOTH_FROSTED_SANDSTONE, OverhaulBlockFamilies.SMOOTH_FROSTED_SANDSTONE);
        blockFamilies.put(StoneBlocks.ROUGH_FROSTED_SANDSTONE, OverhaulBlockFamilies.ROUGH_FROSTED_SANDSTONE);
        blockFamilies.put(StoneBlocks.SMOOTH_CHARRED_SANDSTONE, OverhaulBlockFamilies.SMOOTH_CHARRED_SANDSTONE);
        blockFamilies.put(StoneBlocks.ROUGH_CHARRED_SANDSTONE, OverhaulBlockFamilies.ROUGH_CHARRED_SANDSTONE);
        blockFamilies.put(BLUE_NETHER_BRICKS, BLUE_NETHER_BRICK);
        blockFamilies.put(QUARTZ_BRICKS, QUARTZ_BRICK);

        blockFamilies.put(AMETHYST_BLOCK, AMETHYST);
        blockFamilies.put(AMETHYST_BRICKS, AMETHYST_BRICK);
        blockFamilies.put(AMETHYST_TILES, AMETHYST_TILE);
        blockFamilies.put(StoneBlocks.DOLOMITE, OverhaulBlockFamilies.DOLOMITE);
        blockFamilies.put(DOLOMITE_BRICKS, DOLOMITE_BRICK);
        blockFamilies.put(DOLOMITE_TILES, DOLOMITE_TILE);
        blockFamilies.put(StoneBlocks.GYPSUM, OverhaulBlockFamilies.GYPSUM);
        blockFamilies.put(GYPSUM_BRICKS, GYPSUM_BRICK);
        blockFamilies.put(GYPSUM_TILES, GYPSUM_TILE);

        blockFamilies.put(Blocks.WHITE_CONCRETE, OverhaulBlockFamilies.WHITE_CONCRETE);
        blockFamilies.put(Blocks.LIGHT_GRAY_CONCRETE, OverhaulBlockFamilies.LIGHT_GRAY_CONCRETE);
        blockFamilies.put(Blocks.GRAY_CONCRETE, OverhaulBlockFamilies.GRAY_CONCRETE);
        blockFamilies.put(Blocks.BLACK_CONCRETE, OverhaulBlockFamilies.BLACK_CONCRETE);
        blockFamilies.put(Blocks.BROWN_CONCRETE, OverhaulBlockFamilies.BROWN_CONCRETE);
        blockFamilies.put(Blocks.RED_CONCRETE, OverhaulBlockFamilies.RED_CONCRETE);
        blockFamilies.put(Blocks.ORANGE_CONCRETE, OverhaulBlockFamilies.ORANGE_CONCRETE);
        blockFamilies.put(Blocks.YELLOW_CONCRETE, OverhaulBlockFamilies.YELLOW_CONCRETE);
        blockFamilies.put(Blocks.LIME_CONCRETE, OverhaulBlockFamilies.LIME_CONCRETE);
        blockFamilies.put(Blocks.GREEN_CONCRETE, OverhaulBlockFamilies.GREEN_CONCRETE);
        blockFamilies.put(Blocks.CYAN_CONCRETE, OverhaulBlockFamilies.CYAN_CONCRETE);
        blockFamilies.put(Blocks.LIGHT_BLUE_CONCRETE, OverhaulBlockFamilies.LIGHT_BLUE_CONCRETE);
        blockFamilies.put(Blocks.BLUE_CONCRETE, OverhaulBlockFamilies.BLUE_CONCRETE);
        blockFamilies.put(Blocks.PURPLE_CONCRETE, OverhaulBlockFamilies.PURPLE_CONCRETE);
        blockFamilies.put(Blocks.MAGENTA_CONCRETE, OverhaulBlockFamilies.MAGENTA_CONCRETE);
        blockFamilies.put(Blocks.PINK_CONCRETE, OverhaulBlockFamilies.PINK_CONCRETE);

        blockFamilies.put(Blocks.TERRACOTTA, OverhaulBlockFamilies.TERRACOTTA);
        blockFamilies.put(Blocks.WHITE_TERRACOTTA, OverhaulBlockFamilies.WHITE_TERRACOTTA);
        blockFamilies.put(Blocks.LIGHT_GRAY_TERRACOTTA, OverhaulBlockFamilies.LIGHT_GRAY_TERRACOTTA);
        blockFamilies.put(Blocks.GRAY_TERRACOTTA, OverhaulBlockFamilies.GRAY_TERRACOTTA);
        blockFamilies.put(Blocks.BLACK_TERRACOTTA, OverhaulBlockFamilies.BLACK_TERRACOTTA);
        blockFamilies.put(Blocks.BROWN_TERRACOTTA, OverhaulBlockFamilies.BROWN_TERRACOTTA);
        blockFamilies.put(Blocks.RED_TERRACOTTA, OverhaulBlockFamilies.RED_TERRACOTTA);
        blockFamilies.put(Blocks.ORANGE_TERRACOTTA, OverhaulBlockFamilies.ORANGE_TERRACOTTA);
        blockFamilies.put(Blocks.YELLOW_TERRACOTTA, OverhaulBlockFamilies.YELLOW_TERRACOTTA);
        blockFamilies.put(Blocks.LIME_TERRACOTTA, OverhaulBlockFamilies.LIME_TERRACOTTA);
        blockFamilies.put(Blocks.GREEN_TERRACOTTA, OverhaulBlockFamilies.GREEN_TERRACOTTA);
        blockFamilies.put(Blocks.CYAN_TERRACOTTA, OverhaulBlockFamilies.CYAN_TERRACOTTA);
        blockFamilies.put(Blocks.LIGHT_BLUE_TERRACOTTA, OverhaulBlockFamilies.LIGHT_BLUE_TERRACOTTA);
        blockFamilies.put(Blocks.BLUE_TERRACOTTA, OverhaulBlockFamilies.BLUE_TERRACOTTA);
        blockFamilies.put(Blocks.PURPLE_TERRACOTTA, OverhaulBlockFamilies.PURPLE_TERRACOTTA);
        blockFamilies.put(Blocks.MAGENTA_TERRACOTTA, OverhaulBlockFamilies.MAGENTA_TERRACOTTA);
        blockFamilies.put(Blocks.PINK_TERRACOTTA, OverhaulBlockFamilies.PINK_TERRACOTTA);

        blockFamilies.put(TERRACOTTA_BRICKS, TERRACOTTA_BRICK);
        blockFamilies.put(WHITE_TERRACOTTA_BRICKS, WHITE_TERRACOTTA_BRICK);
        blockFamilies.put(LIGHT_GRAY_TERRACOTTA_BRICKS, LIGHT_GRAY_TERRACOTTA_BRICK);
        blockFamilies.put(GRAY_TERRACOTTA_BRICKS, GRAY_TERRACOTTA_BRICK);
        blockFamilies.put(BLACK_TERRACOTTA_BRICKS, BLACK_TERRACOTTA_BRICK);
        blockFamilies.put(BROWN_TERRACOTTA_BRICKS, BROWN_TERRACOTTA_BRICK);
        blockFamilies.put(RED_TERRACOTTA_BRICKS, RED_TERRACOTTA_BRICK);
        blockFamilies.put(ORANGE_TERRACOTTA_BRICKS, ORANGE_TERRACOTTA_BRICK);
        blockFamilies.put(YELLOW_TERRACOTTA_BRICKS, YELLOW_TERRACOTTA_BRICK);
        blockFamilies.put(LIME_TERRACOTTA_BRICKS, LIME_TERRACOTTA_BRICK);
        blockFamilies.put(GREEN_TERRACOTTA_BRICKS, GREEN_TERRACOTTA_BRICK);
        blockFamilies.put(CYAN_TERRACOTTA_BRICKS, CYAN_TERRACOTTA_BRICK);
        blockFamilies.put(LIGHT_BLUE_TERRACOTTA_BRICKS, LIGHT_BLUE_TERRACOTTA_BRICK);
        blockFamilies.put(BLUE_TERRACOTTA_BRICKS, BLUE_TERRACOTTA_BRICK);
        blockFamilies.put(PURPLE_TERRACOTTA_BRICKS, PURPLE_TERRACOTTA_BRICK);
        blockFamilies.put(MAGENTA_TERRACOTTA_BRICKS, MAGENTA_TERRACOTTA_BRICK);
        blockFamilies.put(PINK_TERRACOTTA_BRICKS, PINK_TERRACOTTA_BRICK);

        blockFamilies.put(ColoredBlocks.CHALK, OverhaulBlockFamilies.CHALK);
        blockFamilies.put(ColoredBlocks.WHITE_CHALK, OverhaulBlockFamilies.WHITE_CHALK);
        blockFamilies.put(ColoredBlocks.LIGHT_GRAY_CHALK, OverhaulBlockFamilies.LIGHT_GRAY_CHALK);
        blockFamilies.put(ColoredBlocks.GRAY_CHALK, OverhaulBlockFamilies.GRAY_CHALK);
        blockFamilies.put(ColoredBlocks.BLACK_CHALK, OverhaulBlockFamilies.BLACK_CHALK);
        blockFamilies.put(ColoredBlocks.BROWN_CHALK, OverhaulBlockFamilies.BROWN_CHALK);
        blockFamilies.put(ColoredBlocks.RED_CHALK, OverhaulBlockFamilies.RED_CHALK);
        blockFamilies.put(ColoredBlocks.ORANGE_CHALK, OverhaulBlockFamilies.ORANGE_CHALK);
        blockFamilies.put(ColoredBlocks.YELLOW_CHALK, OverhaulBlockFamilies.YELLOW_CHALK);
        blockFamilies.put(ColoredBlocks.LIME_CHALK, OverhaulBlockFamilies.LIME_CHALK);
        blockFamilies.put(ColoredBlocks.GREEN_CHALK, OverhaulBlockFamilies.GREEN_CHALK);
        blockFamilies.put(ColoredBlocks.CYAN_CHALK, OverhaulBlockFamilies.CYAN_CHALK);
        blockFamilies.put(ColoredBlocks.LIGHT_BLUE_CHALK, OverhaulBlockFamilies.LIGHT_BLUE_CHALK);
        blockFamilies.put(ColoredBlocks.BLUE_CHALK, OverhaulBlockFamilies.BLUE_CHALK);
        blockFamilies.put(ColoredBlocks.PURPLE_CHALK, OverhaulBlockFamilies.PURPLE_CHALK);
        blockFamilies.put(ColoredBlocks.MAGENTA_CHALK, OverhaulBlockFamilies.MAGENTA_CHALK);
        blockFamilies.put(ColoredBlocks.PINK_CHALK, OverhaulBlockFamilies.PINK_CHALK);

        blockFamilies.put(CHALK_BRICKS, CHALK_BRICK);
        blockFamilies.put(WHITE_CHALK_BRICKS, WHITE_CHALK_BRICK);
        blockFamilies.put(LIGHT_GRAY_CHALK_BRICKS, LIGHT_GRAY_CHALK_BRICK);
        blockFamilies.put(GRAY_CHALK_BRICKS, GRAY_CHALK_BRICK);
        blockFamilies.put(BLACK_CHALK_BRICKS, BLACK_CHALK_BRICK);
        blockFamilies.put(BROWN_CHALK_BRICKS, BROWN_CHALK_BRICK);
        blockFamilies.put(RED_CHALK_BRICKS, RED_CHALK_BRICK);
        blockFamilies.put(ORANGE_CHALK_BRICKS, ORANGE_CHALK_BRICK);
        blockFamilies.put(YELLOW_CHALK_BRICKS, YELLOW_CHALK_BRICK);
        blockFamilies.put(LIME_CHALK_BRICKS, LIME_CHALK_BRICK);
        blockFamilies.put(GREEN_CHALK_BRICKS, GREEN_CHALK_BRICK);
        blockFamilies.put(CYAN_CHALK_BRICKS, CYAN_CHALK_BRICK);
        blockFamilies.put(LIGHT_BLUE_CHALK_BRICKS, LIGHT_BLUE_CHALK_BRICK);
        blockFamilies.put(BLUE_CHALK_BRICKS, BLUE_CHALK_BRICK);
        blockFamilies.put(PURPLE_CHALK_BRICKS, PURPLE_CHALK_BRICK);
        blockFamilies.put(MAGENTA_CHALK_BRICKS, MAGENTA_CHALK_BRICK);
        blockFamilies.put(PINK_CHALK_BRICKS, PINK_CHALK_BRICK);

        for (Map.Entry<Block, BlockFamily> entry : blockFamilies.entrySet()) blockStateModelGenerator.registerCubeAllModelTexturePool(entry.getKey()).family(entry.getValue());

        List<Block[]> hangingSigns = new ArrayList<>();

        hangingSigns.add(new Block[]{STRIPPED_MAPLE_LOG, WoodBlocks.MAPLE_HANGING_SIGN, MAPLE_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_POPLAR_LOG, WoodBlocks.POPLAR_HANGING_SIGN, POPLAR_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_BEECH_LOG, WoodBlocks.BEECH_HANGING_SIGN, BEECH_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_HICKORY_LOG, WoodBlocks.HICKORY_HANGING_SIGN, HICKORY_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_WALNUT_LOG, WoodBlocks.WALNUT_HANGING_SIGN, WALNUT_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_CHESTNUT_LOG, WoodBlocks.CHESTNUT_HANGING_SIGN, CHESTNUT_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_CEDAR_LOG, WoodBlocks.CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_REDWOOD_LOG, WoodBlocks.REDWOOD_HANGING_SIGN, REDWOOD_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_FIR_LOG, WoodBlocks.FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_HEMLOCK_LOG, WoodBlocks.HEMLOCK_HANGING_SIGN, HEMLOCK_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_HOLLY_LOG, WoodBlocks.HOLLY_HANGING_SIGN, HOLLY_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_PINE_LOG, WoodBlocks.PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_LARCH_LOG, WoodBlocks.LARCH_HANGING_SIGN, LARCH_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_ASPEN_LOG, WoodBlocks.ASPEN_HANGING_SIGN, ASPEN_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_KAPOK_LOG, WoodBlocks.KAPOK_HANGING_SIGN, KAPOK_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_MAHOGANY_LOG, WoodBlocks.MAHOGANY_HANGING_SIGN, MAHOGANY_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_EUCALYPTUS_LOG, WoodBlocks.EUCALYPTUS_HANGING_SIGN, EUCALYPTUS_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_BAOBAB_LOG, WoodBlocks.BAOBAB_HANGING_SIGN, BAOBAB_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_PALO_VERDE_LOG, WoodBlocks.PALO_VERDE_HANGING_SIGN, PALO_VERDE_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_JOSHUA_LOG, WoodBlocks.JOSHUA_HANGING_SIGN, JOSHUA_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_JUNIPER_LOG, WoodBlocks.JUNIPER_HANGING_SIGN, JUNIPER_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_PALM_LOG, WoodBlocks.PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_EBONY_LOG, WoodBlocks.EBONY_HANGING_SIGN, EBONY_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_TEAK_LOG, WoodBlocks.TEAK_HANGING_SIGN, TEAK_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_ELM_LOG, WoodBlocks.ELM_HANGING_SIGN, ELM_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_WILLOW_LOG, WoodBlocks.WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_CYPRESS_LOG, WoodBlocks.CYPRESS_HANGING_SIGN, CYPRESS_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_SAKURA_LOG, WoodBlocks.SAKURA_HANGING_SIGN, SAKURA_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_MAGNOLIA_LOG, WoodBlocks.MAGNOLIA_HANGING_SIGN, MAGNOLIA_WALL_HANGING_SIGN});
        hangingSigns.add(new Block[]{STRIPPED_JACARANDA_LOG, WoodBlocks.JACARANDA_HANGING_SIGN, JACARANDA_WALL_HANGING_SIGN});

        for (Block[] hangingSign : hangingSigns) blockStateModelGenerator.registerHangingSign(hangingSign[0], hangingSign[1], hangingSign[2]);

        Block[] tintedLeaves = {
                MAPLE_LEAVES, POPLAR_LEAVES, BEECH_LEAVES, HICKORY_LEAVES, KAPOK_LEAVES, MAHOGANY_LEAVES, EUCALYPTUS_LEAVES, BAOBAB_LEAVES, PALO_VERDE_LEAVES,
                JOSHUA_LEAVES, JUNIPER_LEAVES, PALM_LEAVES, EBONY_LEAVES, TEAK_LEAVES, ELM_LEAVES, WILLOW_LEAVES, CYPRESS_LEAVES
        };

        for (Block leaf : tintedLeaves) blockStateModelGenerator.registerSingleton(leaf, TexturedModel.LEAVES);

        Map<Block, Block> saplings = new HashMap<>();

        saplings.put(MAPLE_SAPLING, POTTED_MAPLE_SAPLING);
        saplings.put(POPLAR_SAPLING, POTTED_POPLAR_SAPLING);
        saplings.put(BEECH_SAPLING, POTTED_BEECH_SAPLING);
        saplings.put(HICKORY_SAPLING, POTTED_HICKORY_SAPLING);
        saplings.put(WALNUT_SAPLING, POTTED_WALNUT_SAPLING);
        saplings.put(CHESTNUT_SAPLING, POTTED_CHESTNUT_SAPLING);
        saplings.put(CEDAR_SAPLING, POTTED_CEDAR_SAPLING);
        saplings.put(REDWOOD_SAPLING, POTTED_REDWOOD_SAPLING);
        saplings.put(FIR_SAPLING, POTTED_FIR_SAPLING);
        saplings.put(HEMLOCK_SAPLING, POTTED_HEMLOCK_SAPLING);
        saplings.put(HOLLY_SAPLING, POTTED_HOLLY_SAPLING);
        saplings.put(PINE_SAPLING, POTTED_PINE_SAPLING);
        saplings.put(LARCH_SAPLING, POTTED_LARCH_SAPLING);
        saplings.put(ASPEN_SAPLING, POTTED_ASPEN_SAPLING);
        saplings.put(KAPOK_SAPLING, POTTED_KAPOK_SAPLING);
        saplings.put(MAHOGANY_SAPLING, POTTED_MAHOGANY_SAPLING);
        saplings.put(EUCALYPTUS_SAPLING, POTTED_EUCALYPTUS_SAPLING);
        saplings.put(BAOBAB_SAPLING, POTTED_BAOBAB_SAPLING);
        saplings.put(PALO_VERDE_SAPLING, POTTED_PALO_VERDE_SAPLING);
        saplings.put(JOSHUA_SAPLING, POTTED_JOSHUA_SAPLING);
        saplings.put(JUNIPER_SAPLING, POTTED_JUNIPER_SAPLING);
        saplings.put(PALM_SAPLING, POTTED_PALM_SAPLING);
        saplings.put(EBONY_SAPLING, POTTED_EBONY_SAPLING);
        saplings.put(TEAK_SAPLING, POTTED_TEAK_SAPLING);
        saplings.put(ELM_SAPLING, POTTED_ELM_SAPLING);
        saplings.put(WILLOW_SAPLING, POTTED_WILLOW_SAPLING);
        saplings.put(CYPRESS_SAPLING, POTTED_CYPRESS_SAPLING);
        saplings.put(SAKURA_SAPLING, POTTED_SAKURA_SAPLING);
        saplings.put(MAGNOLIA_SAPLING, POTTED_MAGNOLIA_SAPLING);
        saplings.put(FLOWERING_MAGNOLIA_SAPLING, POTTED_FLOWERING_MAGNOLIA_SAPLING);
        saplings.put(JACARANDA_SAPLING, POTTED_JACARANDA_SAPLING);

        for (Map.Entry<Block, Block> sapling : saplings.entrySet()) blockStateModelGenerator.registerFlowerPotPlantAndItem(sapling.getKey(), sapling.getValue(), BlockStateModelGenerator.CrossType.NOT_TINTED);

        Block[] crops = {ARTICHOKES, BROCCOLI, CABBAGE, CANTALOUPE, CAULIFLOWER, CELERY, CUCUMBERS, EGGPLANT, JALAPENOS, KALE, LETTUCE, ONIONS, RADISHES, SPINACH};

        for (Block crop : crops) blockStateModelGenerator.registerCrop(crop, Properties.AGE_7, 0, 0, 1, 1, 2, 2, 2, 3);

        blockStateModelGenerator.registerCubeAllModelTexturePool(STONE).wall(STONE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_STONE).stairs(SMOOTH_STONE_STAIRS).wall(SMOOTH_STONE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_GRANITE).wall(POLISHED_GRANITE_WALL).pressurePlate(POLISHED_GRANITE_PRESSURE_PLATE).button(POLISHED_GRANITE_BUTTON);
        blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_DIORITE).wall(POLISHED_DIORITE_WALL).pressurePlate(POLISHED_DIORITE_PRESSURE_PLATE).button(POLISHED_DIORITE_BUTTON);
        blockStateModelGenerator.registerCubeAllModelTexturePool(POLISHED_ANDESITE).wall(POLISHED_ANDESITE_WALL).pressurePlate(POLISHED_ANDESITE_PRESSURE_PLATE).button(POLISHED_ANDESITE_BUTTON);

        blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_SANDSTONE).wall(SMOOTH_SANDSTONE_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_RED_SANDSTONE).wall(SMOOTH_RED_SANDSTONE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(PRISMARINE_BRICKS).wall(PRISMARINE_BRICK_WALL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(DARK_PRISMARINE).wall(DARK_PRISMARINE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(RED_NETHER_BRICKS).fence(RED_NETHER_BRICK_FENCE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(SMOOTH_QUARTZ).wall(SMOOTH_QUARTZ_WALL);

        blockStateModelGenerator.registerSingleton(GOURD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotatable(CARVED_GOURD, TextureMap.sideEnd(GOURD));

        blockStateModelGenerator.registerTintableCrossBlockState(SHORT_PRAIRIE_GRASS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(SHORT_PRAIRIE_GRASS);
        blockStateModelGenerator.registerDoubleBlockAndItem(TALL_PRAIRIE_GRASS, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlockAndItem(CATTAIL, BlockStateModelGenerator.CrossType.NOT_TINTED);
        registerPeat(blockStateModelGenerator);
        blockStateModelGenerator.registerDoubleBlockAndItem(LAVENDER, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerbed(PURPLE_PETALS);
        blockStateModelGenerator.registerHangingMoss(HANGING_MOSS);
    }

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        Item[] simpleItems = {
                WARPED_WART, GOURD_SEEDS, PICKLE,

                APRICOT, AVOCADO, BANANA, CHERRY, DATE, FIG, GRAPEFRUIT, GUAVA, KIWI, KUMQUAT, LEMON, LIME, MANGO,
                NECTARINE, OLIVE, ORANGE, PEACH, PEAR, PERSIMMON, PLUM, POMEGRANATE, STARFRUIT, TANGERINE,

                RUNE_AQUA_AFFINITY, RUNE_BANE_OF_ARTHROPODS, RUNE_BLAST_PROTECTION, RUNE_BREACH, RUNE_CHANNELING, RUNE_DENSITY, RUNE_DEPTH_STRIDER, RUNE_EFFICIENCY,
                RUNE_FEATHER_FALLING, RUNE_FIRE_ASPECT, RUNE_FIRE_PROTECTION, RUNE_FLAME, RUNE_FORTUNE, RUNE_FROST_WALKER, RUNE_IMPALING, RUNE_INFINITY, RUNE_KNOCKBACK,
                RUNE_LOOTING, RUNE_LOYALTY, RUNE_LUCK_OF_THE_SEA, RUNE_LURE, RUNE_MENDING, RUNE_MULTISHOT, RUNE_PIERCING, RUNE_POWER, RUNE_PROJECTILE_PROTECTION,
                RUNE_PROTECTION, RUNE_PUNCH, RUNE_QUICK_CHARGE, RUNE_RESPIRATION, RUNE_RIPTIDE, RUNE_SHARPNESS, RUNE_SILK_TOUCH, RUNE_SMITE, RUNE_SOUL_SPEED,
                RUNE_SWEEPING_EDGE, RUNE_SWIFT_SNEAK, RUNE_THORNS, RUNE_UNBREAKING, RUNE_WIND_BURST
        };

        for (Item item : simpleItems) itemModelGenerator.register(item, Models.GENERATED);
    }

    private void registerPeat(BlockStateModelGenerator blockStateModelGenerator) {
        TextureMap textureMap = TextureMap.all(PEAT);
        WeightedVariant weightedVariant = createWeightedVariant(Models.CUBE_ALL.upload(PEAT_BLOCK, textureMap, blockStateModelGenerator.modelCollector));
        blockStateModelGenerator.blockStateCollector.accept(
                        VariantsBlockModelDefinitionCreator.of(PEAT).with(
                                        BlockStateVariantMap.models(Properties.LAYERS).generate(
                                                integer -> integer < 8 ? createWeightedVariant(ModelIds.getBlockSubModelId(PEAT, "_height" + integer * 2)) : weightedVariant
                                        )
                        )
        );
        blockStateModelGenerator.registerParentedItemModel(PEAT, ModelIds.getBlockSubModelId(PEAT, "_height2"));
        blockStateModelGenerator.blockStateCollector.accept(createSingletonBlockState(PEAT_BLOCK, weightedVariant));
    }
}
