package me.withers_overhaul.block.fruit.crop;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.registry.item.BlockItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ParsnipsBlock extends CropBlock {
    public static final MapCodec<ParsnipsBlock> CODEC = createCodec(ParsnipsBlock::new);
    private static final VoxelShape[] SHAPES_BY_AGE = Block.createShapeArray(7, age -> Block.createColumnShape(16.0, 0.0, 2 + age));

    public MapCodec<ParsnipsBlock> getCodec() {
        return CODEC;
    }

    public ParsnipsBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return BlockItems.PARSNIP;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_AGE[this.getAge(state)];
    }
}
