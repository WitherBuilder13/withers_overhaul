package me.withers_overhaul.world.feature.placed.vegetation;

import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.world.feature.configured.vegetation.OverhaulTreeConfiguredFeatures;
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

public class OverhaulTreePlacedFeatures {
    public static final RegistryKey<PlacedFeature> OAK = of("oak");

    public static final RegistryKey<PlacedFeature> FANCY_OAK = of("fancy_oak");

    public static final RegistryKey<PlacedFeature> MAPLE = of("maple");
    public static final RegistryKey<PlacedFeature> MAPLE_APPLE = of("maple_apple");
    public static final RegistryKey<PlacedFeature> MAPLE_APRICOT = of("maple_apricot");
    public static final RegistryKey<PlacedFeature> MAPLE_KIWI = of("maple_kiwi");
    public static final RegistryKey<PlacedFeature> MAPLE_NECTARINE = of("maple_nectarine");
    public static final RegistryKey<PlacedFeature> MAPLE_PEACH = of("maple_peach");
    public static final RegistryKey<PlacedFeature> MAPLE_PEAR = of("maple_pear");
    public static final RegistryKey<PlacedFeature> MAPLE_PLUM = of("maple_plum");
    
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE = of("fancy_maple");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_APPLE = of("fancy_maple_apple");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_APRICOT = of("fancy_maple_apricot");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_KIWI = of("fancy_maple_kiwi");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_NECTARINE = of("fancy_maple_nectarine");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_PEACH = of("fancy_maple_peach");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_PEAR = of("fancy_maple_pear");
    public static final RegistryKey<PlacedFeature> FANCY_MAPLE_PLUM = of("fancy_maple_plum");
    
    public static final RegistryKey<PlacedFeature> POPLAR = of("poplar");
    public static final RegistryKey<PlacedFeature> POPLAR_APPLE = of("poplar_apple");
    public static final RegistryKey<PlacedFeature> POPLAR_APRICOT = of("poplar_apricot");
    public static final RegistryKey<PlacedFeature> POPLAR_KIWI = of("poplar_kiwi");
    public static final RegistryKey<PlacedFeature> POPLAR_NECTARINE = of("poplar_nectarine");
    public static final RegistryKey<PlacedFeature> POPLAR_PEACH = of("poplar_peach");
    public static final RegistryKey<PlacedFeature> POPLAR_PEAR = of("poplar_pear");
    public static final RegistryKey<PlacedFeature> POPLAR_PLUM = of("poplar_plum");
    
    public static final RegistryKey<PlacedFeature> BEECH = of("beech");
    public static final RegistryKey<PlacedFeature> BEECH_APPLE = of("beech_apple");
    public static final RegistryKey<PlacedFeature> BEECH_APRICOT = of("beech_apricot");
    public static final RegistryKey<PlacedFeature> BEECH_KIWI = of("beech_kiwi");
    public static final RegistryKey<PlacedFeature> BEECH_NECTARINE = of("beech_nectarine");
    public static final RegistryKey<PlacedFeature> BEECH_PEACH = of("beech_peach");
    public static final RegistryKey<PlacedFeature> BEECH_PEAR = of("beech_pear");
    public static final RegistryKey<PlacedFeature> BEECH_PLUM = of("beech_plum");
    
    public static final RegistryKey<PlacedFeature> HICKORY = of("hickory");
    public static final RegistryKey<PlacedFeature> HICKORY_CHERRY = of("hickory_cherry");
    public static final RegistryKey<PlacedFeature> HICKORY_FIG = of("hickory_fig");
    public static final RegistryKey<PlacedFeature> HICKORY_GRAPEFRUIT = of("hickory_grapefruit");
    public static final RegistryKey<PlacedFeature> HICKORY_GUAVA = of("hickory_guava");
    public static final RegistryKey<PlacedFeature> HICKORY_TANGERINE = of("hickory_tangerine");
    
    public static final RegistryKey<PlacedFeature> HICKORY_BUSH = of("hickory_bush");
    public static final RegistryKey<PlacedFeature> HICKORY_BUSH_CHERRY = of("hickory_bush_cherry");
    public static final RegistryKey<PlacedFeature> HICKORY_BUSH_FIG = of("hickory_bush_fig");
    public static final RegistryKey<PlacedFeature> HICKORY_BUSH_GRAPEFRUIT = of("hickory_bush_grapefruit");
    public static final RegistryKey<PlacedFeature> HICKORY_BUSH_GUAVA = of("hickory_bush_guava");
    public static final RegistryKey<PlacedFeature> HICKORY_BUSH_TANGERINE = of("hickory_bush_tangerine");
    
