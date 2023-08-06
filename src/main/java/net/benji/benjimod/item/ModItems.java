package net.benji.benjimod.item;

import net.benji.benjimod.BenjiMod;
import net.benji.benjimod.item.custom.ModAxeItem;
import net.benji.benjimod.item.custom.ModHoeItem;
import net.benji.benjimod.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterials.RUBY,
            1, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new ModAxeItem(ModToolMaterials.RUBY,
            2, 1.5f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new ModHoeItem(ModToolMaterials.RUBY,
            0, 0f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterials.RUBY,
            0, 1f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new ModPickaxeItem(ModToolMaterials.RUBY,
            1, 0f, new FabricItemSettings()));


    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(RUBY_HOE);
        entries.add(RUBY_SHOVEL);
        entries.add(RUBY_SWORD);
        entries.add(RUBY_PICKAXE);
        entries.add(RUBY_AXE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BenjiMod.MOD_ID, name),
                item);

    }

    public static void registerModItems() {
        BenjiMod.LOGGER.info("Registering mod items for" + BenjiMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}
