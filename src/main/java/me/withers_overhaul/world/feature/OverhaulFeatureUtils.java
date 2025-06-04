package me.withers_overhaul.world.feature;

import com.mojang.serialization.MapCodec;
import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.world.feature.configured.vegetation.util.RedwoodFoliagePlacer;
import me.withers_overhaul.world.feature.configured.vegetation.util.RedwoodTrunkPlacer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class OverhaulFeatureUtils {
    public static final TrunkPlacerType<RedwoodTrunkPlacer> REDWOOD_TRUNK_PLACER = registerTrunkPlacer("redwood_trunk_placer", RedwoodTrunkPlacer.CODEC);
    public static final FoliagePlacerType<RedwoodFoliagePlacer> REDWOOD_FOLIAGE_PLACER = registerFoliagePlacer("redwood_foliage_placer", RedwoodFoliagePlacer.CODEC);

    public static <P extends TrunkPlacer> TrunkPlacerType<P> registerTrunkPlacer(String id, MapCodec<P> codec) {
        return Registry.register(Registries.TRUNK_PLACER_TYPE, Identifier.of(WithersOverhaul.MOD_ID, id), new TrunkPlacerType<>(codec));
    }

    public static <P extends FoliagePlacer> FoliagePlacerType<P> registerFoliagePlacer(String id, MapCodec<P> codec) {
        return Registry.register(Registries.FOLIAGE_PLACER_TYPE, Identifier.of(WithersOverhaul.MOD_ID, id), new FoliagePlacerType<>(codec));
    }

    public static void registerFeatureUtils() {
        WithersOverhaul.LOGGER.info("Registering Feature Utils");
    }
}
