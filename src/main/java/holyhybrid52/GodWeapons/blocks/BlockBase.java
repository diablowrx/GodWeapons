package holyhybrid52.GodWeapons.blocks;

import holyhybrid52.GodWeapons.Main;
import holyhybrid52.GodWeapons.init.ModBlocks;
import holyhybrid52.GodWeapons.init.ModItems;
import holyhybrid52.GodWeapons.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by David on 2/27/2018.
 */
public class BlockBase extends Block implements IHasModel{
    public BlockBase(String name, Material material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
