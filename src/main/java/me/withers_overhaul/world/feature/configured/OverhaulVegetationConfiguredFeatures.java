package me.withers_overhaul.world.feature.configured;

import com.mojang.datafixers.util.Pair;
import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.world.feature.placed.OverhaulTreePlacedFeatures;
import me.withers_overhaul.world.feature.placed.OverhaulVegetationPlacedFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static me.withers_overhaul.world.feature.OverhaulConfiguredFeatures.of;

public class OverhaulVegetationConfiguredFeatures {
    // * Basic trees
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_OAK = of("trees_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SPRUCE = of("trees_spruce");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_BIRCH = of("trees_birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_CEDAR = of("trees_cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_FIR = of("trees_fir");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_HEMLOCK = of("trees_hemlock");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_PINE = of("trees_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_LARCH = of("trees_larch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ASPEN = of("trees_aspen");
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
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_TEAK = of("clump_trees_teak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLUMP_TREES_ELM = of("clump_trees_elm");

    // * Tree alternate selectors
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_SELECTOR = of("spruce_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_SPRUCE_SELECTOR = of("mega_spruce_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_SELECTOR = of("cedar_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_CEDAR_SELECTOR = of("mega_cedar_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_SELECTOR = of("pine_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TALL_SELECTOR = of("pine_tall_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_SELECTOR = of("larch_selector");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_TALL_SELECTOR = of("larch_tall_selector");

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
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_EBONY_THICKET = of("trees_ebony_thicket");
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
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_PINE_TAIGA = of("trees_pine_taiga");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_REDWOOD_FOREST = of("trees_redwood_forest");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_SAVANNA = of("trees_savanna");
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

    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_PRAIRIE_GRASS = of("patch_prairie_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAVENDER_FLOWERS = of("lavender_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_PETALS = of("purple_petals");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntryLookup<PlacedFeature> placedFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        // * Vanilla tree references
        RegistryEntry<PlacedFeature> oak = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_CHECKED);
        RegistryEntry<ConfiguredFeature<?, ?>> oakBees005 = configuredFeatureLookup.getOrThrow(TreeConfiguredFeatures.OAK_BEES_005);
        RegistryEntry<PlacedFeature> oakBees002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_BEES_002);
        RegistryEntry<PlacedFeature> oakBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_BEES_0002);
        RegistryEntry<PlacedFeature> oakLeafLitter = placedFeatureLookup.getOrThrow(TreePlacedFeatures.OAK_LEAF_LITTER);
        RegistryEntry<PlacedFeature> fancyOak = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_CHECKED);
        RegistryEntry<PlacedFeature> fancyOakBees = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_BEES);
        RegistryEntry<PlacedFeature> fancyOakBees002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_BEES_002);
        RegistryEntry<PlacedFeature> fancyOakBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_BEES_0002);
        RegistryEntry<PlacedFeature> fancyOakLeafLitter = placedFeatureLookup.getOrThrow(TreePlacedFeatures.FANCY_OAK_LEAF_LITTER);
        RegistryEntry<PlacedFeature> spruce = placedFeatureLookup.getOrThrow(TreePlacedFeatures.SPRUCE_CHECKED);
        RegistryEntry<PlacedFeature> spruceTop = placedFeatureLookup.getOrThrow(TreePlacedFeatures.PINE_CHECKED);
        RegistryEntry<PlacedFeature> megaSpruce = placedFeatureLookup.getOrThrow(TreePlacedFeatures.MEGA_SPRUCE_CHECKED);
        RegistryEntry<PlacedFeature> megaSpruceTop = placedFeatureLookup.getOrThrow(TreePlacedFeatures.MEGA_PINE_CHECKED);
        RegistryEntry<PlacedFeature> birchBees002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.BIRCH_BEES_002);
        RegistryEntry<PlacedFeature> birchBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.BIRCH_BEES_0002);
        RegistryEntry<PlacedFeature> birchTallBees0002 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.SUPER_BIRCH_BEES_0002);
        RegistryEntry<PlacedFeature> jungle = placedFeatureLookup.getOrThrow(TreePlacedFeatures.JUNGLE_TREE);
        RegistryEntry<PlacedFeature> megaJungle = placedFeatureLookup.getOrThrow(TreePlacedFeatures.MEGA_JUNGLE_TREE_CHECKED);
        RegistryEntry<PlacedFeature> jungleBush = placedFeatureLookup.getOrThrow(TreePlacedFeatures.JUNGLE_BUSH);
        RegistryEntry<PlacedFeature> acacia = placedFeatureLookup.getOrThrow(TreePlacedFeatures.ACACIA_CHECKED);
        RegistryEntry<PlacedFeature> darkOak = placedFeatureLookup.getOrThrow(TreePlacedFeatures.DARK_OAK_CHECKED);
        RegistryEntry<PlacedFeature> darkOakLeafLitter = placedFeatureLookup.getOrThrow(TreePlacedFeatures.DARK_OAK_LEAF_LITTER);
        RegistryEntry<PlacedFeature> cherryBees005 = placedFeatureLookup.getOrThrow(TreePlacedFeatures.CHERRY_BEES_005);
        RegistryEntry<ConfiguredFeature<?, ?>> hugeBrownMushroom = configuredFeatureLookup.getOrThrow(TreeConfiguredFeatures.HUGE_BROWN_MUSHROOM);
        RegistryEntry<ConfiguredFeature<?, ?>> hugeRedMushroom = configuredFeatureLookup.getOrThrow(TreeConfiguredFeatures.HUGE_RED_MUSHROOM);
        
        // * Overhaul tree references
        RegistryEntry<PlacedFeature> maple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAPLE);
        RegistryEntry<PlacedFeature> fancyMaple = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FANCY_MAPLE);
        RegistryEntry<PlacedFeature> poplar = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.POPLAR);
        RegistryEntry<PlacedFeature> beech = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BEECH);
        //RegistryEntry<PlacedFeature> hickory = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY);
        RegistryEntry<PlacedFeature> hickoryBush = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.HICKORY_BUSH);
        //RegistryEntry<PlacedFeature> walnut = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WALNUT);
        //RegistryEntry<PlacedFeature> chestnut = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CHESTNUT);
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
        RegistryEntry<PlacedFeature> aspen = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ASPEN);
        /*RegistryEntry<PlacedFeature> kapok = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.KAPOK);
        RegistryEntry<PlacedFeature> mahogany = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAHOGANY);
        RegistryEntry<PlacedFeature> eucalyptus = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EUCALYPTUS);*/
        RegistryEntry<PlacedFeature> acaciaBush = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ACACIA_BUSH);
        //RegistryEntry<PlacedFeature> baobab = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.BAOBAB);
        RegistryEntry<PlacedFeature> paloVerde = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALO_VERDE);
        /*RegistryEntry<PlacedFeature> joshua = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JOSHUA);
        RegistryEntry<PlacedFeature> juniper = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JUNIPER);
        RegistryEntry<PlacedFeature> palm = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.PALM);*/
        RegistryEntry<PlacedFeature> ebony = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY);
        RegistryEntry<PlacedFeature> megaEbony = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MEGA_EBONY);
        RegistryEntry<PlacedFeature> ebonyBush = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.EBONY_BUSH);
        RegistryEntry<PlacedFeature> teak = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.TEAK);
        RegistryEntry<PlacedFeature> elm = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.ELM);
        /*RegistryEntry<PlacedFeature> willow = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.WILLOW);
        RegistryEntry<PlacedFeature> cypress = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.CYPRESS);
        RegistryEntry<PlacedFeature> sakura = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.SAKURA);*/
        RegistryEntry<PlacedFeature> magnolia = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.MAGNOLIA);
        RegistryEntry<PlacedFeature> floweringMagnolia = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.FLOWERING_MAGNOLIA);
        RegistryEntry<PlacedFeature> jacaranda = placedFeatureLookup.getOrThrow(OverhaulTreePlacedFeatures.JACARANDA);

        // * Tree alternate selectors
        ConfiguredFeatures.register(featureRegisterable, SPRUCE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(spruce, spruceTop));
        ConfiguredFeatures.register(featureRegisterable, MEGA_SPRUCE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(megaSpruce, megaSpruceTop));
        ConfiguredFeatures.register(featureRegisterable, CEDAR_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(cedar, cedarFlat));
        ConfiguredFeatures.register(featureRegisterable, MEGA_CEDAR_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(megaCedar, megaCedarFlat));
        ConfiguredFeatures.register(featureRegisterable, PINE_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(pine, pineTop));
        ConfiguredFeatures.register(featureRegisterable, PINE_TALL_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(pineTall, pineTopTall));
        ConfiguredFeatures.register(featureRegisterable, LARCH_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(larch, larchTop));
        ConfiguredFeatures.register(featureRegisterable, LARCH_TALL_SELECTOR, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(larchTall, larchTopTall));

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
        ConfiguredFeatures.register(featureRegisterable, TREES_BIRCH, Feature.RANDOM_SELECTOR, singlePlacedFeature(birchBees0002));
        ConfiguredFeatures.register(featureRegisterable, TREES_SPRUCE, Feature.RANDOM_SELECTOR, singlePlacedFeature(spruceSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_CEDAR, Feature.RANDOM_SELECTOR, singlePlacedFeature(cedarSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_FIR, Feature.RANDOM_SELECTOR, singlePlacedFeature(fir));
        ConfiguredFeatures.register(featureRegisterable, TREES_HEMLOCK, Feature.RANDOM_SELECTOR, singlePlacedFeature(hemlock));
        ConfiguredFeatures.register(featureRegisterable, TREES_PINE, Feature.RANDOM_SELECTOR, singlePlacedFeature(pineSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_LARCH, Feature.RANDOM_SELECTOR, singlePlacedFeature(larchSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_ASPEN, Feature.RANDOM_SELECTOR, singlePlacedFeature(aspen));
        ConfiguredFeatures.register(featureRegisterable, TREES_TEAK, Feature.RANDOM_SELECTOR, singlePlacedFeature(teak));
        ConfiguredFeatures.register(featureRegisterable, TREES_ELM, Feature.RANDOM_SELECTOR, singlePlacedFeature(elm));

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
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_TEAK, Feature.RANDOM_SELECTOR, singlePlacedFeature(teakClump));
        ConfiguredFeatures.register(featureRegisterable, CLUMP_TREES_ELM, Feature.RANDOM_SELECTOR, singlePlacedFeature(elmClump));

        // * Trees in biomes
        ConfiguredFeatures.register(featureRegisterable, TREES_ALPINE_FOREST, Feature.RANDOM_SELECTOR, biomeTrees(cedarSelector, Pair.of(spruceClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_ALPINE_TANGLE, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(spruceSelector, cedarSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_ALPINE_THICKET, Feature.RANDOM_SELECTOR, biomeTrees(megaCedarSelector, Pair.of(cedarSelector, 0.5F), Pair.of(spruceClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_ASPEN_GROVE, Feature.RANDOM_SELECTOR, biomeTrees(aspen, Pair.of(birchClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_BIRCH_FOREST, Feature.RANDOM_SELECTOR, biomeTrees(birchBees0002, Pair.of(aspenClump, 0.05F)));
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_CLOUD_FOREST,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        megaEbony,
                        Pair.of(ebony, 0.2F),
                        Pair.of(darkOak, 0.2F),
                        Pair.of(ebonyBush, 0.2F),
                        Pair.of(teakClump, 0.05F),
                        Pair.of(elmClump, 0.05F)
                )
        );
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_DARK_FOREST,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        darkOakLeafLitter,
                        Pair.of(teakClump, 0.05F),
                        Pair.of(elmClump, 0.05F),
                        Pair.of(PlacedFeatures.createEntry(hugeRedMushroom), 0.1F),
                        Pair.of(PlacedFeatures.createEntry(hugeBrownMushroom), 0.1F)
                )
        );
        //ConfiguredFeatures.register(featureRegisterable, TREES_EBONY_THICKET, Feature.RANDOM_SELECTOR, biomeTrees(megaEbony, Pair.of(ebony, 0.25F), Pair.of(ebonyBush, 0.2F), Pair.of(darkOak, 0.25F)));
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_FLOWER_FOREST,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        oakBees002,
                        Pair.of(fancyOakBees002, 0.1F),
                        Pair.of(maple, 0.2F),
                        Pair.of(fancyMaple, 0.1F),
                        Pair.of(poplar, 0.3F),
                        Pair.of(beech, 0.1F)
                )
        );
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_FOREST,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        oakBees0002,
                        Pair.of(fancyOakBees0002, 0.2F),
                        Pair.of(maple, 0.3F),
                        Pair.of(fancyMaple, 0.2F)
                )
        );
        ConfiguredFeatures.register(featureRegisterable, TREES_FROSTED_TANGLE, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(fir, hemlock));
        ConfiguredFeatures.register(featureRegisterable, TREES_FROSTED_WOODLANDS, Feature.RANDOM_SELECTOR, biomeTrees(megaHemlock, Pair.of(hemlock, 0.3F), Pair.of(firClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_GOLDEN_SWEEP, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(birchBees0002, aspen));
        ConfiguredFeatures.register(featureRegisterable, TREES_GROVE, Feature.RANDOM_SELECTOR, biomeTrees(hemlock, Pair.of(firClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_LAVENDER_FIELDS, Feature.RANDOM_SELECTOR, biomeTrees(magnolia, Pair.of(floweringMagnolia, 0.1F), Pair.of(jacaranda, 0.3F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_MONTANE_CLEARING, Feature.RANDOM_SELECTOR, biomeTrees(larchSelector, Pair.of(pineClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_MONTANE_WOODLANDS, Feature.RANDOM_SELECTOR, biomeTrees(larchTallSelector, Pair.of(larchSelector, 0.3F), Pair.of(pineClump, 0.05F)));
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_OLD_GROWTH_BIRCH_FOREST,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        birchTallBees0002,
                        Pair.of(birchBees0002, 0.3F),
                        Pair.of(aspenClump, 0.05F)
                )
        );
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_OLD_GROWTH_PINE_TAIGA,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        pineTallSelector,
                        Pair.of(pineSelector, 0.3F),
                        Pair.of(larchClump, 0.05F)
                )
        );
        ConfiguredFeatures.register(featureRegisterable, TREES_OLD_GROWTH_SNOWY_TAIGA, Feature.RANDOM_SELECTOR, biomeTrees(megaFir, Pair.of(fir, 0.3F), Pair.of(hemlockClump, 0.05F)));
        ConfiguredFeatures.register(
                featureRegisterable,
                TREES_OLD_GROWTH_SPRUCE_TAIGA,
                Feature.RANDOM_SELECTOR,
                biomeTrees(
                        megaSpruceSelector,
                        Pair.of(spruceSelector, 0.3F),
                        Pair.of(cedarClump, 0.05F)
                )
        );
        ConfiguredFeatures.register(featureRegisterable, TREES_PINE_TAIGA, Feature.RANDOM_SELECTOR, biomeTrees(pineSelector, Pair.of(larchClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_REDWOOD_FOREST, Feature.RANDOM_SELECTOR, biomeTrees(redwood, Pair.of(spruceClump, 0.2F), Pair.of(cedarClump, 0.2F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SAVANNA_PLATEAU, Feature.RANDOM_SELECTOR, biomeTrees(paloVerde, Pair.of(acaciaBush, 0.4F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SHRUBLANDS, Feature.RANDOM_SELECTOR, biomeTrees(hickoryBush, Pair.of(fancyOak, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_SNOWY_TAIGA, Feature.RANDOM_SELECTOR, biomeTrees(fir, Pair.of(hemlockClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_TAIGA, Feature.RANDOM_SELECTOR, biomeTrees(spruceSelector, Pair.of(cedarClump, 0.05F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_FOREST, Feature.RANDOM_SELECTOR, biomeTrees(maple, Pair.of(fancyMaple, 0.1F), Pair.of(darkOak, 0.5F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_GRAVELLY_HILLS, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(pineSelector, larchSelector));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_HILLS, Feature.RANDOM_SELECTOR, biomeTrees(oak, Pair.of(fancyOak, 0.1F), Pair.of(elm, 0.5F)));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINDSWEPT_SAVANNA, Feature.RANDOM_BOOLEAN_SELECTOR, treeBooleanSelector(acacia, paloVerde));
        ConfiguredFeatures.register(featureRegisterable, TREES_WINTER_WONDERLAND, Feature.RANDOM_SELECTOR, biomeTrees(holly, Pair.of(firClump, 0.05F), Pair.of(hemlockClump, 0.05F)));

        // * Other plants
        ConfiguredFeatures.register(featureRegisterable, PATCH_PRAIRIE_GRASS, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(
                        32, 7, 3, PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                                        new WeightedBlockStateProvider(
                                                Pool.<BlockState>builder()
                                                        .add(NaturalBlocks.SHORT_PRAIRIE_GRASS.getDefaultState(), 1)
                                                        .add(NaturalBlocks.TALL_PRAIRIE_GRASS.getDefaultState(), 1)
                                        )
                )))
        );
        ConfiguredFeatures.register(featureRegisterable, LAVENDER_FLOWERS, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(
                List.of(
                        new RandomFeatureEntry(PlacedFeatures.createEntry(Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.LILAC.getDefaultState())), BlockPredicate.IS_AIR
                        ))), 0.01F),
                        new RandomFeatureEntry(PlacedFeatures.createEntry(Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(
                                Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.PEONY.getDefaultState())), BlockPredicate.IS_AIR
                        ))), 0.01F)
                ),
                PlacedFeatures.createEntry(Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32, 7, 3, PlacedFeatures.createEntry(
                        Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(NaturalBlocks.LAVENDER.getDefaultState())), BlockPredicate.IS_AIR
                )))
        ));
        ConfiguredFeatures.register(featureRegisterable, PURPLE_PETALS, Feature.FLOWER, new RandomPatchFeatureConfig(
                96, 6, 2, PlacedFeatures.createEntry(
                        Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(flowerbed(NaturalBlocks.PURPLE_PETALS))),
                BlockPredicate.IS_AIR
        )));
    }

    // ` ----------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static RandomBooleanFeatureConfig treeBooleanSelector(RegistryEntry<PlacedFeature> defaultTree, RegistryEntry<PlacedFeature> alternateTree) {
        return new RandomBooleanFeatureConfig(alternateTree, defaultTree);
    }

    private static RandomFeatureConfig singlePlacedFeature(RegistryEntry<PlacedFeature> feature) {
        return new RandomFeatureConfig(Collections.emptyList(), feature);
    }

    @SafeVarargs
    private static RandomFeatureConfig biomeTrees(RegistryEntry<PlacedFeature> defaultTrees, Pair<RegistryEntry<PlacedFeature>, Float>... additionalTrees) {
        List<RandomFeatureEntry> entries = new ArrayList<>();
        for (Pair<RegistryEntry<PlacedFeature>, Float> additionalTree : additionalTrees) {
            entries.add(new RandomFeatureEntry(additionalTree.getFirst(), additionalTree.getSecond()));
        }

        return new RandomFeatureConfig(entries, defaultTrees);
    }

    private static Pool.Builder<BlockState> flowerbed(Block flowerbed) {
        return segmentedBlock(flowerbed, 1, 4, FlowerbedBlock.FLOWER_AMOUNT, FlowerbedBlock.HORIZONTAL_FACING);
    }

    private static Pool.Builder<BlockState> segmentedBlock(Block block, int min, int max, IntProperty amountProperty, EnumProperty<Direction> facingProperty) {
        Pool.Builder<BlockState> builder = Pool.builder();

        for (int i = min; i <= max; i++) {
            for (Direction direction : Direction.Type.HORIZONTAL) {
                builder.add(block.getDefaultState().with(amountProperty, i).with(facingProperty, direction), 1);
            }
        }

        return builder;
    }
}
