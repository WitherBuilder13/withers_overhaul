//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package me.withers_overhaul.block;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.registry.block.NaturalBlocks;
import me.withers_overhaul.registry.item.BasicItems;
import net.minecraft.block.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class GourdBlock extends Block {
    public static final MapCodec<PumpkinBlock> CODEC = createCodec(PumpkinBlock::new);

    public MapCodec<PumpkinBlock> getCodec() {
        return CODEC;
    }

    public GourdBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!stack.isOf(Items.SHEARS)) {
            return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
        } else if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            Direction direction = hit.getSide();
            Direction direction2 = direction.getAxis() == Axis.Y ? player.getHorizontalFacing().getOpposite() : direction;
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.setBlockState(pos, (BlockState) NaturalBlocks.CARVED_GOURD.getDefaultState().with(CarvedPumpkinBlock.FACING, direction2), 11);
            ItemEntity itemEntity = new ItemEntity(world, (double)pos.getX() + 0.5 + (double)direction2.getOffsetX() * 0.65, (double)pos.getY() + 0.1, (double)pos.getZ() + 0.5 + (double)direction2.getOffsetZ() * 0.65, new ItemStack(BasicItems.GOURD_SEEDS, 4));
            itemEntity.setVelocity(0.05 * (double)direction2.getOffsetX() + world.random.nextDouble() * 0.02, 0.05, 0.05 * (double)direction2.getOffsetZ() + world.random.nextDouble() * 0.02);
            world.spawnEntity(itemEntity);
            stack.damage(1, player, LivingEntity.getSlotForHand(hand));
            world.emitGameEvent(player, GameEvent.SHEAR, pos);
            player.incrementStat(Stats.USED.getOrCreateStat(Items.SHEARS));
            return ActionResult.SUCCESS;
        }
    }
}
