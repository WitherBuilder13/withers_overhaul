package me.withers_overhaul.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;

import static me.withers_overhaul.registry.block.NaturalBlocks.*;

public class OverhaulRenderer {

    public static void registerRenderers() {
        Block[] partialBlocksWithTransparency = {
                MAPLE_SAPLING, POPLAR_SAPLING, BEECH_SAPLING, CEDAR_SAPLING, REDWOOD_SAPLING, FIR_SAPLING, HEMLOCK_SAPLING, HOLLY_SAPLING, PINE_SAPLING,
                LARCH_SAPLING, ASPEN_SAPLING, KAPOK_SAPLING, MAHOGANY_SAPLING, EUCALYPTUS_SAPLING, BAOBAB_SAPLING, PALO_VERDE_SAPLING, JOSHUA_SAPLING, JUNIPER_SAPLING,
                PALM_SAPLING, EBONY_SAPLING, TEAK_SAPLING, ELM_SAPLING, WILLOW_SAPLING, CYPRESS_SAPLING, SAKURA_SAPLING, MAGNOLIA_SAPLING, FLOWERING_MAGNOLIA_SAPLING, JACARANDA_SAPLING,

                SHORT_PRAIRIE_GRASS, TALL_PRAIRIE_GRASS, CATTAIL, LAVENDER, PURPLE_PETALS, HANGING_MOSS
        };

        for (Block block : partialBlocksWithTransparency) BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

        Block[] tintedFoliageBlocks = {
                MAPLE_LEAVES, POPLAR_LEAVES, BEECH_LEAVES, HICKORY_LEAVES, KAPOK_LEAVES, MAHOGANY_LEAVES, EUCALYPTUS_LEAVES, BAOBAB_LEAVES, PALO_VERDE_LEAVES,
                JOSHUA_LEAVES, JUNIPER_LEAVES, PALM_LEAVES, EBONY_LEAVES, TEAK_LEAVES, ELM_LEAVES, WILLOW_LEAVES, CYPRESS_LEAVES
        };

        Block[] tintedGrassBlocks = {PURPLE_PETALS};

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
            for (Block block : tintedFoliageBlocks) {
                ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : -1, block
                );
            }

            for (Block block : tintedGrassBlocks) {
                ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : -1, block
                );
            }

            renderSigns();
        }
    }

    @Environment(EnvType.CLIENT)
    private static void renderSigns() {
        BlockEntityRendererFactories.register(BlockEntityType.SIGN, SignBlockEntityRenderer::new);
    }
}
