package me.withers_overhaul.datagen.fabric;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.world.biome.OverhaulBiomes;
import me.withers_overhaul.world.feature.OverhaulConfiguredFeatures;
import me.withers_overhaul.world.feature.OverhaulPlacedFeatures;
import me.withers_overhaul.world.gen.OverhaulChunkGenerator;
import me.withers_overhaul.world.gen.OverhaulNoiseParameters;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class OverhaulDynamicRegistryProvider extends FabricDynamicRegistryProvider {
    public OverhaulDynamicRegistryProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.BIOME, OverhaulBiomes::bootstrap)
                .addRegistry(RegistryKeys.CONFIGURED_FEATURE, OverhaulConfiguredFeatures::bootstrap)
                .addRegistry(RegistryKeys.PLACED_FEATURE, OverhaulPlacedFeatures::bootstrap)
                .addRegistry(RegistryKeys.CHUNK_GENERATOR_SETTINGS, OverhaulChunkGenerator::bootstrap)
                .addRegistry(RegistryKeys.NOISE_PARAMETERS, OverhaulNoiseParameters::bootstrap)
        ;
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        addAll(entries, registries.getOrThrow(RegistryKeys.BIOME));
        addAllVanilla(entries, registries.getOrThrow(RegistryKeys.BIOME));
        addAll(entries, registries.getOrThrow(RegistryKeys.CONFIGURED_FEATURE));
        addAll(entries, registries.getOrThrow(RegistryKeys.PLACED_FEATURE));
        addAll(entries, registries.getOrThrow(RegistryKeys.CHUNK_GENERATOR_SETTINGS));
        addAll(entries, registries.getOrThrow(RegistryKeys.NOISE_PARAMETERS));
    }

    @Override
    public String getName() {
        return "Wither's Overhaul Dynamic Registries";
    }

    @SuppressWarnings("UnusedReturnValue")
    public  <T>List<RegistryEntry<T>> addAll(Entries entries, RegistryWrapper.Impl<T> registry) {
        return registry.streamKeys()
                .filter(registryKey -> registryKey.getValue().getNamespace().equals(WithersOverhaul.MOD_ID))
                .map(key -> entries.add(registry, key))
                .toList();
    }

    @SuppressWarnings("UnusedReturnValue")
    public  <T>List<RegistryEntry<T>> addAllVanilla(Entries entries, RegistryWrapper.Impl<T> registry) {
        return registry.streamKeys()
                .filter(registryKey -> registryKey.getValue().getNamespace().equals("vanilla"))
                .map(key -> entries.add(registry, key))
                .toList();
    }
}
