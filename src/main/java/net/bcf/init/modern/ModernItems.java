package net.bcf.init.modern;

import net.bcf.core.BullCapFantasy;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModernItems {
    public static final DeferredRegister<Item> MODERN_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BullCapFantasy.MOD_ID);

//    public static final RegistryObject<Item> LEWIS_GUN = MODERN_ITEMS.register("lewis_gun", new Properties());


    public static void register(IEventBus eventBus) {
        MODERN_ITEMS.register(eventBus);
    }
}
