package me.withers_overhaul.registry.item;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.item.RuneItem;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static me.withers_overhaul.registry.item.OverhaulItems.register;
import static net.minecraft.util.Rarity.*;

public class BasicItems {
    public static final Item WARPED_WART = register("warped_wart", Item::new);

    //RUNES
    public static final Item RUNE_AQUA_AFFINITY = registerRuneItem("aqua_affinity", UNCOMMON);
    public static final Item RUNE_BANE_OF_ARTHROPODS = registerRuneItem("bane_of_arthropods", UNCOMMON);
    public static final Item RUNE_BLAST_PROTECTION = registerRuneItem("blast_protection", UNCOMMON);
    public static final Item RUNE_BREACH = registerRuneItem ("breach", RARE);
    public static final Item RUNE_CHANNELING = registerRuneItem("channeling", RARE);
    public static final Item RUNE_DENSITY = registerRuneItem("density", RARE);
    public static final Item RUNE_DEPTH_STRIDER = registerRuneItem("depth_strider", UNCOMMON);
    public static final Item RUNE_EFFICIENCY = registerRuneItem("efficiency", UNCOMMON);
    public static final Item RUNE_FEATHER_FALLING = registerRuneItem("feather_falling", UNCOMMON);
    public static final Item RUNE_FIRE_ASPECT = registerRuneItem("fire_aspect", UNCOMMON);
    public static final Item RUNE_FIRE_PROTECTION = registerRuneItem("fire_protection", UNCOMMON);
    public static final Item RUNE_FLAME = registerRuneItem("flame", UNCOMMON);
    public static final Item RUNE_FORTUNE = registerRuneItem("fortune", UNCOMMON);
    public static final Item RUNE_FROST_WALKER = registerRuneItem("frost_walker", UNCOMMON);
    public static final Item RUNE_IMPALING = registerRuneItem("impaling", RARE);
    public static final Item RUNE_INFINITY = registerRuneItem("infinity", RARE);
    public static final Item RUNE_KNOCKBACK = registerRuneItem("knockback", UNCOMMON);
    public static final Item RUNE_LOOTING = registerRuneItem("looting", UNCOMMON);
    public static final Item RUNE_LOYALTY = registerRuneItem("loyalty", RARE);
    public static final Item RUNE_LUCK_OF_THE_SEA = registerRuneItem("luck_of_the_sea", UNCOMMON);
    public static final Item RUNE_LURE = registerRuneItem("lure", UNCOMMON);
    public static final Item RUNE_MENDING = registerRuneItem("mending", EPIC);
    public static final Item RUNE_MULTISHOT = registerRuneItem("multishot", UNCOMMON);
    public static final Item RUNE_PIERCING = registerRuneItem("piercing", UNCOMMON);
    public static final Item RUNE_POWER = registerRuneItem("power", UNCOMMON);
    public static final Item RUNE_PROJECTILE_PROTECTION = registerRuneItem("projectile_protection", UNCOMMON);
    public static final Item RUNE_PROTECTION = registerRuneItem("protection", UNCOMMON);
    public static final Item RUNE_PUNCH = registerRuneItem("punch", UNCOMMON);
    public static final Item RUNE_QUICK_CHARGE = registerRuneItem("quick_charge", UNCOMMON);
    public static final Item RUNE_RESPIRATION = registerRuneItem("respiration", UNCOMMON);
    public static final Item RUNE_RIPTIDE = registerRuneItem("riptide", EPIC);
    public static final Item RUNE_SHARPNESS = registerRuneItem("sharpness", UNCOMMON);
    public static final Item RUNE_SILK_TOUCH = registerRuneItem("silk_touch", UNCOMMON);
    public static final Item RUNE_SMITE = registerRuneItem("smite", UNCOMMON);
    public static final Item RUNE_SOUL_SPEED = registerRuneItem("soul_speed", RARE);
    public static final Item RUNE_SWEEPING_EDGE = registerRuneItem("sweeping_edge", UNCOMMON);
    public static final Item RUNE_SWIFT_SNEAK = registerRuneItem("swift_sneak", RARE);
    public static final Item RUNE_THORNS = registerRuneItem("thorns", RARE);
    public static final Item RUNE_UNBREAKING = registerRuneItem("unbreaking", UNCOMMON);
    public static final Item RUNE_WIND_BURST = registerRuneItem("wind_burst", EPIC);

    public static final Item GOURD_SEEDS = register("gourd_seeds", Item::new);

    private static Item registerRuneItem(String enchantmentName, Rarity rarity) {
        return register("rune_" + enchantmentName, RuneItem::new, new Item.Settings().rarity(rarity));
    }

    public static void registerBasicItems() {
        WithersOverhaul.LOGGER.info("Registering Basic Items for " + WithersOverhaul.MOD_ID);
    }
}
