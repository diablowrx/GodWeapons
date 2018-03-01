package holyhybrid52.GodWeapons.init;

import holyhybrid52.GodWeapons.items.ItemBase;
import holyhybrid52.GodWeapons.items.LightningBolt;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2/27/2018.
 */
public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item TEST = new ItemBase("test");
    public static final Item ZEUS = new LightningBolt("Zeus' Lightning Bolt");
}
