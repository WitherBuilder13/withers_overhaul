package me.withers_overhaul.world.gen;

import com.google.common.collect.ImmutableList;
import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.registry.block.StoneBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

import static me.withers_overhaul.world.biome.OverhaulBiomeKeys.*;
import static net.minecraft.world.biome.BiomeKeys.*;

public class OverhaulSurfaceRule {
    // Vanilla
    private static final MaterialRules.MaterialRule AIR = block(Blocks.AIR);
    private static final MaterialRules.MaterialRule WHITE_TERRACOTTA = block(Blocks.WHITE_TERRACOTTA);
    private static final MaterialRules.MaterialRule ORANGE_TERRACOTTA = block(Blocks.ORANGE_TERRACOTTA);
    private static final MaterialRules.MaterialRule TERRACOTTA = block(Blocks.TERRACOTTA);
    private static final MaterialRules.MaterialRule RED_SAND = block(Blocks.RED_SAND);
    private static final MaterialRules.MaterialRule RED_SANDSTONE = block(Blocks.RED_SANDSTONE);
    private static final MaterialRules.MaterialRule STONE = block(Blocks.STONE);
    private static final MaterialRules.MaterialRule DEEPSLATE = block(Blocks.DEEPSLATE);
    private static final MaterialRules.MaterialRule DIRT = block(Blocks.DIRT);
    private static final MaterialRules.MaterialRule PODZOL = block(Blocks.PODZOL);
    private static final MaterialRules.MaterialRule COARSE_DIRT = block(Blocks.COARSE_DIRT);
    private static final MaterialRules.MaterialRule MYCELIUM = block(Blocks.MYCELIUM);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = block(Blocks.GRASS_BLOCK);
    private static final MaterialRules.MaterialRule CALCITE = block(Blocks.CALCITE);
    private static final MaterialRules.MaterialRule GRAVEL = block(Blocks.GRAVEL);
    private static final MaterialRules.MaterialRule SAND = block(Blocks.SAND);
    private static final MaterialRules.MaterialRule SANDSTONE = block(Blocks.SANDSTONE);
    private static final MaterialRules.MaterialRule PACKED_ICE = block(Blocks.PACKED_ICE);
    private static final MaterialRules.MaterialRule SNOW_BLOCK = block(Blocks.SNOW_BLOCK);
    private static final MaterialRules.MaterialRule MUD = block(Blocks.MUD);
    private static final MaterialRules.MaterialRule POWDER_SNOW = block(Blocks.POWDER_SNOW);
    private static final MaterialRules.MaterialRule ICE = block(Blocks.ICE);
    private static final MaterialRules.MaterialRule WATER = block(Blocks.WATER);
    // New
    private static final MaterialRules.MaterialRule TUFF = block(Blocks.TUFF);
    private static final MaterialRules.MaterialRule GRANITE = block(Blocks.GRANITE);
    private static final MaterialRules.MaterialRule DIORITE = block(Blocks.DIORITE);
    private static final MaterialRules.MaterialRule ANDESITE = block(Blocks.ANDESITE);
    private static final MaterialRules.MaterialRule GNEISS = block(StoneBlocks.GNEISS);
    private static final MaterialRules.MaterialRule SHALE = block(StoneBlocks.SHALE);
    private static final MaterialRules.MaterialRule LIMESTONE = block(StoneBlocks.LIMESTONE);
    private static final MaterialRules.MaterialRule MARBLE = block(StoneBlocks.MARBLE);
    private static final MaterialRules.MaterialRule GABBRO = block(StoneBlocks.GABBRO);
    private static final MaterialRules.MaterialRule PHYLLITE = block(StoneBlocks.PHYLLITE);
    private static final MaterialRules.MaterialRule FROSTED_SAND = block(NaturalBlocks.FROSTED_SAND);
    private static final MaterialRules.MaterialRule CHARRED_SAND = block(NaturalBlocks.CHARRED_SAND);
    private static final MaterialRules.MaterialRule FROSTED_SANDSTONE = block(StoneBlocks.FROSTED_SANDSTONE);
    private static final MaterialRules.MaterialRule CHARRED_SANDSTONE = block(StoneBlocks.CHARRED_SANDSTONE);
    private static final MaterialRules.MaterialRule BLACKSTONE = block(Blocks.BLACKSTONE);

