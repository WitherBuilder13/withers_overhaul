package me.withers_overhaul.block.util;

import me.withers_overhaul.registry.block.ColoredBlocks;
import me.withers_overhaul.registry.block.StoneBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

import static me.withers_overhaul.registry.block.ColoredBlocks.*;
import static me.withers_overhaul.registry.block.StoneBlocks.*;
import static me.withers_overhaul.registry.block.WoodBlocks.*;

public class OverhaulBlockFamilies {

    // WOOD

    public static final BlockFamily MAPLE = BlockFamilies.register(MAPLE_PLANKS)
            .stairs(MAPLE_STAIRS)
            .slab(MAPLE_SLAB)
            .fence(MAPLE_FENCE)
            .fenceGate(MAPLE_FENCE_GATE)
            .door(MAPLE_DOOR)
            .trapdoor(MAPLE_TRAPDOOR)
            .pressurePlate(MAPLE_PRESSURE_PLATE)
            .button(MAPLE_BUTTON)
            .sign(MAPLE_SIGN, MAPLE_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily POPLAR = BlockFamilies.register(POPLAR_PLANKS)
            .stairs(POPLAR_STAIRS)
            .slab(POPLAR_SLAB)
            .fence(POPLAR_FENCE)
            .fenceGate(POPLAR_FENCE_GATE)
            .door(POPLAR_DOOR)
            .trapdoor(POPLAR_TRAPDOOR)
            .pressurePlate(POPLAR_PRESSURE_PLATE)
            .button(POPLAR_BUTTON)
            .sign(POPLAR_SIGN, POPLAR_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily BEECH = BlockFamilies.register(BEECH_PLANKS)
            .stairs(BEECH_STAIRS)
            .slab(BEECH_SLAB)
            .fence(BEECH_FENCE)
            .fenceGate(BEECH_FENCE_GATE)
            .door(BEECH_DOOR)
            .trapdoor(BEECH_TRAPDOOR)
            .pressurePlate(BEECH_PRESSURE_PLATE)
            .button(BEECH_BUTTON)
            .sign(BEECH_SIGN, BEECH_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily HICKORY = BlockFamilies.register(HICKORY_PLANKS)
            .stairs(HICKORY_STAIRS)
            .slab(HICKORY_SLAB)
            .fence(HICKORY_FENCE)
            .fenceGate(HICKORY_FENCE_GATE)
            .door(HICKORY_DOOR)
            .trapdoor(HICKORY_TRAPDOOR)
            .pressurePlate(HICKORY_PRESSURE_PLATE)
            .button(HICKORY_BUTTON)
            .sign(HICKORY_SIGN, HICKORY_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily WALNUT = BlockFamilies.register(WALNUT_PLANKS)
            .stairs(WALNUT_STAIRS)
            .slab(WALNUT_SLAB)
            .fence(WALNUT_FENCE)
            .fenceGate(WALNUT_FENCE_GATE)
            .door(WALNUT_DOOR)
            .trapdoor(WALNUT_TRAPDOOR)
            .pressurePlate(WALNUT_PRESSURE_PLATE)
            .button(WALNUT_BUTTON)
            .sign(WALNUT_SIGN, WALNUT_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily CHESTNUT = BlockFamilies.register(CHESTNUT_PLANKS)
            .stairs(CHESTNUT_STAIRS)
            .slab(CHESTNUT_SLAB)
            .fence(CHESTNUT_FENCE)
            .fenceGate(CHESTNUT_FENCE_GATE)
            .door(CHESTNUT_DOOR)
            .trapdoor(CHESTNUT_TRAPDOOR)
            .pressurePlate(CHESTNUT_PRESSURE_PLATE)
            .button(CHESTNUT_BUTTON)
            .sign(CHESTNUT_SIGN, CHESTNUT_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily CEDAR = BlockFamilies.register(CEDAR_PLANKS)
            .stairs(CEDAR_STAIRS)
            .slab(CEDAR_SLAB)
            .fence(CEDAR_FENCE)
            .fenceGate(CEDAR_FENCE_GATE)
            .door(CEDAR_DOOR)
            .trapdoor(CEDAR_TRAPDOOR)
            .pressurePlate(CEDAR_PRESSURE_PLATE)
            .button(CEDAR_BUTTON)
            .sign(CEDAR_SIGN, CEDAR_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily REDWOOD = BlockFamilies.register(REDWOOD_PLANKS)
            .stairs(REDWOOD_STAIRS)
            .slab(REDWOOD_SLAB)
            .fence(REDWOOD_FENCE)
            .fenceGate(REDWOOD_FENCE_GATE)
            .door(REDWOOD_DOOR)
            .trapdoor(REDWOOD_TRAPDOOR)
            .pressurePlate(REDWOOD_PRESSURE_PLATE)
            .button(REDWOOD_BUTTON)
            .sign(REDWOOD_SIGN, REDWOOD_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily FIR = BlockFamilies.register(FIR_PLANKS)
            .stairs(FIR_STAIRS)
            .slab(FIR_SLAB)
            .fence(FIR_FENCE)
            .fenceGate(FIR_FENCE_GATE)
            .door(FIR_DOOR)
            .trapdoor(FIR_TRAPDOOR)
            .pressurePlate(FIR_PRESSURE_PLATE)
            .button(FIR_BUTTON)
            .sign(FIR_SIGN, FIR_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily HEMLOCK = BlockFamilies.register(HEMLOCK_PLANKS)
            .stairs(HEMLOCK_STAIRS)
            .slab(HEMLOCK_SLAB)
            .fence(HEMLOCK_FENCE)
            .fenceGate(HEMLOCK_FENCE_GATE)
            .door(HEMLOCK_DOOR)
            .trapdoor(HEMLOCK_TRAPDOOR)
            .pressurePlate(HEMLOCK_PRESSURE_PLATE)
            .button(HEMLOCK_BUTTON)
            .sign(HEMLOCK_SIGN, HEMLOCK_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily HOLLY = BlockFamilies.register(HOLLY_PLANKS)
            .stairs(HOLLY_STAIRS)
            .slab(HOLLY_SLAB)
            .fence(HOLLY_FENCE)
            .fenceGate(HOLLY_FENCE_GATE)
            .door(HOLLY_DOOR)
            .trapdoor(HOLLY_TRAPDOOR)
            .pressurePlate(HOLLY_PRESSURE_PLATE)
            .button(HOLLY_BUTTON)
            .sign(HOLLY_SIGN, HOLLY_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily PINE = BlockFamilies.register(PINE_PLANKS)
            .stairs(PINE_STAIRS)
            .slab(PINE_SLAB)
            .fence(PINE_FENCE)
            .fenceGate(PINE_FENCE_GATE)
            .door(PINE_DOOR)
            .trapdoor(PINE_TRAPDOOR)
            .pressurePlate(PINE_PRESSURE_PLATE)
            .button(PINE_BUTTON)
            .sign(PINE_SIGN, PINE_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily LARCH = BlockFamilies.register(LARCH_PLANKS)
            .stairs(LARCH_STAIRS)
            .slab(LARCH_SLAB)
            .fence(LARCH_FENCE)
            .fenceGate(LARCH_FENCE_GATE)
            .door(LARCH_DOOR)
            .trapdoor(LARCH_TRAPDOOR)
            .pressurePlate(LARCH_PRESSURE_PLATE)
            .button(LARCH_BUTTON)
            .sign(LARCH_SIGN, LARCH_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily ASPEN = BlockFamilies.register(ASPEN_PLANKS)
            .stairs(ASPEN_STAIRS)
            .slab(ASPEN_SLAB)
            .fence(ASPEN_FENCE)
            .fenceGate(ASPEN_FENCE_GATE)
            .door(ASPEN_DOOR)
            .trapdoor(ASPEN_TRAPDOOR)
            .pressurePlate(ASPEN_PRESSURE_PLATE)
            .button(ASPEN_BUTTON)
            .sign(ASPEN_SIGN, ASPEN_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily KAPOK = BlockFamilies.register(KAPOK_PLANKS)
            .stairs(KAPOK_STAIRS)
            .slab(KAPOK_SLAB)
            .fence(KAPOK_FENCE)
            .fenceGate(KAPOK_FENCE_GATE)
            .door(KAPOK_DOOR)
            .trapdoor(KAPOK_TRAPDOOR)
            .pressurePlate(KAPOK_PRESSURE_PLATE)
            .button(KAPOK_BUTTON)
            .sign(KAPOK_SIGN, KAPOK_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily MAHOGANY = BlockFamilies.register(MAHOGANY_PLANKS)
            .stairs(MAHOGANY_STAIRS)
            .slab(MAHOGANY_SLAB)
            .fence(MAHOGANY_FENCE)
            .fenceGate(MAHOGANY_FENCE_GATE)
            .door(MAHOGANY_DOOR)
            .trapdoor(MAHOGANY_TRAPDOOR)
            .pressurePlate(MAHOGANY_PRESSURE_PLATE)
            .button(MAHOGANY_BUTTON)
            .sign(MAHOGANY_SIGN, MAHOGANY_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily EUCALYPTUS = BlockFamilies.register(EUCALYPTUS_PLANKS)
            .stairs(EUCALYPTUS_STAIRS)
            .slab(EUCALYPTUS_SLAB)
            .fence(EUCALYPTUS_FENCE)
            .fenceGate(EUCALYPTUS_FENCE_GATE)
            .door(EUCALYPTUS_DOOR)
            .trapdoor(EUCALYPTUS_TRAPDOOR)
            .pressurePlate(EUCALYPTUS_PRESSURE_PLATE)
            .button(EUCALYPTUS_BUTTON)
            .sign(EUCALYPTUS_SIGN, EUCALYPTUS_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily BAOBAB = BlockFamilies.register(BAOBAB_PLANKS)
            .stairs(BAOBAB_STAIRS)
            .slab(BAOBAB_SLAB)
            .fence(BAOBAB_FENCE)
            .fenceGate(BAOBAB_FENCE_GATE)
            .door(BAOBAB_DOOR)
            .trapdoor(BAOBAB_TRAPDOOR)
            .pressurePlate(BAOBAB_PRESSURE_PLATE)
            .button(BAOBAB_BUTTON)
            .sign(BAOBAB_SIGN, BAOBAB_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily PALO_VERDE = BlockFamilies.register(PALO_VERDE_PLANKS)
            .stairs(PALO_VERDE_STAIRS)
            .slab(PALO_VERDE_SLAB)
            .fence(PALO_VERDE_FENCE)
            .fenceGate(PALO_VERDE_FENCE_GATE)
            .door(PALO_VERDE_DOOR)
            .trapdoor(PALO_VERDE_TRAPDOOR)
            .pressurePlate(PALO_VERDE_PRESSURE_PLATE)
            .button(PALO_VERDE_BUTTON)
            .sign(PALO_VERDE_SIGN, PALO_VERDE_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily JOSHUA = BlockFamilies.register(JOSHUA_PLANKS)
            .stairs(JOSHUA_STAIRS)
            .slab(JOSHUA_SLAB)
            .fence(JOSHUA_FENCE)
            .fenceGate(JOSHUA_FENCE_GATE)
            .door(JOSHUA_DOOR)
            .trapdoor(JOSHUA_TRAPDOOR)
            .pressurePlate(JOSHUA_PRESSURE_PLATE)
            .button(JOSHUA_BUTTON)
            .sign(JOSHUA_SIGN, JOSHUA_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily JUNIPER = BlockFamilies.register(JUNIPER_PLANKS)
            .stairs(JUNIPER_STAIRS)
            .slab(JUNIPER_SLAB)
            .fence(JUNIPER_FENCE)
            .fenceGate(JUNIPER_FENCE_GATE)
            .door(JUNIPER_DOOR)
            .trapdoor(JUNIPER_TRAPDOOR)
            .pressurePlate(JUNIPER_PRESSURE_PLATE)
            .button(JUNIPER_BUTTON)
            .sign(JUNIPER_SIGN, JUNIPER_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily PALM = BlockFamilies.register(PALM_PLANKS)
            .stairs(PALM_STAIRS)
            .slab(PALM_SLAB)
            .fence(PALM_FENCE)
            .fenceGate(PALM_FENCE_GATE)
            .door(PALM_DOOR)
            .trapdoor(PALM_TRAPDOOR)
            .pressurePlate(PALM_PRESSURE_PLATE)
            .button(PALM_BUTTON)
            .sign(PALM_SIGN, PALM_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily EBONY = BlockFamilies.register(EBONY_PLANKS)
            .stairs(EBONY_STAIRS)
            .slab(EBONY_SLAB)
            .fence(EBONY_FENCE)
            .fenceGate(EBONY_FENCE_GATE)
            .door(EBONY_DOOR)
            .trapdoor(EBONY_TRAPDOOR)
            .pressurePlate(EBONY_PRESSURE_PLATE)
            .button(EBONY_BUTTON)
            .sign(EBONY_SIGN, EBONY_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily TEAK = BlockFamilies.register(TEAK_PLANKS)
            .stairs(TEAK_STAIRS)
            .slab(TEAK_SLAB)
            .fence(TEAK_FENCE)
            .fenceGate(TEAK_FENCE_GATE)
            .door(TEAK_DOOR)
            .trapdoor(TEAK_TRAPDOOR)
            .pressurePlate(TEAK_PRESSURE_PLATE)
            .button(TEAK_BUTTON)
            .sign(TEAK_SIGN, TEAK_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily ELM = BlockFamilies.register(ELM_PLANKS)
            .stairs(ELM_STAIRS)
            .slab(ELM_SLAB)
            .fence(ELM_FENCE)
            .fenceGate(ELM_FENCE_GATE)
            .door(ELM_DOOR)
            .trapdoor(ELM_TRAPDOOR)
            .pressurePlate(ELM_PRESSURE_PLATE)
            .button(ELM_BUTTON)
            .sign(ELM_SIGN, ELM_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily WILLOW = BlockFamilies.register(WILLOW_PLANKS)
            .stairs(WILLOW_STAIRS)
            .slab(WILLOW_SLAB)
            .fence(WILLOW_FENCE)
            .fenceGate(WILLOW_FENCE_GATE)
            .door(WILLOW_DOOR)
            .trapdoor(WILLOW_TRAPDOOR)
            .pressurePlate(WILLOW_PRESSURE_PLATE)
            .button(WILLOW_BUTTON)
            .sign(WILLOW_SIGN, WILLOW_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily CYPRESS = BlockFamilies.register(CYPRESS_PLANKS)
            .stairs(CYPRESS_STAIRS)
            .slab(CYPRESS_SLAB)
            .fence(CYPRESS_FENCE)
            .fenceGate(CYPRESS_FENCE_GATE)
            .door(CYPRESS_DOOR)
            .trapdoor(CYPRESS_TRAPDOOR)
            .pressurePlate(CYPRESS_PRESSURE_PLATE)
            .button(CYPRESS_BUTTON)
            .sign(CYPRESS_SIGN, CYPRESS_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily SAKURA = BlockFamilies.register(SAKURA_PLANKS)
            .stairs(SAKURA_STAIRS)
            .slab(SAKURA_SLAB)
            .fence(SAKURA_FENCE)
            .fenceGate(SAKURA_FENCE_GATE)
            .door(SAKURA_DOOR)
            .trapdoor(SAKURA_TRAPDOOR)
            .pressurePlate(SAKURA_PRESSURE_PLATE)
            .button(SAKURA_BUTTON)
            .sign(SAKURA_SIGN, SAKURA_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily MAGNOLIA = BlockFamilies.register(MAGNOLIA_PLANKS)
            .stairs(MAGNOLIA_STAIRS)
            .slab(MAGNOLIA_SLAB)
            .fence(MAGNOLIA_FENCE)
            .fenceGate(MAGNOLIA_FENCE_GATE)
            .door(MAGNOLIA_DOOR)
            .trapdoor(MAGNOLIA_TRAPDOOR)
            .pressurePlate(MAGNOLIA_PRESSURE_PLATE)
            .button(MAGNOLIA_BUTTON)
            .sign(MAGNOLIA_SIGN, MAGNOLIA_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily JACARANDA = BlockFamilies.register(JACARANDA_PLANKS)
            .stairs(JACARANDA_STAIRS)
            .slab(JACARANDA_SLAB)
            .fence(JACARANDA_FENCE)
            .fenceGate(JACARANDA_FENCE_GATE)
            .door(JACARANDA_DOOR)
            .trapdoor(JACARANDA_TRAPDOOR)
            .pressurePlate(JACARANDA_PRESSURE_PLATE)
            .button(JACARANDA_BUTTON)
            .sign(JACARANDA_SIGN, JACARANDA_WALL_SIGN)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    // STONE

    public static final BlockFamily GRANITE_BRICK = BlockFamilies.register(GRANITE_BRICKS)
            .stairs(GRANITE_BRICK_STAIRS)
            .slab(GRANITE_BRICK_SLAB)
            .wall(GRANITE_BRICK_WALL)
            .cracked(CRACKED_GRANITE_BRICKS)
            .chiseled(CHISELED_GRANITE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_GRANITE_BRICK = BlockFamilies.register(MOSSY_GRANITE_BRICKS)
            .stairs(MOSSY_GRANITE_BRICK_STAIRS)
            .slab(MOSSY_GRANITE_BRICK_SLAB)
            .wall(MOSSY_GRANITE_BRICK_WALL)
            .build();

    public static final BlockFamily DIORITE_BRICK = BlockFamilies.register(DIORITE_BRICKS)
            .stairs(DIORITE_BRICK_STAIRS)
            .slab(DIORITE_BRICK_SLAB)
            .wall(DIORITE_BRICK_WALL)
            .cracked(CRACKED_DIORITE_BRICKS)
            .chiseled(CHISELED_DIORITE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_DIORITE_BRICK = BlockFamilies.register(MOSSY_DIORITE_BRICKS)
            .stairs(MOSSY_DIORITE_BRICK_STAIRS)
            .slab(MOSSY_DIORITE_BRICK_SLAB)
            .wall(MOSSY_DIORITE_BRICK_WALL)
            .build();

    public static final BlockFamily ANDESITE_BRICK = BlockFamilies.register(ANDESITE_BRICKS)
            .stairs(ANDESITE_BRICK_STAIRS)
            .slab(ANDESITE_BRICK_SLAB)
            .wall(ANDESITE_BRICK_WALL)
            .cracked(CRACKED_ANDESITE_BRICKS)
            .chiseled(CHISELED_ANDESITE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_ANDESITE_BRICK = BlockFamilies.register(MOSSY_ANDESITE_BRICKS)
            .stairs(MOSSY_ANDESITE_BRICK_STAIRS)
            .slab(MOSSY_ANDESITE_BRICK_SLAB)
            .wall(MOSSY_ANDESITE_BRICK_WALL)
            .build();

    public static final BlockFamily GNEISS = BlockFamilies.register(StoneBlocks.GNEISS)
            .stairs(GNEISS_STAIRS)
            .slab(GNEISS_SLAB)
            .wall(GNEISS_WALL)
            .polished(StoneBlocks.POLISHED_GNEISS)
            .build();

    public static final BlockFamily POLISHED_GNEISS = BlockFamilies.register(StoneBlocks.POLISHED_GNEISS)
            .stairs(POLISHED_GNEISS_STAIRS)
            .slab(POLISHED_GNEISS_SLAB)
            .wall(POLISHED_GNEISS_WALL)
            .polished(GNEISS_BRICKS)
            .pressurePlate(POLISHED_GNEISS_PRESSURE_PLATE)
            .button(POLISHED_GNEISS_BUTTON)
            .build();

    public static final BlockFamily GNEISS_BRICK = BlockFamilies.register(GNEISS_BRICKS)
            .stairs(GNEISS_BRICK_STAIRS)
            .slab(GNEISS_BRICK_SLAB)
            .wall(GNEISS_BRICK_WALL)
            .cracked(CRACKED_GNEISS_BRICKS)
            .chiseled(CHISELED_GNEISS_BRICKS)
            .build();

    public static final BlockFamily MOSSY_GNEISS_BRICK = BlockFamilies.register(MOSSY_GNEISS_BRICKS)
            .stairs(MOSSY_GNEISS_BRICK_STAIRS)
            .slab(MOSSY_GNEISS_BRICK_SLAB)
            .wall(MOSSY_GNEISS_BRICK_WALL)
            .build();

    public static final BlockFamily SHALE = BlockFamilies.register(StoneBlocks.SHALE)
            .stairs(SHALE_STAIRS)
            .slab(SHALE_SLAB)
            .wall(SHALE_WALL)
            .polished(StoneBlocks.POLISHED_SHALE)
            .build();

    public static final BlockFamily POLISHED_SHALE = BlockFamilies.register(StoneBlocks.POLISHED_SHALE)
            .stairs(POLISHED_SHALE_STAIRS)
            .slab(POLISHED_SHALE_SLAB)
            .wall(POLISHED_SHALE_WALL)
            .polished(SHALE_BRICKS)
            .pressurePlate(POLISHED_SHALE_PRESSURE_PLATE)
            .button(POLISHED_SHALE_BUTTON)
            .build();

    public static final BlockFamily SHALE_BRICK = BlockFamilies.register(SHALE_BRICKS)
            .stairs(SHALE_BRICK_STAIRS)
            .slab(SHALE_BRICK_SLAB)
            .wall(SHALE_BRICK_WALL)
            .cracked(CRACKED_SHALE_BRICKS)
            .chiseled(CHISELED_SHALE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_SHALE_BRICK = BlockFamilies.register(MOSSY_SHALE_BRICKS)
            .stairs(MOSSY_SHALE_BRICK_STAIRS)
            .slab(MOSSY_SHALE_BRICK_SLAB)
            .wall(MOSSY_SHALE_BRICK_WALL)
            .build();

    public static final BlockFamily LIMESTONE = BlockFamilies.register(StoneBlocks.LIMESTONE)
            .stairs(LIMESTONE_STAIRS)
            .slab(LIMESTONE_SLAB)
            .wall(LIMESTONE_WALL)
            .polished(StoneBlocks.POLISHED_LIMESTONE)
            .build();

    public static final BlockFamily POLISHED_LIMESTONE = BlockFamilies.register(StoneBlocks.POLISHED_LIMESTONE)
            .stairs(POLISHED_LIMESTONE_STAIRS)
            .slab(POLISHED_LIMESTONE_SLAB)
            .wall(POLISHED_LIMESTONE_WALL)
            .polished(LIMESTONE_BRICKS)
            .pressurePlate(POLISHED_LIMESTONE_PRESSURE_PLATE)
            .button(POLISHED_LIMESTONE_BUTTON)
            .build();

    public static final BlockFamily LIMESTONE_BRICK = BlockFamilies.register(LIMESTONE_BRICKS)
            .stairs(LIMESTONE_BRICK_STAIRS)
            .slab(LIMESTONE_BRICK_SLAB)
            .wall(LIMESTONE_BRICK_WALL)
            .cracked(CRACKED_LIMESTONE_BRICKS)
            .chiseled(CHISELED_LIMESTONE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_LIMESTONE_BRICK = BlockFamilies.register(MOSSY_LIMESTONE_BRICKS)
            .stairs(MOSSY_LIMESTONE_BRICK_STAIRS)
            .slab(MOSSY_LIMESTONE_BRICK_SLAB)
            .wall(MOSSY_LIMESTONE_BRICK_WALL)
            .build();

    public static final BlockFamily MARBLE = BlockFamilies.register(StoneBlocks.MARBLE)
            .stairs(MARBLE_STAIRS)
            .slab(MARBLE_SLAB)
            .wall(MARBLE_WALL)
            .polished(StoneBlocks.POLISHED_MARBLE)
            .build();

    public static final BlockFamily POLISHED_MARBLE = BlockFamilies.register(StoneBlocks.POLISHED_MARBLE)
            .stairs(POLISHED_MARBLE_STAIRS)
            .slab(POLISHED_MARBLE_SLAB)
            .wall(POLISHED_MARBLE_WALL)
            .polished(MARBLE_BRICKS)
            .pressurePlate(POLISHED_MARBLE_PRESSURE_PLATE)
            .button(POLISHED_MARBLE_BUTTON)
            .build();

    public static final BlockFamily MARBLE_BRICK = BlockFamilies.register(MARBLE_BRICKS)
            .stairs(MARBLE_BRICK_STAIRS)
            .slab(MARBLE_BRICK_SLAB)
            .wall(MARBLE_BRICK_WALL)
            .cracked(CRACKED_MARBLE_BRICKS)
            .chiseled(CHISELED_MARBLE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_MARBLE_BRICK = BlockFamilies.register(MOSSY_MARBLE_BRICKS)
            .stairs(MOSSY_MARBLE_BRICK_STAIRS)
            .slab(MOSSY_MARBLE_BRICK_SLAB)
            .wall(MOSSY_MARBLE_BRICK_WALL)
            .build();

    public static final BlockFamily GABBRO = BlockFamilies.register(StoneBlocks.GABBRO)
            .stairs(GABBRO_STAIRS)
            .slab(GABBRO_SLAB)
            .wall(GABBRO_WALL)
            .polished(StoneBlocks.POLISHED_GABBRO)
            .build();

    public static final BlockFamily POLISHED_GABBRO = BlockFamilies.register(StoneBlocks.POLISHED_GABBRO)
            .stairs(POLISHED_GABBRO_STAIRS)
            .slab(POLISHED_GABBRO_SLAB)
            .wall(POLISHED_GABBRO_WALL)
            .polished(GABBRO_BRICKS)
            .pressurePlate(POLISHED_GABBRO_PRESSURE_PLATE)
            .button(POLISHED_GABBRO_BUTTON)
            .build();

    public static final BlockFamily GABBRO_BRICK = BlockFamilies.register(GABBRO_BRICKS)
            .stairs(GABBRO_BRICK_STAIRS)
            .slab(GABBRO_BRICK_SLAB)
            .wall(GABBRO_BRICK_WALL)
            .cracked(CRACKED_GABBRO_BRICKS)
            .chiseled(CHISELED_GABBRO_BRICKS)
            .build();

    public static final BlockFamily MOSSY_GABBRO_BRICK = BlockFamilies.register(MOSSY_GABBRO_BRICKS)
            .stairs(MOSSY_GABBRO_BRICK_STAIRS)
            .slab(MOSSY_GABBRO_BRICK_SLAB)
            .wall(MOSSY_GABBRO_BRICK_WALL)
            .build();

    public static final BlockFamily PHYLLITE = BlockFamilies.register(StoneBlocks.PHYLLITE)
            .stairs(PHYLLITE_STAIRS)
            .slab(PHYLLITE_SLAB)
            .wall(PHYLLITE_WALL)
            .polished(StoneBlocks.POLISHED_PHYLLITE)
            .build();

    public static final BlockFamily POLISHED_PHYLLITE = BlockFamilies.register(StoneBlocks.POLISHED_PHYLLITE)
            .stairs(POLISHED_PHYLLITE_STAIRS)
            .slab(POLISHED_PHYLLITE_SLAB)
            .wall(POLISHED_PHYLLITE_WALL)
            .polished(PHYLLITE_BRICKS)
            .pressurePlate(POLISHED_PHYLLITE_PRESSURE_PLATE)
            .button(POLISHED_PHYLLITE_BUTTON)
            .build();

    public static final BlockFamily PHYLLITE_BRICK = BlockFamilies.register(PHYLLITE_BRICKS)
            .stairs(PHYLLITE_BRICK_STAIRS)
            .slab(PHYLLITE_BRICK_SLAB)
            .wall(PHYLLITE_BRICK_WALL)
            .cracked(CRACKED_PHYLLITE_BRICKS)
            .chiseled(CHISELED_PHYLLITE_BRICKS)
            .build();

    public static final BlockFamily MOSSY_PHYLLITE_BRICK = BlockFamilies.register(MOSSY_PHYLLITE_BRICKS)
            .stairs(MOSSY_PHYLLITE_BRICK_STAIRS)
            .slab(MOSSY_PHYLLITE_BRICK_SLAB)
            .wall(MOSSY_PHYLLITE_BRICK_WALL)
            .build();

    public static final BlockFamily CALCITE = BlockFamilies.register(Blocks.CALCITE)
            .stairs(CALCITE_STAIRS)
            .slab(CALCITE_SLAB)
            .wall(CALCITE_WALL)
            .polished(StoneBlocks.POLISHED_CALCITE)
            .chiseled(CHISELED_CALCITE)
            .build();

    public static final BlockFamily POLISHED_CALCITE = BlockFamilies.register(StoneBlocks.POLISHED_CALCITE)
            .stairs(POLISHED_CALCITE_STAIRS)
            .slab(POLISHED_CALCITE_SLAB)
            .wall(POLISHED_CALCITE_WALL)
            .polished(CALCITE_BRICKS)
            .build();

    public static final BlockFamily CALCITE_BRICK = BlockFamilies.register(CALCITE_BRICKS)
            .stairs(CALCITE_BRICK_STAIRS)
            .slab(CALCITE_BRICK_SLAB)
            .wall(CALCITE_BRICK_WALL)
            .cracked(CRACKED_CALCITE_BRICKS)
            .build();

    public static final BlockFamily DRIPSTONE = BlockFamilies.register(Blocks.DRIPSTONE_BLOCK)
            .stairs(DRIPSTONE_STAIRS)
            .slab(DRIPSTONE_SLAB)
            .wall(DRIPSTONE_WALL)
            .polished(StoneBlocks.POLISHED_DRIPSTONE)
            .chiseled(CHISELED_DRIPSTONE)
            .build();

    public static final BlockFamily POLISHED_DRIPSTONE = BlockFamilies.register(StoneBlocks.POLISHED_DRIPSTONE)
            .stairs(POLISHED_DRIPSTONE_STAIRS)
            .slab(POLISHED_DRIPSTONE_SLAB)
            .wall(POLISHED_DRIPSTONE_WALL)
            .polished(DRIPSTONE_BRICKS)
            .build();

    public static final BlockFamily DRIPSTONE_BRICK = BlockFamilies.register(DRIPSTONE_BRICKS)
            .stairs(DRIPSTONE_BRICK_STAIRS)
            .slab(DRIPSTONE_BRICK_SLAB)
            .wall(DRIPSTONE_BRICK_WALL)
            .cracked(CRACKED_DRIPSTONE_BRICKS)
            .build();

    public static final BlockFamily ROUGH_SANDSTONE = BlockFamilies.register(StoneBlocks.ROUGH_SANDSTONE)
            .stairs(ROUGH_SANDSTONE_STAIRS)
            .slab(ROUGH_SANDSTONE_SLAB)
            .wall(ROUGH_SANDSTONE_WALL)
            .build();

    public static final BlockFamily ROUGH_RED_SANDSTONE = BlockFamilies.register(StoneBlocks.ROUGH_RED_SANDSTONE)
            .stairs(ROUGH_RED_SANDSTONE_STAIRS)
            .slab(ROUGH_RED_SANDSTONE_SLAB)
            .wall(ROUGH_RED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily FROSTED_SANDSTONE = BlockFamilies.register(StoneBlocks.FROSTED_SANDSTONE)
            .stairs(FROSTED_SANDSTONE_STAIRS)
            .slab(FROSTED_SANDSTONE_SLAB)
            .wall(FROSTED_SANDSTONE_WALL)
            .chiseled(CHISELED_FROSTED_SANDSTONE)
            .polished(StoneBlocks.CUT_FROSTED_SANDSTONE)
            .build();

    public static final BlockFamily CUT_FROSTED_SANDSTONE = BlockFamilies.register(StoneBlocks.CUT_FROSTED_SANDSTONE)
            .stairs(CUT_FROSTED_SANDSTONE_STAIRS)
            .slab(CUT_FROSTED_SANDSTONE_SLAB)
            .wall(CUT_FROSTED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily SMOOTH_FROSTED_SANDSTONE = BlockFamilies.register(StoneBlocks.SMOOTH_FROSTED_SANDSTONE)
            .stairs(SMOOTH_FROSTED_SANDSTONE_STAIRS)
            .slab(SMOOTH_FROSTED_SANDSTONE_SLAB)
            .wall(SMOOTH_FROSTED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily ROUGH_FROSTED_SANDSTONE = BlockFamilies.register(StoneBlocks.ROUGH_FROSTED_SANDSTONE)
            .stairs(ROUGH_FROSTED_SANDSTONE_STAIRS)
            .slab(ROUGH_FROSTED_SANDSTONE_SLAB)
            .wall(ROUGH_FROSTED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily CHARRED_SANDSTONE = BlockFamilies.register(StoneBlocks.CHARRED_SANDSTONE)
            .stairs(CHARRED_SANDSTONE_STAIRS)
            .slab(CHARRED_SANDSTONE_SLAB)
            .wall(CHARRED_SANDSTONE_WALL)
            .chiseled(CHISELED_CHARRED_SANDSTONE)
            .polished(StoneBlocks.CUT_CHARRED_SANDSTONE)
            .build();

    public static final BlockFamily CUT_CHARRED_SANDSTONE = BlockFamilies.register(StoneBlocks.CUT_CHARRED_SANDSTONE)
            .stairs(CUT_CHARRED_SANDSTONE_STAIRS)
            .slab(CUT_CHARRED_SANDSTONE_SLAB)
            .wall(CUT_CHARRED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily SMOOTH_CHARRED_SANDSTONE = BlockFamilies.register(StoneBlocks.SMOOTH_CHARRED_SANDSTONE)
            .stairs(SMOOTH_CHARRED_SANDSTONE_STAIRS)
            .slab(SMOOTH_CHARRED_SANDSTONE_SLAB)
            .wall(SMOOTH_CHARRED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily ROUGH_CHARRED_SANDSTONE = BlockFamilies.register(StoneBlocks.ROUGH_CHARRED_SANDSTONE)
            .stairs(ROUGH_CHARRED_SANDSTONE_STAIRS)
            .slab(ROUGH_CHARRED_SANDSTONE_SLAB)
            .wall(ROUGH_CHARRED_SANDSTONE_WALL)
            .build();

    public static final BlockFamily BLUE_NETHER_BRICK = BlockFamilies.register(BLUE_NETHER_BRICKS)
            .stairs(BLUE_NETHER_BRICK_STAIRS)
            .slab(BLUE_NETHER_BRICK_SLAB)
            .wall(BLUE_NETHER_BRICK_WALL)
            .fence(BLUE_NETHER_BRICK_FENCE)
            .cracked(CRACKED_BLUE_NETHER_BRICKS)
            .chiseled(CHISELED_BLUE_NETHER_BRICKS)
            .build();

    public static final BlockFamily QUARTZ_BRICK = BlockFamilies.register(Blocks.QUARTZ_BRICKS)
            .stairs(QUARTZ_BRICK_STAIRS)
            .slab(QUARTZ_BRICK_SLAB)
            .wall(QUARTZ_BRICK_WALL)
            .cracked(CRACKED_QUARTZ_BRICKS)
            .build();

    public static final BlockFamily AMETHYST = BlockFamilies.register(Blocks.AMETHYST_BLOCK)
            .stairs(AMETHYST_STAIRS)
            .slab(AMETHYST_SLAB)
            .wall(AMETHYST_WALL)
            .polished(AMETHYST_BRICKS)
            .chiseled(CHISELED_AMETHYST)
            .build();

    public static final BlockFamily AMETHYST_BRICK = BlockFamilies.register(StoneBlocks.AMETHYST_BRICKS)
            .stairs(AMETHYST_BRICK_STAIRS)
            .slab(AMETHYST_BRICK_SLAB)
            .wall(AMETHYST_BRICK_WALL)
            .polished(AMETHYST_TILES)
            .cracked(CRACKED_AMETHYST_BRICKS)
            .build();

    public static final BlockFamily AMETHYST_TILE = BlockFamilies.register(StoneBlocks.AMETHYST_TILES)
            .stairs(AMETHYST_TILE_STAIRS)
            .slab(AMETHYST_TILE_SLAB)
            .wall(AMETHYST_TILE_WALL)
            .cracked(CRACKED_AMETHYST_TILES)
            .build();

    public static final BlockFamily DOLOMITE = BlockFamilies.register(StoneBlocks.DOLOMITE)
            .stairs(DOLOMITE_STAIRS)
            .slab(DOLOMITE_SLAB)
            .wall(DOLOMITE_WALL)
            .polished(DOLOMITE_BRICKS)
            .chiseled(CHISELED_DOLOMITE)
            .build();

    public static final BlockFamily DOLOMITE_BRICK = BlockFamilies.register(StoneBlocks.DOLOMITE_BRICKS)
            .stairs(DOLOMITE_BRICK_STAIRS)
            .slab(DOLOMITE_BRICK_SLAB)
            .wall(DOLOMITE_BRICK_WALL)
            .polished(DOLOMITE_TILES)
            .cracked(CRACKED_DOLOMITE_BRICKS)
            .build();

    public static final BlockFamily DOLOMITE_TILE = BlockFamilies.register(StoneBlocks.DOLOMITE_TILES)
            .stairs(DOLOMITE_TILE_STAIRS)
            .slab(DOLOMITE_TILE_SLAB)
            .wall(DOLOMITE_TILE_WALL)
            .cracked(CRACKED_DOLOMITE_TILES)
            .build();

    public static final BlockFamily GYPSUM = BlockFamilies.register(StoneBlocks.GYPSUM)
            .stairs(GYPSUM_STAIRS)
            .slab(GYPSUM_SLAB)
            .wall(GYPSUM_WALL)
            .polished(GYPSUM_BRICKS)
            .chiseled(CHISELED_GYPSUM)
            .build();

    public static final BlockFamily GYPSUM_BRICK = BlockFamilies.register(StoneBlocks.GYPSUM_BRICKS)
            .stairs(GYPSUM_BRICK_STAIRS)
            .slab(GYPSUM_BRICK_SLAB)
            .wall(GYPSUM_BRICK_WALL)
            .polished(GYPSUM_TILES)
            .cracked(CRACKED_GYPSUM_BRICKS)
            .build();

    public static final BlockFamily GYPSUM_TILE = BlockFamilies.register(StoneBlocks.GYPSUM_TILES)
            .stairs(GYPSUM_TILE_STAIRS)
            .slab(GYPSUM_TILE_SLAB)
            .wall(GYPSUM_TILE_WALL)
            .cracked(CRACKED_GYPSUM_TILES)
            .build();

    public static final BlockFamily WHITE_CONCRETE = BlockFamilies.register(Blocks.WHITE_CONCRETE)
            .stairs(WHITE_CONCRETE_STAIRS)
            .slab(WHITE_CONCRETE_SLAB)
            .wall(WHITE_CONCRETE_WALL)
            .build();

    public static final BlockFamily LIGHT_GRAY_CONCRETE = BlockFamilies.register(Blocks.LIGHT_GRAY_CONCRETE)
            .stairs(LIGHT_GRAY_CONCRETE_STAIRS)
            .slab(LIGHT_GRAY_CONCRETE_SLAB)
            .wall(LIGHT_GRAY_CONCRETE_WALL)
            .build();

    public static final BlockFamily GRAY_CONCRETE = BlockFamilies.register(Blocks.GRAY_CONCRETE)
            .stairs(GRAY_CONCRETE_STAIRS)
            .slab(GRAY_CONCRETE_SLAB)
            .wall(GRAY_CONCRETE_WALL)
            .build();

    public static final BlockFamily BLACK_CONCRETE = BlockFamilies.register(Blocks.BLACK_CONCRETE)
            .stairs(BLACK_CONCRETE_STAIRS)
            .slab(BLACK_CONCRETE_SLAB)
            .wall(BLACK_CONCRETE_WALL)
            .build();

    public static final BlockFamily BROWN_CONCRETE = BlockFamilies.register(Blocks.BROWN_CONCRETE)
            .stairs(BROWN_CONCRETE_STAIRS)
            .slab(BROWN_CONCRETE_SLAB)
            .wall(BROWN_CONCRETE_WALL)
            .build();

    public static final BlockFamily RED_CONCRETE = BlockFamilies.register(Blocks.RED_CONCRETE)
            .stairs(RED_CONCRETE_STAIRS)
            .slab(RED_CONCRETE_SLAB)
            .wall(RED_CONCRETE_WALL)
            .build();

    public static final BlockFamily ORANGE_CONCRETE = BlockFamilies.register(Blocks.ORANGE_CONCRETE)
            .stairs(ORANGE_CONCRETE_STAIRS)
            .slab(ORANGE_CONCRETE_SLAB)
            .wall(ORANGE_CONCRETE_WALL)
            .build();

    public static final BlockFamily YELLOW_CONCRETE = BlockFamilies.register(Blocks.YELLOW_CONCRETE)
            .stairs(YELLOW_CONCRETE_STAIRS)
            .slab(YELLOW_CONCRETE_SLAB)
            .wall(YELLOW_CONCRETE_WALL)
            .build();

    public static final BlockFamily LIME_CONCRETE = BlockFamilies.register(Blocks.LIME_CONCRETE)
            .stairs(LIME_CONCRETE_STAIRS)
            .slab(LIME_CONCRETE_SLAB)
            .wall(LIME_CONCRETE_WALL)
            .build();

    public static final BlockFamily GREEN_CONCRETE = BlockFamilies.register(Blocks.GREEN_CONCRETE)
            .stairs(GREEN_CONCRETE_STAIRS)
            .slab(GREEN_CONCRETE_SLAB)
            .wall(GREEN_CONCRETE_WALL)
            .build();

    public static final BlockFamily CYAN_CONCRETE = BlockFamilies.register(Blocks.CYAN_CONCRETE)
            .stairs(CYAN_CONCRETE_STAIRS)
            .slab(CYAN_CONCRETE_SLAB)
            .wall(CYAN_CONCRETE_WALL)
            .build();

    public static final BlockFamily LIGHT_BLUE_CONCRETE = BlockFamilies.register(Blocks.LIGHT_BLUE_CONCRETE)
            .stairs(LIGHT_BLUE_CONCRETE_STAIRS)
            .slab(LIGHT_BLUE_CONCRETE_SLAB)
            .wall(LIGHT_BLUE_CONCRETE_WALL)
            .build();

    public static final BlockFamily BLUE_CONCRETE = BlockFamilies.register(Blocks.BLUE_CONCRETE)
            .stairs(BLUE_CONCRETE_STAIRS)
            .slab(BLUE_CONCRETE_SLAB)
            .wall(BLUE_CONCRETE_WALL)
            .build();

    public static final BlockFamily PURPLE_CONCRETE = BlockFamilies.register(Blocks.PURPLE_CONCRETE)
            .stairs(PURPLE_CONCRETE_STAIRS)
            .slab(PURPLE_CONCRETE_SLAB)
            .wall(PURPLE_CONCRETE_WALL)
            .build();

    public static final BlockFamily MAGENTA_CONCRETE = BlockFamilies.register(Blocks.MAGENTA_CONCRETE)
            .stairs(MAGENTA_CONCRETE_STAIRS)
            .slab(MAGENTA_CONCRETE_SLAB)
            .wall(MAGENTA_CONCRETE_WALL)
            .build();

    public static final BlockFamily PINK_CONCRETE = BlockFamilies.register(Blocks.PINK_CONCRETE)
            .stairs(PINK_CONCRETE_STAIRS)
            .slab(PINK_CONCRETE_SLAB)
            .wall(PINK_CONCRETE_WALL)
            .build();

    public static final BlockFamily TERRACOTTA = BlockFamilies.register(Blocks.TERRACOTTA)
            .stairs(TERRACOTTA_STAIRS)
            .slab(TERRACOTTA_SLAB)
            .wall(TERRACOTTA_WALL)
            .polished(TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily WHITE_TERRACOTTA = BlockFamilies.register(Blocks.WHITE_TERRACOTTA)
            .stairs(WHITE_TERRACOTTA_STAIRS)
            .slab(WHITE_TERRACOTTA_SLAB)
            .wall(WHITE_TERRACOTTA_WALL)
            .polished(WHITE_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily LIGHT_GRAY_TERRACOTTA = BlockFamilies.register(Blocks.LIGHT_GRAY_TERRACOTTA)
            .stairs(LIGHT_GRAY_TERRACOTTA_STAIRS)
            .slab(LIGHT_GRAY_TERRACOTTA_SLAB)
            .wall(LIGHT_GRAY_TERRACOTTA_WALL)
            .polished(LIGHT_GRAY_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily GRAY_TERRACOTTA = BlockFamilies.register(Blocks.GRAY_TERRACOTTA)
            .stairs(GRAY_TERRACOTTA_STAIRS)
            .slab(GRAY_TERRACOTTA_SLAB)
            .wall(GRAY_TERRACOTTA_WALL)
            .polished(GRAY_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily BLACK_TERRACOTTA = BlockFamilies.register(Blocks.BLACK_TERRACOTTA)
            .stairs(BLACK_TERRACOTTA_STAIRS)
            .slab(BLACK_TERRACOTTA_SLAB)
            .wall(BLACK_TERRACOTTA_WALL)
            .polished(BLACK_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily BROWN_TERRACOTTA = BlockFamilies.register(Blocks.BROWN_TERRACOTTA)
            .stairs(BROWN_TERRACOTTA_STAIRS)
            .slab(BROWN_TERRACOTTA_SLAB)
            .wall(BROWN_TERRACOTTA_WALL)
            .polished(BROWN_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily RED_TERRACOTTA = BlockFamilies.register(Blocks.RED_TERRACOTTA)
            .stairs(RED_TERRACOTTA_STAIRS)
            .slab(RED_TERRACOTTA_SLAB)
            .wall(RED_TERRACOTTA_WALL)
            .polished(RED_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily ORANGE_TERRACOTTA = BlockFamilies.register(Blocks.ORANGE_TERRACOTTA)
            .stairs(ORANGE_TERRACOTTA_STAIRS)
            .slab(ORANGE_TERRACOTTA_SLAB)
            .wall(ORANGE_TERRACOTTA_WALL)
            .polished(ORANGE_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily YELLOW_TERRACOTTA = BlockFamilies.register(Blocks.YELLOW_TERRACOTTA)
            .stairs(YELLOW_TERRACOTTA_STAIRS)
            .slab(YELLOW_TERRACOTTA_SLAB)
            .wall(YELLOW_TERRACOTTA_WALL)
            .polished(YELLOW_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily LIME_TERRACOTTA = BlockFamilies.register(Blocks.LIME_TERRACOTTA)
            .stairs(LIME_TERRACOTTA_STAIRS)
            .slab(LIME_TERRACOTTA_SLAB)
            .wall(LIME_TERRACOTTA_WALL)
            .polished(LIME_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily GREEN_TERRACOTTA = BlockFamilies.register(Blocks.GREEN_TERRACOTTA)
            .stairs(GREEN_TERRACOTTA_STAIRS)
            .slab(GREEN_TERRACOTTA_SLAB)
            .wall(GREEN_TERRACOTTA_WALL)
            .polished(GREEN_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily CYAN_TERRACOTTA = BlockFamilies.register(Blocks.CYAN_TERRACOTTA)
            .stairs(CYAN_TERRACOTTA_STAIRS)
            .slab(CYAN_TERRACOTTA_SLAB)
            .wall(CYAN_TERRACOTTA_WALL)
            .polished(CYAN_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily LIGHT_BLUE_TERRACOTTA = BlockFamilies.register(Blocks.LIGHT_BLUE_TERRACOTTA)
            .stairs(LIGHT_BLUE_TERRACOTTA_STAIRS)
            .slab(LIGHT_BLUE_TERRACOTTA_SLAB)
            .wall(LIGHT_BLUE_TERRACOTTA_WALL)
            .polished(LIGHT_BLUE_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily BLUE_TERRACOTTA = BlockFamilies.register(Blocks.BLUE_TERRACOTTA)
            .stairs(BLUE_TERRACOTTA_STAIRS)
            .slab(BLUE_TERRACOTTA_SLAB)
            .wall(BLUE_TERRACOTTA_WALL)
            .polished(BLUE_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily PURPLE_TERRACOTTA = BlockFamilies.register(Blocks.PURPLE_TERRACOTTA)
            .stairs(PURPLE_TERRACOTTA_STAIRS)
            .slab(PURPLE_TERRACOTTA_SLAB)
            .wall(PURPLE_TERRACOTTA_WALL)
            .polished(PURPLE_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily MAGENTA_TERRACOTTA = BlockFamilies.register(Blocks.MAGENTA_TERRACOTTA)
            .stairs(MAGENTA_TERRACOTTA_STAIRS)
            .slab(MAGENTA_TERRACOTTA_SLAB)
            .wall(MAGENTA_TERRACOTTA_WALL)
            .polished(MAGENTA_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily PINK_TERRACOTTA = BlockFamilies.register(Blocks.PINK_TERRACOTTA)
            .stairs(PINK_TERRACOTTA_STAIRS)
            .slab(PINK_TERRACOTTA_SLAB)
            .wall(PINK_TERRACOTTA_WALL)
            .polished(PINK_TERRACOTTA_BRICKS)
            .build();

    public static final BlockFamily TERRACOTTA_BRICK = BlockFamilies.register(TERRACOTTA_BRICKS)
            .stairs(TERRACOTTA_BRICK_STAIRS)
            .slab(TERRACOTTA_BRICK_SLAB)
            .wall(TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily WHITE_TERRACOTTA_BRICK = BlockFamilies.register(WHITE_TERRACOTTA_BRICKS)
            .stairs(WHITE_TERRACOTTA_BRICK_STAIRS)
            .slab(WHITE_TERRACOTTA_BRICK_SLAB)
            .wall(WHITE_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily LIGHT_GRAY_TERRACOTTA_BRICK = BlockFamilies.register(LIGHT_GRAY_TERRACOTTA_BRICKS)
            .stairs(LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS)
            .slab(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB)
            .wall(LIGHT_GRAY_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily GRAY_TERRACOTTA_BRICK = BlockFamilies.register(GRAY_TERRACOTTA_BRICKS)
            .stairs(GRAY_TERRACOTTA_BRICK_STAIRS)
            .slab(GRAY_TERRACOTTA_BRICK_SLAB)
            .wall(GRAY_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily BLACK_TERRACOTTA_BRICK = BlockFamilies.register(BLACK_TERRACOTTA_BRICKS)
            .stairs(BLACK_TERRACOTTA_BRICK_STAIRS)
            .slab(BLACK_TERRACOTTA_BRICK_SLAB)
            .wall(BLACK_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily BROWN_TERRACOTTA_BRICK = BlockFamilies.register(BROWN_TERRACOTTA_BRICKS)
            .stairs(BROWN_TERRACOTTA_BRICK_STAIRS)
            .slab(BROWN_TERRACOTTA_BRICK_SLAB)
            .wall(BROWN_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily RED_TERRACOTTA_BRICK = BlockFamilies.register(RED_TERRACOTTA_BRICKS)
            .stairs(RED_TERRACOTTA_BRICK_STAIRS)
            .slab(RED_TERRACOTTA_BRICK_SLAB)
            .wall(RED_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily ORANGE_TERRACOTTA_BRICK = BlockFamilies.register(ORANGE_TERRACOTTA_BRICKS)
            .stairs(ORANGE_TERRACOTTA_BRICK_STAIRS)
            .slab(ORANGE_TERRACOTTA_BRICK_SLAB)
            .wall(ORANGE_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily YELLOW_TERRACOTTA_BRICK = BlockFamilies.register(YELLOW_TERRACOTTA_BRICKS)
            .stairs(YELLOW_TERRACOTTA_BRICK_STAIRS)
            .slab(YELLOW_TERRACOTTA_BRICK_SLAB)
            .wall(YELLOW_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily LIME_TERRACOTTA_BRICK = BlockFamilies.register(LIME_TERRACOTTA_BRICKS)
            .stairs(LIME_TERRACOTTA_BRICK_STAIRS)
            .slab(LIME_TERRACOTTA_BRICK_SLAB)
            .wall(LIME_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily GREEN_TERRACOTTA_BRICK = BlockFamilies.register(GREEN_TERRACOTTA_BRICKS)
            .stairs(GREEN_TERRACOTTA_BRICK_STAIRS)
            .slab(GREEN_TERRACOTTA_BRICK_SLAB)
            .wall(GREEN_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily CYAN_TERRACOTTA_BRICK = BlockFamilies.register(CYAN_TERRACOTTA_BRICKS)
            .stairs(CYAN_TERRACOTTA_BRICK_STAIRS)
            .slab(CYAN_TERRACOTTA_BRICK_SLAB)
            .wall(CYAN_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily LIGHT_BLUE_TERRACOTTA_BRICK = BlockFamilies.register(LIGHT_BLUE_TERRACOTTA_BRICKS)
            .stairs(LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS)
            .slab(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB)
            .wall(LIGHT_BLUE_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily BLUE_TERRACOTTA_BRICK = BlockFamilies.register(BLUE_TERRACOTTA_BRICKS)
            .stairs(BLUE_TERRACOTTA_BRICK_STAIRS)
            .slab(BLUE_TERRACOTTA_BRICK_SLAB)
            .wall(BLUE_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily PURPLE_TERRACOTTA_BRICK = BlockFamilies.register(PURPLE_TERRACOTTA_BRICKS)
            .stairs(PURPLE_TERRACOTTA_BRICK_STAIRS)
            .slab(PURPLE_TERRACOTTA_BRICK_SLAB)
            .wall(PURPLE_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily MAGENTA_TERRACOTTA_BRICK = BlockFamilies.register(MAGENTA_TERRACOTTA_BRICKS)
            .stairs(MAGENTA_TERRACOTTA_BRICK_STAIRS)
            .slab(MAGENTA_TERRACOTTA_BRICK_SLAB)
            .wall(MAGENTA_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily PINK_TERRACOTTA_BRICK = BlockFamilies.register(PINK_TERRACOTTA_BRICKS)
            .stairs(PINK_TERRACOTTA_BRICK_STAIRS)
            .slab(PINK_TERRACOTTA_BRICK_SLAB)
            .wall(PINK_TERRACOTTA_BRICK_WALL)
            .build();

    public static final BlockFamily CHALK = BlockFamilies.register(ColoredBlocks.CHALK)
            .stairs(CHALK_STAIRS)
            .slab(CHALK_SLAB)
            .wall(CHALK_WALL)
            .polished(CHALK_BRICKS)
            .build();

    public static final BlockFamily WHITE_CHALK = BlockFamilies.register(ColoredBlocks.WHITE_CHALK)
            .stairs(WHITE_CHALK_STAIRS)
            .slab(WHITE_CHALK_SLAB)
            .wall(WHITE_CHALK_WALL)
            .polished(WHITE_CHALK_BRICKS)
            .build();

    public static final BlockFamily LIGHT_GRAY_CHALK = BlockFamilies.register(ColoredBlocks.LIGHT_GRAY_CHALK)
            .stairs(LIGHT_GRAY_CHALK_STAIRS)
            .slab(LIGHT_GRAY_CHALK_SLAB)
            .wall(LIGHT_GRAY_CHALK_WALL)
            .polished(LIGHT_GRAY_CHALK_BRICKS)
            .build();

    public static final BlockFamily GRAY_CHALK = BlockFamilies.register(ColoredBlocks.GRAY_CHALK)
            .stairs(GRAY_CHALK_STAIRS)
            .slab(GRAY_CHALK_SLAB)
            .wall(GRAY_CHALK_WALL)
            .polished(GRAY_CHALK_BRICKS)
            .build();

    public static final BlockFamily BLACK_CHALK = BlockFamilies.register(ColoredBlocks.BLACK_CHALK)
            .stairs(BLACK_CHALK_STAIRS)
            .slab(BLACK_CHALK_SLAB)
            .wall(BLACK_CHALK_WALL)
            .polished(BLACK_CHALK_BRICKS)
            .build();

    public static final BlockFamily BROWN_CHALK = BlockFamilies.register(ColoredBlocks.BROWN_CHALK)
            .stairs(BROWN_CHALK_STAIRS)
            .slab(BROWN_CHALK_SLAB)
            .wall(BROWN_CHALK_WALL)
            .polished(BROWN_CHALK_BRICKS)
            .build();

    public static final BlockFamily RED_CHALK = BlockFamilies.register(ColoredBlocks.RED_CHALK)
            .stairs(RED_CHALK_STAIRS)
            .slab(RED_CHALK_SLAB)
            .wall(RED_CHALK_WALL)
            .polished(RED_CHALK_BRICKS)
            .build();

    public static final BlockFamily ORANGE_CHALK = BlockFamilies.register(ColoredBlocks.ORANGE_CHALK)
            .stairs(ORANGE_CHALK_STAIRS)
            .slab(ORANGE_CHALK_SLAB)
            .wall(ORANGE_CHALK_WALL)
            .polished(ORANGE_CHALK_BRICKS)
            .build();

    public static final BlockFamily YELLOW_CHALK = BlockFamilies.register(ColoredBlocks.YELLOW_CHALK)
            .stairs(YELLOW_CHALK_STAIRS)
            .slab(YELLOW_CHALK_SLAB)
            .wall(YELLOW_CHALK_WALL)
            .polished(YELLOW_CHALK_BRICKS)
            .build();

    public static final BlockFamily LIME_CHALK = BlockFamilies.register(ColoredBlocks.LIME_CHALK)
            .stairs(LIME_CHALK_STAIRS)
            .slab(LIME_CHALK_SLAB)
            .wall(LIME_CHALK_WALL)
            .polished(LIME_CHALK_BRICKS)
            .build();

    public static final BlockFamily GREEN_CHALK = BlockFamilies.register(ColoredBlocks.GREEN_CHALK)
            .stairs(GREEN_CHALK_STAIRS)
            .slab(GREEN_CHALK_SLAB)
            .wall(GREEN_CHALK_WALL)
            .polished(GREEN_CHALK_BRICKS)
            .build();

    public static final BlockFamily CYAN_CHALK = BlockFamilies.register(ColoredBlocks.CYAN_CHALK)
            .stairs(CYAN_CHALK_STAIRS)
            .slab(CYAN_CHALK_SLAB)
            .wall(CYAN_CHALK_WALL)
            .polished(CYAN_CHALK_BRICKS)
            .build();

    public static final BlockFamily LIGHT_BLUE_CHALK = BlockFamilies.register(ColoredBlocks.LIGHT_BLUE_CHALK)
            .stairs(LIGHT_BLUE_CHALK_STAIRS)
            .slab(LIGHT_BLUE_CHALK_SLAB)
            .wall(LIGHT_BLUE_CHALK_WALL)
            .polished(LIGHT_BLUE_CHALK_BRICKS)
            .build();

    public static final BlockFamily BLUE_CHALK = BlockFamilies.register(ColoredBlocks.BLUE_CHALK)
            .stairs(BLUE_CHALK_STAIRS)
            .slab(BLUE_CHALK_SLAB)
            .wall(BLUE_CHALK_WALL)
            .polished(BLUE_CHALK_BRICKS)
            .build();

    public static final BlockFamily PURPLE_CHALK = BlockFamilies.register(ColoredBlocks.PURPLE_CHALK)
            .stairs(PURPLE_CHALK_STAIRS)
            .slab(PURPLE_CHALK_SLAB)
            .wall(PURPLE_CHALK_WALL)
            .polished(PURPLE_CHALK_BRICKS)
            .build();

    public static final BlockFamily MAGENTA_CHALK = BlockFamilies.register(ColoredBlocks.MAGENTA_CHALK)
            .stairs(MAGENTA_CHALK_STAIRS)
            .slab(MAGENTA_CHALK_SLAB)
            .wall(MAGENTA_CHALK_WALL)
            .polished(MAGENTA_CHALK_BRICKS)
            .build();

    public static final BlockFamily PINK_CHALK = BlockFamilies.register(ColoredBlocks.PINK_CHALK)
            .stairs(PINK_CHALK_STAIRS)
            .slab(PINK_CHALK_SLAB)
            .wall(PINK_CHALK_WALL)
            .polished(PINK_CHALK_BRICKS)
            .build();

    public static final BlockFamily CHALK_BRICK = BlockFamilies.register(CHALK_BRICKS)
            .stairs(CHALK_BRICK_STAIRS)
            .slab(CHALK_BRICK_SLAB)
            .wall(CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily WHITE_CHALK_BRICK = BlockFamilies.register(WHITE_CHALK_BRICKS)
            .stairs(WHITE_CHALK_BRICK_STAIRS)
            .slab(WHITE_CHALK_BRICK_SLAB)
            .wall(WHITE_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily LIGHT_GRAY_CHALK_BRICK = BlockFamilies.register(LIGHT_GRAY_CHALK_BRICKS)
            .stairs(LIGHT_GRAY_CHALK_BRICK_STAIRS)
            .slab(LIGHT_GRAY_CHALK_BRICK_SLAB)
            .wall(LIGHT_GRAY_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily GRAY_CHALK_BRICK = BlockFamilies.register(GRAY_CHALK_BRICKS)
            .stairs(GRAY_CHALK_BRICK_STAIRS)
            .slab(GRAY_CHALK_BRICK_SLAB)
            .wall(GRAY_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily BLACK_CHALK_BRICK = BlockFamilies.register(BLACK_CHALK_BRICKS)
            .stairs(BLACK_CHALK_BRICK_STAIRS)
            .slab(BLACK_CHALK_BRICK_SLAB)
            .wall(BLACK_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily BROWN_CHALK_BRICK = BlockFamilies.register(BROWN_CHALK_BRICKS)
            .stairs(BROWN_CHALK_BRICK_STAIRS)
            .slab(BROWN_CHALK_BRICK_SLAB)
            .wall(BROWN_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily RED_CHALK_BRICK = BlockFamilies.register(RED_CHALK_BRICKS)
            .stairs(RED_CHALK_BRICK_STAIRS)
            .slab(RED_CHALK_BRICK_SLAB)
            .wall(RED_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily ORANGE_CHALK_BRICK = BlockFamilies.register(ORANGE_CHALK_BRICKS)
            .stairs(ORANGE_CHALK_BRICK_STAIRS)
            .slab(ORANGE_CHALK_BRICK_SLAB)
            .wall(ORANGE_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily YELLOW_CHALK_BRICK = BlockFamilies.register(YELLOW_CHALK_BRICKS)
            .stairs(YELLOW_CHALK_BRICK_STAIRS)
            .slab(YELLOW_CHALK_BRICK_SLAB)
            .wall(YELLOW_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily LIME_CHALK_BRICK = BlockFamilies.register(LIME_CHALK_BRICKS)
            .stairs(LIME_CHALK_BRICK_STAIRS)
            .slab(LIME_CHALK_BRICK_SLAB)
            .wall(LIME_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily GREEN_CHALK_BRICK = BlockFamilies.register(GREEN_CHALK_BRICKS)
            .stairs(GREEN_CHALK_BRICK_STAIRS)
            .slab(GREEN_CHALK_BRICK_SLAB)
            .wall(GREEN_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily CYAN_CHALK_BRICK = BlockFamilies.register(CYAN_CHALK_BRICKS)
            .stairs(CYAN_CHALK_BRICK_STAIRS)
            .slab(CYAN_CHALK_BRICK_SLAB)
            .wall(CYAN_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily LIGHT_BLUE_CHALK_BRICK = BlockFamilies.register(LIGHT_BLUE_CHALK_BRICKS)
            .stairs(LIGHT_BLUE_CHALK_BRICK_STAIRS)
            .slab(LIGHT_BLUE_CHALK_BRICK_SLAB)
            .wall(LIGHT_BLUE_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily BLUE_CHALK_BRICK = BlockFamilies.register(BLUE_CHALK_BRICKS)
            .stairs(BLUE_CHALK_BRICK_STAIRS)
            .slab(BLUE_CHALK_BRICK_SLAB)
            .wall(BLUE_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily PURPLE_CHALK_BRICK = BlockFamilies.register(PURPLE_CHALK_BRICKS)
            .stairs(PURPLE_CHALK_BRICK_STAIRS)
            .slab(PURPLE_CHALK_BRICK_SLAB)
            .wall(PURPLE_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily MAGENTA_CHALK_BRICK = BlockFamilies.register(MAGENTA_CHALK_BRICKS)
            .stairs(MAGENTA_CHALK_BRICK_STAIRS)
            .slab(MAGENTA_CHALK_BRICK_SLAB)
            .wall(MAGENTA_CHALK_BRICK_WALL)
            .build();

    public static final BlockFamily PINK_CHALK_BRICK = BlockFamilies.register(PINK_CHALK_BRICKS)
            .stairs(PINK_CHALK_BRICK_STAIRS)
            .slab(PINK_CHALK_BRICK_SLAB)
            .wall(PINK_CHALK_BRICK_WALL)
            .build();

    public static void registerBlockFamilies() {

    }

}
