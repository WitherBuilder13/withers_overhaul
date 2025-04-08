package me.withers_overhaul.tag;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

import static me.withers_overhaul.WithersOverhaul.MOD_ID;

public class OverhaulBiomeTags {

    public static final TagKey<Biome> TEMPERATURE_SNOWY = BiomeTagKey("temperature/snowy");
    public static final TagKey<Biome> TEMPERATURE_COLD = BiomeTagKey("temperature/cold");
    public static final TagKey<Biome> TEMPERATURE_COOL = BiomeTagKey("temperature/cool");
    public static final TagKey<Biome> TEMPERATURE_TEMPERATE = BiomeTagKey("temperature/temperate");
    public static final TagKey<Biome> TEMPERATURE_WARM = BiomeTagKey("temperature/warm");
    public static final TagKey<Biome> TEMPERATURE_HOT = BiomeTagKey("temperature/hot");

    public static TagKey<Biome> BiomeTagKey(String name) {
        return TagKey.of(RegistryKeys.BIOME, Identifier.of(MOD_ID, name));
    }
}
