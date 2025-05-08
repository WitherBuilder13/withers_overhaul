package me.withers_overhaul.registry.block;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.block.OverhaulSignBlock;
import me.withers_overhaul.block.util.OverhaulWoodTypes;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.data.family.BlockFamily;

import static me.withers_overhaul.block.util.OverhaulWoodTypes.WoodType.*;
import static me.withers_overhaul.registry.block.OverhaulBlocks.keyOf;
import static me.withers_overhaul.registry.block.OverhaulBlocks.register;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.OAK_LOG;
import static net.minecraft.block.Blocks.OAK_PLANKS;
import static net.minecraft.data.family.BlockFamily.Variant.*;

public class WoodBlocks {

    //LOGS
    public static final Block MAPLE_LOG = registerLogBlock("maple_log");
    public static final Block POPLAR_LOG = registerLogBlock("poplar_log");
    public static final Block BEECH_LOG = registerLogBlock("beech_log");
    public static final Block HICKORY_LOG = registerLogBlock("hickory_log");
    public static final Block WALNUT_LOG = registerLogBlock("walnut_log");
    public static final Block CHESTNUT_LOG = registerLogBlock("chestnut_log");
    public static final Block CEDAR_LOG = registerLogBlock("cedar_log");
    public static final Block REDWOOD_LOG = registerLogBlock("redwood_log");
    public static final Block FIR_LOG = registerLogBlock("fir_log");
    public static final Block HEMLOCK_LOG = registerLogBlock("hemlock_log");
    public static final Block HOLLY_LOG = registerLogBlock("holly_log");
    public static final Block PINE_LOG = registerLogBlock("pine_log");
    public static final Block LARCH_LOG = registerLogBlock("larch_log");
    public static final Block ASPEN_LOG = registerLogBlock("aspen_log");
    public static final Block KAPOK_LOG = registerLogBlock("kapok_log");
    public static final Block MAHOGANY_LOG = registerLogBlock("mahogany_log");
    public static final Block EUCALYPTUS_LOG = registerLogBlock("eucalyptus_log");
    public static final Block BAOBAB_LOG = registerLogBlock("baobab_log");
    public static final Block PALO_VERDE_LOG = registerLogBlock("palo_verde_log");
    public static final Block JOSHUA_LOG = registerLogBlock("joshua_log");
    public static final Block JUNIPER_LOG = registerLogBlock("juniper_log");
    public static final Block PALM_LOG = registerLogBlock("palm_log");
    public static final Block EBONY_LOG = registerLogBlock("ebony_log");
    public static final Block TEAK_LOG = registerLogBlock("teak_log");
    public static final Block ELM_LOG = registerLogBlock("elm_log");
    public static final Block WILLOW_LOG = registerLogBlock("willow_log");
    public static final Block CYPRESS_LOG = registerLogBlock("cypress_log");
    public static final Block SAKURA_LOG = registerLogBlock("sakura_log");
    public static final Block MAGNOLIA_LOG = registerLogBlock("magnolia_log");
    public static final Block JACARANDA_LOG = registerLogBlock("jacaranda_log");

    public static final Block MAPLE_WOOD = registerLogBlock("maple_wood");
    public static final Block POPLAR_WOOD = registerLogBlock("poplar_wood");
    public static final Block BEECH_WOOD = registerLogBlock("beech_wood");
    public static final Block HICKORY_WOOD = registerLogBlock("hickory_wood");
    public static final Block WALNUT_WOOD = registerLogBlock("walnut_wood");
    public static final Block CHESTNUT_WOOD = registerLogBlock("chestnut_wood");
    public static final Block CEDAR_WOOD = registerLogBlock("cedar_wood");
    public static final Block REDWOOD_WOOD = registerLogBlock("redwood_wood");
    public static final Block FIR_WOOD = registerLogBlock("fir_wood");
    public static final Block HEMLOCK_WOOD = registerLogBlock("hemlock_wood");
    public static final Block HOLLY_WOOD = registerLogBlock("holly_wood");
    public static final Block PINE_WOOD = registerLogBlock("pine_wood");
    public static final Block LARCH_WOOD = registerLogBlock("larch_wood");
    public static final Block ASPEN_WOOD = registerLogBlock("aspen_wood");
    public static final Block KAPOK_WOOD = registerLogBlock("kapok_wood");
    public static final Block MAHOGANY_WOOD = registerLogBlock("mahogany_wood");
    public static final Block EUCALYPTUS_WOOD = registerLogBlock("eucalyptus_wood");
    public static final Block BAOBAB_WOOD = registerLogBlock("baobab_wood");
    public static final Block PALO_VERDE_WOOD = registerLogBlock("palo_verde_wood");
    public static final Block JOSHUA_WOOD = registerLogBlock("joshua_wood");
    public static final Block JUNIPER_WOOD = registerLogBlock("juniper_wood");
    public static final Block PALM_WOOD = registerLogBlock("palm_wood");
    public static final Block EBONY_WOOD = registerLogBlock("ebony_wood");
    public static final Block TEAK_WOOD = registerLogBlock("teak_wood");
    public static final Block ELM_WOOD = registerLogBlock("elm_wood");
    public static final Block WILLOW_WOOD = registerLogBlock("willow_wood");
    public static final Block CYPRESS_WOOD = registerLogBlock("cypress_wood");
    public static final Block SAKURA_WOOD = registerLogBlock("sakura_wood");
    public static final Block MAGNOLIA_WOOD = registerLogBlock("magnolia_wood");
    public static final Block JACARANDA_WOOD = registerLogBlock("jacaranda_wood");

    public static final Block STRIPPED_MAPLE_LOG = registerLogBlock("stripped_maple_log");
    public static final Block STRIPPED_POPLAR_LOG = registerLogBlock("stripped_poplar_log");
    public static final Block STRIPPED_BEECH_LOG = registerLogBlock("stripped_beech_log");
    public static final Block STRIPPED_HICKORY_LOG = registerLogBlock("stripped_hickory_log");
    public static final Block STRIPPED_WALNUT_LOG = registerLogBlock("stripped_walnut_log");
    public static final Block STRIPPED_CHESTNUT_LOG = registerLogBlock("stripped_chestnut_log");
    public static final Block STRIPPED_CEDAR_LOG = registerLogBlock("stripped_cedar_log");
    public static final Block STRIPPED_REDWOOD_LOG = registerLogBlock("stripped_redwood_log");
    public static final Block STRIPPED_FIR_LOG = registerLogBlock("stripped_fir_log");
    public static final Block STRIPPED_HEMLOCK_LOG = registerLogBlock("stripped_hemlock_log");
    public static final Block STRIPPED_HOLLY_LOG = registerLogBlock("stripped_holly_log");
    public static final Block STRIPPED_PINE_LOG = registerLogBlock("stripped_pine_log");
    public static final Block STRIPPED_LARCH_LOG = registerLogBlock("stripped_larch_log");
    public static final Block STRIPPED_ASPEN_LOG = registerLogBlock("stripped_aspen_log");
    public static final Block STRIPPED_KAPOK_LOG = registerLogBlock("stripped_kapok_log");
    public static final Block STRIPPED_MAHOGANY_LOG = registerLogBlock("stripped_mahogany_log");
    public static final Block STRIPPED_EUCALYPTUS_LOG = registerLogBlock("stripped_eucalyptus_log");
    public static final Block STRIPPED_BAOBAB_LOG = registerLogBlock("stripped_baobab_log");
    public static final Block STRIPPED_PALO_VERDE_LOG = registerLogBlock("stripped_palo_verde_log");
    public static final Block STRIPPED_JOSHUA_LOG = registerLogBlock("stripped_joshua_log");
    public static final Block STRIPPED_JUNIPER_LOG = registerLogBlock("stripped_juniper_log");
    public static final Block STRIPPED_PALM_LOG = registerLogBlock("stripped_palm_log");
    public static final Block STRIPPED_EBONY_LOG = registerLogBlock("stripped_ebony_log");
    public static final Block STRIPPED_TEAK_LOG = registerLogBlock("stripped_teak_log");
    public static final Block STRIPPED_ELM_LOG = registerLogBlock("stripped_elm_log");
    public static final Block STRIPPED_WILLOW_LOG = registerLogBlock("stripped_willow_log");
    public static final Block STRIPPED_CYPRESS_LOG = registerLogBlock("stripped_cypress_log");
    public static final Block STRIPPED_SAKURA_LOG = registerLogBlock("stripped_sakura_log");
    public static final Block STRIPPED_MAGNOLIA_LOG = registerLogBlock("stripped_magnolia_log");
    public static final Block STRIPPED_JACARANDA_LOG = registerLogBlock("stripped_jacaranda_log");

