package me.withers_overhaul.world.feature.placed;

import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.world.feature.configured.OverhaulTreeConfiguredFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

import static me.withers_overhaul.world.feature.OverhaulPlacedFeatures.of;
import static net.minecraft.world.gen.feature.PlacedFeatures.wouldSurvive;

public class OverhaulTreePlacedFeatures {public static final RegistryKey<PlacedFeature> MAPLE = of("maple");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE = of("fancy_maple");
    public static final RegistryKey<PlacedFeature> POPLAR = of("poplar");
    public static final RegistryKey<PlacedFeature> BEECH = of("beech");
    public static final RegistryKey<PlacedFeature> CEDAR = of("cedar");
    public static final RegistryKey<PlacedFeature> CEDAR_FLAT = of("cedar_flat");
    public static final RegistryKey<PlacedFeature> MEGA_CEDAR = of("mega_cedar");
    public static final RegistryKey<PlacedFeature> MEGA_CEDAR_FLAT = of("mega_cedar_flat");
    public static final RegistryKey<PlacedFeature> REDWOOD = of("redwood");
    public static final RegistryKey<PlacedFeature> FIR = of("fir");
    public static final RegistryKey<PlacedFeature> MEGA_FIR = of("mega_fir");
    public static final RegistryKey<PlacedFeature> HEMLOCK = of("hemlock");
    public static final RegistryKey<PlacedFeature> MEGA_HEMLOCK = of("mega_hemlock");
    public static final RegistryKey<PlacedFeature> HOLLY = of("holly");
    public static final RegistryKey<PlacedFeature> PINE = of("pine");
    public static final RegistryKey<PlacedFeature> PINE_TOP = of("pine_top");
    public static final RegistryKey<PlacedFeature> PINE_TALL = of("pine_tall");
    public static final RegistryKey<PlacedFeature> PINE_TOP_TALL = of("pine_top_tall");
    public static final RegistryKey<PlacedFeature> LARCH = of("larch");
    public static final RegistryKey<PlacedFeature> LARCH_TOP = of("larch_top");
    public static final RegistryKey<PlacedFeature> LARCH_TALL = of("larch_tall");
    public static final RegistryKey<PlacedFeature> LARCH_TOP_TALL = of("larch_top_tall");
    public static final RegistryKey<PlacedFeature> ASPEN = of("aspen");
    public static final RegistryKey<PlacedFeature> KAPOK = of("kapok");
    public static final RegistryKey<PlacedFeature> MAHOGANY = of("mahogany");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS = of("eucalyptus");
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH = of("acacia_bush");
    public static final RegistryKey<PlacedFeature> BAOBAB = of("baobab");
    public static final RegistryKey<PlacedFeature> PALO_VERDE = of("palo_verde");
    public static final RegistryKey<PlacedFeature> JOSHUA = of("joshua");
    public static final RegistryKey<PlacedFeature> JUNIPER = of("juniper");
    public static final RegistryKey<PlacedFeature> PALM = of("palm");
    public static final RegistryKey<PlacedFeature> EBONY = of("ebony");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY = of("mega_ebony");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH = of("ebony_bush");
    public static final RegistryKey<PlacedFeature> TEAK = of("teak");
    public static final RegistryKey<PlacedFeature> ELM = of("elm");
    public static final RegistryKey<PlacedFeature> WILLOW = of("willow");
    public static final RegistryKey<PlacedFeature> CYPRESS = of("cypress");
    public static final RegistryKey<PlacedFeature> SAKURA = of("sakura");
    public static final RegistryKey<PlacedFeature> MAGNOLIA = of("magnolia");
    public static final RegistryKey<PlacedFeature> FLOWERING_MAGNOLIA = of("flowering_magnolia");
    public static final RegistryKey<PlacedFeature> JACARANDA = of("jacaranda");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> maple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMaple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> poplar = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR);
        RegistryEntry<ConfiguredFeature<?, ?>> beech = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH);
        /*RegistryEntry<ConfiguredFeature<?, ?>> hickory = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY);
        RegistryEntry<ConfiguredFeature<?, ?>> walnut = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT);
        RegistryEntry<ConfiguredFeature<?, ?>> chestnut = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT);*/
        RegistryEntry<ConfiguredFeature<?, ?>> cedar = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CEDAR);
        RegistryEntry<ConfiguredFeature<?, ?>> cedarFlat = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CEDAR_FLAT);
        RegistryEntry<ConfiguredFeature<?, ?>> megaCedar = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_CEDAR);
        RegistryEntry<ConfiguredFeature<?, ?>> megaCedarFlat = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_CEDAR_FLAT);
        RegistryEntry<ConfiguredFeature<?, ?>> redwood = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.REDWOOD);
        RegistryEntry<ConfiguredFeature<?, ?>> fir = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FIR);
        RegistryEntry<ConfiguredFeature<?, ?>> megaFir = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_FIR);
        RegistryEntry<ConfiguredFeature<?, ?>> hemlock = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HEMLOCK);
        RegistryEntry<ConfiguredFeature<?, ?>> megaHemlock = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_HEMLOCK);
        RegistryEntry<ConfiguredFeature<?, ?>> holly = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HOLLY);
        RegistryEntry<ConfiguredFeature<?, ?>> pine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PINE);
        RegistryEntry<ConfiguredFeature<?, ?>> pineTop = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PINE_TOP);
        RegistryEntry<ConfiguredFeature<?, ?>> pineTall = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PINE_TALL);
        RegistryEntry<ConfiguredFeature<?, ?>> pineTopTall = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PINE_TOP_TALL);
        RegistryEntry<ConfiguredFeature<?, ?>> larch = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.LARCH);
        RegistryEntry<ConfiguredFeature<?, ?>> larchTop = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.LARCH_TOP);
        RegistryEntry<ConfiguredFeature<?, ?>> larchTall = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.LARCH_TALL);
        RegistryEntry<ConfiguredFeature<?, ?>> larchTopTall = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.LARCH_TOP_TALL);
        RegistryEntry<ConfiguredFeature<?, ?>> aspen = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ASPEN);
        /*RegistryEntry<ConfiguredFeature<?, ?>> kapok = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK);
        RegistryEntry<ConfiguredFeature<?, ?>> mahogany = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptus = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS);*/
        RegistryEntry<ConfiguredFeature<?, ?>> acaciaBush = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA_BUSH);
        //RegistryEntry<ConfiguredFeature<?, ?>> baobab = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BAOBAB);
        RegistryEntry<ConfiguredFeature<?, ?>> paloVerde = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALO_VERDE);
        /*RegistryEntry<ConfiguredFeature<?, ?>> joshua = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JOSHUA);
        RegistryEntry<ConfiguredFeature<?, ?>> juniper = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JUNIPER);
        RegistryEntry<ConfiguredFeature<?, ?>> palm = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALM);*/
        RegistryEntry<ConfiguredFeature<?, ?>> ebony = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbony = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBush = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH);
        RegistryEntry<ConfiguredFeature<?, ?>> teak = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK);
        RegistryEntry<ConfiguredFeature<?, ?>> elm = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM);
        /*RegistryEntry<ConfiguredFeature<?, ?>> willow = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WILLOW);
        RegistryEntry<ConfiguredFeature<?, ?>> cypress = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CYPRESS);
        RegistryEntry<ConfiguredFeature<?, ?>> sakura = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.SAKURA);*/
        RegistryEntry<ConfiguredFeature<?, ?>> magnolia = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAGNOLIA);
        RegistryEntry<ConfiguredFeature<?, ?>> floweringMagnolia = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FLOWERING_MAGNOLIA);
        RegistryEntry<ConfiguredFeature<?, ?>> jacaranda = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JACARANDA);

        PlacedFeatures.register(featureRegisterable, MAPLE, maple, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE, fancyMaple, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR, poplar, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH, beech, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, HICKORY, pine, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, WALNUT, pine, wouldSurvive(NaturalBlocks.WALNUT_SAPLING));
        PlacedFeatures.register(featureRegisterable, CHESTNUT, pine, wouldSurvive(NaturalBlocks.CHESTNUT_SAPLING));*/
        PlacedFeatures.register(featureRegisterable, CEDAR, cedar, wouldSurvive(NaturalBlocks.CEDAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, CEDAR_FLAT, cedarFlat, wouldSurvive(NaturalBlocks.CEDAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_CEDAR, megaCedar, wouldSurvive(NaturalBlocks.CEDAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_CEDAR_FLAT, megaCedarFlat, wouldSurvive(NaturalBlocks.CEDAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, REDWOOD, redwood, wouldSurvive(NaturalBlocks.REDWOOD_SAPLING));
        PlacedFeatures.register(featureRegisterable, FIR, fir, wouldSurvive(NaturalBlocks.FIR_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_FIR, megaFir, wouldSurvive(NaturalBlocks.FIR_SAPLING));
        PlacedFeatures.register(featureRegisterable, HEMLOCK, hemlock, wouldSurvive(NaturalBlocks.HEMLOCK_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_HEMLOCK, megaHemlock, wouldSurvive(NaturalBlocks.HEMLOCK_SAPLING));
        PlacedFeatures.register(featureRegisterable, HOLLY, holly, wouldSurvive(NaturalBlocks.HOLLY_SAPLING));
        PlacedFeatures.register(featureRegisterable, PINE, pine, wouldSurvive(NaturalBlocks.PINE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PINE_TOP, pineTop, wouldSurvive(NaturalBlocks.PINE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PINE_TALL, pineTall, wouldSurvive(NaturalBlocks.PINE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PINE_TOP_TALL, pineTopTall, wouldSurvive(NaturalBlocks.PINE_SAPLING));
        PlacedFeatures.register(featureRegisterable, LARCH, larch, wouldSurvive(NaturalBlocks.LARCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, LARCH_TOP, larchTop, wouldSurvive(NaturalBlocks.LARCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, LARCH_TALL, larchTall, wouldSurvive(NaturalBlocks.LARCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, LARCH_TOP_TALL, larchTopTall, wouldSurvive(NaturalBlocks.LARCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, ASPEN, aspen, wouldSurvive(NaturalBlocks.ASPEN_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, KAPOK, kapok, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY, mahogany, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS, eucalyptus, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));*/
        PlacedFeatures.register(featureRegisterable, ACACIA_BUSH, acaciaBush, wouldSurvive(Blocks.ACACIA_SAPLING));
        //PlacedFeatures.register(featureRegisterable, BAOBAB, baobab, wouldSurvive(NaturalBlocks.BAOBAB_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALO_VERDE, paloVerde, wouldSurvive(NaturalBlocks.PALO_VERDE_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, JOSHUA, joshua, wouldSurvive(NaturalBlocks.JOSHUA_SAPLING));
        PlacedFeatures.register(featureRegisterable, JUNIPER, juniper, wouldSurvive(NaturalBlocks.JUNIPER_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALM, palm, wouldSurvive(NaturalBlocks.PALM_SAPLING));*/
        PlacedFeatures.register(featureRegisterable, EBONY, ebony, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY, megaEbony, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH, ebonyBush, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK, teak, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM, elm, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, WILLOW, willow, wouldSurvive(NaturalBlocks.WILLOW_SAPLING));
        PlacedFeatures.register(featureRegisterable, CYPRESS, cypress, wouldSurvive(NaturalBlocks.CYPRESS_SAPLING));
        PlacedFeatures.register(featureRegisterable, SAKURA, sakura, wouldSurvive(NaturalBlocks.SAKURA_SAPLING));*/
        PlacedFeatures.register(featureRegisterable, MAGNOLIA, magnolia, wouldSurvive(NaturalBlocks.MAGNOLIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, FLOWERING_MAGNOLIA, floweringMagnolia, wouldSurvive(NaturalBlocks.MAGNOLIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, JACARANDA, jacaranda, wouldSurvive(NaturalBlocks.JACARANDA_SAPLING));
    }
}
