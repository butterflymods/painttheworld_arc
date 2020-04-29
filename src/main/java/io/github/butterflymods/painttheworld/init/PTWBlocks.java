package io.github.butterflymods.painttheworld.init;

import co.origamigames.sheet.SheetLib;
import co.origamigames.sheet.block.helpers.ColorBlocks;
import io.github.butterflymods.painttheworld.PaintTheWorld;
import io.github.butterflymods.painttheworld.block.*;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class PTWBlocks {
    public PTWBlocks() {
        PaintTheWorld.log("    Blocks");
    }

    private static final ColorBlocks CREAM = new ColorBlocks(ColorBlocksInfo.CREAM);
    private static final ColorBlocks TAN = new ColorBlocks(ColorBlocksInfo.TAN);
    private static final ColorBlocks AMBER = new ColorBlocks(ColorBlocksInfo.AMBER);
    private static final ColorBlocks PEACH = new ColorBlocks(ColorBlocksInfo.PEACH);
    private static final ColorBlocks MAROON = new ColorBlocks(ColorBlocksInfo.MAROON);
    private static final ColorBlocks PLUM = new ColorBlocks(ColorBlocksInfo.PLUM);
    private static final ColorBlocks LAVENDER = new ColorBlocks(ColorBlocksInfo.LAVENDER);
    private static final ColorBlocks MAUVE = new ColorBlocks(ColorBlocksInfo.MAUVE);
    public static ColorBlocks[] COLORS = { CREAM, TAN, AMBER, PEACH, MAROON, PLUM, LAVENDER, MAUVE };

    public static final Block DYE_TABLE = register(DyeTableBlock.id, new DyeTableBlock());

    private static Block register(String id, Block block) {
        return SheetLib.block(PaintTheWorld.MOD_ID, id, PaintTheWorld.ITEM_GROUP, block);
    }

    public static class ColorBlocksInfo {
        private static final ColorBlocks.Info CREAM = new ColorBlocks.Info();
        private static final ColorBlocks.Info TAN = new ColorBlocks.Info();
        private static final ColorBlocks.Info AMBER = new ColorBlocks.Info();
        private static final ColorBlocks.Info PEACH = new ColorBlocks.Info();
        private static final ColorBlocks.Info MAROON = new ColorBlocks.Info();
        private static final ColorBlocks.Info PLUM = new ColorBlocks.Info();
        private static final ColorBlocks.Info LAVENDER = new ColorBlocks.Info();
        private static final ColorBlocks.Info MAUVE = new ColorBlocks.Info();
        public static ColorBlocks.Info[] COLOR_INFO = { CREAM, TAN, AMBER, PEACH, MAROON, PLUM, LAVENDER, MAUVE };

        static {
            CREAM.color = "cream";
            TAN.color = "tan";
            AMBER.color = "amber";
            PEACH.color = "peach";
            MAROON.color = "maroon";
            PLUM.color = "plum";
            LAVENDER.color = "lavender";
            MAUVE.color = "mauve";

            for (ColorBlocks.Info colorBlocksInfo : COLOR_INFO) {
                colorBlocksInfo.mod_id = PaintTheWorld.MOD_ID;
                colorBlocksInfo.item_group = PaintTheWorld.ITEM_GROUP;
            }
        }
    }

    static {
        for (ColorBlocks colorBlocks : COLORS) {
            SheetLib.setTransparencyRenderLayer(colorBlocks.bedBlock);
            setTranslucentRenderLayer(colorBlocks.stained_glass);
            setTranslucentRenderLayer(colorBlocks.stained_glass_pane);
        }
    }
    private static void setTranslucentRenderLayer(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
    }
}
