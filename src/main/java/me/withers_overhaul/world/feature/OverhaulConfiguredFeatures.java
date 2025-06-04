package me.withers_overhaul.world.feature;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.world.feature.configured.OverhaulOreConfiguredFeatures;
import me.withers_overhaul.world.feature.configured.vegetation.OverhaulTreeConfiguredFeatures;
import me.withers_overhaul.world.feature.configured.vegetation.OverhaulVegetationConfiguredFeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;


public class OverhaulConfiguredFeatures {
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        OverhaulOreConfiguredFeatures.bootstrap(featureRegisterable);
        OverhaulTreeConfiguredFeatures.bootstrap(featureRegisterable);
        OverhaulVegetationConfiguredFeatures.bootstrap(featureRegisterable);
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(WithersOverhaul.MOD_ID, id));
    }
}
