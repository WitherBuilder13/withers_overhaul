package me.withers_overhaul.world.biome;

import me.withers_overhaul.world.feature.OverhaulBiomeFeatures;
import me.withers_overhaul.world.feature.placed.OverhaulOrePlacedFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.*;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.world.biome.OverworldBiomeCreator.getSkyColor;

public class OverhaulBiomes {
    public static void bootstrap(Registerable<Biome> biomeRegisterable) {
        RegistryEntryLookup<PlacedFeature> placedFeatureLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntryLookup<ConfiguredCarver<?>> configuredCarverLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);
        // Vanilla
        biomeRegisterable.register(VanillaBiomeKeys.BADLANDS, badlands(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.BAMBOO_JUNGLE, jungle(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.BEACH, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT));
        biomeRegisterable.register(VanillaBiomeKeys.BIRCH_FOREST, birchForest(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.CHERRY_GROVE, cherryGrove(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.COLD_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.DARK_FOREST, darkForest(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.DEEP_COLD_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD, true, false));
        biomeRegisterable.register(VanillaBiomeKeys.DEEP_DARK, deepDark(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.DEEP_FROZEN_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY, true, false));
        biomeRegisterable.register(VanillaBiomeKeys.DEEP_LUKEWARM_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM, true, false));
        biomeRegisterable.register(VanillaBiomeKeys.DEEP_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT, true, false));
        biomeRegisterable.register(VanillaBiomeKeys.DESERT, desert(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.DRIPSTONE_CAVES, dripstoneCaves(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.ERODED_BADLANDS, erodedBadlands(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.FLOWER_FOREST, forest(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.FOREST, forest(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.FROZEN_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.FROZEN_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY, false));
        biomeRegisterable.register(VanillaBiomeKeys.FROZEN_RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY));
        biomeRegisterable.register(VanillaBiomeKeys.GROVE, grove(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.ICE_SPIKES, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY, false, true, false));
        biomeRegisterable.register(VanillaBiomeKeys.JAGGED_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL, false));
        biomeRegisterable.register(VanillaBiomeKeys.JUNGLE, jungle(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.LUKEWARM_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.LUSH_CAVES, lushCaves(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.MANGROVE_SWAMP, mangroveSwamp(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.MEADOW, meadow(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.MUSHROOM_FIELDS, mushroomFields(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.OLD_GROWTH_BIRCH_FOREST, birchForest(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.OLD_GROWTH_PINE_TAIGA, pineTaiga(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, oldGrowthTaiga(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.PALE_GARDEN, paleGarden(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.PLAINS, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT, false, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT));
        biomeRegisterable.register(VanillaBiomeKeys.SAVANNA, savanna(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.SAVANNA_PLATEAU, savanna(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.SNOWY_BEACH, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY));
        biomeRegisterable.register(VanillaBiomeKeys.SNOWY_PLAINS, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY, false, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.SNOWY_SLOPES, snowySlopes(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.SNOWY_TAIGA, taiga(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.SPARSE_JUNGLE, sparseJungle(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.STONY_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT, false));
        biomeRegisterable.register(VanillaBiomeKeys.STONY_SHORE, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL));
        biomeRegisterable.register(VanillaBiomeKeys.SUNFLOWER_PLAINS, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT, true, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.SWAMP, swamp(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.TAIGA, taiga(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.WARM_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT, false, false));
        biomeRegisterable.register(VanillaBiomeKeys.WINDSWEPT_FOREST, windsweptHills(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(VanillaBiomeKeys.WINDSWEPT_GRAVELLY_HILLS, windsweptGravellyHills(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.WINDSWEPT_HILLS, windsweptHills(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(VanillaBiomeKeys.WINDSWEPT_SAVANNA, windsweptSavanna(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(VanillaBiomeKeys.WOODED_BADLANDS, badlands(placedFeatureLookup, configuredCarverLookup, true));
        // Overhaul
        biomeRegisterable.register(OverhaulBiomeKeys.ALPINE_FOREST, alpineForest(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.ALPINE_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD, false));
        biomeRegisterable.register(OverhaulBiomeKeys.ALPINE_TANGLE, alpineTangle(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.ALPINE_THICKET, alpineThicket(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.ASHEN_FIELDS, ashenFields(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.ASPEN_GROVE, aspenGrove(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.BAYOU, bayou(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.BOG, bog(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.BURIED_DUNES, buriedDunes(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.CHARCOAL_SHORE, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD));
        biomeRegisterable.register(OverhaulBiomeKeys.CLOUD_FOREST, cloudForest(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.COLD_RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD));
        biomeRegisterable.register(OverhaulBiomeKeys.COOL_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL, false, false));
        biomeRegisterable.register(OverhaulBiomeKeys.COOL_RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL));
        biomeRegisterable.register(OverhaulBiomeKeys.CRYSTAL_CAVES, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.DEFAULT, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.CRYSTAL_CAVES_COLD, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.CRYSTAL_CAVES_COOL, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.CRYSTAL_CAVES_FROZEN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.SNOWY, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.CRYSTAL_CAVES_LUKEWARM, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.CRYSTAL_CAVES_WARM, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.DEEP_COOL_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL, true, false));
        biomeRegisterable.register(OverhaulBiomeKeys.DEEP_WARM_OCEAN, ocean(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT, true, false));
        biomeRegisterable.register(OverhaulBiomeKeys.DESERT_FIELDS, desert(placedFeatureLookup, configuredCarverLookup, true));
        //biomeRegisterable.register(OverhaulBiomeKeys.EBONY_THICKET, ebonyThicket(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.ECHOING_HOLLOW, echoingHollow(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.ENCHANTED_FOREST, enchantedForest(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FORGOTTEN_ISLES, forgottenIsles(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FOSSILIZED_DEPTHS, fossilizedDepths(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FROSTBURN_CAVES, frostburnCaves(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FROSTED_TANGLE, frostedTangle(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FROSTED_WOODLANDS, frostedWoodlands(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FROZEN_WETLANDS, frozenWetlands(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.FUNGAL_CHASM, fungalChasm(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.GLACIAL_SWEEP, glacialSweep(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.GLOWING_GROTTO, glowingGrotto(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.GOLDEN_SWEEP, goldenSweep(placedFeatureLookup, configuredCarverLookup));
        //biomeRegisterable.register(OverhaulBiomeKeys.GRASSLANDS, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT, false, false, false));
        biomeRegisterable.register(OverhaulBiomeKeys.LAGOON, lagoon(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.LAVENDER_FIELDS, lavenderFields(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.LUKEWARM_RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM));
        biomeRegisterable.register(OverhaulBiomeKeys.LUSH_RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT));
        biomeRegisterable.register(OverhaulBiomeKeys.MARSH, marsh(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.MOLTEN_UNDERGROWTH, moltenUndergrowth(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.MONSOON_RAINFOREST, tropicalRainforest(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(OverhaulBiomeKeys.MONTANE_CLEARING, montane(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(OverhaulBiomeKeys.MONTANE_WOODLANDS, montane(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(OverhaulBiomeKeys.MUTED_TUNNELS, mutedTunnels(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.OASIS, oasis(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.OLD_GROWTH_SNOWY_TAIGA, oldGrowthTaiga(placedFeatureLookup, configuredCarverLookup, true));
        biomeRegisterable.register(OverhaulBiomeKeys.PAINTED_BEACH, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM));
        biomeRegisterable.register(OverhaulBiomeKeys.PAINTED_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM, false));
        biomeRegisterable.register(OverhaulBiomeKeys.PALE_UNDERGROWTH, paleUndergrowth(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.PASTEL_CAVERNS, pastelCaverns(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.PHANTOM_HOLLOW, phantomHollow(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.PINE_TAIGA, pineTaiga(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(OverhaulBiomeKeys.PRAIRIE, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL, false, false, false));
        biomeRegisterable.register(OverhaulBiomeKeys.RAINBOW_FIELDS, rainbowFields(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.REDWOOD_FOREST, redwoodForest(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.SALT_MARSH, saltMarsh(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.SALT_RIVER, river(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM));
        biomeRegisterable.register(OverhaulBiomeKeys.SANDY_RIVER, sandyRiver(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.SHIMMERING_WASTELANDS, shimmeringWastelands(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.SHRUBLANDS, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM, false, false, false));
        biomeRegisterable.register(OverhaulBiomeKeys.SPECTRAL_ABYSS, spectralAbyss(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.STEPPE, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COOL, false, false, true));
        biomeRegisterable.register(OverhaulBiomeKeys.SUBZERO_ABYSS, subzeroAbyss(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.SUNBAKED_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM, true));
        biomeRegisterable.register(OverhaulBiomeKeys.SUNBAKED_SHORE, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.WARM));
        biomeRegisterable.register(OverhaulBiomeKeys.TANGLED_TROPICS, tangledTropics(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.TOXIC_WASTES, toxicWastes(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.TROPICAL_BEACH, beach(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT));
        biomeRegisterable.register(OverhaulBiomeKeys.TROPICAL_RAINFOREST, tropicalRainforest(placedFeatureLookup, configuredCarverLookup, false));
        biomeRegisterable.register(OverhaulBiomeKeys.TUNDRA, plains(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.COLD, false, false, false));
        biomeRegisterable.register(OverhaulBiomeKeys.VOLCANIC_PEAKS, peaks(placedFeatureLookup, configuredCarverLookup, OverhaulTemperature.HOT, false));
        biomeRegisterable.register(OverhaulBiomeKeys.WHIMSY, whimsy(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.WINDSWEPT_TUNDRA, windsweptTundra(placedFeatureLookup, configuredCarverLookup));
        biomeRegisterable.register(OverhaulBiomeKeys.WINTER_WONDERLAND, winterWonderland(placedFeatureLookup, configuredCarverLookup));
    }

    // Biome creation methods (copied from OverworldBiomeCreator)

    private static Biome createBiome(
            boolean precipitation,
            float temperature,
            float downfall,
            SpawnSettings.Builder spawnSettings,
            GenerationSettings.LookupBackedBuilder generationSettings,
            @Nullable MusicSound music
    ) {
        return createBiome(precipitation, temperature, downfall, 4159204, 329011, null, null, null, spawnSettings, generationSettings, music);
    }

    private static Biome createBiome(
            boolean precipitation,
            float temperature,
            float downfall,
            int waterColor,
            int waterFogColor,
            @Nullable Integer grassColor,
            @Nullable Integer foliageColor,
            @Nullable Integer dryFoliageColor,
            SpawnSettings.Builder spawnSettings,
            GenerationSettings.LookupBackedBuilder generationSettings,
            @Nullable MusicSound music
    ) {
        return createBiome(precipitation, temperature, downfall, waterColor, waterFogColor, 12638463, getSkyColor(temperature), grassColor, foliageColor, dryFoliageColor, spawnSettings, generationSettings, music);
    }

    private static Biome createBiome(
            boolean precipitation,
            float temperature,
            float downfall,
            int waterColor,
            int waterFogColor,
            int fogColor,
            int skyColor,
            @Nullable Integer grassColor,
            @Nullable Integer foliageColor,
            @Nullable Integer dryFoliageColor,
            SpawnSettings.Builder spawnSettings,
            GenerationSettings.LookupBackedBuilder generationSettings,
            MusicSound music
    ) {
        BiomeEffects.Builder builder = new BiomeEffects.Builder()
                .waterColor(waterColor)
                .waterFogColor(waterFogColor)
                .fogColor(fogColor)
                .skyColor(skyColor)
                .moodSound(BiomeMoodSound.CAVE)
                .music(music);
        if (grassColor != null) {
            builder.grassColor(grassColor);
        }

        if (foliageColor != null) {
            builder.foliageColor(foliageColor);
        }

        if (dryFoliageColor != null) {
            builder.dryFoliageColor(dryFoliageColor);
        }
        return new Biome.Builder()
                .precipitation(precipitation)
                .temperature(temperature)
                .downfall(downfall)
                .effects(builder.build())
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }

    // Actual biomes

    public static Biome alpineForest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.alpineForestVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);

        return createBiome(true, 0.3F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome alpineTangle(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.alpineTangleVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);

        return createBiome(true, 0.2F, 0.8F, builder, lookupBackedBuilder, null);
    }

    public static Biome alpineThicket(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.alpineThicketVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);

        return createBiome(true, 0.3F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome ashenFields(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(true, 0.2F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome aspenGrove(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.aspenGroveVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addBirchForestWildflowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 0.4F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome badlands(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean wooded
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 6, new SpawnSettings.SpawnEntry(EntityType.ARMADILLO, 1, 2));
        builder.creatureSpawnProbability(0.03F);
        if (wooded) {
            builder.spawn(SpawnGroup.CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 8));
            builder.creatureSpawnProbability(0.04F);
        }

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addBadlandsGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addBadlandsVegetation(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_BADLANDS);

        return createBiome(true, 2.0F, wooded ? 0.2F : 0.0F , builder, lookupBackedBuilder, musicSound);
    }

    public static Biome bayou(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 4));
        builder.spawn(SpawnGroup.MONSTER, 30, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 2, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampVegetation(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_SWAMP);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(true, 1.0F, 1.0F, 6388580, 2302743, null, 6975545, 8082228, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome beach(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, OverhaulTemperature temperature
    ) {
        float temp;

        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);


        switch (temperature) {
            case SNOWY -> temp = -1.0F;
            case COLD -> temp = 0.2F;
            case COOL -> temp = 0.4F;
            case WARM -> temp = 1.0F;
            case HOT -> {
                temp = 2.0F;
                builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.TURTLE, 2, 5));
            }
            default -> {
                temp = 0.8F;
                builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.TURTLE, 2, 5));
            }
        }

        return createBiome(true, temp, 0.4F, builder, lookupBackedBuilder, null);
    }

    public static Biome birchForest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean oldGrowth
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        if (oldGrowth) {
            OverhaulBiomeFeatures.oldGrowthBirchForestVegetation(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.birchForestVegetation(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addForestFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addBirchForestWildflowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 0.6F, 0.6F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome bog(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 4));
        builder.spawn(SpawnGroup.MONSTER, 30, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 2, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampVegetation(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_SWAMP);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(
                true,
                0.2F,
                1.0F,
                6388580,
                2302743,
                null,
                6975545,
                8082228,
                builder,
                lookupBackedBuilder,
                musicSound
        );
    }

    public static Biome buriedDunes(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DESERT);

        return createBiome(false, 2.0F, 0.0F, 12235916, 14737100, null, null, null,builder, lookupBackedBuilder, musicSound);
    }

    public static Biome cherryGrove(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.PIG, 1, 2))
                .spawn(SpawnGroup.CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 6))
                .spawn(SpawnGroup.CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addCherryGroveFeatures(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_CHERRY_GROVE);

        return createBiome(true, 0.8F, 0.8F, 6141935, 6141935, 11983713, 11983713, null, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome cloudForest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        DefaultBiomeFeatures.addFarmAnimals(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.cloudForestVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(false, 0.8F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome darkForest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.darkForestVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addLeafLitter(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 0.7F, 0.8F,
                4159204, 329011, 348672, 487424, 8082228,
                builder, lookupBackedBuilder, musicSound);
    }

    public static Biome deepDark(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addSculk(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DEEP_DARK);

        return createBiome(true, 0.8F, 0.4F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome desert(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean fields
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addDesertMobs(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDesertDryVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDesertVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDesertFeatures(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DESERT);

        return createBiome(false, 2.0F, fields ? 0.2F : 0.0F, 12235916, 14737100, null, null, null, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome dripstoneCaves(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addDripstoneCaveMobs(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        OverhaulBiomeFeatures.addCarvers(lookupBackedBuilder);
        OverhaulBiomeFeatures.addOres(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addFrozenTopLayer(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDripstone(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DRIPSTONE_CAVES);

        return createBiome(true, 0.4F, 0.4F, builder, lookupBackedBuilder, musicSound);
    }

    /*public static Biome ebonyThicket(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.ebonyThicketVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 1.0F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }*/

    public static Biome echoingHollow(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, 0.8F, 0.4F, builder, lookupBackedBuilder, null);
    }

    public static Biome enchantedForest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 1.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome erodedBadlands(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 6, new SpawnSettings.SpawnEntry(EntityType.ARMADILLO, 1, 2));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addBadlandsGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addBadlandsVegetation(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_BADLANDS);

        return createBiome(true, 1.0F, 0.1F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome forest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean flower
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        if (flower) {
            builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        } else {
            builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        }

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        if (flower) {
            OverhaulBiomeFeatures.flowerForestVegetation(lookupBackedBuilder);
            lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_FLOWER_FOREST);
            DefaultBiomeFeatures.addDefaultGrass(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.forestVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
            DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
            DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 0.8F, flower ? 1.0F : 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome forgottenIsles(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        
        return createBiome(true, 0.4F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome fossilizedDepths(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DEEP_DARK);

        return createBiome(false, 2.0F, 0.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome frostburnCaves(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 80, new SpawnSettings.SpawnEntry(EntityType.STRAY, 4, 4));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, -1.0F, 0.4F, builder, lookupBackedBuilder, null);
    }

    public static Biome frostedTangle(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4))
                .spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3))
                .spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 80, new SpawnSettings.SpawnEntry(EntityType.STRAY, 4, 4));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.frostedTangleVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushesSnowy(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);

        return createBiome(true, -1.0F, 0.8F, builder, lookupBackedBuilder, null);
    }

    public static Biome frostedWoodlands(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4))
                .spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3))
                .spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.frostedWoodlandsVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addMossyRocks(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addGiantTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushesSnowy(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);

        return createBiome(true, -1.0F, 0.8F, 4020182, 329011, null, null, null, builder, lookupBackedBuilder, musicSound);
    }
    
    public static Biome frozenWetlands(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 1));
        builder.spawn(SpawnGroup.MONSTER, 15, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 4, 4));
        builder.spawn(SpawnGroup.MONSTER, 15, new SpawnSettings.SpawnEntry(EntityType.STRAY, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampVegetation(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(true, -1.0F, 0.4F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome fungalChasm(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);

        return createBiome(true, 0.2F, 0.8F, builder, lookupBackedBuilder, null);
    }

    public static Biome glacialSweep(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 80, new SpawnSettings.SpawnEntry(EntityType.STRAY, 4, 4));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, -1.0F, 0.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome glowingGrotto(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);

        return createBiome(true, 0.8F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome goldenSweep(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.goldenSweepVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addBirchForestWildflowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 0.6F, 0.6F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome grove(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.WOLF, 1, 1))
                .spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3))
                .spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.groveVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, false);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_GROVE);

        return createBiome(true, -1.0F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome jungle(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean bamboo
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 40, new SpawnSettings.SpawnEntry(EntityType.PARROT, 1, 2))
                .spawn(SpawnGroup.MONSTER, 2, new SpawnSettings.SpawnEntry(EntityType.OCELOT, 1, 3))
                .spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.PANDA, 1, 2));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        if (bamboo) {
            DefaultBiomeFeatures.addBambooJungleTrees(lookupBackedBuilder);
        } else {
            DefaultBiomeFeatures.addJungleTrees(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addExtraDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addJungleGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addVines(lookupBackedBuilder);
        DefaultBiomeFeatures.addMelons(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(bamboo ? SoundEvents.MUSIC_OVERWORLD_BAMBOO_JUNGLE : SoundEvents.MUSIC_OVERWORLD_JUNGLE);

        return createBiome(true, 2.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome lagoon(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(true, 2.0F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome lavenderFields(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.lavenderFieldsVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 1.0F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome lushCaves(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.AXOLOTLS, 10, new SpawnSettings.SpawnEntry(EntityType.AXOLOTL, 4, 6));
        builder.spawn(SpawnGroup.WATER_AMBIENT, 25, new SpawnSettings.SpawnEntry(EntityType.TROPICAL_FISH, 8, 8));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addClayOre(lookupBackedBuilder);
        DefaultBiomeFeatures.addLushCavesDecoration(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_LUSH_CAVES);

        return createBiome(true, 2.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome mangroveSwamp(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder, 70);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 1));
        builder.spawn(SpawnGroup.MONSTER, 30, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));
        builder.spawn(SpawnGroup.WATER_AMBIENT, 25, new SpawnSettings.SpawnEntry(EntityType.TROPICAL_FISH, 8, 8));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addMangroveSwampFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addMangroveSwampAquaticFeatures(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(true, 1.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome marsh(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder, 70);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 1));
        builder.spawn(SpawnGroup.MONSTER, 30, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampVegetation(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_SWAMP);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(true, 0.8F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome meadow(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.DONKEY, 1, 2))
                .spawn(SpawnGroup.CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 6))
                .spawn(SpawnGroup.CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.meadowVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.WILDFLOWERS_MEADOW);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_MEADOW);

        return createBiome(true, 0.5F, 0.8F, 937679, 329011, null, null, null, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome moltenUndergrowth(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DEEP_DARK);

        return createBiome(true, 2.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome montane(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean clearing
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4))
                .spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3))
                .spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        if (clearing) {
            OverhaulBiomeFeatures.montaneClearingVegetation(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.montaneWoodlandsVegetation(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);

        return createBiome(true, 0.4F, 0.8F, 4159204, 329011, null, null, null, builder, lookupBackedBuilder, null);
    }

    public static Biome mushroomFields(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMushroomMobs(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addMushroomFieldsFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(true, 0.9F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome mutedTunnels(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, 1.0F, 0.8F, builder, lookupBackedBuilder, null);
    }

    public static Biome oasis(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addDesertMobs(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDesertDryVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDesertVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDesertFeatures(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DESERT);

        return createBiome(false, 2.0F, 0.3F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome ocean(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, OverhaulTemperature temperature, boolean deep, boolean cave
    ) {
        float temp;
        int waterColor, waterFogColor;

        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        if (cave) {
            builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.GLOW_SQUID, 1, 4));
        }

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        switch (temperature) {
            case SNOWY -> {
                temp = -1.0F;
                waterColor = 3750089;
                waterFogColor = 329011;

                builder.spawn(SpawnGroup.WATER_CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.SQUID, 1, 4))
                        .spawn(SpawnGroup.WATER_AMBIENT, 15, new SpawnSettings.SpawnEntry(EntityType.SALMON, 1, 5));
                DefaultBiomeFeatures.addBatsAndMonsters(builder);
                builder.spawn(SpawnGroup.MONSTER, 5, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));
                if (!cave) {
			        builder.spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.POLAR_BEAR, 1, 2));

                    DefaultBiomeFeatures.addIcebergs(lookupBackedBuilder);
                    DefaultBiomeFeatures.addBlueIce(lookupBackedBuilder);
                }
            }
            case COLD -> {
                temp = 0.2F;
                waterColor = 4020182;
                waterFogColor = 329011;

                DefaultBiomeFeatures.addOceanMobs(builder, 3, 4, 15);
                builder.spawn(SpawnGroup.WATER_AMBIENT, 15, new SpawnSettings.SpawnEntry(EntityType.SALMON, 1, 5));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, deep ? OceanPlacedFeatures.SEAGRASS_DEEP_COLD : OceanPlacedFeatures.SEAGRASS_COLD);
                DefaultBiomeFeatures.addKelp(lookupBackedBuilder);
            }
            case COOL -> {
                temp = 0.4F;
                waterColor = 4020182;
                waterFogColor = 329011;

                DefaultBiomeFeatures.addOceanMobs(builder, 3, 4, 15);
                builder.spawn(SpawnGroup.WATER_AMBIENT, 15, new SpawnSettings.SpawnEntry(EntityType.SALMON, 1, 5));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, deep ? OceanPlacedFeatures.SEAGRASS_DEEP_COLD : OceanPlacedFeatures.SEAGRASS_COLD);
                DefaultBiomeFeatures.addKelp(lookupBackedBuilder);
            }
            case WARM -> {
                temp = 1.0F;
                waterColor = 4566514;
                waterFogColor = 267827;

                if (deep) {
                    DefaultBiomeFeatures.addOceanMobs(builder, 8, 4, 8);
                } else {
                    DefaultBiomeFeatures.addOceanMobs(builder, 10, 2, 15);
                }
                builder.spawn(SpawnGroup.WATER_AMBIENT, 5, new SpawnSettings.SpawnEntry(EntityType.PUFFERFISH, 1, 3))
                        .spawn(SpawnGroup.WATER_AMBIENT, 25, new SpawnSettings.SpawnEntry(EntityType.TROPICAL_FISH, 8, 8));
                if (!cave) {
                    builder.spawn(SpawnGroup.WATER_CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.DOLPHIN, 1, 2));
                }

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, deep ? OceanPlacedFeatures.SEAGRASS_DEEP_WARM : OceanPlacedFeatures.SEAGRASS_WARM);
                DefaultBiomeFeatures.addLessKelp(lookupBackedBuilder);
            }
            case HOT -> {
                temp = 2.0F;
                waterColor = 4445678;
                waterFogColor = 270131;

                builder.spawn(SpawnGroup.WATER_CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.SQUID, 4, 4));
                builder.spawn(SpawnGroup.WATER_AMBIENT, 25, new SpawnSettings.SpawnEntry(EntityType.TROPICAL_FISH, 8, 8));
                builder.spawn(SpawnGroup.WATER_AMBIENT, 15, new SpawnSettings.SpawnEntry(EntityType.PUFFERFISH, 1, 3));
                if (!cave) {
                    builder.spawn(SpawnGroup.WATER_CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.DOLPHIN, 1, 2));
                    lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.WARM_OCEAN_VEGETATION);
                }
                builder.spawn(SpawnGroup.MONSTER, 5, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, deep ? OceanPlacedFeatures.SEAGRASS_DEEP_WARM : OceanPlacedFeatures.SEAGRASS_WARM)
                        .feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEA_PICKLE);
            }
            default -> {
                temp = 0.8F;
                waterColor = 4159204;
                waterFogColor = 329011;

                DefaultBiomeFeatures.addOceanMobs(builder, 1, 4, 10);
                if (!cave) {
                    builder.spawn(SpawnGroup.WATER_CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.DOLPHIN, 1, 2));
                }

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, deep ? OceanPlacedFeatures.SEAGRASS_DEEP : OceanPlacedFeatures.SEAGRASS_NORMAL);
                DefaultBiomeFeatures.addKelp(lookupBackedBuilder);
            }
        }

        return createBiome(true, temp, 0.4F, waterColor, waterFogColor, null, null, null, builder, lookupBackedBuilder, null);
    }

    public static Biome oldGrowthTaiga(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean snowy
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4))
                .spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3))
                .spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addMossyRocks(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addGiantTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        if (snowy) {
            OverhaulBiomeFeatures.oldGrowthSnowyTaigaVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addSweetBerryBushesSnowy(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.oldGrowthSpruceTaigaVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);
        }

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);

        return createBiome(true, snowy ? -1.0F : 0.2F, 0.8F, snowy ? 4020182 : 4159204, 329011, null, null, null, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome paleGarden(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PALE_GARDEN_VEGETATION);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PALE_MOSS_PATCH);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PALE_GARDEN_FLOWERS);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.FLOWER_PALE_GARDEN);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 0.4F, 1.0F,
                7768221, 5597568, 8484720, 12171705, 7832178, 8883574, 10528412,
                builder, lookupBackedBuilder, musicSound);
    }

    public static Biome paleUndergrowth(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);

        return createBiome(true, 0.2F, 0.8F, builder, lookupBackedBuilder, null);
    }

    public static Biome pastelCaverns(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, 1.0F, 0.8F, builder, lookupBackedBuilder, null);
    }

    public static Biome peaks(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, OverhaulTemperature temperature, boolean sunbaked
    ) {
        float temp, df;

        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);

        MusicSound musicSound;

        switch (temperature) {
            case SNOWY -> {
                temp = -1.0F;
                df = 0.8F;
                builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.GOAT, 1, 3));
                musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FROZEN_PEAKS);
            }
            case COLD -> {
                temp = 0.2F;
                df = 0.8F;
                builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.GOAT, 1, 3));
                musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_JAGGED_PEAKS);
            }
            case COOL -> {
                temp = 0.4F;
                df = 0.8F;
                builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.GOAT, 1, 3));
                musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_JAGGED_PEAKS);
            }
            case WARM -> {
                temp = 1.0F;
                df = sunbaked ? 0.0F : 0.8F;
                builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.GOAT, 1, 3));
                musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_STONY_PEAKS);
            }
            case HOT -> {
                temp = 2.0F;
                df = 1.0F;
                musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_JUNGLE);
            }
            default -> {
                temp = 0.8F;
                df = 0.7F;
                builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.GOAT, 1, 3));
                musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_STONY_PEAKS);
            }
        }

        return createBiome(true, temp, df, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome phantomHollow(
        RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, 1.0F, 0.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome pineTaiga(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean oldGrowth
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        if (oldGrowth) {
            OverhaulBiomeFeatures.oldGrowthPineTaigaVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addGiantTaigaGrass(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.pineTaigaVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);

        return createBiome(true, 0.4F, oldGrowth ? 0.6F : 0.4F, builder, lookupBackedBuilder, musicSound);
    }


    public static Biome plains(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, OverhaulTemperature temperature, boolean sunflower, boolean iceSpikes, boolean steppe
    ) {
        float temp, df;
        int waterColor, waterFogColor;
        @Nullable Integer grassColor, foliageColor, dryFoliageColor;
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        switch (temperature) {
            case SNOWY -> {
                temp = -1.0F;
                df = 0.2F;
                waterColor = 3750089;
                waterFogColor = 329011;
                grassColor = null;
                foliageColor = null;
                dryFoliageColor = null;

                DefaultBiomeFeatures.addSnowyMobs(builder);

                if (iceSpikes) {
                    OverhaulBiomeFeatures.iceSpikesVegetation(lookupBackedBuilder);
                    lookupBackedBuilder.feature(GenerationStep.Feature.SURFACE_STRUCTURES, MiscPlacedFeatures.ICE_SPIKE);
                    lookupBackedBuilder.feature(GenerationStep.Feature.SURFACE_STRUCTURES, MiscPlacedFeatures.ICE_PATCH);
                } else {
                    OverhaulBiomeFeatures.snowyPlainsVegetation(lookupBackedBuilder);
                }
            }
            case COLD -> {
                temp = 0.2F;
                df = 0.0F;
                waterColor = 3750089;
                waterFogColor = 329011;
                grassColor = 12086123;
                foliageColor = 9987967;
                dryFoliageColor = 9987967;
            }
            case COOL -> {
                temp = 0.4F;
                df = 0.2F;
                waterColor = 3750089;
                waterFogColor = 329011;
                grassColor = null;
                foliageColor = null;
                dryFoliageColor = null;

                DefaultBiomeFeatures.addPlainsMobs(builder);
            }
            case WARM -> {
                temp = 1.0F;
                df = 0.7F;
                waterColor = 3750089;
                waterFogColor = 329011;
                grassColor = null;
                foliageColor = null;
                dryFoliageColor = null;

                DefaultBiomeFeatures.addFarmAnimals(builder);
            }
            case HOT -> {
                temp = 2.0F;
                df = 0.6F;
                waterColor = 3750089;
                waterFogColor = 329011;
                grassColor = null;
                foliageColor = null;
                dryFoliageColor = null;

                DefaultBiomeFeatures.addFarmAnimals(builder);
            }
            default -> {
                temp = 0.8F;
                df = 0.4F;
                waterColor = 3750089;
                waterFogColor = 329011;
                grassColor = null;
                foliageColor = null;
                dryFoliageColor = null;

                DefaultBiomeFeatures.addPlainsMobs(builder);

                DefaultBiomeFeatures.addPlainsFeatures(lookupBackedBuilder);
                if (sunflower) {
                    OverhaulBiomeFeatures.sunflowerPlainsVegetation(lookupBackedBuilder);
                    lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.PATCH_SUNFLOWER);
                    lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.WILDFLOWERS_MEADOW);
                } else {
                    OverhaulBiomeFeatures.plainsVegetation(lookupBackedBuilder);
                }
            }
        }

        return createBiome(true, temp, df, waterColor, waterFogColor, grassColor, foliageColor, dryFoliageColor, builder, lookupBackedBuilder, null);
    }

    public static Biome rainbowFields(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(true, 1.0F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome redwoodForest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.redwoodForestVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addGiantTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);

        return createBiome(true, 0.2F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome river(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, OverhaulTemperature temperature
    ) {
        float temp;
        int waterColor, waterFogColor;

        SpawnSettings.Builder builder = (new SpawnSettings.Builder()).spawn(SpawnGroup.WATER_CREATURE, 2, new SpawnSettings.SpawnEntry(EntityType.SQUID, 1, 4)).spawn(SpawnGroup.WATER_AMBIENT, 5, new SpawnSettings.SpawnEntry(EntityType.SALMON, 1, 5));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        switch (temperature) {
            case SNOWY -> {
                temp = -1.0F;
                waterColor = 3750089;
                waterFogColor = 329011;

                builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));
            }
            case COLD -> {
                temp = 0.2F;
                waterColor = 4020182;
                waterFogColor = 329011;

                builder.spawn(SpawnGroup.MONSTER, 100, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_RIVER);
            }
            case COOL -> {
                temp = 0.4F;
                waterColor = 4020182;
                waterFogColor = 329011;

                builder.spawn(SpawnGroup.MONSTER, 100, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_RIVER);
            }
            case WARM -> {
                temp = 1.0F;
                waterColor = 4566514;
                waterFogColor = 267827;

                builder.spawn(SpawnGroup.MONSTER, 100, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_RIVER);
            }
            case HOT -> {
                temp = 2.0F;
                waterColor = 4445678;
                waterFogColor = 270131;

                builder.spawn(SpawnGroup.MONSTER, 100, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_RIVER);
            }
            default -> {
                temp = 0.8F;
                waterColor = 4159204;
                waterFogColor = 329011;

                builder.spawn(SpawnGroup.MONSTER, 100, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

                lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_RIVER);
            }
        }

        return createBiome(true, temp, 0.5F, waterColor, waterFogColor, null, null, null, builder, lookupBackedBuilder, null);
    }

    public static Biome saltMarsh(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder, 70);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 1));
        builder.spawn(SpawnGroup.MONSTER, 30, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampVegetation(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_SWAMP);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(true, 1.0F, 0.4F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome sandyRiver(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 100, new SpawnSettings.SpawnEntry(EntityType.DROWNED, 1, 1));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, 2.0F, 0.2F, 12235916, 14737100, null, null, null, builder, lookupBackedBuilder, null);
    }

    public static Biome savanna(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean plateau
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.HORSE, 2, 6)).spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.DONKEY, 1, 1)).spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.ARMADILLO, 2, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        if (plateau) {
            builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.LLAMA, 4, 4));
            builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 8));

