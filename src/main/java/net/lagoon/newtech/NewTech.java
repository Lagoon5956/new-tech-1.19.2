package net.lagoon.newtech;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lagoon.newtech.item.Moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewTech implements ModInitializer {
	public static final String MOD_ID = "newtech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditems.registerModItems();
		FuelRegistry.INSTANCE.add(Moditems.COAL_DUST, 200);
		LOGGER.info("Hello Fabric world!");
	}
}