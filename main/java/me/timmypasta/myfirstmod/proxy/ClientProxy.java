package me.timmypasta.myfirstmod.proxy;

import me.timmypasta.myfirstmod.handlers.RegistryHandler;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	public void PreInit(FMLPreInitializationEvent event)
	{
		super.PreInit(event);
	}
	
	public void Init(FMLInitializationEvent event)
	{
		super.Init(event);
		RegistryHandler.Client();
	}
	
	public void PostInit(FMLPostInitializationEvent event)
	{
		super.PostInit(event);
	}
}