    public static final Block STRIPPED_MAPLE_WOOD = registerLogBlock("stripped_maple_wood");
    public static final Block STRIPPED_POPLAR_WOOD = registerLogBlock("stripped_poplar_wood");
    public static final Block STRIPPED_BEECH_WOOD = registerLogBlock("stripped_beech_wood");
    public static final Block STRIPPED_HICKORY_WOOD = registerLogBlock("stripped_hickory_wood");
    public static final Block STRIPPED_WALNUT_WOOD = registerLogBlock("stripped_walnut_wood");
    public static final Block STRIPPED_CHESTNUT_WOOD = registerLogBlock("stripped_chestnut_wood");
    public static final Block STRIPPED_CEDAR_WOOD = registerLogBlock("stripped_cedar_wood");
    public static final Block STRIPPED_REDWOOD_WOOD = registerLogBlock("stripped_redwood_wood");
    public static final Block STRIPPED_FIR_WOOD = registerLogBlock("stripped_fir_wood");
    public static final Block STRIPPED_HEMLOCK_WOOD = registerLogBlock("stripped_hemlock_wood");
    public static final Block STRIPPED_HOLLY_WOOD = registerLogBlock("stripped_holly_wood");
    public static final Block STRIPPED_PINE_WOOD = registerLogBlock("stripped_pine_wood");
    public static final Block STRIPPED_LARCH_WOOD = registerLogBlock("stripped_larch_wood");
    public static final Block STRIPPED_ASPEN_WOOD = registerLogBlock("stripped_aspen_wood");
    public static final Block STRIPPED_KAPOK_WOOD = registerLogBlock("stripped_kapok_wood");
    public static final Block STRIPPED_MAHOGANY_WOOD = registerLogBlock("stripped_mahogany_wood");
    public static final Block STRIPPED_EUCALYPTUS_WOOD = registerLogBlock("stripped_eucalyptus_wood");
    public static final Block STRIPPED_BAOBAB_WOOD = registerLogBlock("stripped_baobab_wood");
    public static final Block STRIPPED_PALO_VERDE_WOOD = registerLogBlock("stripped_palo_verde_wood");
    public static final Block STRIPPED_JOSHUA_WOOD = registerLogBlock("stripped_joshua_wood");
    public static final Block STRIPPED_JUNIPER_WOOD = registerLogBlock("stripped_juniper_wood");
    public static final Block STRIPPED_PALM_WOOD = registerLogBlock("stripped_palm_wood");
    public static final Block STRIPPED_EBONY_WOOD = registerLogBlock("stripped_ebony_wood");
    public static final Block STRIPPED_TEAK_WOOD = registerLogBlock("stripped_teak_wood");
    public static final Block STRIPPED_ELM_WOOD = registerLogBlock("stripped_elm_wood");
    public static final Block STRIPPED_WILLOW_WOOD = registerLogBlock("stripped_willow_wood");
    public static final Block STRIPPED_CYPRESS_WOOD = registerLogBlock("stripped_cypress_wood");
    public static final Block STRIPPED_SAKURA_WOOD = registerLogBlock("stripped_sakura_wood");
    public static final Block STRIPPED_MAGNOLIA_WOOD = registerLogBlock("stripped_magnolia_wood");
    public static final Block STRIPPED_JACARANDA_WOOD = registerLogBlock("stripped_jacaranda_wood");

    //WOOD
    public static final Block MAPLE_PLANKS = registerWoodBlock(MAPLE);
    public static final Block POPLAR_PLANKS = registerWoodBlock(POPLAR);
    public static final Block BEECH_PLANKS = registerWoodBlock(BEECH);
    public static final Block HICKORY_PLANKS = registerWoodBlock(HICKORY);
    public static final Block WALNUT_PLANKS = registerWoodBlock(WALNUT);
    public static final Block CHESTNUT_PLANKS = registerWoodBlock(CHESTNUT);
    public static final Block CEDAR_PLANKS = registerWoodBlock(CEDAR);
    public static final Block REDWOOD_PLANKS = registerWoodBlock(REDWOOD);
    public static final Block FIR_PLANKS = registerWoodBlock(FIR);
    public static final Block HEMLOCK_PLANKS = registerWoodBlock(HEMLOCK);
    public static final Block HOLLY_PLANKS = registerWoodBlock(HOLLY);
    public static final Block PINE_PLANKS = registerWoodBlock(PINE);
    public static final Block LARCH_PLANKS = registerWoodBlock(LARCH);
    public static final Block ASPEN_PLANKS = registerWoodBlock(ASPEN);
    public static final Block KAPOK_PLANKS = registerWoodBlock(KAPOK);
    public static final Block MAHOGANY_PLANKS = registerWoodBlock(MAHOGANY);
    public static final Block EUCALYPTUS_PLANKS = registerWoodBlock(EUCALYPTUS);
    public static final Block BAOBAB_PLANKS = registerWoodBlock(BAOBAB);
    public static final Block PALO_VERDE_PLANKS = registerWoodBlock(PALO_VERDE);
    public static final Block JOSHUA_PLANKS = registerWoodBlock(JOSHUA);
    public static final Block JUNIPER_PLANKS = registerWoodBlock(JUNIPER);
    public static final Block PALM_PLANKS = registerWoodBlock(PALM);
    public static final Block EBONY_PLANKS = registerWoodBlock(EBONY);
    public static final Block TEAK_PLANKS = registerWoodBlock(TEAK);
    public static final Block ELM_PLANKS = registerWoodBlock(ELM);
    public static final Block WILLOW_PLANKS = registerWoodBlock(WILLOW);
    public static final Block CYPRESS_PLANKS = registerWoodBlock(CYPRESS);
    public static final Block SAKURA_PLANKS = registerWoodBlock(SAKURA);
    public static final Block MAGNOLIA_PLANKS = registerWoodBlock(MAGNOLIA);
    public static final Block JACARANDA_PLANKS = registerWoodBlock(JACARANDA);

