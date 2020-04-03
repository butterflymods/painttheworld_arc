package io.github.butterflymods.painttheworld.block;

import io.github.butterflymods.painttheworld.PaintTheWorld;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;

public class DyeTableBlock extends CraftingTableBlock {
    public static final String id = "dye_table";
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().group(PaintTheWorld.ITEM_GROUP);

    public DyeTableBlock() {
        super(Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.5F).sound(SoundType.WOOD));
    }
}
