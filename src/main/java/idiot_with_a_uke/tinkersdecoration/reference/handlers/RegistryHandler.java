package idiot_with_a_uke.tinkersdecoration.reference.handlers;

import idiot_with_a_uke.tinkersdecoration.init.TideItems;
import idiot_with_a_uke.tinkersdecoration.reference.IHasModel;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(TideItems.ITEMS.toArray(new Item[0]));

	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : TideItems.ITEMS) {
			
			if(item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();

			}

		}

	}

}
