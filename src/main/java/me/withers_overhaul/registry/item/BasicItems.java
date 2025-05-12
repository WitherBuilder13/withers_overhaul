package me.withers_overhaul.registry.item;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.item.RuneItem;
import me.withers_overhaul.item.component.OverhaulFoodComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static me.withers_overhaul.registry.item.OverhaulItems.register;
import static net.minecraft.util.Rarity.*;

public class BasicItems {
    public static final Item WARPED_WART = register("warped_wart", Item::new);

    public static final Item APRICOT = foodItem("apricot", OverhaulFoodComponents.APRICOT);
    public static final Item AVOCADO = foodItem("avocado", OverhaulFoodComponents.AVOCADO);
    public static final Item BANANA = foodItem("banana", OverhaulFoodComponents.BANANA);
    public static final Item CHERRY = foodItem("cherry", OverhaulFoodComponents.CHERRY);
    public static final Item DATE = foodItem("date", OverhaulFoodComponents.DATE);
    public static final Item FIG = foodItem("fig", OverhaulFoodComponents.FIG);
    public static final Item GRAPEFRUIT = foodItem("grapefruit", OverhaulFoodComponents.GRAPEFRUIT);
    public static final Item GUAVA = foodItem("guava", OverhaulFoodComponents.GUAVA);
    public static final Item KIWI = foodItem("kiwi", OverhaulFoodComponents.KIWI);
    public static final Item KUMQUAT = foodItem("kumquat", OverhaulFoodComponents.KUMQUAT);
    public static final Item LEMON = foodItem("lemon", OverhaulFoodComponents.LEMON);
    public static final Item LIME = foodItem("lime", OverhaulFoodComponents.LIME);
    public static final Item MANGO = foodItem("mango", OverhaulFoodComponents.MANGO);
    public static final Item NECTARINE = foodItem("nectarine", OverhaulFoodComponents.NECTARINE);
    public static final Item OLIVE = foodItem("olive", OverhaulFoodComponents.OLIVE);
    public static final Item ORANGE = foodItem("orange", OverhaulFoodComponents.ORANGE);
    public static final Item PEACH = foodItem("peach", OverhaulFoodComponents.PEACH);
    public static final Item PEAR = foodItem("pear", OverhaulFoodComponents.PEAR);
    public static final Item PERSIMMON = foodItem("persimmon", OverhaulFoodComponents.PERSIMMON);
    public static final Item PICKLE = foodItem("pickle", OverhaulFoodComponents.PICKLE);
    public static final Item PLUM = foodItem("plum", OverhaulFoodComponents.PLUM);
    public static final Item POMEGRANATE = foodItem("pomegranate", OverhaulFoodComponents.POMEGRANATE);
    public static final Item STARFRUIT = foodItem("starfruit", OverhaulFoodComponents.STARFRUIT);
    public static final Item TANGERINE = foodItem("tangerine", OverhaulFoodComponents.TANGERINE);

    //RUNES
    public static final Item RUNE_AQUA_AFFINITY = runeItem("aqua_affinity", UNCOMMON);
    public static final Item RUNE_BANE_OF_ARTHROPODS = runeItem("bane_of_arthropods", UNCOMMON);
    public static final Item RUNE_BLAST_PROTECTION = runeItem("blast_protection", UNCOMMON);
    public static final Item RUNE_BREACH = runeItem("breach", RARE);
    public static final Item RUNE_CHANNELING = runeItem("channeling", RARE);
    public static final Item RUNE_DENSITY = runeItem("density", RARE);
    public static final Item RUNE_DEPTH_STRIDER = runeItem("depth_strider", UNCOMMON);
    public static final Item RUNE_EFFICIENCY = runeItem("efficiency", UNCOMMON);
    public static final Item RUNE_FEATHER_FALLING = runeItem("feather_falling", UNCOMMON);
    public static final Item RUNE_FIRE_ASPECT = runeItem("fire_aspect", UNCOMMON);
    public static final Item RUNE_FIRE_PROTECTION = runeItem("fire_protection", UNCOMMON);
    public static final Item RUNE_FLAME = runeItem("flame", UNCOMMON);
    public static final Item RUNE_FORTUNE = runeItem("fortune", UNCOMMON);
    public static final Item RUNE_FROST_WALKER = runeItem("frost_walker", UNCOMMON);
    public static final Item RUNE_IMPALING = runeItem("impaling", RARE);
    public static final Item RUNE_INFINITY = runeItem("infinity", RARE);
    public static final Item RUNE_KNOCKBACK = runeItem("knockback", UNCOMMON);
    public static final Item RUNE_LOOTING = runeItem("looting", UNCOMMON);
    public static final Item RUNE_LOYALTY = runeItem("loyalty", RARE);
    public static final Item RUNE_LUCK_OF_THE_SEA = runeItem("luck_of_the_sea", UNCOMMON);
    public static final Item RUNE_LURE = runeItem("lure", UNCOMMON);
    public static final Item RUNE_MENDING = runeItem("mending", EPIC);
    public static final Item RUNE_MULTISHOT = runeItem("multishot", UNCOMMON);
    public static final Item RUNE_PIERCING = runeItem("piercing", UNCOMMON);
    public static final Item RUNE_POWER = runeItem("power", UNCOMMON);
    public static final Item RUNE_PROJECTILE_PROTECTION = runeItem("projectile_protection", UNCOMMON);
    public static final Item RUNE_PROTECTION = runeItem("protection", UNCOMMON);
    public static final Item RUNE_PUNCH = runeItem("punch", UNCOMMON);
    public static final Item RUNE_QUICK_CHARGE = runeItem("quick_charge", UNCOMMON);
    public static final Item RUNE_RESPIRATION = runeItem("respiration", UNCOMMON);
    public static final Item RUNE_RIPTIDE = runeItem("riptide", EPIC);
    public static final Item RUNE_SHARPNESS = runeItem("sharpness", UNCOMMON);
    public static final Item RUNE_SILK_TOUCH = runeItem("silk_touch", UNCOMMON);
    public static final Item RUNE_SMITE = runeItem("smite", UNCOMMON);
    public static final Item RUNE_SOUL_SPEED = runeItem("soul_speed", RARE);
    public static final Item RUNE_SWEEPING_EDGE = runeItem("sweeping_edge", UNCOMMON);
    public static final Item RUNE_SWIFT_SNEAK = runeItem("swift_sneak", RARE);
    public static final Item RUNE_THORNS = runeItem("thorns", RARE);
    public static final Item RUNE_UNBREAKING = runeItem("unbreaking", UNCOMMON);
    public static final Item RUNE_WIND_BURST = runeItem("wind_burst", EPIC);

    public static final Item GOURD_SEEDS = register("gourd_seeds", Item::new);

    // ` --------------------------------------------------------------------------------------------------------------------

    private static Item runeItem(String enchantmentName, Rarity rarity) {
        return register("rune_" + enchantmentName, RuneItem::new, new Item.Settings().rarity(rarity));
    }

    private static Item foodItem(String name, FoodComponent foodComponent) {
        return register(name, Item::new, new Item.Settings().food(foodComponent));
    }

    public static void registerBasicItems() {
        WithersOverhaul.LOGGER.info("Registering Basic Items for " + WithersOverhaul.MOD_ID);
    }
}
