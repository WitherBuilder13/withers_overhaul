package me.withers_overhaul.world.feature.configured.vegetation;

import com.mojang.datafixers.util.Pair;
import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.world.feature.placed.vegetation.OverhaulTreePlacedFeatures;
import me.withers_overhaul.world.feature.placed.vegetation.OverhaulVegetationPlacedFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static me.withers_overhaul.world.feature.OverhaulConfiguredFeatures.of;

public class OverhaulVegetationConfiguredFeatures {
    // * Basic trees (for clumps)
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OAK = of("trees_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SPRUCE = of("trees_spruce");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BIRCH = of("trees_birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_CEDAR = of("trees_cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FIR = of("trees_fir");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_HEMLOCK = of("trees_hemlock");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_PINE = of("trees_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_LARCH = of("trees_larch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ASPEN = of("trees_aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ACACIA = of("trees_acacia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BAOBAB = of("trees_baobab");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_TEAK = of("trees_teak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ELM = of("trees_elm");

    // * Tree clumps
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_OAK = of("clump_trees_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_SPRUCE = of("clump_trees_spruce");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_BIRCH = of("clump_trees_birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_CEDAR = of("clump_trees_cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_FIR = of("clump_trees_fir");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_HEMLOCK = of("clump_trees_hemlock");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_PINE = of("clump_trees_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_LARCH = of("clump_trees_larch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_ASPEN = of("clump_trees_aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_ACACIA = of("clump_trees_acacia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_BAOBAB = of("clump_trees_baobab");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_TEAK = of("clump_trees_teak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_ELM = of("clump_trees_elm");

    // * Tree selectors
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_SELECTOR = of("maple_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_SELECTOR = of("fancy_maple_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_SELECTOR = of("poplar_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_SELECTOR = of("beech_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_SELECTOR = of("hickory_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH_SELECTOR = of("hickory_bush_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE_SELECTOR = of("palo_verde_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_SELECTOR = of("ebony_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_SELECTOR = of("mega_ebony_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_SELECTOR = of("ebony_bush_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_SELECTOR = of("teak_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_SELECTOR = of("elm_selector");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_SELECTOR = of("spruce_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_SPRUCE_SELECTOR = of("mega_spruce_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_SELECTOR = of("cedar_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_CEDAR_SELECTOR = of("mega_cedar_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_SELECTOR = of("pine_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TALL_SELECTOR = of("pine_tall_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_SELECTOR = of("larch_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_TALL_SELECTOR = of("larch_tall_selector");

    // * Fruit trees
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_MAPLE = of("trees_fruit_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_FANCY_MAPLE = of("trees_fruit_fancy_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_POPLAR = of("trees_fruit_poplar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_BEECH = of("trees_fruit_beech");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_HICKORY = of("trees_fruit_hickory");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_HICKORY_BUSH = of("trees_fruit_hickory_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_PALO_VERDE = of("trees_fruit_palo_verde");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_EBONY = of("trees_fruit_ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_MEGA_EBONY = of("trees_fruit_mega_ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_EBONY_BUSH = of("trees_fruit_ebony_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_TEAK = of("trees_fruit_teak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FRUIT_ELM = of("trees_fruit_elm");

    // * Biome trees
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ALPINE_FOREST = of("trees_alpine_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ALPINE_TANGLE = of("trees_alpine_tangle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ALPINE_THICKET = of("trees_alpine_thicket");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ASPEN_GROVE = of("trees_aspen_grove");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BAMBOO_JUNGLE = of("trees_bamboo_jungle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BAYOU = of("trees_bayou");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BOG = of("trees_bog");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BIRCH_FOREST = of("trees_birch_forest");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_CHERRY_GROVE = of("trees_cherry_grove");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_CLOUD_FOREST = of("trees_cloud_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_DARK_FOREST = of("trees_dark_forest");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_DESERT_FIELDS = of("trees_desert_fields");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ENCHANTED_FOREST = of("trees_enchanted_forest");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ERODED_BADLANDS = of("trees_eroded_badlands");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FLOWER_FOREST = of("trees_flower_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FOREST = of("trees_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FROSTED_TANGLE = of("trees_frosted_tangle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FROSTED_WOODLANDS = of("trees_frosted_woodlands");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_GOLDEN_SWEEP = of("trees_golden_sweep");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_GROVE = of("trees_grove");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_JUNGLE = of("trees_jungle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_LAVENDER_FIELDS = of("trees_lavender_fields");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_MEADOW = of("trees_meadow");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_MONSOON_RAINFOREST = of("trees_monsoon_rainforest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_MONTANE_CLEARING = of("trees_montane_clearing");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_MONTANE_WOODLANDS = of("trees_montane_woodlands");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OASIS = of("trees_oasis");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_BIRCH_FOREST = of("trees_old_growth_birch_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_PINE_TAIGA = of("trees_old_growth_pine_taiga");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_SNOWY_TAIGA = of("trees_old_growth_snowy_taiga");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OLD_GROWTH_SPRUCE_TAIGA = of("trees_old_growth_spruce_taiga");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_PALE_GARDEN = of("trees_pale_garden");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_PINE_TAIGA = of("trees_pine_taiga");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_REDWOOD_FOREST = of("trees_redwood_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SAVANNA = of("trees_savanna");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SAVANNA_PLATEAU = of("trees_savanna_plateau");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SHRUBLANDS = of("trees_shrublands");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SNOWY_TAIGA = of("trees_snowy_taiga");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SPARSE_JUNGLE = of("trees_sparse_jungle");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SWAMP = of("trees_swamp");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_TAIGA = of("trees_taiga");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_TANGLED_TROPICS = of("trees_tangled_tropics");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_TROPICAL_RAINFOREST = of("trees_tropical_rainforest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_WHIMSY = of("trees_whimsy");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_WINDSWEPT_FOREST = of("trees_windswept_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_WINDSWEPT_GRAVELLY_HILLS = of("trees_windswept_gravelly_hills");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_WINDSWEPT_HILLS = of("trees_windswept_hills");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_WINDSWEPT_SAVANNA = of("trees_windswept_savanna");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_WINTER_WONDERLAND = of("trees_winter_wonderland");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntryLookup<PlacedFeature> placedFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        // * Vanilla tree references
        RegistryEntry<ConfiguredFeature<?, ?>> oakBees005 = configuredFeatureLookup.getOrThrow(TreeConfiguredFeatures.OAK_BEES_005);
        RegistryEntry<PlacedFeature> oakBees002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_BEES_002);
        RegistryEntry<PlacedFeature> oakBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_BEES_0002);
        RegistryEntry<PlacedFeature> oakLeafLitter = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_LEAF_LITTER);
        RegistryEntry<PlacedFeature> fancyOakBees = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_BEES);
        RegistryEntry<PlacedFeature> fancyOakBees002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_BEES_002);
        RegistryEntry<PlacedFeature> fancyOakBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_BEES_0002);
        RegistryEntry<PlacedFeature> fancyOakLeafLitter = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_LEAF_LITTER);
        RegistryEntry<PlacedFeature> megaSpruce = placedFeatureLookup.getOrThrow(TreePlacedFeatures.MEGA_SPRUCE_CHECKED);
        RegistryEntry<PlacedFeature> megaSpruceTop = placedFeatureLookup.getOrThrow(TreePlacedFeatures.MEGA_PINE_CHECKED);
        RegistryEntry<PlacedFeature> birchBees002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.BIRCH_BEES_002);
        RegistryEntry<PlacedFeature> birchBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.BIRCH_BEES_0002);
        RegistryEntry<PlacedFeature> birchTallBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.SUPER_BIRCH_BEES_0002);
        RegistryEntry<PlacedFeature> jungleBush = placedFeatureLookup.getOrThrow(TreePlacedFeatures.JUNGLE_BUSH);
        RegistryEntry<PlacedFeature> cherryBees005 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.CHERRY_BEES_005);
        RegistryEntry<ConfiguredFeature<?, ?>> hugeBrownMushroom = configuredFeatureLookup.getOrThrow(TreeConfiguredFeatures.HUGE_BROWN_MUSHROOM);
        RegistryEntry<ConfiguredFeature<?, ?>> hugeRedMushroom = configuredFeatureLookup.getOrThrow(TreeConfiguredFeatures.HUGE_RED_MUSHROOM);

        // * Overhaul tree references
        RegistryEntry<PlacedFeature> oak = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.OAK);

        RegistryEntry<PlacedFeature> fancyOak = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_OAK);

        RegistryEntry<PlacedFeature> maple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE);
        RegistryEntry<PlacedFeature> mapleApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_APPLE);
        RegistryEntry<PlacedFeature> mapleApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_APRICOT);
        RegistryEntry<PlacedFeature> mapleKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_KIWI);
        RegistryEntry<PlacedFeature> mapleNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_NECTARINE);
        RegistryEntry<PlacedFeature> maplePeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_PEACH);
        RegistryEntry<PlacedFeature> maplePear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_PEAR);
        RegistryEntry<PlacedFeature> maplePlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE_PLUM);

        RegistryEntry<PlacedFeature> fancyMaple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE);
        RegistryEntry<PlacedFeature> fancyMapleApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_APPLE);
        RegistryEntry<PlacedFeature> fancyMapleApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_APRICOT);
        RegistryEntry<PlacedFeature> fancyMapleKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_KIWI);
        RegistryEntry<PlacedFeature> fancyMapleNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_NECTARINE);
        RegistryEntry<PlacedFeature> fancyMaplePeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_PEACH);
        RegistryEntry<PlacedFeature> fancyMaplePear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_PEAR);
        RegistryEntry<PlacedFeature> fancyMaplePlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE_PLUM);

        RegistryEntry<PlacedFeature> poplar = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR);
        RegistryEntry<PlacedFeature> poplarApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_APPLE);
        RegistryEntry<PlacedFeature> poplarApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_APRICOT);
        RegistryEntry<PlacedFeature> poplarKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_KIWI);
        RegistryEntry<PlacedFeature> poplarNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_NECTARINE);
        RegistryEntry<PlacedFeature> poplarPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_PEACH);
        RegistryEntry<PlacedFeature> poplarPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_PEAR);
        RegistryEntry<PlacedFeature> poplarPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR_PLUM);

        RegistryEntry<PlacedFeature> beech = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH);
        RegistryEntry<PlacedFeature> beechApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_APPLE);
        RegistryEntry<PlacedFeature> beechApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_APRICOT);
        RegistryEntry<PlacedFeature> beechKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_KIWI);
        RegistryEntry<PlacedFeature> beechNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_NECTARINE);
        RegistryEntry<PlacedFeature> beechPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_PEACH);
        RegistryEntry<PlacedFeature> beechPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_PEAR);
        RegistryEntry<PlacedFeature> beechPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH_PLUM);

        RegistryEntry<PlacedFeature> hickory = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY);
        RegistryEntry<PlacedFeature> hickoryCherry = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_CHERRY);
        RegistryEntry<PlacedFeature> hickoryFig = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_FIG);
        RegistryEntry<PlacedFeature> hickoryGrapefruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_GRAPEFRUIT);
        RegistryEntry<PlacedFeature> hickoryGuava = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_GUAVA);
        RegistryEntry<PlacedFeature> hickoryTangerine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_TANGERINE);

        RegistryEntry<PlacedFeature> hickoryBush = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH);
        RegistryEntry<PlacedFeature> hickoryBushCherry = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH_CHERRY);
        RegistryEntry<PlacedFeature> hickoryBushFig = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH_FIG);
        RegistryEntry<PlacedFeature> hickoryBushGrapefruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH_GRAPEFRUIT);
        RegistryEntry<PlacedFeature> hickoryBushGuava = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH_GUAVA);
        RegistryEntry<PlacedFeature> hickoryBushTangerine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH_TANGERINE);
        
        /*RegistryEntry<PlacedFeature> walnut = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT);
        RegistryEntry<PlacedFeature> walnutCherry = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT_CHERRY);
        RegistryEntry<PlacedFeature> walnutFig = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT_FIG);
        RegistryEntry<PlacedFeature> walnutGrapefruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT_GRAPEFRUIT);
        RegistryEntry<PlacedFeature> walnutGuava = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT_GUAVA);
        RegistryEntry<PlacedFeature> walnutTangerine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT_TANGERINE);
        
        RegistryEntry<PlacedFeature> chestnut = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT);
        RegistryEntry<PlacedFeature> chestnutCherry = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT_CHERRY);
        RegistryEntry<PlacedFeature> chestnutFig = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT_FIG);
        RegistryEntry<PlacedFeature> chestnutGrapefruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT_GRAPEFRUIT);
        RegistryEntry<PlacedFeature> chestnutGuava = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT_GUAVA);
        RegistryEntry<PlacedFeature> chestnutTangerine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT_TANGERINE);*/

        RegistryEntry<PlacedFeature> spruce = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.SPRUCE);
        RegistryEntry<PlacedFeature> spruceTop = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.SPRUCE_TOP);
        RegistryEntry<PlacedFeature> cedar = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CEDAR);
        RegistryEntry<PlacedFeature> cedarFlat = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CEDAR_FLAT);
        RegistryEntry<PlacedFeature> megaCedar = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_CEDAR);
        RegistryEntry<PlacedFeature> megaCedarFlat = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_CEDAR_FLAT);
        RegistryEntry<PlacedFeature> redwood = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.REDWOOD);
        RegistryEntry<PlacedFeature> fir = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FIR);
        RegistryEntry<PlacedFeature> megaFir = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_FIR);
        RegistryEntry<PlacedFeature> hemlock = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HEMLOCK);
        RegistryEntry<PlacedFeature> megaHemlock = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_HEMLOCK);
        RegistryEntry<PlacedFeature> holly = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HOLLY);
        RegistryEntry<PlacedFeature> pine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PINE);
        RegistryEntry<PlacedFeature> pineTop = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PINE_TOP);
        RegistryEntry<PlacedFeature> pineTall = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PINE_TALL);
        RegistryEntry<PlacedFeature> pineTopTall = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PINE_TOP_TALL);
        RegistryEntry<PlacedFeature> larch = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.LARCH);
        RegistryEntry<PlacedFeature> larchTop = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.LARCH_TOP);
        RegistryEntry<PlacedFeature> larchTall = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.LARCH_TALL);
        RegistryEntry<PlacedFeature> larchTopTall = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.LARCH_TOP_TALL);

        RegistryEntry<PlacedFeature> birch = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BIRCH);
        RegistryEntry<PlacedFeature> birchTall = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BIRCH_TALL);
        RegistryEntry<PlacedFeature> aspen = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ASPEN);
        RegistryEntry<PlacedFeature> paleOak = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALE_OAK);
        RegistryEntry<PlacedFeature> paleOakCreaking = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALE_OAK_CREAKING);

        RegistryEntry<PlacedFeature> jungle = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JUNGLE);
        RegistryEntry<PlacedFeature> megaJungle = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_JUNGLE);
        
        /*RegistryEntry<PlacedFeature> kapok = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK);
        RegistryEntry<PlacedFeature> kapokAvocado = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_AVOCADO);
        RegistryEntry<PlacedFeature> kapokBanana = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_BANANA);
        RegistryEntry<PlacedFeature> kapokLemon = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_LEMON);
        RegistryEntry<PlacedFeature> kapokLime = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_LIME);
        RegistryEntry<PlacedFeature> kapokMango = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_MANGO);
        RegistryEntry<PlacedFeature> kapokOrange = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_ORANGE);
        RegistryEntry<PlacedFeature> kapokStarfruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK_STARFRUIT);
        
        RegistryEntry<PlacedFeature> mahogany = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY);
        RegistryEntry<PlacedFeature> mahoganyAvocado = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_AVOCADO);
        RegistryEntry<PlacedFeature> mahoganyBanana = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_BANANA);
        RegistryEntry<PlacedFeature> mahoganyLemon = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_LEMON);
        RegistryEntry<PlacedFeature> mahoganyLime = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_LIME);
        RegistryEntry<PlacedFeature> mahoganyMango = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_MANGO);
        RegistryEntry<PlacedFeature> mahoganyOrange = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_ORANGE);
        RegistryEntry<PlacedFeature> mahoganyStarfruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY_STARFRUIT);
        
        RegistryEntry<PlacedFeature> eucalyptus = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS);
        RegistryEntry<PlacedFeature> eucalyptusAvocado = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_AVOCADO);
        RegistryEntry<PlacedFeature> eucalyptusBanana = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_BANANA);
        RegistryEntry<PlacedFeature> eucalyptusLemon = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_LEMON);
        RegistryEntry<PlacedFeature> eucalyptusLime = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_LIME);
        RegistryEntry<PlacedFeature> eucalyptusMango = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_MANGO);
        RegistryEntry<PlacedFeature> eucalyptusOrange = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_ORANGE);
        RegistryEntry<PlacedFeature> eucalyptusStarfruit = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS_STARFRUIT);*/

        RegistryEntry<PlacedFeature> acacia = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA);

        RegistryEntry<PlacedFeature> acaciaBush = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA_BUSH);
        /*RegistryEntry<PlacedFeature> acaciaBushKumquat = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA_BUSH_KUMQUAT);
        RegistryEntry<PlacedFeature> acaciaBushOlive = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA_BUSH_OLIVE);
        RegistryEntry<PlacedFeature> acaciaBushPersimmon = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA_BUSH_PERSIMMON);
        RegistryEntry<PlacedFeature> acaciaBushPomegranate = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA_BUSH_POMEGRANATE);*/

        RegistryEntry<PlacedFeature> baobab = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BAOBAB);
        /*RegistryEntry<PlacedFeature> baobabKumquat = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BAOBAB_KUMQUAT);
        RegistryEntry<PlacedFeature> baobabOlive = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BAOBAB_OLIVE);
        RegistryEntry<PlacedFeature> baobabPersimmon = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BAOBAB_PERSIMMON);
        RegistryEntry<PlacedFeature> baobabPomegranate = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BAOBAB_POMEGRANATE);*/

        RegistryEntry<PlacedFeature> paloVerde = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALO_VERDE);
        RegistryEntry<PlacedFeature> paloVerdeKumquat = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALO_VERDE_KUMQUAT);
        RegistryEntry<PlacedFeature> paloVerdeOlive = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALO_VERDE_OLIVE);
        RegistryEntry<PlacedFeature> paloVerdePersimmon = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALO_VERDE_PERSIMMON);
        RegistryEntry<PlacedFeature> paloVerdePomegranate = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALO_VERDE_POMEGRANATE);
        
        /*RegistryEntry<PlacedFeature> joshua = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JOSHUA);
        /*RegistryEntry<PlacedFeature> joshuaDate = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JOSHUA_DATE);
        
        RegistryEntry<PlacedFeature> juniper = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JUNIPER);
        RegistryEntry<PlacedFeature> juniperDate = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JUNIPER_DATE);
        
        RegistryEntry<PlacedFeature> palm = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALM);*/

        RegistryEntry<PlacedFeature> darkOak = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.DARK_OAK);
        RegistryEntry<PlacedFeature> darkOakLeafLitter = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.DARK_OAK_LEAF_LITTER);
        RegistryEntry<PlacedFeature> darkOakSmall = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.DARK_OAK_SMALL);
        RegistryEntry<PlacedFeature> darkOakSmallLeafLitter = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.DARK_OAK_SMALL_LEAF_LITTER);

        RegistryEntry<PlacedFeature> ebony = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY);
        RegistryEntry<PlacedFeature> ebonyApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_APPLE);
        RegistryEntry<PlacedFeature> ebonyApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_APRICOT);
        RegistryEntry<PlacedFeature> ebonyKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_KIWI);
        RegistryEntry<PlacedFeature> ebonyNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_NECTARINE);
        RegistryEntry<PlacedFeature> ebonyPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_PEACH);
        RegistryEntry<PlacedFeature> ebonyPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_PEAR);
        RegistryEntry<PlacedFeature> ebonyPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_PLUM);

        RegistryEntry<PlacedFeature> megaEbony = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY);
        RegistryEntry<PlacedFeature> megaEbonyApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_APPLE);
        RegistryEntry<PlacedFeature> megaEbonyApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_APRICOT);
        RegistryEntry<PlacedFeature> megaEbonyKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_KIWI);
        RegistryEntry<PlacedFeature> megaEbonyNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_NECTARINE);
        RegistryEntry<PlacedFeature> megaEbonyPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_PEACH);
        RegistryEntry<PlacedFeature> megaEbonyPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_PEAR);
        RegistryEntry<PlacedFeature> megaEbonyPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY_PLUM);

        RegistryEntry<PlacedFeature> ebonyBush = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH);
        RegistryEntry<PlacedFeature> ebonyBushApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_APPLE);
        RegistryEntry<PlacedFeature> ebonyBushApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_APRICOT);
        RegistryEntry<PlacedFeature> ebonyBushKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_KIWI);
        RegistryEntry<PlacedFeature> ebonyBushNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_NECTARINE);
        RegistryEntry<PlacedFeature> ebonyBushPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_PEACH);
        RegistryEntry<PlacedFeature> ebonyBushPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_PEAR);
        RegistryEntry<PlacedFeature> ebonyBushPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH_PLUM);

        RegistryEntry<PlacedFeature> teak = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK);
        RegistryEntry<PlacedFeature> teakApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_APPLE);
        RegistryEntry<PlacedFeature> teakApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_APRICOT);
        RegistryEntry<PlacedFeature> teakKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_KIWI);
        RegistryEntry<PlacedFeature> teakNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_NECTARINE);
        RegistryEntry<PlacedFeature> teakPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_PEACH);
        RegistryEntry<PlacedFeature> teakPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_PEAR);
        RegistryEntry<PlacedFeature> teakPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK_PLUM);

        RegistryEntry<PlacedFeature> elm = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM);
        RegistryEntry<PlacedFeature> elmApple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_APPLE);
        RegistryEntry<PlacedFeature> elmApricot = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_APRICOT);
        RegistryEntry<PlacedFeature> elmKiwi = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_KIWI);
        RegistryEntry<PlacedFeature> elmNectarine = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_NECTARINE);
        RegistryEntry<PlacedFeature> elmPeach = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_PEACH);
        RegistryEntry<PlacedFeature> elmPear = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_PEAR);
        RegistryEntry<PlacedFeature> elmPlum = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM_PLUM);
        
        /*RegistryEntry<PlacedFeature> willow = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WILLOW);
        RegistryEntry<PlacedFeature> cypress = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CYPRESS);
        RegistryEntry<PlacedFeature> sakura = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.SAKURA);*/
        RegistryEntry<PlacedFeature> magnolia = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAGNOLIA);
        RegistryEntry<PlacedFeature> floweringMagnolia = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FLOWERING_MAGNOLIA);
        RegistryEntry<PlacedFeature> jacaranda = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JACARANDA);

        // * -----------------------------------------------------------------------------------------------------------------------------------------------------------

        // * Fruit trees
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_MAPLE, Feature.RANDOM_SELECTOR, randomSelector(
                mapleApple,
                Pair.of(mapleApricot, 0.14F),
                Pair.of(mapleKiwi, 0.14F),
                Pair.of(mapleNectarine, 0.07F),
                Pair.of(maplePeach, 0.16F),
                Pair.of(maplePear, 0.16F),
                Pair.of(maplePlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_FANCY_MAPLE, Feature.RANDOM_SELECTOR, randomSelector(
                fancyMapleApple,
                Pair.of(fancyMapleApricot, 0.14F),
                Pair.of(fancyMapleKiwi, 0.14F),
                Pair.of(fancyMapleNectarine, 0.07F),
                Pair.of(fancyMaplePeach, 0.16F),
                Pair.of(fancyMaplePear, 0.16F),
                Pair.of(fancyMaplePlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_POPLAR, Feature.RANDOM_SELECTOR, randomSelector(
                poplarApple,
                Pair.of(poplarApricot, 0.14F),
                Pair.of(poplarKiwi, 0.14F),
                Pair.of(poplarNectarine, 0.07F),
                Pair.of(poplarPeach, 0.16F),
                Pair.of(poplarPear, 0.16F),
                Pair.of(poplarPlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_BEECH, Feature.RANDOM_SELECTOR, randomSelector(
                beechApple,
                Pair.of(beechApricot, 0.14F),
                Pair.of(beechKiwi, 0.14F),
                Pair.of(beechNectarine, 0.07F),
                Pair.of(beechPeach, 0.16F),
                Pair.of(beechPear, 0.16F),
                Pair.of(beechPlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_HICKORY, Feature.RANDOM_SELECTOR, randomSelector(
                hickoryCherry,
                Pair.of(hickoryFig, 0.14F),
                Pair.of(hickoryGrapefruit, 0.14F),
                Pair.of(hickoryGuava, 0.07F),
                Pair.of(hickoryTangerine, 0.16F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_HICKORY_BUSH, Feature.RANDOM_SELECTOR, randomSelector(
                hickoryBushCherry,
                Pair.of(hickoryBushFig, 0.14F),
                Pair.of(hickoryBushGrapefruit, 0.14F),
                Pair.of(hickoryBushGuava, 0.07F),
                Pair.of(hickoryBushTangerine, 0.16F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_PALO_VERDE, Feature.RANDOM_SELECTOR, randomSelector(
                paloVerdeKumquat,
                Pair.of(paloVerdeOlive, 0.14F),
                Pair.of(paloVerdePersimmon, 0.14F),
                Pair.of(paloVerdePomegranate, 0.07F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_EBONY, Feature.RANDOM_SELECTOR, randomSelector(
                ebonyApple,
                Pair.of(ebonyApricot, 0.14F),
                Pair.of(ebonyKiwi, 0.14F),
                Pair.of(ebonyNectarine, 0.07F),
                Pair.of(ebonyPeach, 0.16F),
                Pair.of(ebonyPear, 0.16F),
                Pair.of(ebonyPlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_MEGA_EBONY, Feature.RANDOM_SELECTOR, randomSelector(
                megaEbonyApple,
                Pair.of(megaEbonyApricot, 0.14F),
                Pair.of(megaEbonyKiwi, 0.14F),
                Pair.of(megaEbonyNectarine, 0.07F),
                Pair.of(megaEbonyPeach, 0.16F),
                Pair.of(megaEbonyPear, 0.16F),
                Pair.of(megaEbonyPlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_EBONY_BUSH, Feature.RANDOM_SELECTOR, randomSelector(
                ebonyBushApple,
                Pair.of(ebonyBushApricot, 0.14F),
                Pair.of(ebonyBushKiwi, 0.14F),
                Pair.of(ebonyBushNectarine, 0.07F),
                Pair.of(ebonyBushPeach, 0.16F),
                Pair.of(ebonyBushPear, 0.16F),
                Pair.of(ebonyBushPlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_TEAK, Feature.RANDOM_SELECTOR, randomSelector(
                teakApple,
                Pair.of(teakApricot, 0.14F),
                Pair.of(teakKiwi, 0.14F),
                Pair.of(teakNectarine, 0.07F),
                Pair.of(teakPeach, 0.16F),
                Pair.of(teakPear, 0.16F),
                Pair.of(teakPlum, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FRUIT_ELM, Feature.RANDOM_SELECTOR, randomSelector(
                elmApple,
                Pair.of(elmApricot, 0.14F),
                Pair.of(elmKiwi, 0.14F),
                Pair.of(elmNectarine, 0.07F),
                Pair.of(elmPeach, 0.16F),
                Pair.of(elmPear, 0.16F),
                Pair.of(elmPlum, 0.1F)
        ));

        // * ------------------------------------------------------------------------------------------------------------------------------------------

        RegistryEntry<PlacedFeature> treesFruitMaple = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_MAPLE);
        RegistryEntry<PlacedFeature> treesFruitFancyMaple = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_FANCY_MAPLE);
        RegistryEntry<PlacedFeature> treesFruitPoplar = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_POPLAR);
        RegistryEntry<PlacedFeature> treesFruitBeech = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_BEECH);
        RegistryEntry<PlacedFeature> treesFruitHickory = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_HICKORY);
        RegistryEntry<PlacedFeature> treesFruitHickoryBush = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_HICKORY_BUSH);
        RegistryEntry<PlacedFeature> treesFruitPaloVerde = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_PALO_VERDE);
        RegistryEntry<PlacedFeature> treesFruitEbony = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_EBONY);
        RegistryEntry<PlacedFeature> treesFruitMegaEbony = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_MEGA_EBONY);
        RegistryEntry<PlacedFeature> treesFruitEbonyBush = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_EBONY_BUSH);
        RegistryEntry<PlacedFeature> treesFruitTeak = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_TEAK);
        RegistryEntry<PlacedFeature> treesFruitElm = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TREES_FRUIT_ELM);

        // * ------------------------------------------------------------------------------------------------------------------------------------------

        // * Tree selectors
        ConfiguredFeatures.register(featureRegisterable, MAPLE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(maple, treesFruitMaple));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(fancyMaple, treesFruitFancyMaple));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(poplar, treesFruitPoplar));
        ConfiguredFeatures.register(featureRegisterable, BEECH_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(beech, treesFruitBeech));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(hickory, treesFruitHickory));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(hickoryBush, treesFruitHickoryBush));
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(paloVerde, treesFruitPaloVerde));
        ConfiguredFeatures.register(featureRegisterable, EBONY_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(ebony, treesFruitEbony));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(megaEbony, treesFruitMegaEbony));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(ebonyBush, treesFruitEbonyBush));
        ConfiguredFeatures.register(featureRegisterable, TEAK_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(teak, treesFruitTeak));
        ConfiguredFeatures.register(featureRegisterable, ELM_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(elm, treesFruitElm));

        ConfiguredFeatures.register(featureRegisterable, SPRUCE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(spruce, spruceTop));
        ConfiguredFeatures.register(featureRegisterable, MEGA_SPRUCE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(megaSpruce, megaSpruceTop));
        ConfiguredFeatures.register(featureRegisterable, CEDAR_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(cedar, cedarFlat));
        ConfiguredFeatures.register(featureRegisterable, MEGA_CEDAR_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(megaCedar, megaCedarFlat));
        ConfiguredFeatures.register(featureRegisterable, PINE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(pine, pineTop));
        ConfiguredFeatures.register(featureRegisterable, PINE_TALL_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(pineTall, pineTopTall));
        ConfiguredFeatures.register(featureRegisterable, LARCH_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(larch, larchTop));
        ConfiguredFeatures.register(featureRegisterable, LARCH_TALL_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(larchTall, larchTopTall));

        RegistryEntry<PlacedFeature> mapleSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.MAPLE_SELECTOR);
        RegistryEntry<PlacedFeature> fancyMapleSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.FANCY_MAPLE_SELECTOR);
        RegistryEntry<PlacedFeature> poplarSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.POPLAR_SELECTOR);
        RegistryEntry<PlacedFeature> beechSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.BEECH_SELECTOR);
        RegistryEntry<PlacedFeature> hickorySelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.HICKORY_SELECTOR);
        RegistryEntry<PlacedFeature> hickoryBushSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.HICKORY_BUSH_SELECTOR);
        RegistryEntry<PlacedFeature> paloVerdeSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PALO_VERDE_SELECTOR);
        RegistryEntry<PlacedFeature> ebonySelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.EBONY_SELECTOR);
        RegistryEntry<PlacedFeature> megaEbonySelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.MEGA_EBONY_SELECTOR);
        RegistryEntry<PlacedFeature> ebonyBushSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.EBONY_BUSH_SELECTOR);
        RegistryEntry<PlacedFeature> teakSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.TEAK_SELECTOR);
        RegistryEntry<PlacedFeature> elmSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.ELM_SELECTOR);

        RegistryEntry<PlacedFeature> spruceSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.SPRUCE_SELECTOR);
        RegistryEntry<PlacedFeature> megaSpruceSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.MEGA_SPRUCE_SELECTOR);
        RegistryEntry<PlacedFeature> cedarSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CEDAR_SELECTOR);
        RegistryEntry<PlacedFeature> megaCedarSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.MEGA_CEDAR_SELECTOR);
        RegistryEntry<PlacedFeature> pineSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PINE_SELECTOR);
        RegistryEntry<PlacedFeature> pineTallSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PINE_TALL_SELECTOR);
        RegistryEntry<PlacedFeature> larchSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.LARCH_SELECTOR);
        RegistryEntry<PlacedFeature> larchTallSelector = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.LARCH_TALL_SELECTOR);

        // * Basic trees
        ConfiguredFeatures.register(featureRegisterable, TREES_OAK, Feature.RANDOM_SELECTOR, singlePlacedFeature(oak));
        ConfiguredFeatures.register(featureRegisterable, TREES_BIRCH, Feature.RANDOM_SELECTOR, singlePlacedFeature(birch));
        ConfiguredFeatures.register(featureRegisterable, TREES_SPRUCE, Feature.RANDOM_SELECTOR, singlePlacedFeature(spruceSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_CEDAR, Feature.RANDOM_SELECTOR, singlePlacedFeature(cedarSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_FIR, Feature.RANDOM_SELECTOR, singlePlacedFeature(fir));
        ConfiguredFeatures.register(featureRegisterable, TREES_HEMLOCK, Feature.RANDOM_SELECTOR, singlePlacedFeature(hemlock));
        ConfiguredFeatures.register(featureRegisterable, TREES_PINE, Feature.RANDOM_SELECTOR, singlePlacedFeature(pineSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_LARCH, Feature.RANDOM_SELECTOR, singlePlacedFeature(larchSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_ASPEN, Feature.RANDOM_SELECTOR, singlePlacedFeature(aspen));
        ConfiguredFeatures.register(featureRegisterable, TREES_ACACIA, Feature.RANDOM_SELECTOR, singlePlacedFeature(acacia));
        ConfiguredFeatures.register(featureRegisterable, TREES_BAOBAB, Feature.RANDOM_SELECTOR, singlePlacedFeature(baobab));
        ConfiguredFeatures.register(featureRegisterable, TREES_TEAK, Feature.RANDOM_SELECTOR, singlePlacedFeature(teakSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_ELM, Feature.RANDOM_SELECTOR, singlePlacedFeature(elmSelector));

        // * Tree clumps
        RegistryEntry<PlacedFeature> oakClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_OAK);
        RegistryEntry<PlacedFeature> spruceClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_SPRUCE);
        RegistryEntry<PlacedFeature> birchClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_BIRCH);
        RegistryEntry<PlacedFeature> cedarClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_CEDAR);
        RegistryEntry<PlacedFeature> firClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_FIR);
        RegistryEntry<PlacedFeature> hemlockClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_HEMLOCK);
        RegistryEntry<PlacedFeature> pineClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_PINE);
        RegistryEntry<PlacedFeature> larchClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_LARCH);
        RegistryEntry<PlacedFeature> aspenClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_ASPEN);
        RegistryEntry<PlacedFeature> acaciaClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_ACACIA);
        RegistryEntry<PlacedFeature> baobabClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_BAOBAB);
        RegistryEntry<PlacedFeature> teakClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_TEAK);
        RegistryEntry<PlacedFeature> elmClump = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.CLUMP_TREES_ELM);

        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_OAK, Feature.RANDOM_SELECTOR, singlePlacedFeature(oakClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_SPRUCE, Feature.RANDOM_SELECTOR, singlePlacedFeature(spruceClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_BIRCH, Feature.RANDOM_SELECTOR, singlePlacedFeature(birchClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_CEDAR, Feature.RANDOM_SELECTOR, singlePlacedFeature(cedarClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_FIR, Feature.RANDOM_SELECTOR, singlePlacedFeature(firClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_HEMLOCK, Feature.RANDOM_SELECTOR, singlePlacedFeature(hemlockClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_PINE, Feature.RANDOM_SELECTOR, singlePlacedFeature(pineClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_LARCH, Feature.RANDOM_SELECTOR, singlePlacedFeature(larchClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_ASPEN, Feature.RANDOM_SELECTOR, singlePlacedFeature(aspenClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_ACACIA, Feature.RANDOM_SELECTOR, singlePlacedFeature(acaciaClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_BAOBAB, Feature.RANDOM_SELECTOR, singlePlacedFeature(baobabClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_TEAK, Feature.RANDOM_SELECTOR, singlePlacedFeature(teakClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_ELM, Feature.RANDOM_SELECTOR, singlePlacedFeature(elmClump));

        // * Trees in biomes
        float clumpChance = 0.01F;
        ConfiguredFeatures.register(featureRegisterable, TREES_ALPINE_FOREST, Feature.RANDOM_SELECTOR, randomSelector(cedarSelector, Pair.of(spruceClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_ALPINE_TANGLE, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(spruceSelector, cedarSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_ALPINE_THICKET, Feature.RANDOM_SELECTOR, randomSelector(
                megaCedarSelector, Pair.of(cedarSelector, 0.5F), Pair.of(spruceClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_ASPEN_GROVE, Feature.RANDOM_SELECTOR, randomSelector(aspen, Pair.of(birchClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_BIRCH_FOREST, Feature.RANDOM_SELECTOR, randomSelector(birch, Pair.of(aspenClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_CLOUD_FOREST, Feature.RANDOM_SELECTOR, randomSelector(
                megaEbonySelector, Pair.of(ebonySelector, 0.2F), Pair.of(darkOak, 0.2F), Pair.of(darkOakSmall, 0.2F),
                Pair.of(ebonyBushSelector, 0.2F), Pair.of(teakClump, clumpChance), Pair.of(elmClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_DARK_FOREST, Feature.RANDOM_SELECTOR, randomSelector(
                darkOakLeafLitter, Pair.of(darkOak, 0.2F), Pair.of(darkOakSmall, 0.2F), Pair.of(darkOakSmallLeafLitter, 0.2F), Pair.of(teakClump, clumpChance), Pair.of(elmClump, clumpChance),
                Pair.of(PlacedFeatures.createEntry(hugeRedMushroom), 0.1F), Pair.of(PlacedFeatures.createEntry(hugeBrownMushroom), 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FLOWER_FOREST, Feature.RANDOM_SELECTOR, randomSelector(
                oak, Pair.of(fancyOak, 0.1F), Pair.of(mapleSelector, 0.2F), Pair.of(fancyMapleSelector, 0.1F), Pair.of(poplarSelector, 0.3F), Pair.of(beechSelector, 0.1F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FOREST, Feature.RANDOM_SELECTOR, randomSelector(
                oak, Pair.of(fancyOak, 0.2F), Pair.of(mapleSelector, 0.3F), Pair.of(fancyMapleSelector, 0.2F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_FROSTED_TANGLE, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(fir, hemlock));
        ConfiguredFeatures.register(featureRegisterable, TREES_FROSTED_WOODLANDS, Feature.RANDOM_SELECTOR, randomSelector(
                megaHemlock, Pair.of(hemlock, 0.3F), Pair.of(firClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_GOLDEN_SWEEP, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(birch, aspen));
        ConfiguredFeatures.register(featureRegisterable, TREES_GROVE, Feature.RANDOM_SELECTOR, randomSelector(hemlock, Pair.of(firClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_LAVENDER_FIELDS, Feature.RANDOM_SELECTOR, randomSelector(
                magnolia, Pair.of(floweringMagnolia, 0.1F), Pair.of(jacaranda, 0.3F)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_MONTANE_CLEARING, Feature.RANDOM_SELECTOR, randomSelector(larchSelector, Pair.of(pineClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_MONTANE_WOODLANDS, Feature.RANDOM_SELECTOR, randomSelector(
                larchTallSelector, Pair.of(larchSelector, 0.3F), Pair.of(pineClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_OLD_GROWTH_BIRCH_FOREST, Feature.RANDOM_SELECTOR, randomSelector(
                birchTall, Pair.of(birch, 0.3F), Pair.of(aspenClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_OLD_GROWTH_PINE_TAIGA, Feature.RANDOM_SELECTOR, randomSelector(
                pineTallSelector, Pair.of(pineSelector, 0.3F), Pair.of(larchClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_OLD_GROWTH_SNOWY_TAIGA, Feature.RANDOM_SELECTOR, randomSelector(megaFir, Pair.of(fir, 0.3F), Pair.of(hemlockClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_OLD_GROWTH_SPRUCE_TAIGA, Feature.RANDOM_SELECTOR, randomSelector(
                megaSpruceSelector, Pair.of(spruceSelector, 0.3F), Pair.of(cedarClump, clumpChance)
        ));
        ConfiguredFeatures.register(featureRegisterable, TREES_PALE_GARDEN, Feature.RANDOM_SELECTOR, randomSelector(paleOak, Pair.of(paleOakCreaking, 0.1F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_PINE_TAIGA, Feature.RANDOM_SELECTOR, randomSelector(pineSelector, Pair.of(larchClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_REDWOOD_FOREST, Feature.RANDOM_SELECTOR, randomSelector(redwood, Pair.of(spruceClump, 0.1F), Pair.of(cedarClump, 0.1F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SAVANNA, Feature.RANDOM_SELECTOR, randomSelector(acaciaClump, Pair.of(baobabClump, 0.2F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SAVANNA_PLATEAU, Feature.RANDOM_SELECTOR, randomSelector(paloVerdeSelector, Pair.of(acaciaBush, 0.4F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SHRUBLANDS, Feature.RANDOM_SELECTOR, randomSelector(hickoryBushSelector, Pair.of(hickorySelector, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SNOWY_TAIGA, Feature.RANDOM_SELECTOR, randomSelector(fir, Pair.of(hemlockClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_TAIGA, Feature.RANDOM_SELECTOR, randomSelector(spruceSelector, Pair.of(cedarClump, clumpChance)));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_FOREST, Feature.RANDOM_SELECTOR, randomSelector(mapleSelector, Pair.of(fancyMapleSelector, 0.1F), Pair.of(darkOakSmall, 0.5F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_GRAVELLY_HILLS, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(pineSelector, larchSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_HILLS, Feature.RANDOM_SELECTOR, randomSelector(oak, Pair.of(fancyOak, 0.1F), Pair.of(elmSelector, 0.5F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_SAVANNA, Feature.RANDOM_BOOLEAN_SELECTOR, booleanSelector(acacia, paloVerdeSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINTER_WONDERLAND, Feature.RANDOM_SELECTOR, randomSelector(holly, Pair.of(firClump, clumpChance), Pair.of(hemlockClump, clumpChance)));
    }

    // ` ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static RandomBooleanFeatureConfig booleanSelector(RegistryEntry<PlacedFeature> defaultTree, RegistryEntry<PlacedFeature> alternateTree) {
        return new RandomBooleanFeatureConfig(alternateTree, defaultTree);
    }

    private static RandomFeatureConfig singlePlacedFeature(RegistryEntry<PlacedFeature> feature) {
        return new RandomFeatureConfig(Collections.emptyList(), feature);
    }

    @SafeVarargs
    private static RandomFeatureConfig randomSelector(RegistryEntry<PlacedFeature> defaultFeature, Pair<RegistryEntry<PlacedFeature>, Float>... additionalFeatures) {
        List<RandomFeatureEntry> entries = new ArrayList<>();
        for (Pair<RegistryEntry<PlacedFeature>, Float> additionalFeature : additionalFeatures)
            entries.add(new RandomFeatureEntry(additionalFeature.getFirst(), additionalFeature.getSecond()));

        return new RandomFeatureConfig(entries, defaultFeature);

    }
}
