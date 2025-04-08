package me.withers_overhaul.datagen.fabric;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;

public class OverhaulDataGen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(BlockLootTableGen::new);
        pack.addProvider(BlockTagGen::new);
        pack.addProvider(ItemTagGen::new);
        pack.addProvider(BiomeTagGen::new);
        pack.addProvider(RecipeGen::new);
        pack.addProvider(ModelGen::new);
        pack.addProvider(LangGen::new);
        pack.addProvider(OverhaulDynamicRegistryProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        OverhaulDynamicRegistryProvider.buildRegistry(registryBuilder);
    }
}
