package me.withers_overhaul.block;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.registry.block.NaturalBlocks;
import net.minecraft.block.*;
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

public class HangingMossBlock extends Block implements Fertilizable {
    public static final MapCodec<net.minecraft.block.HangingMossBlock> CODEC = createCodec(net.minecraft.block.HangingMossBlock::new);
    public MapCodec<net.minecraft.block.HangingMossBlock> getCodec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE = Block.createColumnShape(14.0, 0.0, 16.0);
    private static final VoxelShape TIP_SHAPE = Block.createColumnShape(14.0, 2.0, 16.0);
    public static final BooleanProperty TIP = Properties.TIP;

    public HangingMossBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TIP, true));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(TIP) ? TIP_SHAPE : SHAPE;
    }

    @Override
    protected boolean isTransparent(BlockState state) {
        return true;
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return this.canPlaceAt(world, pos);
    }

    private boolean canPlaceAt(BlockView world, BlockPos pos) {
        BlockPos blockPos = pos.offset(Direction.UP);
        BlockState blockState = world.getBlockState(blockPos);
        return MultifaceBlock.canGrowOn(world, Direction.UP, blockPos, blockState) || blockState.isOf(NaturalBlocks.HANGING_MOSS);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state,
            WorldView world,
            ScheduledTickView tickView,
            BlockPos pos,
            Direction direction,
            BlockPos neighborPos,
            BlockState neighborState,
            Random random
    ) {
        if (!this.canPlaceAt(world, pos)) tickView.scheduleBlockTick(pos, this, 1);
        return state.with(TIP, !world.getBlockState(pos.down()).isOf(this));
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!this.canPlaceAt(world, pos)) world.breakBlock(pos, true);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TIP);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return this.canGrowInto(world.getBlockState(this.getTipPos(world, pos).down()));
    }

    private boolean canGrowInto(BlockState state) {
        return state.isAir();
    }

    public BlockPos getTipPos(BlockView world, BlockPos pos) {
        BlockPos.Mutable mutable = pos.mutableCopy();

        BlockState blockState;
        do {
            mutable.move(Direction.DOWN);
            blockState = world.getBlockState(mutable);
        } while (blockState.isOf(this));

        return mutable.offset(Direction.UP).toImmutable();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = this.getTipPos(world, pos).down();
        if (this.canGrowInto(world.getBlockState(blockPos))) world.setBlockState(blockPos, state.with(TIP, true));
    }
}
