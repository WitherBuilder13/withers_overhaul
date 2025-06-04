package me.withers_overhaul.world.feature.configured;

import com.google.common.collect.ImmutableList;
import me.withers_overhaul.block.fruit.tree.MediterraneanFruitLeavesBlock;
import me.withers_overhaul.block.fruit.tree.SubtropicalFruitLeavesBlock;
import me.withers_overhaul.block.fruit.tree.TemperateFruitLeavesBlock;
import me.withers_overhaul.block.fruit.tree.TreeFruit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.treedecorator.CreakingHeartTreeDecorator;
import net.minecraft.world.gen.treedecorator.PaleMossTreeDecorator;
import net.minecraft.world.gen.treedecorator.PlaceOnGroundTreeDecorator;
import net.minecraft.world.gen.trunk.*;

import java.util.OptionalInt;

import static me.withers_overhaul.block.fruit.tree.TreeFruit.Mediterranean.*;
import static me.withers_overhaul.block.fruit.tree.TreeFruit.Subtropical.*;
import static me.withers_overhaul.block.fruit.tree.TreeFruit.Temperate.*;
import static me.withers_overhaul.registry.block.NaturalBlocks.*;
import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.world.feature.OverhaulConfiguredFeatures.of;
import static net.minecraft.block.Blocks.*;

