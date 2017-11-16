package me.timmypasta.myfirstmod.init;

import me.timmypasta.myfirstmod.MyFirstMod;
import me.timmypasta.myfirstmod.init.items.Weapon;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit
{
	public static Item Cane;
	
	public static void init()
	{
		Cane = new Weapon("Cane");
	}
	
	public static void register()
	{
		registerItem(Cane);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(MyFirstMod.ModTab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
