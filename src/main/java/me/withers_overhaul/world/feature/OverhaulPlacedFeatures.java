package me.withers_overhaul.world.feature;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.world.feature.placed.OverhaulOrePlacedFeatures;
import me.withers_overhaul.world.feature.placed.vegetation.OverhaulTreePlacedFeatures;
import me.withers_overhaul.world.feature.placed.vegetation.OverhaulVegetationPlacedFeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class OverhaulPlacedFeatures {
    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        OverhaulOrePlacedFeatures.bootstrap(featureRegisterable);
        OverhaulTreePlacedFeatures.bootstrap(featureRegisterable);
        OverhaulVegetationPlacedFeatures.bootstrap(featureRegisterable);
    }

    public static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(WithersOverhaul.MOD_ID, id));
    }
}