    public static final Block MAPLE_STAIRS = registerWoodBlock(MAPLE, STAIRS);
    public static final Block POPLAR_STAIRS = registerWoodBlock(POPLAR, STAIRS);
    public static final Block BEECH_STAIRS = registerWoodBlock(BEECH, STAIRS);
    public static final Block HICKORY_STAIRS = registerWoodBlock(HICKORY, STAIRS);
    public static final Block WALNUT_STAIRS = registerWoodBlock(WALNUT, STAIRS);
    public static final Block CHESTNUT_STAIRS = registerWoodBlock(CHESTNUT, STAIRS);
    public static final Block CEDAR_STAIRS = registerWoodBlock(CEDAR, STAIRS);
    public static final Block REDWOOD_STAIRS = registerWoodBlock(REDWOOD, STAIRS);
    public static final Block FIR_STAIRS = registerWoodBlock(FIR, STAIRS);
    public static final Block HEMLOCK_STAIRS = registerWoodBlock(HEMLOCK, STAIRS);
    public static final Block HOLLY_STAIRS = registerWoodBlock(HOLLY, STAIRS);
    public static final Block PINE_STAIRS = registerWoodBlock(PINE, STAIRS);
    public static final Block LARCH_STAIRS = registerWoodBlock(LARCH, STAIRS);
    public static final Block ASPEN_STAIRS = registerWoodBlock(ASPEN, STAIRS);
    public static final Block KAPOK_STAIRS = registerWoodBlock(KAPOK, STAIRS);
    public static final Block MAHOGANY_STAIRS = registerWoodBlock(MAHOGANY, STAIRS);
    public static final Block EUCALYPTUS_STAIRS = registerWoodBlock(EUCALYPTUS, STAIRS);
    public static final Block BAOBAB_STAIRS = registerWoodBlock(BAOBAB, STAIRS);
    public static final Block PALO_VERDE_STAIRS = registerWoodBlock(PALO_VERDE, STAIRS);
    public static final Block JOSHUA_STAIRS = registerWoodBlock(JOSHUA, STAIRS);
    public static final Block JUNIPER_STAIRS = registerWoodBlock(JUNIPER, STAIRS);
    public static final Block PALM_STAIRS = registerWoodBlock(PALM, STAIRS);
    public static final Block EBONY_STAIRS = registerWoodBlock(EBONY, STAIRS);
    public static final Block TEAK_STAIRS = registerWoodBlock(TEAK, STAIRS);
    public static final Block ELM_STAIRS = registerWoodBlock(ELM, STAIRS);
    public static final Block WILLOW_STAIRS = registerWoodBlock(WILLOW, STAIRS);
    public static final Block CYPRESS_STAIRS = registerWoodBlock(CYPRESS, STAIRS);
    public static final Block SAKURA_STAIRS = registerWoodBlock(SAKURA, STAIRS);
    public static final Block MAGNOLIA_STAIRS = registerWoodBlock(MAGNOLIA, STAIRS);
    public static final Block JACARANDA_STAIRS = registerWoodBlock(JACARANDA, STAIRS);

    public static final Block MAPLE_SLAB = registerWoodBlock(MAPLE, SLAB);
    public static final Block POPLAR_SLAB = registerWoodBlock(POPLAR, SLAB);
    public static final Block BEECH_SLAB = registerWoodBlock(BEECH, SLAB);
    public static final Block HICKORY_SLAB = registerWoodBlock(HICKORY, SLAB);
    public static final Block WALNUT_SLAB = registerWoodBlock(WALNUT, SLAB);
    public static final Block CHESTNUT_SLAB = registerWoodBlock(CHESTNUT, SLAB);
    public static final Block CEDAR_SLAB = registerWoodBlock(CEDAR, SLAB);
    public static final Block REDWOOD_SLAB = registerWoodBlock(REDWOOD, SLAB);
    public static final Block FIR_SLAB = registerWoodBlock(FIR, SLAB);
    public static final Block HEMLOCK_SLAB = registerWoodBlock(HEMLOCK, SLAB);
    public static final Block HOLLY_SLAB = registerWoodBlock(HOLLY, SLAB);
    public static final Block PINE_SLAB = registerWoodBlock(PINE, SLAB);
    public static final Block LARCH_SLAB = registerWoodBlock(LARCH, SLAB);
    public static final Block ASPEN_SLAB = registerWoodBlock(ASPEN, SLAB);
    public static final Block KAPOK_SLAB = registerWoodBlock(KAPOK, SLAB);
    public static final Block MAHOGANY_SLAB = registerWoodBlock(MAHOGANY, SLAB);
    public static final Block EUCALYPTUS_SLAB = registerWoodBlock(EUCALYPTUS, SLAB);
    public static final Block BAOBAB_SLAB = registerWoodBlock(BAOBAB, SLAB);
    public static final Block PALO_VERDE_SLAB = registerWoodBlock(PALO_VERDE, SLAB);
    public static final Block JOSHUA_SLAB = registerWoodBlock(JOSHUA, SLAB);
    public static final Block JUNIPER_SLAB = registerWoodBlock(JUNIPER, SLAB);
    public static final Block PALM_SLAB = registerWoodBlock(PALM, SLAB);
    public static final Block EBONY_SLAB = registerWoodBlock(EBONY, SLAB);
    public static final Block TEAK_SLAB = registerWoodBlock(TEAK, SLAB);
    public static final Block ELM_SLAB = registerWoodBlock(ELM, SLAB);
    public static final Block WILLOW_SLAB = registerWoodBlock(WILLOW, SLAB);
    public static final Block CYPRESS_SLAB = registerWoodBlock(CYPRESS, SLAB);
    public static final Block SAKURA_SLAB = registerWoodBlock(SAKURA, SLAB);
    public static final Block MAGNOLIA_SLAB = registerWoodBlock(MAGNOLIA, SLAB);
    public static final Block JACARANDA_SLAB = registerWoodBlock(JACARANDA, SLAB);

