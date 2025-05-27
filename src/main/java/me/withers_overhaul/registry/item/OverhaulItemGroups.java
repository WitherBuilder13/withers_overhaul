package me.withers_overhaul.registry.item;

import me.withers_overhaul.WithersOverhaul;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static me.withers_overhaul.registry.block.ColoredBlocks.*;
import static me.withers_overhaul.registry.block.NaturalBlocks.*;
import static me.withers_overhaul.registry.block.StoneBlocks.*;
import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.registry.item.BasicItems.*;
import static net.minecraft.item.Items.*;

public class OverhaulItemGroups {

    public static final RegistryKey<ItemGroup> WITHERS_OVERHAUL_BLOCKS_KEY = RegistryKey.of(
            RegistryKeys.ITEM_GROUP, Identifier.of(WithersOverhaul.MOD_ID, "withers_overhaul_blocks")
    );

    public static final ItemGroup WITHERS_OVERHAUL_BLOCKS = Registry.register(Registries.ITEM_GROUP, WITHERS_OVERHAUL_BLOCKS_KEY,
            FabricItemGroup.builder().icon(() -> new ItemStack(FIR_LOG))
                    .displayName(Text.translatable("item_group.withers_overhaul.blocks"))
                    .entries(((displayContext, content) -> {

                        //WOOD

                        //MAPLE
                        content.add(MAPLE_LOG);
                        content.add(MAPLE_WOOD);
                        content.add(STRIPPED_MAPLE_LOG);
                        content.add(STRIPPED_MAPLE_WOOD);
                        content.add(MAPLE_PLANKS);
                        content.add(MAPLE_STAIRS);
                        content.add(MAPLE_SLAB);
                        content.add(MAPLE_FENCE);
                        content.add(MAPLE_FENCE_GATE);
                        content.add(MAPLE_DOOR);
                        content.add(MAPLE_TRAPDOOR);
                        content.add(MAPLE_PRESSURE_PLATE);
                        content.add(MAPLE_BUTTON);
                        content.add(BlockItems.MAPLE_SIGN);
                        content.add(BlockItems.MAPLE_HANGING_SIGN);

                        //POPLAR
                        content.add(POPLAR_LOG);
                        content.add(POPLAR_WOOD);
                        content.add(STRIPPED_POPLAR_LOG);
                        content.add(STRIPPED_POPLAR_WOOD);
                        content.add(POPLAR_PLANKS);
                        content.add(POPLAR_STAIRS);
                        content.add(POPLAR_SLAB);
                        content.add(POPLAR_FENCE);
                        content.add(POPLAR_FENCE_GATE);
                        content.add(POPLAR_DOOR);
                        content.add(POPLAR_TRAPDOOR);
                        content.add(POPLAR_PRESSURE_PLATE);
                        content.add(POPLAR_BUTTON);
                        content.add(BlockItems.POPLAR_SIGN);
                        content.add(BlockItems.POPLAR_HANGING_SIGN);

                        //BEECH
                        content.add(BEECH_LOG);
                        content.add(BEECH_WOOD);
                        content.add(STRIPPED_BEECH_LOG);
                        content.add(STRIPPED_BEECH_WOOD);
                        content.add(BEECH_PLANKS);
                        content.add(BEECH_STAIRS);
                        content.add(BEECH_SLAB);
                        content.add(BEECH_FENCE);
                        content.add(BEECH_FENCE_GATE);
                        content.add(BEECH_DOOR);
                        content.add(BEECH_TRAPDOOR);
                        content.add(BEECH_PRESSURE_PLATE);
                        content.add(BEECH_BUTTON);
                        content.add(BlockItems.BEECH_SIGN);
                        content.add(BlockItems.BEECH_HANGING_SIGN);

                        //HICKORY
                        content.add(HICKORY_LOG);
                        content.add(HICKORY_WOOD);
                        content.add(STRIPPED_HICKORY_LOG);
                        content.add(STRIPPED_HICKORY_WOOD);
                        content.add(HICKORY_PLANKS);
                        content.add(HICKORY_STAIRS);
                        content.add(HICKORY_SLAB);
                        content.add(HICKORY_FENCE);
                        content.add(HICKORY_FENCE_GATE);
                        content.add(HICKORY_DOOR);
                        content.add(HICKORY_TRAPDOOR);
                        content.add(HICKORY_PRESSURE_PLATE);
                        content.add(HICKORY_BUTTON);
                        content.add(BlockItems.HICKORY_SIGN);
                        content.add(BlockItems.HICKORY_HANGING_SIGN);

                        //WALNUT
                        content.add(WALNUT_LOG);
                        content.add(WALNUT_WOOD);
                        content.add(STRIPPED_WALNUT_LOG);
                        content.add(STRIPPED_WALNUT_WOOD);
                        content.add(WALNUT_PLANKS);
                        content.add(WALNUT_STAIRS);
                        content.add(WALNUT_SLAB);
                        content.add(WALNUT_FENCE);
                        content.add(WALNUT_FENCE_GATE);
                        content.add(WALNUT_DOOR);
                        content.add(WALNUT_TRAPDOOR);
                        content.add(WALNUT_PRESSURE_PLATE);
                        content.add(WALNUT_BUTTON);
                        content.add(BlockItems.WALNUT_SIGN);
                        content.add(BlockItems.WALNUT_HANGING_SIGN);

                        //CHESTNUT
                        content.add(CHESTNUT_LOG);
                        content.add(CHESTNUT_WOOD);
                        content.add(STRIPPED_CHESTNUT_LOG);
                        content.add(STRIPPED_CHESTNUT_WOOD);
                        content.add(CHESTNUT_PLANKS);
                        content.add(CHESTNUT_STAIRS);
                        content.add(CHESTNUT_SLAB);
                        content.add(CHESTNUT_FENCE);
                        content.add(CHESTNUT_FENCE_GATE);
                        content.add(CHESTNUT_DOOR);
                        content.add(CHESTNUT_TRAPDOOR);
                        content.add(CHESTNUT_PRESSURE_PLATE);
                        content.add(CHESTNUT_BUTTON);
                        content.add(BlockItems.CHESTNUT_SIGN);
                        content.add(BlockItems.CHESTNUT_HANGING_SIGN);

                        //CEDAR
                        content.add(CEDAR_LOG);
                        content.add(CEDAR_WOOD);
                        content.add(STRIPPED_CEDAR_LOG);
                        content.add(STRIPPED_CEDAR_WOOD);
                        content.add(CEDAR_PLANKS);
                        content.add(CEDAR_STAIRS);
                        content.add(CEDAR_SLAB);
                        content.add(CEDAR_FENCE);
                        content.add(CEDAR_FENCE_GATE);
                        content.add(CEDAR_DOOR);
                        content.add(CEDAR_TRAPDOOR);
                        content.add(CEDAR_PRESSURE_PLATE);
                        content.add(CEDAR_BUTTON);
                        content.add(BlockItems.CEDAR_SIGN);
                        content.add(BlockItems.CEDAR_HANGING_SIGN);

                        //REDWOOD
                        content.add(REDWOOD_LOG);
                        content.add(REDWOOD_WOOD);
                        content.add(STRIPPED_REDWOOD_LOG);
                        content.add(STRIPPED_REDWOOD_WOOD);
                        content.add(REDWOOD_PLANKS);
                        content.add(REDWOOD_STAIRS);
                        content.add(REDWOOD_SLAB);
                        content.add(REDWOOD_FENCE);
                        content.add(REDWOOD_FENCE_GATE);
                        content.add(REDWOOD_DOOR);
                        content.add(REDWOOD_TRAPDOOR);
                        content.add(REDWOOD_PRESSURE_PLATE);
                        content.add(REDWOOD_BUTTON);
                        content.add(BlockItems.REDWOOD_SIGN);
                        content.add(BlockItems.REDWOOD_HANGING_SIGN);

                        //FIR
                        content.add(FIR_LOG);
                        content.add(FIR_WOOD);
                        content.add(STRIPPED_FIR_LOG);
                        content.add(STRIPPED_FIR_WOOD);
                        content.add(FIR_PLANKS);
                        content.add(FIR_STAIRS);
                        content.add(FIR_SLAB);
                        content.add(FIR_FENCE);
                        content.add(FIR_FENCE_GATE);
                        content.add(FIR_DOOR);
                        content.add(FIR_TRAPDOOR);
                        content.add(FIR_PRESSURE_PLATE);
                        content.add(FIR_BUTTON);
                        content.add(BlockItems.FIR_SIGN);
                        content.add(BlockItems.FIR_HANGING_SIGN);

                        //HEMLOCK
                        content.add(HEMLOCK_LOG);
                        content.add(HEMLOCK_WOOD);
                        content.add(STRIPPED_HEMLOCK_LOG);
                        content.add(STRIPPED_HEMLOCK_WOOD);
                        content.add(HEMLOCK_PLANKS);
                        content.add(HEMLOCK_STAIRS);
                        content.add(HEMLOCK_SLAB);
                        content.add(HEMLOCK_FENCE);
                        content.add(HEMLOCK_FENCE_GATE);
                        content.add(HEMLOCK_DOOR);
                        content.add(HEMLOCK_TRAPDOOR);
                        content.add(HEMLOCK_PRESSURE_PLATE);
                        content.add(HEMLOCK_BUTTON);
                        content.add(BlockItems.HEMLOCK_SIGN);
                        content.add(BlockItems.HEMLOCK_HANGING_SIGN);

                        //HOLLY
                        content.add(HOLLY_LOG);
                        content.add(HOLLY_WOOD);
                        content.add(STRIPPED_HOLLY_LOG);
                        content.add(STRIPPED_HOLLY_WOOD);
                        content.add(HOLLY_PLANKS);
                        content.add(HOLLY_STAIRS);
                        content.add(HOLLY_SLAB);
                        content.add(HOLLY_FENCE);
                        content.add(HOLLY_FENCE_GATE);
                        content.add(HOLLY_DOOR);
                        content.add(HOLLY_TRAPDOOR);
                        content.add(HOLLY_PRESSURE_PLATE);
                        content.add(HOLLY_BUTTON);
                        content.add(BlockItems.HOLLY_SIGN);
                        content.add(BlockItems.HOLLY_HANGING_SIGN);

                        //PINE
                        content.add(PINE_LOG);
                        content.add(PINE_WOOD);
                        content.add(STRIPPED_PINE_LOG);
                        content.add(STRIPPED_PINE_WOOD);
                        content.add(PINE_PLANKS);
                        content.add(PINE_STAIRS);
                        content.add(PINE_SLAB);
                        content.add(PINE_FENCE);
                        content.add(PINE_FENCE_GATE);
                        content.add(PINE_DOOR);
                        content.add(PINE_TRAPDOOR);
                        content.add(PINE_PRESSURE_PLATE);
                        content.add(PINE_BUTTON);
                        content.add(BlockItems.PINE_SIGN);
                        content.add(BlockItems.PINE_HANGING_SIGN);

                        //LARCH
                        content.add(LARCH_LOG);
                        content.add(LARCH_WOOD);
                        content.add(STRIPPED_LARCH_LOG);
                        content.add(STRIPPED_LARCH_WOOD);
                        content.add(LARCH_PLANKS);
                        content.add(LARCH_STAIRS);
                        content.add(LARCH_SLAB);
                        content.add(LARCH_FENCE);
                        content.add(LARCH_FENCE_GATE);
                        content.add(LARCH_DOOR);
                        content.add(LARCH_TRAPDOOR);
                        content.add(LARCH_PRESSURE_PLATE);
                        content.add(LARCH_BUTTON);
                        content.add(BlockItems.LARCH_SIGN);
                        content.add(BlockItems.LARCH_HANGING_SIGN);

                        //ASPEN
                        content.add(ASPEN_LOG);
                        content.add(ASPEN_WOOD);
                        content.add(STRIPPED_ASPEN_LOG);
                        content.add(STRIPPED_ASPEN_WOOD);
                        content.add(ASPEN_PLANKS);
                        content.add(ASPEN_STAIRS);
                        content.add(ASPEN_SLAB);
                        content.add(ASPEN_FENCE);
                        content.add(ASPEN_FENCE_GATE);
                        content.add(ASPEN_DOOR);
                        content.add(ASPEN_TRAPDOOR);
                        content.add(ASPEN_PRESSURE_PLATE);
                        content.add(ASPEN_BUTTON);
                        content.add(BlockItems.ASPEN_SIGN);
                        content.add(BlockItems.ASPEN_HANGING_SIGN);

                        //KAPOK
                        content.add(KAPOK_LOG);
                        content.add(KAPOK_WOOD);
                        content.add(STRIPPED_KAPOK_LOG);
                        content.add(STRIPPED_KAPOK_WOOD);
                        content.add(KAPOK_PLANKS);
                        content.add(KAPOK_STAIRS);
                        content.add(KAPOK_SLAB);
                        content.add(KAPOK_FENCE);
                        content.add(KAPOK_FENCE_GATE);
                        content.add(KAPOK_DOOR);
                        content.add(KAPOK_TRAPDOOR);
                        content.add(KAPOK_PRESSURE_PLATE);
                        content.add(KAPOK_BUTTON);
                        content.add(BlockItems.KAPOK_SIGN);
                        content.add(BlockItems.KAPOK_HANGING_SIGN);

                        //MAHOGANY
                        content.add(MAHOGANY_LOG);
                        content.add(MAHOGANY_WOOD);
                        content.add(STRIPPED_MAHOGANY_LOG);
                        content.add(STRIPPED_MAHOGANY_WOOD);
                        content.add(MAHOGANY_PLANKS);
                        content.add(MAHOGANY_STAIRS);
                        content.add(MAHOGANY_SLAB);
                        content.add(MAHOGANY_FENCE);
                        content.add(MAHOGANY_FENCE_GATE);
                        content.add(MAHOGANY_DOOR);
                        content.add(MAHOGANY_TRAPDOOR);
                        content.add(MAHOGANY_PRESSURE_PLATE);
                        content.add(MAHOGANY_BUTTON);
                        content.add(BlockItems.MAHOGANY_SIGN);
                        content.add(BlockItems.MAHOGANY_HANGING_SIGN);

                        //EUCALYPTUS
                        content.add(EUCALYPTUS_LOG);
                        content.add(EUCALYPTUS_WOOD);
                        content.add(STRIPPED_EUCALYPTUS_LOG);
                        content.add(STRIPPED_EUCALYPTUS_WOOD);
                        content.add(EUCALYPTUS_PLANKS);
                        content.add(EUCALYPTUS_STAIRS);
                        content.add(EUCALYPTUS_SLAB);
                        content.add(EUCALYPTUS_FENCE);
                        content.add(EUCALYPTUS_FENCE_GATE);
                        content.add(EUCALYPTUS_DOOR);
                        content.add(EUCALYPTUS_TRAPDOOR);
                        content.add(EUCALYPTUS_PRESSURE_PLATE);
                        content.add(EUCALYPTUS_BUTTON);
                        content.add(BlockItems.EUCALYPTUS_SIGN);
                        content.add(BlockItems.EUCALYPTUS_HANGING_SIGN);

                        //BAOBAB
                        content.add(BAOBAB_LOG);
                        content.add(BAOBAB_WOOD);
                        content.add(STRIPPED_BAOBAB_LOG);
                        content.add(STRIPPED_BAOBAB_WOOD);
                        content.add(BAOBAB_PLANKS);
                        content.add(BAOBAB_STAIRS);
                        content.add(BAOBAB_SLAB);
                        content.add(BAOBAB_FENCE);
                        content.add(BAOBAB_FENCE_GATE);
                        content.add(BAOBAB_DOOR);
                        content.add(BAOBAB_TRAPDOOR);
                        content.add(BAOBAB_PRESSURE_PLATE);
                        content.add(BAOBAB_BUTTON);
                        content.add(BlockItems.BAOBAB_SIGN);
                        content.add(BlockItems.BAOBAB_HANGING_SIGN);

                        //PALO VERDE
                        content.add(PALO_VERDE_LOG);
                        content.add(PALO_VERDE_WOOD);
                        content.add(STRIPPED_PALO_VERDE_LOG);
                        content.add(STRIPPED_PALO_VERDE_WOOD);
                        content.add(PALO_VERDE_PLANKS);
                        content.add(PALO_VERDE_STAIRS);
                        content.add(PALO_VERDE_SLAB);
                        content.add(PALO_VERDE_FENCE);
                        content.add(PALO_VERDE_FENCE_GATE);
                        content.add(PALO_VERDE_DOOR);
                        content.add(PALO_VERDE_TRAPDOOR);
                        content.add(PALO_VERDE_PRESSURE_PLATE);
                        content.add(PALO_VERDE_BUTTON);
                        content.add(BlockItems.PALO_VERDE_SIGN);
                        content.add(BlockItems.PALO_VERDE_HANGING_SIGN);

                        //JOSHUA
                        content.add(JOSHUA_LOG);
                        content.add(JOSHUA_WOOD);
                        content.add(STRIPPED_JOSHUA_LOG);
                        content.add(STRIPPED_JOSHUA_WOOD);
                        content.add(JOSHUA_PLANKS);
                        content.add(JOSHUA_STAIRS);
                        content.add(JOSHUA_SLAB);
                        content.add(JOSHUA_FENCE);
                        content.add(JOSHUA_FENCE_GATE);
                        content.add(JOSHUA_DOOR);
                        content.add(JOSHUA_TRAPDOOR);
                        content.add(JOSHUA_PRESSURE_PLATE);
                        content.add(JOSHUA_BUTTON);
                        content.add(BlockItems.JOSHUA_SIGN);
                        content.add(BlockItems.JOSHUA_HANGING_SIGN);

                        //JUNIPER
                        content.add(JUNIPER_LOG);
                        content.add(JUNIPER_WOOD);
                        content.add(STRIPPED_JUNIPER_LOG);
                        content.add(STRIPPED_JUNIPER_WOOD);
                        content.add(JUNIPER_PLANKS);
                        content.add(JUNIPER_STAIRS);
                        content.add(JUNIPER_SLAB);
                        content.add(JUNIPER_FENCE);
                        content.add(JUNIPER_FENCE_GATE);
                        content.add(JUNIPER_DOOR);
                        content.add(JUNIPER_TRAPDOOR);
                        content.add(JUNIPER_PRESSURE_PLATE);
                        content.add(JUNIPER_BUTTON);
                        content.add(BlockItems.JUNIPER_SIGN);
                        content.add(BlockItems.JUNIPER_HANGING_SIGN);

                        //PALM
                        content.add(PALM_LOG);
                        content.add(PALM_WOOD);
                        content.add(STRIPPED_PALM_LOG);
                        content.add(STRIPPED_PALM_WOOD);
                        content.add(PALM_PLANKS);
                        content.add(PALM_STAIRS);
                        content.add(PALM_SLAB);
                        content.add(PALM_FENCE);
                        content.add(PALM_FENCE_GATE);
                        content.add(PALM_DOOR);
                        content.add(PALM_TRAPDOOR);
                        content.add(PALM_PRESSURE_PLATE);
                        content.add(PALM_BUTTON);
                        content.add(BlockItems.PALM_SIGN);
                        content.add(BlockItems.PALM_HANGING_SIGN);

                        //EBONY
                        content.add(EBONY_LOG);
                        content.add(EBONY_WOOD);
                        content.add(STRIPPED_EBONY_LOG);
                        content.add(STRIPPED_EBONY_WOOD);
                        content.add(EBONY_PLANKS);
                        content.add(EBONY_STAIRS);
                        content.add(EBONY_SLAB);
                        content.add(EBONY_FENCE);
                        content.add(EBONY_FENCE_GATE);
                        content.add(EBONY_DOOR);
                        content.add(EBONY_TRAPDOOR);
                        content.add(EBONY_PRESSURE_PLATE);
                        content.add(EBONY_BUTTON);
                        content.add(BlockItems.EBONY_SIGN);
                        content.add(BlockItems.EBONY_HANGING_SIGN);

                        //TEAK
                        content.add(TEAK_LOG);
                        content.add(TEAK_WOOD);
                        content.add(STRIPPED_TEAK_LOG);
                        content.add(STRIPPED_TEAK_WOOD);
                        content.add(TEAK_PLANKS);
                        content.add(TEAK_STAIRS);
                        content.add(TEAK_SLAB);
                        content.add(TEAK_FENCE);
                        content.add(TEAK_FENCE_GATE);
                        content.add(TEAK_DOOR);
                        content.add(TEAK_TRAPDOOR);
                        content.add(TEAK_PRESSURE_PLATE);
                        content.add(TEAK_BUTTON);
                        content.add(BlockItems.TEAK_SIGN);
                        content.add(BlockItems.TEAK_HANGING_SIGN);

                        //ELM
                        content.add(ELM_LOG);
                        content.add(ELM_WOOD);
                        content.add(STRIPPED_ELM_LOG);
                        content.add(STRIPPED_ELM_WOOD);
                        content.add(ELM_PLANKS);
                        content.add(ELM_STAIRS);
                        content.add(ELM_SLAB);
                        content.add(ELM_FENCE);
                        content.add(ELM_FENCE_GATE);
                        content.add(ELM_DOOR);
                        content.add(ELM_TRAPDOOR);
                        content.add(ELM_PRESSURE_PLATE);
                        content.add(ELM_BUTTON);
                        content.add(BlockItems.ELM_SIGN);
                        content.add(BlockItems.ELM_HANGING_SIGN);

                        //WILLOW
                        content.add(WILLOW_LOG);
                        content.add(WILLOW_WOOD);
                        content.add(STRIPPED_WILLOW_LOG);
                        content.add(STRIPPED_WILLOW_WOOD);
                        content.add(WILLOW_PLANKS);
                        content.add(WILLOW_STAIRS);
                        content.add(WILLOW_SLAB);
                        content.add(WILLOW_FENCE);
                        content.add(WILLOW_FENCE_GATE);
                        content.add(WILLOW_DOOR);
                        content.add(WILLOW_TRAPDOOR);
                        content.add(WILLOW_PRESSURE_PLATE);
                        content.add(WILLOW_BUTTON);
                        content.add(BlockItems.WILLOW_SIGN);
                        content.add(BlockItems.WILLOW_HANGING_SIGN);

                        //CYPRESS
                        content.add(CYPRESS_LOG);
                        content.add(CYPRESS_WOOD);
                        content.add(STRIPPED_CYPRESS_LOG);
                        content.add(STRIPPED_CYPRESS_WOOD);
                        content.add(CYPRESS_PLANKS);
                        content.add(CYPRESS_STAIRS);
                        content.add(CYPRESS_SLAB);
                        content.add(CYPRESS_FENCE);
                        content.add(CYPRESS_FENCE_GATE);
                        content.add(CYPRESS_DOOR);
                        content.add(CYPRESS_TRAPDOOR);
                        content.add(CYPRESS_PRESSURE_PLATE);
                        content.add(CYPRESS_BUTTON);
                        content.add(BlockItems.CYPRESS_SIGN);
                        content.add(BlockItems.CYPRESS_HANGING_SIGN);

                        //SAKURA
                        content.add(SAKURA_LOG);
                        content.add(SAKURA_WOOD);
                        content.add(STRIPPED_SAKURA_LOG);
                        content.add(STRIPPED_SAKURA_WOOD);
                        content.add(SAKURA_PLANKS);
                        content.add(SAKURA_STAIRS);
                        content.add(SAKURA_SLAB);
                        content.add(SAKURA_FENCE);
                        content.add(SAKURA_FENCE_GATE);
                        content.add(SAKURA_DOOR);
                        content.add(SAKURA_TRAPDOOR);
                        content.add(SAKURA_PRESSURE_PLATE);
                        content.add(SAKURA_BUTTON);
                        content.add(BlockItems.SAKURA_SIGN);
                        content.add(BlockItems.SAKURA_HANGING_SIGN);

                        //MAGNOLIA
                        content.add(MAGNOLIA_LOG);
                        content.add(MAGNOLIA_WOOD);
                        content.add(STRIPPED_MAGNOLIA_LOG);
                        content.add(STRIPPED_MAGNOLIA_WOOD);
                        content.add(MAGNOLIA_PLANKS);
                        content.add(MAGNOLIA_STAIRS);
                        content.add(MAGNOLIA_SLAB);
                        content.add(MAGNOLIA_FENCE);
                        content.add(MAGNOLIA_FENCE_GATE);
                        content.add(MAGNOLIA_DOOR);
                        content.add(MAGNOLIA_TRAPDOOR);
                        content.add(MAGNOLIA_PRESSURE_PLATE);
                        content.add(MAGNOLIA_BUTTON);
                        content.add(BlockItems.MAGNOLIA_SIGN);
                        content.add(BlockItems.MAGNOLIA_HANGING_SIGN);

                        //JACARANDA
                        content.add(JACARANDA_LOG);
                        content.add(JACARANDA_WOOD);
                        content.add(STRIPPED_JACARANDA_LOG);
                        content.add(STRIPPED_JACARANDA_WOOD);
                        content.add(JACARANDA_PLANKS);
                        content.add(JACARANDA_STAIRS);
                        content.add(JACARANDA_SLAB);
                        content.add(JACARANDA_FENCE);
                        content.add(JACARANDA_FENCE_GATE);
                        content.add(JACARANDA_DOOR);
                        content.add(JACARANDA_TRAPDOOR);
                        content.add(JACARANDA_PRESSURE_PLATE);
                        content.add(JACARANDA_BUTTON);
                        content.add(BlockItems.JACARANDA_SIGN);
                        content.add(BlockItems.JACARANDA_HANGING_SIGN);



                        //STONE
                        content.add(STONE_WALL);
                        content.add(SMOOTH_STONE_STAIRS);
                        content.add(SMOOTH_STONE_WALL);
                        content.add(STONE_BRICK_PILLAR);

                        //GRANITE
                        content.add(POLISHED_GRANITE_WALL);
                        content.add(GRANITE_BRICKS);
                        content.add(GRANITE_BRICK_STAIRS);
                        content.add(GRANITE_BRICK_SLAB);
                        content.add(GRANITE_BRICK_WALL);
                        content.add(MOSSY_GRANITE_BRICKS);
                        content.add(MOSSY_GRANITE_BRICK_STAIRS);
                        content.add(MOSSY_GRANITE_BRICK_SLAB);
                        content.add(MOSSY_GRANITE_BRICK_WALL);
                        content.add(GRANITE_BRICK_PILLAR);
                        content.add(CHISELED_GRANITE_BRICKS);
                        content.add(POLISHED_GRANITE_PRESSURE_PLATE);
                        content.add(POLISHED_GRANITE_BUTTON);

                        //DIORITE
                        content.add(POLISHED_DIORITE_WALL);
                        content.add(DIORITE_BRICKS);
                        content.add(DIORITE_BRICK_STAIRS);
                        content.add(DIORITE_BRICK_SLAB);
                        content.add(DIORITE_BRICK_WALL);
                        content.add(MOSSY_DIORITE_BRICKS);
                        content.add(MOSSY_DIORITE_BRICK_STAIRS);
                        content.add(MOSSY_DIORITE_BRICK_SLAB);
                        content.add(MOSSY_DIORITE_BRICK_WALL);
                        content.add(DIORITE_BRICK_PILLAR);
                        content.add(CHISELED_DIORITE_BRICKS);
                        content.add(POLISHED_DIORITE_PRESSURE_PLATE);
                        content.add(POLISHED_DIORITE_BUTTON);

                        //ANDESITE
                        content.add(POLISHED_ANDESITE_WALL);
                        content.add(ANDESITE_BRICKS);
                        content.add(ANDESITE_BRICK_STAIRS);
                        content.add(ANDESITE_BRICK_SLAB);
                        content.add(ANDESITE_BRICK_WALL);
                        content.add(MOSSY_ANDESITE_BRICKS);
                        content.add(MOSSY_ANDESITE_BRICK_STAIRS);
                        content.add(MOSSY_ANDESITE_BRICK_SLAB);
                        content.add(MOSSY_ANDESITE_BRICK_WALL);
                        content.add(ANDESITE_BRICK_PILLAR);
                        content.add(CHISELED_ANDESITE_BRICKS);
                        content.add(POLISHED_ANDESITE_PRESSURE_PLATE);
                        content.add(POLISHED_ANDESITE_BUTTON);

                        //GNEISS
                        content.add(GNEISS);
                        content.add(GNEISS_STAIRS);
                        content.add(GNEISS_SLAB);
                        content.add(GNEISS_WALL);
                        content.add(POLISHED_GNEISS);
                        content.add(POLISHED_GNEISS_STAIRS);
                        content.add(POLISHED_GNEISS_SLAB);
                        content.add(POLISHED_GNEISS_WALL);
                        content.add(GNEISS_BRICKS);
                        content.add(GNEISS_BRICK_STAIRS);
                        content.add(GNEISS_BRICK_SLAB);
                        content.add(GNEISS_BRICK_WALL);
                        content.add(MOSSY_GNEISS_BRICKS);
                        content.add(MOSSY_GNEISS_BRICK_STAIRS);
                        content.add(MOSSY_GNEISS_BRICK_SLAB);
                        content.add(MOSSY_GNEISS_BRICK_WALL);
                        content.add(GNEISS_BRICK_PILLAR);
                        content.add(CHISELED_GNEISS_BRICKS);
                        content.add(POLISHED_GNEISS_PRESSURE_PLATE);
                        content.add(POLISHED_GNEISS_BUTTON);

                        //SHALE
                        content.add(SHALE);
                        content.add(SHALE_STAIRS);
                        content.add(SHALE_SLAB);
                        content.add(SHALE_WALL);
                        content.add(POLISHED_SHALE);
                        content.add(POLISHED_SHALE_STAIRS);
                        content.add(POLISHED_SHALE_SLAB);
                        content.add(POLISHED_SHALE_WALL);
                        content.add(SHALE_BRICKS);
                        content.add(SHALE_BRICK_STAIRS);
                        content.add(SHALE_BRICK_SLAB);
                        content.add(SHALE_BRICK_WALL);
                        content.add(MOSSY_SHALE_BRICKS);
                        content.add(MOSSY_SHALE_BRICK_STAIRS);
                        content.add(MOSSY_SHALE_BRICK_SLAB);
                        content.add(MOSSY_SHALE_BRICK_WALL);
                        content.add(SHALE_BRICK_PILLAR);
                        content.add(CHISELED_SHALE_BRICKS);
                        content.add(POLISHED_SHALE_PRESSURE_PLATE);
                        content.add(POLISHED_SHALE_BUTTON);

                        //LIMESTONE
                        content.add(LIMESTONE);
                        content.add(LIMESTONE_STAIRS);
                        content.add(LIMESTONE_SLAB);
                        content.add(LIMESTONE_WALL);
                        content.add(POLISHED_LIMESTONE);
                        content.add(POLISHED_LIMESTONE_STAIRS);
                        content.add(POLISHED_LIMESTONE_SLAB);
                        content.add(POLISHED_LIMESTONE_WALL);
                        content.add(LIMESTONE_BRICKS);
                        content.add(LIMESTONE_BRICK_STAIRS);
                        content.add(LIMESTONE_BRICK_SLAB);
                        content.add(LIMESTONE_BRICK_WALL);
                        content.add(MOSSY_LIMESTONE_BRICKS);
                        content.add(MOSSY_LIMESTONE_BRICK_STAIRS);
                        content.add(MOSSY_LIMESTONE_BRICK_SLAB);
                        content.add(MOSSY_LIMESTONE_BRICK_WALL);
                        content.add(LIMESTONE_BRICK_PILLAR);
                        content.add(CHISELED_LIMESTONE_BRICKS);
                        content.add(POLISHED_LIMESTONE_PRESSURE_PLATE);
                        content.add(POLISHED_LIMESTONE_BUTTON);

                        //MARBLE
                        content.add(MARBLE);
                        content.add(MARBLE_STAIRS);
                        content.add(MARBLE_SLAB);
                        content.add(MARBLE_WALL);
                        content.add(POLISHED_MARBLE);
                        content.add(POLISHED_MARBLE_STAIRS);
                        content.add(POLISHED_MARBLE_SLAB);
                        content.add(POLISHED_MARBLE_WALL);
                        content.add(MARBLE_BRICKS);
                        content.add(MARBLE_BRICK_STAIRS);
                        content.add(MARBLE_BRICK_SLAB);
                        content.add(MARBLE_BRICK_WALL);
                        content.add(MOSSY_MARBLE_BRICKS);
                        content.add(MOSSY_MARBLE_BRICK_STAIRS);
                        content.add(MOSSY_MARBLE_BRICK_SLAB);
                        content.add(MOSSY_MARBLE_BRICK_WALL);
                        content.add(MARBLE_BRICK_PILLAR);
                        content.add(CHISELED_MARBLE_BRICKS);
                        content.add(POLISHED_MARBLE_PRESSURE_PLATE);
                        content.add(POLISHED_MARBLE_BUTTON);

                        //GABBRO
                        content.add(GABBRO);
                        content.add(GABBRO_STAIRS);
                        content.add(GABBRO_SLAB);
                        content.add(GABBRO_WALL);
                        content.add(POLISHED_GABBRO);
                        content.add(POLISHED_GABBRO_STAIRS);
                        content.add(POLISHED_GABBRO_SLAB);
                        content.add(POLISHED_GABBRO_WALL);
                        content.add(GABBRO_BRICKS);
                        content.add(GABBRO_BRICK_STAIRS);
                        content.add(GABBRO_BRICK_SLAB);
                        content.add(GABBRO_BRICK_WALL);
                        content.add(MOSSY_GABBRO_BRICKS);
                        content.add(MOSSY_GABBRO_BRICK_STAIRS);
                        content.add(MOSSY_GABBRO_BRICK_SLAB);
                        content.add(MOSSY_GABBRO_BRICK_WALL);
                        content.add(GABBRO_BRICK_PILLAR);
                        content.add(CHISELED_GABBRO_BRICKS);
                        content.add(POLISHED_GABBRO_PRESSURE_PLATE);
                        content.add(POLISHED_GABBRO_BUTTON);

                        //PHYLLITE
                        content.add(PHYLLITE);
                        content.add(PHYLLITE_STAIRS);
                        content.add(PHYLLITE_SLAB);
                        content.add(PHYLLITE_WALL);
                        content.add(POLISHED_PHYLLITE);
                        content.add(POLISHED_PHYLLITE_STAIRS);
                        content.add(POLISHED_PHYLLITE_SLAB);
                        content.add(POLISHED_PHYLLITE_WALL);
                        content.add(PHYLLITE_BRICKS);
                        content.add(PHYLLITE_BRICK_STAIRS);
                        content.add(PHYLLITE_BRICK_SLAB);
                        content.add(PHYLLITE_BRICK_WALL);
                        content.add(MOSSY_PHYLLITE_BRICKS);
                        content.add(MOSSY_PHYLLITE_BRICK_STAIRS);
                        content.add(MOSSY_PHYLLITE_BRICK_SLAB);
                        content.add(MOSSY_PHYLLITE_BRICK_WALL);
                        content.add(PHYLLITE_BRICK_PILLAR);
                        content.add(CHISELED_PHYLLITE_BRICKS);
                        content.add(POLISHED_PHYLLITE_PRESSURE_PLATE);
                        content.add(POLISHED_PHYLLITE_BUTTON);

                        //TUFF
                        content.add(CRACKED_TUFF_BRICKS);

                        //CALCITE
                        content.add(CALCITE_STAIRS);
                        content.add(CALCITE_SLAB);
                        content.add(CALCITE_WALL);
                        content.add(POLISHED_CALCITE);
                        content.add(POLISHED_CALCITE_STAIRS);
                        content.add(POLISHED_CALCITE_SLAB);
                        content.add(POLISHED_CALCITE_WALL);
                        content.add(CALCITE_BRICKS);
                        content.add(CALCITE_BRICK_STAIRS);
                        content.add(CALCITE_BRICK_SLAB);
                        content.add(CALCITE_BRICK_WALL);
                        content.add(CHISELED_CALCITE);

                        //DRIPSTONE
                        content.add(DRIPSTONE_STAIRS);
                        content.add(DRIPSTONE_SLAB);
                        content.add(DRIPSTONE_WALL);
                        content.add(POLISHED_DRIPSTONE);
                        content.add(POLISHED_DRIPSTONE_STAIRS);
                        content.add(POLISHED_DRIPSTONE_SLAB);
                        content.add(POLISHED_DRIPSTONE_WALL);
                        content.add(DRIPSTONE_BRICKS);
                        content.add(DRIPSTONE_BRICK_STAIRS);
                        content.add(DRIPSTONE_BRICK_SLAB);
                        content.add(DRIPSTONE_BRICK_WALL);
                        content.add(CHISELED_DRIPSTONE);

                        //SANDSTONE
                        content.add(CUT_SANDSTONE_STAIRS);
                        content.add(CUT_SANDSTONE_WALL);
                        content.add(SMOOTH_SANDSTONE_WALL);
                        content.add(ROUGH_SANDSTONE);
                        content.add(ROUGH_SANDSTONE_STAIRS);
                        content.add(ROUGH_SANDSTONE_SLAB);
                        content.add(ROUGH_SANDSTONE_WALL);

                        content.add(CUT_RED_SANDSTONE_STAIRS);
                        content.add(CUT_RED_SANDSTONE_WALL);
                        content.add(SMOOTH_RED_SANDSTONE_WALL);
                        content.add(ROUGH_RED_SANDSTONE);
                        content.add(ROUGH_RED_SANDSTONE_STAIRS);
                        content.add(ROUGH_RED_SANDSTONE_SLAB);
                        content.add(ROUGH_RED_SANDSTONE_WALL);

                        content.add(FROSTED_SANDSTONE);
                        content.add(FROSTED_SANDSTONE_STAIRS);
                        content.add(FROSTED_SANDSTONE_SLAB);
                        content.add(FROSTED_SANDSTONE_WALL);
                        content.add(CHISELED_FROSTED_SANDSTONE);
                        content.add(CUT_FROSTED_SANDSTONE);
                        content.add(CUT_FROSTED_SANDSTONE_STAIRS);
                        content.add(CUT_FROSTED_SANDSTONE_SLAB);
                        content.add(CUT_FROSTED_SANDSTONE_WALL);
                        content.add(SMOOTH_FROSTED_SANDSTONE);
                        content.add(SMOOTH_FROSTED_SANDSTONE_STAIRS);
                        content.add(SMOOTH_FROSTED_SANDSTONE_SLAB);
                        content.add(SMOOTH_FROSTED_SANDSTONE_WALL);
                        content.add(ROUGH_FROSTED_SANDSTONE);
                        content.add(ROUGH_FROSTED_SANDSTONE_STAIRS);
                        content.add(ROUGH_FROSTED_SANDSTONE_SLAB);
                        content.add(ROUGH_FROSTED_SANDSTONE_WALL);

                        content.add(CHARRED_SANDSTONE);
                        content.add(CHARRED_SANDSTONE_STAIRS);
                        content.add(CHARRED_SANDSTONE_SLAB);
                        content.add(CHARRED_SANDSTONE_WALL);
                        content.add(CHISELED_CHARRED_SANDSTONE);
                        content.add(CUT_CHARRED_SANDSTONE);
                        content.add(CUT_CHARRED_SANDSTONE_STAIRS);
                        content.add(CUT_CHARRED_SANDSTONE_SLAB);
                        content.add(CUT_CHARRED_SANDSTONE_WALL);
                        content.add(SMOOTH_CHARRED_SANDSTONE);
                        content.add(SMOOTH_CHARRED_SANDSTONE_STAIRS);
                        content.add(SMOOTH_CHARRED_SANDSTONE_SLAB);
                        content.add(SMOOTH_CHARRED_SANDSTONE_WALL);
                        content.add(ROUGH_CHARRED_SANDSTONE);
                        content.add(ROUGH_CHARRED_SANDSTONE_STAIRS);
                        content.add(ROUGH_CHARRED_SANDSTONE_SLAB);
                        content.add(ROUGH_CHARRED_SANDSTONE_WALL);

                        //PRISMARINE
                        content.add(PRISMARINE_BRICK_WALL);
                        content.add(CHISELED_PRISMARINE_BRICKS);
                        content.add(DARK_PRISMARINE_WALL);

                        //NETHER_BRICK
                        content.add(RED_NETHER_BRICK_FENCE);
                        content.add(CHISELED_RED_NETHER_BRICKS);
                        content.add(BLUE_NETHER_BRICKS);
                        content.add(BLUE_NETHER_BRICK_STAIRS);
                        content.add(BLUE_NETHER_BRICK_SLAB);
                        content.add(BLUE_NETHER_BRICK_WALL);
                        content.add(BLUE_NETHER_BRICK_FENCE);
                        content.add(CHISELED_BLUE_NETHER_BRICKS);

                        //QUARTZ
                        content.add(QUARTZ_WALL);
                        content.add(SMOOTH_QUARTZ_WALL);
                        content.add(QUARTZ_BRICK_STAIRS);
                        content.add(QUARTZ_BRICK_SLAB);
                        content.add(QUARTZ_BRICK_WALL);

                        //AMETHYST
                        content.add(AMETHYST_STAIRS);
                        content.add(AMETHYST_SLAB);
                        content.add(AMETHYST_WALL);
                        content.add(AMETHYST_BRICKS);
                        content.add(AMETHYST_BRICK_STAIRS);
                        content.add(AMETHYST_BRICK_SLAB);
                        content.add(AMETHYST_BRICK_WALL);
                        content.add(AMETHYST_TILES);
                        content.add(AMETHYST_TILE_STAIRS);
                        content.add(AMETHYST_TILE_SLAB);
                        content.add(AMETHYST_TILE_WALL);
                        content.add(CHISELED_AMETHYST);

                        //DOLOMITE
                        content.add(DOLOMITE);
                        content.add(DOLOMITE_STAIRS);
                        content.add(DOLOMITE_SLAB);
                        content.add(DOLOMITE_WALL);
                        content.add(DOLOMITE_BRICKS);
                        content.add(DOLOMITE_BRICK_STAIRS);
                        content.add(DOLOMITE_BRICK_SLAB);
                        content.add(DOLOMITE_BRICK_WALL);
                        content.add(DOLOMITE_TILES);
                        content.add(DOLOMITE_TILE_STAIRS);
                        content.add(DOLOMITE_TILE_SLAB);
                        content.add(DOLOMITE_TILE_WALL);
                        content.add(CHISELED_DOLOMITE);

                        //GYPSUM
                        content.add(GYPSUM);
                        content.add(GYPSUM_STAIRS);
                        content.add(GYPSUM_SLAB);
                        content.add(GYPSUM_WALL);
                        content.add(GYPSUM_BRICKS);
                        content.add(GYPSUM_BRICK_STAIRS);
                        content.add(GYPSUM_BRICK_SLAB);
                        content.add(GYPSUM_BRICK_WALL);
                        content.add(GYPSUM_TILES);
                        content.add(GYPSUM_TILE_STAIRS);
                        content.add(GYPSUM_TILE_SLAB);
                        content.add(GYPSUM_TILE_WALL);
                        content.add(CHISELED_GYPSUM);


                        //COLORED BLOCKS
                        content.add(TERRACOTTA_STAIRS);
                        content.add(TERRACOTTA_SLAB);
                        content.add(TERRACOTTA_WALL);
                        content.add(TERRACOTTA_BRICKS);
                        content.add(TERRACOTTA_BRICK_STAIRS);
                        content.add(TERRACOTTA_BRICK_SLAB);
                        content.add(TERRACOTTA_BRICK_WALL);
                        content.add(WHITE_TERRACOTTA_STAIRS);
                        content.add(WHITE_TERRACOTTA_SLAB);
                        content.add(WHITE_TERRACOTTA_WALL);
                        content.add(WHITE_TERRACOTTA_BRICKS);
                        content.add(WHITE_TERRACOTTA_BRICK_STAIRS);
                        content.add(WHITE_TERRACOTTA_BRICK_SLAB);
                        content.add(WHITE_TERRACOTTA_BRICK_WALL);

                        content.add(LIGHT_GRAY_TERRACOTTA_STAIRS);
                        content.add(LIGHT_GRAY_TERRACOTTA_SLAB);
                        content.add(LIGHT_GRAY_TERRACOTTA_WALL);
                        content.add(LIGHT_GRAY_TERRACOTTA_BRICKS);
                        content.add(LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
                        content.add(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
                        content.add(LIGHT_GRAY_TERRACOTTA_BRICK_WALL);

                        content.add(GRAY_TERRACOTTA_STAIRS);
                        content.add(GRAY_TERRACOTTA_SLAB);
                        content.add(GRAY_TERRACOTTA_WALL);
                        content.add(GRAY_TERRACOTTA_BRICKS);
                        content.add(GRAY_TERRACOTTA_BRICK_STAIRS);
                        content.add(GRAY_TERRACOTTA_BRICK_SLAB);
                        content.add(GRAY_TERRACOTTA_BRICK_WALL);

                        content.add(BLACK_TERRACOTTA_STAIRS);
                        content.add(BLACK_TERRACOTTA_SLAB);
                        content.add(BLACK_TERRACOTTA_WALL);
                        content.add(BLACK_TERRACOTTA_BRICKS);
                        content.add(BLACK_TERRACOTTA_BRICK_STAIRS);
                        content.add(BLACK_TERRACOTTA_BRICK_SLAB);
                        content.add(BLACK_TERRACOTTA_BRICK_WALL);

                        content.add(BROWN_TERRACOTTA_STAIRS);
                        content.add(BROWN_TERRACOTTA_SLAB);
                        content.add(BROWN_TERRACOTTA_WALL);
                        content.add(BROWN_TERRACOTTA_BRICKS);
                        content.add(BROWN_TERRACOTTA_BRICK_STAIRS);
                        content.add(BROWN_TERRACOTTA_BRICK_SLAB);
                        content.add(BROWN_TERRACOTTA_BRICK_WALL);

                        content.add(RED_TERRACOTTA_STAIRS);
                        content.add(RED_TERRACOTTA_SLAB);
                        content.add(RED_TERRACOTTA_WALL);
                        content.add(RED_TERRACOTTA_BRICKS);
                        content.add(RED_TERRACOTTA_BRICK_STAIRS);
                        content.add(RED_TERRACOTTA_BRICK_SLAB);
                        content.add(RED_TERRACOTTA_BRICK_WALL);

                        content.add(ORANGE_TERRACOTTA_STAIRS);
                        content.add(ORANGE_TERRACOTTA_SLAB);
                        content.add(ORANGE_TERRACOTTA_WALL);
                        content.add(ORANGE_TERRACOTTA_BRICKS);
                        content.add(ORANGE_TERRACOTTA_BRICK_STAIRS);
                        content.add(ORANGE_TERRACOTTA_BRICK_SLAB);
                        content.add(ORANGE_TERRACOTTA_BRICK_WALL);

                        content.add(YELLOW_TERRACOTTA_STAIRS);
                        content.add(YELLOW_TERRACOTTA_SLAB);
                        content.add(YELLOW_TERRACOTTA_WALL);
                        content.add(YELLOW_TERRACOTTA_BRICKS);
                        content.add(YELLOW_TERRACOTTA_BRICK_STAIRS);
                        content.add(YELLOW_TERRACOTTA_BRICK_SLAB);
                        content.add(YELLOW_TERRACOTTA_BRICK_WALL);

                        content.add(LIME_TERRACOTTA_STAIRS);
                        content.add(LIME_TERRACOTTA_SLAB);
                        content.add(LIME_TERRACOTTA_WALL);
                        content.add(LIME_TERRACOTTA_BRICKS);
                        content.add(LIME_TERRACOTTA_BRICK_STAIRS);
                        content.add(LIME_TERRACOTTA_BRICK_SLAB);
                        content.add(LIME_TERRACOTTA_BRICK_WALL);

                        content.add(GREEN_TERRACOTTA_STAIRS);
                        content.add(GREEN_TERRACOTTA_SLAB);
                        content.add(GREEN_TERRACOTTA_WALL);
                        content.add(GREEN_TERRACOTTA_BRICKS);
                        content.add(GREEN_TERRACOTTA_BRICK_STAIRS);
                        content.add(GREEN_TERRACOTTA_BRICK_SLAB);
                        content.add(GREEN_TERRACOTTA_BRICK_WALL);

                        content.add(CYAN_TERRACOTTA_STAIRS);
                        content.add(CYAN_TERRACOTTA_SLAB);
                        content.add(CYAN_TERRACOTTA_WALL);
                        content.add(CYAN_TERRACOTTA_BRICKS);
                        content.add(CYAN_TERRACOTTA_BRICK_STAIRS);
                        content.add(CYAN_TERRACOTTA_BRICK_SLAB);
                        content.add(CYAN_TERRACOTTA_BRICK_WALL);

                        content.add(LIGHT_BLUE_TERRACOTTA_STAIRS);
                        content.add(LIGHT_BLUE_TERRACOTTA_SLAB);
                        content.add(LIGHT_BLUE_TERRACOTTA_WALL);
                        content.add(LIGHT_BLUE_TERRACOTTA_BRICKS);
                        content.add(LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
                        content.add(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
                        content.add(LIGHT_BLUE_TERRACOTTA_BRICK_WALL);

                        content.add(BLUE_TERRACOTTA_STAIRS);
                        content.add(BLUE_TERRACOTTA_SLAB);
                        content.add(BLUE_TERRACOTTA_WALL);
                        content.add(BLUE_TERRACOTTA_BRICKS);
                        content.add(BLUE_TERRACOTTA_BRICK_STAIRS);
                        content.add(BLUE_TERRACOTTA_BRICK_SLAB);
                        content.add(BLUE_TERRACOTTA_BRICK_WALL);

                        content.add(PURPLE_TERRACOTTA_STAIRS);
                        content.add(PURPLE_TERRACOTTA_SLAB);
                        content.add(PURPLE_TERRACOTTA_WALL);
                        content.add(PURPLE_TERRACOTTA_BRICKS);
                        content.add(PURPLE_TERRACOTTA_BRICK_STAIRS);
                        content.add(PURPLE_TERRACOTTA_BRICK_SLAB);
                        content.add(PURPLE_TERRACOTTA_BRICK_WALL);

                        content.add(MAGENTA_TERRACOTTA_STAIRS);
                        content.add(MAGENTA_TERRACOTTA_SLAB);
                        content.add(MAGENTA_TERRACOTTA_WALL);
                        content.add(MAGENTA_TERRACOTTA_BRICKS);
                        content.add(MAGENTA_TERRACOTTA_BRICK_STAIRS);
                        content.add(MAGENTA_TERRACOTTA_BRICK_SLAB);
                        content.add(MAGENTA_TERRACOTTA_BRICK_WALL);

                        content.add(PINK_TERRACOTTA_STAIRS);
                        content.add(PINK_TERRACOTTA_SLAB);
                        content.add(PINK_TERRACOTTA_WALL);
                        content.add(PINK_TERRACOTTA_BRICKS);
                        content.add(PINK_TERRACOTTA_BRICK_STAIRS);
                        content.add(PINK_TERRACOTTA_BRICK_SLAB);
                        content.add(PINK_TERRACOTTA_BRICK_WALL);

                        content.add(WHITE_CONCRETE_STAIRS);
                        content.add(WHITE_CONCRETE_SLAB);
                        content.add(WHITE_CONCRETE_WALL);

                        content.add(LIGHT_GRAY_CONCRETE_STAIRS);
                        content.add(LIGHT_GRAY_CONCRETE_SLAB);
                        content.add(LIGHT_GRAY_CONCRETE_WALL);

                        content.add(GRAY_CONCRETE_STAIRS);
                        content.add(GRAY_CONCRETE_SLAB);
                        content.add(GRAY_CONCRETE_WALL);

                        content.add(BLACK_CONCRETE_STAIRS);
                        content.add(BLACK_CONCRETE_SLAB);
                        content.add(BLACK_CONCRETE_WALL);

                        content.add(BROWN_CONCRETE_STAIRS);
                        content.add(BROWN_CONCRETE_SLAB);
                        content.add(BROWN_CONCRETE_WALL);

                        content.add(RED_CONCRETE_STAIRS);
                        content.add(RED_CONCRETE_SLAB);
                        content.add(RED_CONCRETE_WALL);

                        content.add(ORANGE_CONCRETE_STAIRS);
                        content.add(ORANGE_CONCRETE_SLAB);
                        content.add(ORANGE_CONCRETE_WALL);

                        content.add(YELLOW_CONCRETE_STAIRS);
                        content.add(YELLOW_CONCRETE_SLAB);
                        content.add(YELLOW_CONCRETE_WALL);

                        content.add(LIME_CONCRETE_STAIRS);
                        content.add(LIME_CONCRETE_SLAB);
                        content.add(LIME_CONCRETE_WALL);

                        content.add(GREEN_CONCRETE_STAIRS);
                        content.add(GREEN_CONCRETE_SLAB);
                        content.add(GREEN_CONCRETE_WALL);

                        content.add(CYAN_CONCRETE_STAIRS);
                        content.add(CYAN_CONCRETE_SLAB);
                        content.add(CYAN_CONCRETE_WALL);

                        content.add(LIGHT_BLUE_CONCRETE_STAIRS);
                        content.add(LIGHT_BLUE_CONCRETE_SLAB);
                        content.add(LIGHT_BLUE_CONCRETE_WALL);

                        content.add(BLUE_CONCRETE_STAIRS);
                        content.add(BLUE_CONCRETE_SLAB);
                        content.add(BLUE_CONCRETE_WALL);

                        content.add(PURPLE_CONCRETE_STAIRS);
                        content.add(PURPLE_CONCRETE_SLAB);
                        content.add(PURPLE_CONCRETE_WALL);

                        content.add(MAGENTA_CONCRETE_STAIRS);
                        content.add(MAGENTA_CONCRETE_SLAB);
                        content.add(MAGENTA_CONCRETE_WALL);

                        content.add(PINK_CONCRETE_STAIRS);
                        content.add(PINK_CONCRETE_SLAB);
                        content.add(PINK_CONCRETE_WALL);

                        content.add(CHALK);
                        content.add(CHALK_STAIRS);
                        content.add(CHALK_SLAB);
                        content.add(CHALK_WALL);
                        content.add(CHALK_BRICKS);
                        content.add(CHALK_BRICK_STAIRS);
                        content.add(CHALK_BRICK_SLAB);
                        content.add(CHALK_BRICK_WALL);

                        content.add(WHITE_CHALK);
                        content.add(WHITE_CHALK_STAIRS);
                        content.add(WHITE_CHALK_SLAB);
                        content.add(WHITE_CHALK_WALL);
                        content.add(WHITE_CHALK_BRICKS);
                        content.add(WHITE_CHALK_BRICK_STAIRS);
                        content.add(WHITE_CHALK_BRICK_SLAB);
                        content.add(WHITE_CHALK_BRICK_WALL);

                        content.add(LIGHT_GRAY_CHALK);
                        content.add(LIGHT_GRAY_CHALK_STAIRS);
                        content.add(LIGHT_GRAY_CHALK_SLAB);
                        content.add(LIGHT_GRAY_CHALK_WALL);
                        content.add(LIGHT_GRAY_CHALK_BRICKS);
                        content.add(LIGHT_GRAY_CHALK_BRICK_STAIRS);
                        content.add(LIGHT_GRAY_CHALK_BRICK_SLAB);
                        content.add(LIGHT_GRAY_CHALK_BRICK_WALL);

                        content.add(GRAY_CHALK);
                        content.add(GRAY_CHALK_STAIRS);
                        content.add(GRAY_CHALK_SLAB);
                        content.add(GRAY_CHALK_WALL);
                        content.add(GRAY_CHALK_BRICKS);
                        content.add(GRAY_CHALK_BRICK_STAIRS);
                        content.add(GRAY_CHALK_BRICK_SLAB);
                        content.add(GRAY_CHALK_BRICK_WALL);

                        content.add(BLACK_CHALK);
                        content.add(BLACK_CHALK_STAIRS);
                        content.add(BLACK_CHALK_SLAB);
                        content.add(BLACK_CHALK_WALL);
                        content.add(BLACK_CHALK_BRICKS);
                        content.add(BLACK_CHALK_BRICK_STAIRS);
                        content.add(BLACK_CHALK_BRICK_SLAB);
                        content.add(BLACK_CHALK_BRICK_WALL);

                        content.add(BROWN_CHALK);
                        content.add(BROWN_CHALK_STAIRS);
                        content.add(BROWN_CHALK_SLAB);
                        content.add(BROWN_CHALK_WALL);
                        content.add(BROWN_CHALK_BRICKS);
                        content.add(BROWN_CHALK_BRICK_STAIRS);
                        content.add(BROWN_CHALK_BRICK_SLAB);
                        content.add(BROWN_CHALK_BRICK_WALL);

                        content.add(RED_CHALK);
                        content.add(RED_CHALK_STAIRS);
                        content.add(RED_CHALK_SLAB);
                        content.add(RED_CHALK_WALL);
                        content.add(RED_CHALK_BRICKS);
                        content.add(RED_CHALK_BRICK_STAIRS);
                        content.add(RED_CHALK_BRICK_SLAB);
                        content.add(RED_CHALK_BRICK_WALL);

                        content.add(ORANGE_CHALK);
                        content.add(ORANGE_CHALK_STAIRS);
                        content.add(ORANGE_CHALK_SLAB);
                        content.add(ORANGE_CHALK_WALL);
                        content.add(ORANGE_CHALK_BRICKS);
                        content.add(ORANGE_CHALK_BRICK_STAIRS);
                        content.add(ORANGE_CHALK_BRICK_SLAB);
                        content.add(ORANGE_CHALK_BRICK_WALL);

                        content.add(YELLOW_CHALK);
                        content.add(YELLOW_CHALK_STAIRS);
                        content.add(YELLOW_CHALK_SLAB);
                        content.add(YELLOW_CHALK_WALL);
                        content.add(YELLOW_CHALK_BRICKS);
                        content.add(YELLOW_CHALK_BRICK_STAIRS);
                        content.add(YELLOW_CHALK_BRICK_SLAB);
                        content.add(YELLOW_CHALK_BRICK_WALL);

                        content.add(LIME_CHALK);
                        content.add(LIME_CHALK_STAIRS);
                        content.add(LIME_CHALK_SLAB);
                        content.add(LIME_CHALK_WALL);
                        content.add(LIME_CHALK_BRICKS);
                        content.add(LIME_CHALK_BRICK_STAIRS);
                        content.add(LIME_CHALK_BRICK_SLAB);
                        content.add(LIME_CHALK_BRICK_WALL);

                        content.add(GREEN_CHALK);
                        content.add(GREEN_CHALK_STAIRS);
                        content.add(GREEN_CHALK_SLAB);
                        content.add(GREEN_CHALK_WALL);
                        content.add(GREEN_CHALK_BRICKS);
                        content.add(GREEN_CHALK_BRICK_STAIRS);
                        content.add(GREEN_CHALK_BRICK_SLAB);
                        content.add(GREEN_CHALK_BRICK_WALL);

                        content.add(CYAN_CHALK);
                        content.add(CYAN_CHALK_STAIRS);
                        content.add(CYAN_CHALK_SLAB);
                        content.add(CYAN_CHALK_WALL);
                        content.add(CYAN_CHALK_BRICKS);
                        content.add(CYAN_CHALK_BRICK_STAIRS);
                        content.add(CYAN_CHALK_BRICK_SLAB);
                        content.add(CYAN_CHALK_BRICK_WALL);

                        content.add(LIGHT_BLUE_CHALK);
                        content.add(LIGHT_BLUE_CHALK_STAIRS);
                        content.add(LIGHT_BLUE_CHALK_SLAB);
                        content.add(LIGHT_BLUE_CHALK_WALL);
                        content.add(LIGHT_BLUE_CHALK_BRICKS);
                        content.add(LIGHT_BLUE_CHALK_BRICK_STAIRS);
                        content.add(LIGHT_BLUE_CHALK_BRICK_SLAB);
                        content.add(LIGHT_BLUE_CHALK_BRICK_WALL);

                        content.add(BLUE_CHALK);
                        content.add(BLUE_CHALK_STAIRS);
                        content.add(BLUE_CHALK_SLAB);
                        content.add(BLUE_CHALK_WALL);
                        content.add(BLUE_CHALK_BRICKS);
                        content.add(BLUE_CHALK_BRICK_STAIRS);
                        content.add(BLUE_CHALK_BRICK_SLAB);
                        content.add(BLUE_CHALK_BRICK_WALL);

                        content.add(PURPLE_CHALK);
                        content.add(PURPLE_CHALK_STAIRS);
                        content.add(PURPLE_CHALK_SLAB);
                        content.add(PURPLE_CHALK_WALL);
                        content.add(PURPLE_CHALK_BRICKS);
                        content.add(PURPLE_CHALK_BRICK_STAIRS);
                        content.add(PURPLE_CHALK_BRICK_SLAB);
                        content.add(PURPLE_CHALK_BRICK_WALL);

                        content.add(MAGENTA_CHALK);
                        content.add(MAGENTA_CHALK_STAIRS);
                        content.add(MAGENTA_CHALK_SLAB);
                        content.add(MAGENTA_CHALK_WALL);
                        content.add(MAGENTA_CHALK_BRICKS);
                        content.add(MAGENTA_CHALK_BRICK_STAIRS);
                        content.add(MAGENTA_CHALK_BRICK_SLAB);
                        content.add(MAGENTA_CHALK_BRICK_WALL);

                        content.add(PINK_CHALK);
                        content.add(PINK_CHALK_STAIRS);
                        content.add(PINK_CHALK_SLAB);
                        content.add(PINK_CHALK_WALL);
                        content.add(PINK_CHALK_BRICKS);
                        content.add(PINK_CHALK_BRICK_STAIRS);
                        content.add(PINK_CHALK_BRICK_SLAB);
                        content.add(PINK_CHALK_BRICK_WALL);

                        //NATURAL
                        content.add(FROSTED_SAND);
                        content.add(CHARRED_SAND);
                        content.add(PEAT_BLOCK);
                        content.add(PEAT);

                        content.add(MAPLE_LEAVES);
                        content.add(POPLAR_LEAVES);
                        content.add(BEECH_LEAVES);
                        content.add(HICKORY_LEAVES);
                        content.add(WALNUT_LEAVES);
                        content.add(CHESTNUT_LEAVES);
                        content.add(CEDAR_LEAVES);
                        content.add(REDWOOD_LEAVES);
                        content.add(FIR_LEAVES);
                        content.add(HEMLOCK_LEAVES);
                        content.add(HOLLY_LEAVES);
                        content.add(PINE_LEAVES);
                        content.add(LARCH_LEAVES);
                        content.add(ASPEN_LEAVES);
                        content.add(KAPOK_LEAVES);
                        content.add(MAHOGANY_LEAVES);
                        content.add(EUCALYPTUS_LEAVES);
                        content.add(BAOBAB_LEAVES);
                        content.add(PALO_VERDE_LEAVES);
                        content.add(JOSHUA_LEAVES);
                        content.add(JUNIPER_LEAVES);
                        content.add(PALM_LEAVES);
                        content.add(EBONY_LEAVES);
                        content.add(TEAK_LEAVES);
                        content.add(ELM_LEAVES);
                        content.add(WILLOW_LEAVES);
                        content.add(CYPRESS_LEAVES);
                        content.add(SAKURA_LEAVES);
                        content.add(MAGNOLIA_LEAVES);
                        content.add(FLOWERING_MAGNOLIA_LEAVES);
                        content.add(JACARANDA_LEAVES);

                        content.add(MAPLE_SAPLING);
                        content.add(POPLAR_SAPLING);
                        content.add(BEECH_SAPLING);
                        content.add(HICKORY_SAPLING);
                        content.add(WALNUT_SAPLING);
                        content.add(CHESTNUT_SAPLING);
                        content.add(CEDAR_SAPLING);
                        content.add(REDWOOD_SAPLING);
                        content.add(FIR_SAPLING);
                        content.add(HEMLOCK_SAPLING);
                        content.add(HOLLY_SAPLING);
                        content.add(PINE_SAPLING);
                        content.add(LARCH_SAPLING);
                        content.add(ASPEN_SAPLING);
                        content.add(KAPOK_SAPLING);
                        content.add(MAHOGANY_SAPLING);
                        content.add(EUCALYPTUS_SAPLING);
                        content.add(BAOBAB_SAPLING);
                        content.add(PALO_VERDE_SAPLING);
                        content.add(JOSHUA_SAPLING);
                        content.add(JUNIPER_SAPLING);
                        content.add(PALM_SAPLING);
                        content.add(EBONY_SAPLING);
                        content.add(TEAK_SAPLING);
                        content.add(ELM_SAPLING);
                        content.add(WILLOW_SAPLING);
                        content.add(CYPRESS_SAPLING);
                        content.add(SAKURA_SAPLING);
                        content.add(MAGNOLIA_SAPLING);
                        content.add(FLOWERING_MAGNOLIA_SAPLING);
                        content.add(JACARANDA_SAPLING);

                        content.add(SHORT_PRAIRIE_GRASS);
                        content.add(TALL_PRAIRIE_GRASS);
                        content.add(CATTAIL);
                        content.add(LAVENDER);
                        content.add(PURPLE_PETALS);

                        //ORES

                        //COAL
                        content.add(GRANITE_COAL_ORE);
                        content.add(DIORITE_COAL_ORE);
                        content.add(ANDESITE_COAL_ORE);
                        content.add(TUFF_COAL_ORE);
                        content.add(MARBLE_COAL_ORE);
                        content.add(GNEISS_COAL_ORE);
                        content.add(SHALE_COAL_ORE);
                        content.add(LIMESTONE_COAL_ORE);
                        content.add(GABBRO_COAL_ORE);
                        content.add(PHYLLITE_COAL_ORE);

                        //IRON
                        content.add(GRANITE_IRON_ORE);
                        content.add(DIORITE_IRON_ORE);
                        content.add(ANDESITE_IRON_ORE);
                        content.add(TUFF_IRON_ORE);
                        content.add(MARBLE_IRON_ORE);
                        content.add(GNEISS_IRON_ORE);
                        content.add(SHALE_IRON_ORE);
                        content.add(LIMESTONE_IRON_ORE);
                        content.add(GABBRO_IRON_ORE);
                        content.add(PHYLLITE_IRON_ORE);

                        //COPPER
                        content.add(GRANITE_COPPER_ORE);
                        content.add(DIORITE_COPPER_ORE);
                        content.add(ANDESITE_COPPER_ORE);
                        content.add(TUFF_COPPER_ORE);
                        content.add(MARBLE_COPPER_ORE);
                        content.add(GNEISS_COPPER_ORE);
                        content.add(SHALE_COPPER_ORE);
                        content.add(LIMESTONE_COPPER_ORE);
                        content.add(GABBRO_COPPER_ORE);
                        content.add(PHYLLITE_COPPER_ORE);

                        //GOLD
                        content.add(GRANITE_GOLD_ORE);
                        content.add(DIORITE_GOLD_ORE);
                        content.add(ANDESITE_GOLD_ORE);
                        content.add(TUFF_GOLD_ORE);
                        content.add(MARBLE_GOLD_ORE);
                        content.add(GNEISS_GOLD_ORE);
                        content.add(SHALE_GOLD_ORE);
                        content.add(LIMESTONE_GOLD_ORE);
                        content.add(GABBRO_GOLD_ORE);
                        content.add(PHYLLITE_GOLD_ORE);

                        //REDSTONE
                        content.add(GRANITE_REDSTONE_ORE);
                        content.add(DIORITE_REDSTONE_ORE);
                        content.add(ANDESITE_REDSTONE_ORE);
                        content.add(TUFF_REDSTONE_ORE);
                        content.add(MARBLE_REDSTONE_ORE);
                        content.add(GNEISS_REDSTONE_ORE);
                        content.add(SHALE_REDSTONE_ORE);
                        content.add(LIMESTONE_REDSTONE_ORE);
                        content.add(GABBRO_REDSTONE_ORE);
                        content.add(PHYLLITE_REDSTONE_ORE);

                        //EMERALD
                        content.add(GRANITE_EMERALD_ORE);
                        content.add(DIORITE_EMERALD_ORE);
                        content.add(ANDESITE_EMERALD_ORE);
                        content.add(TUFF_EMERALD_ORE);
                        content.add(MARBLE_EMERALD_ORE);
                        content.add(GNEISS_EMERALD_ORE);
                        content.add(SHALE_EMERALD_ORE);
                        content.add(LIMESTONE_EMERALD_ORE);
                        content.add(GABBRO_EMERALD_ORE);
                        content.add(PHYLLITE_EMERALD_ORE);

                        //LAPIS
                        content.add(GRANITE_LAPIS_ORE);
                        content.add(DIORITE_LAPIS_ORE);
                        content.add(ANDESITE_LAPIS_ORE);
                        content.add(TUFF_LAPIS_ORE);
                        content.add(MARBLE_LAPIS_ORE);
                        content.add(GNEISS_LAPIS_ORE);
                        content.add(SHALE_LAPIS_ORE);
                        content.add(LIMESTONE_LAPIS_ORE);
                        content.add(GABBRO_LAPIS_ORE);
                        content.add(PHYLLITE_LAPIS_ORE);

                        //DIAMOND
                        content.add(GRANITE_DIAMOND_ORE);
                        content.add(DIORITE_DIAMOND_ORE);
                        content.add(ANDESITE_DIAMOND_ORE);
                        content.add(TUFF_DIAMOND_ORE);
                        content.add(MARBLE_DIAMOND_ORE);
                        content.add(GNEISS_DIAMOND_ORE);
                        content.add(SHALE_DIAMOND_ORE);
                        content.add(LIMESTONE_DIAMOND_ORE);
                        content.add(GABBRO_DIAMOND_ORE);
                        content.add(PHYLLITE_DIAMOND_ORE);
                    }))
                    .build());

    public static final RegistryKey<ItemGroup> WITHERS_OVERHAUL_ITEMS_KEY = RegistryKey.of(
            RegistryKeys.ITEM_GROUP, Identifier.of(WithersOverhaul.MOD_ID, "withers_overhaul_items")
    );

    public static final ItemGroup WITHERS_OVERHAUL_ITEMS = Registry.register(Registries.ITEM_GROUP, WITHERS_OVERHAUL_ITEMS_KEY,
            FabricItemGroup.builder().icon(() -> new ItemStack(RUNE_AQUA_AFFINITY))
                    .displayName(Text.translatable("item_group.withers_overhaul.items"))
                    .entries(((displayContext, content) -> {

                        content.add(WARPED_WART);

                        content.add(APRICOT);
                        content.add(KIWI);
                        content.add(NECTARINE);
                        content.add(PEACH);
                        content.add(PEAR);
                        content.add(PLUM);
                        content.add(KUMQUAT);
                        content.add(OLIVE);
                        content.add(PERSIMMON);
                        content.add(POMEGRANATE);
                        content.add(CHERRY);
                        content.add(FIG);
                        content.add(GRAPEFRUIT);
                        content.add(GUAVA);
                        content.add(TANGERINE);
                        content.add(AVOCADO);
                        content.add(BANANA);
                        content.add(LEMON);
                        content.add(LIME);
                        content.add(MANGO);
                        content.add(ORANGE);
                        content.add(STARFRUIT);

                        content.add(RUNE_AQUA_AFFINITY);
                        content.add(RUNE_BANE_OF_ARTHROPODS);
                        content.add(RUNE_BLAST_PROTECTION);
                        content.add(RUNE_BREACH);
                        content.add(RUNE_CHANNELING);
                        content.add(RUNE_DENSITY);
                        content.add(RUNE_DEPTH_STRIDER);
                        content.add(RUNE_EFFICIENCY);
                        content.add(RUNE_FEATHER_FALLING);
                        content.add(RUNE_FIRE_ASPECT);
                        content.add(RUNE_FIRE_PROTECTION);
                        content.add(RUNE_FLAME);
                        content.add(RUNE_FORTUNE);
                        content.add(RUNE_FROST_WALKER);
                        content.add(RUNE_IMPALING);
                        content.add(RUNE_INFINITY);
                        content.add(RUNE_KNOCKBACK);
                        content.add(RUNE_LOOTING);
                        content.add(RUNE_LOYALTY);
                        content.add(RUNE_LUCK_OF_THE_SEA);
                        content.add(RUNE_LURE);
                        content.add(RUNE_MENDING);
                        content.add(RUNE_MULTISHOT);
                        content.add(RUNE_PIERCING);
                        content.add(RUNE_POWER);
                        content.add(RUNE_PROJECTILE_PROTECTION);
                        content.add(RUNE_PROTECTION);
                        content.add(RUNE_PUNCH);
                        content.add(RUNE_QUICK_CHARGE);
                        content.add(RUNE_RESPIRATION);
                        content.add(RUNE_RIPTIDE);
                        content.add(RUNE_SHARPNESS);
                        content.add(RUNE_SILK_TOUCH);
                        content.add(RUNE_SMITE);
                        content.add(RUNE_SOUL_SPEED);
                        content.add(RUNE_SWEEPING_EDGE);
                        content.add(RUNE_SWIFT_SNEAK);
                        content.add(RUNE_THORNS);
                        content.add(RUNE_UNBREAKING);
                        content.add(RUNE_WIND_BURST);
                    }))
                    .build());

    public static void registerItemGroups() {
        WithersOverhaul.LOGGER.info("Loading Item Groups for " + WithersOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {

            //WOOD

            //OAK
            content.addAfter(OAK_BUTTON, OAK_SIGN);
            content.addAfter(OAK_SIGN, OAK_HANGING_SIGN);

            //MAPLE
            content.addAfter(OAK_HANGING_SIGN, MAPLE_LOG);
            content.addAfter(MAPLE_LOG, MAPLE_WOOD);
            content.addAfter(MAPLE_WOOD, STRIPPED_MAPLE_LOG);
            content.addAfter(STRIPPED_MAPLE_LOG, STRIPPED_MAPLE_WOOD);
            content.addAfter(STRIPPED_MAPLE_WOOD, MAPLE_PLANKS);
            content.addAfter(MAPLE_PLANKS, MAPLE_STAIRS);
            content.addAfter(MAPLE_STAIRS, MAPLE_SLAB);
            content.addAfter(MAPLE_SLAB, MAPLE_FENCE);
            content.addAfter(MAPLE_FENCE, MAPLE_FENCE_GATE);
            content.addAfter(MAPLE_FENCE_GATE, MAPLE_DOOR);
            content.addAfter(MAPLE_DOOR, MAPLE_TRAPDOOR);
            content.addAfter(MAPLE_TRAPDOOR, MAPLE_PRESSURE_PLATE);
            content.addAfter(MAPLE_PRESSURE_PLATE, MAPLE_BUTTON);
            content.addAfter(MAPLE_BUTTON, BlockItems.MAPLE_SIGN);
            content.addAfter(BlockItems.MAPLE_SIGN, BlockItems.MAPLE_HANGING_SIGN);

            //POPLAR
            content.addAfter(BlockItems.MAPLE_HANGING_SIGN, POPLAR_LOG);
            content.addAfter(POPLAR_LOG, POPLAR_WOOD);
            content.addAfter(POPLAR_WOOD, STRIPPED_POPLAR_LOG);
            content.addAfter(STRIPPED_POPLAR_LOG, STRIPPED_POPLAR_WOOD);
            content.addAfter(STRIPPED_POPLAR_WOOD, POPLAR_PLANKS);
            content.addAfter(POPLAR_PLANKS, POPLAR_STAIRS);
            content.addAfter(POPLAR_STAIRS, POPLAR_SLAB);
            content.addAfter(POPLAR_SLAB, POPLAR_FENCE);
            content.addAfter(POPLAR_FENCE, POPLAR_FENCE_GATE);
            content.addAfter(POPLAR_FENCE_GATE, POPLAR_DOOR);
            content.addAfter(POPLAR_DOOR, POPLAR_TRAPDOOR);
            content.addAfter(POPLAR_TRAPDOOR, POPLAR_PRESSURE_PLATE);
            content.addAfter(POPLAR_PRESSURE_PLATE, POPLAR_BUTTON);
            content.addAfter(POPLAR_BUTTON, BlockItems.POPLAR_SIGN);
            content.addAfter(BlockItems.POPLAR_SIGN, BlockItems.POPLAR_HANGING_SIGN);

            //BEECH
            content.addAfter(BlockItems.POPLAR_HANGING_SIGN, BEECH_LOG);
            content.addAfter(BEECH_LOG, BEECH_WOOD);
            content.addAfter(BEECH_WOOD, STRIPPED_BEECH_LOG);
            content.addAfter(STRIPPED_BEECH_LOG, STRIPPED_BEECH_WOOD);
            content.addAfter(STRIPPED_BEECH_WOOD, BEECH_PLANKS);
            content.addAfter(BEECH_PLANKS, BEECH_STAIRS);
            content.addAfter(BEECH_STAIRS, BEECH_SLAB);
            content.addAfter(BEECH_SLAB, BEECH_FENCE);
            content.addAfter(BEECH_FENCE, BEECH_FENCE_GATE);
            content.addAfter(BEECH_FENCE_GATE, BEECH_DOOR);
            content.addAfter(BEECH_DOOR, BEECH_TRAPDOOR);
            content.addAfter(BEECH_TRAPDOOR, BEECH_PRESSURE_PLATE);
            content.addAfter(BEECH_PRESSURE_PLATE, BEECH_BUTTON);
            content.addAfter(BEECH_BUTTON, BlockItems.BEECH_SIGN);
            content.addAfter(BlockItems.BEECH_SIGN, BlockItems.BEECH_HANGING_SIGN);

            //HICKORY
            content.addAfter(BlockItems.BEECH_HANGING_SIGN, HICKORY_LOG);
            content.addAfter(HICKORY_LOG, HICKORY_WOOD);
            content.addAfter(HICKORY_WOOD, STRIPPED_HICKORY_LOG);
            content.addAfter(STRIPPED_HICKORY_LOG, STRIPPED_HICKORY_WOOD);
            content.addAfter(STRIPPED_HICKORY_WOOD, HICKORY_PLANKS);
            content.addAfter(HICKORY_PLANKS, HICKORY_STAIRS);
            content.addAfter(HICKORY_STAIRS, HICKORY_SLAB);
            content.addAfter(HICKORY_SLAB, HICKORY_FENCE);
            content.addAfter(HICKORY_FENCE, HICKORY_FENCE_GATE);
            content.addAfter(HICKORY_FENCE_GATE, HICKORY_DOOR);
            content.addAfter(HICKORY_DOOR, HICKORY_TRAPDOOR);
            content.addAfter(HICKORY_TRAPDOOR, HICKORY_PRESSURE_PLATE);
            content.addAfter(HICKORY_PRESSURE_PLATE, HICKORY_BUTTON);
            content.addAfter(HICKORY_BUTTON, BlockItems.HICKORY_SIGN);
            content.addAfter(BlockItems.HICKORY_SIGN, BlockItems.HICKORY_HANGING_SIGN);

            //WALNUT
            content.addAfter(BlockItems.HICKORY_HANGING_SIGN, WALNUT_LOG);
            content.addAfter(WALNUT_LOG, WALNUT_WOOD);
            content.addAfter(WALNUT_WOOD, STRIPPED_WALNUT_LOG);
            content.addAfter(STRIPPED_WALNUT_LOG, STRIPPED_WALNUT_WOOD);
            content.addAfter(STRIPPED_WALNUT_WOOD, WALNUT_PLANKS);
            content.addAfter(WALNUT_PLANKS, WALNUT_STAIRS);
            content.addAfter(WALNUT_STAIRS, WALNUT_SLAB);
            content.addAfter(WALNUT_SLAB, WALNUT_FENCE);
            content.addAfter(WALNUT_FENCE, WALNUT_FENCE_GATE);
            content.addAfter(WALNUT_FENCE_GATE, WALNUT_DOOR);
            content.addAfter(WALNUT_DOOR, WALNUT_TRAPDOOR);
            content.addAfter(WALNUT_TRAPDOOR, WALNUT_PRESSURE_PLATE);
            content.addAfter(WALNUT_PRESSURE_PLATE, WALNUT_BUTTON);
            content.addAfter(WALNUT_BUTTON, BlockItems.WALNUT_SIGN);
            content.addAfter(BlockItems.WALNUT_SIGN, BlockItems.WALNUT_HANGING_SIGN);

            //CHESTNUT
            content.addAfter(BlockItems.WALNUT_HANGING_SIGN, CHESTNUT_LOG);
            content.addAfter(CHESTNUT_LOG, CHESTNUT_WOOD);
            content.addAfter(CHESTNUT_WOOD, STRIPPED_CHESTNUT_LOG);
            content.addAfter(STRIPPED_CHESTNUT_LOG, STRIPPED_CHESTNUT_WOOD);
            content.addAfter(STRIPPED_CHESTNUT_WOOD, CHESTNUT_PLANKS);
            content.addAfter(CHESTNUT_PLANKS, CHESTNUT_STAIRS);
            content.addAfter(CHESTNUT_STAIRS, CHESTNUT_SLAB);
            content.addAfter(CHESTNUT_SLAB, CHESTNUT_FENCE);
            content.addAfter(CHESTNUT_FENCE, CHESTNUT_FENCE_GATE);
            content.addAfter(CHESTNUT_FENCE_GATE, CHESTNUT_DOOR);
            content.addAfter(CHESTNUT_DOOR, CHESTNUT_TRAPDOOR);
            content.addAfter(CHESTNUT_TRAPDOOR, CHESTNUT_PRESSURE_PLATE);
            content.addAfter(CHESTNUT_PRESSURE_PLATE, CHESTNUT_BUTTON);
            content.addAfter(CHESTNUT_BUTTON, BlockItems.CHESTNUT_SIGN);
            content.addAfter(BlockItems.CHESTNUT_SIGN, BlockItems.CHESTNUT_HANGING_SIGN);

            //SPRUCE
            content.addAfter(SPRUCE_BUTTON, SPRUCE_SIGN);
            content.addAfter(SPRUCE_SIGN, SPRUCE_HANGING_SIGN);

            //CEDAR
            content.addAfter(SPRUCE_HANGING_SIGN, CEDAR_LOG);
            content.addAfter(CEDAR_LOG, CEDAR_WOOD);
            content.addAfter(CEDAR_WOOD, STRIPPED_CEDAR_LOG);
            content.addAfter(STRIPPED_CEDAR_LOG, STRIPPED_CEDAR_WOOD);
            content.addAfter(STRIPPED_CEDAR_WOOD, CEDAR_PLANKS);
            content.addAfter(CEDAR_PLANKS, CEDAR_STAIRS);
            content.addAfter(CEDAR_STAIRS, CEDAR_SLAB);
            content.addAfter(CEDAR_SLAB, CEDAR_FENCE);
            content.addAfter(CEDAR_FENCE, CEDAR_FENCE_GATE);
            content.addAfter(CEDAR_FENCE_GATE, CEDAR_DOOR);
            content.addAfter(CEDAR_DOOR, CEDAR_TRAPDOOR);
            content.addAfter(CEDAR_TRAPDOOR, CEDAR_PRESSURE_PLATE);
            content.addAfter(CEDAR_PRESSURE_PLATE, CEDAR_BUTTON);
            content.addAfter(CEDAR_BUTTON, BlockItems.CEDAR_SIGN);
            content.addAfter(BlockItems.CEDAR_SIGN, BlockItems.CEDAR_HANGING_SIGN);

            //REDWOOD
            content.addAfter(BlockItems.CEDAR_HANGING_SIGN, REDWOOD_LOG);
            content.addAfter(REDWOOD_LOG, REDWOOD_WOOD);
            content.addAfter(REDWOOD_WOOD, STRIPPED_REDWOOD_LOG);
            content.addAfter(STRIPPED_REDWOOD_LOG, STRIPPED_REDWOOD_WOOD);
            content.addAfter(STRIPPED_REDWOOD_WOOD, REDWOOD_PLANKS);
            content.addAfter(REDWOOD_PLANKS, REDWOOD_STAIRS);
            content.addAfter(REDWOOD_STAIRS, REDWOOD_SLAB);
            content.addAfter(REDWOOD_SLAB, REDWOOD_FENCE);
            content.addAfter(REDWOOD_FENCE, REDWOOD_FENCE_GATE);
            content.addAfter(REDWOOD_FENCE_GATE, REDWOOD_DOOR);
            content.addAfter(REDWOOD_DOOR, REDWOOD_TRAPDOOR);
            content.addAfter(REDWOOD_TRAPDOOR, REDWOOD_PRESSURE_PLATE);
            content.addAfter(REDWOOD_PRESSURE_PLATE, REDWOOD_BUTTON);
            content.addAfter(REDWOOD_BUTTON, BlockItems.REDWOOD_SIGN);
            content.addAfter(BlockItems.REDWOOD_SIGN, BlockItems.REDWOOD_HANGING_SIGN);

            //FIR
            content.addAfter(BlockItems.REDWOOD_HANGING_SIGN, FIR_LOG);
            content.addAfter(FIR_LOG, FIR_WOOD);
            content.addAfter(FIR_WOOD, STRIPPED_FIR_LOG);
            content.addAfter(STRIPPED_FIR_LOG, STRIPPED_FIR_WOOD);
            content.addAfter(STRIPPED_FIR_WOOD, FIR_PLANKS);
            content.addAfter(FIR_PLANKS, FIR_STAIRS);
            content.addAfter(FIR_STAIRS, FIR_SLAB);
            content.addAfter(FIR_SLAB, FIR_FENCE);
            content.addAfter(FIR_FENCE, FIR_FENCE_GATE);
            content.addAfter(FIR_FENCE_GATE, FIR_DOOR);
            content.addAfter(FIR_DOOR, FIR_TRAPDOOR);
            content.addAfter(FIR_TRAPDOOR, FIR_PRESSURE_PLATE);
            content.addAfter(FIR_PRESSURE_PLATE, FIR_BUTTON);
            content.addAfter(FIR_BUTTON, BlockItems.FIR_SIGN);
            content.addAfter(BlockItems.FIR_SIGN, BlockItems.FIR_HANGING_SIGN);

            //HEMLOCK
            content.addAfter(BlockItems.FIR_HANGING_SIGN, HEMLOCK_LOG);
            content.addAfter(HEMLOCK_LOG, HEMLOCK_WOOD);
            content.addAfter(HEMLOCK_WOOD, STRIPPED_HEMLOCK_LOG);
            content.addAfter(STRIPPED_HEMLOCK_LOG, STRIPPED_HEMLOCK_WOOD);
            content.addAfter(STRIPPED_HEMLOCK_WOOD, HEMLOCK_PLANKS);
            content.addAfter(HEMLOCK_PLANKS, HEMLOCK_STAIRS);
            content.addAfter(HEMLOCK_STAIRS, HEMLOCK_SLAB);
            content.addAfter(HEMLOCK_SLAB, HEMLOCK_FENCE);
            content.addAfter(HEMLOCK_FENCE, HEMLOCK_FENCE_GATE);
            content.addAfter(HEMLOCK_FENCE_GATE, HEMLOCK_DOOR);
            content.addAfter(HEMLOCK_DOOR, HEMLOCK_TRAPDOOR);
            content.addAfter(HEMLOCK_TRAPDOOR, HEMLOCK_PRESSURE_PLATE);
            content.addAfter(HEMLOCK_PRESSURE_PLATE, HEMLOCK_BUTTON);
            content.addAfter(HEMLOCK_BUTTON, BlockItems.HEMLOCK_SIGN);
            content.addAfter(BlockItems.HEMLOCK_SIGN, BlockItems.HEMLOCK_HANGING_SIGN);

            //HOLLY
            content.addAfter(BlockItems.HEMLOCK_HANGING_SIGN, HOLLY_LOG);
            content.addAfter(HOLLY_LOG, HOLLY_WOOD);
            content.addAfter(HOLLY_WOOD, STRIPPED_HOLLY_LOG);
            content.addAfter(STRIPPED_HOLLY_LOG, STRIPPED_HOLLY_WOOD);
            content.addAfter(STRIPPED_HOLLY_WOOD, HOLLY_PLANKS);
            content.addAfter(HOLLY_PLANKS, HOLLY_STAIRS);
            content.addAfter(HOLLY_STAIRS, HOLLY_SLAB);
            content.addAfter(HOLLY_SLAB, HOLLY_FENCE);
            content.addAfter(HOLLY_FENCE, HOLLY_FENCE_GATE);
            content.addAfter(HOLLY_FENCE_GATE, HOLLY_DOOR);
            content.addAfter(HOLLY_DOOR, HOLLY_TRAPDOOR);
            content.addAfter(HOLLY_TRAPDOOR, HOLLY_PRESSURE_PLATE);
            content.addAfter(HOLLY_PRESSURE_PLATE, HOLLY_BUTTON);
            content.addAfter(HOLLY_BUTTON, BlockItems.HOLLY_SIGN);
            content.addAfter(BlockItems.HOLLY_SIGN, BlockItems.HOLLY_HANGING_SIGN);

            //PINE
            content.addAfter(BlockItems.HOLLY_HANGING_SIGN, PINE_LOG);
            content.addAfter(PINE_LOG, PINE_WOOD);
            content.addAfter(PINE_WOOD, STRIPPED_PINE_LOG);
            content.addAfter(STRIPPED_PINE_LOG, STRIPPED_PINE_WOOD);
            content.addAfter(STRIPPED_PINE_WOOD, PINE_PLANKS);
            content.addAfter(PINE_PLANKS, PINE_STAIRS);
            content.addAfter(PINE_STAIRS, PINE_SLAB);
            content.addAfter(PINE_SLAB, PINE_FENCE);
            content.addAfter(PINE_FENCE, PINE_FENCE_GATE);
            content.addAfter(PINE_FENCE_GATE, PINE_DOOR);
            content.addAfter(PINE_DOOR, PINE_TRAPDOOR);
            content.addAfter(PINE_TRAPDOOR, PINE_PRESSURE_PLATE);
            content.addAfter(PINE_PRESSURE_PLATE, PINE_BUTTON);
            content.addAfter(PINE_BUTTON, BlockItems.PINE_SIGN);
            content.addAfter(BlockItems.PINE_SIGN, BlockItems.PINE_HANGING_SIGN);

            //LARCH
            content.addAfter(BlockItems.PINE_HANGING_SIGN, LARCH_LOG);
            content.addAfter(LARCH_LOG, LARCH_WOOD);
            content.addAfter(LARCH_WOOD, STRIPPED_LARCH_LOG);
            content.addAfter(STRIPPED_LARCH_LOG, STRIPPED_LARCH_WOOD);
            content.addAfter(STRIPPED_LARCH_WOOD, LARCH_PLANKS);
            content.addAfter(LARCH_PLANKS, LARCH_STAIRS);
            content.addAfter(LARCH_STAIRS, LARCH_SLAB);
            content.addAfter(LARCH_SLAB, LARCH_FENCE);
            content.addAfter(LARCH_FENCE, LARCH_FENCE_GATE);
            content.addAfter(LARCH_FENCE_GATE, LARCH_DOOR);
            content.addAfter(LARCH_DOOR, LARCH_TRAPDOOR);
            content.addAfter(LARCH_TRAPDOOR, LARCH_PRESSURE_PLATE);
            content.addAfter(LARCH_PRESSURE_PLATE, LARCH_BUTTON);
            content.addAfter(LARCH_BUTTON, BlockItems.LARCH_SIGN);
            content.addAfter(BlockItems.LARCH_SIGN, BlockItems.LARCH_HANGING_SIGN);

            //BIRCH
            content.addAfter(BIRCH_BUTTON, BIRCH_SIGN);
            content.addAfter(BIRCH_SIGN, BIRCH_HANGING_SIGN);

            //ASPEN
            content.addAfter(BIRCH_HANGING_SIGN, ASPEN_LOG);
            content.addAfter(ASPEN_LOG, ASPEN_WOOD);
            content.addAfter(ASPEN_WOOD, STRIPPED_ASPEN_LOG);
            content.addAfter(STRIPPED_ASPEN_LOG, STRIPPED_ASPEN_WOOD);
            content.addAfter(STRIPPED_ASPEN_WOOD, ASPEN_PLANKS);
            content.addAfter(ASPEN_PLANKS, ASPEN_STAIRS);
            content.addAfter(ASPEN_STAIRS, ASPEN_SLAB);
            content.addAfter(ASPEN_SLAB, ASPEN_FENCE);
            content.addAfter(ASPEN_FENCE, ASPEN_FENCE_GATE);
            content.addAfter(ASPEN_FENCE_GATE, ASPEN_DOOR);
            content.addAfter(ASPEN_DOOR, ASPEN_TRAPDOOR);
            content.addAfter(ASPEN_TRAPDOOR, ASPEN_PRESSURE_PLATE);
            content.addAfter(ASPEN_PRESSURE_PLATE, ASPEN_BUTTON);
            content.addAfter(ASPEN_BUTTON, BlockItems.ASPEN_SIGN);
            content.addAfter(BlockItems.ASPEN_SIGN, BlockItems.ASPEN_HANGING_SIGN);

            //JUNGLE
            content.addAfter(JUNGLE_BUTTON, JUNGLE_SIGN);
            content.addAfter(JUNGLE_SIGN, JUNGLE_HANGING_SIGN);

            //KAPOK
            content.addAfter(JUNGLE_HANGING_SIGN, KAPOK_LOG);
            content.addAfter(KAPOK_LOG, KAPOK_WOOD);
            content.addAfter(KAPOK_WOOD, STRIPPED_KAPOK_LOG);
            content.addAfter(STRIPPED_KAPOK_LOG, STRIPPED_KAPOK_WOOD);
            content.addAfter(STRIPPED_KAPOK_WOOD, KAPOK_PLANKS);
            content.addAfter(KAPOK_PLANKS, KAPOK_STAIRS);
            content.addAfter(KAPOK_STAIRS, KAPOK_SLAB);
            content.addAfter(KAPOK_SLAB, KAPOK_FENCE);
            content.addAfter(KAPOK_FENCE, KAPOK_FENCE_GATE);
            content.addAfter(KAPOK_FENCE_GATE, KAPOK_DOOR);
            content.addAfter(KAPOK_DOOR, KAPOK_TRAPDOOR);
            content.addAfter(KAPOK_TRAPDOOR, KAPOK_PRESSURE_PLATE);
            content.addAfter(KAPOK_PRESSURE_PLATE, KAPOK_BUTTON);
            content.addAfter(KAPOK_BUTTON, BlockItems.KAPOK_SIGN);
            content.addAfter(BlockItems.KAPOK_SIGN, BlockItems.KAPOK_HANGING_SIGN);

            //MAHOGANY
            content.addAfter(BlockItems.KAPOK_HANGING_SIGN, MAHOGANY_LOG);
            content.addAfter(MAHOGANY_LOG, MAHOGANY_WOOD);
            content.addAfter(MAHOGANY_WOOD, STRIPPED_MAHOGANY_LOG);
            content.addAfter(STRIPPED_MAHOGANY_LOG, STRIPPED_MAHOGANY_WOOD);
            content.addAfter(STRIPPED_MAHOGANY_WOOD, MAHOGANY_PLANKS);
            content.addAfter(MAHOGANY_PLANKS, MAHOGANY_STAIRS);
            content.addAfter(MAHOGANY_STAIRS, MAHOGANY_SLAB);
            content.addAfter(MAHOGANY_SLAB, MAHOGANY_FENCE);
            content.addAfter(MAHOGANY_FENCE, MAHOGANY_FENCE_GATE);
            content.addAfter(MAHOGANY_FENCE_GATE, MAHOGANY_DOOR);
            content.addAfter(MAHOGANY_DOOR, MAHOGANY_TRAPDOOR);
            content.addAfter(MAHOGANY_TRAPDOOR, MAHOGANY_PRESSURE_PLATE);
            content.addAfter(MAHOGANY_PRESSURE_PLATE, MAHOGANY_BUTTON);
            content.addAfter(MAHOGANY_BUTTON, BlockItems.MAHOGANY_SIGN);
            content.addAfter(BlockItems.MAHOGANY_SIGN, BlockItems.MAHOGANY_HANGING_SIGN);

            //EUCALYPTUS
            content.addAfter(BlockItems.MAHOGANY_HANGING_SIGN, EUCALYPTUS_LOG);
            content.addAfter(EUCALYPTUS_LOG, EUCALYPTUS_WOOD);
            content.addAfter(EUCALYPTUS_WOOD, STRIPPED_EUCALYPTUS_LOG);
            content.addAfter(STRIPPED_EUCALYPTUS_LOG, STRIPPED_EUCALYPTUS_WOOD);
            content.addAfter(STRIPPED_EUCALYPTUS_WOOD, EUCALYPTUS_PLANKS);
            content.addAfter(EUCALYPTUS_PLANKS, EUCALYPTUS_STAIRS);
            content.addAfter(EUCALYPTUS_STAIRS, EUCALYPTUS_SLAB);
            content.addAfter(EUCALYPTUS_SLAB, EUCALYPTUS_FENCE);
            content.addAfter(EUCALYPTUS_FENCE, EUCALYPTUS_FENCE_GATE);
            content.addAfter(EUCALYPTUS_FENCE_GATE, EUCALYPTUS_DOOR);
            content.addAfter(EUCALYPTUS_DOOR, EUCALYPTUS_TRAPDOOR);
            content.addAfter(EUCALYPTUS_TRAPDOOR, EUCALYPTUS_PRESSURE_PLATE);
            content.addAfter(EUCALYPTUS_PRESSURE_PLATE, EUCALYPTUS_BUTTON);
            content.addAfter(EUCALYPTUS_BUTTON, BlockItems.EUCALYPTUS_SIGN);
            content.addAfter(BlockItems.EUCALYPTUS_SIGN, BlockItems.EUCALYPTUS_HANGING_SIGN);

            //ACACIA
            content.addAfter(ACACIA_BUTTON, ACACIA_SIGN);
            content.addAfter(ACACIA_SIGN, ACACIA_HANGING_SIGN);

            //BAOBAB
            content.addAfter(ACACIA_HANGING_SIGN, BAOBAB_LOG);
            content.addAfter(BAOBAB_LOG, BAOBAB_WOOD);
            content.addAfter(BAOBAB_WOOD, STRIPPED_BAOBAB_LOG);
            content.addAfter(STRIPPED_BAOBAB_LOG, STRIPPED_BAOBAB_WOOD);
            content.addAfter(STRIPPED_BAOBAB_WOOD, BAOBAB_PLANKS);
            content.addAfter(BAOBAB_PLANKS, BAOBAB_STAIRS);
            content.addAfter(BAOBAB_STAIRS, BAOBAB_SLAB);
            content.addAfter(BAOBAB_SLAB, BAOBAB_FENCE);
            content.addAfter(BAOBAB_FENCE, BAOBAB_FENCE_GATE);
            content.addAfter(BAOBAB_FENCE_GATE, BAOBAB_DOOR);
            content.addAfter(BAOBAB_DOOR, BAOBAB_TRAPDOOR);
            content.addAfter(BAOBAB_TRAPDOOR, BAOBAB_PRESSURE_PLATE);
            content.addAfter(BAOBAB_PRESSURE_PLATE, BAOBAB_BUTTON);
            content.addAfter(BAOBAB_BUTTON, BlockItems.BAOBAB_SIGN);
            content.addAfter(BlockItems.BAOBAB_SIGN, BlockItems.BAOBAB_HANGING_SIGN);

            //PALO VERDE
            content.addAfter(BlockItems.BAOBAB_HANGING_SIGN, PALO_VERDE_LOG);
            content.addAfter(PALO_VERDE_LOG, PALO_VERDE_WOOD);
            content.addAfter(PALO_VERDE_WOOD, STRIPPED_PALO_VERDE_LOG);
            content.addAfter(STRIPPED_PALO_VERDE_LOG, STRIPPED_PALO_VERDE_WOOD);
            content.addAfter(STRIPPED_PALO_VERDE_WOOD, PALO_VERDE_PLANKS);
            content.addAfter(PALO_VERDE_PLANKS, PALO_VERDE_STAIRS);
            content.addAfter(PALO_VERDE_STAIRS, PALO_VERDE_SLAB);
            content.addAfter(PALO_VERDE_SLAB, PALO_VERDE_FENCE);
            content.addAfter(PALO_VERDE_FENCE, PALO_VERDE_FENCE_GATE);
            content.addAfter(PALO_VERDE_FENCE_GATE, PALO_VERDE_DOOR);
            content.addAfter(PALO_VERDE_DOOR, PALO_VERDE_TRAPDOOR);
            content.addAfter(PALO_VERDE_TRAPDOOR, PALO_VERDE_PRESSURE_PLATE);
            content.addAfter(PALO_VERDE_PRESSURE_PLATE, PALO_VERDE_BUTTON);
            content.addAfter(PALO_VERDE_BUTTON, BlockItems.PALO_VERDE_SIGN);
            content.addAfter(BlockItems.PALO_VERDE_SIGN, BlockItems.PALO_VERDE_HANGING_SIGN);

            //JOSHUA
            content.addAfter(BlockItems.PALO_VERDE_HANGING_SIGN, JOSHUA_LOG);
            content.addAfter(JOSHUA_LOG, JOSHUA_WOOD);
            content.addAfter(JOSHUA_WOOD, STRIPPED_JOSHUA_LOG);
            content.addAfter(STRIPPED_JOSHUA_LOG, STRIPPED_JOSHUA_WOOD);
            content.addAfter(STRIPPED_JOSHUA_WOOD, JOSHUA_PLANKS);
            content.addAfter(JOSHUA_PLANKS, JOSHUA_STAIRS);
            content.addAfter(JOSHUA_STAIRS, JOSHUA_SLAB);
            content.addAfter(JOSHUA_SLAB, JOSHUA_FENCE);
            content.addAfter(JOSHUA_FENCE, JOSHUA_FENCE_GATE);
            content.addAfter(JOSHUA_FENCE_GATE, JOSHUA_DOOR);
            content.addAfter(JOSHUA_DOOR, JOSHUA_TRAPDOOR);
            content.addAfter(JOSHUA_TRAPDOOR, JOSHUA_PRESSURE_PLATE);
            content.addAfter(JOSHUA_PRESSURE_PLATE, JOSHUA_BUTTON);
            content.addAfter(JOSHUA_BUTTON, BlockItems.JOSHUA_SIGN);
            content.addAfter(BlockItems.JOSHUA_SIGN, BlockItems.JOSHUA_HANGING_SIGN);

            //JUNIPER
            content.addAfter(BlockItems.JOSHUA_HANGING_SIGN, JUNIPER_LOG);
            content.addAfter(JUNIPER_LOG, JUNIPER_WOOD);
            content.addAfter(JUNIPER_WOOD, STRIPPED_JUNIPER_LOG);
            content.addAfter(STRIPPED_JUNIPER_LOG, STRIPPED_JUNIPER_WOOD);
            content.addAfter(STRIPPED_JUNIPER_WOOD, JUNIPER_PLANKS);
            content.addAfter(JUNIPER_PLANKS, JUNIPER_STAIRS);
            content.addAfter(JUNIPER_STAIRS, JUNIPER_SLAB);
            content.addAfter(JUNIPER_SLAB, JUNIPER_FENCE);
            content.addAfter(JUNIPER_FENCE, JUNIPER_FENCE_GATE);
            content.addAfter(JUNIPER_FENCE_GATE, JUNIPER_DOOR);
            content.addAfter(JUNIPER_DOOR, JUNIPER_TRAPDOOR);
            content.addAfter(JUNIPER_TRAPDOOR, JUNIPER_PRESSURE_PLATE);
            content.addAfter(JUNIPER_PRESSURE_PLATE, JUNIPER_BUTTON);
            content.addAfter(JUNIPER_BUTTON, BlockItems.JUNIPER_SIGN);
            content.addAfter(BlockItems.JUNIPER_SIGN, BlockItems.JUNIPER_HANGING_SIGN);

            //PALM
            content.addAfter(BlockItems.JUNIPER_HANGING_SIGN, PALM_LOG);
            content.addAfter(PALM_LOG, PALM_WOOD);
            content.addAfter(PALM_WOOD, STRIPPED_PALM_LOG);
            content.addAfter(STRIPPED_PALM_LOG, STRIPPED_PALM_WOOD);
            content.addAfter(STRIPPED_PALM_WOOD, PALM_PLANKS);
            content.addAfter(PALM_PLANKS, PALM_STAIRS);
            content.addAfter(PALM_STAIRS, PALM_SLAB);
            content.addAfter(PALM_SLAB, PALM_FENCE);
            content.addAfter(PALM_FENCE, PALM_FENCE_GATE);
            content.addAfter(PALM_FENCE_GATE, PALM_DOOR);
            content.addAfter(PALM_DOOR, PALM_TRAPDOOR);
            content.addAfter(PALM_TRAPDOOR, PALM_PRESSURE_PLATE);
            content.addAfter(PALM_PRESSURE_PLATE, PALM_BUTTON);
            content.addAfter(PALM_BUTTON, BlockItems.PALM_SIGN);
            content.addAfter(BlockItems.PALM_SIGN, BlockItems.PALM_HANGING_SIGN);

            //DARK_OAK
            content.addAfter(DARK_OAK_BUTTON, DARK_OAK_SIGN);
            content.addAfter(DARK_OAK_SIGN, DARK_OAK_HANGING_SIGN);

            //EBONY
            content.addAfter(DARK_OAK_HANGING_SIGN, EBONY_LOG);
            content.addAfter(EBONY_LOG, EBONY_WOOD);
            content.addAfter(EBONY_WOOD, STRIPPED_EBONY_LOG);
            content.addAfter(STRIPPED_EBONY_LOG, STRIPPED_EBONY_WOOD);
            content.addAfter(STRIPPED_EBONY_WOOD, EBONY_PLANKS);
            content.addAfter(EBONY_PLANKS, EBONY_STAIRS);
            content.addAfter(EBONY_STAIRS, EBONY_SLAB);
            content.addAfter(EBONY_SLAB, EBONY_FENCE);
            content.addAfter(EBONY_FENCE, EBONY_FENCE_GATE);
            content.addAfter(EBONY_FENCE_GATE, EBONY_DOOR);
            content.addAfter(EBONY_DOOR, EBONY_TRAPDOOR);
            content.addAfter(EBONY_TRAPDOOR, EBONY_PRESSURE_PLATE);
            content.addAfter(EBONY_PRESSURE_PLATE, EBONY_BUTTON);
            content.addAfter(EBONY_BUTTON, BlockItems.EBONY_SIGN);
            content.addAfter(BlockItems.EBONY_SIGN, BlockItems.EBONY_HANGING_SIGN);

            //TEAK
            content.addAfter(BlockItems.EBONY_HANGING_SIGN, TEAK_LOG);
            content.addAfter(TEAK_LOG, TEAK_WOOD);
            content.addAfter(TEAK_WOOD, STRIPPED_TEAK_LOG);
            content.addAfter(STRIPPED_TEAK_LOG, STRIPPED_TEAK_WOOD);
            content.addAfter(STRIPPED_TEAK_WOOD, TEAK_PLANKS);
            content.addAfter(TEAK_PLANKS, TEAK_STAIRS);
            content.addAfter(TEAK_STAIRS, TEAK_SLAB);
            content.addAfter(TEAK_SLAB, TEAK_FENCE);
            content.addAfter(TEAK_FENCE, TEAK_FENCE_GATE);
            content.addAfter(TEAK_FENCE_GATE, TEAK_DOOR);
            content.addAfter(TEAK_DOOR, TEAK_TRAPDOOR);
            content.addAfter(TEAK_TRAPDOOR, TEAK_PRESSURE_PLATE);
            content.addAfter(TEAK_PRESSURE_PLATE, TEAK_BUTTON);
            content.addAfter(TEAK_BUTTON, BlockItems.TEAK_SIGN);
            content.addAfter(BlockItems.TEAK_SIGN, BlockItems.TEAK_HANGING_SIGN);

            //ELM
            content.addAfter(BlockItems.TEAK_HANGING_SIGN, ELM_LOG);
            content.addAfter(ELM_LOG, ELM_WOOD);
            content.addAfter(ELM_WOOD, STRIPPED_ELM_LOG);
            content.addAfter(STRIPPED_ELM_LOG, STRIPPED_ELM_WOOD);
            content.addAfter(STRIPPED_ELM_WOOD, ELM_PLANKS);
            content.addAfter(ELM_PLANKS, ELM_STAIRS);
            content.addAfter(ELM_STAIRS, ELM_SLAB);
            content.addAfter(ELM_SLAB, ELM_FENCE);
            content.addAfter(ELM_FENCE, ELM_FENCE_GATE);
            content.addAfter(ELM_FENCE_GATE, ELM_DOOR);
            content.addAfter(ELM_DOOR, ELM_TRAPDOOR);
            content.addAfter(ELM_TRAPDOOR, ELM_PRESSURE_PLATE);
            content.addAfter(ELM_PRESSURE_PLATE, ELM_BUTTON);
            content.addAfter(ELM_BUTTON, BlockItems.ELM_SIGN);
            content.addAfter(BlockItems.ELM_SIGN, BlockItems.ELM_HANGING_SIGN);

            //MANGROVE
            content.addAfter(MANGROVE_BUTTON, MANGROVE_SIGN);
            content.addAfter(MANGROVE_SIGN, MANGROVE_HANGING_SIGN);

            //WILLOW
            content.addAfter(MANGROVE_HANGING_SIGN, WILLOW_LOG);
            content.addAfter(WILLOW_LOG, WILLOW_WOOD);
            content.addAfter(WILLOW_WOOD, STRIPPED_WILLOW_LOG);
            content.addAfter(STRIPPED_WILLOW_LOG, STRIPPED_WILLOW_WOOD);
            content.addAfter(STRIPPED_WILLOW_WOOD, WILLOW_PLANKS);
            content.addAfter(WILLOW_PLANKS, WILLOW_STAIRS);
            content.addAfter(WILLOW_STAIRS, WILLOW_SLAB);
            content.addAfter(WILLOW_SLAB, WILLOW_FENCE);
            content.addAfter(WILLOW_FENCE, WILLOW_FENCE_GATE);
            content.addAfter(WILLOW_FENCE_GATE, WILLOW_DOOR);
            content.addAfter(WILLOW_DOOR, WILLOW_TRAPDOOR);
            content.addAfter(WILLOW_TRAPDOOR, WILLOW_PRESSURE_PLATE);
            content.addAfter(WILLOW_PRESSURE_PLATE, WILLOW_BUTTON);
            content.addAfter(WILLOW_BUTTON, BlockItems.WILLOW_SIGN);
            content.addAfter(BlockItems.WILLOW_SIGN, BlockItems.WILLOW_HANGING_SIGN);

            //CYPRESS
            content.addAfter(BlockItems.WILLOW_HANGING_SIGN, CYPRESS_LOG);
            content.addAfter(CYPRESS_LOG, CYPRESS_WOOD);
            content.addAfter(CYPRESS_WOOD, STRIPPED_CYPRESS_LOG);
            content.addAfter(STRIPPED_CYPRESS_LOG, STRIPPED_CYPRESS_WOOD);
            content.addAfter(STRIPPED_CYPRESS_WOOD, CYPRESS_PLANKS);
            content.addAfter(CYPRESS_PLANKS, CYPRESS_STAIRS);
            content.addAfter(CYPRESS_STAIRS, CYPRESS_SLAB);
            content.addAfter(CYPRESS_SLAB, CYPRESS_FENCE);
            content.addAfter(CYPRESS_FENCE, CYPRESS_FENCE_GATE);
            content.addAfter(CYPRESS_FENCE_GATE, CYPRESS_DOOR);
            content.addAfter(CYPRESS_DOOR, CYPRESS_TRAPDOOR);
            content.addAfter(CYPRESS_TRAPDOOR, CYPRESS_PRESSURE_PLATE);
            content.addAfter(CYPRESS_PRESSURE_PLATE, CYPRESS_BUTTON);
            content.addAfter(CYPRESS_BUTTON, BlockItems.CYPRESS_SIGN);
            content.addAfter(BlockItems.CYPRESS_SIGN, BlockItems.CYPRESS_HANGING_SIGN);

            //CHERRY
            content.addAfter(CHERRY_BUTTON, CHERRY_SIGN);
            content.addAfter(CHERRY_SIGN, CHERRY_HANGING_SIGN);

            //SAKURA
            content.addAfter(CHERRY_HANGING_SIGN, SAKURA_LOG);
            content.addAfter(SAKURA_LOG, SAKURA_WOOD);
            content.addAfter(SAKURA_WOOD, STRIPPED_SAKURA_LOG);
            content.addAfter(STRIPPED_SAKURA_LOG, STRIPPED_SAKURA_WOOD);
            content.addAfter(STRIPPED_SAKURA_WOOD, SAKURA_PLANKS);
            content.addAfter(SAKURA_PLANKS, SAKURA_STAIRS);
            content.addAfter(SAKURA_STAIRS, SAKURA_SLAB);
            content.addAfter(SAKURA_SLAB, SAKURA_FENCE);
            content.addAfter(SAKURA_FENCE, SAKURA_FENCE_GATE);
            content.addAfter(SAKURA_FENCE_GATE, SAKURA_DOOR);
            content.addAfter(SAKURA_DOOR, SAKURA_TRAPDOOR);
            content.addAfter(SAKURA_TRAPDOOR, SAKURA_PRESSURE_PLATE);
            content.addAfter(SAKURA_PRESSURE_PLATE, SAKURA_BUTTON);
            content.addAfter(SAKURA_BUTTON, BlockItems.SAKURA_SIGN);
            content.addAfter(BlockItems.SAKURA_SIGN, BlockItems.SAKURA_HANGING_SIGN);

            //MAGNOLIA
            content.addAfter(BlockItems.SAKURA_HANGING_SIGN, MAGNOLIA_LOG);
            content.addAfter(MAGNOLIA_LOG, MAGNOLIA_WOOD);
            content.addAfter(MAGNOLIA_WOOD, STRIPPED_MAGNOLIA_LOG);
            content.addAfter(STRIPPED_MAGNOLIA_LOG, STRIPPED_MAGNOLIA_WOOD);
            content.addAfter(STRIPPED_MAGNOLIA_WOOD, MAGNOLIA_PLANKS);
            content.addAfter(MAGNOLIA_PLANKS, MAGNOLIA_STAIRS);
            content.addAfter(MAGNOLIA_STAIRS, MAGNOLIA_SLAB);
            content.addAfter(MAGNOLIA_SLAB, MAGNOLIA_FENCE);
            content.addAfter(MAGNOLIA_FENCE, MAGNOLIA_FENCE_GATE);
            content.addAfter(MAGNOLIA_FENCE_GATE, MAGNOLIA_DOOR);
            content.addAfter(MAGNOLIA_DOOR, MAGNOLIA_TRAPDOOR);
            content.addAfter(MAGNOLIA_TRAPDOOR, MAGNOLIA_PRESSURE_PLATE);
            content.addAfter(MAGNOLIA_PRESSURE_PLATE, MAGNOLIA_BUTTON);
            content.addAfter(MAGNOLIA_BUTTON, BlockItems.MAGNOLIA_SIGN);
            content.addAfter(BlockItems.MAGNOLIA_SIGN, BlockItems.MAGNOLIA_HANGING_SIGN);

            //JACARANDA
            content.addAfter(BlockItems.MAGNOLIA_HANGING_SIGN, JACARANDA_LOG);
            content.addAfter(JACARANDA_LOG, JACARANDA_WOOD);
            content.addAfter(JACARANDA_WOOD, STRIPPED_JACARANDA_LOG);
            content.addAfter(STRIPPED_JACARANDA_LOG, STRIPPED_JACARANDA_WOOD);
            content.addAfter(STRIPPED_JACARANDA_WOOD, JACARANDA_PLANKS);
            content.addAfter(JACARANDA_PLANKS, JACARANDA_STAIRS);
            content.addAfter(JACARANDA_STAIRS, JACARANDA_SLAB);
            content.addAfter(JACARANDA_SLAB, JACARANDA_FENCE);
            content.addAfter(JACARANDA_FENCE, JACARANDA_FENCE_GATE);
            content.addAfter(JACARANDA_FENCE_GATE, JACARANDA_DOOR);
            content.addAfter(JACARANDA_DOOR, JACARANDA_TRAPDOOR);
            content.addAfter(JACARANDA_TRAPDOOR, JACARANDA_PRESSURE_PLATE);
            content.addAfter(JACARANDA_PRESSURE_PLATE, JACARANDA_BUTTON);
            content.addAfter(JACARANDA_BUTTON, BlockItems.JACARANDA_SIGN);
            content.addAfter(BlockItems.JACARANDA_SIGN, BlockItems.JACARANDA_HANGING_SIGN);

            //BAMBOO
            content.addAfter(BAMBOO_BUTTON, BAMBOO_SIGN);
            content.addAfter(BAMBOO_SIGN, BAMBOO_HANGING_SIGN);

            //PALE OAK
            content.addAfter(PALE_OAK_BUTTON, PALE_OAK_SIGN);
            content.addAfter(PALE_OAK_SIGN, PALE_OAK_HANGING_SIGN);

            //CRIMSON
            content.addAfter(CRIMSON_BUTTON, CRIMSON_SIGN);
            content.addAfter(CRIMSON_SIGN, CRIMSON_HANGING_SIGN);

            //WARPED
            content.addAfter(WARPED_BUTTON, WARPED_SIGN);
            content.addAfter(WARPED_SIGN, WARPED_HANGING_SIGN);


            //STONE
            content.addAfter(STONE_SLAB, STONE_WALL);
            content.addAfter(SMOOTH_STONE, SMOOTH_STONE_STAIRS);
            content.addAfter(SMOOTH_STONE_SLAB, SMOOTH_STONE_WALL);
            content.addAfter(STONE_BRICK_WALL, STONE_BRICK_PILLAR);

            //GRANITE
            content.addAfter(POLISHED_GRANITE_SLAB, POLISHED_GRANITE_WALL);
            content.addAfter(POLISHED_GRANITE_WALL, GRANITE_BRICKS);
            content.addAfter(GRANITE_BRICKS, CRACKED_GRANITE_BRICKS);
            content.addAfter(CRACKED_GRANITE_BRICKS, GRANITE_BRICK_STAIRS);
            content.addAfter(GRANITE_BRICK_STAIRS, GRANITE_BRICK_SLAB);
            content.addAfter(GRANITE_BRICK_SLAB, GRANITE_BRICK_WALL);
            content.addAfter(GRANITE_BRICK_WALL, MOSSY_GRANITE_BRICKS);
            content.addAfter(MOSSY_GRANITE_BRICKS, MOSSY_GRANITE_BRICK_STAIRS);
            content.addAfter(MOSSY_GRANITE_BRICK_STAIRS, MOSSY_GRANITE_BRICK_SLAB);
            content.addAfter(MOSSY_GRANITE_BRICK_SLAB, MOSSY_GRANITE_BRICK_WALL);
            content.addAfter(MOSSY_GRANITE_BRICK_WALL, GRANITE_BRICK_PILLAR);
            content.addAfter(GRANITE_BRICK_PILLAR, CHISELED_GRANITE_BRICKS);
            content.addAfter(CHISELED_GRANITE_BRICKS, POLISHED_GRANITE_PRESSURE_PLATE);
            content.addAfter(POLISHED_GRANITE_PRESSURE_PLATE, POLISHED_GRANITE_BUTTON);

            //DIORITE
            content.addAfter(POLISHED_DIORITE_SLAB, POLISHED_DIORITE_WALL);
            content.addAfter(POLISHED_DIORITE_WALL, DIORITE_BRICKS);
            content.addAfter(DIORITE_BRICKS, CRACKED_DIORITE_BRICKS);
            content.addAfter(CRACKED_DIORITE_BRICKS, DIORITE_BRICK_STAIRS);
            content.addAfter(DIORITE_BRICK_STAIRS, DIORITE_BRICK_SLAB);
            content.addAfter(DIORITE_BRICK_SLAB, DIORITE_BRICK_WALL);
            content.addAfter(DIORITE_BRICK_WALL, MOSSY_DIORITE_BRICKS);
            content.addAfter(MOSSY_DIORITE_BRICKS, MOSSY_DIORITE_BRICK_STAIRS);
            content.addAfter(MOSSY_DIORITE_BRICK_STAIRS, MOSSY_DIORITE_BRICK_SLAB);
            content.addAfter(MOSSY_DIORITE_BRICK_SLAB, MOSSY_DIORITE_BRICK_WALL);
            content.addAfter(MOSSY_DIORITE_BRICK_WALL, DIORITE_BRICK_PILLAR);
            content.addAfter(DIORITE_BRICK_PILLAR, CHISELED_DIORITE_BRICKS);
            content.addAfter(CHISELED_DIORITE_BRICKS, POLISHED_DIORITE_PRESSURE_PLATE);
            content.addAfter(POLISHED_DIORITE_PRESSURE_PLATE, POLISHED_DIORITE_BUTTON);

            //ANDESITE
            content.addAfter(POLISHED_ANDESITE_SLAB, POLISHED_ANDESITE_WALL);
            content.addAfter(POLISHED_ANDESITE_WALL, ANDESITE_BRICKS);
            content.addAfter(ANDESITE_BRICKS, CRACKED_ANDESITE_BRICKS);
            content.addAfter(CRACKED_ANDESITE_BRICKS, ANDESITE_BRICK_STAIRS);
            content.addAfter(ANDESITE_BRICK_STAIRS, ANDESITE_BRICK_SLAB);
            content.addAfter(ANDESITE_BRICK_SLAB, ANDESITE_BRICK_WALL);
            content.addAfter(ANDESITE_BRICK_WALL, MOSSY_ANDESITE_BRICKS);
            content.addAfter(MOSSY_ANDESITE_BRICKS, MOSSY_ANDESITE_BRICK_STAIRS);
            content.addAfter(MOSSY_ANDESITE_BRICK_STAIRS, MOSSY_ANDESITE_BRICK_SLAB);
            content.addAfter(MOSSY_ANDESITE_BRICK_SLAB, MOSSY_ANDESITE_BRICK_WALL);
            content.addAfter(MOSSY_ANDESITE_BRICK_WALL, ANDESITE_BRICK_PILLAR);
            content.addAfter(ANDESITE_BRICK_PILLAR, CHISELED_ANDESITE_BRICKS);
            content.addAfter(CHISELED_ANDESITE_BRICKS, POLISHED_ANDESITE_PRESSURE_PLATE);
            content.addAfter(POLISHED_ANDESITE_PRESSURE_PLATE, POLISHED_ANDESITE_BUTTON);

            //GNEISS
            content.addAfter(POLISHED_ANDESITE_BUTTON, GNEISS);
            content.addAfter(GNEISS, GNEISS_STAIRS);
            content.addAfter(GNEISS_STAIRS, GNEISS_SLAB);
            content.addAfter(GNEISS_SLAB, GNEISS_WALL);
            content.addAfter(GNEISS_WALL, POLISHED_GNEISS);
            content.addAfter(POLISHED_GNEISS, POLISHED_GNEISS_STAIRS);
            content.addAfter(POLISHED_GNEISS_STAIRS, POLISHED_GNEISS_SLAB);
            content.addAfter(POLISHED_GNEISS_SLAB, POLISHED_GNEISS_WALL);
            content.addAfter(POLISHED_GNEISS_WALL, GNEISS_BRICKS);
            content.addAfter(GNEISS_BRICKS, CRACKED_GNEISS_BRICKS);
            content.addAfter(CRACKED_GNEISS_BRICKS, GNEISS_BRICK_STAIRS);
            content.addAfter(GNEISS_BRICK_STAIRS, GNEISS_BRICK_SLAB);
            content.addAfter(GNEISS_BRICK_SLAB, GNEISS_BRICK_WALL);
            content.addAfter(GNEISS_BRICK_WALL, MOSSY_GNEISS_BRICKS);
            content.addAfter(MOSSY_GNEISS_BRICKS, MOSSY_GNEISS_BRICK_STAIRS);
            content.addAfter(MOSSY_GNEISS_BRICK_STAIRS, MOSSY_GNEISS_BRICK_SLAB);
            content.addAfter(MOSSY_GNEISS_BRICK_SLAB, MOSSY_GNEISS_BRICK_WALL);
            content.addAfter(MOSSY_GNEISS_BRICK_WALL, GNEISS_BRICK_PILLAR);
            content.addAfter(GNEISS_BRICK_PILLAR, CHISELED_GNEISS_BRICKS);
            content.addAfter(CHISELED_GNEISS_BRICKS, POLISHED_GNEISS_PRESSURE_PLATE);
            content.addAfter(POLISHED_GNEISS_PRESSURE_PLATE, POLISHED_GNEISS_BUTTON);

            //SHALE
            content.addAfter(POLISHED_GNEISS_BUTTON, SHALE);
            content.addAfter(SHALE, SHALE_STAIRS);
            content.addAfter(SHALE_STAIRS, SHALE_SLAB);
            content.addAfter(SHALE_SLAB, SHALE_WALL);
            content.addAfter(SHALE_WALL, POLISHED_SHALE);
            content.addAfter(POLISHED_SHALE, POLISHED_SHALE_STAIRS);
            content.addAfter(POLISHED_SHALE_STAIRS, POLISHED_SHALE_SLAB);
            content.addAfter(POLISHED_SHALE_SLAB, POLISHED_SHALE_WALL);
            content.addAfter(POLISHED_SHALE_WALL, SHALE_BRICKS);
            content.addAfter(SHALE_BRICKS, CRACKED_SHALE_BRICKS);
            content.addAfter(CRACKED_SHALE_BRICKS, SHALE_BRICK_STAIRS);
            content.addAfter(SHALE_BRICK_STAIRS, SHALE_BRICK_SLAB);
            content.addAfter(SHALE_BRICK_SLAB, SHALE_BRICK_WALL);
            content.addAfter(SHALE_BRICK_WALL, MOSSY_SHALE_BRICKS);
            content.addAfter(MOSSY_SHALE_BRICKS, MOSSY_SHALE_BRICK_STAIRS);
            content.addAfter(MOSSY_SHALE_BRICK_STAIRS, MOSSY_SHALE_BRICK_SLAB);
            content.addAfter(MOSSY_SHALE_BRICK_SLAB, MOSSY_SHALE_BRICK_WALL);
            content.addAfter(MOSSY_SHALE_BRICK_WALL, SHALE_BRICK_PILLAR);
            content.addAfter(SHALE_BRICK_PILLAR, CHISELED_SHALE_BRICKS);
            content.addAfter(CHISELED_SHALE_BRICKS, POLISHED_SHALE_PRESSURE_PLATE);
            content.addAfter(POLISHED_SHALE_PRESSURE_PLATE, POLISHED_SHALE_BUTTON);

            //LIMESTONE
            content.addAfter(POLISHED_SHALE_BUTTON, LIMESTONE);
            content.addAfter(LIMESTONE, LIMESTONE_STAIRS);
            content.addAfter(LIMESTONE_STAIRS, LIMESTONE_SLAB);
            content.addAfter(LIMESTONE_SLAB, LIMESTONE_WALL);
            content.addAfter(LIMESTONE_WALL, POLISHED_LIMESTONE);
            content.addAfter(POLISHED_LIMESTONE, POLISHED_LIMESTONE_STAIRS);
            content.addAfter(POLISHED_LIMESTONE_STAIRS, POLISHED_LIMESTONE_SLAB);
            content.addAfter(POLISHED_LIMESTONE_SLAB, POLISHED_LIMESTONE_WALL);
            content.addAfter(POLISHED_LIMESTONE_WALL, LIMESTONE_BRICKS);
            content.addAfter(LIMESTONE_BRICKS, CRACKED_LIMESTONE_BRICKS);
            content.addAfter(CRACKED_LIMESTONE_BRICKS, LIMESTONE_BRICK_STAIRS);
            content.addAfter(LIMESTONE_BRICK_STAIRS, LIMESTONE_BRICK_SLAB);
            content.addAfter(LIMESTONE_BRICK_SLAB, LIMESTONE_BRICK_WALL);
            content.addAfter(LIMESTONE_BRICK_WALL, MOSSY_LIMESTONE_BRICKS);
            content.addAfter(MOSSY_LIMESTONE_BRICKS, MOSSY_LIMESTONE_BRICK_STAIRS);
            content.addAfter(MOSSY_LIMESTONE_BRICK_STAIRS, MOSSY_LIMESTONE_BRICK_SLAB);
            content.addAfter(MOSSY_LIMESTONE_BRICK_SLAB, MOSSY_LIMESTONE_BRICK_WALL);
            content.addAfter(MOSSY_LIMESTONE_BRICK_WALL, LIMESTONE_BRICK_PILLAR);
            content.addAfter(LIMESTONE_BRICK_PILLAR, CHISELED_LIMESTONE_BRICKS);
            content.addAfter(CHISELED_LIMESTONE_BRICKS, POLISHED_LIMESTONE_PRESSURE_PLATE);
            content.addAfter(POLISHED_LIMESTONE_PRESSURE_PLATE, POLISHED_LIMESTONE_BUTTON);

            //MARBLE
            content.addAfter(POLISHED_LIMESTONE_BUTTON, MARBLE);
            content.addAfter(MARBLE, MARBLE_STAIRS);
            content.addAfter(MARBLE_STAIRS, MARBLE_SLAB);
            content.addAfter(MARBLE_SLAB, MARBLE_WALL);
            content.addAfter(MARBLE_WALL, POLISHED_MARBLE);
            content.addAfter(POLISHED_MARBLE, POLISHED_MARBLE_STAIRS);
            content.addAfter(POLISHED_MARBLE_STAIRS, POLISHED_MARBLE_SLAB);
            content.addAfter(POLISHED_MARBLE_SLAB, POLISHED_MARBLE_WALL);
            content.addAfter(POLISHED_MARBLE_WALL, MARBLE_BRICKS);
            content.addAfter(MARBLE_BRICKS, CRACKED_MARBLE_BRICKS);
            content.addAfter(CRACKED_MARBLE_BRICKS, MARBLE_BRICK_STAIRS);
            content.addAfter(MARBLE_BRICK_STAIRS, MARBLE_BRICK_SLAB);
            content.addAfter(MARBLE_BRICK_SLAB, MARBLE_BRICK_WALL);
            content.addAfter(MARBLE_BRICK_WALL, MOSSY_MARBLE_BRICKS);
            content.addAfter(MOSSY_MARBLE_BRICKS, MOSSY_MARBLE_BRICK_STAIRS);
            content.addAfter(MOSSY_MARBLE_BRICK_STAIRS, MOSSY_MARBLE_BRICK_SLAB);
            content.addAfter(MOSSY_MARBLE_BRICK_SLAB, MOSSY_MARBLE_BRICK_WALL);
            content.addAfter(MOSSY_MARBLE_BRICK_WALL, MARBLE_BRICK_PILLAR);
            content.addAfter(MARBLE_BRICK_PILLAR, CHISELED_MARBLE_BRICKS);
            content.addAfter(CHISELED_MARBLE_BRICKS, POLISHED_MARBLE_PRESSURE_PLATE);
            content.addAfter(POLISHED_MARBLE_PRESSURE_PLATE, POLISHED_MARBLE_BUTTON);

            //GABBRO
            content.addAfter(POLISHED_MARBLE_BUTTON, GABBRO);
            content.addAfter(GABBRO, GABBRO_STAIRS);
            content.addAfter(GABBRO_STAIRS, GABBRO_SLAB);
            content.addAfter(GABBRO_SLAB, GABBRO_WALL);
            content.addAfter(GABBRO_WALL, POLISHED_GABBRO);
            content.addAfter(POLISHED_GABBRO, POLISHED_GABBRO_STAIRS);
            content.addAfter(POLISHED_GABBRO_STAIRS, POLISHED_GABBRO_SLAB);
            content.addAfter(POLISHED_GABBRO_SLAB, POLISHED_GABBRO_WALL);
            content.addAfter(POLISHED_GABBRO_WALL, GABBRO_BRICKS);
            content.addAfter(GABBRO_BRICKS, CRACKED_GABBRO_BRICKS);
            content.addAfter(CRACKED_GABBRO_BRICKS, GABBRO_BRICK_STAIRS);
            content.addAfter(GABBRO_BRICK_STAIRS, GABBRO_BRICK_SLAB);
            content.addAfter(GABBRO_BRICK_SLAB, GABBRO_BRICK_WALL);
            content.addAfter(GABBRO_BRICK_WALL, MOSSY_GABBRO_BRICKS);
            content.addAfter(MOSSY_GABBRO_BRICKS, MOSSY_GABBRO_BRICK_STAIRS);
            content.addAfter(MOSSY_GABBRO_BRICK_STAIRS, MOSSY_GABBRO_BRICK_SLAB);
            content.addAfter(MOSSY_GABBRO_BRICK_SLAB, MOSSY_GABBRO_BRICK_WALL);
            content.addAfter(MOSSY_GABBRO_BRICK_WALL, GABBRO_BRICK_PILLAR);
            content.addAfter(GABBRO_BRICK_PILLAR, CHISELED_GABBRO_BRICKS);
            content.addAfter(CHISELED_GABBRO_BRICKS, POLISHED_GABBRO_PRESSURE_PLATE);
            content.addAfter(POLISHED_GABBRO_PRESSURE_PLATE, POLISHED_GABBRO_BUTTON);

            //PHYLLITE
            content.addAfter(POLISHED_GABBRO_BUTTON, PHYLLITE);
            content.addAfter(PHYLLITE, PHYLLITE_STAIRS);
            content.addAfter(PHYLLITE_STAIRS, PHYLLITE_SLAB);
            content.addAfter(PHYLLITE_SLAB, PHYLLITE_WALL);
            content.addAfter(PHYLLITE_WALL, POLISHED_PHYLLITE);
            content.addAfter(POLISHED_PHYLLITE, POLISHED_PHYLLITE_STAIRS);
            content.addAfter(POLISHED_PHYLLITE_STAIRS, POLISHED_PHYLLITE_SLAB);
            content.addAfter(POLISHED_PHYLLITE_SLAB, POLISHED_PHYLLITE_WALL);
            content.addAfter(POLISHED_PHYLLITE_WALL, PHYLLITE_BRICKS);
            content.addAfter(PHYLLITE_BRICKS, CRACKED_PHYLLITE_BRICKS);
            content.addAfter(CRACKED_PHYLLITE_BRICKS, PHYLLITE_BRICK_STAIRS);
            content.addAfter(PHYLLITE_BRICK_STAIRS, PHYLLITE_BRICK_SLAB);
            content.addAfter(PHYLLITE_BRICK_SLAB, PHYLLITE_BRICK_WALL);
            content.addAfter(PHYLLITE_BRICK_WALL, MOSSY_PHYLLITE_BRICKS);
            content.addAfter(MOSSY_PHYLLITE_BRICKS, MOSSY_PHYLLITE_BRICK_STAIRS);
            content.addAfter(MOSSY_PHYLLITE_BRICK_STAIRS, MOSSY_PHYLLITE_BRICK_SLAB);
            content.addAfter(MOSSY_PHYLLITE_BRICK_SLAB, MOSSY_PHYLLITE_BRICK_WALL);
            content.addAfter(MOSSY_PHYLLITE_BRICK_WALL, PHYLLITE_BRICK_PILLAR);
            content.addAfter(PHYLLITE_BRICK_PILLAR, CHISELED_PHYLLITE_BRICKS);
            content.addAfter(CHISELED_PHYLLITE_BRICKS, POLISHED_PHYLLITE_PRESSURE_PLATE);
            content.addAfter(POLISHED_PHYLLITE_PRESSURE_PLATE, POLISHED_PHYLLITE_BUTTON);

            //TUFF
            content.addAfter(TUFF_BRICKS, CRACKED_TUFF_BRICKS);

            //CALCITE
            content.addAfter(CHISELED_TUFF_BRICKS, CALCITE);
            content.addAfter(CALCITE, CALCITE_STAIRS);
            content.addAfter(CALCITE_STAIRS, CALCITE_SLAB);
            content.addAfter(CALCITE_SLAB, CALCITE_WALL);
            content.addAfter(CALCITE_WALL, POLISHED_CALCITE);
            content.addAfter(POLISHED_CALCITE, POLISHED_CALCITE_STAIRS);
            content.addAfter(POLISHED_CALCITE_STAIRS, POLISHED_CALCITE_SLAB);
            content.addAfter(POLISHED_CALCITE_SLAB, POLISHED_CALCITE_WALL);
            content.addAfter(POLISHED_CALCITE_WALL, CALCITE_BRICKS);
            content.addAfter(CALCITE_BRICKS, CRACKED_CALCITE_BRICKS);
            content.addAfter(CRACKED_CALCITE_BRICKS, CALCITE_BRICK_STAIRS);
            content.addAfter(CALCITE_BRICK_STAIRS, CALCITE_BRICK_SLAB);
            content.addAfter(CALCITE_BRICK_SLAB, CALCITE_BRICK_WALL);
            content.addAfter(CALCITE_BRICK_WALL, CHISELED_CALCITE);

            //DRIPSTONE
            content.addAfter(CHISELED_CALCITE, DRIPSTONE_BLOCK);
            content.addAfter(DRIPSTONE_BLOCK, DRIPSTONE_STAIRS);
            content.addAfter(DRIPSTONE_STAIRS, DRIPSTONE_SLAB);
            content.addAfter(DRIPSTONE_SLAB, DRIPSTONE_WALL);
            content.addAfter(DRIPSTONE_WALL, POLISHED_DRIPSTONE);
            content.addAfter(POLISHED_DRIPSTONE, POLISHED_DRIPSTONE_STAIRS);
            content.addAfter(POLISHED_DRIPSTONE_STAIRS, POLISHED_DRIPSTONE_SLAB);
            content.addAfter(POLISHED_DRIPSTONE_SLAB, POLISHED_DRIPSTONE_WALL);
            content.addAfter(POLISHED_DRIPSTONE_WALL, DRIPSTONE_BRICKS);
            content.addAfter(DRIPSTONE_BRICKS, CRACKED_DRIPSTONE_BRICKS);
            content.addAfter(CRACKED_DRIPSTONE_BRICKS, DRIPSTONE_BRICK_STAIRS);
            content.addAfter(DRIPSTONE_BRICK_STAIRS, DRIPSTONE_BRICK_SLAB);
            content.addAfter(DRIPSTONE_BRICK_SLAB, DRIPSTONE_BRICK_WALL);
            content.addAfter(DRIPSTONE_BRICK_WALL, CHISELED_DRIPSTONE);

            //BRICKS
            content.addAfter(BRICKS, CRACKED_BRICKS);

            //MUD
            content.addAfter(MUD_BRICKS, CRACKED_MUD_BRICKS);
            content.addAfter(MUD_BRICK_WALL, CHISELED_MUD_BRICKS);

            //SANDSTONE
            content.addAfter(CUT_SANDSTONE, CUT_SANDSTONE_STAIRS);
            content.addAfter(CUT_SANDSTONE_SLAB, CUT_SANDSTONE_WALL);
            content.addAfter(SMOOTH_SANDSTONE_SLAB, SMOOTH_SANDSTONE_WALL);
            content.addAfter(SMOOTH_SANDSTONE_WALL, ROUGH_SANDSTONE);
            content.addAfter(ROUGH_SANDSTONE, ROUGH_SANDSTONE_STAIRS);
            content.addAfter(ROUGH_SANDSTONE_STAIRS, ROUGH_SANDSTONE_SLAB);
            content.addAfter(ROUGH_SANDSTONE_SLAB, ROUGH_SANDSTONE_WALL);

            content.addAfter(CUT_RED_SANDSTONE, CUT_RED_SANDSTONE_STAIRS);
            content.addAfter(CUT_RED_SANDSTONE_SLAB, CUT_RED_SANDSTONE_WALL);
            content.addAfter(SMOOTH_RED_SANDSTONE_SLAB, SMOOTH_RED_SANDSTONE_WALL);
            content.addAfter(SMOOTH_RED_SANDSTONE_WALL, ROUGH_RED_SANDSTONE);
            content.addAfter(ROUGH_RED_SANDSTONE, ROUGH_RED_SANDSTONE_STAIRS);
            content.addAfter(ROUGH_RED_SANDSTONE_STAIRS, ROUGH_RED_SANDSTONE_SLAB);
            content.addAfter(ROUGH_RED_SANDSTONE_SLAB, ROUGH_RED_SANDSTONE_WALL);

            content.addAfter(CUT_RED_SANDSTONE_WALL, FROSTED_SANDSTONE);
            content.addAfter(FROSTED_SANDSTONE, FROSTED_SANDSTONE_STAIRS);
            content.addAfter(FROSTED_SANDSTONE_STAIRS, FROSTED_SANDSTONE_SLAB);
            content.addAfter(FROSTED_SANDSTONE_SLAB, FROSTED_SANDSTONE_WALL);
            content.addAfter(FROSTED_SANDSTONE_WALL, CHISELED_FROSTED_SANDSTONE);
            content.addAfter(CHISELED_FROSTED_SANDSTONE, CUT_FROSTED_SANDSTONE);
            content.addAfter(CUT_FROSTED_SANDSTONE, CUT_FROSTED_SANDSTONE_STAIRS);
            content.addAfter(CUT_FROSTED_SANDSTONE_STAIRS, CUT_FROSTED_SANDSTONE_SLAB);
            content.addAfter(CUT_FROSTED_SANDSTONE_SLAB, CUT_FROSTED_SANDSTONE_WALL);
            content.addAfter(CUT_FROSTED_SANDSTONE_WALL, SMOOTH_FROSTED_SANDSTONE);
            content.addAfter(SMOOTH_FROSTED_SANDSTONE, SMOOTH_FROSTED_SANDSTONE_STAIRS);
            content.addAfter(SMOOTH_FROSTED_SANDSTONE_STAIRS, SMOOTH_FROSTED_SANDSTONE_SLAB);
            content.addAfter(SMOOTH_FROSTED_SANDSTONE_SLAB, SMOOTH_FROSTED_SANDSTONE_WALL);
            content.addAfter(SMOOTH_FROSTED_SANDSTONE_WALL, ROUGH_FROSTED_SANDSTONE);
            content.addAfter(ROUGH_FROSTED_SANDSTONE, ROUGH_FROSTED_SANDSTONE_STAIRS);
            content.addAfter(ROUGH_FROSTED_SANDSTONE_STAIRS, ROUGH_FROSTED_SANDSTONE_SLAB);
            content.addAfter(ROUGH_FROSTED_SANDSTONE_SLAB, ROUGH_FROSTED_SANDSTONE_WALL);

            content.addAfter(ROUGH_FROSTED_SANDSTONE_WALL, CHARRED_SANDSTONE);
            content.addAfter(CHARRED_SANDSTONE, CHARRED_SANDSTONE_STAIRS);
            content.addAfter(CHARRED_SANDSTONE_STAIRS, CHARRED_SANDSTONE_SLAB);
            content.addAfter(CHARRED_SANDSTONE_SLAB, CHARRED_SANDSTONE_WALL);
            content.addAfter(CHARRED_SANDSTONE_WALL, CHISELED_CHARRED_SANDSTONE);
            content.addAfter(CHISELED_CHARRED_SANDSTONE, CUT_CHARRED_SANDSTONE);
            content.addAfter(CUT_CHARRED_SANDSTONE, CUT_CHARRED_SANDSTONE_STAIRS);
            content.addAfter(CUT_CHARRED_SANDSTONE_STAIRS, CUT_CHARRED_SANDSTONE_SLAB);
            content.addAfter(CUT_CHARRED_SANDSTONE_SLAB, CUT_CHARRED_SANDSTONE_WALL);
            content.addAfter(CUT_CHARRED_SANDSTONE_WALL, SMOOTH_CHARRED_SANDSTONE);
            content.addAfter(SMOOTH_CHARRED_SANDSTONE, SMOOTH_CHARRED_SANDSTONE_STAIRS);
            content.addAfter(SMOOTH_CHARRED_SANDSTONE_STAIRS, SMOOTH_CHARRED_SANDSTONE_SLAB);
            content.addAfter(SMOOTH_CHARRED_SANDSTONE_SLAB, SMOOTH_CHARRED_SANDSTONE_WALL);
            content.addAfter(SMOOTH_CHARRED_SANDSTONE_WALL, ROUGH_CHARRED_SANDSTONE);
            content.addAfter(ROUGH_CHARRED_SANDSTONE, ROUGH_CHARRED_SANDSTONE_STAIRS);
            content.addAfter(ROUGH_CHARRED_SANDSTONE_STAIRS, ROUGH_CHARRED_SANDSTONE_SLAB);
            content.addAfter(ROUGH_CHARRED_SANDSTONE_SLAB, ROUGH_CHARRED_SANDSTONE_WALL);


            //PRISMARINE
            content.addAfter(PRISMARINE_BRICKS, CRACKED_PRISMARINE_BRICKS);
            content.addAfter(PRISMARINE_BRICK_SLAB, PRISMARINE_BRICK_WALL);
            content.addAfter(PRISMARINE_BRICK_WALL, CHISELED_PRISMARINE_BRICKS);
            content.addAfter(DARK_PRISMARINE_SLAB, DARK_PRISMARINE_WALL);

            //NETHER_BRICK
            content.addAfter(RED_NETHER_BRICKS, CRACKED_RED_NETHER_BRICKS);
            content.addAfter(RED_NETHER_BRICK_WALL, RED_NETHER_BRICK_FENCE);
            content.addAfter(RED_NETHER_BRICK_FENCE, CHISELED_RED_NETHER_BRICKS);
            content.addAfter(CHISELED_RED_NETHER_BRICKS, BLUE_NETHER_BRICKS);
            content.addAfter(BLUE_NETHER_BRICKS, CRACKED_BLUE_NETHER_BRICKS);
            content.addAfter(CRACKED_BLUE_NETHER_BRICKS, BLUE_NETHER_BRICK_STAIRS);
            content.addAfter(BLUE_NETHER_BRICK_STAIRS, BLUE_NETHER_BRICK_SLAB);
            content.addAfter(BLUE_NETHER_BRICK_SLAB, BLUE_NETHER_BRICK_WALL);
            content.addAfter(BLUE_NETHER_BRICK_WALL, BLUE_NETHER_BRICK_FENCE);
            content.addAfter(BLUE_NETHER_BRICK_FENCE, CHISELED_BLUE_NETHER_BRICKS);

            //QUARTZ
            content.addAfter(QUARTZ_SLAB, QUARTZ_WALL);
            content.addAfter(SMOOTH_QUARTZ_SLAB, SMOOTH_QUARTZ_WALL);
            content.addAfter(QUARTZ_BRICKS, CRACKED_QUARTZ_BRICKS);
            content.addAfter(CRACKED_QUARTZ_BRICKS, QUARTZ_BRICK_STAIRS);
            content.addAfter(QUARTZ_BRICK_STAIRS, QUARTZ_BRICK_SLAB);
            content.addAfter(QUARTZ_BRICK_SLAB, QUARTZ_BRICK_WALL);

            //AMETHYST
            content.addAfter(AMETHYST_BLOCK, AMETHYST_STAIRS);
            content.addAfter(AMETHYST_STAIRS, AMETHYST_SLAB);
            content.addAfter(AMETHYST_SLAB, AMETHYST_WALL);
            content.addAfter(AMETHYST_WALL, AMETHYST_BRICKS);
            content.addAfter(AMETHYST_BRICKS, CRACKED_AMETHYST_BRICKS);
            content.addAfter(CRACKED_AMETHYST_BRICKS, AMETHYST_BRICK_STAIRS);
            content.addAfter(AMETHYST_BRICK_STAIRS, AMETHYST_BRICK_SLAB);
            content.addAfter(AMETHYST_BRICK_SLAB, AMETHYST_BRICK_WALL);
            content.addAfter(AMETHYST_BRICK_WALL, AMETHYST_TILES);
            content.addAfter(AMETHYST_TILES, CRACKED_AMETHYST_TILES);
            content.addAfter(CRACKED_AMETHYST_TILES, AMETHYST_TILE_STAIRS);
            content.addAfter(AMETHYST_TILE_STAIRS, AMETHYST_TILE_SLAB);
            content.addAfter(AMETHYST_TILE_SLAB, AMETHYST_TILE_WALL);
            content.addAfter(AMETHYST_TILE_WALL, CHISELED_AMETHYST);

            //DOLOMITE
            content.addAfter(CHISELED_AMETHYST, DOLOMITE);
            content.addAfter(DOLOMITE, DOLOMITE_STAIRS);
            content.addAfter(DOLOMITE_STAIRS, DOLOMITE_SLAB);
            content.addAfter(DOLOMITE_SLAB, DOLOMITE_WALL);
            content.addAfter(DOLOMITE_WALL, DOLOMITE_BRICKS);
            content.addAfter(DOLOMITE_BRICKS, CRACKED_DOLOMITE_BRICKS);
            content.addAfter(CRACKED_DOLOMITE_BRICKS, DOLOMITE_BRICK_STAIRS);
            content.addAfter(DOLOMITE_BRICK_STAIRS, DOLOMITE_BRICK_SLAB);
            content.addAfter(DOLOMITE_BRICK_SLAB, DOLOMITE_BRICK_WALL);
            content.addAfter(DOLOMITE_BRICK_WALL, DOLOMITE_TILES);
            content.addAfter(DOLOMITE_TILES, CRACKED_DOLOMITE_TILES);
            content.addAfter(CRACKED_DOLOMITE_TILES, DOLOMITE_TILE_STAIRS);
            content.addAfter(DOLOMITE_TILE_STAIRS, DOLOMITE_TILE_SLAB);
            content.addAfter(DOLOMITE_TILE_SLAB, DOLOMITE_TILE_WALL);
            content.addAfter(DOLOMITE_TILE_WALL, CHISELED_DOLOMITE);

            //GYPSUM
            content.addAfter(CHISELED_DOLOMITE, GYPSUM);
            content.addAfter(GYPSUM, GYPSUM_STAIRS);
            content.addAfter(GYPSUM_STAIRS, GYPSUM_SLAB);
            content.addAfter(GYPSUM_SLAB, GYPSUM_WALL);
            content.addAfter(GYPSUM_WALL, GYPSUM_BRICKS);
            content.addAfter(GYPSUM_BRICKS, CRACKED_GYPSUM_BRICKS);
            content.addAfter(CRACKED_GYPSUM_BRICKS, GYPSUM_BRICK_STAIRS);
            content.addAfter(GYPSUM_BRICK_STAIRS, GYPSUM_BRICK_SLAB);
            content.addAfter(GYPSUM_BRICK_SLAB, GYPSUM_BRICK_WALL);
            content.addAfter(GYPSUM_BRICK_WALL, GYPSUM_TILES);
            content.addAfter(GYPSUM_TILES, CRACKED_GYPSUM_TILES);
            content.addAfter(CRACKED_GYPSUM_TILES, GYPSUM_TILE_STAIRS);
            content.addAfter(GYPSUM_TILE_STAIRS, GYPSUM_TILE_SLAB);
            content.addAfter(GYPSUM_TILE_SLAB, GYPSUM_TILE_WALL);
            content.addAfter(GYPSUM_TILE_WALL, CHISELED_GYPSUM);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {

            //CONCRETE
            content.addAfter(WHITE_CONCRETE, WHITE_CONCRETE_STAIRS);
            content.addAfter(WHITE_CONCRETE_STAIRS, WHITE_CONCRETE_SLAB);
            content.addAfter(WHITE_CONCRETE_SLAB, WHITE_CONCRETE_WALL);

            content.addAfter(LIGHT_GRAY_CONCRETE, LIGHT_GRAY_CONCRETE_STAIRS);
            content.addAfter(LIGHT_GRAY_CONCRETE_STAIRS, LIGHT_GRAY_CONCRETE_SLAB);
            content.addAfter(LIGHT_GRAY_CONCRETE_SLAB, LIGHT_GRAY_CONCRETE_WALL);

            content.addAfter(GRAY_CONCRETE, GRAY_CONCRETE_STAIRS);
            content.addAfter(GRAY_CONCRETE_STAIRS, GRAY_CONCRETE_SLAB);
            content.addAfter(GRAY_CONCRETE_SLAB, GRAY_CONCRETE_WALL);

            content.addAfter(BLACK_CONCRETE, BLACK_CONCRETE_STAIRS);
            content.addAfter(BLACK_CONCRETE_STAIRS, BLACK_CONCRETE_SLAB);
            content.addAfter(BLACK_CONCRETE_SLAB, BLACK_CONCRETE_WALL);

            content.addAfter(BROWN_CONCRETE, BROWN_CONCRETE_STAIRS);
            content.addAfter(BROWN_CONCRETE_STAIRS, BROWN_CONCRETE_SLAB);
            content.addAfter(BROWN_CONCRETE_SLAB, BROWN_CONCRETE_WALL);

            content.addAfter(RED_CONCRETE, RED_CONCRETE_STAIRS);
            content.addAfter(RED_CONCRETE_STAIRS, RED_CONCRETE_SLAB);
            content.addAfter(RED_CONCRETE_SLAB, RED_CONCRETE_WALL);

            content.addAfter(ORANGE_CONCRETE, ORANGE_CONCRETE_STAIRS);
            content.addAfter(ORANGE_CONCRETE_STAIRS, ORANGE_CONCRETE_SLAB);
            content.addAfter(ORANGE_CONCRETE_SLAB, ORANGE_CONCRETE_WALL);

            content.addAfter(YELLOW_CONCRETE, YELLOW_CONCRETE_STAIRS);
            content.addAfter(YELLOW_CONCRETE_STAIRS, YELLOW_CONCRETE_SLAB);
            content.addAfter(YELLOW_CONCRETE_SLAB, YELLOW_CONCRETE_WALL);

            content.addAfter(LIME_CONCRETE, LIME_CONCRETE_STAIRS);
            content.addAfter(LIME_CONCRETE_STAIRS, LIME_CONCRETE_SLAB);
            content.addAfter(LIME_CONCRETE_SLAB, LIME_CONCRETE_WALL);

            content.addAfter(GREEN_CONCRETE, GREEN_CONCRETE_STAIRS);
            content.addAfter(GREEN_CONCRETE_STAIRS, GREEN_CONCRETE_SLAB);
            content.addAfter(GREEN_CONCRETE_SLAB, GREEN_CONCRETE_WALL);

            content.addAfter(CYAN_CONCRETE, CYAN_CONCRETE_STAIRS);
            content.addAfter(CYAN_CONCRETE_STAIRS, CYAN_CONCRETE_SLAB);
            content.addAfter(CYAN_CONCRETE_SLAB, CYAN_CONCRETE_WALL);

            content.addAfter(LIGHT_BLUE_CONCRETE, LIGHT_BLUE_CONCRETE_STAIRS);
            content.addAfter(LIGHT_BLUE_CONCRETE_STAIRS, LIGHT_BLUE_CONCRETE_SLAB);
            content.addAfter(LIGHT_BLUE_CONCRETE_SLAB, LIGHT_BLUE_CONCRETE_WALL);

            content.addAfter(BLUE_CONCRETE, BLUE_CONCRETE_STAIRS);
            content.addAfter(BLUE_CONCRETE_STAIRS, BLUE_CONCRETE_SLAB);
            content.addAfter(BLUE_CONCRETE_SLAB, BLUE_CONCRETE_WALL);

            content.addAfter(PURPLE_CONCRETE, PURPLE_CONCRETE_STAIRS);
            content.addAfter(PURPLE_CONCRETE_STAIRS, PURPLE_CONCRETE_SLAB);
            content.addAfter(PURPLE_CONCRETE_SLAB, PURPLE_CONCRETE_WALL);

            content.addAfter(MAGENTA_CONCRETE, MAGENTA_CONCRETE_STAIRS);
            content.addAfter(MAGENTA_CONCRETE_STAIRS, MAGENTA_CONCRETE_SLAB);
            content.addAfter(MAGENTA_CONCRETE_SLAB, MAGENTA_CONCRETE_WALL);

            content.addAfter(PINK_CONCRETE, PINK_CONCRETE_STAIRS);
            content.addAfter(PINK_CONCRETE_STAIRS, PINK_CONCRETE_SLAB);
            content.addAfter(PINK_CONCRETE_SLAB, PINK_CONCRETE_WALL);


            //TERRACOTTA
            content.addAfter(TERRACOTTA, TERRACOTTA_STAIRS);
            content.addAfter(TERRACOTTA_STAIRS, TERRACOTTA_SLAB);
            content.addAfter(TERRACOTTA_SLAB, TERRACOTTA_WALL);
            content.addAfter(TERRACOTTA_WALL, TERRACOTTA_BRICKS);
            content.addAfter(TERRACOTTA_BRICKS, TERRACOTTA_BRICK_STAIRS);
            content.addAfter(TERRACOTTA_BRICK_STAIRS, TERRACOTTA_BRICK_SLAB);
            content.addAfter(TERRACOTTA_BRICK_SLAB, TERRACOTTA_BRICK_WALL);

            content.addAfter(WHITE_TERRACOTTA, WHITE_TERRACOTTA_STAIRS);
            content.addAfter(WHITE_TERRACOTTA_STAIRS, WHITE_TERRACOTTA_SLAB);
            content.addAfter(WHITE_TERRACOTTA_SLAB, WHITE_TERRACOTTA_WALL);
            content.addAfter(WHITE_TERRACOTTA_WALL, WHITE_TERRACOTTA_BRICKS);
            content.addAfter(WHITE_TERRACOTTA_BRICKS, WHITE_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(WHITE_TERRACOTTA_BRICK_STAIRS, WHITE_TERRACOTTA_BRICK_SLAB);
            content.addAfter(WHITE_TERRACOTTA_BRICK_SLAB, WHITE_TERRACOTTA_BRICK_WALL);

            content.addAfter(LIGHT_GRAY_TERRACOTTA, LIGHT_GRAY_TERRACOTTA_STAIRS);
            content.addAfter(LIGHT_GRAY_TERRACOTTA_STAIRS, LIGHT_GRAY_TERRACOTTA_SLAB);
            content.addAfter(LIGHT_GRAY_TERRACOTTA_SLAB, LIGHT_GRAY_TERRACOTTA_WALL);
            content.addAfter(LIGHT_GRAY_TERRACOTTA_WALL, LIGHT_GRAY_TERRACOTTA_BRICKS);
            content.addAfter(LIGHT_GRAY_TERRACOTTA_BRICKS, LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
            content.addAfter(LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, LIGHT_GRAY_TERRACOTTA_BRICK_WALL);

            content.addAfter(GRAY_TERRACOTTA, GRAY_TERRACOTTA_STAIRS);
            content.addAfter(GRAY_TERRACOTTA_STAIRS, GRAY_TERRACOTTA_SLAB);
            content.addAfter(GRAY_TERRACOTTA_SLAB, GRAY_TERRACOTTA_WALL);
            content.addAfter(GRAY_TERRACOTTA_WALL, GRAY_TERRACOTTA_BRICKS);
            content.addAfter(GRAY_TERRACOTTA_BRICKS, GRAY_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(GRAY_TERRACOTTA_BRICK_STAIRS, GRAY_TERRACOTTA_BRICK_SLAB);
            content.addAfter(GRAY_TERRACOTTA_BRICK_SLAB, GRAY_TERRACOTTA_BRICK_WALL);

            content.addAfter(BLACK_TERRACOTTA, BLACK_TERRACOTTA_STAIRS);
            content.addAfter(BLACK_TERRACOTTA_STAIRS, BLACK_TERRACOTTA_SLAB);
            content.addAfter(BLACK_TERRACOTTA_SLAB, BLACK_TERRACOTTA_WALL);
            content.addAfter(BLACK_TERRACOTTA_WALL, BLACK_TERRACOTTA_BRICKS);
            content.addAfter(BLACK_TERRACOTTA_BRICKS, BLACK_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(BLACK_TERRACOTTA_BRICK_STAIRS, BLACK_TERRACOTTA_BRICK_SLAB);
            content.addAfter(BLACK_TERRACOTTA_BRICK_SLAB, BLACK_TERRACOTTA_BRICK_WALL);

            content.addAfter(BROWN_TERRACOTTA, BROWN_TERRACOTTA_STAIRS);
            content.addAfter(BROWN_TERRACOTTA_STAIRS, BROWN_TERRACOTTA_SLAB);
            content.addAfter(BROWN_TERRACOTTA_SLAB, BROWN_TERRACOTTA_WALL);
            content.addAfter(BROWN_TERRACOTTA_WALL, BROWN_TERRACOTTA_BRICKS);
            content.addAfter(BROWN_TERRACOTTA_BRICKS, BROWN_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(BROWN_TERRACOTTA_BRICK_STAIRS, BROWN_TERRACOTTA_BRICK_SLAB);
            content.addAfter(BROWN_TERRACOTTA_BRICK_SLAB, BROWN_TERRACOTTA_BRICK_WALL);

            content.addAfter(RED_TERRACOTTA, RED_TERRACOTTA_STAIRS);
            content.addAfter(RED_TERRACOTTA_STAIRS, RED_TERRACOTTA_SLAB);
            content.addAfter(RED_TERRACOTTA_SLAB, RED_TERRACOTTA_WALL);
            content.addAfter(RED_TERRACOTTA_WALL, RED_TERRACOTTA_BRICKS);
            content.addAfter(RED_TERRACOTTA_BRICKS, RED_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(RED_TERRACOTTA_BRICK_STAIRS, RED_TERRACOTTA_BRICK_SLAB);
            content.addAfter(RED_TERRACOTTA_BRICK_SLAB, RED_TERRACOTTA_BRICK_WALL);

            content.addAfter(ORANGE_TERRACOTTA, ORANGE_TERRACOTTA_STAIRS);
            content.addAfter(ORANGE_TERRACOTTA_STAIRS, ORANGE_TERRACOTTA_SLAB);
            content.addAfter(ORANGE_TERRACOTTA_SLAB, ORANGE_TERRACOTTA_WALL);
            content.addAfter(ORANGE_TERRACOTTA_WALL, ORANGE_TERRACOTTA_BRICKS);
            content.addAfter(ORANGE_TERRACOTTA_BRICKS, ORANGE_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(ORANGE_TERRACOTTA_BRICK_STAIRS, ORANGE_TERRACOTTA_BRICK_SLAB);
            content.addAfter(ORANGE_TERRACOTTA_BRICK_SLAB, ORANGE_TERRACOTTA_BRICK_WALL);

            content.addAfter(YELLOW_TERRACOTTA, YELLOW_TERRACOTTA_STAIRS);
            content.addAfter(YELLOW_TERRACOTTA_STAIRS, YELLOW_TERRACOTTA_SLAB);
            content.addAfter(YELLOW_TERRACOTTA_SLAB, YELLOW_TERRACOTTA_WALL);
            content.addAfter(YELLOW_TERRACOTTA_WALL, YELLOW_TERRACOTTA_BRICKS);
            content.addAfter(YELLOW_TERRACOTTA_BRICKS, YELLOW_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(YELLOW_TERRACOTTA_BRICK_STAIRS, YELLOW_TERRACOTTA_BRICK_SLAB);
            content.addAfter(YELLOW_TERRACOTTA_BRICK_SLAB, YELLOW_TERRACOTTA_BRICK_WALL);

            content.addAfter(LIME_TERRACOTTA, LIME_TERRACOTTA_STAIRS);
            content.addAfter(LIME_TERRACOTTA_STAIRS, LIME_TERRACOTTA_SLAB);
            content.addAfter(LIME_TERRACOTTA_SLAB, LIME_TERRACOTTA_WALL);
            content.addAfter(LIME_TERRACOTTA_WALL, LIME_TERRACOTTA_BRICKS);
            content.addAfter(LIME_TERRACOTTA_BRICKS, LIME_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(LIME_TERRACOTTA_BRICK_STAIRS, LIME_TERRACOTTA_BRICK_SLAB);
            content.addAfter(LIME_TERRACOTTA_BRICK_SLAB, LIME_TERRACOTTA_BRICK_WALL);

            content.addAfter(GREEN_TERRACOTTA, GREEN_TERRACOTTA_STAIRS);
            content.addAfter(GREEN_TERRACOTTA_STAIRS, GREEN_TERRACOTTA_SLAB);
            content.addAfter(GREEN_TERRACOTTA_SLAB, GREEN_TERRACOTTA_WALL);
            content.addAfter(GREEN_TERRACOTTA_WALL, GREEN_TERRACOTTA_BRICKS);
            content.addAfter(GREEN_TERRACOTTA_BRICKS, GREEN_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(GREEN_TERRACOTTA_BRICK_STAIRS, GREEN_TERRACOTTA_BRICK_SLAB);
            content.addAfter(GREEN_TERRACOTTA_BRICK_SLAB, GREEN_TERRACOTTA_BRICK_WALL);

            content.addAfter(CYAN_TERRACOTTA, CYAN_TERRACOTTA_STAIRS);
            content.addAfter(CYAN_TERRACOTTA_STAIRS, CYAN_TERRACOTTA_SLAB);
            content.addAfter(CYAN_TERRACOTTA_SLAB, CYAN_TERRACOTTA_WALL);
            content.addAfter(CYAN_TERRACOTTA_WALL, CYAN_TERRACOTTA_BRICKS);
            content.addAfter(CYAN_TERRACOTTA_BRICKS, CYAN_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(CYAN_TERRACOTTA_BRICK_STAIRS, CYAN_TERRACOTTA_BRICK_SLAB);
            content.addAfter(CYAN_TERRACOTTA_BRICK_SLAB, CYAN_TERRACOTTA_BRICK_WALL);

            content.addAfter(LIGHT_BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA_STAIRS);
            content.addAfter(LIGHT_BLUE_TERRACOTTA_STAIRS, LIGHT_BLUE_TERRACOTTA_SLAB);
            content.addAfter(LIGHT_BLUE_TERRACOTTA_SLAB, LIGHT_BLUE_TERRACOTTA_WALL);
            content.addAfter(LIGHT_BLUE_TERRACOTTA_WALL, LIGHT_BLUE_TERRACOTTA_BRICKS);
            content.addAfter(LIGHT_BLUE_TERRACOTTA_BRICKS, LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
            content.addAfter(LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, LIGHT_BLUE_TERRACOTTA_BRICK_WALL);

            content.addAfter(BLUE_TERRACOTTA, BLUE_TERRACOTTA_STAIRS);
            content.addAfter(BLUE_TERRACOTTA_STAIRS, BLUE_TERRACOTTA_SLAB);
            content.addAfter(BLUE_TERRACOTTA_SLAB, BLUE_TERRACOTTA_WALL);
            content.addAfter(BLUE_TERRACOTTA_WALL, BLUE_TERRACOTTA_BRICKS);
            content.addAfter(BLUE_TERRACOTTA_BRICKS, BLUE_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(BLUE_TERRACOTTA_BRICK_STAIRS, BLUE_TERRACOTTA_BRICK_SLAB);
            content.addAfter(BLUE_TERRACOTTA_BRICK_SLAB, BLUE_TERRACOTTA_BRICK_WALL);

            content.addAfter(PURPLE_TERRACOTTA, PURPLE_TERRACOTTA_STAIRS);
            content.addAfter(PURPLE_TERRACOTTA_STAIRS, PURPLE_TERRACOTTA_SLAB);
            content.addAfter(PURPLE_TERRACOTTA_SLAB, PURPLE_TERRACOTTA_WALL);
            content.addAfter(PURPLE_TERRACOTTA_WALL, PURPLE_TERRACOTTA_BRICKS);
            content.addAfter(PURPLE_TERRACOTTA_BRICKS, PURPLE_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(PURPLE_TERRACOTTA_BRICK_STAIRS, PURPLE_TERRACOTTA_BRICK_SLAB);
            content.addAfter(PURPLE_TERRACOTTA_BRICK_SLAB, PURPLE_TERRACOTTA_BRICK_WALL);

            content.addAfter(MAGENTA_TERRACOTTA, MAGENTA_TERRACOTTA_STAIRS);
            content.addAfter(MAGENTA_TERRACOTTA_STAIRS, MAGENTA_TERRACOTTA_SLAB);
            content.addAfter(MAGENTA_TERRACOTTA_SLAB, MAGENTA_TERRACOTTA_WALL);
            content.addAfter(MAGENTA_TERRACOTTA_WALL, MAGENTA_TERRACOTTA_BRICKS);
            content.addAfter(MAGENTA_TERRACOTTA_BRICKS, MAGENTA_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(MAGENTA_TERRACOTTA_BRICK_STAIRS, MAGENTA_TERRACOTTA_BRICK_SLAB);
            content.addAfter(MAGENTA_TERRACOTTA_BRICK_SLAB, MAGENTA_TERRACOTTA_BRICK_WALL);

            content.addAfter(PINK_TERRACOTTA, PINK_TERRACOTTA_STAIRS);
            content.addAfter(PINK_TERRACOTTA_STAIRS, PINK_TERRACOTTA_SLAB);
            content.addAfter(PINK_TERRACOTTA_SLAB, PINK_TERRACOTTA_WALL);
            content.addAfter(PINK_TERRACOTTA_WALL, PINK_TERRACOTTA_BRICKS);
            content.addAfter(PINK_TERRACOTTA_BRICKS, PINK_TERRACOTTA_BRICK_STAIRS);
            content.addAfter(PINK_TERRACOTTA_BRICK_STAIRS, PINK_TERRACOTTA_BRICK_SLAB);
            content.addAfter(PINK_TERRACOTTA_BRICK_SLAB, PINK_TERRACOTTA_BRICK_WALL);

            //CHALK
            content.addAfter(PINK_GLAZED_TERRACOTTA, CHALK);
            content.addAfter(CHALK, CHALK_STAIRS);
            content.addAfter(CHALK_STAIRS, CHALK_SLAB);
            content.addAfter(CHALK_SLAB, CHALK_WALL);
            content.addAfter(CHALK_WALL, CHALK_BRICKS);
            content.addAfter(CHALK_BRICKS, CHALK_BRICK_STAIRS);
            content.addAfter(CHALK_BRICK_STAIRS, CHALK_BRICK_SLAB);
            content.addAfter(CHALK_BRICK_SLAB, CHALK_BRICK_WALL);

            content.addAfter(CHALK_BRICK_WALL, WHITE_CHALK);
            content.addAfter(WHITE_CHALK, WHITE_CHALK_STAIRS);
            content.addAfter(WHITE_CHALK_STAIRS, WHITE_CHALK_SLAB);
            content.addAfter(WHITE_CHALK_SLAB, WHITE_CHALK_WALL);
            content.addAfter(WHITE_CHALK_WALL, WHITE_CHALK_BRICKS);
            content.addAfter(WHITE_CHALK_BRICKS, WHITE_CHALK_BRICK_STAIRS);
            content.addAfter(WHITE_CHALK_BRICK_STAIRS, WHITE_CHALK_BRICK_SLAB);
            content.addAfter(WHITE_CHALK_BRICK_SLAB, WHITE_CHALK_BRICK_WALL);

            content.addAfter(WHITE_CHALK_BRICK_WALL, LIGHT_GRAY_CHALK);
            content.addAfter(LIGHT_GRAY_CHALK, LIGHT_GRAY_CHALK_STAIRS);
            content.addAfter(LIGHT_GRAY_CHALK_STAIRS, LIGHT_GRAY_CHALK_SLAB);
            content.addAfter(LIGHT_GRAY_CHALK_SLAB, LIGHT_GRAY_CHALK_WALL);
            content.addAfter(LIGHT_GRAY_CHALK_WALL, LIGHT_GRAY_CHALK_BRICKS);
            content.addAfter(LIGHT_GRAY_CHALK_BRICKS, LIGHT_GRAY_CHALK_BRICK_STAIRS);
            content.addAfter(LIGHT_GRAY_CHALK_BRICK_STAIRS, LIGHT_GRAY_CHALK_BRICK_SLAB);
            content.addAfter(LIGHT_GRAY_CHALK_BRICK_SLAB, LIGHT_GRAY_CHALK_BRICK_WALL);

            content.addAfter(LIGHT_GRAY_CHALK_BRICK_WALL, GRAY_CHALK);
            content.addAfter(GRAY_CHALK, GRAY_CHALK_STAIRS);
            content.addAfter(GRAY_CHALK_STAIRS, GRAY_CHALK_SLAB);
            content.addAfter(GRAY_CHALK_SLAB, GRAY_CHALK_WALL);
            content.addAfter(GRAY_CHALK_WALL, GRAY_CHALK_BRICKS);
            content.addAfter(GRAY_CHALK_BRICKS, GRAY_CHALK_BRICK_STAIRS);
            content.addAfter(GRAY_CHALK_BRICK_STAIRS, GRAY_CHALK_BRICK_SLAB);
            content.addAfter(GRAY_CHALK_BRICK_SLAB, GRAY_CHALK_BRICK_WALL);

            content.addAfter(GRAY_CHALK_BRICK_WALL, BLACK_CHALK);
            content.addAfter(BLACK_CHALK, BLACK_CHALK_STAIRS);
            content.addAfter(BLACK_CHALK_STAIRS, BLACK_CHALK_SLAB);
            content.addAfter(BLACK_CHALK_SLAB, BLACK_CHALK_WALL);
            content.addAfter(BLACK_CHALK_WALL, BLACK_CHALK_BRICKS);
            content.addAfter(BLACK_CHALK_BRICKS, BLACK_CHALK_BRICK_STAIRS);
            content.addAfter(BLACK_CHALK_BRICK_STAIRS, BLACK_CHALK_BRICK_SLAB);
            content.addAfter(BLACK_CHALK_BRICK_SLAB, BLACK_CHALK_BRICK_WALL);

            content.addAfter(BLACK_CHALK_BRICK_WALL, BROWN_CHALK);
            content.addAfter(BROWN_CHALK, BROWN_CHALK_STAIRS);
            content.addAfter(BROWN_CHALK_STAIRS, BROWN_CHALK_SLAB);
            content.addAfter(BROWN_CHALK_SLAB, BROWN_CHALK_WALL);
            content.addAfter(BROWN_CHALK_WALL, BROWN_CHALK_BRICKS);
            content.addAfter(BROWN_CHALK_BRICKS, BROWN_CHALK_BRICK_STAIRS);
            content.addAfter(BROWN_CHALK_BRICK_STAIRS, BROWN_CHALK_BRICK_SLAB);
            content.addAfter(BROWN_CHALK_BRICK_SLAB, BROWN_CHALK_BRICK_WALL);

            content.addAfter(BROWN_CHALK_BRICK_WALL, RED_CHALK);
            content.addAfter(RED_CHALK, RED_CHALK_STAIRS);
            content.addAfter(RED_CHALK_STAIRS, RED_CHALK_SLAB);
            content.addAfter(RED_CHALK_SLAB, RED_CHALK_WALL);
            content.addAfter(RED_CHALK_WALL, RED_CHALK_BRICKS);
            content.addAfter(RED_CHALK_BRICKS, RED_CHALK_BRICK_STAIRS);
            content.addAfter(RED_CHALK_BRICK_STAIRS, RED_CHALK_BRICK_SLAB);
            content.addAfter(RED_CHALK_BRICK_SLAB, RED_CHALK_BRICK_WALL);

            content.addAfter(RED_CHALK_BRICK_WALL, ORANGE_CHALK);
            content.addAfter(ORANGE_CHALK, ORANGE_CHALK_STAIRS);
            content.addAfter(ORANGE_CHALK_STAIRS, ORANGE_CHALK_SLAB);
            content.addAfter(ORANGE_CHALK_SLAB, ORANGE_CHALK_WALL);
            content.addAfter(ORANGE_CHALK_WALL, ORANGE_CHALK_BRICKS);
            content.addAfter(ORANGE_CHALK_BRICKS, ORANGE_CHALK_BRICK_STAIRS);
            content.addAfter(ORANGE_CHALK_BRICK_STAIRS, ORANGE_CHALK_BRICK_SLAB);
            content.addAfter(ORANGE_CHALK_BRICK_SLAB, ORANGE_CHALK_BRICK_WALL);

            content.addAfter(ORANGE_CHALK_BRICK_WALL, YELLOW_CHALK);
            content.addAfter(YELLOW_CHALK, YELLOW_CHALK_STAIRS);
            content.addAfter(YELLOW_CHALK_STAIRS, YELLOW_CHALK_SLAB);
            content.addAfter(YELLOW_CHALK_SLAB, YELLOW_CHALK_WALL);
            content.addAfter(YELLOW_CHALK_WALL, YELLOW_CHALK_BRICKS);
            content.addAfter(YELLOW_CHALK_BRICKS, YELLOW_CHALK_BRICK_STAIRS);
            content.addAfter(YELLOW_CHALK_BRICK_STAIRS, YELLOW_CHALK_BRICK_SLAB);
            content.addAfter(YELLOW_CHALK_BRICK_SLAB, YELLOW_CHALK_BRICK_WALL);

            content.addAfter(YELLOW_CHALK_BRICK_WALL, LIME_CHALK);
            content.addAfter(LIME_CHALK, LIME_CHALK_STAIRS);
            content.addAfter(LIME_CHALK_STAIRS, LIME_CHALK_SLAB);
            content.addAfter(LIME_CHALK_SLAB, LIME_CHALK_WALL);
            content.addAfter(LIME_CHALK_WALL, LIME_CHALK_BRICKS);
            content.addAfter(LIME_CHALK_BRICKS, LIME_CHALK_BRICK_STAIRS);
            content.addAfter(LIME_CHALK_BRICK_STAIRS, LIME_CHALK_BRICK_SLAB);
            content.addAfter(LIME_CHALK_BRICK_SLAB, LIME_CHALK_BRICK_WALL);

            content.addAfter(LIME_CHALK_BRICK_WALL, GRAY_CHALK);
            content.addAfter(GREEN_CHALK, GREEN_CHALK_STAIRS);
            content.addAfter(GREEN_CHALK_STAIRS, GREEN_CHALK_SLAB);
            content.addAfter(GREEN_CHALK_SLAB, GREEN_CHALK_WALL);
            content.addAfter(GREEN_CHALK_WALL, GREEN_CHALK_BRICKS);
            content.addAfter(GREEN_CHALK_BRICKS, GREEN_CHALK_BRICK_STAIRS);
            content.addAfter(GREEN_CHALK_BRICK_STAIRS, GREEN_CHALK_BRICK_SLAB);
            content.addAfter(GREEN_CHALK_BRICK_SLAB, GREEN_CHALK_BRICK_WALL);

            content.addAfter(GREEN_CHALK_BRICK_WALL, CYAN_CHALK);
            content.addAfter(CYAN_CHALK, CYAN_CHALK_STAIRS);
            content.addAfter(CYAN_CHALK_STAIRS, CYAN_CHALK_SLAB);
            content.addAfter(CYAN_CHALK_SLAB, CYAN_CHALK_WALL);
            content.addAfter(CYAN_CHALK_WALL, CYAN_CHALK_BRICKS);
            content.addAfter(CYAN_CHALK_BRICKS, CYAN_CHALK_BRICK_STAIRS);
            content.addAfter(CYAN_CHALK_BRICK_STAIRS, CYAN_CHALK_BRICK_SLAB);
            content.addAfter(CYAN_CHALK_BRICK_SLAB, CYAN_CHALK_BRICK_WALL);

            content.addAfter(CYAN_CHALK_BRICK_WALL, LIGHT_BLUE_CHALK);
            content.addAfter(LIGHT_BLUE_CHALK, LIGHT_BLUE_CHALK_STAIRS);
            content.addAfter(LIGHT_BLUE_CHALK_STAIRS, LIGHT_BLUE_CHALK_SLAB);
            content.addAfter(LIGHT_BLUE_CHALK_SLAB, LIGHT_BLUE_CHALK_WALL);
            content.addAfter(LIGHT_BLUE_CHALK_WALL, LIGHT_BLUE_CHALK_BRICKS);
            content.addAfter(LIGHT_BLUE_CHALK_BRICKS, LIGHT_BLUE_CHALK_BRICK_STAIRS);
            content.addAfter(LIGHT_BLUE_CHALK_BRICK_STAIRS, LIGHT_BLUE_CHALK_BRICK_SLAB);
            content.addAfter(LIGHT_BLUE_CHALK_BRICK_SLAB, LIGHT_BLUE_CHALK_BRICK_WALL);

            content.addAfter(LIGHT_BLUE_CHALK_BRICK_WALL, BLUE_CHALK);
            content.addAfter(BLUE_CHALK, BLUE_CHALK_STAIRS);
            content.addAfter(BLUE_CHALK_STAIRS, BLUE_CHALK_SLAB);
            content.addAfter(BLUE_CHALK_SLAB, BLUE_CHALK_WALL);
            content.addAfter(BLUE_CHALK_WALL, BLUE_CHALK_BRICKS);
            content.addAfter(BLUE_CHALK_BRICKS, BLUE_CHALK_BRICK_STAIRS);
            content.addAfter(BLUE_CHALK_BRICK_STAIRS, BLUE_CHALK_BRICK_SLAB);
            content.addAfter(BLUE_CHALK_BRICK_SLAB, BLUE_CHALK_BRICK_WALL);

            content.addAfter(BLUE_CHALK_BRICK_WALL, PURPLE_CHALK);
            content.addAfter(PURPLE_CHALK, PURPLE_CHALK_STAIRS);
            content.addAfter(PURPLE_CHALK_STAIRS, PURPLE_CHALK_SLAB);
            content.addAfter(PURPLE_CHALK_SLAB, PURPLE_CHALK_WALL);
            content.addAfter(PURPLE_CHALK_WALL, PURPLE_CHALK_BRICKS);
            content.addAfter(PURPLE_CHALK_BRICKS, PURPLE_CHALK_BRICK_STAIRS);
            content.addAfter(PURPLE_CHALK_BRICK_STAIRS, PURPLE_CHALK_BRICK_SLAB);
            content.addAfter(PURPLE_CHALK_BRICK_SLAB, PURPLE_CHALK_BRICK_WALL);

            content.addAfter(PURPLE_CHALK_BRICK_WALL, MAGENTA_CHALK);
            content.addAfter(MAGENTA_CHALK, MAGENTA_CHALK_STAIRS);
            content.addAfter(MAGENTA_CHALK_STAIRS, MAGENTA_CHALK_SLAB);
            content.addAfter(MAGENTA_CHALK_SLAB, MAGENTA_CHALK_WALL);
            content.addAfter(MAGENTA_CHALK_WALL, MAGENTA_CHALK_BRICKS);
            content.addAfter(MAGENTA_CHALK_BRICKS, MAGENTA_CHALK_BRICK_STAIRS);
            content.addAfter(MAGENTA_CHALK_BRICK_STAIRS, MAGENTA_CHALK_BRICK_SLAB);
            content.addAfter(MAGENTA_CHALK_BRICK_SLAB, MAGENTA_CHALK_BRICK_WALL);

            content.addAfter(MAGENTA_CHALK_BRICK_WALL, PINK_CHALK);
            content.addAfter(PINK_CHALK, PINK_CHALK_STAIRS);
            content.addAfter(PINK_CHALK_STAIRS, PINK_CHALK_SLAB);
            content.addAfter(PINK_CHALK_SLAB, PINK_CHALK_WALL);
            content.addAfter(PINK_CHALK_WALL, PINK_CHALK_BRICKS);
            content.addAfter(PINK_CHALK_BRICKS, PINK_CHALK_BRICK_STAIRS);
            content.addAfter(PINK_CHALK_BRICK_STAIRS, PINK_CHALK_BRICK_SLAB);
            content.addAfter(PINK_CHALK_BRICK_SLAB, PINK_CHALK_BRICK_WALL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {

            // SAND
            content.addAfter(RED_SANDSTONE, FROSTED_SAND);
            content.addAfter(FROSTED_SAND, FROSTED_SANDSTONE);
            content.addAfter(FROSTED_SANDSTONE, CHARRED_SAND);
            content.addAfter(CHARRED_SAND, CHARRED_SANDSTONE);

            // PEAT
            content.addAfter(PALE_HANGING_MOSS, PEAT_BLOCK);
            content.addAfter(PEAT_BLOCK, PEAT);

            // STONES
            content.addAfter(ANDESITE, GNEISS);
            content.addAfter(GNEISS, SHALE);
            content.addAfter(SHALE, LIMESTONE);
            content.addAfter(LIMESTONE, MARBLE);
            content.addAfter(MARBLE, GABBRO);
            content.addAfter(GABBRO, PHYLLITE);
            content.addAfter(AMETHYST_CLUSTER, DOLOMITE);
            content.addAfter(DOLOMITE, GYPSUM);

            // ORES

            // COAL
            content.addAfter(DEEPSLATE_COAL_ORE, GRANITE_COAL_ORE);
            content.addAfter(GRANITE_COAL_ORE, DIORITE_COAL_ORE);
            content.addAfter(DIORITE_COAL_ORE, ANDESITE_COAL_ORE);
            content.addAfter(ANDESITE_COAL_ORE, TUFF_COAL_ORE);
            content.addAfter(TUFF_COAL_ORE, MARBLE_COAL_ORE);
            content.addAfter(MARBLE_COAL_ORE, GNEISS_COAL_ORE);
            content.addAfter(GNEISS_COAL_ORE, SHALE_COAL_ORE);
            content.addAfter(SHALE_COAL_ORE, LIMESTONE_COAL_ORE);
            content.addAfter(LIMESTONE_COAL_ORE, GABBRO_COAL_ORE);
            content.addAfter(GABBRO_COAL_ORE, PHYLLITE_COAL_ORE);

            // IRON
            content.addAfter(DEEPSLATE_IRON_ORE, GRANITE_IRON_ORE);
            content.addAfter(GRANITE_IRON_ORE, DIORITE_IRON_ORE);
            content.addAfter(DIORITE_IRON_ORE, ANDESITE_IRON_ORE);
            content.addAfter(ANDESITE_IRON_ORE, TUFF_IRON_ORE);
            content.addAfter(TUFF_IRON_ORE, MARBLE_IRON_ORE);
            content.addAfter(MARBLE_IRON_ORE, GNEISS_IRON_ORE);
            content.addAfter(GNEISS_IRON_ORE, SHALE_IRON_ORE);
            content.addAfter(SHALE_IRON_ORE, LIMESTONE_IRON_ORE);
            content.addAfter(LIMESTONE_IRON_ORE, GABBRO_IRON_ORE);
            content.addAfter(GABBRO_IRON_ORE, PHYLLITE_IRON_ORE);

            //COPPER
            content.addAfter(DEEPSLATE_COPPER_ORE, GRANITE_COPPER_ORE);
            content.addAfter(GRANITE_COPPER_ORE, DIORITE_COPPER_ORE);
            content.addAfter(DIORITE_COPPER_ORE, ANDESITE_COPPER_ORE);
            content.addAfter(ANDESITE_COPPER_ORE, TUFF_COPPER_ORE);
            content.addAfter(TUFF_COPPER_ORE, MARBLE_COPPER_ORE);
            content.addAfter(MARBLE_COPPER_ORE, GNEISS_COPPER_ORE);
            content.addAfter(GNEISS_COPPER_ORE, SHALE_COPPER_ORE);
            content.addAfter(SHALE_COPPER_ORE, LIMESTONE_COPPER_ORE);
            content.addAfter(LIMESTONE_COPPER_ORE, GABBRO_COPPER_ORE);
            content.addAfter(GABBRO_COPPER_ORE, PHYLLITE_COPPER_ORE);

            //GOLD
            content.addAfter(DEEPSLATE_GOLD_ORE, GRANITE_GOLD_ORE);
            content.addAfter(GRANITE_GOLD_ORE, DIORITE_GOLD_ORE);
            content.addAfter(DIORITE_GOLD_ORE, ANDESITE_GOLD_ORE);
            content.addAfter(ANDESITE_GOLD_ORE, TUFF_GOLD_ORE);
            content.addAfter(TUFF_GOLD_ORE, MARBLE_GOLD_ORE);
            content.addAfter(MARBLE_GOLD_ORE, GNEISS_GOLD_ORE);
            content.addAfter(GNEISS_GOLD_ORE, SHALE_GOLD_ORE);
            content.addAfter(SHALE_GOLD_ORE, LIMESTONE_GOLD_ORE);
            content.addAfter(LIMESTONE_GOLD_ORE, GABBRO_GOLD_ORE);
            content.addAfter(GABBRO_GOLD_ORE, PHYLLITE_GOLD_ORE);

            //REDSTONE
            content.addAfter(DEEPSLATE_REDSTONE_ORE, GRANITE_REDSTONE_ORE);
            content.addAfter(GRANITE_REDSTONE_ORE, DIORITE_REDSTONE_ORE);
            content.addAfter(DIORITE_REDSTONE_ORE, ANDESITE_REDSTONE_ORE);
            content.addAfter(ANDESITE_REDSTONE_ORE, TUFF_REDSTONE_ORE);
            content.addAfter(TUFF_REDSTONE_ORE, MARBLE_REDSTONE_ORE);
            content.addAfter(MARBLE_REDSTONE_ORE, GNEISS_REDSTONE_ORE);
            content.addAfter(GNEISS_REDSTONE_ORE, SHALE_REDSTONE_ORE);
            content.addAfter(SHALE_REDSTONE_ORE, LIMESTONE_REDSTONE_ORE);
            content.addAfter(LIMESTONE_REDSTONE_ORE, GABBRO_REDSTONE_ORE);
            content.addAfter(GABBRO_REDSTONE_ORE, PHYLLITE_REDSTONE_ORE);

            //EMERALD
            content.addAfter(DEEPSLATE_EMERALD_ORE, GRANITE_EMERALD_ORE);
            content.addAfter(GRANITE_EMERALD_ORE, DIORITE_EMERALD_ORE);
            content.addAfter(DIORITE_EMERALD_ORE, ANDESITE_EMERALD_ORE);
            content.addAfter(ANDESITE_EMERALD_ORE, TUFF_EMERALD_ORE);
            content.addAfter(TUFF_EMERALD_ORE, MARBLE_EMERALD_ORE);
            content.addAfter(MARBLE_EMERALD_ORE, GNEISS_EMERALD_ORE);
            content.addAfter(GNEISS_EMERALD_ORE, SHALE_EMERALD_ORE);
            content.addAfter(SHALE_EMERALD_ORE, LIMESTONE_EMERALD_ORE);
            content.addAfter(LIMESTONE_EMERALD_ORE, GABBRO_EMERALD_ORE);
            content.addAfter(GABBRO_EMERALD_ORE, PHYLLITE_EMERALD_ORE);

            //LAPIS
            content.addAfter(DEEPSLATE_LAPIS_ORE, GRANITE_LAPIS_ORE);
            content.addAfter(GRANITE_LAPIS_ORE, DIORITE_LAPIS_ORE);
            content.addAfter(DIORITE_LAPIS_ORE, ANDESITE_LAPIS_ORE);
            content.addAfter(ANDESITE_LAPIS_ORE, TUFF_LAPIS_ORE);
            content.addAfter(TUFF_LAPIS_ORE, MARBLE_LAPIS_ORE);
            content.addAfter(MARBLE_LAPIS_ORE, GNEISS_LAPIS_ORE);
            content.addAfter(GNEISS_LAPIS_ORE, SHALE_LAPIS_ORE);
            content.addAfter(SHALE_LAPIS_ORE, LIMESTONE_LAPIS_ORE);
            content.addAfter(LIMESTONE_LAPIS_ORE, GABBRO_LAPIS_ORE);
            content.addAfter(GABBRO_LAPIS_ORE, PHYLLITE_LAPIS_ORE);

            //DIAMOND
            content.addAfter(DEEPSLATE_DIAMOND_ORE, GRANITE_DIAMOND_ORE);
            content.addAfter(GRANITE_DIAMOND_ORE, DIORITE_DIAMOND_ORE);
            content.addAfter(DIORITE_DIAMOND_ORE, ANDESITE_DIAMOND_ORE);
            content.addAfter(ANDESITE_DIAMOND_ORE, TUFF_DIAMOND_ORE);
            content.addAfter(TUFF_DIAMOND_ORE, MARBLE_DIAMOND_ORE);
            content.addAfter(MARBLE_DIAMOND_ORE, GNEISS_DIAMOND_ORE);
            content.addAfter(GNEISS_DIAMOND_ORE, SHALE_DIAMOND_ORE);
            content.addAfter(SHALE_DIAMOND_ORE, LIMESTONE_DIAMOND_ORE);
            content.addAfter(LIMESTONE_DIAMOND_ORE, GABBRO_DIAMOND_ORE);
            content.addAfter(GABBRO_DIAMOND_ORE, PHYLLITE_DIAMOND_ORE);

            //LOGS
            content.addAfter(OAK_LOG, MAPLE_LOG);
            content.addAfter(MAPLE_LOG, POPLAR_LOG);
            content.addAfter(POPLAR_LOG, BEECH_LOG);
            content.addAfter(BEECH_LOG, HICKORY_LOG);
            content.addAfter(HICKORY_LOG, WALNUT_LOG);
            content.addAfter(WALNUT_LOG, CHESTNUT_LOG);
            content.addAfter(SPRUCE_LOG, CEDAR_LOG);
            content.addAfter(CEDAR_LOG, REDWOOD_LOG);
            content.addAfter(REDWOOD_LOG, FIR_LOG);
            content.addAfter(FIR_LOG, HEMLOCK_LOG);
            content.addAfter(HEMLOCK_LOG, HOLLY_LOG);
            content.addAfter(HOLLY_LOG, PINE_LOG);
            content.addAfter(PINE_LOG, LARCH_LOG);
            content.addAfter(BIRCH_LOG, ASPEN_LOG);
            content.addAfter(JUNGLE_LOG, KAPOK_LOG);
            content.addAfter(KAPOK_LOG, MAHOGANY_LOG);
            content.addAfter(MAHOGANY_LOG, EUCALYPTUS_LOG);
            content.addAfter(ACACIA_LOG, BAOBAB_LOG);
            content.addAfter(BAOBAB_LOG, PALO_VERDE_LOG);
            content.addAfter(PALO_VERDE_LOG, JOSHUA_LOG);
            content.addAfter(JOSHUA_LOG, JUNIPER_LOG);
            content.addAfter(JUNIPER_LOG, PALM_LOG);
            content.addAfter(DARK_OAK_LOG, EBONY_LOG);
            content.addAfter(EBONY_LOG, TEAK_LOG);
            content.addAfter(TEAK_LOG, ELM_LOG);
            content.addAfter(MANGROVE_LOG, WILLOW_LOG);
            content.addAfter(WILLOW_LOG, CYPRESS_LOG);
            content.addAfter(CHERRY_LOG, SAKURA_LOG);
            content.addAfter(SAKURA_LOG, MAGNOLIA_LOG);
            content.addAfter(MAGNOLIA_LOG, JACARANDA_LOG);

            //LEAVES
            content.addAfter(OAK_LEAVES, MAPLE_LEAVES);
            content.addAfter(MAPLE_LEAVES, POPLAR_LEAVES);
            content.addAfter(POPLAR_LEAVES, BEECH_LEAVES);
            content.addAfter(BEECH_LEAVES, HICKORY_LEAVES);
            content.addAfter(HICKORY_LEAVES, WALNUT_LEAVES);
            content.addAfter(WALNUT_LEAVES, CHESTNUT_LEAVES);
            content.addAfter(SPRUCE_LEAVES, CEDAR_LEAVES);
            content.addAfter(CEDAR_LEAVES, REDWOOD_LEAVES);
            content.addAfter(REDWOOD_LEAVES, FIR_LEAVES);
            content.addAfter(FIR_LEAVES, HEMLOCK_LEAVES);
            content.addAfter(HEMLOCK_LEAVES, HOLLY_LEAVES);
            content.addAfter(HOLLY_LEAVES, PINE_LEAVES);
            content.addAfter(PINE_LEAVES, LARCH_LEAVES);
            content.addAfter(BIRCH_LEAVES, ASPEN_LEAVES);
            content.addAfter(JUNGLE_LEAVES, KAPOK_LEAVES);
            content.addAfter(KAPOK_LEAVES, MAHOGANY_LEAVES);
            content.addAfter(MAHOGANY_LEAVES, EUCALYPTUS_LEAVES);
            content.addAfter(ACACIA_LEAVES, BAOBAB_LEAVES);
            content.addAfter(BAOBAB_LEAVES, PALO_VERDE_LEAVES);
            content.addAfter(PALO_VERDE_LEAVES, JOSHUA_LEAVES);
            content.addAfter(JOSHUA_LEAVES, JUNIPER_LEAVES);
            content.addAfter(JUNIPER_LEAVES, PALM_LEAVES);
            content.addAfter(DARK_OAK_LEAVES, EBONY_LEAVES);
            content.addAfter(EBONY_LEAVES, TEAK_LEAVES);
            content.addAfter(TEAK_LEAVES, ELM_LEAVES);
            content.addAfter(MANGROVE_LEAVES, WILLOW_LEAVES);
            content.addAfter(WILLOW_LEAVES, CYPRESS_LEAVES);
            content.addAfter(CHERRY_LEAVES, SAKURA_LEAVES);
            content.addAfter(SAKURA_LEAVES, MAGNOLIA_LEAVES);
            content.addAfter(MAGNOLIA_LEAVES, FLOWERING_MAGNOLIA_LEAVES);
            content.addAfter(FLOWERING_MAGNOLIA_LEAVES, JACARANDA_LEAVES);

            //SAPLINGS
            content.addAfter(OAK_SAPLING, MAPLE_SAPLING);
            content.addAfter(MAPLE_SAPLING, POPLAR_SAPLING);
            content.addAfter(POPLAR_SAPLING, BEECH_SAPLING);
            content.addAfter(BEECH_SAPLING, HICKORY_SAPLING);
            content.addAfter(HICKORY_SAPLING, WALNUT_SAPLING);
            content.addAfter(WALNUT_SAPLING, CHESTNUT_SAPLING);
            content.addAfter(SPRUCE_SAPLING, CEDAR_SAPLING);
            content.addAfter(CEDAR_SAPLING, REDWOOD_SAPLING);
            content.addAfter(REDWOOD_SAPLING, FIR_SAPLING);
            content.addAfter(FIR_SAPLING, HEMLOCK_SAPLING);
            content.addAfter(HEMLOCK_SAPLING, HOLLY_SAPLING);
            content.addAfter(HOLLY_SAPLING, PINE_SAPLING);
            content.addAfter(PINE_SAPLING, LARCH_SAPLING);
            content.addAfter(BIRCH_SAPLING, ASPEN_SAPLING);
            content.addAfter(JUNGLE_SAPLING, KAPOK_SAPLING);
            content.addAfter(KAPOK_SAPLING, MAHOGANY_SAPLING);
            content.addAfter(MAHOGANY_SAPLING, EUCALYPTUS_SAPLING);
            content.addAfter(ACACIA_SAPLING, BAOBAB_SAPLING);
            content.addAfter(BAOBAB_SAPLING, PALO_VERDE_SAPLING);
            content.addAfter(PALO_VERDE_SAPLING, JOSHUA_SAPLING);
            content.addAfter(JOSHUA_SAPLING, JUNIPER_SAPLING);
            content.addAfter(JUNIPER_SAPLING, PALM_SAPLING);
            content.addAfter(DARK_OAK_SAPLING, EBONY_SAPLING);
            content.addAfter(EBONY_SAPLING, TEAK_SAPLING);
            content.addAfter(TEAK_SAPLING, ELM_SAPLING);
            content.addAfter(MANGROVE_PROPAGULE, WILLOW_SAPLING);
            content.addAfter(WILLOW_SAPLING, CYPRESS_SAPLING);
            content.addAfter(CHERRY_SAPLING, SAKURA_SAPLING);
            content.addAfter(SAKURA_SAPLING, MAGNOLIA_SAPLING);
            content.addAfter(MAGNOLIA_SAPLING, FLOWERING_MAGNOLIA_SAPLING);
            content.addAfter(FLOWERING_MAGNOLIA_SAPLING, JACARANDA_SAPLING);

            // PLANTS
            content.addAfter(FERN, SHORT_PRAIRIE_GRASS);
            content.addAfter(LARGE_FERN, TALL_PRAIRIE_GRASS);
            content.addAfter(SEAGRASS, CATTAIL);
            content.addAfter(PEONY, LAVENDER);
            content.addAfter(PINK_PETALS, PURPLE_PETALS);
            content.addAfter(MOSS_CARPET, HANGING_MOSS);

            // GOURD STUFF
            content.addAfter(JACK_O_LANTERN, GOURD);
            content.addAfter(GOURD, CARVED_GOURD);
            content.addAfter(BEETROOT_SEEDS, GOURD_SEEDS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content ->{

            content.addAfter(OAK_HANGING_SIGN, BlockItems.MAPLE_SIGN);
            content.addAfter(BlockItems.MAPLE_SIGN, BlockItems.MAPLE_HANGING_SIGN);
            content.addAfter(BlockItems.MAPLE_HANGING_SIGN, BlockItems.POPLAR_SIGN);
            content.addAfter(BlockItems.POPLAR_SIGN, BlockItems.POPLAR_HANGING_SIGN);
            content.addAfter(BlockItems.POPLAR_HANGING_SIGN, BlockItems.BEECH_SIGN);
            content.addAfter(BlockItems.BEECH_SIGN, BlockItems.BEECH_HANGING_SIGN);
            content.addAfter(BlockItems.BEECH_HANGING_SIGN, BlockItems.HICKORY_SIGN);
            content.addAfter(BlockItems.HICKORY_SIGN, BlockItems.HICKORY_HANGING_SIGN);
            content.addAfter(BlockItems.HICKORY_HANGING_SIGN, BlockItems.WALNUT_SIGN);
            content.addAfter(BlockItems.WALNUT_SIGN, BlockItems.WALNUT_HANGING_SIGN);
            content.addAfter(BlockItems.WALNUT_HANGING_SIGN, BlockItems.CHESTNUT_SIGN);
            content.addAfter(BlockItems.CHESTNUT_SIGN, BlockItems.CHESTNUT_HANGING_SIGN);
            content.addAfter(SPRUCE_HANGING_SIGN, BlockItems.CEDAR_SIGN);
            content.addAfter(BlockItems.CEDAR_SIGN, BlockItems.CEDAR_HANGING_SIGN);
            content.addAfter(BlockItems.CEDAR_HANGING_SIGN, BlockItems.REDWOOD_SIGN);
            content.addAfter(BlockItems.REDWOOD_SIGN, BlockItems.REDWOOD_HANGING_SIGN);
            content.addAfter(BlockItems.REDWOOD_HANGING_SIGN, BlockItems.FIR_SIGN);
            content.addAfter(BlockItems.FIR_SIGN, BlockItems.FIR_HANGING_SIGN);
            content.addAfter(BlockItems.FIR_HANGING_SIGN, BlockItems.HEMLOCK_SIGN);
            content.addAfter(BlockItems.HEMLOCK_SIGN, BlockItems.HEMLOCK_HANGING_SIGN);
            content.addAfter(BlockItems.HEMLOCK_HANGING_SIGN, BlockItems.HOLLY_SIGN);
            content.addAfter(BlockItems.HOLLY_SIGN, BlockItems.HOLLY_HANGING_SIGN);
            content.addAfter(BlockItems.HOLLY_HANGING_SIGN, BlockItems.PINE_SIGN);
            content.addAfter(BlockItems.PINE_SIGN, BlockItems.PINE_HANGING_SIGN);
            content.addAfter(BlockItems.PINE_HANGING_SIGN, BlockItems.LARCH_SIGN);
            content.addAfter(BlockItems.LARCH_SIGN, BlockItems.LARCH_HANGING_SIGN);
            content.addAfter(BIRCH_HANGING_SIGN, BlockItems.ASPEN_SIGN);
            content.addAfter(BlockItems.ASPEN_SIGN, BlockItems.ASPEN_HANGING_SIGN);
            content.addAfter(JUNGLE_HANGING_SIGN, BlockItems.KAPOK_SIGN);
            content.addAfter(BlockItems.KAPOK_SIGN, BlockItems.KAPOK_HANGING_SIGN);
            content.addAfter(BlockItems.KAPOK_HANGING_SIGN, BlockItems.MAHOGANY_SIGN);
            content.addAfter(BlockItems.MAHOGANY_SIGN, BlockItems.MAHOGANY_HANGING_SIGN);
            content.addAfter(BlockItems.MAHOGANY_HANGING_SIGN, BlockItems.EUCALYPTUS_SIGN);
            content.addAfter(BlockItems.EUCALYPTUS_SIGN, BlockItems.EUCALYPTUS_HANGING_SIGN);
            content.addAfter(ACACIA_HANGING_SIGN, BlockItems.BAOBAB_SIGN);
            content.addAfter(BlockItems.BAOBAB_SIGN, BlockItems.BAOBAB_HANGING_SIGN);
            content.addAfter(BlockItems.BAOBAB_HANGING_SIGN, BlockItems.PALO_VERDE_SIGN);
            content.addAfter(BlockItems.PALO_VERDE_SIGN, BlockItems.PALO_VERDE_HANGING_SIGN);
            content.addAfter(BlockItems.PALO_VERDE_HANGING_SIGN, BlockItems.JOSHUA_SIGN);
            content.addAfter(BlockItems.JOSHUA_SIGN, BlockItems.JOSHUA_HANGING_SIGN);
            content.addAfter(BlockItems.JOSHUA_HANGING_SIGN, BlockItems.JUNIPER_SIGN);
            content.addAfter(BlockItems.JUNIPER_SIGN, BlockItems.JUNIPER_HANGING_SIGN);
            content.addAfter(BlockItems.JUNIPER_HANGING_SIGN, BlockItems.PALM_SIGN);
            content.addAfter(BlockItems.PALM_SIGN, BlockItems.PALM_HANGING_SIGN);
            content.addAfter(DARK_OAK_HANGING_SIGN, BlockItems.EBONY_SIGN);
            content.addAfter(BlockItems.EBONY_SIGN, BlockItems.EBONY_HANGING_SIGN);
            content.addAfter(BlockItems.EBONY_HANGING_SIGN, BlockItems.TEAK_SIGN);
            content.addAfter(BlockItems.TEAK_SIGN, BlockItems.TEAK_HANGING_SIGN);
            content.addAfter(BlockItems.TEAK_HANGING_SIGN, BlockItems.ELM_SIGN);
            content.addAfter(BlockItems.ELM_SIGN, BlockItems.ELM_HANGING_SIGN);
            content.addAfter(MANGROVE_HANGING_SIGN, BlockItems.WILLOW_SIGN);
            content.addAfter(BlockItems.WILLOW_SIGN, BlockItems.WILLOW_HANGING_SIGN);
            content.addAfter(BlockItems.WILLOW_HANGING_SIGN, BlockItems.CYPRESS_SIGN);
            content.addAfter(BlockItems.CYPRESS_SIGN, BlockItems.CYPRESS_HANGING_SIGN);
            content.addAfter(CHERRY_HANGING_SIGN, BlockItems.SAKURA_SIGN);
            content.addAfter(BlockItems.SAKURA_SIGN, BlockItems.SAKURA_HANGING_SIGN);
            content.addAfter(BlockItems.SAKURA_HANGING_SIGN, BlockItems.MAGNOLIA_SIGN);
            content.addAfter(BlockItems.MAGNOLIA_SIGN, BlockItems.MAGNOLIA_HANGING_SIGN);
            content.addAfter(BlockItems.MAGNOLIA_HANGING_SIGN, BlockItems.JACARANDA_SIGN);
            content.addAfter(BlockItems.JACARANDA_SIGN, BlockItems.JACARANDA_HANGING_SIGN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {

            content.addAfter(NETHER_WART, WARPED_WART);

            content.addAfter(OMINOUS_TRIAL_KEY, RUNE_AQUA_AFFINITY);
            content.addAfter(RUNE_AQUA_AFFINITY, RUNE_BANE_OF_ARTHROPODS);
            content.addAfter(RUNE_BANE_OF_ARTHROPODS, RUNE_BLAST_PROTECTION);
            content.addAfter(RUNE_BLAST_PROTECTION, RUNE_BREACH);
            content.addAfter(RUNE_BREACH, RUNE_CHANNELING);
            content.addAfter(RUNE_CHANNELING, RUNE_DENSITY);
            content.addAfter(RUNE_DENSITY, RUNE_DEPTH_STRIDER);
            content.addAfter(RUNE_DEPTH_STRIDER, RUNE_EFFICIENCY);
            content.addAfter(RUNE_EFFICIENCY, RUNE_FEATHER_FALLING);
            content.addAfter(RUNE_FEATHER_FALLING, RUNE_FIRE_ASPECT);
            content.addAfter(RUNE_FIRE_ASPECT, RUNE_FIRE_PROTECTION);
            content.addAfter(RUNE_FIRE_PROTECTION, RUNE_FLAME);
            content.addAfter(RUNE_FLAME, RUNE_FORTUNE);
            content.addAfter(RUNE_FORTUNE, RUNE_FROST_WALKER);
            content.addAfter(RUNE_FROST_WALKER, RUNE_IMPALING);
            content.addAfter(RUNE_IMPALING, RUNE_INFINITY);
            content.addAfter(RUNE_INFINITY, RUNE_KNOCKBACK);
            content.addAfter(RUNE_KNOCKBACK, RUNE_LOOTING);
            content.addAfter(RUNE_LOOTING, RUNE_LOYALTY);
            content.addAfter(RUNE_LOYALTY, RUNE_LUCK_OF_THE_SEA);
            content.addAfter(RUNE_LUCK_OF_THE_SEA, RUNE_LURE);
            content.addAfter(RUNE_LURE, RUNE_MENDING);
            content.addAfter(RUNE_MENDING, RUNE_MULTISHOT);
            content.addAfter(RUNE_MULTISHOT, RUNE_PIERCING);
            content.addAfter(RUNE_PIERCING, RUNE_POWER);
            content.addAfter(RUNE_POWER, RUNE_PROJECTILE_PROTECTION);
            content.addAfter(RUNE_PROJECTILE_PROTECTION, RUNE_PROTECTION);
            content.addAfter(RUNE_PROTECTION, RUNE_PUNCH);
            content.addAfter(RUNE_PUNCH, RUNE_QUICK_CHARGE);
            content.addAfter(RUNE_QUICK_CHARGE, RUNE_RESPIRATION);
            content.addAfter(RUNE_RESPIRATION, RUNE_RIPTIDE);
            content.addAfter(RUNE_RIPTIDE, RUNE_SHARPNESS);
            content.addAfter(RUNE_SHARPNESS, RUNE_SILK_TOUCH);
            content.addAfter(RUNE_SILK_TOUCH, RUNE_SMITE);
            content.addAfter(RUNE_SMITE, RUNE_SOUL_SPEED);
            content.addAfter(RUNE_SOUL_SPEED, RUNE_SWEEPING_EDGE);
            content.addAfter(RUNE_SWEEPING_EDGE, RUNE_SWIFT_SNEAK);
            content.addAfter(RUNE_SWIFT_SNEAK, RUNE_THORNS);
            content.addAfter(RUNE_THORNS, RUNE_UNBREAKING);
            content.addAfter(RUNE_UNBREAKING, RUNE_WIND_BURST);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(APPLE, APRICOT);
            content.addAfter(APRICOT, KIWI);
            content.addAfter(KIWI, NECTARINE);
            content.addAfter(NECTARINE, PEACH);
            content.addAfter(PEACH, PEAR);
            content.addAfter(PEAR, PLUM);
            content.addAfter(PLUM, KUMQUAT);
            content.addAfter(KUMQUAT, OLIVE);
            content.addAfter(OLIVE, PERSIMMON);
            content.addAfter(PERSIMMON, POMEGRANATE);
            content.addAfter(POMEGRANATE, CHERRY);
            content.addAfter(CHERRY, FIG);
            content.addAfter(FIG, GRAPEFRUIT);
            content.addAfter(GRAPEFRUIT, GUAVA);
            content.addAfter(GUAVA, TANGERINE);
            content.addAfter(TANGERINE, AVOCADO);
            content.addAfter(AVOCADO, BANANA);
            content.addAfter(BANANA, LEMON);
            content.addAfter(LEMON, LIME);
            content.addAfter(LIME, MANGO);
            content.addAfter(MANGO, ORANGE);
            content.addAfter(ORANGE, STARFRUIT);

            content.addAfter(BEETROOT, BlockItems.ARTICHOKE);
            content.addAfter(BlockItems.ARTICHOKE, BlockItems.BROCCOLI);
            content.addAfter(BlockItems.BROCCOLI, BlockItems.CABBAGE);
            content.addAfter(BlockItems.CABBAGE, BlockItems.CANTALOUPE);
            content.addAfter(BlockItems.CANTALOUPE, BlockItems.CAULIFLOWER);
            content.addAfter(BlockItems.CAULIFLOWER, BlockItems.CELERY);
            content.addAfter(BlockItems.CELERY, BlockItems.CUCUMBER);
            content.addAfter(BlockItems.CUCUMBER, BlockItems.EGGPLANT);
            content.addAfter(BlockItems.EGGPLANT, BlockItems.JALAPENO);
            content.addAfter(BlockItems.JALAPENO, BlockItems.KALE);
            content.addAfter(BlockItems.KALE, BlockItems.LETTUCE);
            content.addAfter(BlockItems.LETTUCE, BlockItems.ONION);
            content.addAfter(BlockItems.ONION, BlockItems.RADISH);
            content.addAfter(BlockItems.RADISH, BlockItems.SPINACH);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> {
            content.addAfter(ENDERMITE_SPAWN_EGG, ENDER_DRAGON_SPAWN_EGG);
            content.addAfter(WITCH_SPAWN_EGG, WITHER_SPAWN_EGG);
        });
    }
}
