package io.github.butterflymods.painttheworld.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;

public class DyeTableBlock extends CraftingTableBlock {
    public static final String id = "dye_table";

    public DyeTableBlock() {
        super(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE).build());
    }
}
