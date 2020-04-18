package io.github.butterflymods.painttheworld.item;

import io.github.butterflymods.painttheworld.init.PTWItems;
import net.minecraft.item.Item;

public class PaintbrushItem extends Item {
    public static final String id = "paintbrush";

    public PaintbrushItem() {
        super(PTWItems.DEFAULT_ITEM_SETTINGS.maxCount(1));
    }
}
