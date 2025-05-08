package me.withers_overhaul.tag;

import me.withers_overhaul.block.util.OverhaulWoodTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static me.withers_overhaul.WithersOverhaul.MOD_ID;
import static me.withers_overhaul.block.util.OverhaulWoodTypes.WoodType.*;

public class OverhaulItemTags {

    public static final TagKey<Item> MAPLE_LOGS = LogTagKey(MAPLE);
    public static final TagKey<Item> POPLAR_LOGS = LogTagKey(POPLAR);
    public static final TagKey<Item> BEECH_LOGS = LogTagKey(BEECH);
    public static final TagKey<Item> HICKORY_LOGS = LogTagKey(HICKORY);
    public static final TagKey<Item> WALNUT_LOGS = LogTagKey(WALNUT);
    public static final TagKey<Item> CHESTNUT_LOGS = LogTagKey(CHESTNUT);
    public static final TagKey<Item> CEDAR_LOGS = LogTagKey(CEDAR);
    public static final TagKey<Item> REDWOOD_LOGS = LogTagKey(REDWOOD);
    public static final TagKey<Item> FIR_LOGS = LogTagKey(FIR);
    public static final TagKey<Item> HEMLOCK_LOGS = LogTagKey(HEMLOCK);
    public static final TagKey<Item> HOLLY_LOGS = LogTagKey(HOLLY);
    public static final TagKey<Item> PINE_LOGS = LogTagKey(PINE);
    public static final TagKey<Item> LARCH_LOGS = LogTagKey(LARCH);
    public static final TagKey<Item> ASPEN_LOGS = LogTagKey(ASPEN);
    public static final TagKey<Item> KAPOK_LOGS = LogTagKey(KAPOK);
    public static final TagKey<Item> MAHOGANY_LOGS = LogTagKey(MAHOGANY);
    public static final TagKey<Item> EUCALYPTUS_LOGS = LogTagKey(EUCALYPTUS);
    public static final TagKey<Item> BAOBAB_LOGS = LogTagKey(BAOBAB);
    public static final TagKey<Item> PALO_VERDE_LOGS = LogTagKey(PALO_VERDE);
    public static final TagKey<Item> JOSHUA_LOGS = LogTagKey(JOSHUA);
    public static final TagKey<Item> JUNIPER_LOGS = LogTagKey(JUNIPER);
    public static final TagKey<Item> PALM_LOGS = LogTagKey(PALM);
    public static final TagKey<Item> EBONY_LOGS = LogTagKey(EBONY);
    public static final TagKey<Item> TEAK_LOGS = LogTagKey(TEAK);
    public static final TagKey<Item> ELM_LOGS = LogTagKey(ELM);
    public static final TagKey<Item> WILLOW_LOGS = LogTagKey(WILLOW);
    public static final TagKey<Item> CYPRESS_LOGS = LogTagKey(CYPRESS);
    public static final TagKey<Item> SAKURA_LOGS = LogTagKey(SAKURA);
    public static final TagKey<Item> MAGNOLIA_LOGS = LogTagKey(MAGNOLIA);
    public static final TagKey<Item> JACARANDA_LOGS = LogTagKey(JACARANDA);

    public static TagKey<Item> LogTagKey(OverhaulWoodTypes.WoodType woodType) {

        return ItemTagKey(woodType.getName() + "_logs");

    }

    public static TagKey<Item> ItemTagKey(String name) {

        return TagKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));

    }

}
