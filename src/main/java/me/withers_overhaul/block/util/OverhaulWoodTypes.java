package me.withers_overhaul.block.util;

import me.withers_overhaul.WithersOverhaul;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public class OverhaulWoodTypes {

    public static final WoodType MAPLE_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "maple"), OverhaulBlockSetType.MAPLE);
    public static final WoodType POPLAR_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "poplar"), OverhaulBlockSetType.POPLAR);
    public static final WoodType BEECH_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "beech"), OverhaulBlockSetType.BEECH);
    public static final WoodType HICKORY_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "hickory"), OverhaulBlockSetType.HICKORY);
    public static final WoodType WALNUT_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "walnut"), OverhaulBlockSetType.WALNUT);
    public static final WoodType CHESTNUT_TYPE = WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "chestnut"), OverhaulBlockSetType.CHESTNUT);
    public static final WoodType CEDAR_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "cedar"), OverhaulBlockSetType.CEDAR);
    public static final WoodType REDWOOD_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "redwood"), OverhaulBlockSetType.REDWOOD);
    public static final WoodType FIR_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "fir"), OverhaulBlockSetType.FIR);
    public static final WoodType HEMLOCK_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "hemlock"), OverhaulBlockSetType.HEMLOCK);
    public static final WoodType HOLLY_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "holly"), OverhaulBlockSetType.HOLLY);
    public static final WoodType PINE_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "pine"), OverhaulBlockSetType.PINE);
    public static final WoodType LARCH_TYPE = WoodTypeBuilder.copyOf(WoodType.SPRUCE).register(Identifier.of(WithersOverhaul.MOD_ID, "larch"), OverhaulBlockSetType.LARCH);
    public static final WoodType ASPEN_TYPE = WoodTypeBuilder.copyOf(WoodType.BIRCH).register(Identifier.of(WithersOverhaul.MOD_ID, "aspen"), OverhaulBlockSetType.ASPEN);
    public static final WoodType KAPOK_TYPE = WoodTypeBuilder.copyOf(WoodType.JUNGLE).register(Identifier.of(WithersOverhaul.MOD_ID, "kapok"), OverhaulBlockSetType.KAPOK);
    public static final WoodType MAHOGANY_TYPE = WoodTypeBuilder.copyOf(WoodType.JUNGLE).register(Identifier.of(WithersOverhaul.MOD_ID, "mahogany"), OverhaulBlockSetType.MAHOGANY);
    public static final WoodType EUCALYPTUS_TYPE = WoodTypeBuilder.copyOf(WoodType.JUNGLE).register(Identifier.of(WithersOverhaul.MOD_ID, "eucalyptus"), OverhaulBlockSetType.EUCALYPTUS);
    public static final WoodType BAOBAB_TYPE = WoodTypeBuilder.copyOf(WoodType.ACACIA).register(Identifier.of(WithersOverhaul.MOD_ID, "baobab"), OverhaulBlockSetType.BAOBAB);
    public static final WoodType PALO_VERDE_TYPE = WoodTypeBuilder.copyOf(WoodType.ACACIA).register(Identifier.of(WithersOverhaul.MOD_ID, "palo_verde"), OverhaulBlockSetType.PALO_VERDE);
    public static final WoodType JOSHUA_TYPE = WoodTypeBuilder.copyOf(WoodType.ACACIA).register(Identifier.of(WithersOverhaul.MOD_ID, "joshua"), OverhaulBlockSetType.JOSHUA);
    public static final WoodType JUNIPER_TYPE = WoodTypeBuilder.copyOf(WoodType.ACACIA).register(Identifier.of(WithersOverhaul.MOD_ID, "juniper"), OverhaulBlockSetType.JUNIPER);
    public static final WoodType PALM_TYPE = WoodTypeBuilder.copyOf(WoodType.ACACIA).register(Identifier.of(WithersOverhaul.MOD_ID, "palm"), OverhaulBlockSetType.PALM);
    public static final WoodType EBONY_TYPE = WoodTypeBuilder.copyOf(WoodType.DARK_OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "ebony"), OverhaulBlockSetType.EBONY);
    public static final WoodType TEAK_TYPE = WoodTypeBuilder.copyOf(WoodType.DARK_OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "teak"), OverhaulBlockSetType.TEAK);
    public static final WoodType ELM_TYPE = WoodTypeBuilder.copyOf(WoodType.DARK_OAK).register(Identifier.of(WithersOverhaul.MOD_ID, "elm"), OverhaulBlockSetType.ELM);
    public static final WoodType WILLOW_TYPE = WoodTypeBuilder.copyOf(WoodType.MANGROVE).register(Identifier.of(WithersOverhaul.MOD_ID, "willow"), OverhaulBlockSetType.WILLOW);
    public static final WoodType CYPRESS_TYPE = WoodTypeBuilder.copyOf(WoodType.MANGROVE).register(Identifier.of(WithersOverhaul.MOD_ID, "cypress"), OverhaulBlockSetType.CYPRESS);
    public static final WoodType SAKURA_TYPE = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(Identifier.of(WithersOverhaul.MOD_ID, "sakura"), OverhaulBlockSetType.SAKURA);
    public static final WoodType MAGNOLIA_TYPE = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(Identifier.of(WithersOverhaul.MOD_ID, "magnolia"), OverhaulBlockSetType.MAGNOLIA);
    public static final WoodType JACARANDA_TYPE = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(Identifier.of(WithersOverhaul.MOD_ID, "jacaranda"), OverhaulBlockSetType.JACARANDA);

    public enum OverhaulWoodType {
        MAPLE("maple", MAPLE_TYPE),
        POPLAR("poplar", POPLAR_TYPE),
        BEECH("beech", BEECH_TYPE),
        HICKORY("hickory", HICKORY_TYPE),
        WALNUT("walnut", WALNUT_TYPE),
        CHESTNUT("chestnut", CHESTNUT_TYPE),
        CEDAR("cedar", CEDAR_TYPE),
        REDWOOD("redwood", REDWOOD_TYPE),
        FIR("fir", FIR_TYPE),
        HEMLOCK("hemlock", HEMLOCK_TYPE),
        HOLLY("holly", HOLLY_TYPE),
        PINE("pine", PINE_TYPE),
        LARCH("larch", LARCH_TYPE),
        ASPEN("aspen", ASPEN_TYPE),
        KAPOK("kapok", KAPOK_TYPE),
        MAHOGANY("mahogany", MAHOGANY_TYPE),
        EUCALYPTUS("eucalyptus", EUCALYPTUS_TYPE),
        BAOBAB("baobab", BAOBAB_TYPE),
        PALO_VERDE("palo_verde", PALO_VERDE_TYPE),
        JOSHUA("joshua", JOSHUA_TYPE),
        JUNIPER("juniper", JUNIPER_TYPE),
        PALM("palm", PALM_TYPE),
        EBONY("ebony", EBONY_TYPE),
        TEAK("teak", TEAK_TYPE),
        ELM("elm", ELM_TYPE),
        WILLOW("willow", WILLOW_TYPE),
        CYPRESS("cypress", CYPRESS_TYPE),
        SAKURA("sakura", SAKURA_TYPE),
        MAGNOLIA("magnolia", MAGNOLIA_TYPE),
        JACARANDA("jacaranda", JACARANDA_TYPE);

        private final String name;
        private final WoodType woodType;

        OverhaulWoodType(final String name, WoodType woodType) {
            this.name = name;
            this.woodType = woodType;
        }

        public String getName() {
            return this.name;
        }
        public WoodType getWoodType() {
            return this.woodType;
        }
    }
}
