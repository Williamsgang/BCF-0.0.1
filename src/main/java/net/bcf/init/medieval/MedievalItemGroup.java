package net.bcf.init.medieval;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MedievalItemGroup {
    private static final ItemGroup MEDIEVAL_ARMOR_ITEM_GROUP = new ItemGroup("medieval_armor_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MedievalItems.COPPER_INGOT.get());
        }
    };

    public static ItemGroup getMedievalArmorItemGroup() {
        return MEDIEVAL_ARMOR_ITEM_GROUP;
    }

    private static final ItemGroup MEDIEVAL_METALS_AND_STONES_ITEM_GROUP = new ItemGroup("medieval_metals_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MedievalItems.SILVER_INGOT.get());
        }
    };

    public static ItemGroup getMedievalMetalsItemGroup() {
        return MEDIEVAL_METALS_AND_STONES_ITEM_GROUP;
    }

    private static final ItemGroup MEDIEVAL_WEAPONS_ITEM_GROUP = new ItemGroup("medieval_weapons_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MedievalItems.SILVER_INGOT.get());
        }
    };

    public static ItemGroup getMedievalWeaponsItemGroup() {
        return MEDIEVAL_WEAPONS_ITEM_GROUP;
    }

    private static final ItemGroup MEDIEVAL_MATERIALS_ITEM_GROUP = new ItemGroup("medieval_materials_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MedievalItems.MITHRIL_INGOT.get());
        }
    };

    public static ItemGroup getMedievalMaterialsItemGroup() {
        return MEDIEVAL_MATERIALS_ITEM_GROUP;
    }

    private static final ItemGroup MEDIEVAL_BLADES_ITEM_GROUP = new ItemGroup("medieval_blades_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MedievalItems.MITHRIL_INGOT.get());
        }
    };
    public static ItemGroup getMedievalBladesItemGroup() {
        return MEDIEVAL_BLADES_ITEM_GROUP;
    }

    private static final ItemGroup MEDIEVAL_TOOLS_ITEM_GROUP = new ItemGroup("medieval_tools_item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MedievalItems.BRONZE_PICKAXE.get());
        }
    };

    public static ItemGroup getMedievalToolsItemGroup() {
        return MEDIEVAL_TOOLS_ITEM_GROUP;
    }
}
