package io.github.mildesttoucan.permasnow;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PermaSnow implements ModInitializer {
	public static final String MOD_ID = "permasnow";

	public static boolean SHOULD_MELT = false;

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("PermaSnow is initializing!");
	}
}