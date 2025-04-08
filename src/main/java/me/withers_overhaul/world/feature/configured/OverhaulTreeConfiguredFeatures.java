package me.withers_overhaul.world.feature.configured;

import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;

import java.util.OptionalInt;

import static me.withers_overhaul.registry.block.NaturalBlocks.*;
import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.world.feature.OverhaulConfiguredFeatures.of;
import static net.minecraft.block.Blocks.ACACIA_LEAVES;
import static net.minecraft.block.Blocks.ACACIA_LOG;

public class OverhaulTreeConfiguredFeatures {
    // * The actual trees themselves
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE = of("maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE = of("fancy_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR = of("poplar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH = of("beech");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY = of("hickory");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT = of("walnut");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT = of("chestnut");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR = of("cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_FLAT = of("cedar_flat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_CEDAR = of("mega_cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_CEDAR_FLAT = of("mega_cedar_flat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD = of("redwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIR = of("fir");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_FIR = of("mega_fir");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HEMLOCK = of("hemlock");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_HEMLOCK = of("mega_hemlock");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLY = of("holly");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE = of("pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TOP = of("pine_top");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TALL = of("pine_tall");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TOP_TALL = of("pine_top_tall");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH = of("larch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_TOP = of("larch_top");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_TALL = of("larch_tall");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_TOP_TALL = of("larch_top_tall");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ASPEN = of("aspen");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK = of("kapok");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY = of("mahogany");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS = of("eucalyptus");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH = of("acacia_bush");
    //public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB = of("baobab");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE = of("palo_verde");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> JOSHUA = of("joshua");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNIPER = of("juniper");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM = of("palm");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY = of("ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY = of("mega_ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH = of("ebony_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK = of("teak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM = of("elm");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW = of("willow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYPRESS = of("cypress");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAKURA = of("sakura");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGNOLIA = of("magnolia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLOWERING_MAGNOLIA = of("flowering_magnolia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JACARANDA = of("jacaranda");

    // ` ------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<PlacedFeature> lookup = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        ConfiguredFeatures.register(featureRegisterable, MAPLE, Feature.TREE, simple(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2).build());
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE, Feature.TREE, simpleFancy(MAPLE_LOG, MAPLE_LEAVES, 7).build());
        ConfiguredFeatures.register(featureRegisterable, POPLAR, Feature.TREE, poplar().build());
        ConfiguredFeatures.register(featureRegisterable, BEECH, Feature.TREE, beech().build());
        ConfiguredFeatures.register(featureRegisterable, CEDAR, Feature.TREE, conifer(false, CEDAR_LOG, CEDAR_LEAVES,
                7, 3, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)).build());
        ConfiguredFeatures.register(featureRegisterable, CEDAR_FLAT, Feature.TREE, smallFlat(CEDAR_LOG, CEDAR_LEAVES, 5).build());
        ConfiguredFeatures.register(featureRegisterable, MEGA_CEDAR, Feature.TREE, megaConifer(CEDAR_LOG, CEDAR_LEAVES,
                12, 5, 11, ConstantIntProvider.create(0), ConstantIntProvider.create(1), UniformIntProvider.create(11, 16)).build());
        ConfiguredFeatures.register(featureRegisterable, MEGA_CEDAR_FLAT, Feature.TREE, megaFlat(CEDAR_LOG, CEDAR_LEAVES,
                7, 4, 1, ConstantIntProvider.create(1), ConstantIntProvider.create(0), 1).build());
        ConfiguredFeatures.register(featureRegisterable, REDWOOD, Feature.TREE, redwood().build());
        ConfiguredFeatures.register(featureRegisterable, FIR, Feature.TREE, conifer(false, FIR_LOG, FIR_LEAVES,
                9, 7, 2, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)).build());
        ConfiguredFeatures.register(featureRegisterable, MEGA_FIR, Feature.TREE, megaConifer(FIR_LOG, FIR_LEAVES,
                23, 6, 12, ConstantIntProvider.create(0), ConstantIntProvider.create(1), UniformIntProvider.create(17, 24)).build());
        ConfiguredFeatures.register(featureRegisterable, HEMLOCK, Feature.TREE, conifer(false, HEMLOCK_LOG, HEMLOCK_LEAVES,
                4, 2, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)).build());
        ConfiguredFeatures.register(featureRegisterable, MEGA_HEMLOCK, Feature.TREE, megaConifer(HEMLOCK_LOG, HEMLOCK_LEAVES,
                13, 4, 7, ConstantIntProvider.create(0), ConstantIntProvider.create(1), UniformIntProvider.create(8, 14)).build());
        ConfiguredFeatures.register(featureRegisterable, HOLLY, Feature.TREE, megaConifer(HOLLY_LOG, HOLLY_LEAVES,
                9, 2, 10, ConstantIntProvider.create(1), ConstantIntProvider.create(0), UniformIntProvider.create(9, 15)).build());
        ConfiguredFeatures.register(featureRegisterable, PINE, Feature.TREE, conifer(false, PINE_LOG, PINE_LEAVES,
                5, 2, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)).build());
        ConfiguredFeatures.register(featureRegisterable, PINE_TOP, Feature.TREE, conifer(true, PINE_LOG, PINE_LEAVES,
                5, 2, 1, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)).build());
        ConfiguredFeatures.register(featureRegisterable, PINE_TALL, Feature.TREE, conifer(false, PINE_LOG, PINE_LEAVES,
                11, 5, 2, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(6, 7)).build());
        ConfiguredFeatures.register(featureRegisterable, PINE_TOP_TALL, Feature.TREE, conifer(true, PINE_LOG, PINE_LEAVES,
                11, 5, 2, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)).build());
        ConfiguredFeatures.register(featureRegisterable, LARCH, Feature.TREE, conifer(false, LARCH_LOG, LARCH_LEAVES,
                6, 2, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)).build());
        ConfiguredFeatures.register(featureRegisterable, LARCH_TOP, Feature.TREE, conifer(true, LARCH_LOG, LARCH_LEAVES,
                6, 2, 1, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)).build());
        ConfiguredFeatures.register(featureRegisterable, LARCH_TALL, Feature.TREE, conifer(false, LARCH_LOG, LARCH_LEAVES,
                11, 6, 3, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(6, 7)).build());
        ConfiguredFeatures.register(featureRegisterable, LARCH_TOP_TALL, Feature.TREE, conifer(true, LARCH_LOG, LARCH_LEAVES,
                11, 6, 3, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)).build());
        ConfiguredFeatures.register(featureRegisterable, ASPEN, Feature.TREE, conifer(true, ASPEN_LOG, ASPEN_LEAVES,
                8, 1, 3, ConstantIntProvider.create(1), ConstantIntProvider.create(1), ConstantIntProvider.create(3)).build());
        ConfiguredFeatures.register(featureRegisterable, ACACIA_BUSH, Feature.TREE, bush(ACACIA_LOG, ACACIA_LEAVES).build());
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE, Feature.TREE, smallFlat(PALO_VERDE_LOG, PALO_VERDE_LEAVES, 3).build());
        ConfiguredFeatures.register(featureRegisterable, EBONY, Feature.TREE, ebony().build());
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY, Feature.TREE, megaEbony().build());
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH, Feature.TREE, bush(EBONY_LOG, EBONY_LEAVES).build());
        ConfiguredFeatures.register(featureRegisterable, TEAK, Feature.TREE, conifer(true, TEAK_LOG, TEAK_LEAVES,
                6, 4, 0, ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)).build());
        ConfiguredFeatures.register(featureRegisterable, ELM, Feature.TREE, simple(ELM_LOG, ELM_LEAVES, 7, 3, 1, 3).build());
        ConfiguredFeatures.register(featureRegisterable, MAGNOLIA, Feature.TREE, flat(MAGNOLIA_LOG, MAGNOLIA_LEAVES, 5, 2, 2).build());
        ConfiguredFeatures.register(featureRegisterable, FLOWERING_MAGNOLIA, Feature.TREE, flat(MAGNOLIA_LOG, FLOWERING_MAGNOLIA_LEAVES, 5, 1, 2).build());
        ConfiguredFeatures.register(featureRegisterable, JACARANDA, Feature.TREE, jacaranda().build());

    }

    // ` ------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // * Tree configurations

    private static TreeFeatureConfig.Builder beech() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BEECH_LOG),
                new LargeOakTrunkPlacer(15, 1, 3),
                BlockStateProvider.of(BEECH_LEAVES),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                        0.25F, 0.25F, 0.16666667F, 0.33333334F
                ),
                new TwoLayersFeatureSize(2, 0, 2)
        );
    }

    private static TreeFeatureConfig.Builder bush(Block log, Block leaves) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.of(leaves),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)
        );
    }

    private static TreeFeatureConfig.Builder conifer(
            boolean top, Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, IntProvider radius, IntProvider offset, IntProvider trunkHeight
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                top ? new PineFoliagePlacer(radius, offset, trunkHeight) : new SpruceFoliagePlacer(radius, offset, trunkHeight),
                new TwoLayersFeatureSize(2, 0, 2)
        );
    }

    private static TreeFeatureConfig.Builder ebony() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBONY_LOG),
                new ForkingTrunkPlacer(6, 1, 4),
                BlockStateProvider.of(EBONY_LEAVES),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                        0.25F, 0.25F, 0.16666667F, 0.33333334F
                ),
                new TwoLayersFeatureSize(1, 1, 2)
        );
    }

    private static TreeFeatureConfig.Builder flat(Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new ForkingTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)
        );
    }

    private static TreeFeatureConfig.Builder jacaranda() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(JACARANDA_LOG),
                new CherryTrunkPlacer(
                        7, 2, 5,
                        new WeightedListIntProvider(
                                Pool.<IntProvider>builder().add(ConstantIntProvider.create(2), 3).add(ConstantIntProvider.create(3), 2).build()
                        ),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)
                ),
                BlockStateProvider.of(JACARANDA_LEAVES),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                        0.25F, 0.25F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 1, 2)
        );
    }

    private static TreeFeatureConfig.Builder megaConifer(
            Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, IntProvider radius, IntProvider offset, IntProvider crownHeight
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new GiantTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new MegaPineFoliagePlacer(radius, offset, crownHeight),
                new TwoLayersFeatureSize(1, 1, 2)
        );
    }

    private static TreeFeatureConfig.Builder megaEbony() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBONY_LOG),
                new DarkOakTrunkPlacer(10, 4, 7),
                BlockStateProvider.of(EBONY_LEAVES),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 1, 2)
        );
    }

    private static TreeFeatureConfig.Builder megaFlat(Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, IntProvider radius, IntProvider offset, int height) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new MegaJungleTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new JungleFoliagePlacer(radius, offset, height),
                new TwoLayersFeatureSize(2, 0, 2)
        );
    }

    private static TreeFeatureConfig.Builder poplar() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(POPLAR_LOG),
                new StraightTrunkPlacer(6, 4, 1),
                BlockStateProvider.of(POPLAR_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(1), UniformIntProvider.create(1, 3), 7),
                new TwoLayersFeatureSize(2, 0, 2, OptionalInt.of(4))
        );
    }

    private static TreeFeatureConfig.Builder redwood() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(REDWOOD_LOG),
                new RedwoodTrunkPlacer(32, 16, 24),
                BlockStateProvider.of(REDWOOD_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), UniformIntProvider.create(21, 24)),
                new TwoLayersFeatureSize(1, 1, 2)
        );
    }

    private static TreeFeatureConfig.Builder simple(Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, int radius) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        );
    }

    private static TreeFeatureConfig.Builder simpleFancy(Block log, Block leaves, int baseHeight) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new LargeOakTrunkPlacer(baseHeight, 7, 0),
                BlockStateProvider.of(leaves),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        );
    }

    private static TreeFeatureConfig.Builder smallFlat(Block log, Block leaves, int baseHeight) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new ForkingTrunkPlacer(baseHeight, 1, 2),
                BlockStateProvider.of(leaves),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(2, 0, 2)
        );
    }
}