    private static MaterialRules.MaterialRule block(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }

    public static MaterialRules.MaterialRule overhaulSurfaceRule() {
        // Vanilla
        MaterialRules.MaterialCondition aboveY97 = MaterialRules.aboveY(YOffset.fixed(97), 2);
        MaterialRules.MaterialCondition aboveY256 = MaterialRules.aboveY(YOffset.fixed(256), 0);
        MaterialRules.MaterialCondition aboveY63WithStoneDepth = MaterialRules.aboveYWithStoneDepth(YOffset.fixed(63), -1);
        MaterialRules.MaterialCondition aboveY74WithStoneDepth = MaterialRules.aboveYWithStoneDepth(YOffset.fixed(74), 1);
        MaterialRules.MaterialCondition aboveY60 = MaterialRules.aboveY(YOffset.fixed(60), 0);
        MaterialRules.MaterialCondition aboveY62 = MaterialRules.aboveY(YOffset.fixed(62), 0);
        MaterialRules.MaterialCondition aboveY63 = MaterialRules.aboveY(YOffset.fixed(63), 0);
        MaterialRules.MaterialCondition waterWithOffset = MaterialRules.water(-1, 0);
        MaterialRules.MaterialCondition water = MaterialRules.water(0, 0);
        MaterialRules.MaterialCondition waterWithStoneDepth = MaterialRules.waterWithStoneDepth(-6, -1);
        MaterialRules.MaterialCondition hole = MaterialRules.hole();
        MaterialRules.MaterialCondition frozenOceans = MaterialRules.biome(FROZEN_OCEAN, DEEP_FROZEN_OCEAN);
        MaterialRules.MaterialCondition steepSlope = MaterialRules.steepSlope();
        MaterialRules.MaterialRule underwaterDirt = MaterialRules.sequence(MaterialRules.condition(water, GRASS_BLOCK), DIRT);
        MaterialRules.MaterialRule sandWithSandstoneCeiling = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, SANDSTONE), SAND);
        MaterialRules.MaterialRule frostedSandWithSandstoneCeiling = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, FROSTED_SANDSTONE), FROSTED_SAND);
        MaterialRules.MaterialRule charredSandWithSandstoneCeiling = MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, CHARRED_SANDSTONE), CHARRED_SAND
        );
        MaterialRules.MaterialRule gravelWithAndesiteCeiling = MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, ANDESITE), GRAVEL);
        MaterialRules.MaterialCondition sandstoneShallowBiomes = MaterialRules.biome(WARM_OCEAN, BEACH, SANDY_RIVER, LUSH_RIVER, TROPICAL_BEACH);
        MaterialRules.MaterialCondition frostedSandstoneShallowBiomes = MaterialRules.biome(FROZEN_OCEAN, FROZEN_RIVER, SNOWY_BEACH);
        MaterialRules.MaterialCondition charredSandstoneShallowBiomes = MaterialRules.biome(COLD_OCEAN, COLD_RIVER, CHARCOAL_SHORE);
        MaterialRules.MaterialCondition deserts = MaterialRules.biome(DESERT, DESERT_FIELDS);
        MaterialRules.MaterialCondition coarseDirtPodzolBiomes = MaterialRules.biome(
                OLD_GROWTH_PINE_TAIGA, OLD_GROWTH_SPRUCE_TAIGA, PINE_TAIGA, MONTANE_CLEARING, MONTANE_WOODLANDS, REDWOOD_FOREST, ALPINE_THICKET
        );
        MaterialRules.MaterialCondition snowyBiomesMarble = MaterialRules.biome(
                ICE_SPIKES, SNOWY_PLAINS, SNOWY_TAIGA, OLD_GROWTH_SNOWY_TAIGA, WINTER_WONDERLAND, SNOWY_SLOPES, GROVE, FROSTED_WOODLANDS,
                GLACIAL_SWEEP, FROSTED_TANGLE, FROZEN_PEAKS, FROZEN_WETLANDS, SNOWY_BEACH, FROZEN_RIVER, FROSTBURN_CAVES, SUBZERO_ABYSS
        );
        MaterialRules.MaterialCondition coldBiomesDiorite = MaterialRules.biome(
                TUNDRA, TAIGA, OLD_GROWTH_SPRUCE_TAIGA, REDWOOD_FOREST, ALPINE_FOREST, ALPINE_THICKET,
                WINDSWEPT_TUNDRA, ALPINE_TANGLE, ALPINE_PEAKS, BOG, CHARCOAL_SHORE, COLD_RIVER, FUNGAL_CHASM, PALE_UNDERGROWTH
        );
        MaterialRules.MaterialCondition coolBiomesAndesite = MaterialRules.biome(
                PRAIRIE, PINE_TAIGA, OLD_GROWTH_PINE_TAIGA, BIRCH_FOREST, OLD_GROWTH_BIRCH_FOREST, STEPPE, MONTANE_CLEARING, MONTANE_WOODLANDS, ASPEN_GROVE, PALE_GARDEN,
                WINDSWEPT_GRAVELLY_HILLS, GOLDEN_SWEEP, JAGGED_PEAKS, SWAMP, STONY_SHORE, COOL_RIVER, DRIPSTONE_CAVES, TOXIC_WASTES
        );
        MaterialRules.MaterialCondition warmDryBiomesGneiss = MaterialRules.biome(
                SAVANNA, SAVANNA_PLATEAU, WINDSWEPT_SAVANNA, SUNBAKED_PEAKS, SALT_MARSH, SUNBAKED_SHORE, SALT_RIVER, PHANTOM_HOLLOW, SPECTRAL_ABYSS
        );
        MaterialRules.MaterialCondition warmWetBiomesShale = MaterialRules.biome(
                SHRUBLANDS, LAVENDER_FIELDS, ENCHANTED_FOREST, CHERRY_GROVE,
                WHIMSY, PAINTED_PEAKS, BAYOU, PAINTED_BEACH, LUKEWARM_RIVER, PASTEL_CAVERNS, MUTED_TUNNELS
        );
        MaterialRules.MaterialCondition hotDryBiomesGranite = MaterialRules.biome(
                DESERT, DESERT_FIELDS, BADLANDS, WOODED_BADLANDS, ERODED_BADLANDS, OASIS, SANDY_RIVER, BURIED_DUNES, FOSSILIZED_DEPTHS
        );
        MaterialRules.MaterialCondition hotWetBiomesLimestone = MaterialRules.biome(
                SPARSE_JUNGLE, JUNGLE, TROPICAL_RAINFOREST, BAMBOO_JUNGLE, MONSOON_RAINFOREST,
                TANGLED_TROPICS, VOLCANIC_PEAKS, MANGROVE_SWAMP, TROPICAL_BEACH, LUSH_RIVER, LUSH_CAVES, MOLTEN_UNDERGROWTH
        );
        MaterialRules.MaterialCondition oceanBiomesGabbro = MaterialRules.biome(
                FROZEN_OCEAN, COLD_OCEAN, COOL_OCEAN, OCEAN, LUKEWARM_OCEAN, WARM_OCEAN,
                DEEP_FROZEN_OCEAN, DEEP_COLD_OCEAN, DEEP_COOL_OCEAN, DEEP_OCEAN, DEEP_LUKEWARM_OCEAN, DEEP_WARM_OCEAN,
                CRYSTAL_CAVES_FROZEN, CRYSTAL_CAVES_COLD, CRYSTAL_CAVES_COOL, CRYSTAL_CAVES, CRYSTAL_CAVES_LUKEWARM, CRYSTAL_CAVES_WARM
        );
        MaterialRules.MaterialCondition islandBiomesPhyllite = MaterialRules.biome(
                SHIMMERING_WASTELANDS, ASHEN_FIELDS, FORGOTTEN_ISLES, MUSHROOM_FIELDS, RAINBOW_FIELDS, LAGOON, GLOWING_GROTTO
        );

        MaterialRules.MaterialRule stoneNoise = MaterialRules.sequence(
                MaterialRules.condition(
                        MaterialRules.biome(STONY_PEAKS),
                        MaterialRules.sequence(MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.CALCITE, -0.0125, 0.0125), CALCITE), STONE)
                ),
                MaterialRules.condition(
                        MaterialRules.biome(STONY_SHORE, COOL_RIVER),
                        MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.noiseThreshold(OverhaulNoiseParameters.GRAVEL, 0.0, 1.0), gravelWithAndesiteCeiling), ANDESITE
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.biome(DESERT_FIELDS),
                        MaterialRules.sequence(
                                MaterialRules.condition(
                                        MaterialRules.noiseThreshold(OverhaulNoiseParameters.COARSE_DIRT_DESERT, 0.0, 1.0), COARSE_DIRT
                                ), sandWithSandstoneCeiling
                        )
                ),
                MaterialRules.condition(MaterialRules.biome(WINDSWEPT_HILLS), MaterialRules.condition(surfaceNoiseThreshold(1.0), STONE)),
                MaterialRules.condition(sandstoneShallowBiomes, sandWithSandstoneCeiling),
                MaterialRules.condition(frostedSandstoneShallowBiomes, frostedSandWithSandstoneCeiling),
                MaterialRules.condition(charredSandstoneShallowBiomes, charredSandWithSandstoneCeiling),
                MaterialRules.condition(deserts, sandWithSandstoneCeiling),
                MaterialRules.condition(MaterialRules.biome(DRIPSTONE_CAVES), ANDESITE)
        );
        MaterialRules.MaterialRule powderSnow1 = MaterialRules.condition(
                MaterialRules.noiseThreshold(NoiseParametersKeys.POWDER_SNOW, 0.45, 0.58), MaterialRules.condition(water, POWDER_SNOW)
        );
        MaterialRules.MaterialRule powderSnow2 = MaterialRules.condition(
                MaterialRules.noiseThreshold(NoiseParametersKeys.POWDER_SNOW, 0.35, 0.6), MaterialRules.condition(water, POWDER_SNOW)
        );
        MaterialRules.MaterialRule stoneDepthFloorWithSurfaceDepth = MaterialRules.sequence(
                MaterialRules.condition(
                        MaterialRules.biome(FROZEN_PEAKS),
                        MaterialRules.sequence(
                                MaterialRules.condition(steepSlope, PACKED_ICE),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PACKED_ICE, -0.5, 0.2), PACKED_ICE),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.ICE, -0.0625, 0.025), ICE),
                                MaterialRules.condition(water, SNOW_BLOCK)
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.biome(SNOWY_SLOPES),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, MARBLE), powderSnow1, MaterialRules.condition(water, SNOW_BLOCK))
                ),
                MaterialRules.condition(MaterialRules.biome(JAGGED_PEAKS), ANDESITE),
                MaterialRules.condition(MaterialRules.biome(ALPINE_PEAKS), DIORITE),
                MaterialRules.condition(MaterialRules.biome(SUNBAKED_PEAKS), ORANGE_TERRACOTTA),
                MaterialRules.condition(MaterialRules.biome(PAINTED_PEAKS), WHITE_TERRACOTTA),
                MaterialRules.condition(MaterialRules.biome(VOLCANIC_PEAKS), BLACKSTONE),
                MaterialRules.condition(MaterialRules.biome(GROVE, FROSTED_WOODLANDS), MaterialRules.sequence(powderSnow1, DIRT)),
                stoneNoise,
                MaterialRules.condition(MaterialRules.biome(WINDSWEPT_SAVANNA), MaterialRules.condition(surfaceNoiseThreshold(1.75), GNEISS)),
                MaterialRules.condition(
                        MaterialRules.biome(WINDSWEPT_GRAVELLY_HILLS),
                        MaterialRules.sequence(
                                MaterialRules.condition(surfaceNoiseThreshold(2.0), gravelWithAndesiteCeiling),
                                MaterialRules.condition(surfaceNoiseThreshold(1.0), ANDESITE),
                                MaterialRules.condition(surfaceNoiseThreshold(-1.0), DIRT),
                                gravelWithAndesiteCeiling
                        )
                ),
                MaterialRules.condition(MaterialRules.biome(MANGROVE_SWAMP), MUD),
                DIRT
        );
        MaterialRules.MaterialRule stoneDepthFloorWater = MaterialRules.sequence(
                MaterialRules.condition(
                        MaterialRules.biome(FROZEN_PEAKS),
                        MaterialRules.sequence(
                                MaterialRules.condition(steepSlope, PACKED_ICE),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.PACKED_ICE, 0.0, 0.2), PACKED_ICE),
                                MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.ICE, 0.0, 0.025), ICE),
                                MaterialRules.condition(water, SNOW_BLOCK)
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.biome(SNOWY_SLOPES),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, MARBLE), powderSnow2, MaterialRules.condition(water, SNOW_BLOCK))
                ),
                MaterialRules.condition(
                        MaterialRules.biome(JAGGED_PEAKS),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, ANDESITE), MaterialRules.condition(water, SNOW_BLOCK))
                ),
                MaterialRules.condition(
                        MaterialRules.biome(ALPINE_PEAKS),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, DIORITE), MaterialRules.condition(water, SNOW_BLOCK))
                ),
                MaterialRules.condition(
                        MaterialRules.biome(SUNBAKED_PEAKS),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, ORANGE_TERRACOTTA), MaterialRules.condition(water, ORANGE_TERRACOTTA))
                ),
                MaterialRules.condition(
                        MaterialRules.biome(PAINTED_PEAKS),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, WHITE_TERRACOTTA), MaterialRules.condition(water, WHITE_TERRACOTTA))
                ),
                MaterialRules.condition(
                        MaterialRules.biome(VOLCANIC_PEAKS),
                        MaterialRules.sequence(MaterialRules.condition(steepSlope, BLACKSTONE), MaterialRules.condition(water, BLACKSTONE))
                ),
                MaterialRules.condition(MaterialRules.biome(GROVE, FROSTED_WOODLANDS), MaterialRules.sequence(powderSnow2, MaterialRules.condition(water, SNOW_BLOCK))),
                stoneNoise,
                MaterialRules.condition(
                        MaterialRules.biome(WINDSWEPT_SAVANNA),
                        MaterialRules.sequence(MaterialRules.condition(surfaceNoiseThreshold(1.75), GNEISS), MaterialRules.condition(surfaceNoiseThreshold(-0.5), COARSE_DIRT))
                ),
                MaterialRules.condition(
                        MaterialRules.biome(WINDSWEPT_GRAVELLY_HILLS),
                        MaterialRules.sequence(
                                MaterialRules.condition(surfaceNoiseThreshold(2.0), gravelWithAndesiteCeiling),
                                MaterialRules.condition(surfaceNoiseThreshold(1.0), ANDESITE),
                                MaterialRules.condition(surfaceNoiseThreshold(-1.0), underwaterDirt),
                                gravelWithAndesiteCeiling
                        )
                ),
                MaterialRules.condition(
                        coarseDirtPodzolBiomes,
                        MaterialRules.sequence(MaterialRules.condition(surfaceNoiseThreshold(1.75), COARSE_DIRT), MaterialRules.condition(surfaceNoiseThreshold(-0.95), PODZOL))
                ),
                MaterialRules.condition(MaterialRules.biome(ICE_SPIKES), MaterialRules.condition(water, SNOW_BLOCK)),
                MaterialRules.condition(MaterialRules.biome(MANGROVE_SWAMP), MUD),
                MaterialRules.condition(MaterialRules.biome(MUSHROOM_FIELDS), MYCELIUM),
                underwaterDirt
        );
        MaterialRules.MaterialCondition badlandsNoise1 = MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.909, -0.5454);
        MaterialRules.MaterialCondition badlandsNoise2 = MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, -0.1818, 0.1818);
        MaterialRules.MaterialCondition badlandsNoise3 = MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, 0.5454, 0.909);
        MaterialRules.MaterialRule biomeDependentStones = MaterialRules.sequence(
                MaterialRules.condition(snowyBiomesMarble, MARBLE),
                MaterialRules.condition(coldBiomesDiorite, DIORITE),
                MaterialRules.condition(coolBiomesAndesite, ANDESITE),
                MaterialRules.condition(warmDryBiomesGneiss, GNEISS),
                MaterialRules.condition(warmWetBiomesShale, SHALE),
                MaterialRules.condition(hotDryBiomesGranite, GRANITE),
                MaterialRules.condition(hotWetBiomesLimestone, LIMESTONE),
                MaterialRules.condition(oceanBiomesGabbro, GABBRO),
                MaterialRules.condition(islandBiomesPhyllite, PHYLLITE)
        );
        MaterialRules.MaterialRule mainSequence = MaterialRules.sequence(
                MaterialRules.condition(
                        MaterialRules.STONE_DEPTH_FLOOR,
                        MaterialRules.sequence(
                                MaterialRules.condition(
                                        MaterialRules.biome(WOODED_BADLANDS),
                                        MaterialRules.condition(
                                                aboveY97,
                                                MaterialRules.sequence(
                                                        MaterialRules.condition(badlandsNoise1, COARSE_DIRT),
                                                        MaterialRules.condition(badlandsNoise2, COARSE_DIRT),
                                                        MaterialRules.condition(badlandsNoise3, COARSE_DIRT),
                                                        underwaterDirt
                                                )
                                        )
                                ),
                                MaterialRules.condition(
                                        MaterialRules.biome(SWAMP),
                                        MaterialRules.condition(
                                                aboveY62,
                                                MaterialRules.condition(
                                                        MaterialRules.not(aboveY63), MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SWAMP, 0.0), WATER)
                                                )
                                        )
                                ),
                                MaterialRules.condition(
                                        MaterialRules.biome(MANGROVE_SWAMP),
                                        MaterialRules.condition(
                                                aboveY60,
                                                MaterialRules.condition(
                                                        MaterialRules.not(aboveY63), MaterialRules.condition(MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE_SWAMP, 0.0), WATER)
                                                )
                                        )
                                )
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.biome(BADLANDS, ERODED_BADLANDS, WOODED_BADLANDS),
                        MaterialRules.sequence(
                                MaterialRules.condition(
                                        MaterialRules.STONE_DEPTH_FLOOR,
                                        MaterialRules.sequence(
                                                MaterialRules.condition(aboveY256, ORANGE_TERRACOTTA),
                                                MaterialRules.condition(
                                                        aboveY74WithStoneDepth,
                                                        MaterialRules.sequence(
                                                                MaterialRules.condition(badlandsNoise1, TERRACOTTA),
                                                                MaterialRules.condition(badlandsNoise2, TERRACOTTA),
                                                                MaterialRules.condition(badlandsNoise3, TERRACOTTA),
                                                                MaterialRules.terracottaBands()
                                                        )
                                                ),
                                                MaterialRules.condition(waterWithOffset, MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, RED_SANDSTONE), RED_SAND)),
                                                MaterialRules.condition(MaterialRules.not(hole), ORANGE_TERRACOTTA),
                                                MaterialRules.condition(waterWithStoneDepth, WHITE_TERRACOTTA),
                                                MaterialRules.sequence(MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, GRANITE), GRAVEL)
                                        )
                                ),
                                MaterialRules.condition(
                                        aboveY63WithStoneDepth,
                                        MaterialRules.sequence(
                                                MaterialRules.condition(aboveY63, MaterialRules.condition(MaterialRules.not(aboveY74WithStoneDepth), ORANGE_TERRACOTTA)),
                                                MaterialRules.terracottaBands()
                                        )
                                ),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, MaterialRules.condition(waterWithStoneDepth, WHITE_TERRACOTTA))
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.STONE_DEPTH_FLOOR,
                        MaterialRules.condition(
                                waterWithOffset,
                                MaterialRules.sequence(
                                        MaterialRules.condition(
                                                frozenOceans,
                                                MaterialRules.condition(
                                                        hole,
                                                        MaterialRules.sequence(MaterialRules.condition(water, AIR), MaterialRules.condition(MaterialRules.temperature(), ICE), WATER)
                                                )
                                        ),
                                        stoneDepthFloorWater
                                )
                        )
                ),
                MaterialRules.condition(
                        waterWithStoneDepth,
                        MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, MaterialRules.condition(frozenOceans, MaterialRules.condition(hole, WATER))),
                                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, stoneDepthFloorWithSurfaceDepth),
                                MaterialRules.condition(sandstoneShallowBiomes, MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, SANDSTONE)),
                                MaterialRules.condition(MaterialRules.biome(FROZEN_OCEAN, SNOWY_BEACH, FROZEN_RIVER), MaterialRules.condition(
                                        MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, FROSTED_SANDSTONE
                                )),
                                MaterialRules.condition(MaterialRules.biome(COLD_OCEAN, CHARCOAL_SHORE, COLD_RIVER), MaterialRules.condition(
                                        MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6, CHARRED_SANDSTONE
                                )),
                                MaterialRules.condition(deserts, MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30, SANDSTONE))
                        )
                ),
                MaterialRules.condition(
                        MaterialRules.STONE_DEPTH_FLOOR,
                        MaterialRules.sequence(
                                MaterialRules.condition(MaterialRules.biome(FROZEN_PEAKS), MARBLE),
                                MaterialRules.condition(MaterialRules.biome(JAGGED_PEAKS), ANDESITE),
                                MaterialRules.condition(MaterialRules.biome(SUNBAKED_PEAKS), GNEISS),
                                MaterialRules.condition(MaterialRules.biome(PAINTED_PEAKS), SHALE),
                                MaterialRules.condition(MaterialRules.biome(VOLCANIC_PEAKS), LIMESTONE),
                                MaterialRules.condition(MaterialRules.biome(WARM_OCEAN, LUKEWARM_OCEAN, DEEP_LUKEWARM_OCEAN), sandWithSandstoneCeiling),
                                gravelWithAndesiteCeiling
                        )
                )
        );
        ImmutableList.Builder<MaterialRules.MaterialRule> builder = ImmutableList.builder();

        MaterialRules.MaterialRule fullSequence = MaterialRules.condition(MaterialRules.surface(), mainSequence);

        builder.add(fullSequence);
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("deepslate", YOffset.fixed(-32), YOffset.fixed(-24)), DEEPSLATE));
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("tuff", YOffset.fixed(0), YOffset.fixed(8)), TUFF));
        builder.add(biomeDependentStones);

        return MaterialRules.sequence(builder.build().toArray(MaterialRules.MaterialRule[]::new));
    }

    private static MaterialRules.MaterialCondition surfaceNoiseThreshold(double min) {
        return MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, min / 8.25, Double.MAX_VALUE);
    }
}
