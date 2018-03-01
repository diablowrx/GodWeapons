package holyhybrid52.GodWeapons.items;

import holyhybrid52.GodWeapons.Main;
import holyhybrid52.GodWeapons.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by David on 2/28/2018.
 */
public class LightningBolt extends ItemBase{
    public LightningBolt(String name){
        super(name);
        setCreativeTab(CreativeTabs.COMBAT);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
