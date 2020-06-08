package idiot_with_a_uke.tinkersdecoration.blocks;

import idiot_with_a_uke.tinkersdecoration.Main;
import idiot_with_a_uke.tinkersdecoration.init.TideBlocks;
import idiot_with_a_uke.tinkersdecoration.init.TideItems;
import idiot_with_a_uke.tinkersdecoration.reference.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		TideBlocks.BLOCKS.add(this);
		TideItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}

}
