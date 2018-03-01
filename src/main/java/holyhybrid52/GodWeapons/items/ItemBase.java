package holyhybrid52.GodWeapons.items;

import holyhybrid52.GodWeapons.Main;
import holyhybrid52.GodWeapons.init.ModItems;
import holyhybrid52.GodWeapons.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by David on 2/27/2018.
 */
public class ItemBase extends Item implements IHasModel{
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
