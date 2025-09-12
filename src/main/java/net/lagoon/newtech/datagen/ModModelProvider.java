package net.lagoon.newtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lagoon.newtech.block.Modblocks;
import net.lagoon.newtech.item.Moditems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

import java.nio.file.Path;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }


    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
    blockStateModelGenerator.registerCubeAllModelTexturePool(Modblocks.STEEL_BLOCK);
    blockStateModelGenerator.registerCubeAllModelTexturePool(Modblocks.COAL_DBLOCK);
    blockStateModelGenerator.registerCubeAllModelTexturePool(Modblocks.CHARGED_DIAMONDB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Moditems.COAL_DUST, Models.GENERATED);
        itemModelGenerator.register(Moditems.STEEL_IN, Models.GENERATED);
        itemModelGenerator.register(Moditems.STEEL_NUG, Models.GENERATED);
        itemModelGenerator.register(Moditems.C_IRON, Models.GENERATED);
        itemModelGenerator.register(Moditems.REDSTONE_WIRE, Models.GENERATED);
        itemModelGenerator.register(Moditems.R_SCULKSHARD, Models.GENERATED);
        itemModelGenerator.register(Moditems.GOLD_WIRE, Models.GENERATED);
        itemModelGenerator.register(Moditems.WIRE_WEAVE, Models.GENERATED);
        itemModelGenerator.register(Moditems.CHARGED_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(Moditems.COPPER_WIRE, Models.GENERATED);

    }
}