package me.withers_overhaul.tag;

import me.withers_overhaul.block.util.OverhaulWoodTypes;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static me.withers_overhaul.WithersOverhaul.MOD_ID;
import static me.withers_overhaul.block.util.OverhaulWoodTypes.WoodType.*;

public class OverhaulBlockTags {

    public static final TagKey<Block> MAPLE_LOGS = LogTagKey(MAPLE);
    public static final TagKey<Block> POPLAR_LOGS = LogTagKey(POPLAR);
    public static final TagKey<Block> BEECH_LOGS = LogTagKey(BEECH);
    public static final TagKey<Block> HICKORY_LOGS = LogTagKey(HICKORY);
    public static final TagKey<Block> WALNUT_LOGS = LogTagKey(WALNUT);
    public static final TagKey<Block> CHESTNUT_LOGS = LogTagKey(CHESTNUT);
    public static final TagKey<Block> CEDAR_LOGS = LogTagKey(CEDAR);
    public static final TagKey<Block> REDWOOD_LOGS = LogTagKey(REDWOOD);
    public static final TagKey<Block> FIR_LOGS = LogTagKey(FIR);
    public static final TagKey<Block> HEMLOCK_LOGS = LogTagKey(HEMLOCK);
    public static final TagKey<Block> HOLLY_LOGS = LogTagKey(HOLLY);
    public static final TagKey<Block> PINE_LOGS = LogTagKey(PINE);
    public static final TagKey<Block> LARCH_LOGS = LogTagKey(LARCH);
    public static final TagKey<Block> ASPEN_LOGS = LogTagKey(ASPEN);
    public static final TagKey<Block> KAPOK_LOGS = LogTagKey(KAPOK);
    public static final TagKey<Block> MAHOGANY_LOGS = LogTagKey(MAHOGANY);
    public static final TagKey<Block> EUCALYPTUS_LOGS = LogTagKey(EUCALYPTUS);
    public static final TagKey<Block> BAOBAB_LOGS = LogTagKey(BAOBAB);
    public static final TagKey<Block> PALO_VERDE_LOGS = LogTagKey(PALO_VERDE);
    public static final TagKey<Block> JOSHUA_LOGS = LogTagKey(JOSHUA);
    public static final TagKey<Block> JUNIPER_LOGS = LogTagKey(JUNIPER);
    public static final TagKey<Block> PALM_LOGS = LogTagKey(PALM);
    public static final TagKey<Block> EBONY_LOGS = LogTagKey(EBONY);
    public static final TagKey<Block> TEAK_LOGS = LogTagKey(TEAK);
    public static final TagKey<Block> ELM_LOGS = LogTagKey(ELM);
    public static final TagKey<Block> WILLOW_LOGS = LogTagKey(WILLOW);
    public static final TagKey<Block> CYPRESS_LOGS = LogTagKey(CYPRESS);
    public static final TagKey<Block> SAKURA_LOGS = LogTagKey(SAKURA);
    public static final TagKey<Block> MAGNOLIA_LOGS = LogTagKey(MAGNOLIA);
    public static final TagKey<Block> JACARANDA_LOGS = LogTagKey(JACARANDA);

    public static final TagKey<Block> CATTAILS_CAN_GROW_ON = BlockTagKey("cattails_can_grow_on");

    public static TagKey<Block> LogTagKey(OverhaulWoodTypes.WoodType woodType) {

        return BlockTagKey(woodType.getName() + "_logs");

    }

    public static TagKey<Block> BlockTagKey(String name) {

        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, name));

    }

}
