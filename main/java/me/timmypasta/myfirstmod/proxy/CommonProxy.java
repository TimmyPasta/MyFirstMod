package me.timmypasta.myfirstmod.proxy;

import me.timmypasta.myfirstmod.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.Common();
	}
	
	public void Init(FMLInitializationEvent event)
	{
	
	}
	
	public void PostInit(FMLPostInitializationEvent event)
	{
	
	}
}
