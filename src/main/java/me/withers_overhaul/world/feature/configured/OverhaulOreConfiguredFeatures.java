package me.withers_overhaul.world.feature.configured;

import me.withers_overhaul.registry.block.StoneBlocks;
import me.withers_overhaul.world.feature.OverhaulConfiguredFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class OverhaulOreConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_COAL = OverhaulConfiguredFeatures.of("ore_coal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_COAL_BURIED = OverhaulConfiguredFeatures.of("ore_coal_buried");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_IRON = OverhaulConfiguredFeatures.of("ore_iron");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_IRON_SMALL = OverhaulConfiguredFeatures.of("ore_iron_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_COPPER_LARGE = OverhaulConfiguredFeatures.of("ore_copper_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_COPPER_SMALL = OverhaulConfiguredFeatures.of("ore_copper_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_GOLD = OverhaulConfiguredFeatures.of("ore_gold");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_GOLD_BURIED = OverhaulConfiguredFeatures.of("ore_gold_buried");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_EMERALD = OverhaulConfiguredFeatures.of("ore_emerald");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_REDSTONE = OverhaulConfiguredFeatures.of("ore_redstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_LAPIS = OverhaulConfiguredFeatures.of("ore_lapis");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_LAPIS_BURIED = OverhaulConfiguredFeatures.of("ore_lapis_buried");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_SMALL = OverhaulConfiguredFeatures.of("ore_diamond_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_MEDIUM = OverhaulConfiguredFeatures.of("ore_diamond_medium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_LARGE = OverhaulConfiguredFeatures.of("ore_diamond_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_DIAMOND_BURIED = OverhaulConfiguredFeatures.of("ore_diamond_buried");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stone = new BlockMatchRuleTest(Blocks.STONE);
        RuleTest deepslate = new BlockMatchRuleTest(Blocks.DEEPSLATE);
        RuleTest granite = new BlockMatchRuleTest(Blocks.GRANITE);
        RuleTest diorite = new BlockMatchRuleTest(Blocks.DIORITE);
        RuleTest andesite = new BlockMatchRuleTest(Blocks.ANDESITE);
        RuleTest tuff = new BlockMatchRuleTest(Blocks.TUFF);
        RuleTest gneiss = new BlockMatchRuleTest(StoneBlocks.GNEISS);
        RuleTest shale = new BlockMatchRuleTest(StoneBlocks.SHALE);
        RuleTest limestone = new BlockMatchRuleTest(StoneBlocks.LIMESTONE);
        RuleTest marble = new BlockMatchRuleTest(StoneBlocks.MARBLE);
        RuleTest gabbro = new BlockMatchRuleTest(StoneBlocks.GABBRO);
        RuleTest phyllite = new BlockMatchRuleTest(StoneBlocks.PHYLLITE);

        List<OreFeatureConfig.Target> coal = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_COAL_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_COAL_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> iron = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_IRON_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_IRON_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> copper = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_COPPER_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_COPPER_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> gold = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_GOLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_GOLD_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> emerald = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_EMERALD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_EMERALD_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> redstone = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_REDSTONE_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_REDSTONE_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> lapis = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_LAPIS_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_LAPIS_ORE.getDefaultState())
        );
        List<OreFeatureConfig.Target> diamond = List.of(
                OreFeatureConfig.createTarget(stone, Blocks.DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslate, Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(granite, StoneBlocks.GRANITE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(diorite, StoneBlocks.DIORITE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(andesite, StoneBlocks.ANDESITE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(tuff, StoneBlocks.TUFF_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gneiss, StoneBlocks.GNEISS_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(shale, StoneBlocks.SHALE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(limestone, StoneBlocks.LIMESTONE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(marble, StoneBlocks.MARBLE_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(gabbro, StoneBlocks.GABBRO_DIAMOND_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(phyllite, StoneBlocks.PHYLLITE_DIAMOND_ORE.getDefaultState())
        );

        ConfiguredFeatures.register(featureRegisterable, ORE_COAL, Feature.ORE, new OreFeatureConfig(coal, 17));
        ConfiguredFeatures.register(featureRegisterable, ORE_COAL_BURIED, Feature.ORE, new OreFeatureConfig(coal, 17, 0.5F));
        ConfiguredFeatures.register(featureRegisterable, ORE_IRON, Feature.ORE, new OreFeatureConfig(iron, 9));
        ConfiguredFeatures.register(featureRegisterable, ORE_IRON_SMALL, Feature.ORE, new OreFeatureConfig(iron, 4));
        ConfiguredFeatures.register(featureRegisterable, ORE_COPPER_LARGE, Feature.ORE, new OreFeatureConfig(copper, 20));
        ConfiguredFeatures.register(featureRegisterable, ORE_COPPER_SMALL, Feature.ORE, new OreFeatureConfig(copper, 10));
        ConfiguredFeatures.register(featureRegisterable, ORE_GOLD, Feature.ORE, new OreFeatureConfig(gold, 9));
        ConfiguredFeatures.register(featureRegisterable, ORE_GOLD_BURIED, Feature.ORE, new OreFeatureConfig(gold, 9, 0.5F));
        ConfiguredFeatures.register(featureRegisterable, ORE_EMERALD, Feature.ORE, new OreFeatureConfig(emerald, 3));
        ConfiguredFeatures.register(featureRegisterable, ORE_REDSTONE, Feature.ORE, new OreFeatureConfig(redstone, 8));
        ConfiguredFeatures.register(featureRegisterable, ORE_LAPIS, Feature.ORE, new OreFeatureConfig(lapis, 7));
        ConfiguredFeatures.register(featureRegisterable, ORE_LAPIS_BURIED, Feature.ORE, new OreFeatureConfig(lapis, 7, 1.0F));
        ConfiguredFeatures.register(featureRegisterable, ORE_DIAMOND_SMALL, Feature.ORE, new OreFeatureConfig(diamond, 4, 0.5F));
        ConfiguredFeatures.register(featureRegisterable, ORE_DIAMOND_MEDIUM, Feature.ORE, new OreFeatureConfig(diamond, 8, 0.5F));
        ConfiguredFeatures.register(featureRegisterable, ORE_DIAMOND_LARGE, Feature.ORE, new OreFeatureConfig(diamond, 12, 0.7F));
        ConfiguredFeatures.register(featureRegisterable, ORE_DIAMOND_BURIED, Feature.ORE, new OreFeatureConfig(diamond, 8, 1.0F));
    }
}
