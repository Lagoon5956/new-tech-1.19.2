package net.lagoon.newtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ModModelProvider::new);
        fabricDataGenerator.addProvider(ModRecipeGenorator::new);
        fabricDataGenerator.addProvider(ModLootTableGenerator::new);

    }
}
