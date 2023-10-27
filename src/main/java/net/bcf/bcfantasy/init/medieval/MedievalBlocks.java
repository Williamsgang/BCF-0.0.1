package net.bcf.bcfantasy.init.medieval;

import net.bcf.bcfantasy.core.BullCapFantasy;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class MedievalBlocks extends Blocks {
    public static final DeferredRegister<Block> MEDIEVAL_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BullCapFantasy.MOD_ID);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = MEDIEVAL_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return MedievalItems.MEDIEVAL_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        MEDIEVAL_BLOCKS.register(eventBus);
    }
}