    public static final Block MAPLE_FENCE = registerWoodBlock(MAPLE, FENCE);
    public static final Block POPLAR_FENCE = registerWoodBlock(POPLAR, FENCE);
    public static final Block BEECH_FENCE = registerWoodBlock(BEECH, FENCE);
    public static final Block HICKORY_FENCE = registerWoodBlock(HICKORY, FENCE);
    public static final Block WALNUT_FENCE = registerWoodBlock(WALNUT, FENCE);
    public static final Block CHESTNUT_FENCE = registerWoodBlock(CHESTNUT, FENCE);
    public static final Block CEDAR_FENCE = registerWoodBlock(CEDAR, FENCE);
    public static final Block REDWOOD_FENCE = registerWoodBlock(REDWOOD, FENCE);
    public static final Block FIR_FENCE = registerWoodBlock(FIR, FENCE);
    public static final Block HEMLOCK_FENCE = registerWoodBlock(HEMLOCK, FENCE);
    public static final Block HOLLY_FENCE = registerWoodBlock(HOLLY, FENCE);
    public static final Block PINE_FENCE = registerWoodBlock(PINE, FENCE);
    public static final Block LARCH_FENCE = registerWoodBlock(LARCH, FENCE);
    public static final Block ASPEN_FENCE = registerWoodBlock(ASPEN, FENCE);
    public static final Block KAPOK_FENCE = registerWoodBlock(KAPOK, FENCE);
    public static final Block MAHOGANY_FENCE = registerWoodBlock(MAHOGANY, FENCE);
    public static final Block EUCALYPTUS_FENCE = registerWoodBlock(EUCALYPTUS, FENCE);
    public static final Block BAOBAB_FENCE = registerWoodBlock(BAOBAB, FENCE);
    public static final Block PALO_VERDE_FENCE = registerWoodBlock(PALO_VERDE, FENCE);
    public static final Block JOSHUA_FENCE = registerWoodBlock(JOSHUA, FENCE);
    public static final Block JUNIPER_FENCE = registerWoodBlock(JUNIPER, FENCE);
    public static final Block PALM_FENCE = registerWoodBlock(PALM, FENCE);
    public static final Block EBONY_FENCE = registerWoodBlock(EBONY, FENCE);
    public static final Block TEAK_FENCE = registerWoodBlock(TEAK, FENCE);
    public static final Block ELM_FENCE = registerWoodBlock(ELM, FENCE);
    public static final Block WILLOW_FENCE = registerWoodBlock(WILLOW, FENCE);
    public static final Block CYPRESS_FENCE = registerWoodBlock(CYPRESS, FENCE);
    public static final Block SAKURA_FENCE = registerWoodBlock(SAKURA, FENCE);
    public static final Block MAGNOLIA_FENCE = registerWoodBlock(MAGNOLIA, FENCE);
    public static final Block JACARANDA_FENCE = registerWoodBlock(JACARANDA, FENCE);

    public static final Block MAPLE_FENCE_GATE = registerWoodBlock(MAPLE, FENCE_GATE);
    public static final Block POPLAR_FENCE_GATE = registerWoodBlock(POPLAR, FENCE_GATE);
    public static final Block BEECH_FENCE_GATE = registerWoodBlock(BEECH, FENCE_GATE);
    public static final Block HICKORY_FENCE_GATE = registerWoodBlock(HICKORY, FENCE_GATE);
    public static final Block WALNUT_FENCE_GATE = registerWoodBlock(WALNUT, FENCE_GATE);
    public static final Block CHESTNUT_FENCE_GATE = registerWoodBlock(CHESTNUT, FENCE_GATE);
    public static final Block CEDAR_FENCE_GATE = registerWoodBlock(CEDAR, FENCE_GATE);
    public static final Block REDWOOD_FENCE_GATE = registerWoodBlock(REDWOOD, FENCE_GATE);
    public static final Block FIR_FENCE_GATE = registerWoodBlock(FIR, FENCE_GATE);
    public static final Block HEMLOCK_FENCE_GATE = registerWoodBlock(HEMLOCK, FENCE_GATE);
    public static final Block HOLLY_FENCE_GATE = registerWoodBlock(HOLLY, FENCE_GATE);
    public static final Block PINE_FENCE_GATE = registerWoodBlock(PINE, FENCE_GATE);
    public static final Block LARCH_FENCE_GATE = registerWoodBlock(LARCH, FENCE_GATE);
    public static final Block ASPEN_FENCE_GATE = registerWoodBlock(ASPEN, FENCE_GATE);
    public static final Block KAPOK_FENCE_GATE = registerWoodBlock(KAPOK, FENCE_GATE);
    public static final Block MAHOGANY_FENCE_GATE = registerWoodBlock(MAHOGANY, FENCE_GATE);
    public static final Block EUCALYPTUS_FENCE_GATE = registerWoodBlock(EUCALYPTUS, FENCE_GATE);
    public static final Block BAOBAB_FENCE_GATE = registerWoodBlock(BAOBAB, FENCE_GATE);
    public static final Block PALO_VERDE_FENCE_GATE = registerWoodBlock(PALO_VERDE, FENCE_GATE);
    public static final Block JOSHUA_FENCE_GATE = registerWoodBlock(JOSHUA, FENCE_GATE);
    public static final Block JUNIPER_FENCE_GATE = registerWoodBlock(JUNIPER, FENCE_GATE);
    public static final Block PALM_FENCE_GATE = registerWoodBlock(PALM, FENCE_GATE);
    public static final Block EBONY_FENCE_GATE = registerWoodBlock(EBONY, FENCE_GATE);
    public static final Block TEAK_FENCE_GATE = registerWoodBlock(TEAK, FENCE_GATE);
    public static final Block ELM_FENCE_GATE = registerWoodBlock(ELM, FENCE_GATE);
    public static final Block WILLOW_FENCE_GATE = registerWoodBlock(WILLOW, FENCE_GATE);
    public static final Block CYPRESS_FENCE_GATE = registerWoodBlock(CYPRESS, FENCE_GATE);
    public static final Block SAKURA_FENCE_GATE = registerWoodBlock(SAKURA, FENCE_GATE);
    public static final Block MAGNOLIA_FENCE_GATE = registerWoodBlock(MAGNOLIA, FENCE_GATE);
    public static final Block JACARANDA_FENCE_GATE = registerWoodBlock(JACARANDA, FENCE_GATE);

    public static final Block MAPLE_DOOR = registerWoodBlock(MAPLE, DOOR);
    public static final Block POPLAR_DOOR = registerWoodBlock(POPLAR, DOOR);
    public static final Block BEECH_DOOR = registerWoodBlock(BEECH, DOOR);
    public static final Block HICKORY_DOOR = registerWoodBlock(HICKORY, DOOR);
    public static final Block WALNUT_DOOR = registerWoodBlock(WALNUT, DOOR);
    public static final Block CHESTNUT_DOOR = registerWoodBlock(CHESTNUT, DOOR);
    public static final Block CEDAR_DOOR = registerWoodBlock(CEDAR, DOOR);
    public static final Block REDWOOD_DOOR = registerWoodBlock(REDWOOD, DOOR);
    public static final Block FIR_DOOR = registerWoodBlock(FIR, DOOR);
    public static final Block HEMLOCK_DOOR = registerWoodBlock(HEMLOCK, DOOR);
    public static final Block HOLLY_DOOR = registerWoodBlock(HOLLY, DOOR);
    public static final Block PINE_DOOR = registerWoodBlock(PINE, DOOR);
    public static final Block LARCH_DOOR = registerWoodBlock(LARCH, DOOR);
    public static final Block ASPEN_DOOR = registerWoodBlock(ASPEN, DOOR);
    public static final Block KAPOK_DOOR = registerWoodBlock(KAPOK, DOOR);
    public static final Block MAHOGANY_DOOR = registerWoodBlock(MAHOGANY, DOOR);
    public static final Block EUCALYPTUS_DOOR = registerWoodBlock(EUCALYPTUS, DOOR);
    public static final Block BAOBAB_DOOR = registerWoodBlock(BAOBAB, DOOR);
    public static final Block PALO_VERDE_DOOR = registerWoodBlock(PALO_VERDE, DOOR);
    public static final Block JOSHUA_DOOR = registerWoodBlock(JOSHUA, DOOR);
    public static final Block JUNIPER_DOOR = registerWoodBlock(JUNIPER, DOOR);
    public static final Block PALM_DOOR = registerWoodBlock(PALM, DOOR);
    public static final Block EBONY_DOOR = registerWoodBlock(EBONY, DOOR);
    public static final Block TEAK_DOOR = registerWoodBlock(TEAK, DOOR);
    public static final Block ELM_DOOR = registerWoodBlock(ELM, DOOR);
    public static final Block WILLOW_DOOR = registerWoodBlock(WILLOW, DOOR);
    public static final Block CYPRESS_DOOR = registerWoodBlock(CYPRESS, DOOR);
    public static final Block SAKURA_DOOR = registerWoodBlock(SAKURA, DOOR);
    public static final Block MAGNOLIA_DOOR = registerWoodBlock(MAGNOLIA, DOOR);
    public static final Block JACARANDA_DOOR = registerWoodBlock(JACARANDA, DOOR);

