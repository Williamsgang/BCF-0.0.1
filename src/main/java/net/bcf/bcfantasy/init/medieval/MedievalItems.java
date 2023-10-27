package net.bcf.bcfantasy.init.medieval;

import net.bcf.bcfantasy.core.BullCapFantasy;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MedievalItems {
    public static final DeferredRegister<Item> MEDIEVAL_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BullCapFantasy.MOD_ID);



    public static void register(IEventBus eventBus) {
        MEDIEVAL_ITEMS.register(eventBus);
    }
}
