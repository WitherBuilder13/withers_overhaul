package me.withers_overhaul.datagen.fabric;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.tag.vanilla.VanillaBiomeTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static me.withers_overhaul.tag.OverhaulBiomeTags.*;
import static me.withers_overhaul.world.biome.OverhaulBiomeKeys.*;
import static net.minecraft.registry.tag.BiomeTags.*;
import static net.minecraft.world.biome.BiomeKeys.*;

public class BiomeTagGen extends VanillaBiomeTagProvider {
    public BiomeTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(TEMPERATURE_SNOWY).add(
                ICE_SPIKES, SNOWY_PLAINS, SNOWY_TAIGA, OLD_GROWTH_SNOWY_TAIGA, WINTER_WONDERLAND, SNOWY_SLOPES, GROVE,
                GLACIAL_SWEEP, FROSTED_TANGLE, FROZEN_PEAKS, FROZEN_WETLANDS, SNOWY_BEACH, FROZEN_RIVER,
                FROZEN_OCEAN, DEEP_FROZEN_OCEAN, SHIMMERING_WASTELANDS, FROSTBURN_CAVES, SUBZERO_ABYSS, CRYSTAL_CAVES_FROZEN
        );

        getOrCreateTagBuilder(TEMPERATURE_COLD).add(
                TUNDRA, TAIGA, OLD_GROWTH_SPRUCE_TAIGA, REDWOOD_FOREST, ALPINE_FOREST, ALPINE_THICKET,
                WINDSWEPT_TUNDRA, ALPINE_TANGLE, ALPINE_PEAKS, BOG, CHARCOAL_SHORE, COLD_RIVER,
                COLD_OCEAN, DEEP_COLD_OCEAN, ASHEN_FIELDS, FUNGAL_CHASM, PALE_UNDERGROWTH, CRYSTAL_CAVES_COLD
        );

        getOrCreateTagBuilder(TEMPERATURE_COOL).add(
                PRAIRIE, PINE_TAIGA, OLD_GROWTH_PINE_TAIGA, BIRCH_FOREST, OLD_GROWTH_BIRCH_FOREST, STEPPE, MONTANE_WOODLANDS, ASPEN_GROVE, PALE_GARDEN,
                WINDSWEPT_GRAVELLY_HILLS, GOLDEN_SWEEP, JAGGED_PEAKS, SWAMP, STONY_SHORE, COOL_RIVER,
                COOL_OCEAN, DEEP_COOL_OCEAN, FORGOTTEN_ISLES, DRIPSTONE_CAVES, TOXIC_WASTES, CRYSTAL_CAVES_COOL
        );

        getOrCreateTagBuilder(TEMPERATURE_TEMPERATE).add(
                PLAINS, SUNFLOWER_PLAINS, FOREST, FLOWER_FOREST, MEADOW, DARK_FOREST, CLOUD_FOREST,
                WINDSWEPT_HILLS, WINDSWEPT_FOREST, STONY_PEAKS, MARSH, BEACH, RIVER,
                OCEAN, DEEP_OCEAN, MUSHROOM_FIELDS, ECHOING_HOLLOW, DEEP_DARK, CRYSTAL_CAVES
        );

        getOrCreateTagBuilder(TEMPERATURE_WARM).add(
                SAVANNA, SHRUBLANDS, LAVENDER_FIELDS, ENCHANTED_FOREST, SAVANNA_PLATEAU, CHERRY_GROVE,
                WINDSWEPT_SAVANNA, WHIMSY, SUNBAKED_PEAKS, PAINTED_PEAKS, SALT_MARSH, BAYOU, SUNBAKED_SHORE, PAINTED_BEACH, SALT_RIVER, LUKEWARM_RIVER,
                LUKEWARM_OCEAN, DEEP_LUKEWARM_OCEAN, RAINBOW_FIELDS, PHANTOM_HOLLOW, PASTEL_CAVERNS, SPECTRAL_ABYSS, MUTED_TUNNELS, CRYSTAL_CAVES_LUKEWARM
        );

        getOrCreateTagBuilder(TEMPERATURE_HOT).add(
                DESERT, DESERT_FIELDS, SPARSE_JUNGLE, JUNGLE, TROPICAL_RAINFOREST, BADLANDS, WOODED_BADLANDS, BAMBOO_JUNGLE, MONSOON_RAINFOREST,
                ERODED_BADLANDS, TANGLED_TROPICS, VOLCANIC_PEAKS, OASIS, MANGROVE_SWAMP, TROPICAL_BEACH, SANDY_RIVER, LUSH_RIVER,
                WARM_OCEAN, DEEP_WARM_OCEAN, LAGOON, BURIED_DUNES, LUSH_CAVES, FOSSILIZED_DEPTHS, MOLTEN_UNDERGROWTH, CRYSTAL_CAVES_WARM
        );

        getOrCreateTagBuilder(SPAWNS_COLD_VARIANT_FARM_ANIMALS).addOptionalTag(TEMPERATURE_COLD.id());
        getOrCreateTagBuilder(SPAWNS_COLD_VARIANT_FROGS).addOptionalTag(TEMPERATURE_COLD.id());
        getOrCreateTagBuilder(SPAWNS_WARM_VARIANT_FARM_ANIMALS).addOptionalTag(TEMPERATURE_WARM.id());
        getOrCreateTagBuilder(SPAWNS_WARM_VARIANT_FROGS).addOptionalTag(TEMPERATURE_WARM.id());
    }

}
