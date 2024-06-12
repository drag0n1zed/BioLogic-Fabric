package drag0n1zed.biologic.ui;

import drag0n1zed.biologic.BioLogic;
import drag0n1zed.biologic.block.ModBlocks;
import drag0n1zed.biologic.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BIOLOGIC_GROUP =
            Registry.register(Registries.ITEM_GROUP, new Identifier(BioLogic.MOD_ID, "dna"),
                    FabricItemGroup.builder()
                            .displayName(Text.translatable("itemGroup.biologic"))
                            .icon(() -> new ItemStack(ModItems.DNA))
                            .entries((displayContext, entries) -> {
                                entries.add(ModItems.DNA);
                                entries.add(ModItems.PRIMA_MATERIA);
                                entries.add(ModBlocks.BIOTECH_FRAME);
                                entries.add(ModBlocks.PRIMA_MATERIA_ORE);
                                entries.add(ModItems.MAGIC_WAND);
                            })
                            .build());

    public static void registerItemGroups() {
        BioLogic.LOGGER.info("Registering ModItemGroups for " + BioLogic.MOD_ID);
    }
}
