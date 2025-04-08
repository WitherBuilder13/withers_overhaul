package me.withers_overhaul.registry.block;

import me.withers_overhaul.WithersOverhaul;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamily;

import static me.withers_overhaul.registry.block.OverhaulBlocks.keyOf;
import static me.withers_overhaul.registry.block.OverhaulBlocks.register;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.data.family.BlockFamily.Variant.*;

public class ColoredBlocks {

    //CONCRETE
    public static final Block WHITE_CONCRETE_STAIRS = registerColoredBlock("white_concrete", STAIRS);
    public static final Block WHITE_CONCRETE_SLAB = registerColoredBlock("white_concrete", SLAB);
    public static final Block WHITE_CONCRETE_WALL = registerColoredBlock("white_concrete", WALL);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerColoredBlock("light_gray_concrete", STAIRS);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerColoredBlock("light_gray_concrete", SLAB);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerColoredBlock("light_gray_concrete", WALL);
    public static final Block GRAY_CONCRETE_STAIRS = registerColoredBlock("gray_concrete", STAIRS);
    public static final Block GRAY_CONCRETE_SLAB = registerColoredBlock("gray_concrete", SLAB);
    public static final Block GRAY_CONCRETE_WALL = registerColoredBlock("gray_concrete", WALL);
    public static final Block BLACK_CONCRETE_STAIRS = registerColoredBlock("black_concrete", STAIRS);
    public static final Block BLACK_CONCRETE_SLAB = registerColoredBlock("black_concrete", SLAB);
    public static final Block BLACK_CONCRETE_WALL = registerColoredBlock("black_concrete", WALL);
    public static final Block BROWN_CONCRETE_STAIRS = registerColoredBlock("brown_concrete", STAIRS);
    public static final Block BROWN_CONCRETE_SLAB = registerColoredBlock("brown_concrete", SLAB);
    public static final Block BROWN_CONCRETE_WALL = registerColoredBlock("brown_concrete", WALL);
    public static final Block RED_CONCRETE_STAIRS = registerColoredBlock("red_concrete", STAIRS);
    public static final Block RED_CONCRETE_SLAB = registerColoredBlock("red_concrete", SLAB);
    public static final Block RED_CONCRETE_WALL = registerColoredBlock("red_concrete", WALL);
    public static final Block ORANGE_CONCRETE_STAIRS = registerColoredBlock("orange_concrete", STAIRS);
    public static final Block ORANGE_CONCRETE_SLAB = registerColoredBlock("orange_concrete", SLAB);
    public static final Block ORANGE_CONCRETE_WALL = registerColoredBlock("orange_concrete", WALL);
    public static final Block YELLOW_CONCRETE_STAIRS = registerColoredBlock("yellow_concrete", STAIRS);
    public static final Block YELLOW_CONCRETE_SLAB = registerColoredBlock("yellow_concrete", SLAB);
    public static final Block YELLOW_CONCRETE_WALL = registerColoredBlock("yellow_concrete", WALL);
    public static final Block LIME_CONCRETE_STAIRS = registerColoredBlock("lime_concrete", STAIRS);
    public static final Block LIME_CONCRETE_SLAB = registerColoredBlock("lime_concrete", SLAB);
    public static final Block LIME_CONCRETE_WALL = registerColoredBlock("lime_concrete", WALL);
    public static final Block GREEN_CONCRETE_STAIRS = registerColoredBlock("green_concrete", STAIRS);
    public static final Block GREEN_CONCRETE_SLAB = registerColoredBlock("green_concrete", SLAB);
    public static final Block GREEN_CONCRETE_WALL = registerColoredBlock("green_concrete", WALL);
    public static final Block CYAN_CONCRETE_STAIRS = registerColoredBlock("cyan_concrete", STAIRS);
    public static final Block CYAN_CONCRETE_SLAB = registerColoredBlock("cyan_concrete", SLAB);
    public static final Block CYAN_CONCRETE_WALL = registerColoredBlock("cyan_concrete", WALL);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerColoredBlock("light_blue_concrete", STAIRS);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerColoredBlock("light_blue_concrete", SLAB);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerColoredBlock("light_blue_concrete", WALL);
    public static final Block BLUE_CONCRETE_STAIRS = registerColoredBlock("blue_concrete", STAIRS);
    public static final Block BLUE_CONCRETE_SLAB = registerColoredBlock("blue_concrete", SLAB);
    public static final Block BLUE_CONCRETE_WALL = registerColoredBlock("blue_concrete", WALL);
    public static final Block PURPLE_CONCRETE_STAIRS = registerColoredBlock("purple_concrete", STAIRS);
    public static final Block PURPLE_CONCRETE_SLAB = registerColoredBlock("purple_concrete", SLAB);
    public static final Block PURPLE_CONCRETE_WALL = registerColoredBlock("purple_concrete", WALL);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerColoredBlock("magenta_concrete", STAIRS);
    public static final Block MAGENTA_CONCRETE_SLAB = registerColoredBlock("magenta_concrete", SLAB);
    public static final Block MAGENTA_CONCRETE_WALL = registerColoredBlock("magenta_concrete", WALL);
    public static final Block PINK_CONCRETE_STAIRS = registerColoredBlock("pink_concrete", STAIRS);
    public static final Block PINK_CONCRETE_SLAB = registerColoredBlock("pink_concrete", SLAB);
    public static final Block PINK_CONCRETE_WALL = registerColoredBlock("pink_concrete", WALL);

