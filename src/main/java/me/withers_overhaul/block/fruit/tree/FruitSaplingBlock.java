package me.withers_overhaul.block.fruit.tree;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public abstract class FruitSaplingBlock extends PlantBlock implements Fertilizable {

    public static final IntProperty STAGE = Properties.STAGE;
    private static final VoxelShape SHAPE = Block.createColumnShape(12.0, 0.0, 12.0);
    protected final FruitSaplingGenerator generator;

    protected FruitSaplingBlock(Settings settings, FruitSaplingGenerator generator) {
        super(settings);
        this.generator = generator;
        this.setDefaultState(this.stateManager.getDefaultState().with(STAGE, 0));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getLightLevel(pos.up()) >= 9 && random.nextInt(7) == 0)
            this.generate(world, pos, state, random);
    }

    public void generate(ServerWorld world, BlockPos pos, BlockState state, Random random) {
        if (state.get(STAGE) == 0) world.setBlockState(pos, state.cycle(STAGE), Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
        else this.generator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return world.random.nextFloat() < 0.45;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        this.generate(world, pos, state, random);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STAGE);
    }
}
