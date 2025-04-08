package me.withers_overhaul.registry.item;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.item.ore.*;
import me.withers_overhaul.registry.block.StoneBlocks;
import me.withers_overhaul.registry.block.WoodBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.*;

import static me.withers_overhaul.registry.block.NaturalBlocks.PINE_SAPLING;
import static me.withers_overhaul.registry.block.WoodBlocks.*;
//import static me.withers_overhaul.item.ToolTipItem.Tooltips.*;

public class BlockItems {
    //SIGNS
    public static final Item MAPLE_SIGN = registerSignItem(WoodBlocks.MAPLE_SIGN, MAPLE_WALL_SIGN, false);
    public static final Item POPLAR_SIGN = registerSignItem(WoodBlocks.POPLAR_SIGN, POPLAR_WALL_SIGN, false);
    public static final Item BEECH_SIGN = registerSignItem(WoodBlocks.BEECH_SIGN, BEECH_WALL_SIGN, false);
    public static final Item HICKORY_SIGN = registerSignItem(WoodBlocks.HICKORY_SIGN, HICKORY_WALL_SIGN, false);
    public static final Item WALNUT_SIGN = registerSignItem(WoodBlocks.WALNUT_SIGN, WALNUT_WALL_SIGN, false);
    public static final Item CHESTNUT_SIGN = registerSignItem(WoodBlocks.CHESTNUT_SIGN, CHESTNUT_WALL_SIGN, false);
    public static final Item CEDAR_SIGN = registerSignItem(WoodBlocks.CEDAR_SIGN, CEDAR_WALL_SIGN, false);
    public static final Item REDWOOD_SIGN = registerSignItem(WoodBlocks.REDWOOD_SIGN, REDWOOD_WALL_SIGN, false);
    public static final Item FIR_SIGN = registerSignItem(WoodBlocks.FIR_SIGN, FIR_WALL_SIGN, false);
    public static final Item HEMLOCK_SIGN = registerSignItem(WoodBlocks.HEMLOCK_SIGN, HEMLOCK_WALL_SIGN, false);
    public static final Item HOLLY_SIGN = registerSignItem(WoodBlocks.HOLLY_SIGN, HOLLY_WALL_SIGN, false);
    public static final Item PINE_SIGN = registerSignItem(WoodBlocks.PINE_SIGN, PINE_WALL_SIGN, false);
    public static final Item LARCH_SIGN = registerSignItem(WoodBlocks.LARCH_SIGN, LARCH_WALL_SIGN, false);
    public static final Item ASPEN_SIGN = registerSignItem(WoodBlocks.ASPEN_SIGN, ASPEN_WALL_SIGN, false);
    public static final Item KAPOK_SIGN = registerSignItem(WoodBlocks.KAPOK_SIGN, KAPOK_WALL_SIGN, false);
    public static final Item MAHOGANY_SIGN = registerSignItem(WoodBlocks.MAHOGANY_SIGN, MAHOGANY_WALL_SIGN, false);
    public static final Item EUCALYPTUS_SIGN = registerSignItem(WoodBlocks.EUCALYPTUS_SIGN, EUCALYPTUS_WALL_SIGN, false);
    public static final Item BAOBAB_SIGN = registerSignItem(WoodBlocks.BAOBAB_SIGN, BAOBAB_WALL_SIGN, false);
    public static final Item PALO_VERDE_SIGN = registerSignItem(WoodBlocks.PALO_VERDE_SIGN, PALO_VERDE_WALL_SIGN, false);
    public static final Item JOSHUA_SIGN = registerSignItem(WoodBlocks.JOSHUA_SIGN, JOSHUA_WALL_SIGN, false);
    public static final Item JUNIPER_SIGN = registerSignItem(WoodBlocks.JUNIPER_SIGN, JUNIPER_WALL_SIGN, false);
    public static final Item PALM_SIGN = registerSignItem(WoodBlocks.PALM_SIGN, PALM_WALL_SIGN, false);
    public static final Item EBONY_SIGN = registerSignItem(WoodBlocks.EBONY_SIGN, EBONY_WALL_SIGN, false);
    public static final Item TEAK_SIGN = registerSignItem(WoodBlocks.TEAK_SIGN, TEAK_WALL_SIGN, false);
    public static final Item ELM_SIGN = registerSignItem(WoodBlocks.ELM_SIGN, ELM_WALL_SIGN, false);
    public static final Item WILLOW_SIGN = registerSignItem(WoodBlocks.WILLOW_SIGN, WILLOW_WALL_SIGN, false);
    public static final Item CYPRESS_SIGN = registerSignItem(WoodBlocks.CYPRESS_SIGN, CYPRESS_WALL_SIGN, false);
    public static final Item SAKURA_SIGN = registerSignItem(WoodBlocks.SAKURA_SIGN, SAKURA_WALL_SIGN, false);
    public static final Item MAGNOLIA_SIGN = registerSignItem(WoodBlocks.MAGNOLIA_SIGN, MAGNOLIA_WALL_SIGN, false);
    public static final Item JACARANDA_SIGN = registerSignItem(WoodBlocks.JACARANDA_SIGN, JACARANDA_WALL_SIGN, false);

