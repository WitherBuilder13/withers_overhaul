package me.withers_overhaul.registry.item;

import me.withers_overhaul.WithersOverhaul;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class OverhaulItems {


    public static Item register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return Items.register(keyOf(id), factory, settings);
    }

    public static Item register(String id, Function<Item.Settings, Item> factory) {
        return Items.register(keyOf(id), factory, new Item.Settings());
    }

    public static RegistryKey<Item> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WithersOverhaul.MOD_ID, id));
    }

    public static final String TOOLTIP_PATH = "item_tooltip.withers_overhaul.";

    public static void registerItems() {
        WithersOverhaul.LOGGER.info("Registering items for " + WithersOverhaul.MOD_ID);

        BasicItems.registerBasicItems();
        BlockItems.registerBlockItems();
        OverhaulItemGroups.registerItemGroups();
    }
}
