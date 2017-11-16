package me.timmypasta.myfirstmod.handlers;

import me.timmypasta.myfirstmod.init.ItemInit;

public class RegistryHandler
{
	public static void Client()
	{
		ItemInit.register();
	}
	
	public static void Common()
	{
		ItemInit.init();
	}
}
