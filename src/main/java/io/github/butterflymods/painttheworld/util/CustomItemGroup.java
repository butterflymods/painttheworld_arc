package io.github.butterflymods.painttheworld.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

public class CustomItemGroup extends ItemGroup {
    private RegistryObject<Item> item;

    public CustomItemGroup(String mod_id, RegistryObject<Item> item) {
        super(mod_id + ".item_group");
        this.item = item;
    }
    public CustomItemGroup(String mod_id, RegistryObject<Item> item, String suffix) {
        super(mod_id + suffix);
        this.item = item;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(item.get());
    }
}
