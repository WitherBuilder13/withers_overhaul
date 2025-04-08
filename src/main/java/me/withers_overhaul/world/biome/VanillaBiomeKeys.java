package me.withers_overhaul.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class VanillaBiomeKeys {
    // Vanilla biomes
    public static final RegistryKey<Biome> BADLANDS = keyOfVanilla("badlands");
    public static final RegistryKey<Biome> BAMBOO_JUNGLE = keyOfVanilla("bamboo_jungle");
    public static final RegistryKey<Biome> BEACH = keyOfVanilla("beach");
    public static final RegistryKey<Biome> BIRCH_FOREST = keyOfVanilla("birch_forest");
    public static final RegistryKey<Biome> CHERRY_GROVE = keyOfVanilla("cherry_grove");
    public static final RegistryKey<Biome> COLD_OCEAN = keyOfVanilla("cold_ocean");
    public static final RegistryKey<Biome> DARK_FOREST = keyOfVanilla("dark_forest");
    public static final RegistryKey<Biome> DEEP_COLD_OCEAN = keyOfVanilla("deep_cold_ocean");
    public static final RegistryKey<Biome> DEEP_DARK = keyOfVanilla("deep_dark");
    public static final RegistryKey<Biome> DEEP_FROZEN_OCEAN = keyOfVanilla("deep_frozen_ocean");
    public static final RegistryKey<Biome> DEEP_LUKEWARM_OCEAN = keyOfVanilla("deep_lukewarm_ocean");
    public static final RegistryKey<Biome> DEEP_OCEAN = keyOfVanilla("deep_ocean");
    public static final RegistryKey<Biome> DESERT = keyOfVanilla("desert");
    public static final RegistryKey<Biome> DRIPSTONE_CAVES = keyOfVanilla("dripstone_caves");
    public static final RegistryKey<Biome> ERODED_BADLANDS = keyOfVanilla("eroded_badlands");
    public static final RegistryKey<Biome> FLOWER_FOREST = keyOfVanilla("flower_forest");
    public static final RegistryKey<Biome> FOREST = keyOfVanilla("forest");
    public static final RegistryKey<Biome> FROZEN_OCEAN = keyOfVanilla("frozen_ocean");
    public static final RegistryKey<Biome> FROZEN_PEAKS = keyOfVanilla("frozen_peaks");
    public static final RegistryKey<Biome> FROZEN_RIVER = keyOfVanilla("frozen_river");
    public static final RegistryKey<Biome> GROVE = keyOfVanilla("grove");
    public static final RegistryKey<Biome> ICE_SPIKES = keyOfVanilla("ice_spikes");
    public static final RegistryKey<Biome> JAGGED_PEAKS = keyOfVanilla("jagged_peaks");
    public static final RegistryKey<Biome> JUNGLE = keyOfVanilla("jungle");
    public static final RegistryKey<Biome> LUKEWARM_OCEAN = keyOfVanilla("lukewarm_ocean");
    public static final RegistryKey<Biome> LUSH_CAVES = keyOfVanilla("lush_caves");
    public static final RegistryKey<Biome> MANGROVE_SWAMP = keyOfVanilla("mangrove_swamp");
    public static final RegistryKey<Biome> MEADOW = keyOfVanilla("meadow");
    public static final RegistryKey<Biome> MUSHROOM_FIELDS = keyOfVanilla("mushroom_fields");
    public static final RegistryKey<Biome> OCEAN = keyOfVanilla("ocean");
    public static final RegistryKey<Biome> OLD_GROWTH_BIRCH_FOREST = keyOfVanilla("old_growth_birch_forest");
    public static final RegistryKey<Biome> OLD_GROWTH_PINE_TAIGA = keyOfVanilla("old_growth_pine_taiga");
    public static final RegistryKey<Biome> OLD_GROWTH_SPRUCE_TAIGA = keyOfVanilla("old_growth_spruce_taiga");
    public static final RegistryKey<Biome> PALE_GARDEN = keyOfVanilla("pale_garden");
    public static final RegistryKey<Biome> PLAINS = keyOfVanilla("plains");
    public static final RegistryKey<Biome> RIVER = keyOfVanilla("river");
    public static final RegistryKey<Biome> SAVANNA = keyOfVanilla("savanna");
    public static final RegistryKey<Biome> SAVANNA_PLATEAU = keyOfVanilla("savanna_plateau");
    public static final RegistryKey<Biome> SNOWY_BEACH = keyOfVanilla("snowy_beach");
    public static final RegistryKey<Biome> SNOWY_PLAINS = keyOfVanilla("snowy_plains");
    public static final RegistryKey<Biome> SNOWY_SLOPES = keyOfVanilla("snowy_slopes");
    public static final RegistryKey<Biome> SNOWY_TAIGA = keyOfVanilla("snowy_taiga");
    public static final RegistryKey<Biome> SPARSE_JUNGLE = keyOfVanilla("sparse_jungle");
    public static final RegistryKey<Biome> STONY_PEAKS = keyOfVanilla("stony_peaks");
    public static final RegistryKey<Biome> STONY_SHORE = keyOfVanilla("stony_shore");
    public static final RegistryKey<Biome> SUNFLOWER_PLAINS = keyOfVanilla("sunflower_plains");
    public static final RegistryKey<Biome> SWAMP = keyOfVanilla("swamp");
    public static final RegistryKey<Biome> TAIGA = keyOfVanilla("taiga");
    public static final RegistryKey<Biome> WARM_OCEAN = keyOfVanilla("warm_ocean");
    public static final RegistryKey<Biome> WINDSWEPT_FOREST = keyOfVanilla("windswept_forest");
    public static final RegistryKey<Biome> WINDSWEPT_GRAVELLY_HILLS = keyOfVanilla("windswept_gravelly_hills");
    public static final RegistryKey<Biome> WINDSWEPT_HILLS = keyOfVanilla("windswept_hills");
    public static final RegistryKey<Biome> WINDSWEPT_SAVANNA = keyOfVanilla("windswept_savanna");
    public static final RegistryKey<Biome> WOODED_BADLANDS = keyOfVanilla("wooded_badlands");

    public static RegistryKey<Biome> keyOfVanilla(String id) {
        return RegistryKey.of(RegistryKeys.BIOME, Identifier.of("vanilla", id));
    }
}