    //HANGING SIGNS
    public static final Item MAPLE_HANGING_SIGN = registerSignItem(WoodBlocks.MAPLE_HANGING_SIGN, MAPLE_WALL_HANGING_SIGN, true);
    public static final Item POPLAR_HANGING_SIGN = registerSignItem(WoodBlocks.POPLAR_HANGING_SIGN, POPLAR_WALL_HANGING_SIGN, true);
    public static final Item BEECH_HANGING_SIGN = registerSignItem(WoodBlocks.BEECH_HANGING_SIGN, BEECH_WALL_HANGING_SIGN, true);
    public static final Item HICKORY_HANGING_SIGN = registerSignItem(WoodBlocks.HICKORY_HANGING_SIGN, HICKORY_WALL_HANGING_SIGN, false);
    public static final Item WALNUT_HANGING_SIGN = registerSignItem(WoodBlocks.WALNUT_HANGING_SIGN, WALNUT_WALL_HANGING_SIGN, false);
    public static final Item CHESTNUT_HANGING_SIGN = registerSignItem(WoodBlocks.CHESTNUT_HANGING_SIGN, CHESTNUT_WALL_HANGING_SIGN, false);
    public static final Item CEDAR_HANGING_SIGN = registerSignItem(WoodBlocks.CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN, true);
    public static final Item REDWOOD_HANGING_SIGN = registerSignItem(WoodBlocks.REDWOOD_HANGING_SIGN, REDWOOD_WALL_HANGING_SIGN, true);
    public static final Item FIR_HANGING_SIGN = registerSignItem(WoodBlocks.FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN, true);
    public static final Item HEMLOCK_HANGING_SIGN = registerSignItem(WoodBlocks.HEMLOCK_HANGING_SIGN, HEMLOCK_WALL_HANGING_SIGN, true);
    public static final Item HOLLY_HANGING_SIGN = registerSignItem(WoodBlocks.HOLLY_HANGING_SIGN, HOLLY_WALL_HANGING_SIGN, true);
    public static final Item PINE_HANGING_SIGN = registerSignItem(WoodBlocks.PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN, true);
    public static final Item LARCH_HANGING_SIGN = registerSignItem(WoodBlocks.LARCH_HANGING_SIGN, LARCH_WALL_HANGING_SIGN, true);
    public static final Item ASPEN_HANGING_SIGN = registerSignItem(WoodBlocks.ASPEN_HANGING_SIGN, ASPEN_WALL_HANGING_SIGN, true);
    public static final Item KAPOK_HANGING_SIGN = registerSignItem(WoodBlocks.KAPOK_HANGING_SIGN, KAPOK_WALL_HANGING_SIGN, true);
    public static final Item MAHOGANY_HANGING_SIGN = registerSignItem(WoodBlocks.MAHOGANY_HANGING_SIGN, MAHOGANY_WALL_HANGING_SIGN, true);
    public static final Item EUCALYPTUS_HANGING_SIGN = registerSignItem(WoodBlocks.EUCALYPTUS_HANGING_SIGN, EUCALYPTUS_WALL_HANGING_SIGN, true);
    public static final Item BAOBAB_HANGING_SIGN = registerSignItem(WoodBlocks.BAOBAB_HANGING_SIGN, BAOBAB_WALL_HANGING_SIGN, true);
    public static final Item PALO_VERDE_HANGING_SIGN = registerSignItem(WoodBlocks.PALO_VERDE_HANGING_SIGN, PALO_VERDE_WALL_HANGING_SIGN, true);
    public static final Item JOSHUA_HANGING_SIGN = registerSignItem(WoodBlocks.JOSHUA_HANGING_SIGN, JOSHUA_WALL_HANGING_SIGN, true);
    public static final Item JUNIPER_HANGING_SIGN = registerSignItem(WoodBlocks.JUNIPER_HANGING_SIGN, JUNIPER_WALL_HANGING_SIGN, true);
    public static final Item PALM_HANGING_SIGN = registerSignItem( WoodBlocks.PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN, true);
    public static final Item EBONY_HANGING_SIGN = registerSignItem(WoodBlocks.EBONY_HANGING_SIGN, EBONY_WALL_HANGING_SIGN, true);
    public static final Item TEAK_HANGING_SIGN = registerSignItem(WoodBlocks.TEAK_HANGING_SIGN, TEAK_WALL_HANGING_SIGN, true);
    public static final Item ELM_HANGING_SIGN = registerSignItem(WoodBlocks.ELM_HANGING_SIGN, ELM_WALL_HANGING_SIGN, true);
    public static final Item WILLOW_HANGING_SIGN = registerSignItem(WoodBlocks.WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN, true);
    public static final Item CYPRESS_HANGING_SIGN = registerSignItem(WoodBlocks.CYPRESS_HANGING_SIGN, CYPRESS_WALL_HANGING_SIGN, true);
    public static final Item SAKURA_HANGING_SIGN = registerSignItem(WoodBlocks.SAKURA_HANGING_SIGN, SAKURA_WALL_HANGING_SIGN, true);
    public static final Item MAGNOLIA_HANGING_SIGN = registerSignItem(WoodBlocks.MAGNOLIA_HANGING_SIGN, MAGNOLIA_WALL_HANGING_SIGN, true);
    public static final Item JACARANDA_HANGING_SIGN = registerSignItem(WoodBlocks.JACARANDA_HANGING_SIGN, JACARANDA_WALL_HANGING_SIGN, true);

