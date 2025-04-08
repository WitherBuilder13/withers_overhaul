package me.withers_overhaul;

import me.withers_overhaul.client.OverhaulRenderer;
import me.withers_overhaul.registry.block.OverhaulBlocks;
import me.withers_overhaul.registry.item.OverhaulItemGroups;
import me.withers_overhaul.registry.item.OverhaulItems;
import me.withers_overhaul.world.feature.OverhaulFeatureUtils;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WithersOverhaul implements ModInitializer {
	public static final String MOD_ID = "withers_overhaul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		OverhaulItems.registerItems();
		OverhaulBlocks.registerBlocks();
		OverhaulItemGroups.registerItemGroups();
		OverhaulFeatureUtils.registerFeatureUtils();
		OverhaulRenderer.registerRenderers();

		LOGGER.info("Wither's Overhaul is overhauling");
	}
}