            OverhaulBiomeFeatures.savannaPlateauVegetation(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addSavannaTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addExtraDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addSavannaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(false, 2.0F, 0.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome shimmeringWastelands(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(true, -1.0F, 1.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome snowySlopes(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3))
                .spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.GOAT, 1, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.snowySlopesVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, false);

        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SNOWY_SLOPES);

        return createBiome(true, -1.0F, 0.4F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome sparseJungle(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addJungleMobs(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 2, 4));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addSparseJungleTrees(lookupBackedBuilder);
        DefaultBiomeFeatures.addExtraDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addJungleGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addVines(lookupBackedBuilder);
        DefaultBiomeFeatures.addSparseMelons(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SPARSE_JUNGLE);

        return createBiome(true, 2.0F, 0.8F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome spectralAbyss(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, 1.0F, 0.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome subzeroAbyss(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.MONSTER, 80, new SpawnSettings.SpawnEntry(EntityType.STRAY, 4, 4));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);

        return createBiome(true, -1.0F, 0.2F, builder, lookupBackedBuilder, null);
    }

    public static Biome swamp(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder, 70);
        builder.spawn(SpawnGroup.MONSTER, 1, new SpawnSettings.SpawnEntry(EntityType.SLIME, 1, 1));
        builder.spawn(SpawnGroup.MONSTER, 30, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 4, 4));
        builder.spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.FROG, 2, 5));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        DefaultBiomeFeatures.addFossils(lookupBackedBuilder);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addClayDisk(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addSwampVegetation(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, OceanPlacedFeatures.SEAGRASS_SWAMP);

        MusicSound musicSound = MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_SWAMP);

        return createBiome(true, 0.4F, 0.9F, 6388580, 2302743, null, 6975545, 8082228, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome taiga(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean snowy
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.WOLF, 4, 4))
                .spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3)
                ).spawn(SpawnGroup.CREATURE, 8, new SpawnSettings.SpawnEntry(EntityType.FOX, 2, 4));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addLargeFerns(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addTaigaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        if (snowy) {
            OverhaulBiomeFeatures.snowyTaigaVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addSweetBerryBushesSnowy(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.taigaVegetation(lookupBackedBuilder);
            DefaultBiomeFeatures.addSweetBerryBushes(lookupBackedBuilder);
        }

        return createBiome(true, snowy ? -1.0F : 0.2F, 0.8F, snowy ? 4020182 : 4159204, 329011, null, null, null, builder, lookupBackedBuilder, null);
    }

    public static Biome tangledTropics(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addJungleMobs(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addSparseJungleTrees(lookupBackedBuilder);
        DefaultBiomeFeatures.addExtraDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addJungleGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addVines(lookupBackedBuilder);
        DefaultBiomeFeatures.addSparseMelons(lookupBackedBuilder);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_JUNGLE);

        return createBiome(true, 2.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome toxicWastes(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_DRIPSTONE_CAVES);

        return createBiome(true, 0.4F, 0.4F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome tropicalRainforest(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean monsoon
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        DefaultBiomeFeatures.addBatsAndMonsters(builder);
        builder.spawn(SpawnGroup.CREATURE, 40, new SpawnSettings.SpawnEntry(EntityType.PARROT, 1, 2))
                .spawn(SpawnGroup.MONSTER, 2, new SpawnSettings.SpawnEntry(EntityType.OCELOT, 1, 3))
                .spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.PANDA, 1, 2));

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addJungleTrees(lookupBackedBuilder);
        DefaultBiomeFeatures.addExtraDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addJungleGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        DefaultBiomeFeatures.addVines(lookupBackedBuilder);
        DefaultBiomeFeatures.addMelons(lookupBackedBuilder);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_JUNGLE);

        return createBiome(true, 2.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome whimsy(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 4, new SpawnSettings.SpawnEntry(EntityType.RABBIT, 2, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addForestGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_FOREST);

        return createBiome(true, 1.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    public static Biome windsweptGravellyHills(
        RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.LLAMA, 4, 6));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.windsweptGravellyHillsVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);

        return createBiome(true, 0.8F, 0.4F, builder, lookupBackedBuilder, null);
    }

    public static Biome windsweptHills(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup, boolean forest
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 5, new SpawnSettings.SpawnEntry(EntityType.LLAMA, 4, 6));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        if (forest) {
            OverhaulBiomeFeatures.windsweptForestVegetation(lookupBackedBuilder);
        } else {
            OverhaulBiomeFeatures.windsweptHillsVegetation(lookupBackedBuilder);
        }
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);
        lookupBackedBuilder.feature(GenerationStep.Feature.UNDERGROUND_ORES, OverhaulOrePlacedFeatures.ORE_EMERALD);
        return createBiome(true, 0.8F, 0.4F, builder, lookupBackedBuilder, null);
    }

    public static Biome windsweptSavanna(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addFarmAnimals(builder);
        builder.spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.HORSE, 2, 6)).spawn(SpawnGroup.CREATURE, 1, new SpawnSettings.SpawnEntry(EntityType.DONKEY, 1, 1)).spawn(SpawnGroup.CREATURE, 10, new SpawnSettings.SpawnEntry(EntityType.ARMADILLO, 2, 3));
        DefaultBiomeFeatures.addBatsAndMonsters(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.windsweptSavannaVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultFlowers(lookupBackedBuilder);
        DefaultBiomeFeatures.addWindsweptSavannaGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(false, 2.0F, 0.0F, builder, lookupBackedBuilder, null);
    }

    public static Biome windsweptTundra(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(lookupBackedBuilder);
        DefaultBiomeFeatures.addBushes(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        return createBiome(true, 0.2F, 0.0F, 3750089, 329011, 12086123, 9987967, 9987967, builder, lookupBackedBuilder, null);
    }

    public static Biome winterWonderland(
            RegistryEntryLookup<PlacedFeature> featureLookup, RegistryEntryLookup<ConfiguredCarver<?>> carverLookup
    ) {
        SpawnSettings.Builder builder = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addSnowyMobs(builder);

        GenerationSettings.LookupBackedBuilder lookupBackedBuilder = new GenerationSettings.LookupBackedBuilder(featureLookup, carverLookup);
        addBasicFeatures(lookupBackedBuilder);
        OverhaulBiomeFeatures.winterWonderlandVegetation(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultMushrooms(lookupBackedBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(lookupBackedBuilder, true);

        MusicSound musicSound = createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA);

        return createBiome(true, -1.0F, 1.0F, builder, lookupBackedBuilder, musicSound);
    }

    private static void addBasicFeatures(GenerationSettings.LookupBackedBuilder generationSettings) {
        OverhaulBiomeFeatures.addCarvers(generationSettings);
        OverhaulBiomeFeatures.addOres(generationSettings, false);
        DefaultBiomeFeatures.addFrozenTopLayer(generationSettings);
    }

    public static MusicSound createIngameMusic(RegistryEntry<SoundEvent> sound) {
        return new MusicSound(sound, 1, 20, false);
    }

    public enum OverhaulTemperature {
        SNOWY,
        COLD,
        COOL,
        DEFAULT,
        WARM,
        HOT
    }
}
