package me.withers_overhaul.block;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.tag.OverhaulBlockTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

public class CattailBlock extends TallPlantBlock implements Waterloggable, Fertilizable {
    public static final MapCodec<CattailBlock> CODEC = createCodec(CattailBlock::new);
    private static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape SHAPE;

    public MapCodec<CattailBlock> getCodec() {
        return CODEC;
    }

    public CattailBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.LOWER).with(WATERLOGGED, true));
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return (world.getFluidState(pos.up()).isEqualAndStill(Fluids.WATER) && world.getFluidState(pos.up(2)).isEmpty())
                && (super.canPlantOnTop(floor, world, pos) || floor.isIn(OverhaulBlockTags.CATTAILS_CAN_GROW_ON));
    }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
/*
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = super.getPlacementState(ctx);
        return blockState != null ? withWaterloggedState(ctx.getWorld(), ctx.getBlockPos()) : null;
    }
    */

    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (!world.isClient()) {
            BlockPos blockPos = pos.up();
            BlockState blockState = TallPlantBlock.withWaterloggedState(world, blockPos, this.getDefaultState().with(HALF, DoubleBlockHalf.UPPER));
            world.setBlockState(blockPos, blockState, 3);
        }
    }

    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) return super.canPlaceAt(state, world, pos);
        else {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            return this.canPlantOnTop(blockState, world, blockPos);
        }
    }

    protected BlockState getStateForNeighborUpdate(
            BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random
    ) {
        if (state.get(WATERLOGGED)) tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF, WATERLOGGED);
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        dropStack(world, pos, new ItemStack(this));
    }

    protected float getVerticalModelOffsetMultiplier() {
        return 0.1F;
    }

    static {
        WATERLOGGED = Properties.WATERLOGGED;
        SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);
    }
}