    /*public static final RegistryKey<PlacedFeature> WALNUT = of("walnut");
    public static final RegistryKey<PlacedFeature> WALNUT_CHERRY = of("walnut_cherry");
    public static final RegistryKey<PlacedFeature> WALNUT_FIG = of("walnut_fig");
    public static final RegistryKey<PlacedFeature> WALNUT_GRAPEFRUIT = of("walnut_grapefruit");
    public static final RegistryKey<PlacedFeature> WALNUT_GUAVA = of("walnut_guava");
    public static final RegistryKey<PlacedFeature> WALNUT_TANGERINE = of("walnut_tangerine");
    
    public static final RegistryKey<PlacedFeature> CHESTNUT = of("chestnut");
    public static final RegistryKey<PlacedFeature> CHESTNUT_CHERRY = of("chestnut_cherry");
    public static final RegistryKey<PlacedFeature> CHESTNUT_FIG = of("chestnut_fig");
    public static final RegistryKey<PlacedFeature> CHESTNUT_GRAPEFRUIT = of("chestnut_grapefruit");
    public static final RegistryKey<PlacedFeature> CHESTNUT_GUAVA = of("chestnut_guava");
    public static final RegistryKey<PlacedFeature> CHESTNUT_TANGERINE = of("chestnut_tangerine");*/

    public static final RegistryKey<PlacedFeature> SPRUCE = of("spruce");
    public static final RegistryKey<PlacedFeature> SPRUCE_TOP = of("spruce_top");
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

    public static final RegistryKey<PlacedFeature> BIRCH = of("birch");
    public static final RegistryKey<PlacedFeature> BIRCH_TALL = of("birch_tall");
    public static final RegistryKey<PlacedFeature> ASPEN = of("aspen");
    public static final RegistryKey<PlacedFeature> PALE_OAK = of("pale_oak");
    public static final RegistryKey<PlacedFeature> PALE_OAK_CREAKING = of("pale_oak_creaking");

    public static final RegistryKey<PlacedFeature> JUNGLE = of("jungle");
    public static final RegistryKey<PlacedFeature> MEGA_JUNGLE = of("mega_jungle");
    
    /*public static final RegistryKey<PlacedFeature> KAPOK = of("kapok");
    public static final RegistryKey<PlacedFeature> KAPOK_AVOCADO = of("kapok_avocado");
    public static final RegistryKey<PlacedFeature> KAPOK_BANANA = of("kapok_banana");
    public static final RegistryKey<PlacedFeature> KAPOK_LEMON = of("kapok_lemon");
    public static final RegistryKey<PlacedFeature> KAPOK_LIME = of("kapok_lime");
    public static final RegistryKey<PlacedFeature> KAPOK_MANGO = of("kapok_mango");
    public static final RegistryKey<PlacedFeature> KAPOK_ORANGE = of("kapok_orange");
    public static final RegistryKey<PlacedFeature> KAPOK_STARFRUIT = of("kapok_starfruit");
    
    public static final RegistryKey<PlacedFeature> MAHOGANY = of("mahogany");
    public static final RegistryKey<PlacedFeature> MAHOGANY_AVOCADO = of("mahogany_avocado");
    public static final RegistryKey<PlacedFeature> MAHOGANY_BANANA = of("mahogany_banana");
    public static final RegistryKey<PlacedFeature> MAHOGANY_LEMON = of("mahogany_lemon");
    public static final RegistryKey<PlacedFeature> MAHOGANY_LIME = of("mahogany_lime");
    public static final RegistryKey<PlacedFeature> MAHOGANY_MANGO = of("mahogany_mango");
    public static final RegistryKey<PlacedFeature> MAHOGANY_ORANGE = of("mahogany_orange");
    public static final RegistryKey<PlacedFeature> MAHOGANY_STARFRUIT = of("mahogany_starfruit");
    
    public static final RegistryKey<PlacedFeature> EUCALYPTUS = of("eucalyptus");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_AVOCADO = of("eucalyptus_avocado");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_BANANA = of("eucalyptus_banana");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_LEMON = of("eucalyptus_lemon");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_LIME = of("eucalyptus_lime");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_MANGO = of("eucalyptus_mango");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_ORANGE = of("eucalyptus_orange");
    public static final RegistryKey<PlacedFeature> EUCALYPTUS_STARFRUIT = of("eucalyptus_starfruit");*/

    public static final RegistryKey<PlacedFeature> ACACIA = of("acacia");
    
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH = of("acacia_bush");
    /*public static final RegistryKey<PlacedFeature> ACACIA_BUSH_KUMQUAT = of("acacia_bush_kumquat");
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH_OLIVE = of("acacia_bush_olive");
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH_PERSIMMON = of("acacia_bush_persimmon");
    public static final RegistryKey<PlacedFeature> ACACIA_BUSH_POMEGRANATE = of("acacia_bush_pomegranate");*/
    
