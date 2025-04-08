package me.withers_overhaul.world.gen;

import me.withers_overhaul.WithersOverhaul;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;
import net.minecraft.world.gen.chunk.GenerationShapeConfig;
import net.minecraft.world.gen.densityfunction.DensityFunction;
import net.minecraft.world.gen.densityfunction.DensityFunctionTypes;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.noise.NoiseRouter;

import java.util.stream.Stream;

import static net.minecraft.world.gen.densityfunction.DensityFunctions.*;

public class OverhaulChunkGenerator {

    public static final RegistryKey<ChunkGeneratorSettings> OVERHAUL = RegistryKey.of(RegistryKeys.CHUNK_GENERATOR_SETTINGS, Identifier.of(WithersOverhaul.MOD_ID, "overhaul"));

    public static void bootstrap(Registerable<ChunkGeneratorSettings> chunkGenerationSettingsRegisterable) {
        chunkGenerationSettingsRegisterable.register(OVERHAUL, createSurfaceSettings(chunkGenerationSettingsRegisterable));
    }
    
    public static ChunkGeneratorSettings createSurfaceSettings(Registerable<?> registerable) {
        return new ChunkGeneratorSettings(
                GenerationShapeConfig.create(-64, 384, 1, 2),
                Blocks.STONE.getDefaultState(),
                Blocks.WATER.getDefaultState(),
                createSurfaceNoiseRouter(registerable.getRegistryLookup(RegistryKeys.DENSITY_FUNCTION), registerable.getRegistryLookup(RegistryKeys.NOISE_PARAMETERS)),
                OverhaulSurfaceRule.overhaulSurfaceRule(),
                new VanillaBiomeParameters().getSpawnSuitabilityNoises(),
                63,
                false,
                true,
                true,
                false
        );
    }
    
    // Copied vanilla code because its private

    private static final RegistryKey<DensityFunction> Y = of("y");
    private static final RegistryKey<DensityFunction> SHIFT_X = of("shift_x");
    private static final RegistryKey<DensityFunction> SHIFT_Z = of("shift_z");
    private static final RegistryKey<DensityFunction> SLOPED_CHEESE_OVERWORLD = of("overworld/sloped_cheese");
    private static final RegistryKey<DensityFunction> CAVES_ENTRANCES_OVERWORLD = of("overworld/caves/entrances");
    private static final RegistryKey<DensityFunction> CAVES_NOODLE_OVERWORLD = of("overworld/caves/noodle");
    private static final RegistryKey<DensityFunction> CAVES_SPAGHETTI_2D_OVERWORLD = of("overworld/caves/spaghetti_2d");
    private static final RegistryKey<DensityFunction> CAVES_SPAGHETTI_ROUGHNESS_FUNCTION_OVERWORLD = of("overworld/caves/spaghetti_roughness_function");
    private static final RegistryKey<DensityFunction> CAVES_PILLARS_OVERWORLD = of("overworld/caves/pillars");
    private static RegistryKey<DensityFunction> of(String id) {
        return RegistryKey.of(RegistryKeys.DENSITY_FUNCTION, Identifier.ofVanilla(id));
    }
    
