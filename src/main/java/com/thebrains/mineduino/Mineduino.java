package com.thebrains.mineduino;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Mineduino.MODID, name = Mineduino.NAME, version = Mineduino.VERSION)
public class Mineduino {
	public static final String MODID = "mineduino";
	public static final String NAME = "Mineduino";
	public static final String VERSION = "1.0";

	private static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("the Brains are excited to present to you: MINEDUINO");
	}
}
