package me.withers_overhaul.block.fruit.tree;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.withers_overhaul.registry.item.BasicItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class AridFruitSaplingBlock extends FruitSaplingBlock {

    public MapCodec<AridFruitSaplingBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                    FruitSaplingGenerator.CODEC.fieldOf("tree").forGetter(block -> block.generator), createSettingsCodec()
            ).apply(instance, AridFruitSaplingBlock::new));
    public MapCodec getCodec() {
        return CODEC;
    }

    public static final BooleanProperty FRUIT = BooleanProperty.of("fruit");

    public AridFruitSaplingBlock(FruitSaplingGenerator generator, Settings settings) {
        super(settings, generator);
        this.setDefaultState(this.stateManager.getDefaultState().with(FRUIT, false));
    }

    @Override
    public ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!state.get(FRUIT) && stack.isOf(BasicItems.DATE)) {
            stack.decrementUnlessCreative(1, player);
            world.playSound(null, pos, SoundEvents.BLOCK_AZALEA_LEAVES_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            BlockState blockState = state.with(FRUIT, true);
            world.setBlockState(pos, blockState);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));

            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (state.get(FRUIT) && player.getMainHandStack().getItem() != Items.BONE_MEAL) {
            dropStack(world, pos, new ItemStack(BasicItems.DATE, 1));
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 1.0F);
            BlockState blockState = state.with(FRUIT, false);
            world.setBlockState(pos, blockState);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.SUCCESS;
        } else return super.onUse(state, world, pos, player, hit);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STAGE, FRUIT);
    }
}
