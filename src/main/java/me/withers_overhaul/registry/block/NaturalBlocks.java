package me.withers_overhaul.registry.block;

import me.withers_overhaul.block.*;
import me.withers_overhaul.block.HangingMossBlock;
import me.withers_overhaul.block.util.OverhaulSaplingGenerator;
import me.withers_overhaul.block.util.OverhaulWoodTypes;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;

import static me.withers_overhaul.block.util.OverhaulWoodTypes.OverhaulWoodType.*;
import static me.withers_overhaul.registry.block.OverhaulBlocks.keyOf;
import static me.withers_overhaul.registry.block.OverhaulBlocks.register;
import static net.minecraft.block.Blocks.*;

public class NaturalBlocks {

    //LEAVES
    public static final Block MAPLE_LEAVES = leavesBlock(MAPLE);
    public static final Block POPLAR_LEAVES = leavesBlock(POPLAR);
    public static final Block BEECH_LEAVES = leavesBlock(BEECH);
    public static final Block HICKORY_LEAVES = leavesBlock(HICKORY);
    public static final Block WALNUT_LEAVES = leavesBlock(WALNUT);
    public static final Block CHESTNUT_LEAVES = leavesBlock(CHESTNUT);
    public static final Block CEDAR_LEAVES = leavesBlock(CEDAR);
    public static final Block REDWOOD_LEAVES = leavesBlock(REDWOOD);
    public static final Block FIR_LEAVES = leavesBlock(FIR);
    public static final Block HEMLOCK_LEAVES = leavesBlock(HEMLOCK);
    public static final Block HOLLY_LEAVES = leavesBlock(HOLLY);
    public static final Block PINE_LEAVES = leavesBlock(PINE);
    public static final Block LARCH_LEAVES = leavesBlock(LARCH);
    public static final Block ASPEN_LEAVES = leavesBlock(ASPEN);
    public static final Block KAPOK_LEAVES = leavesBlock(KAPOK);
    public static final Block MAHOGANY_LEAVES = leavesBlock(MAHOGANY);
    public static final Block EUCALYPTUS_LEAVES = leavesBlock(EUCALYPTUS);
    public static final Block BAOBAB_LEAVES = leavesBlock(BAOBAB);
    public static final Block PALO_VERDE_LEAVES = leavesBlock(PALO_VERDE);
    public static final Block JOSHUA_LEAVES = leavesBlock(JOSHUA);
    public static final Block JUNIPER_LEAVES = leavesBlock(JUNIPER);
    public static final Block PALM_LEAVES = leavesBlock(PALM);
    public static final Block EBONY_LEAVES = leavesBlock(EBONY);
    public static final Block TEAK_LEAVES = leavesBlock(TEAK);
    public static final Block ELM_LEAVES = leavesBlock(ELM);
    public static final Block WILLOW_LEAVES = leavesBlock(WILLOW);
    public static final Block CYPRESS_LEAVES = leavesBlock(CYPRESS);
    public static final Block SAKURA_LEAVES = leavesBlock(SAKURA, BlockSoundGroup.CHERRY_LEAVES);
    public static final Block MAGNOLIA_LEAVES = leavesBlock(MAGNOLIA, BlockSoundGroup.CHERRY_LEAVES);
    public static final Block FLOWERING_MAGNOLIA_LEAVES = register("flowering_magnolia_leaves", new UntintedParticleLeavesBlock(0.01F, ParticleTypes.CHERRY_LEAVES, AbstractBlock.Settings.copy(MAGNOLIA_LEAVES).registryKey(keyOf("flowering_magnolia_leaves"))), true);
    public static final Block JACARANDA_LEAVES = leavesBlock(JACARANDA, BlockSoundGroup.CHERRY_SAPLING);