    public static final Block MAPLE_TRAPDOOR = registerWoodBlock(MAPLE, TRAPDOOR);
    public static final Block POPLAR_TRAPDOOR = registerWoodBlock(POPLAR, TRAPDOOR);
    public static final Block BEECH_TRAPDOOR = registerWoodBlock(BEECH, TRAPDOOR);
    public static final Block HICKORY_TRAPDOOR = registerWoodBlock(HICKORY, TRAPDOOR);
    public static final Block WALNUT_TRAPDOOR = registerWoodBlock(WALNUT, TRAPDOOR);
    public static final Block CHESTNUT_TRAPDOOR = registerWoodBlock(CHESTNUT, TRAPDOOR);
    public static final Block CEDAR_TRAPDOOR = registerWoodBlock(CEDAR, TRAPDOOR);
    public static final Block REDWOOD_TRAPDOOR = registerWoodBlock(REDWOOD, TRAPDOOR);
    public static final Block FIR_TRAPDOOR = registerWoodBlock(FIR, TRAPDOOR);
    public static final Block HEMLOCK_TRAPDOOR = registerWoodBlock(HEMLOCK, TRAPDOOR);
    public static final Block HOLLY_TRAPDOOR = registerWoodBlock(HOLLY, TRAPDOOR);
    public static final Block PINE_TRAPDOOR = registerWoodBlock(PINE, TRAPDOOR);
    public static final Block LARCH_TRAPDOOR = registerWoodBlock(LARCH, TRAPDOOR);
    public static final Block ASPEN_TRAPDOOR = registerWoodBlock(ASPEN, TRAPDOOR);
    public static final Block KAPOK_TRAPDOOR = registerWoodBlock(KAPOK, TRAPDOOR);
    public static final Block MAHOGANY_TRAPDOOR = registerWoodBlock(MAHOGANY, TRAPDOOR);
    public static final Block EUCALYPTUS_TRAPDOOR = registerWoodBlock(EUCALYPTUS, TRAPDOOR);
    public static final Block BAOBAB_TRAPDOOR = registerWoodBlock(BAOBAB, TRAPDOOR);
    public static final Block PALO_VERDE_TRAPDOOR = registerWoodBlock(PALO_VERDE, TRAPDOOR);
    public static final Block JOSHUA_TRAPDOOR = registerWoodBlock(JOSHUA, TRAPDOOR);
    public static final Block JUNIPER_TRAPDOOR = registerWoodBlock(JUNIPER, TRAPDOOR);
    public static final Block PALM_TRAPDOOR = registerWoodBlock(PALM, TRAPDOOR);
    public static final Block EBONY_TRAPDOOR = registerWoodBlock(EBONY, TRAPDOOR);
    public static final Block TEAK_TRAPDOOR = registerWoodBlock(TEAK, TRAPDOOR);
    public static final Block ELM_TRAPDOOR = registerWoodBlock(ELM, TRAPDOOR);
    public static final Block WILLOW_TRAPDOOR = registerWoodBlock(WILLOW, TRAPDOOR);
    public static final Block CYPRESS_TRAPDOOR = registerWoodBlock(CYPRESS, TRAPDOOR);
    public static final Block SAKURA_TRAPDOOR = registerWoodBlock(SAKURA, TRAPDOOR);
    public static final Block MAGNOLIA_TRAPDOOR = registerWoodBlock(MAGNOLIA, TRAPDOOR);
    public static final Block JACARANDA_TRAPDOOR = registerWoodBlock(JACARANDA, TRAPDOOR);

    public static final Block MAPLE_PRESSURE_PLATE = registerWoodBlock(MAPLE, PRESSURE_PLATE);
    public static final Block POPLAR_PRESSURE_PLATE = registerWoodBlock(POPLAR, PRESSURE_PLATE);
    public static final Block BEECH_PRESSURE_PLATE = registerWoodBlock(BEECH, PRESSURE_PLATE);
    public static final Block HICKORY_PRESSURE_PLATE = registerWoodBlock(HICKORY, PRESSURE_PLATE);
    public static final Block WALNUT_PRESSURE_PLATE = registerWoodBlock(WALNUT, PRESSURE_PLATE);
    public static final Block CHESTNUT_PRESSURE_PLATE = registerWoodBlock(CHESTNUT, PRESSURE_PLATE);
    public static final Block CEDAR_PRESSURE_PLATE = registerWoodBlock(CEDAR, PRESSURE_PLATE);
    public static final Block REDWOOD_PRESSURE_PLATE = registerWoodBlock(REDWOOD, PRESSURE_PLATE);
    public static final Block FIR_PRESSURE_PLATE = registerWoodBlock(FIR, PRESSURE_PLATE);
    public static final Block HEMLOCK_PRESSURE_PLATE = registerWoodBlock(HEMLOCK, PRESSURE_PLATE);
    public static final Block HOLLY_PRESSURE_PLATE = registerWoodBlock(HOLLY, PRESSURE_PLATE);
    public static final Block PINE_PRESSURE_PLATE = registerWoodBlock(PINE, PRESSURE_PLATE);
    public static final Block LARCH_PRESSURE_PLATE = registerWoodBlock(LARCH, PRESSURE_PLATE);
    public static final Block ASPEN_PRESSURE_PLATE = registerWoodBlock(ASPEN, PRESSURE_PLATE);
    public static final Block KAPOK_PRESSURE_PLATE = registerWoodBlock(KAPOK, PRESSURE_PLATE);
    public static final Block MAHOGANY_PRESSURE_PLATE = registerWoodBlock(MAHOGANY, PRESSURE_PLATE);
    public static final Block EUCALYPTUS_PRESSURE_PLATE = registerWoodBlock(EUCALYPTUS, PRESSURE_PLATE);
    public static final Block BAOBAB_PRESSURE_PLATE = registerWoodBlock(BAOBAB, PRESSURE_PLATE);
    public static final Block PALO_VERDE_PRESSURE_PLATE = registerWoodBlock(PALO_VERDE, PRESSURE_PLATE);
    public static final Block JOSHUA_PRESSURE_PLATE = registerWoodBlock(JOSHUA, PRESSURE_PLATE);
    public static final Block JUNIPER_PRESSURE_PLATE = registerWoodBlock(JUNIPER, PRESSURE_PLATE);
    public static final Block PALM_PRESSURE_PLATE = registerWoodBlock(PALM, PRESSURE_PLATE);
    public static final Block EBONY_PRESSURE_PLATE = registerWoodBlock(EBONY, PRESSURE_PLATE);
    public static final Block TEAK_PRESSURE_PLATE = registerWoodBlock(TEAK, PRESSURE_PLATE);
    public static final Block ELM_PRESSURE_PLATE = registerWoodBlock(ELM, PRESSURE_PLATE);
    public static final Block WILLOW_PRESSURE_PLATE = registerWoodBlock(WILLOW, PRESSURE_PLATE);
    public static final Block CYPRESS_PRESSURE_PLATE = registerWoodBlock(CYPRESS, PRESSURE_PLATE);
    public static final Block SAKURA_PRESSURE_PLATE = registerWoodBlock(SAKURA, PRESSURE_PLATE);
    public static final Block MAGNOLIA_PRESSURE_PLATE = registerWoodBlock(MAGNOLIA, PRESSURE_PLATE);
    public static final Block JACARANDA_PRESSURE_PLATE = registerWoodBlock(JACARANDA, PRESSURE_PLATE);

