package me.timmypasta.myfirstmod;

import me.timmypasta.myfirstmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class MyFirstMod
{
	public static final CreativeTabs ModTab = null;
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		proxy.PreInit(event);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		proxy.Init(event);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		proxy.PostInit(event);
	}
}