public class OverhaulTreeConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK = of("oak");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_APPLE = of("oak_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_APRICOT = of("oak_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_KIWI = of("oak_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_NECTARINE = of("oak_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_PEACH = of("oak_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_PEAR = of("oak_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_PLUM = of("oak_plum");*/

    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK = of("fancy_oak");
   /* public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_APPLE = of("fancy_oak_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_APRICOT = of("fancy_oak_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_KIWI = of("fancy_oak_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_NECTARINE = of("fancy_oak_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_PEACH = of("fancy_oak_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_PEAR = of("fancy_oak_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_OAK_PLUM = of("fancy_oak_plum");*/
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE = of("maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_APPLE = of("maple_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_APRICOT = of("maple_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KIWI = of("maple_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_NECTARINE = of("maple_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_PEACH = of("maple_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_PEAR = of("maple_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_PLUM = of("maple_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE = of("fancy_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_APPLE = of("fancy_maple_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_APRICOT = of("fancy_maple_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_KIWI = of("fancy_maple_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_NECTARINE = of("fancy_maple_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_PEACH = of("fancy_maple_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_PEAR = of("fancy_maple_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANCY_MAPLE_PLUM = of("fancy_maple_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR = of("poplar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_APPLE = of("poplar_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_APRICOT = of("poplar_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_KIWI = of("poplar_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_NECTARINE = of("poplar_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_PEACH = of("poplar_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_PEAR = of("poplar_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POPLAR_PLUM = of("poplar_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH = of("beech");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_APPLE = of("beech_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_APRICOT = of("beech_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_KIWI = of("beech_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_NECTARINE = of("beech_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_PEACH = of("beech_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_PEAR = of("beech_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_PLUM = of("beech_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY = of("hickory");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_CHERRY = of("hickory_cherry");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_FIG = of("hickory_fig");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_GRAPEFRUIT = of("hickory_grapefruit");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_GUAVA = of("hickory_guava");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_TANGERINE = of("hickory_tangerine");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH = of("hickory_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH_CHERRY = of("hickory_bush_cherry");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH_FIG = of("hickory_bush_fig");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH_GRAPEFRUIT = of("hickory_bush_grapefruit");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH_GUAVA = of("hickory_bush_guava");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HICKORY_BUSH_TANGERINE = of("hickory_bush_tangerine");
    
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT = of("walnut");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_CHERRY = of("walnut_cherry");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_FIG = of("walnut_fig");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_GRAPEFRUIT = of("walnut_grapefruit");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_GUAVA = of("walnut_guava");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_TANGERINE = of("walnut_tangerine");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT = of("chestnut");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_CHERRY = of("chestnut_cherry");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_FIG = of("chestnut_fig");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_GRAPEFRUIT = of("chestnut_grapefruit");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_GUAVA = of("chestnut_guava");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_TANGERINE = of("chestnut_tangerine");*/
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE = of("spruce");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPRUCE_TOP = of("spruce_top");
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

    public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH = of("birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BIRCH_TALL = of("birch_tall");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ASPEN = of("aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_OAK = of("pale_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_OAK_CREAKING = of("pale_oak_creaking");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE = of("jungle");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_AVOCADO = of("jungle_avocado");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_BANANA = of("jungle_banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_LEMON = of("jungle_lemon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_LIME = of("jungle_lime");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_MANGO = of("jungle_mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_ORANGE = of("jungle_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLE_STARFRUIT = of("jungle_starfruit");*/
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE = of("mega_jungle");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_AVOCADO = of("mega_jungle_avocado");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_BANANA = of("mega_jungle_banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_LEMON = of("mega_jungle_lemon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_LIME = of("mega_jungle_lime");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_MANGO = of("mega_jungle_mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_ORANGE = of("mega_jungle_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_JUNGLE_STARFRUIT = of("mega_jungle_starfruit");*/
    
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK = of("kapok");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_AVOCADO = of("kapok_avocado");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_BANANA = of("kapok_banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_LEMON = of("kapok_lemon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_LIME = of("kapok_lime");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_MANGO = of("kapok_mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_ORANGE = of("kapok_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAPOK_STARFRUIT = of("kapok_starfruit");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY = of("mahogany");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_AVOCADO = of("mahogany_avocado");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_BANANA = of("mahogany_banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_LEMON = of("mahogany_lemon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_LIME = of("mahogany_lime");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_MANGO = of("mahogany_mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_ORANGE = of("mahogany_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_STARFRUIT = of("mahogany_starfruit");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS = of("eucalyptus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_AVOCADO = of("eucalyptus_avocado");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_BANANA = of("eucalyptus_banana");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_LEMON = of("eucalyptus_lemon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_LIME = of("eucalyptus_lime");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_MANGO = of("eucalyptus_mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_ORANGE = of("eucalyptus_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUCALYPTUS_STARFRUIT = of("eucalyptus_starfruit");*/
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA = of("acacia");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_KUMQUAT = of("acacia_kumquat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_OLIVE = of("acacia_olive");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_PERSIMMON = of("acacia_persimmon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_POMEGRANATE = of("acacia_pomegranate");*/
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH = of("acacia_bush");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH_KUMQUAT = of("acacia_bush_kumquat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH_OLIVE = of("acacia_bush_olive");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH_PERSIMMON = of("acacia_bush_persimmon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ACACIA_BUSH_POMEGRANATE = of("acacia_bush_pomegranate");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB = of("baobab");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB_KUMQUAT = of("baobab_kumquat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB_OLIVE = of("baobab_olive");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB_PERSIMMON = of("baobab_persimmon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BAOBAB_POMEGRANATE = of("baobab_pomegranate");*/
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE = of("palo_verde");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE_KUMQUAT = of("palo_verde_kumquat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE_OLIVE = of("palo_verde_olive");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE_PERSIMMON = of("palo_verde_persimmon");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE_POMEGRANATE = of("palo_verde_pomegranate");
    
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> JOSHUA = of("joshua");
    /*public static final RegistryKey<ConfiguredFeature<?, ?>> JOSHUA_DATE = of("joshua_date");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNIPER = of("juniper");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNIPER_DATE = of("juniper_date");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALM = of("palm");*/

    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK = of("dark_oak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_LEAF_LITTER = of("dark_oak_leaf_litter");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_SMALL = of("dark_oak_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_OAK_SMALL_LEAF_LITTER = of("dark_oak_small_leaf_litter");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY = of("ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_APPLE = of("ebony_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_APRICOT = of("ebony_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_KIWI = of("ebony_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_NECTARINE = of("ebony_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_PEACH = of("ebony_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_PEAR = of("ebony_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_PLUM = of("ebony_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY = of("mega_ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_APPLE = of("mega_ebony_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_APRICOT = of("mega_ebony_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_KIWI = of("mega_ebony_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_NECTARINE = of("mega_ebony_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_PEACH = of("mega_ebony_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_PEAR = of("mega_ebony_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_EBONY_PLUM = of("mega_ebony_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH = of("ebony_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_APPLE = of("ebony_bush_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_APRICOT = of("ebony_bush_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_KIWI = of("ebony_bush_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_NECTARINE = of("ebony_bush_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_PEACH = of("ebony_bush_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_PEAR = of("ebony_bush_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_BUSH_PLUM = of("ebony_bush_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK = of("teak");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_APPLE = of("teak_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_APRICOT = of("teak_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_KIWI = of("teak_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_NECTARINE = of("teak_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_PEACH = of("teak_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_PEAR = of("teak_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TEAK_PLUM = of("teak_plum");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM = of("elm");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_APPLE = of("elm_apple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_APRICOT = of("elm_apricot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_KIWI = of("elm_kiwi");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_NECTARINE = of("elm_nectarine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_PEACH = of("elm_peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_PEAR = of("elm_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELM_PLUM = of("elm_plum");

    /*public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW = of("willow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CYPRESS = of("cypress");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAKURA = of("sakura");*/
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGNOLIA = of("magnolia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLOWERING_MAGNOLIA = of("flowering_magnolia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JACARANDA = of("jacaranda");

    // ` ------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {

        ConfiguredFeatures.register(featureRegisterable, OAK, Feature.TREE, simple(OAK_LOG, OAK_LEAVES, 13, 5, 3, 2));

        ConfiguredFeatures.register(featureRegisterable, FANCY_OAK, Feature.TREE, simpleFancy(OAK_LOG, OAK_LEAVES, 14));

        ConfiguredFeatures.register(featureRegisterable, MAPLE, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_APPLE, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, APPLE));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_APRICOT, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, APRICOT));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_KIWI, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, KIWI));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_NECTARINE, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_PEACH, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, PEACH));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_PEAR, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, PEAR));
        ConfiguredFeatures.register(featureRegisterable, MAPLE_PLUM, Feature.TREE, simpleTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, 2, 0, 2, PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_APPLE, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, APPLE));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_APRICOT, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, APRICOT));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_KIWI, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, KIWI));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_NECTARINE, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_PEACH, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, PEACH));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_PEAR, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, PEAR));
        ConfiguredFeatures.register(featureRegisterable, FANCY_MAPLE_PLUM, Feature.TREE, simpleFancyTemperate(MAPLE_LOG, MAPLE_LEAVES, 7, PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, POPLAR, Feature.TREE, poplar(TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_APPLE, Feature.TREE, poplar(APPLE));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_APRICOT, Feature.TREE, poplar(APRICOT));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_KIWI, Feature.TREE, poplar(KIWI));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_NECTARINE, Feature.TREE, poplar(NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_PEACH, Feature.TREE, poplar(PEACH));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_PEAR, Feature.TREE, poplar(PEAR));
        ConfiguredFeatures.register(featureRegisterable, POPLAR_PLUM, Feature.TREE, poplar(PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, BEECH, Feature.TREE, beech(TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, BEECH_APPLE, Feature.TREE, beech(APPLE));
        ConfiguredFeatures.register(featureRegisterable, BEECH_APRICOT, Feature.TREE, beech(APRICOT));
        ConfiguredFeatures.register(featureRegisterable, BEECH_KIWI, Feature.TREE, beech(KIWI));
        ConfiguredFeatures.register(featureRegisterable, BEECH_NECTARINE, Feature.TREE, beech(NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, BEECH_PEACH, Feature.TREE, beech(PEACH));
        ConfiguredFeatures.register(featureRegisterable, BEECH_PEAR, Feature.TREE, beech(PEAR));
        ConfiguredFeatures.register(featureRegisterable, BEECH_PLUM, Feature.TREE, beech(PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, HICKORY, Feature.TREE, simpleFancySubtropical(HICKORY_LOG, HICKORY_LEAVES, 7, TreeFruit.Subtropical.NONE));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_CHERRY, Feature.TREE, simpleFancySubtropical(HICKORY_LOG, HICKORY_LEAVES, 7, CHERRY));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_FIG, Feature.TREE, simpleFancySubtropical(HICKORY_LOG, HICKORY_LEAVES, 7, FIG));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_GRAPEFRUIT, Feature.TREE, simpleFancySubtropical(HICKORY_LOG, HICKORY_LEAVES, 7, GRAPEFRUIT));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_GUAVA, Feature.TREE, simpleFancySubtropical(HICKORY_LOG, HICKORY_LEAVES, 7, GUAVA));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_TANGERINE, Feature.TREE, simpleFancySubtropical(HICKORY_LOG, HICKORY_LEAVES, 7, TANGERINE));
        
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH, Feature.TREE, bushSubtropical(HICKORY_LOG, HICKORY_LEAVES, TreeFruit.Subtropical.NONE));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH_CHERRY, Feature.TREE, bushSubtropical(HICKORY_LOG, HICKORY_LEAVES, CHERRY));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH_FIG, Feature.TREE, bushSubtropical(HICKORY_LOG, HICKORY_LEAVES, FIG));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH_GRAPEFRUIT, Feature.TREE, bushSubtropical(HICKORY_LOG, HICKORY_LEAVES, GRAPEFRUIT));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH_GUAVA, Feature.TREE, bushSubtropical(HICKORY_LOG, HICKORY_LEAVES, GUAVA));
        ConfiguredFeatures.register(featureRegisterable, HICKORY_BUSH_TANGERINE, Feature.TREE, bushSubtropical(HICKORY_LOG, HICKORY_LEAVES, TANGERINE));

        ConfiguredFeatures.register(featureRegisterable, SPRUCE, Feature.TREE, conifer(
                false, SPRUCE_LOG, SPRUCE_LEAVES, 8, 5, 2, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(3, 5)
        ));
        ConfiguredFeatures.register(featureRegisterable, SPRUCE_TOP, Feature.TREE, conifer(
                true, SPRUCE_LOG, SPRUCE_LEAVES, 8, 5, 2, UniformIntProvider.create(1, 2), UniformIntProvider.create(0, 2), UniformIntProvider.create(6, 9)
        ));
        ConfiguredFeatures.register(featureRegisterable, CEDAR, Feature.TREE, conifer(
                false, CEDAR_LOG, CEDAR_LEAVES, 7, 3, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)
        ));
        ConfiguredFeatures.register(featureRegisterable, CEDAR_FLAT, Feature.TREE, smallFlat(CEDAR_LOG, CEDAR_LEAVES, 5));
        ConfiguredFeatures.register(featureRegisterable, MEGA_CEDAR, Feature.TREE, megaConifer(
                CEDAR_LOG, CEDAR_LEAVES, 12, 5, 11, ConstantIntProvider.create(0), ConstantIntProvider.create(1), UniformIntProvider.create(11, 16)
        ));
        ConfiguredFeatures.register(featureRegisterable, MEGA_CEDAR_FLAT, Feature.TREE, megaFlat(
                CEDAR_LOG, CEDAR_LEAVES, 7, 4, 1, ConstantIntProvider.create(1), ConstantIntProvider.create(0), 1
        ));
        ConfiguredFeatures.register(featureRegisterable, REDWOOD, Feature.TREE, redwood());
        ConfiguredFeatures.register(featureRegisterable, FIR, Feature.TREE, conifer(false, FIR_LOG, FIR_LEAVES,
                9, 7, 2, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)
        ));
        ConfiguredFeatures.register(featureRegisterable, MEGA_FIR, Feature.TREE, megaConifer(
                FIR_LOG, FIR_LEAVES, 23, 6, 12, ConstantIntProvider.create(0), ConstantIntProvider.create(1), UniformIntProvider.create(17, 24)
        ));
        ConfiguredFeatures.register(featureRegisterable, HEMLOCK, Feature.TREE, conifer(
                false, HEMLOCK_LOG, HEMLOCK_LEAVES, 4, 2, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)
        ));
        ConfiguredFeatures.register(featureRegisterable, MEGA_HEMLOCK, Feature.TREE, megaConifer(
                HEMLOCK_LOG, HEMLOCK_LEAVES, 13, 4, 7, ConstantIntProvider.create(0), ConstantIntProvider.create(1), UniformIntProvider.create(8, 14)
        ));
        ConfiguredFeatures.register(featureRegisterable, HOLLY, Feature.TREE, megaConifer(
                HOLLY_LOG, HOLLY_LEAVES, 9, 2, 10, ConstantIntProvider.create(1), ConstantIntProvider.create(0), UniformIntProvider.create(9, 15)
        ));
        ConfiguredFeatures.register(featureRegisterable, PINE, Feature.TREE, conifer(
                false, PINE_LOG, PINE_LEAVES, 5, 2, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)
        ));
        ConfiguredFeatures.register(featureRegisterable, PINE_TOP, Feature.TREE, conifer(
                true, PINE_LOG, PINE_LEAVES, 5, 2, 1, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)
        ));
        ConfiguredFeatures.register(featureRegisterable, PINE_TALL, Feature.TREE, conifer(
                false, PINE_LOG, PINE_LEAVES, 11, 5, 2, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(6, 7)
        ));
        ConfiguredFeatures.register(featureRegisterable, PINE_TOP_TALL, Feature.TREE, conifer(
                true, PINE_LOG, PINE_LEAVES, 11, 5, 2, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)
        ));
        ConfiguredFeatures.register(featureRegisterable, LARCH, Feature.TREE, conifer(
                false, LARCH_LOG, LARCH_LEAVES, 6, 2, 1, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)
        ));
        ConfiguredFeatures.register(featureRegisterable, LARCH_TOP, Feature.TREE, conifer(
                true, LARCH_LOG, LARCH_LEAVES, 6, 2, 1, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)
        ));
        ConfiguredFeatures.register(featureRegisterable, LARCH_TALL, Feature.TREE, conifer(
                false, LARCH_LOG, LARCH_LEAVES, 11, 6, 3, UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(6, 7)
        ));
        ConfiguredFeatures.register(featureRegisterable, LARCH_TOP_TALL, Feature.TREE, conifer(
                true, LARCH_LOG, LARCH_LEAVES, 11, 6, 3, UniformIntProvider.create(1, 2), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)
        ));
        ConfiguredFeatures.register(featureRegisterable, BIRCH, Feature.TREE, simple(BIRCH_LOG, BIRCH_LEAVES, 11, 7, 3, 2));
        ConfiguredFeatures.register(featureRegisterable, BIRCH_TALL, Feature.TREE, simple(BIRCH_LOG, BIRCH_LEAVES, 15, 7, 3, 2));
        ConfiguredFeatures.register(featureRegisterable, ASPEN, Feature.TREE, conifer(
                true, ASPEN_LOG, ASPEN_LEAVES, 8, 1, 3, ConstantIntProvider.create(1), ConstantIntProvider.create(1), ConstantIntProvider.create(3)
        ));
        ConfiguredFeatures.register(featureRegisterable, PALE_OAK, Feature.TREE, paleOak(false));
        ConfiguredFeatures.register(featureRegisterable, PALE_OAK_CREAKING, Feature.TREE, paleOak(true));

        ConfiguredFeatures.register(featureRegisterable, JUNGLE, Feature.TREE, simple(JUNGLE_LOG, JUNGLE_LEAVES, 10, 4, 1, 2));
        ConfiguredFeatures.register(featureRegisterable, MEGA_JUNGLE, Feature.TREE, megaFlat(JUNGLE_LOG, JUNGLE_LEAVES, 24, 8, 2, UniformIntProvider.create(2, 3), ConstantIntProvider.create(0), 1));

        ConfiguredFeatures.register(featureRegisterable, ACACIA, Feature.TREE, flat(ACACIA_LOG, ACACIA_LEAVES, 7, 5, 2, false));
        
        ConfiguredFeatures.register(featureRegisterable, ACACIA_BUSH, Feature.TREE, bushMediterranean(ACACIA_LOG, ACACIA_LEAVES/*, TreeFruit.Mediterranean.NONE*/));
        /*ConfiguredFeatures.register(featureRegisterable, ACACIA_BUSH_KUMQUAT, Feature.TREE, bushMediterranean(ACACIA_LOG, ACACIA_LEAVES, KUMQUAT));
        ConfiguredFeatures.register(featureRegisterable, ACACIA_BUSH_OLIVE, Feature.TREE, bushMediterranean(ACACIA_LOG, ACACIA_LEAVES, OLIVE));
        ConfiguredFeatures.register(featureRegisterable, ACACIA_BUSH_PERSIMMON, Feature.TREE, bushMediterranean(ACACIA_LOG, ACACIA_LEAVES, PERSIMMON));
        ConfiguredFeatures.register(featureRegisterable, ACACIA_BUSH_POMEGRANATE, Feature.TREE, bushMediterranean(ACACIA_LOG, ACACIA_LEAVES, POMEGRANATE));*/
        
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE, Feature.TREE, smallFlatMediterranean(
                PALO_VERDE_LOG, PALO_VERDE_LEAVES, 3, TreeFruit.Mediterranean.NONE
        ));
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE_KUMQUAT, Feature.TREE, smallFlatMediterranean(
                PALO_VERDE_LOG, PALO_VERDE_LEAVES, 3, KUMQUAT
        ));
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE_OLIVE, Feature.TREE, smallFlatMediterranean(
                PALO_VERDE_LOG, PALO_VERDE_LEAVES, 3, OLIVE
        ));
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE_PERSIMMON, Feature.TREE, smallFlatMediterranean(
                PALO_VERDE_LOG, PALO_VERDE_LEAVES, 3, PERSIMMON
        ));
        ConfiguredFeatures.register(featureRegisterable, PALO_VERDE_POMEGRANATE, Feature.TREE, smallFlatMediterranean(
                PALO_VERDE_LOG, PALO_VERDE_LEAVES, 3, POMEGRANATE
        ));

        ConfiguredFeatures.register(featureRegisterable, DARK_OAK, Feature.TREE, darkOak(TreeFruit.Temperate.NONE, false));
        ConfiguredFeatures.register(featureRegisterable, DARK_OAK_LEAF_LITTER, Feature.TREE, darkOak(TreeFruit.Temperate.NONE, true));
        ConfiguredFeatures.register(featureRegisterable, DARK_OAK_SMALL, Feature.TREE, flat(DARK_OAK_LOG, DARK_OAK_LEAVES, 10, 7, 3, false));
        ConfiguredFeatures.register(featureRegisterable, DARK_OAK_SMALL_LEAF_LITTER, Feature.TREE, flat(DARK_OAK_LOG, DARK_OAK_LEAVES, 10, 7, 3, true));
        
        ConfiguredFeatures.register(featureRegisterable, EBONY, Feature.TREE, ebony(TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, EBONY_APPLE, Feature.TREE, ebony(APPLE));
        ConfiguredFeatures.register(featureRegisterable, EBONY_APRICOT, Feature.TREE, ebony(APRICOT));
        ConfiguredFeatures.register(featureRegisterable, EBONY_KIWI, Feature.TREE, ebony(KIWI));
        ConfiguredFeatures.register(featureRegisterable, EBONY_NECTARINE, Feature.TREE, ebony(NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, EBONY_PEACH, Feature.TREE, ebony(PEACH));
        ConfiguredFeatures.register(featureRegisterable, EBONY_PEAR, Feature.TREE, ebony(PEAR));
        ConfiguredFeatures.register(featureRegisterable, EBONY_PLUM, Feature.TREE, ebony(PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY, Feature.TREE, megaEbony(TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_APPLE, Feature.TREE, megaEbony(APPLE));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_APRICOT, Feature.TREE, megaEbony(APRICOT));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_KIWI, Feature.TREE, megaEbony(KIWI));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_NECTARINE, Feature.TREE, megaEbony(NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_PEACH, Feature.TREE, megaEbony(PEACH));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_PEAR, Feature.TREE, megaEbony(PEAR));
        ConfiguredFeatures.register(featureRegisterable, MEGA_EBONY_PLUM, Feature.TREE, megaEbony(PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_APPLE, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, APPLE));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_APRICOT, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, APRICOT));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_KIWI, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, KIWI));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_NECTARINE, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_PEACH, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, PEACH));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_PEAR, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, PEAR));
        ConfiguredFeatures.register(featureRegisterable, EBONY_BUSH_PLUM, Feature.TREE, bushTemperate(EBONY_LOG, EBONY_LEAVES, PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, TEAK, Feature.TREE, teak(TreeFruit.Temperate.NONE));
        ConfiguredFeatures.register(featureRegisterable, TEAK_APPLE, Feature.TREE, teak(APPLE));
        ConfiguredFeatures.register(featureRegisterable, TEAK_APRICOT, Feature.TREE, teak(APRICOT));
        ConfiguredFeatures.register(featureRegisterable, TEAK_KIWI, Feature.TREE, teak(KIWI));
        ConfiguredFeatures.register(featureRegisterable, TEAK_NECTARINE, Feature.TREE, teak(NECTARINE));
        ConfiguredFeatures.register(featureRegisterable, TEAK_PEACH, Feature.TREE, teak(PEACH));
        ConfiguredFeatures.register(featureRegisterable, TEAK_PEAR, Feature.TREE, teak(PEAR));
        ConfiguredFeatures.register(featureRegisterable, TEAK_PLUM, Feature.TREE, teak(PLUM));
        
        ConfiguredFeatures.register(featureRegisterable, ELM, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, TreeFruit.Temperate.NONE
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_APPLE, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, APPLE
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_APRICOT, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, APRICOT
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_KIWI, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, KIWI
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_NECTARINE, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, NECTARINE
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_PEACH, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, PEACH
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_PEAR, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, PEAR
        ));
        ConfiguredFeatures.register(featureRegisterable, ELM_PLUM, Feature.TREE, simpleTemperate(
                ELM_LOG, ELM_LEAVES, 7, 3, 1, 3, PLUM
        ));
        
        ConfiguredFeatures.register(featureRegisterable, MAGNOLIA, Feature.TREE, flat(MAGNOLIA_LOG, MAGNOLIA_LEAVES, 5, 2, 2, false));
        ConfiguredFeatures.register(featureRegisterable, FLOWERING_MAGNOLIA, Feature.TREE, flat(
                MAGNOLIA_LOG, FLOWERING_MAGNOLIA_LEAVES, 5, 1, 2, false
        ));
        ConfiguredFeatures.register(featureRegisterable, JACARANDA, Feature.TREE, jacaranda());
    }

    // ` ------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // * Tree configurations

    private static TreeFeatureConfig beech(TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(BEECH_LOG),
                new LargeOakTrunkPlacer(15, 1, 3),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(BEECH_LEAVES.getDefaultState(), 3)
                        .add(BEECH_LEAVES.getStateWithProperties(BEECH_LEAVES.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                        0.25F, 0.25F, 0.16666667F, 0.33333334F
                ),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build();
    }
    
    private static TreeFeatureConfig bushSubtropical(Block log, Block leaves, TreeFruit.Subtropical fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(SubtropicalFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)
        ).build();
    }

    private static TreeFeatureConfig bushMediterranean(Block log, Block leaves/*, TreeFruit.Mediterranean fruit*/) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(1, 0, 0),
                /*new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(MediterraneanFruitLeavesBlock.FRUIT, fruit)), 1).build()),*/
                BlockStateProvider.of(leaves),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)
        ).build();
    }

    private static TreeFeatureConfig bushTemperate(Block log, Block leaves, TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(1, 0, 0),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(0, 0, 0)
        ).build();
    }

    private static TreeFeatureConfig conifer(
            boolean top, Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, IntProvider radius, IntProvider offset, IntProvider trunkHeight
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                top ? new PineFoliagePlacer(radius, offset, trunkHeight) : new SpruceFoliagePlacer(radius, offset, trunkHeight),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build();
    }

    private static TreeFeatureConfig darkOak(TreeFruit.Temperate fruit, boolean leafLitter) {
        TreeFeatureConfig.Builder builder = new TreeFeatureConfig.Builder(
                BlockStateProvider.of(DARK_OAK_LOG),
                new DarkOakTrunkPlacer(10, 8, 4),
                BlockStateProvider.of(DARK_OAK_LEAVES),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 1, 0)
        ).ignoreVines();
        if (leafLitter) {
            builder.decorators(ImmutableList.of(
                    new PlaceOnGroundTreeDecorator(96, 4, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 3))),
                    new PlaceOnGroundTreeDecorator(150, 2, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 4)))
            ));
        }
        return builder.build();
    }

    private static TreeFeatureConfig ebony(TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBONY_LOG),
                new ForkingTrunkPlacer(6, 1, 4),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(EBONY_LEAVES.getDefaultState(), 3)
                        .add(EBONY_LEAVES.getStateWithProperties(EBONY_LEAVES.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new CherryFoliagePlacer(
                        ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                        0.25F, 0.25F, 0.16666667F, 0.33333334F
                ),
                new TwoLayersFeatureSize(1, 1, 2)
        ).build();
    }

    private static TreeFeatureConfig flat(Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, boolean leafLitter) {
        TreeFeatureConfig.Builder builder;
        builder = new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new ForkingTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)
        );
        if (leafLitter) {
            builder.decorators(ImmutableList.of(
                    new PlaceOnGroundTreeDecorator(96, 4, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 3))),
                    new PlaceOnGroundTreeDecorator(150, 2, 2, new WeightedBlockStateProvider(VegetationConfiguredFeatures.leafLitter(1, 4)))
            ));
        }
        return builder.build();
    }

    private static TreeFeatureConfig jacaranda() {
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
        ).build();
    }

    private static TreeFeatureConfig megaConifer(
            Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, IntProvider radius, IntProvider offset, IntProvider crownHeight
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new GiantTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new MegaPineFoliagePlacer(radius, offset, crownHeight),
                new TwoLayersFeatureSize(1, 1, 2)
        ).build();
    }

    private static TreeFeatureConfig megaEbony(TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(EBONY_LOG),
                new DarkOakTrunkPlacer(20, 4, 7),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(EBONY_LEAVES.getDefaultState(), 3)
                        .add(EBONY_LEAVES.getStateWithProperties(EBONY_LEAVES.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 1, 2)
        ).build();
    }

    private static TreeFeatureConfig megaFlat(
            Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, IntProvider radius, IntProvider offset, int height
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new MegaJungleTrunkPlacer(baseHeight, heightRandA, heightRandB),
                BlockStateProvider.of(leaves),
                new JungleFoliagePlacer(radius, offset, height),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build();
    }

    private static TreeFeatureConfig paleOak(boolean creaking) {
        TreeFeatureConfig.Builder builder = new TreeFeatureConfig.Builder(
                BlockStateProvider.of(PALE_OAK_LOG),
                new DarkOakTrunkPlacer(10, 8, 4),
                BlockStateProvider.of(PALE_OAK_LEAVES),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
        ).ignoreVines();
        if (creaking) builder.decorators(ImmutableList.of(new PaleMossTreeDecorator(0.15f, 0.4f, 0.8f), new CreakingHeartTreeDecorator(1.0F)));
        else builder.decorators(ImmutableList.of(new PaleMossTreeDecorator(0.15f, 0.4f, 0.8f)));
        return builder.build();
    }

    private static TreeFeatureConfig poplar(TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(POPLAR_LOG),
                new StraightTrunkPlacer(6, 4, 1),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(POPLAR_LEAVES.getDefaultState(), 3)
                        .add(POPLAR_LEAVES.getStateWithProperties(POPLAR_LEAVES.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(1), UniformIntProvider.create(1, 3), 7),
                new TwoLayersFeatureSize(2, 0, 2, OptionalInt.of(4))
        ).build();
    }

    private static TreeFeatureConfig redwood() {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(REDWOOD_LOG),
                new RedwoodTrunkPlacer(32, 16, 24),
                BlockStateProvider.of(REDWOOD_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), UniformIntProvider.create(21, 24)),
                new TwoLayersFeatureSize(1, 1, 2)
        ).build();
    }

    private static TreeFeatureConfig simple(
            Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, int radius
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getDefaultState(), 1).build()),
                new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build();
    }

    private static TreeFeatureConfig simpleFancy(Block log, Block leaves, int baseHeight) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new LargeOakTrunkPlacer(baseHeight, 7, 0),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getDefaultState(), 1).build()),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).build();
    }

    private static TreeFeatureConfig simpleTemperate(
            Block log, Block leaves, int baseHeight, int heightRandA, int heightRandB, int radius, TreeFruit.Temperate fruit
    ) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)
        ).build();
    }

    private static TreeFeatureConfig simpleFancyTemperate(Block log, Block leaves, int baseHeight, TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new LargeOakTrunkPlacer(baseHeight, 7, 0),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).build();
    }

    private static TreeFeatureConfig simpleFancySubtropical(Block log, Block leaves, int baseHeight, TreeFruit.Subtropical fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new LargeOakTrunkPlacer(baseHeight, 7, 0),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(SubtropicalFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(4), 4),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))
        ).build();
    }

    private static TreeFeatureConfig smallFlat(Block log, Block leaves, int baseHeight) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new ForkingTrunkPlacer(baseHeight, 1, 2),
                BlockStateProvider.of(leaves),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build();
    }

    private static TreeFeatureConfig smallFlatMediterranean(Block log, Block leaves, int baseHeight, TreeFruit.Mediterranean fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(log),
                new ForkingTrunkPlacer(baseHeight, 1, 2),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(leaves.getDefaultState(), 3)
                        .add(leaves.getStateWithProperties(leaves.getDefaultState().with(MediterraneanFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build();
    }

    private static TreeFeatureConfig teak(TreeFruit.Temperate fruit) {
        return new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TEAK_LOG),
                new StraightTrunkPlacer(6, 4, 0),
                new WeightedBlockStateProvider(Pool.<BlockState>builder()
                        .add(TEAK_LEAVES.getDefaultState(), 3)
                        .add(TEAK_LEAVES.getStateWithProperties(TEAK_LEAVES.getDefaultState().with(TemperateFruitLeavesBlock.FRUIT, fruit)), 1).build()),
                new PineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(1), UniformIntProvider.create(3, 4)),
                new TwoLayersFeatureSize(2, 0, 2)
        ).build();
    }
}