    //TERRACOTTA

    public static final Block TERRACOTTA_STAIRS = registerColoredBlock("terracotta", STAIRS);
    public static final Block TERRACOTTA_SLAB = registerColoredBlock("terracotta", SLAB);
    public static final Block TERRACOTTA_WALL = registerColoredBlock("terracotta", WALL);
    public static final Block TERRACOTTA_BRICKS = registerColoredBlock("terracotta_bricks");
    public static final Block TERRACOTTA_BRICK_STAIRS = registerColoredBlock("terracotta_brick", STAIRS);
    public static final Block TERRACOTTA_BRICK_SLAB = registerColoredBlock("terracotta_brick", SLAB);
    public static final Block TERRACOTTA_BRICK_WALL = registerColoredBlock("terracotta_brick", WALL);

    //WHITE
    public static final Block WHITE_TERRACOTTA_STAIRS = registerColoredBlock("white_terracotta", STAIRS);
    public static final Block WHITE_TERRACOTTA_SLAB = registerColoredBlock("white_terracotta", SLAB);
    public static final Block WHITE_TERRACOTTA_WALL = registerColoredBlock("white_terracotta", WALL);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerColoredBlock("white_terracotta_bricks");
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("white_terracotta_brick", STAIRS);
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerColoredBlock("white_terracotta_brick", SLAB);
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerColoredBlock("white_terracotta_brick", WALL);

