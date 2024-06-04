package drag0n1zed.biologic.item;

import drag0n1zed.biologic.BioLogic;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DNA = registerItem("dna", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BioLogic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BioLogic.LOGGER.info("Registering ModItems for " + BioLogic.MOD_ID);
    }
}
