package me.withers_overhaul.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.Direction;

public class CarvedGourdBlock extends HorizontalFacingBlock {
    public static final MapCodec<CarvedGourdBlock> CODEC = createCodec(CarvedGourdBlock::new);

    public MapCodec<? extends CarvedGourdBlock> getCodec() {
        return CODEC;
    }

    public static final EnumProperty<Direction> FACING = HorizontalFacingBlock.FACING;

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public CarvedGourdBlock(AbstractBlock.Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(FACING, Direction.NORTH));
    }
}
