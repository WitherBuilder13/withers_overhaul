package me.withers_overhaul.registry.block;

import me.withers_overhaul.WithersOverhaul;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static me.withers_overhaul.registry.block.OverhaulBlocks.keyOf;
import static me.withers_overhaul.registry.block.OverhaulBlocks.register;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.*;
import static net.minecraft.data.family.BlockFamily.Variant.*;

public class StoneBlocks {


    //STONE
    public static final Block STONE_WALL = registerStoneBlock("stone", WALL);
    public static final Block SMOOTH_STONE_STAIRS = registerStoneBlock("smooth_stone", STAIRS);
    public static final Block SMOOTH_STONE_WALL = registerStoneBlock("smooth_stone", WALL);
    public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(copy(STONE_BRICKS).registryKey(keyOf("stone_brick_pillar"))), true);

    //GRANITE
    public static final Block POLISHED_GRANITE_WALL = registerStoneBlock("polished_granite", WALL);
    public static final Block GRANITE_BRICKS = registerStoneBlock("granite_bricks");
    public static final Block CRACKED_GRANITE_BRICKS = registerStoneBlock("cracked_granite_bricks");
    public static final Block GRANITE_BRICK_STAIRS = registerStoneBlock("granite_brick", STAIRS);
    public static final Block GRANITE_BRICK_SLAB = registerStoneBlock("granite_brick", SLAB);
    public static final Block GRANITE_BRICK_WALL = registerStoneBlock("granite_brick", WALL);
    public static final Block MOSSY_GRANITE_BRICKS = registerStoneBlock("mossy_granite_bricks");
    public static final Block MOSSY_GRANITE_BRICK_STAIRS = registerStoneBlock("mossy_granite_brick", STAIRS);
    public static final Block MOSSY_GRANITE_BRICK_SLAB = registerStoneBlock("mossy_granite_brick", SLAB);
    public static final Block MOSSY_GRANITE_BRICK_WALL = registerStoneBlock("mossy_granite_brick", WALL);
    public static final Block GRANITE_BRICK_PILLAR = register("granite_brick_pillar", new PillarBlock(copy(GRANITE_BRICKS).registryKey(keyOf("granite_brick_pillar"))), true);
    public static final Block CHISELED_GRANITE_BRICKS = registerStoneBlock("chiseled_granite_bricks");
    public static final Block POLISHED_GRANITE_BUTTON = registerStoneBlock("polished_granite", BUTTON);
    public static final Block POLISHED_GRANITE_PRESSURE_PLATE = registerStoneBlock("polished_granite", PRESSURE_PLATE);

    //DIORITE
    public static final Block POLISHED_DIORITE_WALL = registerStoneBlock("polished_diorite", WALL);
    public static final Block DIORITE_BRICKS = registerStoneBlock("diorite_bricks");
    public static final Block CRACKED_DIORITE_BRICKS = registerStoneBlock("cracked_diorite_bricks");
    public static final Block DIORITE_BRICK_STAIRS = registerStoneBlock("diorite_brick", STAIRS);
    public static final Block DIORITE_BRICK_SLAB = registerStoneBlock("diorite_brick", SLAB);
    public static final Block DIORITE_BRICK_WALL = registerStoneBlock("diorite_brick", WALL);
    public static final Block MOSSY_DIORITE_BRICKS = registerStoneBlock("mossy_diorite_bricks");
    public static final Block MOSSY_DIORITE_BRICK_STAIRS = registerStoneBlock("mossy_diorite_brick", STAIRS);
    public static final Block MOSSY_DIORITE_BRICK_SLAB = registerStoneBlock("mossy_diorite_brick", SLAB);
    public static final Block MOSSY_DIORITE_BRICK_WALL = registerStoneBlock("mossy_diorite_brick", WALL);
    public static final Block DIORITE_BRICK_PILLAR = register("diorite_brick_pillar", new PillarBlock(copy(DIORITE_BRICKS).registryKey(keyOf("diorite_brick_pillar"))), true);
    public static final Block CHISELED_DIORITE_BRICKS = registerStoneBlock("chiseled_diorite_bricks");
    public static final Block POLISHED_DIORITE_BUTTON = registerStoneBlock("polished_diorite", BUTTON);
    public static final Block POLISHED_DIORITE_PRESSURE_PLATE = registerStoneBlock("polished_diorite", PRESSURE_PLATE);

    //ANDESITE
    public static final Block POLISHED_ANDESITE_WALL = registerStoneBlock("polished_andesite", WALL);
    public static final Block ANDESITE_BRICKS = registerStoneBlock("andesite_bricks");
    public static final Block CRACKED_ANDESITE_BRICKS = registerStoneBlock("cracked_andesite_bricks");
    public static final Block ANDESITE_BRICK_STAIRS = registerStoneBlock("andesite_brick", STAIRS);
    public static final Block ANDESITE_BRICK_SLAB = registerStoneBlock("andesite_brick", SLAB);
    public static final Block ANDESITE_BRICK_WALL = registerStoneBlock("andesite_brick", WALL);
    public static final Block MOSSY_ANDESITE_BRICKS = registerStoneBlock("mossy_andesite_bricks");
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = registerStoneBlock("mossy_andesite_brick", STAIRS);
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = registerStoneBlock("mossy_andesite_brick", SLAB);
    public static final Block MOSSY_ANDESITE_BRICK_WALL = registerStoneBlock("mossy_andesite_brick", WALL);
    public static final Block ANDESITE_BRICK_PILLAR = register("andesite_brick_pillar", new PillarBlock(copy(ANDESITE_BRICKS).registryKey(keyOf("andesite_brick_pillar"))), true);
    public static final Block CHISELED_ANDESITE_BRICKS = registerStoneBlock("chiseled_andesite_bricks");
    public static final Block POLISHED_ANDESITE_BUTTON = registerStoneBlock("polished_andesite", BUTTON);
    public static final Block POLISHED_ANDESITE_PRESSURE_PLATE = registerStoneBlock("polished_andesite", PRESSURE_PLATE);

    //GNEISS
    public static final Block GNEISS = registerStoneBlock("gneiss");
    public static final Block GNEISS_STAIRS = registerStoneBlock("gneiss", STAIRS);
    public static final Block GNEISS_SLAB = registerStoneBlock("gneiss", SLAB);
    public static final Block GNEISS_WALL = registerStoneBlock("gneiss", WALL);
    public static final Block POLISHED_GNEISS = registerStoneBlock("polished_gneiss");
    public static final Block POLISHED_GNEISS_STAIRS = registerStoneBlock("polished_gneiss", STAIRS);
    public static final Block POLISHED_GNEISS_SLAB = registerStoneBlock("polished_gneiss", SLAB);
    public static final Block POLISHED_GNEISS_WALL = registerStoneBlock("polished_gneiss", WALL);
    public static final Block GNEISS_BRICKS = registerStoneBlock("gneiss_bricks");
    public static final Block CRACKED_GNEISS_BRICKS = registerStoneBlock("cracked_gneiss_bricks");
    public static final Block GNEISS_BRICK_STAIRS = registerStoneBlock("gneiss_brick", STAIRS);
    public static final Block GNEISS_BRICK_SLAB = registerStoneBlock("gneiss_brick", SLAB);
    public static final Block GNEISS_BRICK_WALL = registerStoneBlock("gneiss_brick", WALL);
    public static final Block MOSSY_GNEISS_BRICKS = registerStoneBlock("mossy_gneiss_bricks");
    public static final Block MOSSY_GNEISS_BRICK_STAIRS = registerStoneBlock("mossy_gneiss_brick", STAIRS);
    public static final Block MOSSY_GNEISS_BRICK_SLAB = registerStoneBlock("mossy_gneiss_brick", SLAB);
    public static final Block MOSSY_GNEISS_BRICK_WALL = registerStoneBlock("mossy_gneiss_brick", WALL);
    public static final Block GNEISS_BRICK_PILLAR = register("gneiss_brick_pillar", new PillarBlock(copy(GNEISS_BRICKS).registryKey(keyOf("gneiss_brick_pillar"))), true);
    public static final Block CHISELED_GNEISS_BRICKS = registerStoneBlock("chiseled_gneiss_bricks");
    public static final Block POLISHED_GNEISS_BUTTON = registerStoneBlock("polished_gneiss", BUTTON);
    public static final Block POLISHED_GNEISS_PRESSURE_PLATE = registerStoneBlock("polished_gneiss", PRESSURE_PLATE);

    //SHALE
    public static final Block SHALE = registerStoneBlock("shale");
    public static final Block SHALE_STAIRS = registerStoneBlock("shale", STAIRS);
    public static final Block SHALE_SLAB = registerStoneBlock("shale", SLAB);
    public static final Block SHALE_WALL = registerStoneBlock("shale", WALL);
    public static final Block POLISHED_SHALE = registerStoneBlock("polished_shale");
    public static final Block POLISHED_SHALE_STAIRS = registerStoneBlock("polished_shale", STAIRS);
    public static final Block POLISHED_SHALE_SLAB = registerStoneBlock("polished_shale", SLAB);
    public static final Block POLISHED_SHALE_WALL = registerStoneBlock("polished_shale", WALL);
    public static final Block SHALE_BRICKS = registerStoneBlock("shale_bricks");
    public static final Block CRACKED_SHALE_BRICKS = registerStoneBlock("cracked_shale_bricks");
    public static final Block SHALE_BRICK_STAIRS = registerStoneBlock("shale_brick", STAIRS);
    public static final Block SHALE_BRICK_SLAB = registerStoneBlock("shale_brick", SLAB);
    public static final Block SHALE_BRICK_WALL = registerStoneBlock("shale_brick", WALL);
    public static final Block MOSSY_SHALE_BRICKS = registerStoneBlock("mossy_shale_bricks");
    public static final Block MOSSY_SHALE_BRICK_STAIRS = registerStoneBlock("mossy_shale_brick", STAIRS);
    public static final Block MOSSY_SHALE_BRICK_SLAB = registerStoneBlock("mossy_shale_brick", SLAB);
    public static final Block MOSSY_SHALE_BRICK_WALL = registerStoneBlock("mossy_shale_brick", WALL);
    public static final Block SHALE_BRICK_PILLAR = register("shale_brick_pillar", new PillarBlock(copy(SHALE_BRICKS).registryKey(keyOf("shale_brick_pillar"))), true);
    public static final Block CHISELED_SHALE_BRICKS = registerStoneBlock("chiseled_shale_bricks");
    public static final Block POLISHED_SHALE_BUTTON = registerStoneBlock("polished_shale", BUTTON);
    public static final Block POLISHED_SHALE_PRESSURE_PLATE = registerStoneBlock("polished_shale", PRESSURE_PLATE);

    //LIMESTONE
    public static final Block LIMESTONE = registerStoneBlock("limestone");
    public static final Block LIMESTONE_STAIRS = registerStoneBlock("limestone", STAIRS);
    public static final Block LIMESTONE_SLAB = registerStoneBlock("limestone", SLAB);
    public static final Block LIMESTONE_WALL = registerStoneBlock("limestone", WALL);
    public static final Block POLISHED_LIMESTONE = registerStoneBlock("polished_limestone");
    public static final Block POLISHED_LIMESTONE_STAIRS = registerStoneBlock("polished_limestone", STAIRS);
    public static final Block POLISHED_LIMESTONE_SLAB = registerStoneBlock("polished_limestone", SLAB);
    public static final Block POLISHED_LIMESTONE_WALL = registerStoneBlock("polished_limestone", WALL);
    public static final Block LIMESTONE_BRICKS = registerStoneBlock("limestone_bricks");
    public static final Block CRACKED_LIMESTONE_BRICKS = registerStoneBlock("cracked_limestone_bricks");
    public static final Block LIMESTONE_BRICK_STAIRS = registerStoneBlock("limestone_brick", STAIRS);
    public static final Block LIMESTONE_BRICK_SLAB = registerStoneBlock("limestone_brick", SLAB);
    public static final Block LIMESTONE_BRICK_WALL = registerStoneBlock("limestone_brick", WALL);
    public static final Block MOSSY_LIMESTONE_BRICKS = registerStoneBlock("mossy_limestone_bricks");
    public static final Block MOSSY_LIMESTONE_BRICK_STAIRS = registerStoneBlock("mossy_limestone_brick", STAIRS);
    public static final Block MOSSY_LIMESTONE_BRICK_SLAB = registerStoneBlock("mossy_limestone_brick", SLAB);
    public static final Block MOSSY_LIMESTONE_BRICK_WALL = registerStoneBlock("mossy_limestone_brick", WALL);
    public static final Block LIMESTONE_BRICK_PILLAR = register("limestone_brick_pillar", new PillarBlock(copy(LIMESTONE_BRICKS).registryKey(keyOf("limestone_brick_pillar"))), true);
    public static final Block CHISELED_LIMESTONE_BRICKS = registerStoneBlock("chiseled_limestone_bricks");
    public static final Block POLISHED_LIMESTONE_BUTTON = registerStoneBlock("polished_limestone", BUTTON);
    public static final Block POLISHED_LIMESTONE_PRESSURE_PLATE = registerStoneBlock("polished_limestone", PRESSURE_PLATE);

    //MARBLE
    public static final Block MARBLE = registerStoneBlock("marble");
    public static final Block MARBLE_STAIRS = registerStoneBlock("marble", STAIRS);
    public static final Block MARBLE_SLAB = registerStoneBlock("marble", SLAB);
    public static final Block MARBLE_WALL = registerStoneBlock("marble", WALL);
    public static final Block POLISHED_MARBLE = registerStoneBlock("polished_marble");
    public static final Block POLISHED_MARBLE_STAIRS = registerStoneBlock("polished_marble", STAIRS);
    public static final Block POLISHED_MARBLE_SLAB = registerStoneBlock("polished_marble", SLAB);
    public static final Block POLISHED_MARBLE_WALL = registerStoneBlock("polished_marble", WALL);
    public static final Block MARBLE_BRICKS = registerStoneBlock("marble_bricks");
    public static final Block CRACKED_MARBLE_BRICKS = registerStoneBlock("cracked_marble_bricks");
    public static final Block MARBLE_BRICK_STAIRS = registerStoneBlock("marble_brick", STAIRS);
    public static final Block MARBLE_BRICK_SLAB = registerStoneBlock("marble_brick", SLAB);
    public static final Block MARBLE_BRICK_WALL = registerStoneBlock("marble_brick", WALL);
    public static final Block MOSSY_MARBLE_BRICKS = registerStoneBlock("mossy_marble_bricks");
    public static final Block MOSSY_MARBLE_BRICK_STAIRS = registerStoneBlock("mossy_marble_brick", STAIRS);
    public static final Block MOSSY_MARBLE_BRICK_SLAB = registerStoneBlock("mossy_marble_brick", SLAB);
    public static final Block MOSSY_MARBLE_BRICK_WALL = registerStoneBlock("mossy_marble_brick", WALL);
    public static final Block MARBLE_BRICK_PILLAR = register("marble_brick_pillar", new PillarBlock(copy(MARBLE_BRICKS).registryKey(keyOf("marble_brick_pillar"))), true);
    public static final Block CHISELED_MARBLE_BRICKS = registerStoneBlock("chiseled_marble_bricks");
    public static final Block POLISHED_MARBLE_BUTTON = registerStoneBlock("polished_marble", BUTTON);
    public static final Block POLISHED_MARBLE_PRESSURE_PLATE = registerStoneBlock("polished_marble", PRESSURE_PLATE);



    //GABBRO
    public static final Block GABBRO = registerStoneBlock("gabbro");
    public static final Block GABBRO_STAIRS = registerStoneBlock("gabbro", STAIRS);
    public static final Block GABBRO_SLAB = registerStoneBlock("gabbro", SLAB);
    public static final Block GABBRO_WALL = registerStoneBlock("gabbro", WALL);
    public static final Block POLISHED_GABBRO = registerStoneBlock("polished_gabbro");
    public static final Block POLISHED_GABBRO_STAIRS = registerStoneBlock("polished_gabbro", STAIRS);
    public static final Block POLISHED_GABBRO_SLAB = registerStoneBlock("polished_gabbro", SLAB);
    public static final Block POLISHED_GABBRO_WALL = registerStoneBlock("polished_gabbro", WALL);
    public static final Block GABBRO_BRICKS = registerStoneBlock("gabbro_bricks");
    public static final Block CRACKED_GABBRO_BRICKS = registerStoneBlock("cracked_gabbro_bricks");
    public static final Block GABBRO_BRICK_STAIRS = registerStoneBlock("gabbro_brick", STAIRS);
    public static final Block GABBRO_BRICK_SLAB = registerStoneBlock("gabbro_brick", SLAB);
    public static final Block GABBRO_BRICK_WALL = registerStoneBlock("gabbro_brick", WALL);
    public static final Block MOSSY_GABBRO_BRICKS = registerStoneBlock("mossy_gabbro_bricks");
    public static final Block MOSSY_GABBRO_BRICK_STAIRS = registerStoneBlock("mossy_gabbro_brick", STAIRS);
    public static final Block MOSSY_GABBRO_BRICK_SLAB = registerStoneBlock("mossy_gabbro_brick", SLAB);
    public static final Block MOSSY_GABBRO_BRICK_WALL = registerStoneBlock("mossy_gabbro_brick", WALL);
    public static final Block GABBRO_BRICK_PILLAR = register("gabbro_brick_pillar", new PillarBlock(copy(GABBRO_BRICKS).registryKey(keyOf("gabbro_brick_pillar"))), true);
    public static final Block CHISELED_GABBRO_BRICKS = registerStoneBlock("chiseled_gabbro_bricks");
    public static final Block POLISHED_GABBRO_BUTTON = registerStoneBlock("polished_gabbro", BUTTON);
    public static final Block POLISHED_GABBRO_PRESSURE_PLATE = registerStoneBlock("polished_gabbro", PRESSURE_PLATE);

    //PHYLLITE
    public static final Block PHYLLITE = registerStoneBlock("phyllite");
    public static final Block PHYLLITE_STAIRS = registerStoneBlock("phyllite", STAIRS);
    public static final Block PHYLLITE_SLAB = registerStoneBlock("phyllite", SLAB);
    public static final Block PHYLLITE_WALL = registerStoneBlock("phyllite", WALL);
    public static final Block POLISHED_PHYLLITE = registerStoneBlock("polished_phyllite");
    public static final Block POLISHED_PHYLLITE_STAIRS = registerStoneBlock("polished_phyllite", STAIRS);
    public static final Block POLISHED_PHYLLITE_SLAB = registerStoneBlock("polished_phyllite", SLAB);
    public static final Block POLISHED_PHYLLITE_WALL = registerStoneBlock("polished_phyllite", WALL);
    public static final Block PHYLLITE_BRICKS = registerStoneBlock("phyllite_bricks");
    public static final Block CRACKED_PHYLLITE_BRICKS = registerStoneBlock("cracked_phyllite_bricks");
    public static final Block PHYLLITE_BRICK_STAIRS = registerStoneBlock("phyllite_brick", STAIRS);
    public static final Block PHYLLITE_BRICK_SLAB = registerStoneBlock("phyllite_brick", SLAB);
    public static final Block PHYLLITE_BRICK_WALL = registerStoneBlock("phyllite_brick", WALL);
    public static final Block MOSSY_PHYLLITE_BRICKS = registerStoneBlock("mossy_phyllite_bricks");
    public static final Block MOSSY_PHYLLITE_BRICK_STAIRS = registerStoneBlock("mossy_phyllite_brick", STAIRS);
    public static final Block MOSSY_PHYLLITE_BRICK_SLAB = registerStoneBlock("mossy_phyllite_brick", SLAB);
    public static final Block MOSSY_PHYLLITE_BRICK_WALL = registerStoneBlock("mossy_phyllite_brick", WALL);
    public static final Block PHYLLITE_BRICK_PILLAR = register("phyllite_brick_pillar", new PillarBlock(copy(PHYLLITE_BRICKS).registryKey(keyOf("phyllite_brick_pillar"))), true);
    public static final Block CHISELED_PHYLLITE_BRICKS = registerStoneBlock("chiseled_phyllite_bricks");
    public static final Block POLISHED_PHYLLITE_BUTTON = registerStoneBlock("polished_phyllite", BUTTON);
    public static final Block POLISHED_PHYLLITE_PRESSURE_PLATE = registerStoneBlock("polished_phyllite", PRESSURE_PLATE);

    //TUFF
    public static final Block CRACKED_TUFF_BRICKS = register("cracked_tuff_bricks", new Block(copy(TUFF_BRICKS).registryKey(keyOf("cracked_tuff_bricks"))), true);

    //CALCITE
    public static final Block CALCITE_STAIRS = registerStoneBlock("calcite", STAIRS);
    public static final Block CALCITE_SLAB = registerStoneBlock("calcite", SLAB);
    public static final Block CALCITE_WALL = registerStoneBlock("calcite", WALL);
    public static final Block POLISHED_CALCITE = registerStoneBlock("polished_calcite");
    public static final Block POLISHED_CALCITE_STAIRS = registerStoneBlock("polished_calcite", STAIRS);
    public static final Block POLISHED_CALCITE_SLAB = registerStoneBlock("polished_calcite", SLAB);
    public static final Block POLISHED_CALCITE_WALL = registerStoneBlock("polished_calcite", WALL);
    public static final Block CALCITE_BRICKS = registerStoneBlock("calcite_bricks");
    public static final Block CRACKED_CALCITE_BRICKS = registerStoneBlock("cracked_calcite_bricks");
    public static final Block CALCITE_BRICK_STAIRS = registerStoneBlock("calcite_brick", STAIRS);
    public static final Block CALCITE_BRICK_SLAB = registerStoneBlock("calcite_brick", SLAB);
    public static final Block CALCITE_BRICK_WALL = registerStoneBlock("calcite_brick", WALL);
    public static final Block CHISELED_CALCITE = registerStoneBlock("chiseled_calcite");

    //DRIPSTONE
    public static final Block DRIPSTONE_STAIRS = registerStoneBlock("dripstone", STAIRS);
    public static final Block DRIPSTONE_SLAB = registerStoneBlock("dripstone", SLAB);
    public static final Block DRIPSTONE_WALL = registerStoneBlock("dripstone", WALL);
    public static final Block POLISHED_DRIPSTONE = registerStoneBlock("polished_dripstone");
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerStoneBlock("polished_dripstone", STAIRS);
    public static final Block POLISHED_DRIPSTONE_SLAB = registerStoneBlock("polished_dripstone", SLAB);
    public static final Block POLISHED_DRIPSTONE_WALL = registerStoneBlock("polished_dripstone", WALL);
    public static final Block DRIPSTONE_BRICKS = registerStoneBlock("dripstone_bricks");
    public static final Block CRACKED_DRIPSTONE_BRICKS = registerStoneBlock("cracked_dripstone_bricks");
    public static final Block DRIPSTONE_BRICK_STAIRS = registerStoneBlock("dripstone_brick", STAIRS);
    public static final Block DRIPSTONE_BRICK_SLAB = registerStoneBlock("dripstone_brick", SLAB);
    public static final Block DRIPSTONE_BRICK_WALL = registerStoneBlock("dripstone_brick", WALL);
    public static final Block CHISELED_DRIPSTONE = registerStoneBlock("chiseled_dripstone");

    public static final Block CRACKED_BRICKS =  registerStoneBlock("cracked_bricks");
    public static final Block CRACKED_MUD_BRICKS = registerStoneBlock("cracked_mud_bricks");
    public static final Block CHISELED_MUD_BRICKS = registerStoneBlock("chiseled_mud_bricks");

    //SANDSTONE
    public static final Block CUT_SANDSTONE_STAIRS = registerStoneBlock("cut_sandstone", STAIRS);
    public static final Block CUT_SANDSTONE_WALL = registerStoneBlock("cut_sandstone", WALL);
    public static final Block SMOOTH_SANDSTONE_WALL = registerStoneBlock("smooth_sandstone", WALL);
    public static final Block ROUGH_SANDSTONE = registerStoneBlock("rough_sandstone");
    public static final Block ROUGH_SANDSTONE_STAIRS = registerStoneBlock("rough_sandstone", STAIRS);
    public static final Block ROUGH_SANDSTONE_SLAB = registerStoneBlock("rough_sandstone", SLAB);
    public static final Block ROUGH_SANDSTONE_WALL = registerStoneBlock("rough_sandstone", WALL);

    public static final Block CUT_RED_SANDSTONE_STAIRS = registerStoneBlock("cut_red_sandstone", STAIRS);
    public static final Block CUT_RED_SANDSTONE_WALL = registerStoneBlock("cut_red_sandstone", WALL);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerStoneBlock("smooth_red_sandstone", WALL);
    public static final Block ROUGH_RED_SANDSTONE = registerStoneBlock("rough_red_sandstone");
    public static final Block ROUGH_RED_SANDSTONE_STAIRS = registerStoneBlock("rough_red_sandstone", STAIRS);
    public static final Block ROUGH_RED_SANDSTONE_SLAB = registerStoneBlock("rough_red_sandstone", SLAB);
    public static final Block ROUGH_RED_SANDSTONE_WALL = registerStoneBlock("rough_red_sandstone", WALL);

    public static final Block FROSTED_SANDSTONE = registerStoneBlock("frosted_sandstone");
    public static final Block FROSTED_SANDSTONE_STAIRS = registerStoneBlock("frosted_sandstone", STAIRS);
    public static final Block FROSTED_SANDSTONE_SLAB = registerStoneBlock("frosted_sandstone", SLAB);
    public static final Block FROSTED_SANDSTONE_WALL = registerStoneBlock("frosted_sandstone", WALL);
    public static final Block CUT_FROSTED_SANDSTONE = registerStoneBlock("cut_frosted_sandstone");
    public static final Block CHISELED_FROSTED_SANDSTONE = registerStoneBlock("chiseled_frosted_sandstone");
    public static final Block CUT_FROSTED_SANDSTONE_STAIRS = registerStoneBlock("cut_frosted_sandstone", STAIRS);
    public static final Block CUT_FROSTED_SANDSTONE_SLAB = registerStoneBlock("cut_frosted_sandstone", SLAB);
    public static final Block CUT_FROSTED_SANDSTONE_WALL = registerStoneBlock("cut_frosted_sandstone", WALL);
    public static final Block SMOOTH_FROSTED_SANDSTONE = registerStoneBlock("smooth_frosted_sandstone");
    public static final Block SMOOTH_FROSTED_SANDSTONE_STAIRS = registerStoneBlock("smooth_frosted_sandstone", STAIRS);
    public static final Block SMOOTH_FROSTED_SANDSTONE_SLAB = registerStoneBlock("smooth_frosted_sandstone", SLAB);
    public static final Block SMOOTH_FROSTED_SANDSTONE_WALL = registerStoneBlock("smooth_frosted_sandstone", WALL);
    public static final Block ROUGH_FROSTED_SANDSTONE = registerStoneBlock("rough_frosted_sandstone");
    public static final Block ROUGH_FROSTED_SANDSTONE_STAIRS = registerStoneBlock("rough_frosted_sandstone", STAIRS);
    public static final Block ROUGH_FROSTED_SANDSTONE_SLAB = registerStoneBlock("rough_frosted_sandstone", SLAB);
    public static final Block ROUGH_FROSTED_SANDSTONE_WALL = registerStoneBlock("rough_frosted_sandstone", WALL);

    public static final Block CHARRED_SANDSTONE = registerStoneBlock("charred_sandstone");
    public static final Block CHARRED_SANDSTONE_STAIRS = registerStoneBlock("charred_sandstone", STAIRS);
    public static final Block CHARRED_SANDSTONE_SLAB = registerStoneBlock("charred_sandstone", SLAB);
    public static final Block CHARRED_SANDSTONE_WALL = registerStoneBlock("charred_sandstone", WALL);
    public static final Block CHISELED_CHARRED_SANDSTONE = registerStoneBlock("chiseled_charred_sandstone");
    public static final Block CUT_CHARRED_SANDSTONE = registerStoneBlock("cut_charred_sandstone");
    public static final Block CUT_CHARRED_SANDSTONE_STAIRS = registerStoneBlock("cut_charred_sandstone", STAIRS);
    public static final Block CUT_CHARRED_SANDSTONE_SLAB = registerStoneBlock("cut_charred_sandstone", SLAB);
    public static final Block CUT_CHARRED_SANDSTONE_WALL = registerStoneBlock("cut_charred_sandstone", WALL);
    public static final Block SMOOTH_CHARRED_SANDSTONE = registerStoneBlock("smooth_charred_sandstone");
    public static final Block SMOOTH_CHARRED_SANDSTONE_STAIRS = registerStoneBlock("smooth_charred_sandstone", STAIRS);
    public static final Block SMOOTH_CHARRED_SANDSTONE_SLAB = registerStoneBlock("smooth_charred_sandstone", SLAB);
    public static final Block SMOOTH_CHARRED_SANDSTONE_WALL = registerStoneBlock("smooth_charred_sandstone", WALL);
    public static final Block ROUGH_CHARRED_SANDSTONE = registerStoneBlock("rough_charred_sandstone");
    public static final Block ROUGH_CHARRED_SANDSTONE_STAIRS = registerStoneBlock("rough_charred_sandstone", STAIRS);
    public static final Block ROUGH_CHARRED_SANDSTONE_SLAB = registerStoneBlock("rough_charred_sandstone", SLAB);
    public static final Block ROUGH_CHARRED_SANDSTONE_WALL = registerStoneBlock("rough_charred_sandstone", WALL);

    //PRISMARINE
    public static final Block CRACKED_PRISMARINE_BRICKS = registerStoneBlock("cracked_prismarine_bricks");
    public static final Block PRISMARINE_BRICK_WALL = registerStoneBlock("prismarine_brick", WALL);
    public static final Block DARK_PRISMARINE_WALL = registerStoneBlock("dark_prismarine", WALL);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerStoneBlock("chiseled_prismarine_bricks");

    // NETHER_BRICK
    public static final Block CRACKED_RED_NETHER_BRICKS = registerStoneBlock("cracked_red_nether_bricks");
    public static final Block RED_NETHER_BRICK_FENCE = registerStoneBlock("red_nether_brick", FENCE);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerStoneBlock("chiseled_red_nether_bricks");
    public static final Block BLUE_NETHER_BRICKS = registerStoneBlock("blue_nether_bricks");
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerStoneBlock("cracked_blue_nether_bricks");
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerStoneBlock("blue_nether_brick", STAIRS);
    public static final Block BLUE_NETHER_BRICK_SLAB = registerStoneBlock("blue_nether_brick", SLAB);
    public static final Block BLUE_NETHER_BRICK_WALL = registerStoneBlock("blue_nether_brick", WALL);
    public static final Block BLUE_NETHER_BRICK_FENCE = registerStoneBlock("blue_nether_brick", FENCE);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerStoneBlock("chiseled_blue_nether_bricks");

    // QUARTZ
    public static final Block QUARTZ_WALL = registerStoneBlock("quartz", WALL);
    public static final Block CRACKED_QUARTZ_BRICKS = registerStoneBlock("cracked_quartz_bricks");
    public static final Block QUARTZ_BRICK_STAIRS = registerStoneBlock("quartz_brick", STAIRS);
    public static final Block QUARTZ_BRICK_SLAB = registerStoneBlock("quartz_brick", SLAB);
    public static final Block QUARTZ_BRICK_WALL = registerStoneBlock("quartz_brick", WALL);
    public static final Block SMOOTH_QUARTZ_WALL = registerStoneBlock("smooth_quartz", WALL);

    // AMETHYST
    public static final Block AMETHYST_STAIRS = registerStoneBlock("amethyst", STAIRS);
    public static final Block AMETHYST_SLAB = registerStoneBlock("amethyst", SLAB);
    public static final Block AMETHYST_WALL = registerStoneBlock("amethyst", WALL);
    public static final Block AMETHYST_BRICKS = registerStoneBlock("amethyst_bricks");
    public static final Block CRACKED_AMETHYST_BRICKS = registerStoneBlock("cracked_amethyst_bricks");
    public static final Block AMETHYST_BRICK_STAIRS = registerStoneBlock("amethyst_brick", STAIRS);
    public static final Block AMETHYST_BRICK_SLAB = registerStoneBlock("amethyst_brick", SLAB);
    public static final Block AMETHYST_BRICK_WALL = registerStoneBlock("amethyst_brick", WALL);
    public static final Block AMETHYST_TILES = registerStoneBlock("amethyst_tiles");
    public static final Block CRACKED_AMETHYST_TILES = registerStoneBlock("cracked_amethyst_tiles");
    public static final Block AMETHYST_TILE_STAIRS = registerStoneBlock("amethyst_tile", STAIRS);
    public static final Block AMETHYST_TILE_SLAB = registerStoneBlock("amethyst_tile", SLAB);
    public static final Block AMETHYST_TILE_WALL = registerStoneBlock("amethyst_tile", WALL);
    public static final Block CHISELED_AMETHYST = registerStoneBlock("chiseled_amethyst");

    // DOLOMITE
    public static final Block DOLOMITE = registerStoneBlock("dolomite");
    public static final Block DOLOMITE_STAIRS = registerStoneBlock("dolomite", STAIRS);
    public static final Block DOLOMITE_SLAB = registerStoneBlock("dolomite", SLAB);
    public static final Block DOLOMITE_WALL = registerStoneBlock("dolomite", WALL);
    public static final Block DOLOMITE_BRICKS = registerStoneBlock("dolomite_bricks");
    public static final Block CRACKED_DOLOMITE_BRICKS = registerStoneBlock("cracked_dolomite_bricks");
    public static final Block DOLOMITE_BRICK_STAIRS = registerStoneBlock("dolomite_brick", STAIRS);
    public static final Block DOLOMITE_BRICK_SLAB = registerStoneBlock("dolomite_brick", SLAB);
    public static final Block DOLOMITE_BRICK_WALL = registerStoneBlock("dolomite_brick", WALL);
    public static final Block DOLOMITE_TILES = registerStoneBlock("dolomite_tiles");
    public static final Block CRACKED_DOLOMITE_TILES = registerStoneBlock("cracked_dolomite_tiles");
    public static final Block DOLOMITE_TILE_STAIRS = registerStoneBlock("dolomite_tile", STAIRS);
    public static final Block DOLOMITE_TILE_SLAB = registerStoneBlock("dolomite_tile", SLAB);
    public static final Block DOLOMITE_TILE_WALL = registerStoneBlock("dolomite_tile", WALL);
    public static final Block CHISELED_DOLOMITE = registerStoneBlock("chiseled_dolomite");

    // GYPSUM
    public static final Block GYPSUM = registerStoneBlock("gypsum");
    public static final Block GYPSUM_STAIRS = registerStoneBlock("gypsum", STAIRS);
    public static final Block GYPSUM_SLAB = registerStoneBlock("gypsum", SLAB);
    public static final Block GYPSUM_WALL = registerStoneBlock("gypsum", WALL);
    public static final Block GYPSUM_BRICKS = registerStoneBlock("gypsum_bricks");
    public static final Block CRACKED_GYPSUM_BRICKS = registerStoneBlock("cracked_gypsum_bricks");
    public static final Block GYPSUM_BRICK_STAIRS = registerStoneBlock("gypsum_brick", STAIRS);
    public static final Block GYPSUM_BRICK_SLAB = registerStoneBlock("gypsum_brick", SLAB);
    public static final Block GYPSUM_BRICK_WALL = registerStoneBlock("gypsum_brick", WALL);
    public static final Block GYPSUM_TILES = registerStoneBlock("gypsum_tiles");
    public static final Block CRACKED_GYPSUM_TILES = registerStoneBlock("cracked_gypsum_tiles");
    public static final Block GYPSUM_TILE_STAIRS = registerStoneBlock("gypsum_tile", STAIRS);
    public static final Block GYPSUM_TILE_SLAB = registerStoneBlock("gypsum_tile", SLAB);
    public static final Block GYPSUM_TILE_WALL = registerStoneBlock("gypsum_tile", WALL);
    public static final Block CHISELED_GYPSUM = registerStoneBlock("chiseled_gypsum");


    // ORES

    // COAL
    public static final Block GRANITE_COAL_ORE = registerOreBlock("granite", "coal");
    public static final Block DIORITE_COAL_ORE = registerOreBlock("diorite","coal");
    public static final Block ANDESITE_COAL_ORE = registerOreBlock("andesite", "coal");
    public static final Block TUFF_COAL_ORE = registerOreBlock("tuff","coal");
    public static final Block GNEISS_COAL_ORE = registerOreBlock("gneiss","coal");
    public static final Block SHALE_COAL_ORE = registerOreBlock("shale","coal");
    public static final Block LIMESTONE_COAL_ORE = registerOreBlock("limestone","coal");
    public static final Block MARBLE_COAL_ORE = registerOreBlock("marble","coal");
    public static final Block GABBRO_COAL_ORE = registerOreBlock("gabbro","coal");
    public static final Block PHYLLITE_COAL_ORE = registerOreBlock("phyllite","coal");

    // IRON
    public static final Block GRANITE_IRON_ORE = registerOreBlock("granite", "iron");
    public static final Block DIORITE_IRON_ORE = registerOreBlock("diorite","iron");
    public static final Block ANDESITE_IRON_ORE = registerOreBlock("andesite", "iron");
    public static final Block TUFF_IRON_ORE = registerOreBlock("tuff","iron");
    public static final Block GNEISS_IRON_ORE = registerOreBlock("gneiss","iron");
    public static final Block SHALE_IRON_ORE = registerOreBlock("shale","iron");
    public static final Block LIMESTONE_IRON_ORE = registerOreBlock("limestone","iron");
    public static final Block MARBLE_IRON_ORE = registerOreBlock("marble","iron");
    public static final Block GABBRO_IRON_ORE = registerOreBlock("gabbro","iron");
    public static final Block PHYLLITE_IRON_ORE = registerOreBlock("phyllite","iron");

    // COPPER
    public static final Block GRANITE_COPPER_ORE = registerOreBlock("granite", "copper");
    public static final Block DIORITE_COPPER_ORE = registerOreBlock("diorite","copper");
    public static final Block ANDESITE_COPPER_ORE = registerOreBlock("andesite", "copper");
    public static final Block TUFF_COPPER_ORE = registerOreBlock("tuff","copper");
    public static final Block GNEISS_COPPER_ORE = registerOreBlock("gneiss","copper");
    public static final Block SHALE_COPPER_ORE = registerOreBlock("shale","copper");
    public static final Block LIMESTONE_COPPER_ORE = registerOreBlock("limestone","copper");
    public static final Block MARBLE_COPPER_ORE = registerOreBlock("marble","copper");
    public static final Block GABBRO_COPPER_ORE = registerOreBlock("gabbro","copper");
    public static final Block PHYLLITE_COPPER_ORE = registerOreBlock("phyllite","copper");

    // GOLD
    public static final Block GRANITE_GOLD_ORE = registerOreBlock("granite", "gold");
    public static final Block DIORITE_GOLD_ORE = registerOreBlock("diorite","gold");
    public static final Block ANDESITE_GOLD_ORE = registerOreBlock("andesite", "gold");
    public static final Block TUFF_GOLD_ORE = registerOreBlock("tuff","gold");
    public static final Block GNEISS_GOLD_ORE = registerOreBlock("gneiss","gold");
    public static final Block SHALE_GOLD_ORE = registerOreBlock("shale","gold");
    public static final Block LIMESTONE_GOLD_ORE = registerOreBlock("limestone","gold");
    public static final Block MARBLE_GOLD_ORE = registerOreBlock("marble","gold");
    public static final Block GABBRO_GOLD_ORE = registerOreBlock("gabbro","gold");
    public static final Block PHYLLITE_GOLD_ORE = registerOreBlock("phyllite","gold");

    // REDSTONE
    public static final Block GRANITE_REDSTONE_ORE = registerOreBlock("granite", "redstone");
    public static final Block DIORITE_REDSTONE_ORE = registerOreBlock("diorite","redstone");
    public static final Block ANDESITE_REDSTONE_ORE = registerOreBlock("andesite", "redstone");
    public static final Block TUFF_REDSTONE_ORE = registerOreBlock("tuff","redstone");
    public static final Block GNEISS_REDSTONE_ORE = registerOreBlock("gneiss","redstone");
    public static final Block SHALE_REDSTONE_ORE = registerOreBlock("shale","redstone");
    public static final Block LIMESTONE_REDSTONE_ORE = registerOreBlock("limestone","redstone");
    public static final Block MARBLE_REDSTONE_ORE = registerOreBlock("marble","redstone");
    public static final Block GABBRO_REDSTONE_ORE = registerOreBlock("gabbro","redstone");
    public static final Block PHYLLITE_REDSTONE_ORE = registerOreBlock("phyllite","redstone");


    //EMERALD
    public static final Block GRANITE_EMERALD_ORE = registerOreBlock("granite", "emerald");
    public static final Block DIORITE_EMERALD_ORE = registerOreBlock("diorite","emerald");
    public static final Block ANDESITE_EMERALD_ORE = registerOreBlock("andesite", "emerald");
    public static final Block TUFF_EMERALD_ORE = registerOreBlock("tuff","emerald");
    public static final Block GNEISS_EMERALD_ORE = registerOreBlock("gneiss","emerald");
    public static final Block SHALE_EMERALD_ORE = registerOreBlock("shale","emerald");
    public static final Block LIMESTONE_EMERALD_ORE = registerOreBlock("limestone","emerald");
    public static final Block MARBLE_EMERALD_ORE = registerOreBlock("marble","emerald");
    public static final Block GABBRO_EMERALD_ORE = registerOreBlock("gabbro","emerald");
    public static final Block PHYLLITE_EMERALD_ORE = registerOreBlock("phyllite","emerald");

    //REDSTONE
    public static final Block GRANITE_LAPIS_ORE = registerOreBlock("granite", "lapis");
    public static final Block DIORITE_LAPIS_ORE = registerOreBlock("diorite","lapis");
    public static final Block ANDESITE_LAPIS_ORE = registerOreBlock("andesite", "lapis");
    public static final Block TUFF_LAPIS_ORE = registerOreBlock("tuff","lapis");
    public static final Block GNEISS_LAPIS_ORE = registerOreBlock("gneiss","lapis");
    public static final Block SHALE_LAPIS_ORE = registerOreBlock("shale","lapis");
    public static final Block LIMESTONE_LAPIS_ORE = registerOreBlock("limestone","lapis");
    public static final Block MARBLE_LAPIS_ORE = registerOreBlock("marble","lapis");
    public static final Block GABBRO_LAPIS_ORE = registerOreBlock("gabbro","lapis");
    public static final Block PHYLLITE_LAPIS_ORE = registerOreBlock("phyllite","lapis");

    //DIAMOND
    public static final Block GRANITE_DIAMOND_ORE = registerOreBlock("granite", "diamond");
    public static final Block DIORITE_DIAMOND_ORE = registerOreBlock("diorite","diamond");
    public static final Block ANDESITE_DIAMOND_ORE = registerOreBlock("andesite", "diamond");
    public static final Block TUFF_DIAMOND_ORE = registerOreBlock("tuff","diamond");
    public static final Block GNEISS_DIAMOND_ORE = registerOreBlock("gneiss","diamond");
    public static final Block SHALE_DIAMOND_ORE = registerOreBlock("shale","diamond");
    public static final Block LIMESTONE_DIAMOND_ORE = registerOreBlock("limestone","diamond");
    public static final Block MARBLE_DIAMOND_ORE = registerOreBlock("marble","diamond");
    public static final Block GABBRO_DIAMOND_ORE = registerOreBlock("gabbro","diamond");
    public static final Block PHYLLITE_DIAMOND_ORE = registerOreBlock("phyllite","diamond");

    private static Block registerStoneBlock(String stoneName) {
        AbstractBlock.Settings settings;
        if (stoneName.contains("calcite")) settings = copy(CALCITE);
        else if (stoneName.contains("dripstone")) settings = copy(DRIPSTONE_BLOCK);
        else if (containsAny(stoneName, "amethyst", "dolomite", "gypsum")) settings = copy(AMETHYST_BLOCK);
        else if (stoneName.contains("quartz")) settings = copy(QUARTZ_BLOCK);
        else if (stoneName.contains("sandstone")) settings = copy(SANDSTONE);
        else if (stoneName.contains("prismarine")) settings = copy(PRISMARINE);
        else if (stoneName.contains("nether_brick")) settings = copy(NETHER_BRICKS);
        else settings = copy(STONE);
        return register(stoneName, new Block(settings.registryKey(keyOf(stoneName))), true);
    }

    private static Block registerStoneBlock(String stoneName, BlockFamily.Variant variant) {

        Block block;
        AbstractBlock.Settings settings;
        BlockState blockState;
        String name = stoneName + "_" + variant.getName();

        if (stoneName.contains("calcite")) {
            settings = copy(Blocks.CALCITE);
            blockState = Blocks.CALCITE.getDefaultState();
        } else if (stoneName.contains("dripstone")) {
            settings = copy(Blocks.DRIPSTONE_BLOCK);
            blockState = Blocks.DRIPSTONE_BLOCK.getDefaultState();
        } else if (containsAny(stoneName, "amethyst", "dolomite", "gypsum")) {
            settings = copy(Blocks.AMETHYST_BLOCK);
            blockState = Blocks.AMETHYST_BLOCK.getDefaultState();
        } else if (stoneName.contains("quartz")) {
            settings = copy(Blocks.QUARTZ_BLOCK);
            blockState = Blocks.QUARTZ_BLOCK.getDefaultState();
        } else if (stoneName.contains("sandstone")) {
            settings = copy(Blocks.SANDSTONE);
            blockState = Blocks.SANDSTONE.getDefaultState();
        } else if (stoneName.contains("prismarine")) {
            settings = copy(Blocks.PRISMARINE);
            blockState = Blocks.PRISMARINE.getDefaultState();
        } else if (stoneName.contains("nether_brick")) {
            settings = copy(Blocks.NETHER_BRICKS);
            blockState = Blocks.NETHER_BRICKS.getDefaultState();
        } else {
            settings = copy(STONE);
            blockState = STONE.getDefaultState();
        }

        settings = settings.registryKey(keyOf(name));

        switch (variant) {
            case SLAB -> block = new SlabBlock(settings);
            case STAIRS -> block = new StairsBlock(blockState, settings);
            case WALL -> block = new WallBlock(settings);
            case PRESSURE_PLATE -> block = new PressurePlateBlock(BlockSetType.STONE, settings);
            case BUTTON -> block = new ButtonBlock(BlockSetType.STONE, 20, settings);
            case FENCE -> block = new FenceBlock(settings);
            default -> throw new IllegalStateException("Unexpected variant '" + variant + "' for" + stoneName);
        }
        return register(name, block, true);
    }

    private static boolean containsAny(String text, String... stoneNames) {
        for (String phrase : stoneNames) if (text.contains(phrase)) return true;
        return false;
    }



    private static Block registerOreBlock(String stoneType, String oreType) {
        String name = stoneType + "_" + oreType + "_ore";
        return switch (oreType) {
            case "iron", "copper", "gold" -> register(name, new Block(copy(IRON_ORE).registryKey(keyOf(name))), false);
            case "coal" -> register(name, new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), copy(COAL_ORE).registryKey(keyOf(name))), false);
            case "lapis" -> register(name, new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), copy(LAPIS_ORE).registryKey(keyOf(name))), false);
            case "emerald", "diamond" -> register(name, new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), copy(EMERALD_ORE).registryKey(keyOf(name))), false);
            case "redstone" -> register(name, new RedstoneOreBlock(copy(REDSTONE_ORE).registryKey(keyOf(name))), false);
            default -> throw new IllegalStateException("Unexpected value for 'oreType': " + oreType);
        };
    }

    public static void registerStoneBlocks() {
        WithersOverhaul.LOGGER.info("Registering Stone Blocks for" + WithersOverhaul.MOD_ID);
    }
}