    public static final RegistryKey<PlacedFeature> BAOBAB = of("baobab");
    /*public static final RegistryKey<PlacedFeature> BAOBAB_KUMQUAT = of("baobab_kumquat");
    public static final RegistryKey<PlacedFeature> BAOBAB_OLIVE = of("baobab_olive");
    public static final RegistryKey<PlacedFeature> BAOBAB_PERSIMMON = of("baobab_persimmon");
    public static final RegistryKey<PlacedFeature> BAOBAB_POMEGRANATE = of("baobab_pomegranate");*/
    
    public static final RegistryKey<PlacedFeature> PALO_VERDE = of("palo_verde");
    public static final RegistryKey<PlacedFeature> PALO_VERDE_KUMQUAT = of("palo_verde_kumquat");
    public static final RegistryKey<PlacedFeature> PALO_VERDE_OLIVE = of("palo_verde_olive");
    public static final RegistryKey<PlacedFeature> PALO_VERDE_PERSIMMON = of("palo_verde_persimmon");
    public static final RegistryKey<PlacedFeature> PALO_VERDE_POMEGRANATE = of("palo_verde_pomegranate");
    
    /*public static final RegistryKey<PlacedFeature> JOSHUA = of("joshua");
    public static final RegistryKey<PlacedFeature> JOSHUA_DATE = of("joshua_date");
    
    public static final RegistryKey<PlacedFeature> JUNIPER = of("juniper");
    public static final RegistryKey<PlacedFeature> JUNIPER_DATE = of("juniper_date");
    
    public static final RegistryKey<PlacedFeature> PALM = of("palm");*/

    public static final RegistryKey<PlacedFeature> DARK_OAK = of("dark_oak");
    public static final RegistryKey<PlacedFeature> DARK_OAK_LEAF_LITTER = of("dark_oak_leaf_litter");
    public static final RegistryKey<PlacedFeature> DARK_OAK_SMALL = of("dark_oak_small");
    public static final RegistryKey<PlacedFeature> DARK_OAK_SMALL_LEAF_LITTER = of("dark_oak_small_leaf_litter");
    
    public static final RegistryKey<PlacedFeature> EBONY = of("ebony");
    public static final RegistryKey<PlacedFeature> EBONY_APPLE = of("ebony_apple");
    public static final RegistryKey<PlacedFeature> EBONY_APRICOT = of("ebony_apricot");
    public static final RegistryKey<PlacedFeature> EBONY_KIWI = of("ebony_kiwi");
    public static final RegistryKey<PlacedFeature> EBONY_NECTARINE = of("ebony_nectarine");
    public static final RegistryKey<PlacedFeature> EBONY_PEACH = of("ebony_peach");
    public static final RegistryKey<PlacedFeature> EBONY_PEAR = of("ebony_pear");
    public static final RegistryKey<PlacedFeature> EBONY_PLUM = of("ebony_plum");
    
    public static final RegistryKey<PlacedFeature> MEGA_EBONY = of("mega_ebony");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_APPLE = of("mega_ebony_apple");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_APRICOT = of("mega_ebony_apricot");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_KIWI = of("mega_ebony_kiwi");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_NECTARINE = of("mega_ebony_nectarine");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_PEACH = of("mega_ebony_peach");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_PEAR = of("mega_ebony_pear");
    public static final RegistryKey<PlacedFeature> MEGA_EBONY_PLUM = of("mega_ebony_plum");
    
    public static final RegistryKey<PlacedFeature> EBONY_BUSH = of("ebony_bush");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_APPLE = of("ebony_bush_apple");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_APRICOT = of("ebony_bush_apricot");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_KIWI = of("ebony_bush_kiwi");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_NECTARINE = of("ebony_bush_nectarine");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_PEACH = of("ebony_bush_peach");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_PEAR = of("ebony_bush_pear");
    public static final RegistryKey<PlacedFeature> EBONY_BUSH_PLUM = of("ebony_bush_plum");
    
    public static final RegistryKey<PlacedFeature> TEAK = of("teak");
    public static final RegistryKey<PlacedFeature> TEAK_APPLE = of("teak_apple");
    public static final RegistryKey<PlacedFeature> TEAK_APRICOT = of("teak_apricot");
    public static final RegistryKey<PlacedFeature> TEAK_KIWI = of("teak_kiwi");
    public static final RegistryKey<PlacedFeature> TEAK_NECTARINE = of("teak_nectarine");
    public static final RegistryKey<PlacedFeature> TEAK_PEACH = of("teak_peach");
    public static final RegistryKey<PlacedFeature> TEAK_PEAR = of("teak_pear");
    public static final RegistryKey<PlacedFeature> TEAK_PLUM = of("teak_plum");
    
