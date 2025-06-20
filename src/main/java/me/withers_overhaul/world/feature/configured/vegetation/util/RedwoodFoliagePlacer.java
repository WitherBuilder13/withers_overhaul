package me.withers_overhaul.world.feature.configured.vegetation.util;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.withers_overhaul.world.feature.OverhaulFeatureUtils;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class RedwoodFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<RedwoodFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(
            instance -> fillFoliagePlacerFields(instance)
                    .and(IntProvider.createValidatingCodec(0, 24).fieldOf("crown_height").forGetter(placer -> placer.crownHeight))
                    .apply(instance, RedwoodFoliagePlacer::new)
    );

    private final IntProvider crownHeight;

    public RedwoodFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider crownHeight) {
        super(radius, offset);
        this.crownHeight = crownHeight;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return OverhaulFeatureUtils.REDWOOD_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(
            TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset
    ) {

    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.crownHeight.get(random);
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
