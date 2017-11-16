package me.timmypasta.myfirstmod.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Weapon extends Item
{
	public Weapon(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
	}
}
