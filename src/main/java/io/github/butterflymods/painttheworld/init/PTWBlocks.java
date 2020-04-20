package io.github.butterflymods.painttheworld.init;

import co.origamigames.sheet.SheetLib;
import co.origamigames.sheet.block.helpers.ColorBlocks;
import io.github.butterflymods.painttheworld.PaintTheWorld;
import io.github.butterflymods.painttheworld.block.*;
import net.minecraft.block.Block;

public class PTWBlocks {
    public PTWBlocks() {
        PaintTheWorld.log("    Blocks");
    }

    public static ColorBlocks CREAM = new ColorBlocks(ColorBlocksInfo.CREAM);
    public static ColorBlocks MAUVE = new ColorBlocks(ColorBlocksInfo.CREAM);

    public static final Block DYE_TABLE = register(DyeTableBlock.id, new DyeTableBlock());

    private static Block register(String id, Block block) {
        return SheetLib.block(PaintTheWorld.MOD_ID, id, PaintTheWorld.ITEM_GROUP, block);
    }

    public static class ColorBlocksInfo {
        public static ColorBlocks.Info CREAM = new ColorBlocks.Info();
        public static ColorBlocks.Info MAUVE = new ColorBlocks.Info();

        static {
            CREAM.color = "cream";
            CREAM.mod_id = PaintTheWorld.MOD_ID;
            CREAM.item_group = PaintTheWorld.ITEM_GROUP;
            MAUVE.color = "mauve";
            MAUVE.mod_id = PaintTheWorld.MOD_ID;
            MAUVE.item_group = PaintTheWorld.ITEM_GROUP;
        }
    }
}