    public static final Block MAPLE_BUTTON = registerWoodBlock(MAPLE, BUTTON);
    public static final Block POPLAR_BUTTON = registerWoodBlock(POPLAR, BUTTON);
    public static final Block BEECH_BUTTON = registerWoodBlock(BEECH, BUTTON);
    public static final Block HICKORY_BUTTON = registerWoodBlock(HICKORY, BUTTON);
    public static final Block WALNUT_BUTTON = registerWoodBlock(WALNUT, BUTTON);
    public static final Block CHESTNUT_BUTTON = registerWoodBlock(CHESTNUT, BUTTON);
    public static final Block CEDAR_BUTTON = registerWoodBlock(CEDAR, BUTTON);
    public static final Block REDWOOD_BUTTON = registerWoodBlock(REDWOOD, BUTTON);
    public static final Block FIR_BUTTON = registerWoodBlock(FIR, BUTTON);
    public static final Block HEMLOCK_BUTTON = registerWoodBlock(HEMLOCK, BUTTON);
    public static final Block HOLLY_BUTTON = registerWoodBlock(HOLLY, BUTTON);
    public static final Block PINE_BUTTON = registerWoodBlock(PINE, BUTTON);
    public static final Block LARCH_BUTTON = registerWoodBlock(LARCH, BUTTON);
    public static final Block ASPEN_BUTTON = registerWoodBlock(ASPEN, BUTTON);
    public static final Block KAPOK_BUTTON = registerWoodBlock(KAPOK, BUTTON);
    public static final Block MAHOGANY_BUTTON = registerWoodBlock(MAHOGANY, BUTTON);
    public static final Block EUCALYPTUS_BUTTON = registerWoodBlock(EUCALYPTUS, BUTTON);
    public static final Block BAOBAB_BUTTON = registerWoodBlock(BAOBAB, BUTTON);
    public static final Block PALO_VERDE_BUTTON = registerWoodBlock(PALO_VERDE, BUTTON);
    public static final Block JOSHUA_BUTTON = registerWoodBlock(JOSHUA, BUTTON);
    public static final Block JUNIPER_BUTTON = registerWoodBlock(JUNIPER, BUTTON);
    public static final Block PALM_BUTTON = registerWoodBlock(PALM, BUTTON);
    public static final Block EBONY_BUTTON = registerWoodBlock(EBONY, BUTTON);
    public static final Block TEAK_BUTTON = registerWoodBlock(TEAK, BUTTON);
    public static final Block ELM_BUTTON = registerWoodBlock(ELM, BUTTON);
    public static final Block WILLOW_BUTTON = registerWoodBlock(WILLOW, BUTTON);
    public static final Block CYPRESS_BUTTON = registerWoodBlock(CYPRESS, BUTTON);
    public static final Block SAKURA_BUTTON = registerWoodBlock(SAKURA, BUTTON);
    public static final Block MAGNOLIA_BUTTON = registerWoodBlock(MAGNOLIA, BUTTON);
    public static final Block JACARANDA_BUTTON = registerWoodBlock(JACARANDA, BUTTON);

    public static final Block MAPLE_SIGN = registerSignBlock(MAPLE, false);
    public static final Block POPLAR_SIGN = registerSignBlock(POPLAR, false);
    public static final Block BEECH_SIGN = registerSignBlock(BEECH, false);
    public static final Block HICKORY_SIGN = registerSignBlock(HICKORY, false);
    public static final Block WALNUT_SIGN = registerSignBlock(WALNUT, false);
    public static final Block CHESTNUT_SIGN = registerSignBlock(CHESTNUT, false);
    public static final Block CEDAR_SIGN = registerSignBlock(CEDAR, false);
    public static final Block REDWOOD_SIGN = registerSignBlock(REDWOOD, false);
    public static final Block FIR_SIGN = registerSignBlock(FIR, false);
    public static final Block HEMLOCK_SIGN = registerSignBlock(HEMLOCK, false);
    public static final Block HOLLY_SIGN = registerSignBlock(HOLLY, false);
    public static final Block PINE_SIGN = registerSignBlock(PINE, false);
    public static final Block LARCH_SIGN = registerSignBlock(LARCH, false);
    public static final Block ASPEN_SIGN = registerSignBlock(ASPEN, false);
    public static final Block KAPOK_SIGN = registerSignBlock(KAPOK, false);
    public static final Block MAHOGANY_SIGN = registerSignBlock(MAHOGANY, false);
    public static final Block EUCALYPTUS_SIGN = registerSignBlock(EUCALYPTUS, false);
    public static final Block BAOBAB_SIGN = registerSignBlock(BAOBAB, false);
    public static final Block PALO_VERDE_SIGN = registerSignBlock(PALO_VERDE, false);
    public static final Block JOSHUA_SIGN = registerSignBlock(JOSHUA, false);
    public static final Block JUNIPER_SIGN = registerSignBlock(JUNIPER, false);
    public static final Block PALM_SIGN = registerSignBlock(PALM, false);
    public static final Block EBONY_SIGN = registerSignBlock(EBONY, false);
    public static final Block TEAK_SIGN = registerSignBlock(TEAK, false);
    public static final Block ELM_SIGN = registerSignBlock(ELM, false);
    public static final Block WILLOW_SIGN = registerSignBlock(WILLOW, false);
    public static final Block CYPRESS_SIGN = registerSignBlock(CYPRESS, false);
    public static final Block SAKURA_SIGN = registerSignBlock(SAKURA, false);
    public static final Block MAGNOLIA_SIGN = registerSignBlock(MAGNOLIA, false);
    public static final Block JACARANDA_SIGN = registerSignBlock(JACARANDA, false);

