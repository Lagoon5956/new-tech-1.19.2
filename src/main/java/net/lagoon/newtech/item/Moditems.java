package net.lagoon.newtech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lagoon.newtech.NewTech;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class Moditems {

    public static final Item COAL_DUST = registerItem("coal_dust",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));

    public static final Item STEEL_IN = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));
    public static final Item STEEL_NUG = registerItem("steel_nugget",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));

    public static final Item SCREAM_CORE = registerItem("scream_core",
            new Item(new FabricItemSettings().group(ModitemGroup.SITEMS).rarity(Rarity.EPIC).maxCount(1)));



    public static final Item C_IRON = registerItem("carbon_iron",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));

    public static final Item R_SCULKSHARD = registerItem("r_sculkshard",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));

    public static final Item REDSTONE_WIRE = registerItem("redstone_wire",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));
    public static final Item GOLD_WIRE = registerItem("gold_wire",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));
    public static final Item WIRE_WEAVE = registerItem("wire_weave",
            new Item(new FabricItemSettings().group(ModitemGroup.NEWTECH)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NewTech.MOD_ID, name), item);
    }


    public static void registerModItems(){
        NewTech.LOGGER.debug("Registiring Mod Items for " + NewTech.MOD_ID);
    }
}
