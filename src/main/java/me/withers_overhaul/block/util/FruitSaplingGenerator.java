package me.withers_overhaul.block.util;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Map;

public class FruitSaplingGenerator {
    private static final Map<String, FruitSaplingGenerator> GENERATORS = new Object2ObjectArrayMap<>();
    public static final Codec<FruitSaplingGenerator> CODEC = Codec.stringResolver(generator -> generator.id, GENERATORS::get);

    // ` ---------------------------------------------------------------------------------------------------------------

    private final String id;
    private final RegistryKey<ConfiguredFeature<?, ?>>[] fruitTreeConfiguredFeatures;

    // ` ---------------------------------------------------------------------------------------------------------------

    @SafeVarargs
    public FruitSaplingGenerator(
            String id,
            RegistryKey<ConfiguredFeature<?, ?>>... fruitTreeConfiguredFeatures
    ) {
        this.id = id;
        this.fruitTreeConfiguredFeatures = fruitTreeConfiguredFeatures;
    }
}
