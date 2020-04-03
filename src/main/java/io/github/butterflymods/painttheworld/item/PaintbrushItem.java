package io.github.butterflymods.painttheworld.item;

        import io.github.butterflymods.painttheworld.PaintTheWorld;
        import net.minecraft.item.Item;

public class PaintbrushItem extends Item {
    public static final String id = "paintbrush";

    public PaintbrushItem() {
        super(new Properties().group(PaintTheWorld.ITEM_GROUP).maxStackSize(1));
    }
}
