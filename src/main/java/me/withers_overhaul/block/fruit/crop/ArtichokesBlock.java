package me.withers_overhaul.block.fruit.crop;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.registry.item.BlockItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ArtichokesBlock extends CropBlock {
    public static final MapCodec<ArtichokesBlock> CODEC = createCodec(ArtichokesBlock::new);
    private static final VoxelShape[] SHAPES_BY_AGE = Block.createShapeArray(7, age -> Block.createColumnShape(16.0, 0.0, 2 + age));

    public MapCodec<ArtichokesBlock> getCodec() {
        return CODEC;
    }

    public ArtichokesBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return BlockItems.ARTICHOKE;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_AGE[this.getAge(state)];
    }
}
