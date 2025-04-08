package me.withers_overhaul.registry.block;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.block.util.OverhaulBlockFamilies;
import me.withers_overhaul.block.util.OverhaulBlockSetType;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class OverhaulBlocks {

    public static Block register(String name, Block block, boolean registerBlockItem) {
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(WithersOverhaul.MOD_ID, name));
        if (registerBlockItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).useBlockPrefixedTranslationKey());
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }
        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    public static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(WithersOverhaul.MOD_ID, name));
    }

    public static void registerBlocks() {
        WithersOverhaul.LOGGER.info("Registering blocks for " + WithersOverhaul.MOD_ID);
        StoneBlocks.registerStoneBlocks();
        WoodBlocks.registerWoodBlocks();
        ColoredBlocks.registerColoredBlocks();
        NaturalBlocks.registerNaturalBlocks();
        OverhaulBlockFamilies.registerBlockFamilies();
        OverhaulBlockSetType.registerBlockSetTypes();
    }
}
