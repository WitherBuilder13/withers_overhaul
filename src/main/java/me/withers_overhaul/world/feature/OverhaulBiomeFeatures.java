package me.withers_overhaul.world.feature;

import me.withers_overhaul.world.feature.placed.OverhaulVegetationPlacedFeatures;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.UndergroundPlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

import static me.withers_overhaul.world.feature.placed.OverhaulOrePlacedFeatures.*;

public class OverhaulBiomeFeatures extends DefaultBiomeFeatures {

    public static void addCarvers(GenerationSettings.LookupBackedBuilder builder) {
        builder.carver(ConfiguredCarvers.CAVE);
        builder.carver(ConfiguredCarvers.CAVE_EXTRA_UNDERGROUND);
        builder.carver(ConfiguredCarvers.CANYON);
    }

    public static void addOres(GenerationSettings.LookupBackedBuilder builder, boolean largeCopper) {
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_COAL_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_COAL_UPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_IRON_SMALL);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_IRON_MIDDLE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_IRON_UPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, largeCopper ? ORE_COPPER_LARGE : ORE_COPPER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_GOLD);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_GOLD_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_REDSTONE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_REDSTONE_LOWER);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_LAPIS);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_LAPIS_BURIED);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_DIAMOND);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_DIAMOND_MEDIUM);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_DIAMOND_LARGE);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, ORE_DIAMOND_BURIED);
        builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, UndergroundPlacedFeatures.UNDERWATER_MAGMA);
    }

    public static void alpineForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_ALPINE_FOREST);
    }

    public static void alpineTangleVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_ALPINE_TANGLE);
    }

    public static void alpineThicketVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_ALPINE_THICKET);
    }

    public static void aspenGroveVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_ASPEN_GROVE);
    }

    public static void birchForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_BIRCH_FOREST);
    }

    public static void cloudForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_CLOUD_FOREST);
    }

    public static void darkForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_DARK_FOREST);
    }

    public static void flowerForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_FLOWER_FOREST);
    }

    public static void forestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_FOREST);
    }

    public static void frostedTangleVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_FROSTED_TANGLE);
    }

    public static void frostedWoodlandsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_FROSTED_WOODLANDS);
    }

    public static void goldenSweepVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_GOLDEN_SWEEP);
    }

    public static void groveVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_GROVE);
    }

    public static void iceSpikesVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_ICE_SPIKES);
    }

    public static void lavenderFieldsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_LAVENDER_FIELDS);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.LAVENDER_FLOWERS);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PURPLE_PETALS);
    }

    public static void meadowVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_MEADOW);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_GRASS_MEADOW);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_MEADOW);
    }

    public static void montaneClearingVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_MONTANE_CLEARING);
    }

    public static void montaneWoodlandsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_MONTANE_WOODLANDS);
    }

    public static void oldGrowthBirchForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_OLD_GROWTH_BIRCH_FOREST);
    }

    public static void oldGrowthPineTaigaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_OLD_GROWTH_PINE_TAIGA);
    }

    public static void oldGrowthSnowyTaigaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_OLD_GROWTH_SNOWY_TAIGA);
    }

    public static void oldGrowthSpruceTaigaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_OLD_GROWTH_SPRUCE_TAIGA);
    }

    public static void plainsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_PLAINS);
    }

    public static void pineTaigaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_PINE_TAIGA);
    }

    public static void prairieVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PATCH_PRAIRIE_GRASS);
    }

    public static void redwoodForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_REDWOOD_FOREST);
    }

    public static void savannaPlateauVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_SAVANNA_PLATEAU);
    }

    public static void shrublandsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_SHRUBLANDS);
    }

    public static void snowyPlainsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_SNOWY_PLAINS);
    }

    public static void snowySlopesVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_SNOWY_SLOPES);
    }

    public static void snowyTaigaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_SNOWY_TAIGA);
    }

    public static void sunflowerPlainsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_SUNFLOWER);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_SUNFLOWER_PLAINS);
    }

    public static void taigaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_TAIGA);
    }

    public static void windsweptForestVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_WINDSWEPT_FOREST);
    }

    public static void windsweptGravellyHillsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_WINDSWEPT_GRAVELLY_HILLS);
    }

    public static void windsweptHillsVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_WINDSWEPT_HILLS);
    }

    public static void windsweptSavannaVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_WINDSWEPT_SAVANNA);
    }

    public static void winterWonderlandVegetation(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.TREES_WINTER_WONDERLAND);
    }

    public static void coldFruitPatch(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PATCH_GROUND_FRUIT_COLD);
    }

    public static void coolFruitPatch(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PATCH_GROUND_FRUIT_COOL);
    }

    public static void temperateFruitPatch(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PATCH_GROUND_FRUIT_TEMPERATE);
    }

    public static void mediterraneanFruitPatch(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PATCH_GROUND_FRUIT_MEDITERRANEAN);
    }

    public static void subtropicalFruitPatch(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OverhaulVegetationPlacedFeatures.PATCH_JALAPENOS);
    }
}
