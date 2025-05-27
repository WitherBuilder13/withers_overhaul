package me.withers_overhaul.registry.item;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.item.component.OverhaulFoodComponents;
import me.withers_overhaul.item.ore.*;
import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.registry.block.StoneBlocks;
import me.withers_overhaul.registry.block.WoodBlocks;
import net.minecraft.block.Block;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;

import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.registry.item.OverhaulItems.register;

public class BlockItems {
    public static final Item MAPLE_SIGN = signItem(WoodBlocks.MAPLE_SIGN, MAPLE_WALL_SIGN, false);
    public static final Item POPLAR_SIGN = signItem(WoodBlocks.POPLAR_SIGN, POPLAR_WALL_SIGN, false);
    public static final Item BEECH_SIGN = signItem(WoodBlocks.BEECH_SIGN, BEECH_WALL_SIGN, false);
    public static final Item HICKORY_SIGN = signItem(WoodBlocks.HICKORY_SIGN, HICKORY_WALL_SIGN, false);
    public static final Item WALNUT_SIGN = signItem(WoodBlocks.WALNUT_SIGN, WALNUT_WALL_SIGN, false);
    public static final Item CHESTNUT_SIGN = signItem(WoodBlocks.CHESTNUT_SIGN, CHESTNUT_WALL_SIGN, false);
    public static final Item CEDAR_SIGN = signItem(WoodBlocks.CEDAR_SIGN, CEDAR_WALL_SIGN, false);
    public static final Item REDWOOD_SIGN = signItem(WoodBlocks.REDWOOD_SIGN, REDWOOD_WALL_SIGN, false);
    public static final Item FIR_SIGN = signItem(WoodBlocks.FIR_SIGN, FIR_WALL_SIGN, false);
    public static final Item HEMLOCK_SIGN = signItem(WoodBlocks.HEMLOCK_SIGN, HEMLOCK_WALL_SIGN, false);
    public static final Item HOLLY_SIGN = signItem(WoodBlocks.HOLLY_SIGN, HOLLY_WALL_SIGN, false);
    public static final Item PINE_SIGN = signItem(WoodBlocks.PINE_SIGN, PINE_WALL_SIGN, false);
    public static final Item LARCH_SIGN = signItem(WoodBlocks.LARCH_SIGN, LARCH_WALL_SIGN, false);
    public static final Item ASPEN_SIGN = signItem(WoodBlocks.ASPEN_SIGN, ASPEN_WALL_SIGN, false);
    public static final Item KAPOK_SIGN = signItem(WoodBlocks.KAPOK_SIGN, KAPOK_WALL_SIGN, false);
    public static final Item MAHOGANY_SIGN = signItem(WoodBlocks.MAHOGANY_SIGN, MAHOGANY_WALL_SIGN, false);
    public static final Item EUCALYPTUS_SIGN = signItem(WoodBlocks.EUCALYPTUS_SIGN, EUCALYPTUS_WALL_SIGN, false);
    public static final Item BAOBAB_SIGN = signItem(WoodBlocks.BAOBAB_SIGN, BAOBAB_WALL_SIGN, false);
    public static final Item PALO_VERDE_SIGN = signItem(WoodBlocks.PALO_VERDE_SIGN, PALO_VERDE_WALL_SIGN, false);
    public static final Item JOSHUA_SIGN = signItem(WoodBlocks.JOSHUA_SIGN, JOSHUA_WALL_SIGN, false);
    public static final Item JUNIPER_SIGN = signItem(WoodBlocks.JUNIPER_SIGN, JUNIPER_WALL_SIGN, false);
    public static final Item PALM_SIGN = signItem(WoodBlocks.PALM_SIGN, PALM_WALL_SIGN, false);
    public static final Item EBONY_SIGN = signItem(WoodBlocks.EBONY_SIGN, EBONY_WALL_SIGN, false);
    public static final Item TEAK_SIGN = signItem(WoodBlocks.TEAK_SIGN, TEAK_WALL_SIGN, false);
    public static final Item ELM_SIGN = signItem(WoodBlocks.ELM_SIGN, ELM_WALL_SIGN, false);
    public static final Item WILLOW_SIGN = signItem(WoodBlocks.WILLOW_SIGN, WILLOW_WALL_SIGN, false);
    public static final Item CYPRESS_SIGN = signItem(WoodBlocks.CYPRESS_SIGN, CYPRESS_WALL_SIGN, false);
    public static final Item SAKURA_SIGN = signItem(WoodBlocks.SAKURA_SIGN, SAKURA_WALL_SIGN, false);
    public static final Item MAGNOLIA_SIGN = signItem(WoodBlocks.MAGNOLIA_SIGN, MAGNOLIA_WALL_SIGN, false);
    public static final Item JACARANDA_SIGN = signItem(WoodBlocks.JACARANDA_SIGN, JACARANDA_WALL_SIGN, false);

