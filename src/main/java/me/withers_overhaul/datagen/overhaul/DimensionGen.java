package me.withers_overhaul.datagen.overhaul;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static me.withers_overhaul.world.biome.OverhaulBiomeKeys.*;
import static net.minecraft.world.biome.BiomeKeys.*;

public class DimensionGen {

    public static List<JSONObject> parameterSets = new ArrayList<>();

    public static final Pair<Float, Float> defaultParameter = Pair.of(-1.0F, 1.0F);
    public static final Pair<Float, Float>[] temperatureParameters = new Pair[]{
            Pair.of(-1.0F, -0.55F),
            Pair.of(-0.55F, -0.25F),
            Pair.of(-0.25F, 0.0F),
            Pair.of(0.0F, 0.25F),
            Pair.of(0.25F, 0.55F),
            Pair.of(0.55F, 1.0F)
    };
    public static final Pair<Float, Float>[] humidityParameters = new Pair[]{
            Pair.of(-1.0F, -0.35F),
            Pair.of(-0.35F, -0.1F),
            Pair.of(-0.1F, 0.1F),
            Pair.of(0.1F, 0.3F),
            Pair.of(0.3F, 1.0F)
    };
    public static final Pair<Float, Float>[] erosionParameters = new Pair[]{
            Pair.of(-1.0F, -0.78F),
            Pair.of(-0.78F, -0.375F),
            Pair.of(-0.375F, -0.2225F),
            Pair.of(-0.2225F, 0.05F),
            Pair.of(0.05F, 0.45F),
            Pair.of(0.45F, 0.55F),
            Pair.of(0.55F, 1.0F)
    };

    public static final Pair<Float, Float> islandContinentalness = Pair.of(-1.2F, -1.05F);
    public static final Pair<Float, Float> deepOceanContinentalness = Pair.of(-1.05F, -0.455F);
    public static final Pair<Float, Float> oceanContinentalness = Pair.of(-0.455F, -0.19F);
    public static final Pair<Float, Float> coastContinentalness = Pair.of(-0.19F, -0.11F);
    public static final Pair<Float, Float> nearInlandContinentalness = Pair.of(-0.11F, 0.03F);
    public static final Pair<Float, Float> midInlandContinentalness = Pair.of(0.03F, 0.3F);
    public static final Pair<Float, Float> farInlandContinentalness = Pair.of(0.3F, 1.0F);

    public static final Pair<Float, Float> midWeirdness1 = Pair.of(-1.0F, -0.93333334F);
    public static final Pair<Float, Float> highWeirdness2 = Pair.of(-0.93333334F, -0.7666667F);
    public static final Pair<Float, Float> peakWeirdness3 = Pair.of(-0.7666667F, -0.56666666F);
    public static final Pair<Float, Float> highWeirdness4 = Pair.of(-0.56666666F, -0.4F);
    public static final Pair<Float, Float> midWeirdness5 = Pair.of(-0.4F, -0.26666668F);
    public static final Pair<Float, Float> lowWeirdness6 = Pair.of(-0.26666668F, -0.05F);
    public static final Pair<Float, Float> valleyWeirdness7 = Pair.of(-0.05F, 0.05F);
    public static final Pair<Float, Float> lowWeirdness8 = Pair.of(0.05F, 0.26666668F);
    public static final Pair<Float, Float> midWeirdness9 = Pair.of(0.26666668F, 0.4F);
    public static final Pair<Float, Float> highWeirdness10 = Pair.of(0.4F, 0.56666666F);
    public static final Pair<Float, Float> peakWeirdness11 = Pair.of(0.56666666F, 0.7666667F);
    public static final Pair<Float, Float> highWeirdness12 = Pair.of(0.7666667F, 0.93333334F);
    public static final Pair<Float, Float> midWeirdness13 = Pair.of(0.93333334F, 1.0F);

    public static final Pair<Float, Float>[] lowWeirdness = new Pair[]{lowWeirdness6, lowWeirdness8};

    public static final Pair<Float, Float>[] midWeirdness = new Pair[]{midWeirdness1, midWeirdness5, midWeirdness9, midWeirdness13};

    public static final Pair<Float, Float>[] midWeirdnessN = new Pair[]{midWeirdness1, midWeirdness5};

