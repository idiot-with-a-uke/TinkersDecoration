package idiot_with_a_uke.tinkersdecoration.items;

import idiot_with_a_uke.tinkersdecoration.Main;
import idiot_with_a_uke.tinkersdecoration.init.TideItems;
import idiot_with_a_uke.tinkersdecoration.reference.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		TideItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
