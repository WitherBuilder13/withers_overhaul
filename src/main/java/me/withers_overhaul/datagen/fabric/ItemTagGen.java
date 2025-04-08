package me.withers_overhaul.datagen.fabric;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static me.withers_overhaul.registry.block.WoodBlocks.*;
import static me.withers_overhaul.tag.OverhaulItemTags.*;

public class ItemTagGen extends FabricTagProvider.ItemTagProvider {
    public ItemTagGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataOutput, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(MAPLE_LOGS)
                .add(MAPLE_LOG.asItem(), MAPLE_WOOD.asItem(), STRIPPED_MAPLE_LOG.asItem(), STRIPPED_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(POPLAR_LOGS)
                .add(POPLAR_LOG.asItem(), POPLAR_WOOD.asItem(), STRIPPED_POPLAR_LOG.asItem(), STRIPPED_POPLAR_WOOD.asItem());

        getOrCreateTagBuilder(BEECH_LOGS)
                .add(BEECH_LOG.asItem(), BEECH_WOOD.asItem(), STRIPPED_BEECH_LOG.asItem(), STRIPPED_BEECH_WOOD.asItem());

        getOrCreateTagBuilder(HICKORY_LOGS)
                .add(HICKORY_LOG.asItem(), HICKORY_WOOD.asItem(), STRIPPED_HICKORY_LOG.asItem(), STRIPPED_HICKORY_WOOD.asItem());

        getOrCreateTagBuilder(WALNUT_LOGS)
                .add(WALNUT_LOG.asItem(), WALNUT_WOOD.asItem(), STRIPPED_WALNUT_LOG.asItem(), STRIPPED_WALNUT_WOOD.asItem());

        getOrCreateTagBuilder(CHESTNUT_LOGS)
                .add(CHESTNUT_LOG.asItem(), CHESTNUT_WOOD.asItem(), STRIPPED_CHESTNUT_LOG.asItem(), STRIPPED_CHESTNUT_WOOD.asItem());

        getOrCreateTagBuilder(CEDAR_LOGS)
                .add(CEDAR_LOG.asItem(), CEDAR_WOOD.asItem(), STRIPPED_CEDAR_LOG.asItem(), STRIPPED_CEDAR_WOOD.asItem());

        getOrCreateTagBuilder(REDWOOD_LOGS)
                .add(REDWOOD_LOG.asItem(), REDWOOD_WOOD.asItem(), STRIPPED_REDWOOD_LOG.asItem(), STRIPPED_REDWOOD_WOOD.asItem());

        getOrCreateTagBuilder(FIR_LOGS)
                .add(FIR_LOG.asItem(), FIR_WOOD.asItem(), STRIPPED_FIR_LOG.asItem(), STRIPPED_FIR_WOOD.asItem());

        getOrCreateTagBuilder(HEMLOCK_LOGS)
                .add(HEMLOCK_LOG.asItem(), HEMLOCK_WOOD.asItem(), STRIPPED_HEMLOCK_LOG.asItem(), STRIPPED_HEMLOCK_WOOD.asItem());

        getOrCreateTagBuilder(HOLLY_LOGS)
                .add(HOLLY_LOG.asItem(), HOLLY_WOOD.asItem(), STRIPPED_HOLLY_LOG.asItem(), STRIPPED_HOLLY_WOOD.asItem());

        getOrCreateTagBuilder(PINE_LOGS)
                .add(PINE_LOG.asItem(), PINE_WOOD.asItem(), STRIPPED_PINE_LOG.asItem(), STRIPPED_PINE_WOOD.asItem());

        getOrCreateTagBuilder(LARCH_LOGS)
                .add(LARCH_LOG.asItem(), LARCH_WOOD.asItem(), STRIPPED_LARCH_LOG.asItem(), STRIPPED_LARCH_WOOD.asItem());

        getOrCreateTagBuilder(ASPEN_LOGS)
                .add(ASPEN_LOG.asItem(), ASPEN_WOOD.asItem(), STRIPPED_ASPEN_LOG.asItem(), STRIPPED_ASPEN_WOOD.asItem());

        getOrCreateTagBuilder(KAPOK_LOGS)
                .add(KAPOK_LOG.asItem(), KAPOK_WOOD.asItem(), STRIPPED_KAPOK_LOG.asItem(), STRIPPED_KAPOK_WOOD.asItem());

        getOrCreateTagBuilder(MAHOGANY_LOGS)
                .add(MAHOGANY_LOG.asItem(), MAHOGANY_WOOD.asItem(), STRIPPED_MAHOGANY_LOG.asItem(), STRIPPED_MAHOGANY_WOOD.asItem());

        getOrCreateTagBuilder(EUCALYPTUS_LOGS)
                .add(EUCALYPTUS_LOG.asItem(), EUCALYPTUS_WOOD.asItem(), STRIPPED_EUCALYPTUS_LOG.asItem(), STRIPPED_EUCALYPTUS_WOOD.asItem());

        getOrCreateTagBuilder(BAOBAB_LOGS)
                .add(BAOBAB_LOG.asItem(), BAOBAB_WOOD.asItem(), STRIPPED_BAOBAB_LOG.asItem(), STRIPPED_BAOBAB_WOOD.asItem());

        getOrCreateTagBuilder(PALO_VERDE_LOGS)
                .add(PALO_VERDE_LOG.asItem(), PALO_VERDE_WOOD.asItem(), STRIPPED_PALO_VERDE_LOG.asItem(), STRIPPED_PALO_VERDE_WOOD.asItem());

        getOrCreateTagBuilder(JOSHUA_LOGS)
                .add(JOSHUA_LOG.asItem(), JOSHUA_WOOD.asItem(), STRIPPED_JOSHUA_LOG.asItem(), STRIPPED_JOSHUA_WOOD.asItem());

        getOrCreateTagBuilder(JUNIPER_LOGS)
                .add(JUNIPER_LOG.asItem(), JUNIPER_WOOD.asItem(), STRIPPED_JUNIPER_LOG.asItem(), STRIPPED_JUNIPER_WOOD.asItem());

        getOrCreateTagBuilder(PALM_LOGS)
                .add(PALM_LOG.asItem(), PALM_WOOD.asItem(), STRIPPED_PALM_LOG.asItem(), STRIPPED_PALM_WOOD.asItem());

        getOrCreateTagBuilder(EBONY_LOGS)
                .add(EBONY_LOG.asItem(), EBONY_WOOD.asItem(), STRIPPED_EBONY_LOG.asItem(), STRIPPED_EBONY_WOOD.asItem());

        getOrCreateTagBuilder(TEAK_LOGS)
                .add(TEAK_LOG.asItem(), TEAK_WOOD.asItem(), STRIPPED_TEAK_LOG.asItem(), STRIPPED_TEAK_WOOD.asItem());

        getOrCreateTagBuilder(ELM_LOGS)
                .add(ELM_LOG.asItem(), ELM_WOOD.asItem(), STRIPPED_ELM_LOG.asItem(), STRIPPED_ELM_WOOD.asItem());

        getOrCreateTagBuilder(WILLOW_LOGS)
                .add(WILLOW_LOG.asItem(), WILLOW_WOOD.asItem(), STRIPPED_WILLOW_LOG.asItem(), STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(CYPRESS_LOGS)
                .add(CYPRESS_LOG.asItem(), CYPRESS_WOOD.asItem(), STRIPPED_CYPRESS_LOG.asItem(), STRIPPED_CYPRESS_WOOD.asItem());

        getOrCreateTagBuilder(SAKURA_LOGS)
                .add(SAKURA_LOG.asItem(), SAKURA_WOOD.asItem(), STRIPPED_SAKURA_LOG.asItem(), STRIPPED_SAKURA_WOOD.asItem());

        getOrCreateTagBuilder(MAGNOLIA_LOGS)
                .add(MAGNOLIA_LOG.asItem(), MAGNOLIA_WOOD.asItem(), STRIPPED_MAGNOLIA_LOG.asItem(), STRIPPED_MAGNOLIA_WOOD.asItem());

        getOrCreateTagBuilder(JACARANDA_LOGS)
                .add(JACARANDA_LOG.asItem(), JACARANDA_WOOD.asItem(), STRIPPED_JACARANDA_LOG.asItem(), STRIPPED_JACARANDA_WOOD.asItem());
    }
}
