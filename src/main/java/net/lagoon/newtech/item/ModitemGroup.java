package net.lagoon.newtech.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lagoon.newtech.NewTech;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModitemGroup {
    public static final ItemGroup NEWTECH = FabricItemGroupBuilder.build(
            new Identifier(NewTech.MOD_ID, "new_tech"), () -> new ItemStack(Moditems.COAL_DUST));
    public static final ItemGroup SITEMS = FabricItemGroupBuilder.build(
            new Identifier(NewTech.MOD_ID, "sitems"), () -> new ItemStack(Moditems.SCREAM_CORE));
    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(
            new Identifier(NewTech.MOD_ID, "tools"), () -> new ItemStack(Moditems.STEEL_IN));
}
