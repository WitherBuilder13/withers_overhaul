package me.withers_overhaul.world.gen;

import me.withers_overhaul.WithersOverhaul;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;

public class OverhaulNoiseParameters {
    public static void bootstrap(Registerable<DoublePerlinNoiseSampler.NoiseParameters> noiseParametersRegisterable) {
        noiseParametersRegisterable.register(COARSE_DIRT_DESERT, new DoublePerlinNoiseSampler.NoiseParameters(-2, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F));
        noiseParametersRegisterable.register(TEMPERATURE, new DoublePerlinNoiseSampler.NoiseParameters(-11, 1.5F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        noiseParametersRegisterable.register(VEGETATION, new DoublePerlinNoiseSampler.NoiseParameters(-9, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
        noiseParametersRegisterable.register(GRAVEL, new DoublePerlinNoiseSampler.NoiseParameters(-2, 1.0F, 1.0F, 1.0F, 1.0F));
    }

    public static final RegistryKey<DoublePerlinNoiseSampler.NoiseParameters> COARSE_DIRT_DESERT = of("coarse_dirt_desert");
    public static final RegistryKey<DoublePerlinNoiseSampler.NoiseParameters> TEMPERATURE = of("temperature");
    public static final RegistryKey<DoublePerlinNoiseSampler.NoiseParameters> VEGETATION = of("vegetation");
    public static final RegistryKey<DoublePerlinNoiseSampler.NoiseParameters> GRAVEL = of("gravel");

    private static RegistryKey<DoublePerlinNoiseSampler.NoiseParameters> of(String id) {
        return RegistryKey.of(RegistryKeys.NOISE_PARAMETERS, Identifier.of(WithersOverhaul.MOD_ID, id));
    }
}