    public static final Item MAPLE_HANGING_SIGN = signItem(WoodBlocks.MAPLE_HANGING_SIGN, MAPLE_WALL_HANGING_SIGN, true);
    public static final Item POPLAR_HANGING_SIGN = signItem(WoodBlocks.POPLAR_HANGING_SIGN, POPLAR_WALL_HANGING_SIGN, true);
    public static final Item BEECH_HANGING_SIGN = signItem(WoodBlocks.BEECH_HANGING_SIGN, BEECH_WALL_HANGING_SIGN, true);
    public static final Item HICKORY_HANGING_SIGN = signItem(WoodBlocks.HICKORY_HANGING_SIGN, HICKORY_WALL_HANGING_SIGN, false);
    public static final Item WALNUT_HANGING_SIGN = signItem(WoodBlocks.WALNUT_HANGING_SIGN, WALNUT_WALL_HANGING_SIGN, false);
    public static final Item CHESTNUT_HANGING_SIGN = signItem(WoodBlocks.CHESTNUT_HANGING_SIGN, CHESTNUT_WALL_HANGING_SIGN, false);
    public static final Item CEDAR_HANGING_SIGN = signItem(WoodBlocks.CEDAR_HANGING_SIGN, CEDAR_WALL_HANGING_SIGN, true);
    public static final Item REDWOOD_HANGING_SIGN = signItem(WoodBlocks.REDWOOD_HANGING_SIGN, REDWOOD_WALL_HANGING_SIGN, true);
    public static final Item FIR_HANGING_SIGN = signItem(WoodBlocks.FIR_HANGING_SIGN, FIR_WALL_HANGING_SIGN, true);
    public static final Item HEMLOCK_HANGING_SIGN = signItem(WoodBlocks.HEMLOCK_HANGING_SIGN, HEMLOCK_WALL_HANGING_SIGN, true);
    public static final Item HOLLY_HANGING_SIGN = signItem(WoodBlocks.HOLLY_HANGING_SIGN, HOLLY_WALL_HANGING_SIGN, true);
    public static final Item PINE_HANGING_SIGN = signItem(WoodBlocks.PINE_HANGING_SIGN, PINE_WALL_HANGING_SIGN, true);
    public static final Item LARCH_HANGING_SIGN = signItem(WoodBlocks.LARCH_HANGING_SIGN, LARCH_WALL_HANGING_SIGN, true);
    public static final Item ASPEN_HANGING_SIGN = signItem(WoodBlocks.ASPEN_HANGING_SIGN, ASPEN_WALL_HANGING_SIGN, true);
    public static final Item KAPOK_HANGING_SIGN = signItem(WoodBlocks.KAPOK_HANGING_SIGN, KAPOK_WALL_HANGING_SIGN, true);
    public static final Item MAHOGANY_HANGING_SIGN = signItem(WoodBlocks.MAHOGANY_HANGING_SIGN, MAHOGANY_WALL_HANGING_SIGN, true);
    public static final Item EUCALYPTUS_HANGING_SIGN = signItem(WoodBlocks.EUCALYPTUS_HANGING_SIGN, EUCALYPTUS_WALL_HANGING_SIGN, true);
    public static final Item BAOBAB_HANGING_SIGN = signItem(WoodBlocks.BAOBAB_HANGING_SIGN, BAOBAB_WALL_HANGING_SIGN, true);
    public static final Item PALO_VERDE_HANGING_SIGN = signItem(WoodBlocks.PALO_VERDE_HANGING_SIGN, PALO_VERDE_WALL_HANGING_SIGN, true);
    public static final Item JOSHUA_HANGING_SIGN = signItem(WoodBlocks.JOSHUA_HANGING_SIGN, JOSHUA_WALL_HANGING_SIGN, true);
    public static final Item JUNIPER_HANGING_SIGN = signItem(WoodBlocks.JUNIPER_HANGING_SIGN, JUNIPER_WALL_HANGING_SIGN, true);
    public static final Item PALM_HANGING_SIGN = signItem( WoodBlocks.PALM_HANGING_SIGN, PALM_WALL_HANGING_SIGN, true);
    public static final Item EBONY_HANGING_SIGN = signItem(WoodBlocks.EBONY_HANGING_SIGN, EBONY_WALL_HANGING_SIGN, true);
    public static final Item TEAK_HANGING_SIGN = signItem(WoodBlocks.TEAK_HANGING_SIGN, TEAK_WALL_HANGING_SIGN, true);
    public static final Item ELM_HANGING_SIGN = signItem(WoodBlocks.ELM_HANGING_SIGN, ELM_WALL_HANGING_SIGN, true);
    public static final Item WILLOW_HANGING_SIGN = signItem(WoodBlocks.WILLOW_HANGING_SIGN, WILLOW_WALL_HANGING_SIGN, true);
    public static final Item CYPRESS_HANGING_SIGN = signItem(WoodBlocks.CYPRESS_HANGING_SIGN, CYPRESS_WALL_HANGING_SIGN, true);
    public static final Item SAKURA_HANGING_SIGN = signItem(WoodBlocks.SAKURA_HANGING_SIGN, SAKURA_WALL_HANGING_SIGN, true);
    public static final Item MAGNOLIA_HANGING_SIGN = signItem(WoodBlocks.MAGNOLIA_HANGING_SIGN, MAGNOLIA_WALL_HANGING_SIGN, true);
    public static final Item JACARANDA_HANGING_SIGN = signItem(WoodBlocks.JACARANDA_HANGING_SIGN, JACARANDA_WALL_HANGING_SIGN, true);

