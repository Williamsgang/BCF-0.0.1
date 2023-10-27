package net.bcf.bcfantasy.init.modern;

import net.bcf.bcfantasy.core.BullCapFantasy;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModernItems {
    public static final DeferredRegister<Item> MODERN_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BullCapFantasy.MOD_ID);



    public static void register(IEventBus eventBus) {
        MODERN_ITEMS.register(eventBus);
    }
}
