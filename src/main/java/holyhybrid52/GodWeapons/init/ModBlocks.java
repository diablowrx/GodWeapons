package holyhybrid52.GodWeapons.init;

import holyhybrid52.GodWeapons.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2/27/2018.
 */
public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block TEST_BLOCK = new BlockBase("test_block", Material.IRON);
}
