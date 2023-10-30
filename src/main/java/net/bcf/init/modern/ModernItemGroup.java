package net.bcf.init.modern;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModernItemGroup {

    private static final ItemGroup MODERN_ITEM_GROUP = new ItemGroup("modern_item_group") {
        @Override
        public ItemStack makeIcon() {
//            return new ItemStack(ModernItems.LEWIS_GUN.get());
        return null;
        }
    };

    public static ItemGroup getModernItemGroup() {
        return MODERN_ITEM_GROUP;
    }
}
