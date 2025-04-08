package me.withers_overhaul.block;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.registry.block.NaturalBlocks;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;


public class ShortPrairieGrassBlock extends PlantBlock implements Fertilizable {
    public static final MapCodec<ShortPrairieGrassBlock> CODEC = createCodec(ShortPrairieGrassBlock::new);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    public MapCodec<ShortPrairieGrassBlock> getCodec() {
        return CODEC;
    }
    public ShortPrairieGrassBlock(Settings settings) {
        super(settings);
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return getLargeVariant().getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up());
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        TallPlantBlock.placeAt(world, getLargeVariant().getDefaultState(), pos, 2);
    }

    private static TallPlantBlock getLargeVariant() {
        return (TallPlantBlock) NaturalBlocks.TALL_PRAIRIE_GRASS;
    }
}
