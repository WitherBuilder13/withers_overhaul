package me.withers_overhaul.world.gen;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class OverhaulOreVeins {
    public enum VeinType {
        COPPER(Blocks.COPPER_ORE.getDefaultState(), Blocks.RAW_COPPER_BLOCK.getDefaultState(), Blocks.GRANITE.getDefaultState(), 0, 50),
        IRON(Blocks.DEEPSLATE_IRON_ORE.getDefaultState(), Blocks.RAW_IRON_BLOCK.getDefaultState(), Blocks.TUFF.getDefaultState(), -60, -8);

        final BlockState ore;
        final BlockState rawOreBlock;
        final BlockState stone;
        final int minY;
        final int maxY;

        VeinType(final BlockState ore, final BlockState rawOreBlock, final BlockState stone, final int minY, final int maxY) {
            this.ore = ore;
            this.rawOreBlock = rawOreBlock;
            this.stone = stone;
            this.minY = minY;
            this.maxY = maxY;
        }
    }
}
