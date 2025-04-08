package me.withers_overhaul.world.feature.placed;

import me.withers_overhaul.world.feature.OverhaulPlacedFeatures;
import me.withers_overhaul.world.feature.configured.OverhaulOreConfiguredFeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class OverhaulOrePlacedFeatures {
    public static final RegistryKey<PlacedFeature> ORE_COAL_UPPER = OverhaulPlacedFeatures.of("ore_coal_upper");
    public static final RegistryKey<PlacedFeature> ORE_COAL_LOWER = OverhaulPlacedFeatures.of("ore_coal_lower");
    public static final RegistryKey<PlacedFeature> ORE_IRON_SMALL = OverhaulPlacedFeatures.of("ore_iron_small");
    public static final RegistryKey<PlacedFeature> ORE_IRON_MIDDLE = OverhaulPlacedFeatures.of("ore_iron_middle");
    public static final RegistryKey<PlacedFeature> ORE_IRON_UPPER = OverhaulPlacedFeatures.of("ore_iron_upper");
    public static final RegistryKey<PlacedFeature> ORE_COPPER = OverhaulPlacedFeatures.of("ore_copper");
    public static final RegistryKey<PlacedFeature> ORE_COPPER_LARGE = OverhaulPlacedFeatures.of("ore_copper_large");
    public static final RegistryKey<PlacedFeature> ORE_GOLD = OverhaulPlacedFeatures.of("ore_gold");
    public static final RegistryKey<PlacedFeature> ORE_GOLD_EXTRA = OverhaulPlacedFeatures.of("ore_gold_extra");
    public static final RegistryKey<PlacedFeature> ORE_GOLD_LOWER = OverhaulPlacedFeatures.of("ore_gold_lower");
    public static final RegistryKey<PlacedFeature> ORE_EMERALD = OverhaulPlacedFeatures.of("ore_emerald");
    public static final RegistryKey<PlacedFeature> ORE_REDSTONE = OverhaulPlacedFeatures.of("ore_redstone");
    public static final RegistryKey<PlacedFeature> ORE_REDSTONE_LOWER = OverhaulPlacedFeatures.of("ore_redstone_lower");
    public static final RegistryKey<PlacedFeature> ORE_LAPIS = OverhaulPlacedFeatures.of("ore_lapis");
    public static final RegistryKey<PlacedFeature> ORE_LAPIS_BURIED = OverhaulPlacedFeatures.of("ore_lapis_buried");
    public static final RegistryKey<PlacedFeature> ORE_DIAMOND = OverhaulPlacedFeatures.of("ore_diamond");
    public static final RegistryKey<PlacedFeature> ORE_DIAMOND_BURIED = OverhaulPlacedFeatures.of("ore_diamond_buried");
    public static final RegistryKey<PlacedFeature> ORE_DIAMOND_MEDIUM = OverhaulPlacedFeatures.of("ore_diamond_medium");
    public static final RegistryKey<PlacedFeature> ORE_DIAMOND_LARGE = OverhaulPlacedFeatures.of("ore_diamond_large");

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntry<ConfiguredFeature<?, ?>> coalUpper = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_COAL);
        RegistryEntry<ConfiguredFeature<?, ?>> coalLower = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_COAL_BURIED);
        RegistryEntry<ConfiguredFeature<?, ?>> ironSmall = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_IRON_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> iron = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_IRON);
        RegistryEntry<ConfiguredFeature<?, ?>> copper = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_COPPER_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> copperLarge = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_COPPER_LARGE);
        RegistryEntry<ConfiguredFeature<?, ?>> gold = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_GOLD_BURIED);
        RegistryEntry<ConfiguredFeature<?, ?>> goldExtra = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_GOLD);
        RegistryEntry<ConfiguredFeature<?, ?>> emerald = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_EMERALD);
        RegistryEntry<ConfiguredFeature<?, ?>> redstone = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_REDSTONE);
        RegistryEntry<ConfiguredFeature<?, ?>> lapis = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_LAPIS);
        RegistryEntry<ConfiguredFeature<?, ?>> lapisBuried = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_LAPIS_BURIED);
        RegistryEntry<ConfiguredFeature<?, ?>> diamond = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_DIAMOND_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> diamondBuried = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_DIAMOND_BURIED);
        RegistryEntry<ConfiguredFeature<?, ?>> diamondMedium = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_DIAMOND_MEDIUM);
        RegistryEntry<ConfiguredFeature<?, ?>> diamondLarge = registryEntryLookup.getOrThrow(OverhaulOreConfiguredFeatures.ORE_DIAMOND_LARGE);

        PlacedFeatures.register(
                featureRegisterable, ORE_COAL_UPPER, coalUpper, modifiersWithCount(30, HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.getTop()))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_COAL_LOWER, coalLower, modifiersWithCount(20, HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_IRON_UPPER, iron, modifiersWithCount(90, HeightRangePlacementModifier.trapezoid(YOffset.fixed(80), YOffset.fixed(384)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_IRON_MIDDLE, iron, modifiersWithCount(10, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_IRON_SMALL, ironSmall, modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(72)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_GOLD_EXTRA, goldExtra, modifiersWithCount(50, HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(256)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_GOLD, gold, modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_GOLD_LOWER, gold,
                modifiers(CountPlacementModifier.of(UniformIntProvider.create(0, 1)), HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-48)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_REDSTONE, redstone, modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(15)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_REDSTONE_LOWER, redstone,
                modifiersWithCount(8, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_DIAMOND, diamond,
                modifiersWithCount(7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_DIAMOND_MEDIUM, diamondMedium, modifiersWithCount(2, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_DIAMOND_LARGE, diamondLarge,
                modifiersWithRarity(9, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_DIAMOND_BURIED, diamondBuried,
                modifiersWithCount(4, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_LAPIS, lapis, modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(32)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_LAPIS_BURIED, lapisBuried, modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_EMERALD, emerald, modifiersWithCount(100, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_COPPER, copper, modifiersWithCount(16, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112)))
        );
        PlacedFeatures.register(
                featureRegisterable, ORE_COPPER_LARGE, copperLarge,
                modifiersWithCount(16, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112)))
        );
    }
}
