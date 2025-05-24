package me.withers_overhaul.block.fruit.tree;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.EntityEffectParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import static net.minecraft.item.Items.DEBUG_STICK;

public class TropicalFruitLeavesBlock extends LeavesBlock {
    public static final EnumProperty<TreeFruit.Tropical> FRUIT = EnumProperty.of("fruit", TreeFruit.Tropical.class);

    public static final MapCodec<TropicalFruitLeavesBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(tropicalFruitLeavesBlock -> tropicalFruitLeavesBlock.leafParticleChance),
                            createSettingsCodec()
                    )
                    .apply(instance, TropicalFruitLeavesBlock::new)
    );

    @Override
    public MapCodec<TropicalFruitLeavesBlock> getCodec() {
        return CODEC;
    }

    public TropicalFruitLeavesBlock(float leafParticleChance, Settings settings) {
        super(leafParticleChance, settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FRUIT, TreeFruit.Tropical.NONE));
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        EntityEffectParticleEffect entityEffectParticleEffect = EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, world.getBlockColor(pos));
        ParticleUtil.spawnParticle(world, pos, random, entityEffectParticleEffect);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (state.get(FRUIT) != TreeFruit.Tropical.NONE && player.getMainHandStack().getItem() != DEBUG_STICK) {
            dropStack(world, pos, new ItemStack(state.get(FRUIT).getItem(), world.random.nextInt(2) + 1));
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 1.0F);
            BlockState blockState = state.with(FRUIT, TreeFruit.Tropical.NONE);
            world.setBlockState(pos, blockState);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.SUCCESS;
        } else {
            return super.onUse(state, world, pos, player, hit);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FRUIT, LeavesBlock.DISTANCE, LeavesBlock.PERSISTENT, LeavesBlock.WATERLOGGED);
    }
}