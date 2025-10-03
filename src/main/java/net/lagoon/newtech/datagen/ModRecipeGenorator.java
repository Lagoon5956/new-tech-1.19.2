package net.lagoon.newtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lagoon.newtech.block.Modblocks;
import net.lagoon.newtech.item.Moditems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenorator extends FabricRecipeProvider {
    public ModRecipeGenorator(FabricDataGenerator dataGenerator) {
        super(dataGenerator); }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exportor) {

        offerReversibleCompactingRecipes(exportor,
                Moditems.COAL_DUST, Items.COAL);

        offerReversibleCompactingRecipes(exportor,
                Moditems.STEEL_IN, Modblocks.STEEL_BLOCK);

        FabricRecipeProvider.offerReversibleCompactingRecipes(exportor,
                Moditems.CHARGED_DIAMOND, Modblocks.CHARGED_DIAMONDB);

        ShapelessRecipeJsonBuilder.create(Moditems.STEEL_NUG, 9)
                .input(Moditems.STEEL_IN)
                .criterion("has_steel_ingot", conditionsFromItem(Moditems.STEEL_IN))
                .offerTo(exportor, new Identifier("newtech", "steel_nug"));

        ShapelessRecipeJsonBuilder.create(Moditems.WIRE_COAT, 1)
                        .input(Moditems.GEL)
                        .input(Items.BLACK_DYE)
                        .criterion("has_gel", conditionsFromItem(Moditems.GEL))
                        .offerTo(exportor, new Identifier("newtech", "wire_coat"));



        ShapedRecipeJsonBuilder.create(Modblocks.COAL_DBLOCK, 1)
                .pattern("##")
                .pattern("##")
                .input('#', Moditems.COAL_DUST)
                .criterion(RecipeProvider.hasItem(Moditems.COAL_DUST),
                        RecipeProvider.conditionsFromItem(Moditems.COAL_DUST))
                .offerTo(exportor, new Identifier("newtech", "coal_dblockm"));

        ShapedRecipeJsonBuilder.create(Moditems.STEEL_IN, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Moditems.STEEL_NUG)
                .criterion(RecipeProvider.hasItem(Moditems.STEEL_IN),
                        RecipeProvider.conditionsFromItem(Moditems.STEEL_IN))
                .offerTo(exportor, new Identifier("newtech", "steelin_fromnug"));

        ShapelessRecipeJsonBuilder.create(Moditems.COAL_DUST, 4)
                .input(Modblocks.COAL_DBLOCK)
                .criterion("has_coal_dust", conditionsFromItem(Moditems.COAL_DUST))
                .offerTo(exportor, new Identifier("newtech", "coal_dust_fromblock"));


        FabricRecipeProvider.offerSmelting(exportor,
                List.of(Moditems.C_IRON),

                Moditems.STEEL_IN,
                0.6f,
                900,
                "Ciron_to_steel"
        );

        FabricRecipeProvider.offerSmelting(exportor,
                List.of(Items.SLIME_BALL),

                Moditems.GEL,
                0.2f,
                350,
                "gel_recipe"
        );

        FabricRecipeProvider.offerBlasting(exportor,
                List.of(Moditems.C_IRON),
                Moditems.STEEL_IN,
                0.6f,
                600,
                "Ciron_to_steel");


    }
}
