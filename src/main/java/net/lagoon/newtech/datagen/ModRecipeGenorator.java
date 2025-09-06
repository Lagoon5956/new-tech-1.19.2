package net.lagoon.newtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lagoon.newtech.item.Moditems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenorator extends FabricRecipeProvider {
    public ModRecipeGenorator(FabricDataGenerator dataGenerator) { super(dataGenerator); }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exportor) {

        offerReversibleCompactingRecipes(exportor, Moditems.COAL_DUST, Items.COAL);
        offerReversibleCompactingRecipes(exportor, Moditems.STEEL_NUG, Moditems.STEEL_IN);




    }
}
