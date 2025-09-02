package net.lagoon.newtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class ModRecipeGenorator extends FabricRecipeProvider {
    public ModRecipeGenorator(FabricDataGenerator dataGenerator) { super(dataGenerator); }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> consumer) {




    }
}