    // * -------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final Item GRANITE_COAL_ORE = graniteOre(StoneBlocks.GRANITE_COAL_ORE);
    public static final Item GRANITE_IRON_ORE = graniteOre(StoneBlocks.GRANITE_IRON_ORE);
    public static final Item GRANITE_COPPER_ORE = graniteOre(StoneBlocks.GRANITE_COPPER_ORE);
    public static final Item GRANITE_GOLD_ORE = graniteOre(StoneBlocks.GRANITE_GOLD_ORE);
    public static final Item GRANITE_REDSTONE_ORE = graniteOre(StoneBlocks.GRANITE_REDSTONE_ORE);
    public static final Item GRANITE_EMERALD_ORE = graniteOre(StoneBlocks.GRANITE_EMERALD_ORE);
    public static final Item GRANITE_LAPIS_ORE = graniteOre(StoneBlocks.GRANITE_LAPIS_ORE);
    public static final Item GRANITE_DIAMOND_ORE = graniteOre(StoneBlocks.GRANITE_DIAMOND_ORE);

    public static final Item DIORITE_COAL_ORE = dioriteOre(StoneBlocks.DIORITE_COAL_ORE);
    public static final Item DIORITE_IRON_ORE = dioriteOre(StoneBlocks.DIORITE_IRON_ORE);
    public static final Item DIORITE_COPPER_ORE = dioriteOre(StoneBlocks.DIORITE_COPPER_ORE);
    public static final Item DIORITE_GOLD_ORE = dioriteOre(StoneBlocks.DIORITE_GOLD_ORE);
    public static final Item DIORITE_REDSTONE_ORE = dioriteOre(StoneBlocks.DIORITE_REDSTONE_ORE);
    public static final Item DIORITE_EMERALD_ORE = dioriteOre(StoneBlocks.DIORITE_EMERALD_ORE);
    public static final Item DIORITE_LAPIS_ORE = dioriteOre(StoneBlocks.DIORITE_LAPIS_ORE);
    public static final Item DIORITE_DIAMOND_ORE = dioriteOre(StoneBlocks.DIORITE_DIAMOND_ORE);