    public static final Block MAPLE_WALL_SIGN = registerSignBlock(MAPLE, false, MAPLE_SIGN);
    public static final Block POPLAR_WALL_SIGN = registerSignBlock(POPLAR, false, POPLAR_SIGN);
    public static final Block BEECH_WALL_SIGN = registerSignBlock(BEECH, false, BEECH_SIGN);
    public static final Block HICKORY_WALL_SIGN = registerSignBlock(HICKORY, false, HICKORY_SIGN);
    public static final Block WALNUT_WALL_SIGN = registerSignBlock(WALNUT, false, WALNUT_SIGN);
    public static final Block CHESTNUT_WALL_SIGN = registerSignBlock(CHESTNUT, false, CHESTNUT_SIGN);
    public static final Block CEDAR_WALL_SIGN = registerSignBlock(CEDAR, false, CEDAR_SIGN);
    public static final Block REDWOOD_WALL_SIGN = registerSignBlock(REDWOOD, false, REDWOOD_SIGN);
    public static final Block FIR_WALL_SIGN = registerSignBlock(FIR, false, FIR_SIGN);
    public static final Block HEMLOCK_WALL_SIGN = registerSignBlock(HEMLOCK, false, HEMLOCK_SIGN);
    public static final Block HOLLY_WALL_SIGN = registerSignBlock(HOLLY, false, HOLLY_SIGN);
    public static final Block PINE_WALL_SIGN = registerSignBlock(PINE, false, PINE_SIGN);
    public static final Block LARCH_WALL_SIGN = registerSignBlock(LARCH, false, LARCH_SIGN);
    public static final Block ASPEN_WALL_SIGN = registerSignBlock(ASPEN, false, ASPEN_SIGN);
    public static final Block KAPOK_WALL_SIGN = registerSignBlock(KAPOK, false, KAPOK_SIGN);
    public static final Block MAHOGANY_WALL_SIGN = registerSignBlock(MAHOGANY, false, MAHOGANY_SIGN);
    public static final Block EUCALYPTUS_WALL_SIGN = registerSignBlock(EUCALYPTUS, false, EUCALYPTUS_SIGN);
    public static final Block BAOBAB_WALL_SIGN = registerSignBlock(BAOBAB, false, BAOBAB_SIGN);
    public static final Block PALO_VERDE_WALL_SIGN = registerSignBlock(PALO_VERDE, false, PALO_VERDE_SIGN);
    public static final Block JOSHUA_WALL_SIGN = registerSignBlock(JOSHUA, false, JOSHUA_SIGN);
    public static final Block JUNIPER_WALL_SIGN = registerSignBlock(JUNIPER, false, JUNIPER_SIGN);
    public static final Block PALM_WALL_SIGN = registerSignBlock(PALM, false, PALM_SIGN);
    public static final Block EBONY_WALL_SIGN = registerSignBlock(EBONY, false, EBONY_SIGN);
    public static final Block TEAK_WALL_SIGN = registerSignBlock(TEAK, false, TEAK_SIGN);
    public static final Block ELM_WALL_SIGN = registerSignBlock(ELM, false, ELM_SIGN);
    public static final Block WILLOW_WALL_SIGN = registerSignBlock(WILLOW, false, WILLOW_SIGN);
    public static final Block CYPRESS_WALL_SIGN = registerSignBlock(CYPRESS, false, CYPRESS_SIGN);
    public static final Block SAKURA_WALL_SIGN = registerSignBlock(SAKURA, false, SAKURA_SIGN);
    public static final Block MAGNOLIA_WALL_SIGN = registerSignBlock(MAGNOLIA, false, MAGNOLIA_SIGN);
    public static final Block JACARANDA_WALL_SIGN = registerSignBlock(JACARANDA, false, JACARANDA_SIGN);


    public static final Block MAPLE_HANGING_SIGN = registerSignBlock(MAPLE, true);
    public static final Block POPLAR_HANGING_SIGN = registerSignBlock(POPLAR, true);
    public static final Block BEECH_HANGING_SIGN = registerSignBlock(BEECH, true);
    public static final Block HICKORY_HANGING_SIGN = registerSignBlock(HICKORY, true);
    public static final Block WALNUT_HANGING_SIGN = registerSignBlock(WALNUT, true);
    public static final Block CHESTNUT_HANGING_SIGN = registerSignBlock(CHESTNUT, true);
    public static final Block CEDAR_HANGING_SIGN = registerSignBlock(CEDAR, true);
    public static final Block REDWOOD_HANGING_SIGN = registerSignBlock(REDWOOD, true);
    public static final Block FIR_HANGING_SIGN = registerSignBlock(FIR, true);
    public static final Block HEMLOCK_HANGING_SIGN = registerSignBlock(HEMLOCK, true);
    public static final Block HOLLY_HANGING_SIGN = registerSignBlock(HOLLY, true);
    public static final Block PINE_HANGING_SIGN = registerSignBlock(PINE, true);
    public static final Block LARCH_HANGING_SIGN = registerSignBlock(LARCH, true);
    public static final Block ASPEN_HANGING_SIGN = registerSignBlock(ASPEN, true);
    public static final Block KAPOK_HANGING_SIGN = registerSignBlock(KAPOK, true);
    public static final Block MAHOGANY_HANGING_SIGN = registerSignBlock(MAHOGANY, true);
    public static final Block EUCALYPTUS_HANGING_SIGN = registerSignBlock(EUCALYPTUS, true);
    public static final Block BAOBAB_HANGING_SIGN = registerSignBlock(BAOBAB, true);
    public static final Block PALO_VERDE_HANGING_SIGN = registerSignBlock(PALO_VERDE, true);
    public static final Block JOSHUA_HANGING_SIGN = registerSignBlock(JOSHUA, true);
    public static final Block JUNIPER_HANGING_SIGN = registerSignBlock(JUNIPER, true);
    public static final Block PALM_HANGING_SIGN = registerSignBlock(PALM, true);
    public static final Block EBONY_HANGING_SIGN = registerSignBlock(EBONY, true);
    public static final Block TEAK_HANGING_SIGN = registerSignBlock(TEAK, true);
    public static final Block ELM_HANGING_SIGN = registerSignBlock(ELM, true);
    public static final Block WILLOW_HANGING_SIGN = registerSignBlock(WILLOW, true);
    public static final Block CYPRESS_HANGING_SIGN = registerSignBlock(CYPRESS, true);
    public static final Block SAKURA_HANGING_SIGN = registerSignBlock(SAKURA, true);
    public static final Block MAGNOLIA_HANGING_SIGN = registerSignBlock(MAGNOLIA, true);
    public static final Block JACARANDA_HANGING_SIGN = registerSignBlock(JACARANDA, true);

