package net.benji.benjimod;

import net.benji.benjimod.item.ModItemGroups;
import net.benji.benjimod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BenjiMod implements ModInitializer {

	public static final String MOD_ID = "benjimod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}