    // ORES
    public static final Item GRANITE_COAL_ORE = registerGraniteOre(StoneBlocks.GRANITE_COAL_ORE);
    public static final Item GRANITE_IRON_ORE = registerGraniteOre(StoneBlocks.GRANITE_IRON_ORE);
    public static final Item GRANITE_COPPER_ORE = registerGraniteOre(StoneBlocks.GRANITE_COPPER_ORE);
    public static final Item GRANITE_GOLD_ORE = registerGraniteOre(StoneBlocks.GRANITE_GOLD_ORE);
    public static final Item GRANITE_REDSTONE_ORE = registerGraniteOre(StoneBlocks.GRANITE_REDSTONE_ORE);
    public static final Item GRANITE_EMERALD_ORE = registerGraniteOre(StoneBlocks.GRANITE_EMERALD_ORE);
    public static final Item GRANITE_LAPIS_ORE = registerGraniteOre(StoneBlocks.GRANITE_LAPIS_ORE);
    public static final Item GRANITE_DIAMOND_ORE = registerGraniteOre(StoneBlocks.GRANITE_DIAMOND_ORE);

    public static final Item DIORITE_COAL_ORE = registerDioriteOre(StoneBlocks.DIORITE_COAL_ORE);
    public static final Item DIORITE_IRON_ORE = registerDioriteOre(StoneBlocks.DIORITE_IRON_ORE);
    public static final Item DIORITE_COPPER_ORE = registerDioriteOre(StoneBlocks.DIORITE_COPPER_ORE);
    public static final Item DIORITE_GOLD_ORE = registerDioriteOre(StoneBlocks.DIORITE_GOLD_ORE);
    public static final Item DIORITE_REDSTONE_ORE = registerDioriteOre(StoneBlocks.DIORITE_REDSTONE_ORE);
    public static final Item DIORITE_EMERALD_ORE = registerDioriteOre(StoneBlocks.DIORITE_EMERALD_ORE);
    public static final Item DIORITE_LAPIS_ORE = registerDioriteOre(StoneBlocks.DIORITE_LAPIS_ORE);
    public static final Item DIORITE_DIAMOND_ORE = registerDioriteOre(StoneBlocks.DIORITE_DIAMOND_ORE);

