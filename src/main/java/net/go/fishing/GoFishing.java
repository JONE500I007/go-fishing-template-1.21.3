package net.go.fishing;

import net.fabricmc.api.ModInitializer;

import net.go.fishing.block.ModBlocks;
import net.go.fishing.block.ModBlocks2;
import net.go.fishing.component.ModDataComponentTypes;
import net.go.fishing.item.ModItemGroups;
import net.go.fishing.item.ModItems;
import net.minecraft.component.DataComponentTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoFishing implements ModInitializer {
	public static final String MOD_ID = "go-fishing";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModBlocks2.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}