    //SAPLINGS
    public static final Block MAPLE_SAPLING = saplingBlock(MAPLE, OverhaulSaplingGenerator.MAPLE);
    public static final Block POPLAR_SAPLING = saplingBlock(POPLAR, OverhaulSaplingGenerator.POPLAR);
    public static final Block BEECH_SAPLING = saplingBlock(BEECH, OverhaulSaplingGenerator.BEECH);
    public static final Block HICKORY_SAPLING = saplingBlock(HICKORY, SaplingGenerator.OAK);
    public static final Block WALNUT_SAPLING = saplingBlock(WALNUT, SaplingGenerator.OAK);
    public static final Block CHESTNUT_SAPLING = saplingBlock(CHESTNUT, SaplingGenerator.OAK);
    public static final Block CEDAR_SAPLING = saplingBlock(CEDAR, OverhaulSaplingGenerator.CEDAR);
    public static final Block REDWOOD_SAPLING = register("redwood_sapling", new RedwoodSaplingBlock(OverhaulSaplingGenerator.REDWOOD, AbstractBlock.Settings.copy(SPRUCE_SAPLING).registryKey(keyOf("redwood_sapling"))), true);
    public static final Block FIR_SAPLING = snowSaplingBlock(FIR, OverhaulSaplingGenerator.FIR);
    public static final Block HEMLOCK_SAPLING = snowSaplingBlock(HEMLOCK, OverhaulSaplingGenerator.HEMLOCK);
    public static final Block HOLLY_SAPLING = snowSaplingBlock(HOLLY, OverhaulSaplingGenerator.HOLLY);
    public static final Block PINE_SAPLING = register("pine_sapling", new SaplingBlock(OverhaulSaplingGenerator.PINE, AbstractBlock.Settings.copy(SPRUCE_SAPLING).registryKey(keyOf("pine_sapling"))), false);
    public static final Block LARCH_SAPLING = saplingBlock(LARCH, OverhaulSaplingGenerator.LARCH);
    public static final Block ASPEN_SAPLING = saplingBlock(ASPEN, OverhaulSaplingGenerator.ASPEN);
    public static final Block KAPOK_SAPLING = saplingBlock(KAPOK, SaplingGenerator.JUNGLE);
    public static final Block MAHOGANY_SAPLING = saplingBlock(MAHOGANY, SaplingGenerator.JUNGLE);
    public static final Block EUCALYPTUS_SAPLING = saplingBlock(EUCALYPTUS, SaplingGenerator.JUNGLE);
    public static final Block BAOBAB_SAPLING = saplingBlock(BAOBAB, SaplingGenerator.ACACIA);
    public static final Block PALO_VERDE_SAPLING = saplingBlock(PALO_VERDE, OverhaulSaplingGenerator.PALO_VERDE);
    public static final Block JOSHUA_SAPLING = saplingBlock(JOSHUA, SaplingGenerator.ACACIA);
    public static final Block JUNIPER_SAPLING = saplingBlock(JUNIPER, SaplingGenerator.ACACIA);
    public static final Block PALM_SAPLING = saplingBlock(PALM, SaplingGenerator.ACACIA);
    public static final Block EBONY_SAPLING = saplingBlock(EBONY, OverhaulSaplingGenerator.EBONY);
    public static final Block TEAK_SAPLING = saplingBlock(TEAK, OverhaulSaplingGenerator.TEAK);
    public static final Block ELM_SAPLING = saplingBlock(ELM, OverhaulSaplingGenerator.ELM);
    public static final Block WILLOW_SAPLING = saplingBlock(WILLOW, SaplingGenerator.MANGROVE);
    public static final Block CYPRESS_SAPLING = saplingBlock(CYPRESS, SaplingGenerator.MANGROVE);
    public static final Block SAKURA_SAPLING = saplingBlock(SAKURA, SaplingGenerator.CHERRY, BlockSoundGroup.CHERRY_SAPLING);
    public static final Block MAGNOLIA_SAPLING = saplingBlock(MAGNOLIA, OverhaulSaplingGenerator.MAGNOLIA, BlockSoundGroup.CHERRY_SAPLING);
    public static final Block FLOWERING_MAGNOLIA_SAPLING = register("flowering_magnolia_sapling", new SaplingBlock(OverhaulSaplingGenerator.FLOWERING_MAGNOLIA, AbstractBlock.Settings.copy(MAGNOLIA_SAPLING).registryKey(keyOf("flowering_magnolia_sapling"))), true);
    public static final Block JACARANDA_SAPLING = saplingBlock(JACARANDA, OverhaulSaplingGenerator.JACARANDA, BlockSoundGroup.CHERRY_SAPLING);

