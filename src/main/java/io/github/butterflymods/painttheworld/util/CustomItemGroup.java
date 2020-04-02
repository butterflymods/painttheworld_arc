package io.github.butterflymods.painttheworld.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CustomItemGroup extends ItemGroup {
    private Item item;

    public CustomItemGroup(String mod_id, Item item) {
        super(mod_id);
        this.item = item;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(item);
    }
}
