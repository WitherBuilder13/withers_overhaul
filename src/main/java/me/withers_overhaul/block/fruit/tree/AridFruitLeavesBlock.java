package me.withers_overhaul.block.fruit.tree;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.withers_overhaul.registry.item.BasicItems;
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
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class AridFruitLeavesBlock extends LeavesBlock {

    public static final BooleanProperty FRUIT = BooleanProperty.of("fruit");

    public static final MapCodec<AridFruitLeavesBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(aridFruitLeavesBlock -> aridFruitLeavesBlock.leafParticleChance),
                            createSettingsCodec()
                    )
                    .apply(instance, AridFruitLeavesBlock::new)
    );

    @Override
    public MapCodec<AridFruitLeavesBlock> getCodec() {
        return CODEC;
    }

    public AridFruitLeavesBlock(float leafParticleChance, Settings settings) {
        super(leafParticleChance, settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FRUIT, false));
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        EntityEffectParticleEffect entityEffectParticleEffect = EntityEffectParticleEffect.create(ParticleTypes.TINTED_LEAVES, world.getBlockColor(pos));
        ParticleUtil.spawnParticle(world, pos, random, entityEffectParticleEffect);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (state.get(FRUIT)) {
            dropStack(world, pos, new ItemStack(BasicItems.DATE, world.random.nextInt(2) + 1));
            world.playSound(null, pos, SoundEvents.BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES, SoundCategory.BLOCKS, 1.0F, 1.0F);
            BlockState blockState = state.with(FRUIT, false);
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