    public final Pair<Float, Float>[] midWeirdnessP = new Pair[]{midWeirdness9, midWeirdness13};

    public static final Pair<Float, Float>[] highWeirdness = new Pair[]{highWeirdness2, highWeirdness4, highWeirdness10, highWeirdness12};

    public static final Pair<Float, Float>[] highWeirdnessN = new Pair[]{highWeirdness2, highWeirdness4};

    public static final Pair<Float, Float>[] highWeirdnessP = new Pair[]{highWeirdness10, highWeirdness12};

    public static final Pair<Float, Float>[] peakWeirdness = new Pair[]{peakWeirdness3, peakWeirdness11};

    // `------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final RegistryKey<Biome>[][] lowlandBiomes = new RegistryKey[][]{
            {SNOWY_PLAINS, ICE_SPIKES, SNOWY_TAIGA, OLD_GROWTH_SNOWY_TAIGA, WINTER_WONDERLAND},
            {TUNDRA, TAIGA, TAIGA, OLD_GROWTH_SPRUCE_TAIGA, REDWOOD_FOREST},
            {PRAIRIE, PINE_TAIGA, OLD_GROWTH_PINE_TAIGA, BIRCH_FOREST, OLD_GROWTH_BIRCH_FOREST},
            {PLAINS, SUNFLOWER_PLAINS, FOREST, FOREST, FLOWER_FOREST},
            {SAVANNA, SAVANNA, SHRUBLANDS, LAVENDER_FIELDS, ENCHANTED_FOREST},
            {DESERT, DESERT_FIELDS, SPARSE_JUNGLE, JUNGLE, TROPICAL_RAINFOREST}
    };

    public static final RegistryKey<Biome>[][] highlandBiomes = new RegistryKey[][]{
            {SNOWY_SLOPES, SNOWY_SLOPES, GROVE, FROSTED_WOODLANDS, WINTER_WONDERLAND},
            {TUNDRA, ALPINE_FOREST, ALPINE_FOREST, ALPINE_THICKET, REDWOOD_FOREST},
            {STEPPE, MONTANE_CLEARING, MONTANE_WOODLANDS, ASPEN_GROVE, PALE_GARDEN},
            {MEADOW, MEADOW, DARK_FOREST, DARK_FOREST, CLOUD_FOREST},
            {SAVANNA_PLATEAU, SAVANNA_PLATEAU, SHRUBLANDS, CHERRY_GROVE, ENCHANTED_FOREST},
            {BADLANDS, WOODED_BADLANDS, SPARSE_JUNGLE, BAMBOO_JUNGLE, MONSOON_RAINFOREST}
    };

    public static final RegistryKey<Biome>[][] windsweptBiomes = new RegistryKey[][]{
            {GLACIAL_SWEEP, GLACIAL_SWEEP, FROSTED_TANGLE, FROSTED_TANGLE, FROSTED_TANGLE},
            {WINDSWEPT_TUNDRA, ALPINE_TANGLE, ALPINE_TANGLE, ALPINE_TANGLE, ALPINE_TANGLE},
            {WINDSWEPT_GRAVELLY_HILLS, WINDSWEPT_GRAVELLY_HILLS, WINDSWEPT_GRAVELLY_HILLS, GOLDEN_SWEEP, GOLDEN_SWEEP},
            {WINDSWEPT_HILLS, WINDSWEPT_HILLS, WINDSWEPT_FOREST, WINDSWEPT_FOREST, WINDSWEPT_FOREST},
            {WINDSWEPT_SAVANNA, WINDSWEPT_SAVANNA, WHIMSY, WHIMSY, WHIMSY},
            {ERODED_BADLANDS, ERODED_BADLANDS, TANGLED_TROPICS, TANGLED_TROPICS, TANGLED_TROPICS}
    };

    public static final RegistryKey<Biome>[][] peakBiomes = new RegistryKey[][]{
            {FROZEN_PEAKS, FROZEN_PEAKS, FROZEN_PEAKS, FROZEN_PEAKS, FROZEN_PEAKS},
            {ALPINE_PEAKS, ALPINE_PEAKS, ALPINE_PEAKS, ALPINE_PEAKS, ALPINE_PEAKS},
            {JAGGED_PEAKS, JAGGED_PEAKS, JAGGED_PEAKS, JAGGED_PEAKS, JAGGED_PEAKS},
            {STONY_PEAKS, STONY_PEAKS, STONY_PEAKS, STONY_PEAKS, STONY_PEAKS},
            {SUNBAKED_PEAKS, SUNBAKED_PEAKS, PAINTED_PEAKS, PAINTED_PEAKS, PAINTED_PEAKS},
            {BADLANDS, BADLANDS, VOLCANIC_PEAKS, VOLCANIC_PEAKS, VOLCANIC_PEAKS}
    };

    public static final RegistryKey<Biome>[][] swampBiomes = new RegistryKey[][]{
            {FROZEN_WETLANDS, FROZEN_WETLANDS, FROZEN_WETLANDS, FROZEN_WETLANDS, FROZEN_WETLANDS},
            {BOG, BOG, BOG, BOG, BOG},
            {SWAMP, SWAMP, SWAMP, SWAMP, SWAMP},
            {MARSH, MARSH, MARSH, MARSH, MARSH},
            {SALT_MARSH, SALT_MARSH, BAYOU, BAYOU, BAYOU},
            {OASIS, OASIS, MANGROVE_SWAMP, MANGROVE_SWAMP, MANGROVE_SWAMP}
    };

    public static final RegistryKey<Biome>[][] beachBiomes = new RegistryKey[][]{
            {SNOWY_BEACH, SNOWY_BEACH, SNOWY_BEACH, SNOWY_BEACH, SNOWY_BEACH},
            {CHARCOAL_SHORE, CHARCOAL_SHORE, CHARCOAL_SHORE, CHARCOAL_SHORE, CHARCOAL_SHORE},
            {STONY_SHORE, STONY_SHORE, STONY_SHORE, STONY_SHORE, STONY_SHORE},
            {BEACH, BEACH, BEACH, BEACH, BEACH},
            {SUNBAKED_SHORE, SUNBAKED_SHORE, PAINTED_BEACH, PAINTED_BEACH, PAINTED_BEACH},
            {DESERT, DESERT_FIELDS, TROPICAL_BEACH, TROPICAL_BEACH, TROPICAL_BEACH}
    };

    public static final RegistryKey<Biome>[][] riverBiomes = new RegistryKey[][]{
            {FROZEN_RIVER, FROZEN_RIVER, FROZEN_RIVER, FROZEN_RIVER, FROZEN_RIVER},
            {COLD_RIVER, COLD_RIVER, COLD_RIVER, COLD_RIVER, COLD_RIVER},
            {COOL_RIVER, COOL_RIVER, COOL_RIVER, COOL_RIVER, COOL_RIVER},
            {RIVER, RIVER, RIVER, RIVER, RIVER},
            {SALT_RIVER, SALT_RIVER, LUKEWARM_RIVER, LUKEWARM_RIVER, LUKEWARM_RIVER},
            {SANDY_RIVER, SANDY_RIVER, LUSH_RIVER, LUSH_RIVER, LUSH_RIVER}
    };

    public static final RegistryKey<Biome>[][] oceanBiomes = new RegistryKey[][]{
            {FROZEN_OCEAN, COLD_OCEAN, COOL_OCEAN, OCEAN, LUKEWARM_OCEAN, WARM_OCEAN},
            {DEEP_FROZEN_OCEAN, DEEP_COLD_OCEAN, DEEP_COOL_OCEAN, DEEP_OCEAN, DEEP_LUKEWARM_OCEAN, DEEP_WARM_OCEAN},
            {SHIMMERING_WASTELANDS, ASHEN_FIELDS, FORGOTTEN_ISLES, MUSHROOM_FIELDS, RAINBOW_FIELDS, LAGOON},
            {CRYSTAL_CAVES_FROZEN, CRYSTAL_CAVES_COLD, CRYSTAL_CAVES_COOL, CRYSTAL_CAVES, CRYSTAL_CAVES_LUKEWARM, CRYSTAL_CAVES_WARM}
    };

    public static final RegistryKey<Biome>[][] caveBiomes = new RegistryKey[][]{
            {FROSTBURN_CAVES, FROSTBURN_CAVES, FROSTBURN_CAVES, FROSTBURN_CAVES, FROSTBURN_CAVES},
            {FUNGAL_CHASM, FUNGAL_CHASM, FUNGAL_CHASM, FUNGAL_CHASM, FUNGAL_CHASM},
            {DRIPSTONE_CAVES, DRIPSTONE_CAVES, DRIPSTONE_CAVES, DRIPSTONE_CAVES, DRIPSTONE_CAVES},
            {ECHOING_HOLLOW, ECHOING_HOLLOW, ECHOING_HOLLOW, ECHOING_HOLLOW, ECHOING_HOLLOW},
            {PHANTOM_HOLLOW, PHANTOM_HOLLOW, PASTEL_CAVERNS, PASTEL_CAVERNS, PASTEL_CAVERNS},
            {BURIED_DUNES, BURIED_DUNES, LUSH_CAVES, LUSH_CAVES, LUSH_CAVES}
    };

    public static final RegistryKey<Biome>[][] deepCaveBiomes = new RegistryKey[][]{
            {SUBZERO_ABYSS, SUBZERO_ABYSS, SUBZERO_ABYSS, SUBZERO_ABYSS, SUBZERO_ABYSS},
            {PALE_UNDERGROWTH, PALE_UNDERGROWTH, PALE_UNDERGROWTH, PALE_UNDERGROWTH, PALE_UNDERGROWTH},
            {TOXIC_WASTES, TOXIC_WASTES, TOXIC_WASTES, TOXIC_WASTES, TOXIC_WASTES},
            {DEEP_DARK, DEEP_DARK, DEEP_DARK, DEEP_DARK, DEEP_DARK},
            {SPECTRAL_ABYSS, SPECTRAL_ABYSS, MUTED_TUNNELS, MUTED_TUNNELS, MUTED_TUNNELS},
            {FOSSILIZED_DEPTHS, FOSSILIZED_DEPTHS, MOLTEN_UNDERGROWTH, MOLTEN_UNDERGROWTH, MOLTEN_UNDERGROWTH}
    };

    // ` ------------------------------------------------------------------------------------------------------------------

    public static void addBiomes() {
        addOceanBiomes();
        addLandBiomes();
        addCaveBiomes();
    }


    public static void addOceanBiomes() {
        addCaveParameterSet(defaultParameter, defaultParameter, islandContinentalness, defaultParameter, defaultParameter, GLOWING_GROTTO);

        for (int t = 0; t < temperatureParameters.length; t++) {
            addSurfaceParameterSet(temperatureParameters[t], defaultParameter, oceanContinentalness, defaultParameter, defaultParameter, oceanBiomes[0][t]);
            addSurfaceParameterSet(temperatureParameters[t], defaultParameter, deepOceanContinentalness, defaultParameter, defaultParameter, oceanBiomes[1][t]);
            addSurfaceParameterSet(temperatureParameters[t], defaultParameter, islandContinentalness, defaultParameter, defaultParameter, oceanBiomes[2][t]);
            addCaveParameterSet(
                    temperatureParameters[t], defaultParameter, range(deepOceanContinentalness, oceanContinentalness), defaultParameter, defaultParameter, oceanBiomes[3][t]
            );
        }
    }

    public static void addLandBiomes() {
        for (int t = 0; t < temperatureParameters.length; t++) {
            for (int h = 0; h < humidityParameters.length; h++) {
                addLowlandBiomes(t, h);
                addHighlandBiomes(t, h);
                addWindsweptBiomes(t, h);
                addPeakBiomes(t, h);
                addSwampBiomes(t, h);
                addBeachBiomes(t, h);
                addRiverBiomes(t, h);
            }
        }
    }

    public static void addLowlandBiomes(int t, int h) {
        // * Near-Far, E3-4, Low-Mid
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(nearInlandContinentalness, farInlandContinentalness),
                range(erosionParameters[3], erosionParameters[4]),
                midWeirdness1,
                lowlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(nearInlandContinentalness, farInlandContinentalness),
                range(erosionParameters[3], erosionParameters[4]),
                range(midWeirdness5, lowWeirdness6),
                lowlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(nearInlandContinentalness, farInlandContinentalness),
                range(erosionParameters[3], erosionParameters[4]),
                range(lowWeirdness8, midWeirdness9),
                lowlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(nearInlandContinentalness, farInlandContinentalness),
                range(erosionParameters[3], erosionParameters[4]),
                midWeirdness13,
                lowlandBiomes[t][h]
        );
        // * Near, E3-5, Low-Mid (W 1-6)
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                nearInlandContinentalness,
                range(erosionParameters[3], erosionParameters[5]),
                midWeirdness1,
                lowlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                nearInlandContinentalness,
                range(erosionParameters[3], erosionParameters[5]),
                range(midWeirdness5, lowWeirdness6),
                lowlandBiomes[t][h]
        );
        // * Coast-Far, E3, Mid
        for (Pair<Float, Float> mid : midWeirdness) {
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(coastContinentalness, farInlandContinentalness),
                    erosionParameters[3],
                    mid,
                    lowlandBiomes[t][h]
            );
        }
        // * Coast-Near, E4-5, High (W 1-6)
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, nearInlandContinentalness),
                range(erosionParameters[3], erosionParameters[4]),
                highWeirdness2,
                lowlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, nearInlandContinentalness),
                range(erosionParameters[3], erosionParameters[4]),
                highWeirdness4,
                lowlandBiomes[t][h]
        );
        // * Coast-Far, E4, High-Peak
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                erosionParameters[4],
                range(highWeirdness2, highWeirdness4),
                lowlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                erosionParameters[4],
                range(highWeirdness10, highWeirdness12),
                lowlandBiomes[t][h]
        );
    }

    public static void addHighlandBiomes(int t, int h) {
        // * Mid-Far, E0-1, Valley
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(midInlandContinentalness, farInlandContinentalness),
                range(erosionParameters[0], erosionParameters[1]),
                valleyWeirdness7,
                highlandBiomes[t][h]
        );
        // * Coast-Far, E0-2, Low-Mid
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                range(erosionParameters[0], erosionParameters[2]),
                midWeirdness1,
                highlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                range(erosionParameters[0], erosionParameters[2]),
                range(midWeirdness5, lowWeirdness6),
                highlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                range(erosionParameters[0], erosionParameters[2]),
                range(lowWeirdness8, midWeirdness9),
                highlandBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                range(erosionParameters[0], erosionParameters[2]),
                midWeirdness13,
                highlandBiomes[t][h]
        );
        for (Pair<Float, Float> high : highWeirdness) {
            // * Coast-Near, E0-3, High
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(coastContinentalness, nearInlandContinentalness),
                    range(erosionParameters[0], erosionParameters[3]),
                    high,
                    highlandBiomes[t][h]
            );
            // * Coast-Far, E1-3, High
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(coastContinentalness, farInlandContinentalness),
                    range(erosionParameters[1], erosionParameters[3]),
                    high,
                    highlandBiomes[t][h]
            );
        }
        for (Pair<Float, Float> peak : peakWeirdness) {
            // * Coast, E2-3, Peak
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    coastContinentalness,
                    range(erosionParameters[0], erosionParameters[3]),
                    peak,
                    highlandBiomes[t][h]
            );
            // * Coast-Near, E1-3, Peak
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(coastContinentalness, nearInlandContinentalness),
                    range(erosionParameters[1], erosionParameters[3]),
                    peak,
                    highlandBiomes[t][h]
            );
            // * Coast-Far, E2-3, Peak
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(coastContinentalness, farInlandContinentalness),
                    range(erosionParameters[2], erosionParameters[3]),
                    peak,
                    highlandBiomes[t][h]
            );
        }
    }

    public static void addWindsweptBiomes(int t, int h) {
            // * Coast-Far, E5, Low-High (W 8-13)
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                erosionParameters[5],
                range(lowWeirdness8, highWeirdness10),
                windsweptBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                erosionParameters[5],
                range(highWeirdness12, midWeirdness13),
                windsweptBiomes[t][h]
        );
        // * Mid-Far, E5, Low-Peak
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(midInlandContinentalness, farInlandContinentalness),
                erosionParameters[5],
                range(midWeirdness1, lowWeirdness6),
                windsweptBiomes[t][h]
        );
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(midInlandContinentalness, farInlandContinentalness),
                erosionParameters[5],
                range(lowWeirdness8, midWeirdness13),
                windsweptBiomes[t][h]
            );
            for (Pair<Float, Float> peak : peakWeirdness) {
                // * Coast-Far, E5, Peak
                addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                        range(coastContinentalness, farInlandContinentalness),
                        erosionParameters[5],
                        peak,
                        windsweptBiomes[t][h]
                );
            }
    }

    public static void addPeakBiomes(int t, int h) {
        // * Mid-Far, E0, High-Peak
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(midInlandContinentalness, farInlandContinentalness),
                erosionParameters[0],
                range(highWeirdness2, highWeirdness4),
                peakBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(midInlandContinentalness, farInlandContinentalness),
                erosionParameters[0],
                range(highWeirdness10, highWeirdness12),
                peakBiomes[t][h]
        );
        for (Pair<Float, Float> peak : peakWeirdness) {
            // * Near-Far, E0, Peak
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(nearInlandContinentalness, farInlandContinentalness),
                    erosionParameters[0],
                    peak,
                    peakBiomes[t][h]
            );
            // * Mid-Far, E0-1, Peak
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    range(midInlandContinentalness, farInlandContinentalness),
                    range(erosionParameters[0], erosionParameters[1]),
                    peak,
                    peakBiomes[t][h]
            );
        }
    }

    public static void addSwampBiomes(int t, int h) {
        // * Coast-Far, E6, Valley-Peak
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                erosionParameters[6],
                defaultParameter,
                swampBiomes[t][h]
        );
    }

    public static void addBeachBiomes(int t, int h) {
        for (Pair<Float, Float> low : lowWeirdness) {
            // * Coast, E3-4, Low
            addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                    coastContinentalness,
                    range(erosionParameters[3], erosionParameters[4]),
                    low,
                    beachBiomes[t][h]
            );
        }
        // * Coast, E4, Low-Mid
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                coastContinentalness,
                erosionParameters[4],
                midWeirdness1,
                beachBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                coastContinentalness,
                erosionParameters[4],
                range(midWeirdness5, lowWeirdness6),
                beachBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                coastContinentalness,
                erosionParameters[4],
                range(lowWeirdness8, midWeirdness9),
                beachBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                coastContinentalness,
                erosionParameters[4],
                midWeirdness13,
                beachBiomes[t][h]
        );
        // * Coast, E5, Low-Mid (W 1-6)
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                coastContinentalness,
                erosionParameters[5],
                midWeirdness1,
                beachBiomes[t][h]
        );
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                coastContinentalness,
                erosionParameters[5],
                range(midWeirdness5, lowWeirdness6),
                beachBiomes[t][h]
        );
    }

    public static void addRiverBiomes(int t, int h) {
        // * Coast-Near, E0-5, Valley
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, nearInlandContinentalness),
                range(erosionParameters[0], erosionParameters[5]),
                valleyWeirdness7,
                riverBiomes[t][h]
        );
        // * Coast-Far, E2-5, Valley
        addSurfaceParameterSet(temperatureParameters[t], humidityParameters[h],
                range(coastContinentalness, farInlandContinentalness),
                range(erosionParameters[2], erosionParameters[5]),
                valleyWeirdness7,
                riverBiomes[t][h]
        );
    }

    public static void addCaveBiomes() {
        for (int t = 0; t < temperatureParameters.length; t++) {
            for (int h = 0; h < humidityParameters.length; h++) {
                addCaveParameterSet(temperatureParameters[t], humidityParameters[h],
                        range(coastContinentalness, farInlandContinentalness),
                        defaultParameter,
                        defaultParameter,
                        caveBiomes[t][h]
                );
                addDeepCaveParameterSet(temperatureParameters[t], humidityParameters[h],
                        range(coastContinentalness, farInlandContinentalness),
                        defaultParameter,
                        defaultParameter,
                        deepCaveBiomes[t][h]
                );
            }
        }
    }

    // ` --------------------------------------------------------------------------------------------------------------------------------------------

    public static void addSurfaceParameterSet(
            Pair<Float, Float> temperature,
            Pair<Float, Float> humidity,
            Pair<Float, Float> continentalness,
            Pair<Float, Float> erosion,
            Pair<Float, Float> weirdness,
            RegistryKey<Biome> biome
    ) {
        addParameterSet(
                temperature,
                humidity,
                continentalness,
                erosion,
                weirdness,
                Pair.of(-1.0F, 0.2F),
                biome
        );
    }

    public static void addCaveParameterSet(
            Pair<Float, Float> temperature,
            Pair<Float, Float> humidity,
            Pair<Float, Float> continentalness,
            Pair<Float, Float> erosion,
            Pair<Float, Float> weirdness,
            RegistryKey<Biome> biome
    ) {
        addParameterSet(
                temperature,
                humidity,
                continentalness,
                erosion,
                weirdness,
                Pair.of(0.2F, 1.0F),
                biome
        );
    }

    public static void addDeepCaveParameterSet(
            Pair<Float, Float> temperature,
            Pair<Float, Float> humidity,
            Pair<Float, Float> continentalness,
            Pair<Float, Float> erosion,
            Pair<Float, Float> weirdness,
            RegistryKey<Biome> biome
    ) {
        addParameterSet(
                temperature,
                humidity,
                continentalness,
                erosion,
                weirdness,
                Pair.of(1.0F, 2.0F),
                biome
        );
    }

    public static void addParameterSet(
            Pair<Float, Float> temperature,
            Pair<Float, Float> humidity,
            Pair<Float, Float> continentalness,
            Pair<Float, Float> erosion,
            Pair<Float, Float> weirdness,
            Pair<Float, Float> depth,
            RegistryKey<Biome> biome
    ) {
        JSONObject parameterPoint = new JSONObject();
        JSONObject parameters = new JSONObject();

        JSONArray temperatureArray = new JSONArray();
        JSONArray humidityArray = new JSONArray();
        JSONArray continentalnessArray = new JSONArray();
        JSONArray erosionArray = new JSONArray();
        JSONArray weirdnessArray = new JSONArray();
        JSONArray depthArray = new JSONArray();

        temperatureArray.add(0, temperature.getFirst());
        temperatureArray.add(1, temperature.getSecond());
        humidityArray.add(0, humidity.getFirst());
        humidityArray.add(1, humidity.getSecond());
        continentalnessArray.add(0, continentalness.getFirst());
        continentalnessArray.add(1, continentalness.getSecond());
        erosionArray.add(0, erosion.getFirst());
        erosionArray.add(1, erosion.getSecond());
        weirdnessArray.add(0, weirdness.getFirst());
        weirdnessArray.add(1, weirdness.getSecond());
        depthArray.add(0, depth.getFirst());
        depthArray.add(1, depth.getSecond());

        parameters.put("temperature", temperatureArray);
        parameters.put("humidity", humidityArray);
        parameters.put("continentalness", continentalnessArray);
        parameters.put("erosion", erosionArray);
        parameters.put("weirdness", weirdnessArray);
        parameters.put("depth", depthArray);
        parameters.put("offset", 0.0F);

        parameterPoint.put("parameters", parameters);
        parameterPoint.put("biome", id(biome));

        Pair[] pairs = {temperature, humidity, continentalness, erosion, weirdness, depth};

        if (Arrays.stream(pairs).allMatch(pair -> (float)pair.getFirst() < (float)pair.getSecond())) parameterSets.add(parameterPoint);
    }
    
    public static Pair<Float, Float> range(Pair<Float, Float> min, Pair<Float, Float> max) {
        return Pair.of(min.getFirst(), max.getSecond());
    }

    public static void generate(RegistryKey<ChunkGeneratorSettings> noiseSettings, RegistryKey<DimensionType> dimensionType) {

        String path = "src/main/resources/data/vanilla/dimension";

        File dstDir = new File(path);
        if (!dstDir.exists()) dstDir.mkdirs();

        try (FileWriter file = new FileWriter("src/main/generated/data/vanilla/dimension/overworld.json")) {

            JSONObject main = new JSONObject();
            JSONObject generator = new JSONObject();
            JSONObject biomeSource = new JSONObject();

            JSONArray biomes = new JSONArray();

            biomes.addAll(parameterSets);

            biomeSource.put("type", "minecraft:multi_noise");
            biomeSource.put("biomes", biomes);

            generator.put("type", "minecraft:noise");
            generator.put("settings", id(noiseSettings));
            generator.put("biome_source", biomeSource);

            main.put("type", id(dimensionType));
            main.put("generator", generator);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            file.write(gson.toJson(main));
        } catch (IOException e) {
            System.err.println("Error generating file: " + e.getMessage());
        }
    }

    public static String id(RegistryKey<?> key) {
        return key.getValue().toString();
    }
}
