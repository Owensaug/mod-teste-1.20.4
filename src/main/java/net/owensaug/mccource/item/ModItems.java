package net.owensaug.mccource.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.owensaug.mccource.MCCourceMod;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MCCourceMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MCCourceMod.LOGGER.info("Registering Mod Items for " + MCCourceMod.MOD_ID);
    }
}