    public static final Block MAPLE_WALL_HANGING_SIGN = registerSignBlock(MAPLE, true, MAPLE_HANGING_SIGN);
    public static final Block POPLAR_WALL_HANGING_SIGN = registerSignBlock(POPLAR, true, POPLAR_HANGING_SIGN);
    public static final Block BEECH_WALL_HANGING_SIGN = registerSignBlock(BEECH, true, BEECH_HANGING_SIGN);
    public static final Block HICKORY_WALL_HANGING_SIGN = registerSignBlock(HICKORY, true, HICKORY_HANGING_SIGN);
    public static final Block WALNUT_WALL_HANGING_SIGN = registerSignBlock(WALNUT, true, WALNUT_HANGING_SIGN);
    public static final Block CHESTNUT_WALL_HANGING_SIGN = registerSignBlock(CHESTNUT, true, CHESTNUT_HANGING_SIGN);
    public static final Block CEDAR_WALL_HANGING_SIGN = registerSignBlock(CEDAR, true, CEDAR_HANGING_SIGN);
    public static final Block REDWOOD_WALL_HANGING_SIGN = registerSignBlock(REDWOOD, true, REDWOOD_HANGING_SIGN);
    public static final Block FIR_WALL_HANGING_SIGN = registerSignBlock(FIR, true, FIR_HANGING_SIGN);
    public static final Block HEMLOCK_WALL_HANGING_SIGN = registerSignBlock(HEMLOCK, true, HEMLOCK_HANGING_SIGN);
    public static final Block HOLLY_WALL_HANGING_SIGN = registerSignBlock(HOLLY, true, HOLLY_HANGING_SIGN);
    public static final Block PINE_WALL_HANGING_SIGN = registerSignBlock(PINE, true, PINE_HANGING_SIGN);
    public static final Block LARCH_WALL_HANGING_SIGN = registerSignBlock(LARCH, true, LARCH_HANGING_SIGN);
    public static final Block ASPEN_WALL_HANGING_SIGN = registerSignBlock(ASPEN, true, ASPEN_HANGING_SIGN);
    public static final Block KAPOK_WALL_HANGING_SIGN = registerSignBlock(KAPOK, true, KAPOK_HANGING_SIGN);
    public static final Block MAHOGANY_WALL_HANGING_SIGN = registerSignBlock(MAHOGANY, true, MAHOGANY_HANGING_SIGN);
    public static final Block EUCALYPTUS_WALL_HANGING_SIGN = registerSignBlock(EUCALYPTUS, true, EUCALYPTUS_HANGING_SIGN);
    public static final Block BAOBAB_WALL_HANGING_SIGN = registerSignBlock(BAOBAB, true, BAOBAB_HANGING_SIGN);
    public static final Block PALO_VERDE_WALL_HANGING_SIGN = registerSignBlock(PALO_VERDE, true, PALO_VERDE_HANGING_SIGN);
    public static final Block JOSHUA_WALL_HANGING_SIGN = registerSignBlock(JOSHUA, true, JOSHUA_HANGING_SIGN);
    public static final Block JUNIPER_WALL_HANGING_SIGN = registerSignBlock(JUNIPER, true, JUNIPER_HANGING_SIGN);
    public static final Block PALM_WALL_HANGING_SIGN = registerSignBlock(PALM, true, PALM_HANGING_SIGN);
    public static final Block EBONY_WALL_HANGING_SIGN = registerSignBlock(EBONY, true, EBONY_HANGING_SIGN);
    public static final Block TEAK_WALL_HANGING_SIGN = registerSignBlock(TEAK, true, TEAK_HANGING_SIGN);
    public static final Block ELM_WALL_HANGING_SIGN = registerSignBlock(ELM, true, ELM_HANGING_SIGN);
    public static final Block WILLOW_WALL_HANGING_SIGN = registerSignBlock(WILLOW, true, WILLOW_HANGING_SIGN);
    public static final Block CYPRESS_WALL_HANGING_SIGN = registerSignBlock(CYPRESS, true, CYPRESS_HANGING_SIGN);
    public static final Block SAKURA_WALL_HANGING_SIGN = registerSignBlock(SAKURA, true, SAKURA_HANGING_SIGN);
    public static final Block MAGNOLIA_WALL_HANGING_SIGN = registerSignBlock(MAGNOLIA, true, MAGNOLIA_HANGING_SIGN);
    public static final Block JACARANDA_WALL_HANGING_SIGN = registerSignBlock(JACARANDA, true, JACARANDA_HANGING_SIGN);

    public static Block registerLogBlock(String logName) {
        return register(logName, new PillarBlock(copy(OAK_LOG).registryKey(keyOf(logName))), true);
    }

    public static Block registerWoodBlock(OverhaulWoodTypes.WoodType woodType) {
        String name = woodType.getName() + "_planks";
        return register(name, new Block(copy(OAK_PLANKS).registryKey(keyOf(name))), true);
    }

    public static Block registerWoodBlock(OverhaulWoodTypes.WoodType woodType, BlockFamily.Variant variant) {
        String name = woodType.getName() + "_" + variant.getName();
        AbstractBlock.Settings settings = copy(OAK_PLANKS).registryKey(keyOf(name));
        Block block;
        switch (variant) {
            case STAIRS ->
                    block = new StairsBlock(OAK_PLANKS.getDefaultState(), settings);
            case SLAB ->
                    block = new SlabBlock(settings);
            case FENCE ->
                    block = new FenceBlock(settings);
            case FENCE_GATE ->
                   block = new FenceGateBlock(woodType.getWoodType(), settings);
            case DOOR ->
                    block = new DoorBlock(woodType.getWoodType().setType(), settings);
            case TRAPDOOR ->
                    block = new TrapdoorBlock(woodType.getWoodType().setType(), settings);
            case PRESSURE_PLATE ->
                    block = new PressurePlateBlock(woodType.getWoodType().setType(), settings);
            case BUTTON ->
                    block = new ButtonBlock(woodType.getWoodType().setType(), 30, settings);
            default ->
                throw new IllegalStateException("Unexpected variant '" + variant + "' for" + woodType);
        }
        return register(name, block, true);
    }

    public static Block registerSignBlock(OverhaulWoodTypes.WoodType woodType, boolean isHanging) {
        String name = woodType.getName() + (isHanging ? "_hanging" : "") + "_sign";
        AbstractBlock.Settings settings = Block.Settings.create().solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().registryKey(keyOf(name));
            if (isHanging) {
                return register(name, new HangingSignBlock(woodType.getWoodType(), settings), false);
            } else {
                return register(name, new OverhaulSignBlock(woodType.getWoodType(), settings),false);
            }
    }

    public static Block registerSignBlock(OverhaulWoodTypes.WoodType woodType, boolean isHanging, Block drops) {
        String name = woodType.getName() + "_wall" + (isHanging ? "_hanging" : "") + "_sign";
        AbstractBlock.Settings settings = copyLootTable(drops, true).solid().instrument(NoteBlockInstrument.BASS).noCollision().strength(1.0F).burnable().registryKey(keyOf(name));
        if (isHanging) {
            return register(name, new WallHangingSignBlock(woodType.getWoodType(), settings), false);
        } else {
            return register(name, new WallSignBlock(woodType.getWoodType(), settings), false);
        }
    }

    public static AbstractBlock.Settings copyLootTable(Block block, boolean copyTranslationKey) {
        AbstractBlock.Settings settings = AbstractBlock.Settings.create().lootTable(block.getLootTableKey());
        if (copyTranslationKey) {
            settings = settings.overrideTranslationKey(block.getTranslationKey());
        }
        return settings;
    }

    public static void registerWoodBlocks() {
        WithersOverhaul.LOGGER.info("Registering Wood Blocks for " + WithersOverhaul.MOD_ID);
    }

}