    public static final Block POTTED_MAPLE_SAPLING = pottedSaplingBlock(MAPLE, MAPLE_SAPLING);
    public static final Block POTTED_POPLAR_SAPLING = pottedSaplingBlock(POPLAR, POPLAR_SAPLING);
    public static final Block POTTED_BEECH_SAPLING = pottedSaplingBlock(BEECH, BEECH_SAPLING);
    public static final Block POTTED_HICKORY_SAPLING = pottedSaplingBlock(HICKORY, HICKORY_SAPLING);
    public static final Block POTTED_WALNUT_SAPLING = pottedSaplingBlock(WALNUT, WALNUT_SAPLING);
    public static final Block POTTED_CHESTNUT_SAPLING = pottedSaplingBlock(CHESTNUT, CHESTNUT_SAPLING);
    public static final Block POTTED_CEDAR_SAPLING = pottedSaplingBlock(CEDAR, CEDAR_SAPLING);
    public static final Block POTTED_REDWOOD_SAPLING = pottedSaplingBlock(REDWOOD, REDWOOD_SAPLING);
    public static final Block POTTED_FIR_SAPLING = pottedSaplingBlock(FIR, FIR_SAPLING);
    public static final Block POTTED_HEMLOCK_SAPLING = pottedSaplingBlock(HEMLOCK, HEMLOCK_SAPLING);
    public static final Block POTTED_HOLLY_SAPLING = pottedSaplingBlock(HOLLY, HOLLY_SAPLING);
    public static final Block POTTED_PINE_SAPLING = pottedSaplingBlock(PINE, PINE_SAPLING);
    public static final Block POTTED_LARCH_SAPLING = pottedSaplingBlock(LARCH, LARCH_SAPLING);
    public static final Block POTTED_ASPEN_SAPLING = pottedSaplingBlock(ASPEN, ASPEN_SAPLING);
    public static final Block POTTED_KAPOK_SAPLING = pottedSaplingBlock(KAPOK, KAPOK_SAPLING);
    public static final Block POTTED_MAHOGANY_SAPLING = pottedSaplingBlock(MAHOGANY, MAHOGANY_SAPLING);
    public static final Block POTTED_EUCALYPTUS_SAPLING = pottedSaplingBlock(EUCALYPTUS, EUCALYPTUS_SAPLING);
    public static final Block POTTED_BAOBAB_SAPLING = pottedSaplingBlock(BAOBAB, BAOBAB_SAPLING);
    public static final Block POTTED_PALO_VERDE_SAPLING = pottedSaplingBlock(PALO_VERDE, PALO_VERDE_SAPLING);
    public static final Block POTTED_JOSHUA_SAPLING = pottedSaplingBlock(JOSHUA, JOSHUA_SAPLING);
    public static final Block POTTED_JUNIPER_SAPLING = pottedSaplingBlock(JUNIPER, JUNIPER_SAPLING);
    public static final Block POTTED_PALM_SAPLING = pottedSaplingBlock(PALM, PALM_SAPLING);
    public static final Block POTTED_EBONY_SAPLING = pottedSaplingBlock(EBONY, EBONY_SAPLING);
    public static final Block POTTED_TEAK_SAPLING = pottedSaplingBlock(TEAK, TEAK_SAPLING);
    public static final Block POTTED_ELM_SAPLING = pottedSaplingBlock(ELM, ELM_SAPLING);
    public static final Block POTTED_WILLOW_SAPLING = pottedSaplingBlock(WILLOW, WILLOW_SAPLING);
    public static final Block POTTED_CYPRESS_SAPLING = pottedSaplingBlock(CYPRESS, CYPRESS_SAPLING);
    public static final Block POTTED_SAKURA_SAPLING = pottedSaplingBlock(SAKURA, SAKURA_SAPLING);
    public static final Block POTTED_MAGNOLIA_SAPLING = pottedSaplingBlock(MAGNOLIA, MAGNOLIA_SAPLING);
    public static final Block POTTED_FLOWERING_MAGNOLIA_SAPLING = register("potted_flowering_magnolia_sapling", new FlowerPotBlock(FLOWERING_MAGNOLIA_SAPLING, AbstractBlock.Settings.copy(POTTED_MAGNOLIA_SAPLING).registryKey(keyOf("potted_flowering_magnolia_sapling"))), false);
    public static final Block POTTED_JACARANDA_SAPLING = pottedSaplingBlock(JACARANDA, JACARANDA_SAPLING);

    public static final Block FROSTED_SAND = gravityBlock("frosted_sand", AbstractBlock.Settings.copy(SAND), 13232621);
    public static final Block CHARRED_SAND = gravityBlock("charred_sand", AbstractBlock.Settings.copy(SAND), 5134426);

