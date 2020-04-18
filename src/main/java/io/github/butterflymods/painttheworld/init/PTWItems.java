package io.github.butterflymods.painttheworld.init;

import co.origamigames.sheet.SheetLib;
import io.github.butterflymods.painttheworld.PaintTheWorld;
import io.github.butterflymods.painttheworld.item.PaintbrushItem;
import net.minecraft.item.Item;

public class PTWItems {
    public PTWItems() {
        PaintTheWorld.log("    Items");
    }

    public static final Item.Settings DEFAULT_ITEM_SETTINGS = new Item.Settings().group(PaintTheWorld.ITEM_GROUP);

    public static final Item PAINTBRUSH = register(PaintbrushItem.id, new PaintbrushItem());

    private static Item register(String id, Item item) {
        return SheetLib.item(PaintTheWorld.MOD_ID, id, item);
    }
}