    public static final RegistryKey<PlacedFeature> ELM = of("elm");
    public static final RegistryKey<PlacedFeature> ELM_APPLE = of("elm_apple");
    public static final RegistryKey<PlacedFeature> ELM_APRICOT = of("elm_apricot");
    public static final RegistryKey<PlacedFeature> ELM_KIWI = of("elm_kiwi");
    public static final RegistryKey<PlacedFeature> ELM_NECTARINE = of("elm_nectarine");
    public static final RegistryKey<PlacedFeature> ELM_PEACH = of("elm_peach");
    public static final RegistryKey<PlacedFeature> ELM_PEAR = of("elm_pear");
    public static final RegistryKey<PlacedFeature> ELM_PLUM = of("elm_plum");
    
    //public static final RegistryKey<PlacedFeature> WILLOW = of("willow");
    //public static final RegistryKey<PlacedFeature> CYPRESS = of("cypress");
    //public static final RegistryKey<PlacedFeature> SAKURA = of("sakura");
    public static final RegistryKey<PlacedFeature> MAGNOLIA = of("magnolia");
    public static final RegistryKey<PlacedFeature> FLOWERING_MAGNOLIA = of("flowering_magnolia");
    public static final RegistryKey<PlacedFeature> JACARANDA = of("jacaranda");
    
    // ` ---------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatureLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> oak = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.OAK);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyOak = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_OAK);