    public static final Item ANDESITE_COAL_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_COAL_ORE);
    public static final Item ANDESITE_IRON_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_IRON_ORE);
    public static final Item ANDESITE_COPPER_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_COPPER_ORE);
    public static final Item ANDESITE_GOLD_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_GOLD_ORE);
    public static final Item ANDESITE_REDSTONE_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_REDSTONE_ORE);
    public static final Item ANDESITE_EMERALD_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_EMERALD_ORE);
    public static final Item ANDESITE_LAPIS_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_LAPIS_ORE);
    public static final Item ANDESITE_DIAMOND_ORE = registerAndesiteOre(StoneBlocks.ANDESITE_DIAMOND_ORE);

    public static final Item TUFF_COAL_ORE = registerTuffOre(StoneBlocks.TUFF_COAL_ORE);
    public static final Item TUFF_IRON_ORE = registerTuffOre(StoneBlocks.TUFF_IRON_ORE);
    public static final Item TUFF_COPPER_ORE = registerTuffOre(StoneBlocks.TUFF_COPPER_ORE);
    public static final Item TUFF_GOLD_ORE = registerTuffOre(StoneBlocks.TUFF_GOLD_ORE);
    public static final Item TUFF_REDSTONE_ORE = registerTuffOre(StoneBlocks.TUFF_REDSTONE_ORE);
    public static final Item TUFF_EMERALD_ORE = registerTuffOre(StoneBlocks.TUFF_EMERALD_ORE);
    public static final Item TUFF_LAPIS_ORE = registerTuffOre(StoneBlocks.TUFF_LAPIS_ORE);
    public static final Item TUFF_DIAMOND_ORE = registerTuffOre(StoneBlocks.TUFF_DIAMOND_ORE);

    public static final Item GNEISS_COAL_ORE = registerGneissOre(StoneBlocks.GNEISS_COAL_ORE);
    public static final Item GNEISS_IRON_ORE = registerGneissOre(StoneBlocks.GNEISS_IRON_ORE);
    public static final Item GNEISS_COPPER_ORE = registerGneissOre(StoneBlocks.GNEISS_COPPER_ORE);
    public static final Item GNEISS_GOLD_ORE = registerGneissOre(StoneBlocks.GNEISS_GOLD_ORE);
    public static final Item GNEISS_REDSTONE_ORE = registerGneissOre(StoneBlocks.GNEISS_REDSTONE_ORE);
    public static final Item GNEISS_EMERALD_ORE = registerGneissOre(StoneBlocks.GNEISS_EMERALD_ORE);
    public static final Item GNEISS_LAPIS_ORE = registerGneissOre(StoneBlocks.GNEISS_LAPIS_ORE);
    public static final Item GNEISS_DIAMOND_ORE = registerGneissOre(StoneBlocks.GNEISS_DIAMOND_ORE);

    public static final Item SHALE_COAL_ORE = registerShaleOre(StoneBlocks.SHALE_COAL_ORE);
    public static final Item SHALE_IRON_ORE = registerShaleOre(StoneBlocks.SHALE_IRON_ORE);
    public static final Item SHALE_COPPER_ORE = registerShaleOre(StoneBlocks.SHALE_COPPER_ORE);
    public static final Item SHALE_GOLD_ORE = registerShaleOre(StoneBlocks.SHALE_GOLD_ORE);
    public static final Item SHALE_REDSTONE_ORE = registerShaleOre(StoneBlocks.SHALE_REDSTONE_ORE);
    public static final Item SHALE_EMERALD_ORE = registerShaleOre(StoneBlocks.SHALE_EMERALD_ORE);
    public static final Item SHALE_LAPIS_ORE = registerShaleOre(StoneBlocks.SHALE_LAPIS_ORE);
    public static final Item SHALE_DIAMOND_ORE = registerShaleOre(StoneBlocks.SHALE_DIAMOND_ORE);

    public static final Item LIMESTONE_COAL_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_COAL_ORE);
    public static final Item LIMESTONE_IRON_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_IRON_ORE);
    public static final Item LIMESTONE_COPPER_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_COPPER_ORE);
    public static final Item LIMESTONE_GOLD_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_GOLD_ORE);
    public static final Item LIMESTONE_REDSTONE_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_REDSTONE_ORE);
    public static final Item LIMESTONE_EMERALD_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_EMERALD_ORE);
    public static final Item LIMESTONE_LAPIS_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_LAPIS_ORE);
    public static final Item LIMESTONE_DIAMOND_ORE = registerLimestoneOre(StoneBlocks.LIMESTONE_DIAMOND_ORE);

    public static final Item MARBLE_COAL_ORE = registerMarbleOre(StoneBlocks.MARBLE_COAL_ORE);
    public static final Item MARBLE_IRON_ORE = registerMarbleOre(StoneBlocks.MARBLE_IRON_ORE);
    public static final Item MARBLE_COPPER_ORE = registerMarbleOre(StoneBlocks.MARBLE_COPPER_ORE);
    public static final Item MARBLE_GOLD_ORE = registerMarbleOre(StoneBlocks.MARBLE_GOLD_ORE);
    public static final Item MARBLE_REDSTONE_ORE = registerMarbleOre(StoneBlocks.MARBLE_REDSTONE_ORE);
    public static final Item MARBLE_EMERALD_ORE = registerMarbleOre(StoneBlocks.MARBLE_EMERALD_ORE);
    public static final Item MARBLE_LAPIS_ORE = registerMarbleOre(StoneBlocks.MARBLE_LAPIS_ORE);
    public static final Item MARBLE_DIAMOND_ORE = registerMarbleOre(StoneBlocks.MARBLE_DIAMOND_ORE);

    public static final Item GABBRO_COAL_ORE = registerGabbroOre(StoneBlocks.GABBRO_COAL_ORE);
    public static final Item GABBRO_IRON_ORE = registerGabbroOre(StoneBlocks.GABBRO_IRON_ORE);
    public static final Item GABBRO_COPPER_ORE = registerGabbroOre(StoneBlocks.GABBRO_COPPER_ORE);
    public static final Item GABBRO_GOLD_ORE = registerGabbroOre(StoneBlocks.GABBRO_GOLD_ORE);
    public static final Item GABBRO_REDSTONE_ORE = registerGabbroOre(StoneBlocks.GABBRO_REDSTONE_ORE);
    public static final Item GABBRO_EMERALD_ORE = registerGabbroOre(StoneBlocks.GABBRO_EMERALD_ORE);
    public static final Item GABBRO_LAPIS_ORE = registerGabbroOre(StoneBlocks.GABBRO_LAPIS_ORE);
    public static final Item GABBRO_DIAMOND_ORE = registerGabbroOre(StoneBlocks.GABBRO_DIAMOND_ORE);

    public static final Item PHYLLITE_COAL_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_COAL_ORE);
    public static final Item PHYLLITE_IRON_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_IRON_ORE);
    public static final Item PHYLLITE_COPPER_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_COPPER_ORE);
    public static final Item PHYLLITE_GOLD_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_GOLD_ORE);
    public static final Item PHYLLITE_REDSTONE_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_REDSTONE_ORE);
    public static final Item PHYLLITE_EMERALD_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_EMERALD_ORE);
    public static final Item PHYLLITE_LAPIS_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_LAPIS_ORE);
    public static final Item PHYLLITE_DIAMOND_ORE = registerPhylliteOre(StoneBlocks.PHYLLITE_DIAMOND_ORE);

    public static final Item PINE_CONE = OverhaulItems.register("pine_cone", settings -> new BlockItem(PINE_SAPLING, new Item.Settings().registryKey(OverhaulItems.keyOf("pine_cone")).useItemPrefixedTranslationKey()));

    public static Item registerSignItem(Block sign, Block wallSign, boolean hangingSign) {
        if (hangingSign) {
            return Items.register(sign, (block, settings) -> new HangingSignItem(block, wallSign, settings), new Item.Settings().maxCount(16));
        } else {
            return Items.register(sign, (block, settings) -> new SignItem(block, wallSign, settings), new Item.Settings().maxCount(16));
        }
    }

    public static Item registerGraniteOre(Block block) {
        return Items.register(block, GraniteOreItem::new);
    }

    public static Item registerDioriteOre(Block block) {
        return Items.register(block, DioriteOreItem::new);
    }

    public static Item registerAndesiteOre(Block block) {
        return Items.register(block, AndesiteOreItem::new);
    }

    public static Item registerTuffOre(Block block) {
        return Items.register(block, TuffOreItem::new);
    }

    public static Item registerGneissOre(Block block) {
        return Items.register(block, GneissOreItem::new);
    }

    public static Item registerShaleOre(Block block) {
        return Items.register(block, ShaleOreItem::new);
    }

    public static Item registerLimestoneOre(Block block) {
        return Items.register(block, LimestoneOreItem::new);
    }

    public static Item registerMarbleOre(Block block) {
        return Items.register(block, MarbleOreItem::new);
    }

    public static Item registerGabbroOre(Block block) {
        return Items.register(block, GabbroOreItem::new);
    }

    public static Item registerPhylliteOre(Block block) {
        return Items.register(block, PhylliteOreItem::new);
    }

    public static void registerBlockItems() {
        WithersOverhaul.LOGGER.info("Registering Block Items for " + WithersOverhaul.MOD_ID);
    }
}