    private static NoiseRouter createSurfaceNoiseRouter(
            RegistryEntryLookup<DensityFunction> densityFunctionLookup,
            RegistryEntryLookup<DoublePerlinNoiseSampler.NoiseParameters> noiseParametersLookup
    ) {
        DensityFunction aquiferBarrier = DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_BARRIER), 0.5);
        DensityFunction aquiferFluidLevelFloodedness = DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_FLUID_LEVEL_FLOODEDNESS), 0.67);
        DensityFunction aquiferFluidLevelSpread = DensityFunctionTypes.noise(
                noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_FLUID_LEVEL_SPREAD), 0.7142857142857143
        );
        DensityFunction aquiferLava = DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.AQUIFER_LAVA));
        DensityFunction shiftX = entryHolder(densityFunctionLookup, SHIFT_X);
        DensityFunction shiftZ = entryHolder(densityFunctionLookup, SHIFT_Z);
        DensityFunction temperature = DensityFunctionTypes.shiftedNoise(
                shiftX,
                shiftZ,
                0.25,
                noiseParametersLookup.getOrThrow(NoiseParametersKeys.TEMPERATURE)
        );
        DensityFunction vegetation = DensityFunctionTypes.shiftedNoise(
                shiftX,
                shiftZ,
                0.25,
                noiseParametersLookup.getOrThrow(NoiseParametersKeys.VEGETATION)
        );
        DensityFunction factorOverworld = entryHolder(
                densityFunctionLookup, (FACTOR_OVERWORLD)
        );
        DensityFunction depthOverworld = entryHolder(
                densityFunctionLookup, (DEPTH_OVERWORLD)
        );
        DensityFunction initialDensityFunction = createInitialDensityFunction(DensityFunctionTypes.cache2d(factorOverworld), depthOverworld);
        DensityFunction slopedCheeseOverworld = entryHolder(
                densityFunctionLookup, (SLOPED_CHEESE_OVERWORLD)
        );
        DensityFunction cavesEntrancesOverworld = DensityFunctionTypes.min(
                slopedCheeseOverworld, DensityFunctionTypes.mul(DensityFunctionTypes.constant(5.0), entryHolder(densityFunctionLookup, CAVES_ENTRANCES_OVERWORLD))
        );
        DensityFunction rangeSlopedCheeseCavesEntrance = DensityFunctionTypes.rangeChoice(
                slopedCheeseOverworld, -1000000.0, 1.5625, cavesEntrancesOverworld, createCavesFunction(densityFunctionLookup, noiseParametersLookup, slopedCheeseOverworld)
        );
        DensityFunction cavesNoodleOverworld = DensityFunctionTypes.min(
                applyBlendDensity(applySurfaceSlides(rangeSlopedCheeseCavesEntrance)), entryHolder(densityFunctionLookup, CAVES_NOODLE_OVERWORLD)
        );
        DensityFunction y = entryHolder(densityFunctionLookup, Y);
        int i = Stream.of(OverhaulOreVeins.VeinType.values()).mapToInt(veinType -> veinType.minY).min().orElse(-DimensionType.MIN_HEIGHT * 2);
        int j = Stream.of(OverhaulOreVeins.VeinType.values()).mapToInt(veinType -> veinType.maxY).max().orElse(-DimensionType.MIN_HEIGHT * 2);
        DensityFunction oreVeininess = verticalRangeChoice(
                y, DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_VEININESS), 1.5, 1.5), i, j
        );
        DensityFunction oreVeinA = verticalRangeChoice(
                y, DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_VEIN_A), 4.0, 4.0), i, j
        )
                .abs();
        DensityFunction oreVeinB = verticalRangeChoice(
                y, DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_VEIN_B), 4.0, 4.0), i, j
        )
                .abs();
        DensityFunction oreVeinsAAndB = DensityFunctionTypes.add(
                DensityFunctionTypes.constant(-0.08F), DensityFunctionTypes.max(oreVeinA, oreVeinB)
        );
        DensityFunction oreGap = DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.ORE_GAP));
        return new NoiseRouter(
                aquiferBarrier,
                aquiferFluidLevelFloodedness,
                aquiferFluidLevelSpread,
                aquiferLava,
                temperature,
                vegetation,
                entryHolder(densityFunctionLookup, CONTINENTS_OVERWORLD),
                entryHolder(densityFunctionLookup, EROSION_OVERWORLD),
                depthOverworld,
                entryHolder(densityFunctionLookup, RIDGES_OVERWORLD),
                applySurfaceSlides(DensityFunctionTypes.add(initialDensityFunction, DensityFunctionTypes.constant(-0.703125)).clamp(-64.0, 64.0)),
                cavesNoodleOverworld,
                oreVeininess,
                oreVeinsAAndB,
                oreGap
        );
    }
    
    private static DensityFunction entryHolder(RegistryEntryLookup<DensityFunction> densityFunctionRegisterable, RegistryKey<DensityFunction> key) {
        return new DensityFunctionTypes.RegistryEntryHolder(densityFunctionRegisterable.getOrThrow(key));
    }
    private static DensityFunction createInitialDensityFunction(DensityFunction factor, DensityFunction depth) {
        DensityFunction densityFunction = DensityFunctionTypes.mul(depth, factor);
        return DensityFunctionTypes.mul(DensityFunctionTypes.constant(4.0), densityFunction.quarterNegative());
    }
    private static DensityFunction createCavesFunction(
            RegistryEntryLookup<DensityFunction> densityFunctionLookup,
            RegistryEntryLookup<DoublePerlinNoiseSampler.NoiseParameters> noiseParametersLookup,
            DensityFunction slopedCheese
    ) {
        DensityFunction cavesSpaghetti2DOverworld = entryHolder(densityFunctionLookup, CAVES_SPAGHETTI_2D_OVERWORLD);
        DensityFunction cavesSpaghettiRoughnessFunctionOverworld = entryHolder(densityFunctionLookup, CAVES_SPAGHETTI_ROUGHNESS_FUNCTION_OVERWORLD);
        DensityFunction caveLayer = DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.CAVE_LAYER), 8.0);
        DensityFunction caveLayerSquare = DensityFunctionTypes.mul(DensityFunctionTypes.constant(4.0), caveLayer.square());
        DensityFunction caveCheese = DensityFunctionTypes.noise(noiseParametersLookup.getOrThrow(NoiseParametersKeys.CAVE_CHEESE), 0.6666666666666666);
        DensityFunction caveCheeseAndSlopedCheese = DensityFunctionTypes.add(
                DensityFunctionTypes.add(DensityFunctionTypes.constant(0.27), caveCheese).clamp(-1.0, 1.0),
                DensityFunctionTypes.add(DensityFunctionTypes.constant(1.5), DensityFunctionTypes.mul(DensityFunctionTypes.constant(-0.64), slopedCheese)).clamp(0.0, 0.5)
        );
        DensityFunction caveLayerSquareAndCaveCheeseAndSlopedCheese = DensityFunctionTypes.add(caveLayerSquare, caveCheeseAndSlopedCheese);
        DensityFunction cavesAll = DensityFunctionTypes.min(
                DensityFunctionTypes.min(caveLayerSquareAndCaveCheeseAndSlopedCheese, entryHolder(densityFunctionLookup, CAVES_ENTRANCES_OVERWORLD)),
                DensityFunctionTypes.add(cavesSpaghetti2DOverworld, cavesSpaghettiRoughnessFunctionOverworld)
        );
        DensityFunction cavesPillarsOverworld = entryHolder(densityFunctionLookup, CAVES_PILLARS_OVERWORLD);
        DensityFunction rangeCavesPillars = DensityFunctionTypes.rangeChoice(
                cavesPillarsOverworld, -1000000.0, 0.03, DensityFunctionTypes.constant(-1000000.0), cavesPillarsOverworld
        );
        return DensityFunctionTypes.max(cavesAll, rangeCavesPillars);
    }
    private static DensityFunction applyBlendDensity(DensityFunction density) {
        DensityFunction densityFunction = DensityFunctionTypes.blendDensity(density);
        return DensityFunctionTypes.mul(DensityFunctionTypes.interpolated(densityFunction), DensityFunctionTypes.constant(0.64)).squeeze();
    }
    private static DensityFunction applySurfaceSlides(DensityFunction density) {
        return applySlides(density);
    }
    private static DensityFunction verticalRangeChoice(DensityFunction y, DensityFunction whenInRange, int minInclusive, int maxInclusive) {
        return DensityFunctionTypes.interpolated(
                DensityFunctionTypes.rangeChoice(y, minInclusive, maxInclusive + 1, whenInRange, DensityFunctionTypes.constant(0))
        );
    }
    private static DensityFunction applySlides(
            DensityFunction density
    ) {
        DensityFunction fullHeightNoise = DensityFunctionTypes.yClampedGradient(-64 + 384 - 80, -64 + 384 - 64, 1.0, 0.0);
        DensityFunction lerpFullHeightNoise = DensityFunctionTypes.lerp(fullHeightNoise, -0.078125, density);
        DensityFunction deepCaves = DensityFunctionTypes.yClampedGradient(-64, -64 + 24, 0.0, 1.0);
        return DensityFunctionTypes.lerp(deepCaves, 0.1171875, lerpFullHeightNoise);
    }
}