        RegistryEntry<ConfiguredFeature<?, ?>> maple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> mapleApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> mapleApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> mapleKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> mapleNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> maplePeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> maplePear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> maplePlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAPLE_PLUM);

        RegistryEntry<ConfiguredFeature<?, ?>> fancyMaple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMapleApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMapleApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMapleKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMapleNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMaplePeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMaplePear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> fancyMaplePlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FANCY_MAPLE_PLUM);

        RegistryEntry<ConfiguredFeature<?, ?>> poplar = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> poplarPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.POPLAR_PLUM);

        RegistryEntry<ConfiguredFeature<?, ?>> beech = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH);
        RegistryEntry<ConfiguredFeature<?, ?>> beechApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> beechApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> beechKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> beechNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> beechPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> beechPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> beechPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BEECH_PLUM);

        RegistryEntry<ConfiguredFeature<?, ?>> hickory = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryCherry = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_CHERRY);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryFig = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_FIG);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryGrapefruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_GRAPEFRUIT);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryGuava = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_GUAVA);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryTangerine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_TANGERINE);

        RegistryEntry<ConfiguredFeature<?, ?>> hickoryBush = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_BUSH);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryBushCherry = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_BUSH_CHERRY);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryBushFig = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_BUSH_FIG);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryBushGrapefruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_BUSH_GRAPEFRUIT);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryBushGuava = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_BUSH_GUAVA);
        RegistryEntry<ConfiguredFeature<?, ?>> hickoryBushTangerine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.HICKORY_BUSH_TANGERINE);

        /*RegistryEntry<ConfiguredFeature<?, ?>> walnut = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT);
        RegistryEntry<ConfiguredFeature<?, ?>> walnutCherry = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT_CHERRY);
        RegistryEntry<ConfiguredFeature<?, ?>> walnutFig = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT_FIG);
        RegistryEntry<ConfiguredFeature<?, ?>> walnutGrapefruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT_GRAPEFRUIT);
        RegistryEntry<ConfiguredFeature<?, ?>> walnutGuava = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT_GUAVA);
        RegistryEntry<ConfiguredFeature<?, ?>> walnutTangerine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WALNUT_TANGERINE);

        RegistryEntry<ConfiguredFeature<?, ?>> chestnut = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT);
        RegistryEntry<ConfiguredFeature<?, ?>> chestnutCherry = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT_CHERRY);
        RegistryEntry<ConfiguredFeature<?, ?>> chestnutFig = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT_FIG);
        RegistryEntry<ConfiguredFeature<?, ?>> chestnutGrapefruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT_GRAPEFRUIT);
        RegistryEntry<ConfiguredFeature<?, ?>> chestnutGuava = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT_GUAVA);
        RegistryEntry<ConfiguredFeature<?, ?>> chestnutTangerine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CHESTNUT_TANGERINE);*/

        RegistryEntry<ConfiguredFeature<?, ?>> spruce = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.SPRUCE);
        RegistryEntry<ConfiguredFeature<?, ?>> spruceTop = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.SPRUCE_TOP);
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

        RegistryEntry<ConfiguredFeature<?, ?>> birch = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BIRCH);
        RegistryEntry<ConfiguredFeature<?, ?>> birchTall = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BIRCH_TALL);
        RegistryEntry<ConfiguredFeature<?, ?>> aspen = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ASPEN);
        RegistryEntry<ConfiguredFeature<?, ?>> paleOak = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALE_OAK);
        RegistryEntry<ConfiguredFeature<?, ?>> paleOakCreaking = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALE_OAK_CREAKING);

        RegistryEntry<ConfiguredFeature<?, ?>> jungle = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JUNGLE);
        RegistryEntry<ConfiguredFeature<?, ?>> megaJungle = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_JUNGLE);

        /*RegistryEntry<ConfiguredFeature<?, ?>> kapok = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokAvocado = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_AVOCADO);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokBanana = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_BANANA);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokLemon = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_LEMON);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokLime = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_LIME);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokMango = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_MANGO);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokOrange = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_ORANGE);
        RegistryEntry<ConfiguredFeature<?, ?>> kapokStarfruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.KAPOK_STARFRUIT);

        RegistryEntry<ConfiguredFeature<?, ?>> mahogany = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyAvocado = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_AVOCADO);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyBanana = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_BANANA);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyLemon = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_LEMON);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyLime = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_LIME);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyMango = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_MANGO);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyOrange = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_ORANGE);
        RegistryEntry<ConfiguredFeature<?, ?>> mahoganyStarfruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAHOGANY_STARFRUIT);

        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptus = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusAvocado = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_AVOCADO);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusBanana = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_BANANA);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusLemon = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_LEMON);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusLime = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_LIME);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusMango = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_MANGO);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusOrange = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_ORANGE);
        RegistryEntry<ConfiguredFeature<?, ?>> eucalyptusStarfruit = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EUCALYPTUS_STARFRUIT);*/

        RegistryEntry<ConfiguredFeature<?, ?>> acacia = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA);
        
        RegistryEntry<ConfiguredFeature<?, ?>> acaciaBush = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA_BUSH);
        /*RegistryEntry<ConfiguredFeature<?, ?>> acaciaBushKumquat = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA_BUSH_KUMQUAT);
        RegistryEntry<ConfiguredFeature<?, ?>> acaciaBushOlive = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA_BUSH_OLIVE);
        RegistryEntry<ConfiguredFeature<?, ?>> acaciaBushPersimmon = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA_BUSH_PERSIMMON);
        RegistryEntry<ConfiguredFeature<?, ?>> acaciaBushPomegranate = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ACACIA_BUSH_POMEGRANATE);*/

        RegistryEntry<ConfiguredFeature<?, ?>> baobab = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BAOBAB);
        /*RegistryEntry<ConfiguredFeature<?, ?>> baobabKumquat = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BAOBAB_KUMQUAT);
        RegistryEntry<ConfiguredFeature<?, ?>> baobabOlive = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BAOBAB_OLIVE);
        RegistryEntry<ConfiguredFeature<?, ?>> baobabPersimmon = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BAOBAB_PERSIMMON);
        RegistryEntry<ConfiguredFeature<?, ?>> baobabPomegranate = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.BAOBAB_POMEGRANATE);*/
        
        RegistryEntry<ConfiguredFeature<?, ?>> paloVerde = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALO_VERDE);
        RegistryEntry<ConfiguredFeature<?, ?>> paloVerdeKumquat = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALO_VERDE_KUMQUAT);
        RegistryEntry<ConfiguredFeature<?, ?>> paloVerdeOlive = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALO_VERDE_OLIVE);
        RegistryEntry<ConfiguredFeature<?, ?>> paloVerdePersimmon = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALO_VERDE_PERSIMMON);
        RegistryEntry<ConfiguredFeature<?, ?>> paloVerdePomegranate = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALO_VERDE_POMEGRANATE);

        /*RegistryEntry<ConfiguredFeature<?, ?>> joshua = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JOSHUA);
        /*RegistryEntry<ConfiguredFeature<?, ?>> joshuaDate = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JOSHUA_DATE);

        RegistryEntry<ConfiguredFeature<?, ?>> juniper = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JUNIPER);
        /*RegistryEntry<ConfiguredFeature<?, ?>> juniperDate = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JUNIPER_DATE);

        RegistryEntry<ConfiguredFeature<?, ?>> palm = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.PALM);*/

        RegistryEntry<ConfiguredFeature<?, ?>> darkOak = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.DARK_OAK);
        RegistryEntry<ConfiguredFeature<?, ?>> darkOakLeafLitter = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.DARK_OAK_LEAF_LITTER);
        RegistryEntry<ConfiguredFeature<?, ?>> darkOakSmall = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.DARK_OAK_SMALL);
        RegistryEntry<ConfiguredFeature<?, ?>> darkOakSmallLeafLitter = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.DARK_OAK_SMALL_LEAF_LITTER);
        
        RegistryEntry<ConfiguredFeature<?, ?>> ebony = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_PLUM);
        
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbony = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> megaEbonyPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MEGA_EBONY_PLUM);
        
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBush = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> ebonyBushPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.EBONY_BUSH_PLUM);
        
        RegistryEntry<ConfiguredFeature<?, ?>> teak = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK);
        RegistryEntry<ConfiguredFeature<?, ?>> teakApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> teakApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> teakKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> teakNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> teakPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> teakPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> teakPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.TEAK_PLUM);
        
        RegistryEntry<ConfiguredFeature<?, ?>> elm = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM);
        RegistryEntry<ConfiguredFeature<?, ?>> elmApple = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_APPLE);
        RegistryEntry<ConfiguredFeature<?, ?>> elmApricot = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_APRICOT);
        RegistryEntry<ConfiguredFeature<?, ?>> elmKiwi = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_KIWI);
        RegistryEntry<ConfiguredFeature<?, ?>> elmNectarine = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_NECTARINE);
        RegistryEntry<ConfiguredFeature<?, ?>> elmPeach = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_PEACH);
        RegistryEntry<ConfiguredFeature<?, ?>> elmPear = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_PEAR);
        RegistryEntry<ConfiguredFeature<?, ?>> elmPlum = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.ELM_PLUM);
        
        /*RegistryEntry<ConfiguredFeature<?, ?>> willow = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.WILLOW);
        RegistryEntry<ConfiguredFeature<?, ?>> cypress = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.CYPRESS);
        RegistryEntry<ConfiguredFeature<?, ?>> sakura = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.SAKURA);*/
        RegistryEntry<ConfiguredFeature<?, ?>> magnolia = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.MAGNOLIA);
        RegistryEntry<ConfiguredFeature<?, ?>> floweringMagnolia = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.FLOWERING_MAGNOLIA);
        RegistryEntry<ConfiguredFeature<?, ?>> jacaranda = configuredFeatureLookup.getOrThrow(OverhaulTreeConfiguredFeatures.JACARANDA);
        
        // ` ----------------------------------------------------------------------------------------------------------------------------------------------------------

        PlacedFeatures.register(featureRegisterable, OAK, oak, wouldSurvive(Blocks.OAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_OAK, fancyOak, wouldSurvive(Blocks.OAK_SAPLING));

        PlacedFeatures.register(featureRegisterable, MAPLE, maple, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_APPLE, mapleApple, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_APRICOT, mapleApricot, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_KIWI, mapleKiwi, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_NECTARINE, mapleNectarine, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_PEACH, maplePeach, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_PEAR, maplePear, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAPLE_PLUM, maplePlum, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE, fancyMaple, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_APPLE, fancyMapleApple, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_APRICOT, fancyMapleApricot, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_KIWI, fancyMapleKiwi, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_NECTARINE, fancyMapleNectarine, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_PEACH, fancyMaplePeach, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_PEAR, fancyMaplePear, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, FANCY_MAPLE_PLUM, fancyMaplePlum, wouldSurvive(NaturalBlocks.MAPLE_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, POPLAR, poplar, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_APPLE, poplarApple, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_APRICOT, poplarApricot, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_KIWI, poplarKiwi, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_NECTARINE, poplarNectarine, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_PEACH, poplarPeach, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_PEAR, poplarPear, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        PlacedFeatures.register(featureRegisterable, POPLAR_PLUM, poplarPlum, wouldSurvive(NaturalBlocks.POPLAR_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, BEECH, beech, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_APPLE, beechApple, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_APRICOT, beechApricot, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_KIWI, beechKiwi, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_NECTARINE, beechNectarine, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_PEACH, beechPeach, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_PEAR, beechPear, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BEECH_PLUM, beechPlum, wouldSurvive(NaturalBlocks.BEECH_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, HICKORY, hickory, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_CHERRY, hickoryCherry, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_FIG, hickoryFig, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_GRAPEFRUIT, hickoryGrapefruit, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_GUAVA, hickoryGuava, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_TANGERINE, hickoryTangerine, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, HICKORY_BUSH, hickoryBush, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_BUSH_CHERRY, hickoryBushCherry, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_BUSH_FIG, hickoryBushFig, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_BUSH_GRAPEFRUIT, hickoryBushGrapefruit, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_BUSH_GUAVA, hickoryBushGuava, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        PlacedFeatures.register(featureRegisterable, HICKORY_BUSH_TANGERINE, hickoryBushTangerine, wouldSurvive(NaturalBlocks.HICKORY_SAPLING));
        
        //PlacedFeatures.register(featureRegisterable, WALNUT, walnut, wouldSurvive(NaturalBlocks.WALNUT_SAPLING));
        
        //PlacedFeatures.register(featureRegisterable, CHESTNUT, chestnut, wouldSurvive(NaturalBlocks.CHESTNUT_SAPLING));

        PlacedFeatures.register(featureRegisterable, SPRUCE, spruce, wouldSurvive(Blocks.SPRUCE_SAPLING));
        PlacedFeatures.register(featureRegisterable, SPRUCE_TOP, spruceTop, wouldSurvive(Blocks.SPRUCE_SAPLING));
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

        PlacedFeatures.register(featureRegisterable, BIRCH, birch, wouldSurvive(Blocks.BIRCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, BIRCH_TALL, birchTall, wouldSurvive(Blocks.BIRCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, ASPEN, aspen, wouldSurvive(NaturalBlocks.ASPEN_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALE_OAK, paleOak, wouldSurvive(Blocks.PALE_OAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALE_OAK_CREAKING, paleOakCreaking, wouldSurvive(Blocks.PALE_OAK_SAPLING));

        PlacedFeatures.register(featureRegisterable, JUNGLE, jungle, wouldSurvive(Blocks.JUNGLE_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_JUNGLE, megaJungle, wouldSurvive(Blocks.JUNGLE_SAPLING));
        
        /*PlacedFeatures.register(featureRegisterable, KAPOK, kapok, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_AVOCADO, kapokAvocado, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_BANANA, kapokBanana, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_LEMON, kapokLemon, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_LIME, kapokLime, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_MANGO, kapokMango, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_ORANGE, kapokOrange, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        PlacedFeatures.register(featureRegisterable, KAPOK_STARFRUIT, kapokStarfruit, wouldSurvive(NaturalBlocks.KAPOK_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, MAHOGANY, mahogany, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_AVOCADO, mahoganyAvocado, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_BANANA, mahoganyBanana, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_LEMON, mahoganyLemon, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_LIME, mahoganyLime, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_MANGO, mahoganyMango, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_ORANGE, mahoganyOrange, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MAHOGANY_STARFRUIT, mahoganyStarfruit, wouldSurvive(NaturalBlocks.MAHOGANY_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS, eucalyptus, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_AVOCADO, eucalyptusAvocado, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_BANANA, eucalyptusBanana, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_LEMON, eucalyptusLemon, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_LIME, eucalyptusLime, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_MANGO, eucalyptusMango, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_ORANGE, eucalyptusOrange, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));
        PlacedFeatures.register(featureRegisterable, EUCALYPTUS_STARFRUIT, eucalyptusStarfruit, wouldSurvive(NaturalBlocks.EUCALYPTUS_SAPLING));*/

        PlacedFeatures.register(featureRegisterable, ACACIA, acacia, wouldSurvive(Blocks.ACACIA_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, ACACIA_BUSH, acaciaBush, wouldSurvive(Blocks.ACACIA_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, ACACIA_BUSH_KUMQUAT, acaciaBushKumquat, wouldSurvive(Blocks.ACACIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, ACACIA_BUSH_OLIVE, acaciaBushOlive, wouldSurvive(Blocks.ACACIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, ACACIA_BUSH_PERSIMMON, acaciaBushPersimmon, wouldSurvive(Blocks.ACACIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, ACACIA_BUSH_POMEGRANATE, acaciaBushPomegranate, wouldSurvive(Blocks.ACACIA_SAPLING));*/
        
        PlacedFeatures.register(featureRegisterable, BAOBAB, baobab, wouldSurvive(NaturalBlocks.BAOBAB_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, BAOBAB_KUMQUAT, baobabKumquat, wouldSurvive(NaturalBlocks.BAOBAB_SAPLING));
        PlacedFeatures.register(featureRegisterable, BAOBAB_OLIVE, baobabOlive, wouldSurvive(NaturalBlocks.BAOBAB_SAPLING));
        PlacedFeatures.register(featureRegisterable, BAOBAB_PERSIMMON, baobabPersimmon, wouldSurvive(NaturalBlocks.BAOBAB_SAPLING));
        PlacedFeatures.register(featureRegisterable, BAOBAB_POMEGRANATE, baobabPomegranate, wouldSurvive(NaturalBlocks.BAOBAB_SAPLING));*/
        
        PlacedFeatures.register(featureRegisterable, PALO_VERDE, paloVerde, wouldSurvive(NaturalBlocks.PALO_VERDE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALO_VERDE_KUMQUAT, paloVerdeKumquat, wouldSurvive(NaturalBlocks.PALO_VERDE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALO_VERDE_OLIVE, paloVerdeOlive, wouldSurvive(NaturalBlocks.PALO_VERDE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALO_VERDE_PERSIMMON, paloVerdePersimmon, wouldSurvive(NaturalBlocks.PALO_VERDE_SAPLING));
        PlacedFeatures.register(featureRegisterable, PALO_VERDE_POMEGRANATE, paloVerdePomegranate, wouldSurvive(NaturalBlocks.PALO_VERDE_SAPLING));
        
        /*PlacedFeatures.register(featureRegisterable, JOSHUA, joshua, wouldSurvive(NaturalBlocks.JOSHUA_SAPLING));
        /*PlacedFeatures.register(featureRegisterable, JOSHUA_DATE, joshuaDate, wouldSurvive(NaturalBlocks.JOSHUA_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, JUNIPER, juniper, wouldSurvive(NaturalBlocks.JUNIPER_SAPLING));
        PlacedFeatures.register(featureRegisterable, JUNIPER_DATE, juniperDate, wouldSurvive(NaturalBlocks.JUNIPER_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, PALM, palm, wouldSurvive(NaturalBlocks.PALM_SAPLING));*/

        PlacedFeatures.register(featureRegisterable, DARK_OAK, darkOak, wouldSurvive(Blocks.DARK_OAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, DARK_OAK_LEAF_LITTER, darkOakLeafLitter, wouldSurvive(Blocks.DARK_OAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, DARK_OAK_SMALL, darkOakSmall, wouldSurvive(Blocks.DARK_OAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, DARK_OAK_SMALL_LEAF_LITTER, darkOakSmallLeafLitter, wouldSurvive(Blocks.DARK_OAK_SAPLING));

        PlacedFeatures.register(featureRegisterable, EBONY, ebony, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_APPLE, ebonyApple, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_APRICOT, ebonyApricot, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_KIWI, ebonyKiwi, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_NECTARINE, ebonyNectarine, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_PEACH, ebonyPeach, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_PEAR, ebonyPear, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_PLUM, ebonyPlum, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY, megaEbony, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_APPLE, megaEbonyApple, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_APRICOT, megaEbonyApricot, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_KIWI, megaEbonyKiwi, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_NECTARINE, megaEbonyNectarine, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_PEACH, megaEbonyPeach, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_PEAR, megaEbonyPear, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_EBONY_PLUM, megaEbonyPlum, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH, ebonyBush, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_APPLE, ebonyBushApple, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_APRICOT, ebonyBushApricot, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_KIWI, ebonyBushKiwi, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_NECTARINE, ebonyBushNectarine, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_PEACH, ebonyBushPeach, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_PEAR, ebonyBushPear, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        PlacedFeatures.register(featureRegisterable, EBONY_BUSH_PLUM, ebonyBushPlum, wouldSurvive(NaturalBlocks.EBONY_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, TEAK, teak, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_APPLE, teakApple, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_APRICOT, teakApricot, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_KIWI, teakKiwi, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_NECTARINE, teakNectarine, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_PEACH, teakPeach, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_PEAR, teakPear, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        PlacedFeatures.register(featureRegisterable, TEAK_PLUM, teakPlum, wouldSurvive(NaturalBlocks.TEAK_SAPLING));
        
        PlacedFeatures.register(featureRegisterable, ELM, elm, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_APPLE, elmApple, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_APRICOT, elmApricot, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_KIWI, elmKiwi, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_NECTARINE, elmNectarine, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_PEACH, elmPeach, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_PEAR, elmPear, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        PlacedFeatures.register(featureRegisterable, ELM_PLUM, elmPlum, wouldSurvive(NaturalBlocks.ELM_SAPLING));
        
        /*PlacedFeatures.register(featureRegisterable, WILLOW, willow, wouldSurvive(NaturalBlocks.WILLOW_SAPLING));
        PlacedFeatures.register(featureRegisterable, CYPRESS, cypress, wouldSurvive(NaturalBlocks.CYPRESS_SAPLING));
        PlacedFeatures.register(featureRegisterable, SAKURA, sakura, wouldSurvive(NaturalBlocks.SAKURA_SAPLING));*/
        PlacedFeatures.register(featureRegisterable, MAGNOLIA, magnolia, wouldSurvive(NaturalBlocks.MAGNOLIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, FLOWERING_MAGNOLIA, floweringMagnolia, wouldSurvive(NaturalBlocks.MAGNOLIA_SAPLING));
        PlacedFeatures.register(featureRegisterable, JACARANDA, jacaranda, wouldSurvive(NaturalBlocks.JACARANDA_SAPLING));
    }
}