    public static final Block SHORT_PRAIRIE_GRASS = register("short_prairie_grass", new ShortPrairieGrassBlock(AbstractBlock.Settings.copy(SHORT_GRASS).registryKey(keyOf("short_prairie_grass"))), true);
    public static final Block TALL_PRAIRIE_GRASS = register("tall_prairie_grass", new TallPlantBlock(AbstractBlock.Settings.copy(TALL_GRASS).registryKey(keyOf("tall_prairie_grass"))), true);
    public static final Block CATTAIL = register("cattail", new CattailBlock(AbstractBlock.Settings.copy(TALL_SEAGRASS).registryKey(keyOf("cattail"))), true);
    public static final Block PEAT = register("peat", new SnowBlock(AbstractBlock.Settings.create().burnable().strength(0.7F).sounds(BlockSoundGroup.WART_BLOCK).registryKey(keyOf("peat"))), true);
    public static final Block PEAT_BLOCK = register("peat_block", new Block(AbstractBlock.Settings.create().burnable().strength(0.7F).sounds(BlockSoundGroup.WART_BLOCK).registryKey(keyOf("peat_block"))), true);
    public static final Block GOURD = register("gourd", new GourdBlock(AbstractBlock.Settings.copy(PUMPKIN).registryKey(keyOf("gourd"))), true);
    public static final Block CARVED_GOURD = register("carved_gourd", new CarvedGourdBlock(AbstractBlock.Settings.copy(CARVED_PUMPKIN).registryKey(keyOf("carved_gourd"))), true);
    public static final Block LAVENDER = register("lavender", new TallFlowerBlock(AbstractBlock.Settings.copy(LILAC).registryKey(keyOf("lavender"))), true);
    public static final Block PURPLE_PETALS = register("purple_petals", new FlowerbedBlock(AbstractBlock.Settings.copy(PINK_PETALS).registryKey(keyOf("purple_petals"))), true);
    public static final Block HANGING_MOSS = register("hanging_moss", new HangingMossBlock(AbstractBlock.Settings.copy(PALE_HANGING_MOSS).mapColor(MapColor.GREEN).registryKey(keyOf("hanging_moss"))), true);

    public static Block leavesBlock(OverhaulWoodTypes.OverhaulWoodType woodType) {
        return register(woodType.getName() + "_leaves", new TintedParticleLeavesBlock(0.01F, createLeavesSettings(BlockSoundGroup.GRASS).registryKey(keyOf(woodType.getName() + "_leaves"))), true);
    }

    public static Block leavesBlock(OverhaulWoodTypes.OverhaulWoodType woodType, BlockSoundGroup soundGroup) {
        return register(woodType.getName() + "_leaves", new TintedParticleLeavesBlock(0.01F, createLeavesSettings(soundGroup).registryKey(keyOf(woodType.getName() + "_leaves"))), true);
    }

    public static Block leavesBlock(OverhaulWoodTypes.OverhaulWoodType woodType, ParticleEffect particle) {
        return register(woodType.getName() + "_leaves", new UntintedParticleLeavesBlock(0.01F, particle, createLeavesSettings(BlockSoundGroup.GRASS).registryKey(keyOf(woodType.getName() + "_leaves"))), true);
    }

    public static Block leavesBlock(OverhaulWoodTypes.OverhaulWoodType woodType, BlockSoundGroup soundGroup, ParticleEffect particle) {
        return register(woodType.getName() + "_leaves", new UntintedParticleLeavesBlock(0.01F, particle, createLeavesSettings(soundGroup).registryKey(keyOf(woodType.getName() + "_leaves"))), true);
    }

    public static Block saplingBlock(OverhaulWoodTypes.OverhaulWoodType woodType, SaplingGenerator generator) {
        return register(woodType.getName() + "_sapling", new SaplingBlock(generator, AbstractBlock.Settings.copy(OAK_SAPLING).registryKey(keyOf(woodType.getName() + "_sapling"))), true);
    }

    public static Block snowSaplingBlock(OverhaulWoodTypes.OverhaulWoodType woodType, SaplingGenerator generator) {
        return register(woodType.getName() + "_sapling", new SnowSaplingBlock(generator, AbstractBlock.Settings.copy(SPRUCE_SAPLING).registryKey(keyOf(woodType.getName() + "_sapling"))), true);
    }

    public static Block saplingBlock(OverhaulWoodTypes.OverhaulWoodType woodType, SaplingGenerator generator, BlockSoundGroup soundGroup) {
        return register(woodType.getName() + "_sapling", new SaplingBlock(generator, AbstractBlock.Settings.copy(OAK_SAPLING).sounds(soundGroup).registryKey(keyOf(woodType.getName() + "_sapling"))), true);
    }

    public static Block pottedSaplingBlock(OverhaulWoodTypes.OverhaulWoodType woodType, Block sapling) {
        return register("potted_" + woodType.getName() + "_sapling", new FlowerPotBlock(sapling, createFlowerPotSettings().registryKey(keyOf("potted_" + woodType.getName() + "_sapling"))), false);
    }

    public static Block gravityBlock(String name, AbstractBlock.Settings settings, int color) {
        return register(name, new ColoredFallingBlock(new ColorCode(color), settings.registryKey(keyOf(name))), true);
    }

    public static void registerNaturalBlocks() {}

}
