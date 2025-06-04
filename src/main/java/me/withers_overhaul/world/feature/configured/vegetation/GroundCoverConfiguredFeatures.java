package me.withers_overhaul.world.feature.configured.vegetation;

import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.world.feature.placed.vegetation.OverhaulVegetationPlacedFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

import static me.withers_overhaul.world.feature.OverhaulConfiguredFeatures.of;

public class GroundCoverConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_PRAIRIE_GRASS = of("patch_prairie_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAVENDER_FLOWERS = of("lavender_flowers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_PETALS = of("purple_petals");

    // * Fruit patches
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_ARTICHOKES = of("patch_artichokes");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BEETROOTS = of("patch_beetroots");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_BROCCOLI = of("patch_broccoli");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_CABBAGE = of("patch_cabbage");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_CARROTS = of("patch_carrots");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_CAULIFLOWER = of("patch_cauliflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_CELERY = of("patch_celery");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_EGGPLANT = of("patch_eggplant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_JALAPENOS = of("patch_jalapenos");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_KALE = of("patch_kale");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_LETTUCE = of("patch_lettuce");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_ONIONS = of("patch_onions");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_PARSNIPS = of("patch_parsnips");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_PEAS = of("patch_peas");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_PEPPERS = of("patch_peppers");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_POTATOES = of("patch_potatoes");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_RADISHES = of("patch_radishes");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_SPINACH = of("patch_spinach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_TURNIPS = of("patch_turnips");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_WHEAT = of("patch_wheat");

    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GROUND_FRUIT_COLD = of("patch_ground_fruit_cold");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GROUND_FRUIT_COOL = of("patch_ground_fruit_cool");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GROUND_FRUIT_TEMPERATE = of("patch_ground_fruit_temperate");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_GROUND_FRUIT_MEDITERRANEAN = of("patch_ground_fruit_mediterranean");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntryLookup<PlacedFeature> placedFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        ConfiguredFeatures.register(featureRegisterable, PATCH_PRAIRIE_GRASS, Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(
                32, 7, 3,PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(Pool.<BlockState>builder()
                .add(NaturalBlocks.SHORT_PRAIRIE_GRASS.getDefaultState(), 1)
            .add(NaturalBlocks.TALL_PRAIRIE_GRASS.getDefaultState(), 1)
            ))))
            );
        ConfiguredFeatures.register(featureRegisterable, LAVENDER_FLOWERS, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(
            List.of(
                    new RandomFeatureEntry(PlacedFeatures.createEntry(Feature.RANDOM_PATCH, new RandomPatchFeatureConfig(32, 7, 3,PlacedFeatures.createEntry(
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

        ConfiguredFeatures.register(featureRegisterable, PATCH_ARTICHOKES, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.ARTICHOKES));
        ConfiguredFeatures.register(featureRegisterable, PATCH_BEETROOTS, Feature.RANDOM_PATCH, groundCropPatch(Blocks.BEETROOTS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_BROCCOLI, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.BROCCOLI));
        ConfiguredFeatures.register(featureRegisterable, PATCH_CABBAGE, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.CABBAGE));
        ConfiguredFeatures.register(featureRegisterable, PATCH_CARROTS, Feature.RANDOM_PATCH, groundCropPatch(Blocks.CARROTS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_CAULIFLOWER, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.CAULIFLOWER));
        ConfiguredFeatures.register(featureRegisterable, PATCH_CELERY, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.CELERY));
        ConfiguredFeatures.register(featureRegisterable, PATCH_EGGPLANT, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.EGGPLANT));
        ConfiguredFeatures.register(featureRegisterable, PATCH_JALAPENOS, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.JALAPENOS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_LETTUCE, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.LETTUCE));
        ConfiguredFeatures.register(featureRegisterable, PATCH_KALE, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.KALE));
        ConfiguredFeatures.register(featureRegisterable, PATCH_ONIONS, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.ONIONS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_PARSNIPS, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.PARSNIPS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_PEAS, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.PEAS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_PEPPERS, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.PEPPERS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_POTATOES, Feature.RANDOM_PATCH, groundCropPatch(Blocks.POTATOES));
        ConfiguredFeatures.register(featureRegisterable, PATCH_RADISHES, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.RADISHES));
        ConfiguredFeatures.register(featureRegisterable, PATCH_SPINACH, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.SPINACH));
        ConfiguredFeatures.register(featureRegisterable, PATCH_TURNIPS, Feature.RANDOM_PATCH, groundCropPatch(NaturalBlocks.TURNIPS));
        ConfiguredFeatures.register(featureRegisterable, PATCH_WHEAT, Feature.RANDOM_PATCH, groundCropPatch(Blocks.WHEAT));

    RegistryEntry<PlacedFeature> patchArtichokes = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_ARTICHOKES);
    RegistryEntry<PlacedFeature> patchBeetroots = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_BEETROOTS);
    RegistryEntry<PlacedFeature> patchBroccoli = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_BROCCOLI);
    RegistryEntry<PlacedFeature> patchCabbage = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_CABBAGE);
    RegistryEntry<PlacedFeature> patchCarrots = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_CARROTS);
    RegistryEntry<PlacedFeature> patchCauliflower = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_CAULIFLOWER);
    RegistryEntry<PlacedFeature> patchCelery = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_CELERY);
    RegistryEntry<PlacedFeature> patchEggplant = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_EGGPLANT);
    RegistryEntry<PlacedFeature> patchKale = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_KALE);
    RegistryEntry<PlacedFeature> patchLettuce = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_LETTUCE);
    RegistryEntry<PlacedFeature> patchOnions = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_ONIONS);
    RegistryEntry<PlacedFeature> patchParsnips = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_PARSNIPS);
    RegistryEntry<PlacedFeature> patchPeas = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_PEAS);
    RegistryEntry<PlacedFeature> patchPeppers = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_PEPPERS);
    RegistryEntry<PlacedFeature> patchPotatoes = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_POTATOES);
    RegistryEntry<PlacedFeature> patchRadishes = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_RADISHES);
    RegistryEntry<PlacedFeature> patchSpinach = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_SPINACH);
    RegistryEntry<PlacedFeature> patchTurnips = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_TURNIPS);
    RegistryEntry<PlacedFeature> patchWheat = placedFeatureLookup.getOrThrow(OverhaulVegetationPlacedFeatures.PATCH_WHEAT);

        ConfiguredFeatures.register(featureRegisterable, PATCH_GROUND_FRUIT_COLD, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfig(
            RegistryEntryList.of(patchCabbage, patchCarrots, patchKale, patchOnions, patchPeas, patchRadishes, patchTurnips, patchParsnips)
        ));
        ConfiguredFeatures.register(featureRegisterable, PATCH_GROUND_FRUIT_COOL, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfig(
            RegistryEntryList.of(patchBroccoli, patchCauliflower, patchCelery, patchLettuce, patchPotatoes)
        ));
        ConfiguredFeatures.register(featureRegisterable, PATCH_GROUND_FRUIT_TEMPERATE, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfig(
            RegistryEntryList.of(patchArtichokes, patchSpinach, patchWheat)
        ));
        ConfiguredFeatures.register(featureRegisterable, PATCH_GROUND_FRUIT_MEDITERRANEAN, Feature.SIMPLE_RANDOM_SELECTOR, new SimpleRandomFeatureConfig(
            RegistryEntryList.of(patchBeetroots, patchEggplant, patchPeppers)
        ));
    }

    private static RandomPatchFeatureConfig groundCropPatch(Block crop) {
        return new RandomPatchFeatureConfig(
                32, 7, 3, PlacedFeatures.createEntry(
                Feature.BLOCK_COLUMN, groundCropC(crop),
                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP
                //BlockFilterPlacementModifier.of(BlockPredicate.matchingBlockTag(/*new Vec3i(0, -1, 0),*/ BlockTags.DIRT)),
                //RandomOffsetPlacementModifier.vertically(ConstantIntProvider.create(-1))
        )
        );
    }

    private static BlockColumnFeatureConfig groundCropC(Block crop) {
        return new BlockColumnFeatureConfig(
                List.of(
                        BlockColumnFeatureConfig.createLayer(ConstantIntProvider.create(1), BlockStateProvider.of(Blocks.DIAMOND_BLOCK)),
                        BlockColumnFeatureConfig.createLayer(ConstantIntProvider.create(1), BlockStateProvider.of(Blocks.END_ROD))
                ),
                Direction.UP,
                BlockPredicate.matchingBlockTag(new Vec3i(0, -1, 0), BlockTags.DIRT),
                false
        );
    }

    private static TreeFeatureConfig groundCropT(Block crop) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.WHEAT),
                new StraightTrunkPlacer(1, 0, 0),
                BlockStateProvider.of(Blocks.AIR),
                new BushFoliagePlacer(ConstantIntProvider.ZERO, ConstantIntProvider.ZERO, 0),
                new TwoLayersFeatureSize(1, 1, 1)
        ).dirtProvider(BlockStateProvider.of(Blocks.FARMLAND)).build();
    }

    // * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private static Pool.Builder<BlockState> flowerbed(Block flowerbed) {
        return segmentedBlock(flowerbed, 1, 4, FlowerbedBlock.FLOWER_AMOUNT, FlowerbedBlock.HORIZONTAL_FACING);
    }

    private static Pool.Builder<BlockState> segmentedBlock(Block block, int min, int max, IntProperty amountProperty, EnumProperty<Direction> facingProperty) {
        Pool.Builder<BlockState> builder = Pool.builder();

        for (int i = min; i <= max; i++) for (Direction direction : Direction.Type.HORIZONTAL)
            builder.add(block.getDefaultState().with(amountProperty, i).with(facingProperty, direction), 1);

        return builder;
    }
}