    public static final Item ANDESITE_COAL_ORE = andesiteOre(StoneBlocks.ANDESITE_COAL_ORE);
    public static final Item ANDESITE_IRON_ORE = andesiteOre(StoneBlocks.ANDESITE_IRON_ORE);
    public static final Item ANDESITE_COPPER_ORE = andesiteOre(StoneBlocks.ANDESITE_COPPER_ORE);
    public static final Item ANDESITE_GOLD_ORE = andesiteOre(StoneBlocks.ANDESITE_GOLD_ORE);
    public static final Item ANDESITE_REDSTONE_ORE = andesiteOre(StoneBlocks.ANDESITE_REDSTONE_ORE);
    public static final Item ANDESITE_EMERALD_ORE = andesiteOre(StoneBlocks.ANDESITE_EMERALD_ORE);
    public static final Item ANDESITE_LAPIS_ORE = andesiteOre(StoneBlocks.ANDESITE_LAPIS_ORE);
    public static final Item ANDESITE_DIAMOND_ORE = andesiteOre(StoneBlocks.ANDESITE_DIAMOND_ORE);

    public static final Item TUFF_COAL_ORE = tuffOre(StoneBlocks.TUFF_COAL_ORE);
    public static final Item TUFF_IRON_ORE = tuffOre(StoneBlocks.TUFF_IRON_ORE);
    public static final Item TUFF_COPPER_ORE = tuffOre(StoneBlocks.TUFF_COPPER_ORE);
    public static final Item TUFF_GOLD_ORE = tuffOre(StoneBlocks.TUFF_GOLD_ORE);
    public static final Item TUFF_REDSTONE_ORE = tuffOre(StoneBlocks.TUFF_REDSTONE_ORE);
    public static final Item TUFF_EMERALD_ORE = tuffOre(StoneBlocks.TUFF_EMERALD_ORE);
    public static final Item TUFF_LAPIS_ORE = tuffOre(StoneBlocks.TUFF_LAPIS_ORE);
    public static final Item TUFF_DIAMOND_ORE = tuffOre(StoneBlocks.TUFF_DIAMOND_ORE);

    public static final Item GNEISS_COAL_ORE = gneissOre(StoneBlocks.GNEISS_COAL_ORE);
    public static final Item GNEISS_IRON_ORE = gneissOre(StoneBlocks.GNEISS_IRON_ORE);
    public static final Item GNEISS_COPPER_ORE = gneissOre(StoneBlocks.GNEISS_COPPER_ORE);
    public static final Item GNEISS_GOLD_ORE = gneissOre(StoneBlocks.GNEISS_GOLD_ORE);
    public static final Item GNEISS_REDSTONE_ORE = gneissOre(StoneBlocks.GNEISS_REDSTONE_ORE);
    public static final Item GNEISS_EMERALD_ORE = gneissOre(StoneBlocks.GNEISS_EMERALD_ORE);
    public static final Item GNEISS_LAPIS_ORE = gneissOre(StoneBlocks.GNEISS_LAPIS_ORE);
    public static final Item GNEISS_DIAMOND_ORE = gneissOre(StoneBlocks.GNEISS_DIAMOND_ORE);

    public static final Item SHALE_COAL_ORE = shaleOre(StoneBlocks.SHALE_COAL_ORE);
    public static final Item SHALE_IRON_ORE = shaleOre(StoneBlocks.SHALE_IRON_ORE);
    public static final Item SHALE_COPPER_ORE = shaleOre(StoneBlocks.SHALE_COPPER_ORE);
    public static final Item SHALE_GOLD_ORE = shaleOre(StoneBlocks.SHALE_GOLD_ORE);
    public static final Item SHALE_REDSTONE_ORE = shaleOre(StoneBlocks.SHALE_REDSTONE_ORE);
    public static final Item SHALE_EMERALD_ORE = shaleOre(StoneBlocks.SHALE_EMERALD_ORE);
    public static final Item SHALE_LAPIS_ORE = shaleOre(StoneBlocks.SHALE_LAPIS_ORE);
    public static final Item SHALE_DIAMOND_ORE = shaleOre(StoneBlocks.SHALE_DIAMOND_ORE);

