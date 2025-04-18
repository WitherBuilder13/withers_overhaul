package me.withers_overhaul.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SnowSaplingBlock extends SaplingBlock {
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.SNOW_BLOCK) || super.canPlantOnTop(floor, world, pos);
    }

    public SnowSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
}