    //LIGHT_GRAY
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerColoredBlock("light_gray_terracotta", STAIRS);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerColoredBlock("light_gray_terracotta", SLAB);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerColoredBlock("light_gray_terracotta", WALL);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerColoredBlock("light_gray_terracotta_bricks");
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("light_gray_terracotta_brick", STAIRS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerColoredBlock("light_gray_terracotta_brick", SLAB);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerColoredBlock("light_gray_terracotta_brick", WALL);

    //GRAY
    public static final Block GRAY_TERRACOTTA_STAIRS = registerColoredBlock("gray_terracotta", STAIRS);
    public static final Block GRAY_TERRACOTTA_SLAB = registerColoredBlock("gray_terracotta", SLAB);
    public static final Block GRAY_TERRACOTTA_WALL = registerColoredBlock("gray_terracotta", WALL);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerColoredBlock("gray_terracotta_bricks");
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("gray_terracotta_brick", STAIRS);
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerColoredBlock("gray_terracotta_brick", SLAB);
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerColoredBlock("gray_terracotta_brick", WALL);

    //BLACK
    public static final Block BLACK_TERRACOTTA_STAIRS = registerColoredBlock("black_terracotta", STAIRS);
    public static final Block BLACK_TERRACOTTA_SLAB = registerColoredBlock("black_terracotta", SLAB);
    public static final Block BLACK_TERRACOTTA_WALL = registerColoredBlock("black_terracotta", WALL);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerColoredBlock("black_terracotta_bricks");
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("black_terracotta_brick", STAIRS);
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerColoredBlock("black_terracotta_brick", SLAB);
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerColoredBlock("black_terracotta_brick", WALL);

    //BROWN
    public static final Block BROWN_TERRACOTTA_STAIRS = registerColoredBlock("brown_terracotta", STAIRS);
    public static final Block BROWN_TERRACOTTA_SLAB = registerColoredBlock("brown_terracotta", SLAB);
    public static final Block BROWN_TERRACOTTA_WALL = registerColoredBlock("brown_terracotta", WALL);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerColoredBlock("brown_terracotta_bricks");
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("brown_terracotta_brick", STAIRS);
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerColoredBlock("brown_terracotta_brick", SLAB);
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerColoredBlock("brown_terracotta_brick", WALL);

    //RED
    public static final Block RED_TERRACOTTA_STAIRS = registerColoredBlock("red_terracotta", STAIRS);
    public static final Block RED_TERRACOTTA_SLAB = registerColoredBlock("red_terracotta", SLAB);
    public static final Block RED_TERRACOTTA_WALL = registerColoredBlock("red_terracotta", WALL);
    public static final Block RED_TERRACOTTA_BRICKS = registerColoredBlock("red_terracotta_bricks");
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("red_terracotta_brick", STAIRS);
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerColoredBlock("red_terracotta_brick", SLAB);
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerColoredBlock("red_terracotta_brick", WALL);

    //ORANGE
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerColoredBlock("orange_terracotta", STAIRS);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerColoredBlock("orange_terracotta", SLAB);
    public static final Block ORANGE_TERRACOTTA_WALL = registerColoredBlock("orange_terracotta", WALL);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerColoredBlock("orange_terracotta_bricks");
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("orange_terracotta_brick", STAIRS);
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerColoredBlock("orange_terracotta_brick", SLAB);
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerColoredBlock("orange_terracotta_brick", WALL);

    //YELLOW
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerColoredBlock("yellow_terracotta", STAIRS);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerColoredBlock("yellow_terracotta", SLAB);
    public static final Block YELLOW_TERRACOTTA_WALL = registerColoredBlock("yellow_terracotta", WALL);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerColoredBlock("yellow_terracotta_bricks");
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("yellow_terracotta_brick", STAIRS);
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerColoredBlock("yellow_terracotta_brick", SLAB);
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerColoredBlock("yellow_terracotta_brick", WALL);

    //LIME
    public static final Block LIME_TERRACOTTA_STAIRS = registerColoredBlock("lime_terracotta", STAIRS);
    public static final Block LIME_TERRACOTTA_SLAB = registerColoredBlock("lime_terracotta", SLAB);
    public static final Block LIME_TERRACOTTA_WALL = registerColoredBlock("lime_terracotta", WALL);
    public static final Block LIME_TERRACOTTA_BRICKS = registerColoredBlock("lime_terracotta_bricks");
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("lime_terracotta_brick", STAIRS);
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerColoredBlock("lime_terracotta_brick", SLAB);
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerColoredBlock("lime_terracotta_brick", WALL);

    //GREEN
    public static final Block GREEN_TERRACOTTA_STAIRS = registerColoredBlock("green_terracotta", STAIRS);
    public static final Block GREEN_TERRACOTTA_SLAB = registerColoredBlock("green_terracotta", SLAB);
    public static final Block GREEN_TERRACOTTA_WALL = registerColoredBlock("green_terracotta", WALL);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerColoredBlock("green_terracotta_bricks");
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("green_terracotta_brick", STAIRS);
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerColoredBlock("green_terracotta_brick", SLAB);
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerColoredBlock("green_terracotta_brick", WALL);

    //CYAN
    public static final Block CYAN_TERRACOTTA_STAIRS = registerColoredBlock("cyan_terracotta", STAIRS);
    public static final Block CYAN_TERRACOTTA_SLAB = registerColoredBlock("cyan_terracotta", SLAB);
    public static final Block CYAN_TERRACOTTA_WALL = registerColoredBlock("cyan_terracotta", WALL);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerColoredBlock("cyan_terracotta_bricks");
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("cyan_terracotta_brick", STAIRS);
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerColoredBlock("cyan_terracotta_brick", SLAB);
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerColoredBlock("cyan_terracotta_brick", WALL);

    //LIGHT_BLUE
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerColoredBlock("light_blue_terracotta", STAIRS);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerColoredBlock("light_blue_terracotta", SLAB);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerColoredBlock("light_blue_terracotta", WALL);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerColoredBlock("light_blue_terracotta_bricks");
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("light_blue_terracotta_brick", STAIRS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerColoredBlock("light_blue_terracotta_brick", SLAB);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerColoredBlock("light_blue_terracotta_brick", WALL);

    //BLUE
    public static final Block BLUE_TERRACOTTA_STAIRS = registerColoredBlock("blue_terracotta", STAIRS);
    public static final Block BLUE_TERRACOTTA_SLAB = registerColoredBlock("blue_terracotta", SLAB);
    public static final Block BLUE_TERRACOTTA_WALL = registerColoredBlock("blue_terracotta", WALL);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerColoredBlock("blue_terracotta_bricks");
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("blue_terracotta_brick", STAIRS);
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerColoredBlock("blue_terracotta_brick", SLAB);
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerColoredBlock("blue_terracotta_brick", WALL);

    //PURPLE
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerColoredBlock("purple_terracotta", STAIRS);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerColoredBlock("purple_terracotta", SLAB);
    public static final Block PURPLE_TERRACOTTA_WALL = registerColoredBlock("purple_terracotta", WALL);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerColoredBlock("purple_terracotta_bricks");
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("purple_terracotta_brick", STAIRS);
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerColoredBlock("purple_terracotta_brick", SLAB);
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerColoredBlock("purple_terracotta_brick", WALL);

    //MAGENTA
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerColoredBlock("magenta_terracotta", STAIRS);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerColoredBlock("magenta_terracotta", SLAB);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerColoredBlock("magenta_terracotta", WALL);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerColoredBlock("magenta_terracotta_bricks");
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("magenta_terracotta_brick", STAIRS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerColoredBlock("magenta_terracotta_brick", SLAB);
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerColoredBlock("magenta_terracotta_brick", WALL);

    //PINK
    public static final Block PINK_TERRACOTTA_STAIRS = registerColoredBlock("pink_terracotta", STAIRS);
    public static final Block PINK_TERRACOTTA_SLAB = registerColoredBlock("pink_terracotta", SLAB);
    public static final Block PINK_TERRACOTTA_WALL = registerColoredBlock("pink_terracotta", WALL);
    public static final Block PINK_TERRACOTTA_BRICKS = registerColoredBlock("pink_terracotta_bricks");
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerColoredBlock("pink_terracotta_brick", STAIRS);
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerColoredBlock("pink_terracotta_brick", SLAB);
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerColoredBlock("pink_terracotta_brick", WALL);

    //CHALK
    public static final Block CHALK = registerColoredBlock("chalk");
    public static final Block CHALK_STAIRS = registerColoredBlock("chalk", STAIRS);
    public static final Block CHALK_SLAB = registerColoredBlock("chalk", SLAB);
    public static final Block CHALK_WALL = registerColoredBlock("chalk", WALL);
    public static final Block CHALK_BRICKS = registerColoredBlock("chalk_bricks");
    public static final Block CHALK_BRICK_STAIRS = registerColoredBlock("chalk_brick", STAIRS);
    public static final Block CHALK_BRICK_SLAB = registerColoredBlock("chalk_brick", SLAB);
    public static final Block CHALK_BRICK_WALL = registerColoredBlock("chalk_brick", WALL);

    //WHITE
    public static final Block WHITE_CHALK = registerColoredBlock("white_chalk");
    public static final Block WHITE_CHALK_STAIRS = registerColoredBlock("white_chalk", STAIRS);
    public static final Block WHITE_CHALK_SLAB = registerColoredBlock("white_chalk", SLAB);
    public static final Block WHITE_CHALK_WALL = registerColoredBlock("white_chalk", WALL);
    public static final Block WHITE_CHALK_BRICKS = registerColoredBlock("white_chalk_bricks");
    public static final Block WHITE_CHALK_BRICK_STAIRS = registerColoredBlock("white_chalk_brick", STAIRS);
    public static final Block WHITE_CHALK_BRICK_SLAB = registerColoredBlock("white_chalk_brick", SLAB);
    public static final Block WHITE_CHALK_BRICK_WALL = registerColoredBlock("white_chalk_brick", WALL);

    //LIGHT_GRAY
    public static final Block LIGHT_GRAY_CHALK = registerColoredBlock("light_gray_chalk");
    public static final Block LIGHT_GRAY_CHALK_STAIRS = registerColoredBlock("light_gray_chalk", STAIRS);
    public static final Block LIGHT_GRAY_CHALK_SLAB = registerColoredBlock("light_gray_chalk", SLAB);
    public static final Block LIGHT_GRAY_CHALK_WALL = registerColoredBlock("light_gray_chalk", WALL);
    public static final Block LIGHT_GRAY_CHALK_BRICKS = registerColoredBlock("light_gray_chalk_bricks");
    public static final Block LIGHT_GRAY_CHALK_BRICK_STAIRS = registerColoredBlock("light_gray_chalk_brick", STAIRS);
    public static final Block LIGHT_GRAY_CHALK_BRICK_SLAB = registerColoredBlock("light_gray_chalk_brick", SLAB);
    public static final Block LIGHT_GRAY_CHALK_BRICK_WALL = registerColoredBlock("light_gray_chalk_brick", WALL);

    //GRAY
    public static final Block GRAY_CHALK = registerColoredBlock("gray_chalk");
    public static final Block GRAY_CHALK_STAIRS = registerColoredBlock("gray_chalk", STAIRS);
    public static final Block GRAY_CHALK_SLAB = registerColoredBlock("gray_chalk", SLAB);
    public static final Block GRAY_CHALK_WALL = registerColoredBlock("gray_chalk", WALL);
    public static final Block GRAY_CHALK_BRICKS = registerColoredBlock("gray_chalk_bricks");
    public static final Block GRAY_CHALK_BRICK_STAIRS = registerColoredBlock("gray_chalk_brick", STAIRS);
    public static final Block GRAY_CHALK_BRICK_SLAB = registerColoredBlock("gray_chalk_brick", SLAB);
    public static final Block GRAY_CHALK_BRICK_WALL = registerColoredBlock("gray_chalk_brick", WALL);

    //BLACK
    public static final Block BLACK_CHALK = registerColoredBlock("black_chalk");
    public static final Block BLACK_CHALK_STAIRS = registerColoredBlock("black_chalk", STAIRS);
    public static final Block BLACK_CHALK_SLAB = registerColoredBlock("black_chalk", SLAB);
    public static final Block BLACK_CHALK_WALL = registerColoredBlock("black_chalk", WALL);
    public static final Block BLACK_CHALK_BRICKS = registerColoredBlock("black_chalk_bricks");
    public static final Block BLACK_CHALK_BRICK_STAIRS = registerColoredBlock("black_chalk_brick", STAIRS);
    public static final Block BLACK_CHALK_BRICK_SLAB = registerColoredBlock("black_chalk_brick", SLAB);
    public static final Block BLACK_CHALK_BRICK_WALL = registerColoredBlock("black_chalk_brick", WALL);

    //BROWN
    public static final Block BROWN_CHALK = registerColoredBlock("brown_chalk");
    public static final Block BROWN_CHALK_STAIRS = registerColoredBlock("brown_chalk", STAIRS);
    public static final Block BROWN_CHALK_SLAB = registerColoredBlock("brown_chalk", SLAB);
    public static final Block BROWN_CHALK_WALL = registerColoredBlock("brown_chalk", WALL);
    public static final Block BROWN_CHALK_BRICKS = registerColoredBlock("brown_chalk_bricks");
    public static final Block BROWN_CHALK_BRICK_STAIRS = registerColoredBlock("brown_chalk_brick", STAIRS);
    public static final Block BROWN_CHALK_BRICK_SLAB = registerColoredBlock("brown_chalk_brick", SLAB);
    public static final Block BROWN_CHALK_BRICK_WALL = registerColoredBlock("brown_chalk_brick", WALL);

    //RED
    public static final Block RED_CHALK = registerColoredBlock("red_chalk");
    public static final Block RED_CHALK_STAIRS = registerColoredBlock("red_chalk", STAIRS);
    public static final Block RED_CHALK_SLAB = registerColoredBlock("red_chalk", SLAB);
    public static final Block RED_CHALK_WALL = registerColoredBlock("red_chalk", WALL);
    public static final Block RED_CHALK_BRICKS = registerColoredBlock("red_chalk_bricks");
    public static final Block RED_CHALK_BRICK_STAIRS = registerColoredBlock("red_chalk_brick", STAIRS);
    public static final Block RED_CHALK_BRICK_SLAB = registerColoredBlock("red_chalk_brick", SLAB);
    public static final Block RED_CHALK_BRICK_WALL = registerColoredBlock("red_chalk_brick", WALL);

    //ORANGE
    public static final Block ORANGE_CHALK = registerColoredBlock("orange_chalk");
    public static final Block ORANGE_CHALK_STAIRS = registerColoredBlock("orange_chalk", STAIRS);
    public static final Block ORANGE_CHALK_SLAB = registerColoredBlock("orange_chalk", SLAB);
    public static final Block ORANGE_CHALK_WALL = registerColoredBlock("orange_chalk", WALL);
    public static final Block ORANGE_CHALK_BRICKS = registerColoredBlock("orange_chalk_bricks");
    public static final Block ORANGE_CHALK_BRICK_STAIRS = registerColoredBlock("orange_chalk_brick", STAIRS);
    public static final Block ORANGE_CHALK_BRICK_SLAB = registerColoredBlock("orange_chalk_brick", SLAB);
    public static final Block ORANGE_CHALK_BRICK_WALL = registerColoredBlock("orange_chalk_brick", WALL);

    //YELLOW
    public static final Block YELLOW_CHALK = registerColoredBlock("yellow_chalk");
    public static final Block YELLOW_CHALK_STAIRS = registerColoredBlock("yellow_chalk", STAIRS);
    public static final Block YELLOW_CHALK_SLAB = registerColoredBlock("yellow_chalk", SLAB);
    public static final Block YELLOW_CHALK_WALL = registerColoredBlock("yellow_chalk", WALL);
    public static final Block YELLOW_CHALK_BRICKS = registerColoredBlock("yellow_chalk_bricks");
    public static final Block YELLOW_CHALK_BRICK_STAIRS = registerColoredBlock("yellow_chalk_brick", STAIRS);
    public static final Block YELLOW_CHALK_BRICK_SLAB = registerColoredBlock("yellow_chalk_brick", SLAB);
    public static final Block YELLOW_CHALK_BRICK_WALL = registerColoredBlock("yellow_chalk_brick", WALL);

    //LIME
    public static final Block LIME_CHALK = registerColoredBlock("lime_chalk");
    public static final Block LIME_CHALK_STAIRS = registerColoredBlock("lime_chalk", STAIRS);
    public static final Block LIME_CHALK_SLAB = registerColoredBlock("lime_chalk", SLAB);
    public static final Block LIME_CHALK_WALL = registerColoredBlock("lime_chalk", WALL);
    public static final Block LIME_CHALK_BRICKS = registerColoredBlock("lime_chalk_bricks");
    public static final Block LIME_CHALK_BRICK_STAIRS = registerColoredBlock("lime_chalk_brick", STAIRS);
    public static final Block LIME_CHALK_BRICK_SLAB = registerColoredBlock("lime_chalk_brick", SLAB);
    public static final Block LIME_CHALK_BRICK_WALL = registerColoredBlock("lime_chalk_brick", WALL);

    //GREEN
    public static final Block GREEN_CHALK = registerColoredBlock("green_chalk");
    public static final Block GREEN_CHALK_STAIRS = registerColoredBlock("green_chalk", STAIRS);
    public static final Block GREEN_CHALK_SLAB = registerColoredBlock("green_chalk", SLAB);
    public static final Block GREEN_CHALK_WALL = registerColoredBlock("green_chalk", WALL);
    public static final Block GREEN_CHALK_BRICKS = registerColoredBlock("green_chalk_bricks");
    public static final Block GREEN_CHALK_BRICK_STAIRS = registerColoredBlock("green_chalk_brick", STAIRS);
    public static final Block GREEN_CHALK_BRICK_SLAB = registerColoredBlock("green_chalk_brick", SLAB);
    public static final Block GREEN_CHALK_BRICK_WALL = registerColoredBlock("green_chalk_brick", WALL);

    //CYAN
    public static final Block CYAN_CHALK = registerColoredBlock("cyan_chalk");
    public static final Block CYAN_CHALK_STAIRS = registerColoredBlock("cyan_chalk", STAIRS);
    public static final Block CYAN_CHALK_SLAB = registerColoredBlock("cyan_chalk", SLAB);
    public static final Block CYAN_CHALK_WALL = registerColoredBlock("cyan_chalk", WALL);
    public static final Block CYAN_CHALK_BRICKS = registerColoredBlock("cyan_chalk_bricks");
    public static final Block CYAN_CHALK_BRICK_STAIRS = registerColoredBlock("cyan_chalk_brick", STAIRS);
    public static final Block CYAN_CHALK_BRICK_SLAB = registerColoredBlock("cyan_chalk_brick", SLAB);
    public static final Block CYAN_CHALK_BRICK_WALL = registerColoredBlock("cyan_chalk_brick", WALL);

    //LIGHT_BLUE
    public static final Block LIGHT_BLUE_CHALK = registerColoredBlock("light_blue_chalk");
    public static final Block LIGHT_BLUE_CHALK_STAIRS = registerColoredBlock("light_blue_chalk", STAIRS);
    public static final Block LIGHT_BLUE_CHALK_SLAB = registerColoredBlock("light_blue_chalk", SLAB);
    public static final Block LIGHT_BLUE_CHALK_WALL = registerColoredBlock("light_blue_chalk", WALL);
    public static final Block LIGHT_BLUE_CHALK_BRICKS = registerColoredBlock("light_blue_chalk_bricks");
    public static final Block LIGHT_BLUE_CHALK_BRICK_STAIRS = registerColoredBlock("light_blue_chalk_brick", STAIRS);
    public static final Block LIGHT_BLUE_CHALK_BRICK_SLAB = registerColoredBlock("light_blue_chalk_brick", SLAB);
    public static final Block LIGHT_BLUE_CHALK_BRICK_WALL = registerColoredBlock("light_blue_chalk_brick", WALL);

    //BLUE
    public static final Block BLUE_CHALK = registerColoredBlock("blue_chalk");
    public static final Block BLUE_CHALK_STAIRS = registerColoredBlock("blue_chalk", STAIRS);
    public static final Block BLUE_CHALK_SLAB = registerColoredBlock("blue_chalk", SLAB);
    public static final Block BLUE_CHALK_WALL = registerColoredBlock("blue_chalk", WALL);
    public static final Block BLUE_CHALK_BRICKS = registerColoredBlock("blue_chalk_bricks");
    public static final Block BLUE_CHALK_BRICK_STAIRS = registerColoredBlock("blue_chalk_brick", STAIRS);
    public static final Block BLUE_CHALK_BRICK_SLAB = registerColoredBlock("blue_chalk_brick", SLAB);
    public static final Block BLUE_CHALK_BRICK_WALL = registerColoredBlock("blue_chalk_brick", WALL);

    //PURPLE
    public static final Block PURPLE_CHALK = registerColoredBlock("purple_chalk");
    public static final Block PURPLE_CHALK_STAIRS = registerColoredBlock("purple_chalk", STAIRS);
    public static final Block PURPLE_CHALK_SLAB = registerColoredBlock("purple_chalk", SLAB);
    public static final Block PURPLE_CHALK_WALL = registerColoredBlock("purple_chalk", WALL);
    public static final Block PURPLE_CHALK_BRICKS = registerColoredBlock("purple_chalk_bricks");
    public static final Block PURPLE_CHALK_BRICK_STAIRS = registerColoredBlock("purple_chalk_brick", STAIRS);
    public static final Block PURPLE_CHALK_BRICK_SLAB = registerColoredBlock("purple_chalk_brick", SLAB);
    public static final Block PURPLE_CHALK_BRICK_WALL = registerColoredBlock("purple_chalk_brick", WALL);

    //MAGENTA
    public static final Block MAGENTA_CHALK = registerColoredBlock("magenta_chalk");
    public static final Block MAGENTA_CHALK_STAIRS = registerColoredBlock("magenta_chalk", STAIRS);
    public static final Block MAGENTA_CHALK_SLAB = registerColoredBlock("magenta_chalk", SLAB);
    public static final Block MAGENTA_CHALK_WALL = registerColoredBlock("magenta_chalk", WALL);
    public static final Block MAGENTA_CHALK_BRICKS = registerColoredBlock("magenta_chalk_bricks");
    public static final Block MAGENTA_CHALK_BRICK_STAIRS = registerColoredBlock("magenta_chalk_brick", STAIRS);
    public static final Block MAGENTA_CHALK_BRICK_SLAB = registerColoredBlock("magenta_chalk_brick", SLAB);
    public static final Block MAGENTA_CHALK_BRICK_WALL = registerColoredBlock("magenta_chalk_brick", WALL);

    //PINK
    public static final Block PINK_CHALK = registerColoredBlock("pink_chalk");
    public static final Block PINK_CHALK_STAIRS = registerColoredBlock("pink_chalk", STAIRS);
    public static final Block PINK_CHALK_SLAB = registerColoredBlock("pink_chalk", SLAB);
    public static final Block PINK_CHALK_WALL = registerColoredBlock("pink_chalk", WALL);
    public static final Block PINK_CHALK_BRICKS = registerColoredBlock("pink_chalk_bricks");
    public static final Block PINK_CHALK_BRICK_STAIRS = registerColoredBlock("pink_chalk_brick", STAIRS);
    public static final Block PINK_CHALK_BRICK_SLAB = registerColoredBlock("pink_chalk_brick", SLAB);
    public static final Block PINK_CHALK_BRICK_WALL = registerColoredBlock("pink_chalk_brick", WALL);


    private static Block registerColoredBlock(String name) {
        AbstractBlock.Settings settings;
        if (name.contains("concrete")) {
            settings = copy(Blocks.WHITE_CONCRETE).registryKey(keyOf(name));
        } else if (name.contains("terracotta")) {
            settings = copy(Blocks.TERRACOTTA).registryKey(keyOf(name));
        } else if (name.contains("chalk")) {
            settings = copy(Blocks.CALCITE).registryKey(keyOf(name));
        } else {
            settings = copy(Blocks.STONE).registryKey(keyOf(name));
        }
        return register(name, new Block(settings), true);
    }

    private static Block registerColoredBlock(String name, BlockFamily.Variant variant) {
        Block block;
        AbstractBlock.Settings settings;
        BlockState blockState;
        String blockName = name + "_" + variant.getName();

        if (name.contains("concrete")) {
            settings = copy(Blocks.WHITE_CONCRETE).registryKey(keyOf(blockName));
            blockState = Blocks.WHITE_CONCRETE.getDefaultState();
        } else if (name.contains("terracotta")) {
            settings = copy(Blocks.TERRACOTTA).registryKey(keyOf(blockName));
            blockState = Blocks.TERRACOTTA.getDefaultState();
        } else {
            settings = copy(Blocks.STONE).registryKey(keyOf(blockName));
            blockState = Blocks.STONE.getDefaultState();
        }

        switch (variant) {
            case STAIRS ->
                block = new StairsBlock(blockState, settings);
            case SLAB ->
                block = new SlabBlock(settings);
            case WALL ->
                block = new WallBlock(settings);
            default ->
                throw new IllegalStateException("Unexpected variant '" + variant + "' for" + name);
        }

        return register(blockName, block, true);
    }

    public static void registerColoredBlocks() {

        WithersOverhaul.LOGGER.info("Registering Colored Blocks for" + WithersOverhaul.MOD_ID);

    }

}
