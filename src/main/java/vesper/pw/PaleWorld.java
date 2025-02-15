package vesper.pw;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vesper.pw.block.PaleWorldBlocks;
import vesper.pw.entity.EntityGen;
import vesper.pw.entity.Entities;
import vesper.pw.entity.PaleAxolotl.PaleAxolotl;
import vesper.pw.entity.VampireBat.VampireBat;
import vesper.pw.item.PaleWorldItemGroup;
import vesper.pw.item.PaleWorldItems;
import vesper.pw.sound.CustomSounds;

import vesper.pw.world.gen.PaleWorldWorldGen;

public class PaleWorld implements ModInitializer {
	public static final String MOD_ID = "pale-world";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// Register Items, Blocks and World Gen
		MidnightConfig.init(PaleWorld.MOD_ID, PaleWorldConfig.class);
		Entities.init();
		FabricDefaultAttributeRegistry.register(Entities.PALE_AXOLOTL, PaleAxolotl.setAttributes());
		FabricDefaultAttributeRegistry.register(Entities.VAMPIRE_BAT, VampireBat.createHostileAttributes());
		PaleWorldItems.regModItems();
		PaleWorldItemGroup.regItemGroups();
		PaleWorldBlocks.regModBlocks();
		PaleWorldWorldGen.genWorld();
		EntityGen.addSpawns();
	}
}