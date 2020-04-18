package io.github.butterflymods.painttheworld.init;

import co.origamigames.sheet.SheetLib;
import io.github.butterflymods.painttheworld.PaintTheWorld;
import io.github.butterflymods.painttheworld.block.*;
import net.minecraft.block.Block;

public class PTWBlocks {
    public PTWBlocks() {
        PaintTheWorld.log("    Blocks");
    }

    public static final Block DYE_TABLE = register(DyeTableBlock.id, new DyeTableBlock());

    private static Block register(String id, Block block) {
        return SheetLib.block(PaintTheWorld.MOD_ID, id, PaintTheWorld.ITEM_GROUP, block);
    }
}
