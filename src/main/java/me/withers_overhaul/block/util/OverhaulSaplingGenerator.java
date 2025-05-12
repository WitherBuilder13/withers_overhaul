package me.withers_overhaul.block.util;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import me.withers_overhaul.world.feature.configured.OverhaulTreeConfiguredFeatures;
import me.withers_overhaul.world.feature.configured.OverhaulVegetationConfiguredFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class OverhaulSaplingGenerator {
    private static final Map<String, OverhaulSaplingGenerator> GENERATORS = new Object2ObjectArrayMap<>();
    public static final Codec<OverhaulSaplingGenerator> CODEC = Codec.stringResolver(generator -> generator.id, GENERATORS::get);

    public static final SaplingGenerator MAPLE = new SaplingGenerator(
            "maple",
            0.1F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.MAPLE),
            Optional.of(OverhaulTreeConfiguredFeatures.FANCY_MAPLE),
            Optional.empty(),
            Optional.empty()
    );
    public static final SaplingGenerator POPLAR = new SaplingGenerator(
            "poplar",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.POPLAR),
            Optional.empty()
    );
    public static final SaplingGenerator BEECH = new SaplingGenerator(
            "beech",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.BEECH),
            Optional.empty()
    );
    public static final SaplingGenerator CEDAR = new SaplingGenerator(
            "cedar",
            0.5F,
            Optional.of(OverhaulTreeConfiguredFeatures.MEGA_CEDAR),
            Optional.of(OverhaulTreeConfiguredFeatures.MEGA_CEDAR_FLAT),
            Optional.of(OverhaulTreeConfiguredFeatures.CEDAR),
            Optional.of(OverhaulTreeConfiguredFeatures.CEDAR_FLAT),
            Optional.empty(),
            Optional.empty()
    );
    public static final OverhaulSaplingGenerator REDWOOD = new OverhaulSaplingGenerator(
        "redwood",
        Optional.of(OverhaulTreeConfiguredFeatures.REDWOOD),
        Optional.empty()
    );
    public static final SaplingGenerator FIR = new SaplingGenerator(
            "fir",
            Optional.of(OverhaulTreeConfiguredFeatures.MEGA_FIR),
            Optional.of(OverhaulTreeConfiguredFeatures.FIR),
            Optional.empty()
    );
    public static final SaplingGenerator HEMLOCK = new SaplingGenerator(
            "hemlock",
            Optional.of(OverhaulTreeConfiguredFeatures.MEGA_HEMLOCK),
            Optional.of(OverhaulTreeConfiguredFeatures.HEMLOCK),
            Optional.empty()
    );
    public static final SaplingGenerator HOLLY = new SaplingGenerator(
            "holly",
            Optional.of(OverhaulTreeConfiguredFeatures.HOLLY),
            Optional.empty(),
            Optional.empty()
    );
    public static final SaplingGenerator PINE = new SaplingGenerator(
            "pine",
            0.3F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(OverhaulVegetationConfiguredFeatures.PINE_SELECTOR),
            Optional.of(OverhaulVegetationConfiguredFeatures.PINE_TALL_SELECTOR),
            Optional.empty(),
            Optional.empty()
    );
    public static final SaplingGenerator LARCH = new SaplingGenerator(
            "larch",
            0.3F,
            Optional.empty(),
            Optional.empty(),
            Optional.of(OverhaulVegetationConfiguredFeatures.LARCH_SELECTOR),
            Optional.of(OverhaulVegetationConfiguredFeatures.LARCH_TALL_SELECTOR),
            Optional.empty(),
            Optional.empty()
    );
    public static final SaplingGenerator ASPEN = new SaplingGenerator(
            "aspen",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.ASPEN),
            Optional.empty()
    );
    public static final SaplingGenerator PALO_VERDE = new SaplingGenerator(
            "palo_verde",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.PALO_VERDE),
            Optional.empty()
    );
    public static final SaplingGenerator EBONY = new SaplingGenerator(
            "ebony",
            Optional.of(OverhaulTreeConfiguredFeatures.MEGA_EBONY),
            Optional.of(OverhaulTreeConfiguredFeatures.EBONY),
            Optional.empty()
    );
    public static final SaplingGenerator TEAK = new SaplingGenerator(
            "teak",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.TEAK),
            Optional.empty()
    );
    public static final SaplingGenerator ELM = new SaplingGenerator(
            "elm",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.ELM),
            Optional.empty()
    );
    public static final SaplingGenerator MAGNOLIA = new SaplingGenerator(
            "magnolia",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.MAGNOLIA),
            Optional.empty()
    );
    public static final SaplingGenerator FLOWERING_MAGNOLIA = new SaplingGenerator(
            "magnolia",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.FLOWERING_MAGNOLIA),
            Optional.empty()
    );
    public static final SaplingGenerator JACARANDA = new SaplingGenerator(
            "jacaranda",
            Optional.empty(),
            Optional.of(OverhaulTreeConfiguredFeatures.JACARANDA),
            Optional.empty()
    );

    // ` ---------------------------------------------------------------------------------------------------------------------------------------------------

    private final String id;
    private final Optional<RegistryKey<ConfiguredFeature<?, ?>>> redwoodConfiguredFeature;
    private final Optional<RegistryKey<ConfiguredFeature<?, ?>>> baobabConfiguredFeature;

    public OverhaulSaplingGenerator(
            String id,
            Optional<RegistryKey<ConfiguredFeature<?, ?>>> redwoodConfiguredFeature,
            Optional<RegistryKey<ConfiguredFeature<?, ?>>> baobabConfiguredFeature
    ) {
        this.id = id;
        this.redwoodConfiguredFeature = redwoodConfiguredFeature;
        this.baobabConfiguredFeature = baobabConfiguredFeature;
    }

    // ` ---------------------------------------------------------------------------------------------------------------------------------------------------

    @Nullable
    private RegistryKey<ConfiguredFeature<?, ?>> getRedwoodTreeFeature() {
        return this.redwoodConfiguredFeature.orElse(null);
    }

    public boolean generate(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {
        RegistryKey<ConfiguredFeature<?, ?>> registryKeyRedwood = this.getRedwoodTreeFeature();
        //if (registryKeyRedwood != null) {
            RegistryEntry<ConfiguredFeature<?, ?>> registryEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(registryKeyRedwood)
                    .orElse(null);
            if (registryEntry != null) {
                for (int i = 1; i >= -1; i--) {
                    for (int j = 1; j >= -1; j--) {
                        if (canGenerateRedwoodTree(state, world, pos, i, j)) {
                            ConfiguredFeature<?, ?> configuredFeature = registryEntry.value();
                            BlockState blockState = Blocks.AIR.getDefaultState();
                            world.setBlockState(pos.add(i, 0, j), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i + 1, 0, j), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i, 0, j + 1), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i - 1, 0, j), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i, 0, j - 1), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i + 1, 0, j + 1), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i + 1, 0, j - 1), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i - 1, 0, j - 1), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i - 1, 0, j + 1), blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            if (configuredFeature.generate(world, chunkGenerator, random, pos.add(i, 0, j))) {
                                return true;
                            }

                            world.setBlockState(pos.add(i, 0, j), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i + 1, 0, j), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i, 0, j + 1), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i - 1, 0, j), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i, 0, j - 1), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i + 1, 0, j + 1), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i + 1, 0, j - 1), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i - 1, 0, j - 1), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            world.setBlockState(pos.add(i - 1, 0, j + 1), state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                            return false;
                        }
                    }
                }
            //}
        //}

        /*RegistryKey<ConfiguredFeature<?, ?>> registryKey2 = this.getSmallTreeFeature(random, this.areFlowersNearby(world, pos));
        if (registryKey2 == null) {
            return false;
        } else {
            RegistryEntry<ConfiguredFeature<?, ?>> registryEntry2 = (RegistryEntry<ConfiguredFeature<?, ?>>) world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(registryKey2)
                    .orElse(null);
            if (registryEntry2 == null) {
                return false;
            } else {
                ConfiguredFeature<?, ?> configuredFeature2 = registryEntry2.value();
                BlockState blockState2 = world.getFluidState(pos).getBlockState();
                world.setBlockState(pos, blockState2, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                if (configuredFeature2.generate(world, chunkGenerator, random, pos)) {
                    if (world.getBlockState(pos) == blockState2) {
                        world.updateListeners(pos, state, blockState2, Block.NOTIFY_LISTENERS);
                    }

                    return true;*/
                } else {
                    world.setBlockState(pos, state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
                    return false;
                }
            //}
        //}
        return false;
    }

    private static boolean canGenerateRedwoodTree(BlockState state, BlockView world, BlockPos pos, int x, int z) {
        Block block = state.getBlock();
        return world.getBlockState(pos.add(x, 0, z)).isOf(block)
                && world.getBlockState(pos.add(x + 1, 0, z)).isOf(block)
                && world.getBlockState(pos.add(x, 0, z + 1)).isOf(block)
                && world.getBlockState(pos.add(x - 1, 0, z)).isOf(block)
                && world.getBlockState(pos.add(x, 0, z - 1)).isOf(block)
                && world.getBlockState(pos.add(x + 1, 0, z + 1)).isOf(block)
                && world.getBlockState(pos.add(x + 1, 0, z - 1)).isOf(block)
                && world.getBlockState(pos.add(x - 1, 0, z - 1)).isOf(block)
                && world.getBlockState(pos.add(x - 1, 0, z + 1)).isOf(block);
    }
}
