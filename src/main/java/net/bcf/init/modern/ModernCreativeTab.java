package net.bcf.init.modern;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModernCreativeTab {

    private static final ItemGroup MODERN_CREATIVE_TAB = new ItemGroup("modernCreativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModernItems.LEWIS_GUN.get());
        }
    };
}