    public static final Item LIMESTONE_COAL_ORE = limestoneOre(StoneBlocks.LIMESTONE_COAL_ORE);
    public static final Item LIMESTONE_IRON_ORE = limestoneOre(StoneBlocks.LIMESTONE_IRON_ORE);
    public static final Item LIMESTONE_COPPER_ORE = limestoneOre(StoneBlocks.LIMESTONE_COPPER_ORE);
    public static final Item LIMESTONE_GOLD_ORE = limestoneOre(StoneBlocks.LIMESTONE_GOLD_ORE);
    public static final Item LIMESTONE_REDSTONE_ORE = limestoneOre(StoneBlocks.LIMESTONE_REDSTONE_ORE);
    public static final Item LIMESTONE_EMERALD_ORE = limestoneOre(StoneBlocks.LIMESTONE_EMERALD_ORE);
    public static final Item LIMESTONE_LAPIS_ORE = limestoneOre(StoneBlocks.LIMESTONE_LAPIS_ORE);
    public static final Item LIMESTONE_DIAMOND_ORE = limestoneOre(StoneBlocks.LIMESTONE_DIAMOND_ORE);

    public static final Item MARBLE_COAL_ORE = marbleOre(StoneBlocks.MARBLE_COAL_ORE);
    public static final Item MARBLE_IRON_ORE = marbleOre(StoneBlocks.MARBLE_IRON_ORE);
    public static final Item MARBLE_COPPER_ORE = marbleOre(StoneBlocks.MARBLE_COPPER_ORE);
    public static final Item MARBLE_GOLD_ORE = marbleOre(StoneBlocks.MARBLE_GOLD_ORE);
    public static final Item MARBLE_REDSTONE_ORE = marbleOre(StoneBlocks.MARBLE_REDSTONE_ORE);
    public static final Item MARBLE_EMERALD_ORE = marbleOre(StoneBlocks.MARBLE_EMERALD_ORE);
    public static final Item MARBLE_LAPIS_ORE = marbleOre(StoneBlocks.MARBLE_LAPIS_ORE);
    public static final Item MARBLE_DIAMOND_ORE = marbleOre(StoneBlocks.MARBLE_DIAMOND_ORE);

    public static final Item GABBRO_COAL_ORE = gabbroOre(StoneBlocks.GABBRO_COAL_ORE);
    public static final Item GABBRO_IRON_ORE = gabbroOre(StoneBlocks.GABBRO_IRON_ORE);
    public static final Item GABBRO_COPPER_ORE = gabbroOre(StoneBlocks.GABBRO_COPPER_ORE);
    public static final Item GABBRO_GOLD_ORE = gabbroOre(StoneBlocks.GABBRO_GOLD_ORE);
    public static final Item GABBRO_REDSTONE_ORE = gabbroOre(StoneBlocks.GABBRO_REDSTONE_ORE);
    public static final Item GABBRO_EMERALD_ORE = gabbroOre(StoneBlocks.GABBRO_EMERALD_ORE);
    public static final Item GABBRO_LAPIS_ORE = gabbroOre(StoneBlocks.GABBRO_LAPIS_ORE);
    public static final Item GABBRO_DIAMOND_ORE = gabbroOre(StoneBlocks.GABBRO_DIAMOND_ORE);

    public static final Item PHYLLITE_COAL_ORE = phylliteOre(StoneBlocks.PHYLLITE_COAL_ORE);
    public static final Item PHYLLITE_IRON_ORE = phylliteOre(StoneBlocks.PHYLLITE_IRON_ORE);
    public static final Item PHYLLITE_COPPER_ORE = phylliteOre(StoneBlocks.PHYLLITE_COPPER_ORE);
    public static final Item PHYLLITE_GOLD_ORE = phylliteOre(StoneBlocks.PHYLLITE_GOLD_ORE);
    public static final Item PHYLLITE_REDSTONE_ORE = phylliteOre(StoneBlocks.PHYLLITE_REDSTONE_ORE);
    public static final Item PHYLLITE_EMERALD_ORE = phylliteOre(StoneBlocks.PHYLLITE_EMERALD_ORE);
    public static final Item PHYLLITE_LAPIS_ORE = phylliteOre(StoneBlocks.PHYLLITE_LAPIS_ORE);
    public static final Item PHYLLITE_DIAMOND_ORE = phylliteOre(StoneBlocks.PHYLLITE_DIAMOND_ORE);

