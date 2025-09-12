package net.lagoon.newtech.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lagoon.newtech.NewTech;
import net.lagoon.newtech.item.ModitemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Modblocks {

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.2f, 1000f).requiresTool()
                    .sounds(BlockSoundGroup.METAL)), ModitemGroup.NEWTECH);
    public static final Block COAL_DBLOCK = registerBlock("coal_dblock",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.6f).requiresTool().strength(0.1f, 0.1f)
                    .sounds(BlockSoundGroup.GRAVEL)), ModitemGroup.NEWTECH);
    public static final Block CHARGED_DIAMONDB = registerBlock("ch_diamondb",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1f).requiresTool().strength(1f, 5.0f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModitemGroup.NEWTECH);






    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(NewTech.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(NewTech.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }



    public static void registerModblocks(){
        NewTech.LOGGER.debug("Registering Modblocks for " + NewTech.MOD_ID);
    }
}
