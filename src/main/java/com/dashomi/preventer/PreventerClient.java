package com.dashomi.preventer;

import com.dashomi.preventer.config.PreventerConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class PreventerClient implements ClientModInitializer {
	public static final String MOD_ID = "preventer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	static PreventerConfig config;

	@Override
	public void onInitializeClient() {
		config = PreventerConfig.initialize();
	}
}