    // * -------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static final Item ARTICHOKE = foodItem("artichoke", NaturalBlocks.ARTICHOKES, OverhaulFoodComponents.ARTICHOKE);
    public static final Item BROCCOLI = foodItem("broccoli", NaturalBlocks.BROCCOLI, OverhaulFoodComponents.BROCCOLI);
    public static final Item CABBAGE = foodItem("cabbage", NaturalBlocks.CABBAGE, OverhaulFoodComponents.CABBAGE);
    public static final Item CANTALOUPE = foodItem("cantaloupe", NaturalBlocks.CANTALOUPE, OverhaulFoodComponents.CANTALOUPE);
    public static final Item CAULIFLOWER = foodItem("cauliflower", NaturalBlocks.CAULIFLOWER, OverhaulFoodComponents.CAULIFLOWER);
    public static final Item CELERY = foodItem("celery", NaturalBlocks.CELERY, OverhaulFoodComponents.CELERY);
    public static final Item CUCUMBER = foodItem("cucumber", NaturalBlocks.CUCUMBERS, OverhaulFoodComponents.CUCUMBER);
    public static final Item EGGPLANT = foodItem("eggplant", NaturalBlocks.EGGPLANT, OverhaulFoodComponents.EGGPLANT);
    public static final Item JALAPENO = foodItem("jalapeno", NaturalBlocks.JALAPENOS, OverhaulFoodComponents.JALAPENO);
    public static final Item KALE = foodItem("kale", NaturalBlocks.KALE, OverhaulFoodComponents.KALE);
    public static final Item LETTUCE = foodItem("lettuce", NaturalBlocks.LETTUCE, OverhaulFoodComponents.LETTUCE);
    public static final Item ONION = foodItem("onion", NaturalBlocks.ONIONS, OverhaulFoodComponents.ONION);
    public static final Item PARSNIP = foodItem("parsnip", NaturalBlocks.PARSNIPS, OverhaulFoodComponents.PARSNIP);
    public static final Item PEAS = foodItem("peas", NaturalBlocks.PEAS, OverhaulFoodComponents.PEAS);
    public static final Item PEPPER = foodItem("pepper", NaturalBlocks.PEPPERS, OverhaulFoodComponents.PEPPER);
    public static final Item RADISH = foodItem("radish", NaturalBlocks.RADISHES, OverhaulFoodComponents.RADISH);
    public static final Item SPINACH = foodItem("spinach", NaturalBlocks.SPINACH, OverhaulFoodComponents.SPINACH);
    public static final Item TURNIP = foodItem("turnip", NaturalBlocks.TURNIPS, OverhaulFoodComponents.TURNIP);

    // ` -------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static Item signItem(Block sign, Block wallSign, boolean hangingSign) {
        if (hangingSign) return Items.register(sign, (block, settings) -> new HangingSignItem(block, wallSign, settings), new Item.Settings().maxCount(16));
        else return Items.register(sign, (block, settings) -> new SignItem(block, wallSign, settings), new Item.Settings().maxCount(16));
    }

    // * -------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static Item graniteOre(Block block) {
        return Items.register(block, GraniteOreItem::new);
    }

    public static Item dioriteOre(Block block) {
        return Items.register(block, DioriteOreItem::new);
    }

    public static Item andesiteOre(Block block) {
        return Items.register(block, AndesiteOreItem::new);
    }

    public static Item tuffOre(Block block) {
        return Items.register(block, TuffOreItem::new);
    }

    public static Item gneissOre(Block block) {
        return Items.register(block, GneissOreItem::new);
    }

    public static Item shaleOre(Block block) {
        return Items.register(block, ShaleOreItem::new);
    }

    public static Item limestoneOre(Block block) {
        return Items.register(block, LimestoneOreItem::new);
    }

    public static Item marbleOre(Block block) {
        return Items.register(block, MarbleOreItem::new);
    }

    public static Item gabbroOre(Block block) {
        return Items.register(block, GabbroOreItem::new);
    }

    public static Item phylliteOre(Block block) {
        return Items.register(block, PhylliteOreItem::new);
    }

    private static Item foodItem(String id, Block block, FoodComponent foodComponent) {
        return register(id, (settings -> new BlockItem(block, settings)), new Item.Settings().food(foodComponent));
    }

    // ` -------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static void registerBlockItems() {
        WithersOverhaul.LOGGER.info("Registering Block Items for " + WithersOverhaul.MOD_ID);
    }
}
