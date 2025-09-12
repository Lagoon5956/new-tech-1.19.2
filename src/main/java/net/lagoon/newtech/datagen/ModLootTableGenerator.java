package net.lagoon.newtech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.lagoon.newtech.NewTech;
import net.lagoon.newtech.block.Modblocks;
import net.lagoon.newtech.item.Moditems;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModLootTableGenerator extends SimpleFabricLootTableProvider {
    public ModLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(NewTech.MOD_ID, "blocks/steel_block"),
                BlockLootTableGenerator.drops(Modblocks.STEEL_BLOCK));


        identifierBuilderBiConsumer.accept(new Identifier(NewTech.MOD_ID, "blocks/coal_dblock"),
                BlockLootTableGenerator.drops(Modblocks.COAL_DBLOCK, Moditems.COAL_DUST));
        identifierBuilderBiConsumer.accept(new Identifier(NewTech.MOD_ID, "blocks/ch_diamondb"),
                BlockLootTableGenerator.drops(Modblocks.CHARGED_DIAMONDB));

    }
}
