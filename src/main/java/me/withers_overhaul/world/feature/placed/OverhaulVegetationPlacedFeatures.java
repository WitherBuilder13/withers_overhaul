package me.withers_overhaul.world.feature.placed;

import com.google.common.collect.ImmutableList;
import me.withers_overhaul.world.feature.configured.OverhaulVegetationConfiguredFeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RandomOffsetPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier;

import java.util.Collections;
import java.util.List;

import static me.withers_overhaul.world.feature.OverhaulPlacedFeatures.of;

public class OverhaulVegetationPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SPRUCE_SELECTOR = of("spruce_selector");
    public static final RegistryKey<PlacedFeature> MEGA_SPRUCE_SELECTOR = of("mega_spruce_selector");
    public static final RegistryKey<PlacedFeature> CEDAR_SELECTOR = of("cedar_selector");
    public static final RegistryKey<PlacedFeature> MEGA_CEDAR_SELECTOR = of("mega_cedar_selector");
    public static final RegistryKey<PlacedFeature> PINE_SELECTOR = of("pine_selector");
    public static final RegistryKey<PlacedFeature> PINE_TALL_SELECTOR = of("pine_tall_selector");
    public static final RegistryKey<PlacedFeature> LARCH_SELECTOR = of("larch_selector");
    public static final RegistryKey<PlacedFeature> LARCH_TALL_SELECTOR = of("larch_tall_selector");

    public static final RegistryKey<PlacedFeature> CLUMP_TREES_OAK = of("clump_trees_oak");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_SPRUCE = of("clump_trees_spruce");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_BIRCH = of("clump_trees_birch");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_CEDAR = of("clump_trees_cedar");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_FIR = of("clump_trees_fir");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_HEMLOCK = of("clump_trees_hemlock");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_PINE = of("clump_trees_pine");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_LARCH = of("clump_trees_larch");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_ASPEN = of("clump_trees_aspen");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_TEAK = of("clump_trees_teak");
    public static final RegistryKey<PlacedFeature> CLUMP_TREES_ELM = of("clump_trees_elm");

    public static final RegistryKey<PlacedFeature> TREES_ALPINE_FOREST = of("trees_alpine_forest");
    public static final RegistryKey<PlacedFeature> TREES_ALPINE_TANGLE = of("trees_alpine_tangle");
    public static final RegistryKey<PlacedFeature> TREES_ALPINE_THICKET = of("trees_alpine_thicket");
    public static final RegistryKey<PlacedFeature> TREES_ASPEN_GROVE = of("trees_aspen_grove");
    /*public static final RegistryKey<PlacedFeature> TREES_BAMBOO_JUNGLE = of("trees_bamboo_jungle");
    public static final RegistryKey<PlacedFeature> TREES_BAYOU = of("trees_bayou");
    public static final RegistryKey<PlacedFeature> TREES_BOG = of("trees_bog");*/
    public static final RegistryKey<PlacedFeature> TREES_BIRCH_FOREST = of("trees_birch_forest");
    //public static final RegistryKey<PlacedFeature> TREES_CHERRY_GROVE = of("trees_cherry_grove");
    public static final RegistryKey<PlacedFeature> TREES_CLOUD_FOREST = of("trees_cloud_forest");
    public static final RegistryKey<PlacedFeature> TREES_DARK_FOREST = of("trees_dark_forest");
    //public static final RegistryKey<PlacedFeature> TREES_DESERT_FIELDS = of("trees_desert_fields");
    //public static final RegistryKey<PlacedFeature> TREES_EBONY_THICKET = of("trees_ebony_thicket");
    //public static final RegistryKey<PlacedFeature> TREES_ENCHANTED_FOREST = of("trees_enchanted_forest");
    //public static final RegistryKey<PlacedFeature> TREES_ERODED_BADLANDS = of("trees_eroded_badlands");
    public static final RegistryKey<PlacedFeature> TREES_FLOWER_FOREST = of("trees_flower_forest");
    public static final RegistryKey<PlacedFeature> TREES_FOREST = of("trees_forest");
    public static final RegistryKey<PlacedFeature> TREES_FROSTED_TANGLE = of("trees_frosted_tangle");
    public static final RegistryKey<PlacedFeature> TREES_FROSTED_WOODLANDS = of("trees_frosted_woodlands");
    public static final RegistryKey<PlacedFeature> TREES_GOLDEN_SWEEP = of("trees_golden_sweep");
    public static final RegistryKey<PlacedFeature> TREES_GROVE = of("trees_grove");
    public static final RegistryKey<PlacedFeature> TREES_ICE_SPIKES = of("trees_ice_spikes");
    //public static final RegistryKey<PlacedFeature> TREES_JUNGLE = of("trees_jungle");
    public static final RegistryKey<PlacedFeature> TREES_LAVENDER_FIELDS = of("trees_lavender_fields");
    public static final RegistryKey<PlacedFeature> TREES_MEADOW = of("trees_meadow");
    //public static final RegistryKey<PlacedFeature> TREES_MONSOON_RAINFOREST = of("trees_monsoon_rainforest");
    public static final RegistryKey<PlacedFeature> TREES_MONTANE_CLEARING = of("trees_montane_clearing");
    public static final RegistryKey<PlacedFeature> TREES_MONTANE_WOODLANDS = of("trees_montane_woodlands");
    //public static final RegistryKey<PlacedFeature> TREES_OASIS = of("trees_oasis");
    public static final RegistryKey<PlacedFeature> TREES_OLD_GROWTH_BIRCH_FOREST = of("trees_old_growth_birch_forest");
    public static final RegistryKey<PlacedFeature> TREES_OLD_GROWTH_PINE_TAIGA = of("trees_old_growth_pine_taiga");
    public static final RegistryKey<PlacedFeature> TREES_OLD_GROWTH_SNOWY_TAIGA = of("trees_old_growth_snowy_taiga");
    public static final RegistryKey<PlacedFeature> TREES_OLD_GROWTH_SPRUCE_TAIGA = of("trees_old_growth_spruce_taiga");
    public static final RegistryKey<PlacedFeature> TREES_PINE_TAIGA = of("trees_pine_taiga");
    public static final RegistryKey<PlacedFeature> TREES_PLAINS = of("trees_plains");
    public static final RegistryKey<PlacedFeature> TREES_REDWOOD_FOREST = of("trees_redwood_forest");
    //public static final RegistryKey<PlacedFeature> TREES_SAVANNA = of("trees_savanna");
    public static final RegistryKey<PlacedFeature> TREES_SAVANNA_PLATEAU = of("trees_savanna_plateau");
    public static final RegistryKey<PlacedFeature> TREES_SNOWY_PLAINS = of("trees_snowy_plains");
    public static final RegistryKey<PlacedFeature> TREES_SNOWY_SLOPES = of("trees_snowy_slopes");
    public static final RegistryKey<PlacedFeature> TREES_SNOWY_TAIGA = of("trees_snowy_taiga");
    //public static final RegistryKey<PlacedFeature> TREES_SPARSE_JUNGLE = of("trees_sparse_jungle");
    public static final RegistryKey<PlacedFeature> TREES_SUNFLOWER_PLAINS = of("trees_sunflower_plains");
    //public static final RegistryKey<PlacedFeature> TREES_SWAMP = of("trees_swamp");
    public static final RegistryKey<PlacedFeature> TREES_TAIGA = of("trees_taiga");
    /*public static final RegistryKey<PlacedFeature> TREES_TANGLED_TROPICS = of("trees_tangled_tropics");
    public static final RegistryKey<PlacedFeature> TREES_TROPICAL_RAINFOREST = of("trees_tropical_rainforest");
    public static final RegistryKey<PlacedFeature> TREES_WHIMSY = of("trees_whimsy");*/
    public static final RegistryKey<PlacedFeature> TREES_WINDSWEPT_FOREST = of("trees_windswept_forest");
    public static final RegistryKey<PlacedFeature> TREES_WINDSWEPT_GRAVELLY_HILLS = of("trees_windswept_gravelly_hills");
    public static final RegistryKey<PlacedFeature> TREES_WINDSWEPT_HILLS = of("trees_windswept_hills");
    public static final RegistryKey<PlacedFeature> TREES_WINDSWEPT_SAVANNA = of("trees_windswept_savanna");
    public static final RegistryKey<PlacedFeature> TREES_WINTER_WONDERLAND = of("trees_winter_wonderland");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // * Tree selectors
        RegistryEntry<ConfiguredFeature<?, ?>> spruceSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.SPRUCE_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> megaSpruceSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.MEGA_SPRUCE_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> cedarSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.CEDAR_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> megaCedarSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.MEGA_CEDAR_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> pineSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.PINE_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> pineTallSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.PINE_TALL_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> larchSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.LARCH_SELECTOR);
        RegistryEntry<ConfiguredFeature<?, ?>> larchTallSelector = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.LARCH_TALL_SELECTOR);

        // * Individual trees
        RegistryEntry<ConfiguredFeature<?, ?>> oak = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_OAK);
        RegistryEntry<ConfiguredFeature<?, ?>> spruce = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_SPRUCE);
        RegistryEntry<ConfiguredFeature<?, ?>> birch = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_BIRCH);
        RegistryEntry<ConfiguredFeature<?, ?>> cedar = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_CEDAR);
        RegistryEntry<ConfiguredFeature<?, ?>> fir = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_FIR);
        RegistryEntry<ConfiguredFeature<?, ?>> hemlock = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_HEMLOCK);
        RegistryEntry<ConfiguredFeature<?, ?>> pine = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_PINE);
        RegistryEntry<ConfiguredFeature<?, ?>> larch = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_LARCH);
        RegistryEntry<ConfiguredFeature<?, ?>> aspen = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_ASPEN);
        RegistryEntry<ConfiguredFeature<?, ?>> teak = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_TEAK);
        RegistryEntry<ConfiguredFeature<?, ?>> elm = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_ELM);

        // * Biome trees
        RegistryEntry<ConfiguredFeature<?, ?>> treesAlpineForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_ALPINE_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesAlpineTangle = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_ALPINE_TANGLE);
        RegistryEntry<ConfiguredFeature<?, ?>> treesAlpineThicket = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_ALPINE_THICKET);
        RegistryEntry<ConfiguredFeature<?, ?>> treesAspenGrove = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_ASPEN_GROVE);
        RegistryEntry<ConfiguredFeature<?, ?>> treesBirchForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_BIRCH_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesCloudForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_CLOUD_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesDarkForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_DARK_FOREST);
        //RegistryEntry<ConfiguredFeature<?, ?>> treesEbonyThicket = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_EBONY_THICKET);
        RegistryEntry<ConfiguredFeature<?, ?>> treesFlowerForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_FLOWER_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesFrostedTangle = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_FROSTED_TANGLE);
        RegistryEntry<ConfiguredFeature<?, ?>> treesFrostedWoodlands = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_FROSTED_WOODLANDS);
        RegistryEntry<ConfiguredFeature<?, ?>> treesGoldenSweep = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_GOLDEN_SWEEP);
        RegistryEntry<ConfiguredFeature<?, ?>> treesGrove = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_GROVE);
        RegistryEntry<ConfiguredFeature<?, ?>> treesIceSpikes = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_FIR);
        RegistryEntry<ConfiguredFeature<?, ?>> treesLavenderFields = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_LAVENDER_FIELDS);
        RegistryEntry<ConfiguredFeature<?, ?>> treesMeadow = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.CLUMP_TREES_ELM);
        RegistryEntry<ConfiguredFeature<?, ?>> treesMontaneClearing = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_MONTANE_CLEARING);
        RegistryEntry<ConfiguredFeature<?, ?>> treesMontaneWoodlands = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_MONTANE_WOODLANDS);
        RegistryEntry<ConfiguredFeature<?, ?>> treesOldGrowthBirchForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_OLD_GROWTH_BIRCH_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesOldGrowthPineTaiga = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_OLD_GROWTH_PINE_TAIGA);
        RegistryEntry<ConfiguredFeature<?, ?>> treesOldGrowthSnowyTaiga = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_OLD_GROWTH_SNOWY_TAIGA);
        RegistryEntry<ConfiguredFeature<?, ?>> treesOldGrowthSpruceTaiga = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_OLD_GROWTH_SPRUCE_TAIGA);
        RegistryEntry<ConfiguredFeature<?, ?>> treesPlains = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.CLUMP_TREES_OAK);
        RegistryEntry<ConfiguredFeature<?, ?>> treesPineTaiga = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_PINE_TAIGA);
        RegistryEntry<ConfiguredFeature<?, ?>> treesRedwoodForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_REDWOOD_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesSavannaPlateau = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_SAVANNA_PLATEAU);
        RegistryEntry<ConfiguredFeature<?, ?>> treesSnowyPlains = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.CLUMP_TREES_FIR);
        RegistryEntry<ConfiguredFeature<?, ?>> treesSnowySlopes = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.CLUMP_TREES_HEMLOCK);
        RegistryEntry<ConfiguredFeature<?, ?>> treesSnowyTaiga = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_SNOWY_TAIGA);
        RegistryEntry<ConfiguredFeature<?, ?>> treesTaiga = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_TAIGA);
        RegistryEntry<ConfiguredFeature<?, ?>> treesWindsweptForest = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_WINDSWEPT_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesWindsweptGravellyHills = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_WINDSWEPT_GRAVELLY_HILLS);
        RegistryEntry<ConfiguredFeature<?, ?>> treesWindsweptHills = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_WINDSWEPT_HILLS);
        RegistryEntry<ConfiguredFeature<?, ?>> treesWindsweptSavanna = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_WINDSWEPT_FOREST);
        RegistryEntry<ConfiguredFeature<?, ?>> treesWinterWonderland = configuredFeatureLookup.getOrThrow(OverhaulVegetationConfiguredFeatures.TREES_WINTER_WONDERLAND);

        PlacedFeatures.register(featureRegisterable, SPRUCE_SELECTOR, spruceSelector, empty());
        PlacedFeatures.register(featureRegisterable, MEGA_SPRUCE_SELECTOR, megaSpruceSelector, empty());
        PlacedFeatures.register(featureRegisterable, CEDAR_SELECTOR, cedarSelector, empty());
        PlacedFeatures.register(featureRegisterable, MEGA_CEDAR_SELECTOR, megaCedarSelector, empty());
        PlacedFeatures.register(featureRegisterable, PINE_SELECTOR, pineSelector, empty());
        PlacedFeatures.register(featureRegisterable, PINE_TALL_SELECTOR, pineTallSelector, empty());
        PlacedFeatures.register(featureRegisterable, LARCH_SELECTOR, larchSelector, empty());
        PlacedFeatures.register(featureRegisterable, LARCH_TALL_SELECTOR, larchTallSelector, empty());

        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_OAK, oak, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_SPRUCE, spruce, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_BIRCH, birch, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_CEDAR, cedar, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_FIR, fir, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_HEMLOCK, hemlock, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_PINE, pine, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_LARCH, larch, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_ASPEN, aspen, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_TEAK, teak, clumpModifiers().build());
        PlacedFeatures.register(featureRegisterable, CLUMP_TREES_ELM, elm, clumpModifiers().build());
        
        PlacedFeatures.register(featureRegisterable, TREES_ALPINE_FOREST, treesAlpineForest, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_ALPINE_TANGLE, treesAlpineTangle, treeModifiers(3));
        PlacedFeatures.register(featureRegisterable, TREES_ALPINE_THICKET, treesAlpineThicket, treeModifiers(20));
        PlacedFeatures.register(featureRegisterable, TREES_ASPEN_GROVE, treesAspenGrove, treeModifiers(15));
        PlacedFeatures.register(featureRegisterable, TREES_BIRCH_FOREST, treesBirchForest, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_CLOUD_FOREST, treesCloudForest, treeModifiers(40));
        PlacedFeatures.register(featureRegisterable, TREES_DARK_FOREST, treesDarkForest, treeModifiers(20));
        //PlacedFeatures.register(featureRegisterable, TREES_EBONY_THICKET, treesEbonyThicket, treeModifiers(30));
        PlacedFeatures.register(featureRegisterable, TREES_FLOWER_FOREST, treesFlowerForest, treeModifiers(20));
        PlacedFeatures.register(featureRegisterable, TREES_FOREST, treesForest, treeModifiers(15));
        PlacedFeatures.register(featureRegisterable, TREES_FROSTED_TANGLE, treesFrostedTangle, treeModifiers(3));
        PlacedFeatures.register(featureRegisterable, TREES_FROSTED_WOODLANDS, treesFrostedWoodlands, treeModifiers(20));
        PlacedFeatures.register(featureRegisterable, TREES_GOLDEN_SWEEP, treesGoldenSweep, treeModifiers(3));
        PlacedFeatures.register(featureRegisterable, TREES_GROVE, treesGrove, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_ICE_SPIKES, treesIceSpikes, treeModifiers(1));
        PlacedFeatures.register(featureRegisterable, TREES_LAVENDER_FIELDS, treesLavenderFields, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_MEADOW, treesMeadow, treeSparseModifiers(5));
        PlacedFeatures.register(featureRegisterable, TREES_MONTANE_CLEARING, treesMontaneClearing, treeModifiers(2));
        PlacedFeatures.register(featureRegisterable, TREES_MONTANE_WOODLANDS, treesMontaneWoodlands, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_OLD_GROWTH_BIRCH_FOREST, treesOldGrowthBirchForest, treeModifiers(15));
        PlacedFeatures.register(featureRegisterable, TREES_OLD_GROWTH_PINE_TAIGA, treesOldGrowthPineTaiga, treeModifiers(15));
        PlacedFeatures.register(featureRegisterable, TREES_OLD_GROWTH_SNOWY_TAIGA, treesOldGrowthSnowyTaiga, treeModifiers(20));
        PlacedFeatures.register(featureRegisterable, TREES_OLD_GROWTH_SPRUCE_TAIGA, treesOldGrowthSpruceTaiga, treeModifiers(20));
        PlacedFeatures.register(featureRegisterable, TREES_PLAINS, treesPlains, treeSparseModifiers(6));
        PlacedFeatures.register(featureRegisterable, TREES_PINE_TAIGA, treesPineTaiga, treeModifiers(6));
        PlacedFeatures.register(featureRegisterable, TREES_REDWOOD_FOREST, treesRedwoodForest, treeModifiers(20));
        PlacedFeatures.register(featureRegisterable, TREES_SAVANNA_PLATEAU, treesSavannaPlateau, treeModifiers(8));
        PlacedFeatures.register(featureRegisterable, TREES_SNOWY_PLAINS, treesSnowyPlains, treeSparseModifiers(5));
        PlacedFeatures.register(featureRegisterable, TREES_SNOWY_SLOPES, treesSnowySlopes, treeSparseModifiers(5));
        PlacedFeatures.register(featureRegisterable, TREES_SNOWY_TAIGA, treesSnowyTaiga, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_SUNFLOWER_PLAINS, treesPlains, treeSparseModifiers(2));
        PlacedFeatures.register(featureRegisterable, TREES_TAIGA, treesTaiga, treeModifiers(10));
        PlacedFeatures.register(featureRegisterable, TREES_WINDSWEPT_FOREST, treesWindsweptForest, treeModifiers(3));
        PlacedFeatures.register(featureRegisterable, TREES_WINDSWEPT_GRAVELLY_HILLS, treesWindsweptGravellyHills, treeModifiers(1));
        PlacedFeatures.register(featureRegisterable, TREES_WINDSWEPT_HILLS, treesWindsweptHills, treeModifiers(1));
        PlacedFeatures.register(featureRegisterable, TREES_WINDSWEPT_SAVANNA, treesWindsweptSavanna, treeModifiers(2));
        PlacedFeatures.register(featureRegisterable, TREES_WINTER_WONDERLAND, treesWinterWonderland, treeModifiers(15));
    }

    private static ImmutableList.Builder<PlacementModifier> clumpModifiers() {
        return ImmutableList.<PlacementModifier>builder()
                .add(PlacedFeatures.createCountExtraModifier(3, 0.1F, 1))
                .add(RandomOffsetPlacementModifier.of(ConstantIntProvider.create(4), ConstantIntProvider.create(3)))
                .add(SurfaceWaterDepthFilterPlacementModifier.of(0))
                .add(PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP);
    }
    
    private static List<PlacementModifier> treeModifiers(int count) {
        return VegetationPlacedFeatures.treeModifiers(PlacedFeatures.createCountExtraModifier(count, 0.1F, 1));
    }

    private static List<PlacementModifier> treeSparseModifiers(int emptyWeight) {
        Pool< IntProvider > pool = Pool.<IntProvider>builder()
                .add(ConstantIntProvider.create(0), emptyWeight)
                .add(ConstantIntProvider.create(1), 1)
                .build();
        return VegetationPlacedFeatures.treeModifiers(CountPlacementModifier.of(new WeightedListIntProvider(pool)));
    }

    public static List<PlacementModifier> empty() {
        return Collections.emptyList();
    }
}
