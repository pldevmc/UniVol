package com.pldevmc.univol;

import com.pldevmc.univol.proxy.CommonProxy;
import com.pldevmc.univol.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;




//@Mod odpowiada za inicjalizacje moda
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main //jest to g³owna klasa moda
{
	
	@Instance
	public static Main instance; //jest to instancja g³ownej klasy moda
	
	
	@SidedProxy(clientSide = Reference.CLIENT , serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	
	@EventHandler
	//Funkcja preInit() jest uruchamiana podczas pre-Inicjalizacji moda
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
	//Funkcja preInit() jest uruchamiana podczas Inicjalizacji moda
	public void init(FMLInitializationEvent event)
	{
		
	}
	@EventHandler
	//Funkcja preInit() jest uruchamiana podczas post-Inicjalizacji moda
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
	
	
}
