package net.bcf.init.medieval;

import net.bcf.core.BullCapFantasy;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MedievalItems {
    public static final DeferredRegister<Item> MEDIEVAL_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BullCapFantasy.MOD_ID);

    // Materials
    public static final RegistryObject<Item> SILK = MEDIEVAL_ITEMS.register("silk_material", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMaterialsItemGroup())));

    // Raw Ores & Ingots
    public static final RegistryObject<Item> COPPER_INGOT = MEDIEVAL_ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMetalsItemGroup())));
    public static final RegistryObject<Item> MITHRIL_INGOT = MEDIEVAL_ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMetalsItemGroup())));
    public static final RegistryObject<Item> STEEL_INGOT = MEDIEVAL_ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMetalsItemGroup())));
    public static final RegistryObject<Item> BRONZE_INGOT = MEDIEVAL_ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMetalsItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_FRAGMENT = MEDIEVAL_ITEMS.register("obsidian_fragment", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMetalsItemGroup())));
    public static final RegistryObject<Item> SILVER_INGOT = MEDIEVAL_ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalMetalsItemGroup())));

    // Weapons & Tools
    public static final RegistryObject<Item> WOODEN_KNIFE_BLADE = MEDIEVAL_ITEMS.register("wooden_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> WOODEN_SWORD_BLADE = MEDIEVAL_ITEMS.register("wooden_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> WOODEN_AXE_BLADE = MEDIEVAL_ITEMS.register("wooden_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> WOODEN_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("wooden_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> WOODEN_KNIFE = MEDIEVAL_ITEMS.register("wooden_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> WOODEN_BATTLE_AXE = MEDIEVAL_ITEMS.register("wooden_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> WOODEN_LONGSWORD = MEDIEVAL_ITEMS.register("wooden_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));

    public static final RegistryObject<Item> STONE_KNIFE_BLADE = MEDIEVAL_ITEMS.register("stone_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STONE_SWORD_BLADE = MEDIEVAL_ITEMS.register("stone_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STONE_AXE_BLADE = MEDIEVAL_ITEMS.register("stone_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STONE_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("stone_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STONE_KNIFE = MEDIEVAL_ITEMS.register("stone_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STONE_BATTLE_AXE = MEDIEVAL_ITEMS.register("stone_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STONE_LONGSWORD = MEDIEVAL_ITEMS.register("stone_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));

    public static final RegistryObject<Item> IRON_KNIFE_BLADE = MEDIEVAL_ITEMS.register("iron_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> IRON_SWORD_BLADE = MEDIEVAL_ITEMS.register("iron_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> IRON_AXE_BLADE = MEDIEVAL_ITEMS.register("iron_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> IRON_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("iron_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> IRON_KNIFE = MEDIEVAL_ITEMS.register("iron_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> IRON_BATTLE_AXE = MEDIEVAL_ITEMS.register("iron_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> IRON_LONGSWORD = MEDIEVAL_ITEMS.register("iron_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));

    public static final RegistryObject<Item> GOLDEN_KNIFE_BLADE = MEDIEVAL_ITEMS.register("golden_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> GOLDEN_SWORD_BLADE = MEDIEVAL_ITEMS.register("golden_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> GOLDEN_AXE_BLADE = MEDIEVAL_ITEMS.register("golden_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> GOLDEN_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("golden_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> GOLDEN_KNIFE = MEDIEVAL_ITEMS.register("golden_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> GOLDEN_BATTLE_AXE = MEDIEVAL_ITEMS.register("golden_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> GOLDEN_LONGSWORD = MEDIEVAL_ITEMS.register("golden_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));

    public static final RegistryObject<Item> DIAMOND_KNIFE_BLADE = MEDIEVAL_ITEMS.register("diamond_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> DIAMOND_SWORD_BLADE = MEDIEVAL_ITEMS.register("diamond_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> DIAMOND_AXE_BLADE = MEDIEVAL_ITEMS.register("diamond_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("diamond_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> DIAMOND_KNIFE = MEDIEVAL_ITEMS.register("diamond_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> DIAMOND_BATTLE_AXE = MEDIEVAL_ITEMS.register("diamond_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> DIAMOND_LONGSWORD = MEDIEVAL_ITEMS.register("diamond_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));

    public static final RegistryObject<Item> NETHERITE_KNIFE_BLADE = MEDIEVAL_ITEMS.register("netherite_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> NETHERITE_SWORD_BLADE = MEDIEVAL_ITEMS.register("netherite_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> NETHERITE_AXE_BLADE = MEDIEVAL_ITEMS.register("netherite_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> NETHERITE_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("netherite_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> NETHERITE_KNIFE = MEDIEVAL_ITEMS.register("netherite_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> NETHERITE_BATTLE_AXE = MEDIEVAL_ITEMS.register("netherite_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> NETHERITE_LONGSWORD = MEDIEVAL_ITEMS.register("netherite_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));

    public static final RegistryObject<Item> OBSIDIAN_KNIFE_BLADE = MEDIEVAL_ITEMS.register("obsidian_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_SWORD_BLADE = MEDIEVAL_ITEMS.register("obsidian_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_AXE_BLADE = MEDIEVAL_ITEMS.register("obsidian_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("obsidian_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_KNIFE = MEDIEVAL_ITEMS.register("obsidian_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_SWORD = MEDIEVAL_ITEMS.register("obsidian_sword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_AXE = MEDIEVAL_ITEMS.register("obsidian_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_BATTLE_AXE = MEDIEVAL_ITEMS.register("obsidian_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_LONGSWORD = MEDIEVAL_ITEMS.register("obsidian_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = MEDIEVAL_ITEMS.register("obsidian_pickaxe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalToolsItemGroup())));

    public static final RegistryObject<Item> STEEL_KNIFE_BLADE = MEDIEVAL_ITEMS.register("steel_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STEEL_SWORD_BLADE = MEDIEVAL_ITEMS.register("steel_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STEEL_AXE_BLADE = MEDIEVAL_ITEMS.register("steel_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STEEL_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("steel_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> STEEL_KNIFE = MEDIEVAL_ITEMS.register("steel_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STEEL_SWORD = MEDIEVAL_ITEMS.register("steel_sword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STEEL_AXE = MEDIEVAL_ITEMS.register("steel_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STEEL_BATTLE_AXE = MEDIEVAL_ITEMS.register("steel_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STEEL_LONGSWORD = MEDIEVAL_ITEMS.register("steel_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> STEEL_PICKAXE = MEDIEVAL_ITEMS.register("steel_pickaxe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalToolsItemGroup())));

    public static final RegistryObject<Item> BRONZE_KNIFE_BLADE = MEDIEVAL_ITEMS.register("bronze_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> BRONZE_SWORD_BLADE = MEDIEVAL_ITEMS.register("bronze_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> BRONZE_AXE_BLADE = MEDIEVAL_ITEMS.register("bronze_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> BRONZE_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("bronze_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> BRONZE_KNIFE = MEDIEVAL_ITEMS.register("bronze_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> BRONZE_SWORD = MEDIEVAL_ITEMS.register("bronze_sword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> BRONZE_AXE = MEDIEVAL_ITEMS.register("bronze_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> BRONZE_BATTLE_AXE = MEDIEVAL_ITEMS.register("bronze_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> BRONZE_LONGSWORD = MEDIEVAL_ITEMS.register("bronze_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> BRONZE_PICKAXE = MEDIEVAL_ITEMS.register("bronze_pickaxe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalToolsItemGroup())));

    public static final RegistryObject<Item> MITHRIL_KNIFE_BLADE = MEDIEVAL_ITEMS.register("mithril_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> MITHRIL_SWORD_BLADE = MEDIEVAL_ITEMS.register("mithril_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> MITHRIL_AXE_BLADE = MEDIEVAL_ITEMS.register("mithril_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> MITHRIL_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("mithril_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> MITHRIL_KNIFE = MEDIEVAL_ITEMS.register("mithril_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> MITHRIL_SWORD = MEDIEVAL_ITEMS.register("mithril_sword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> MITHRIL_AXE = MEDIEVAL_ITEMS.register("mithril_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> MITHRIL_BATTLE_AXE = MEDIEVAL_ITEMS.register("mithril_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> MITHRIL_LONGSWORD = MEDIEVAL_ITEMS.register("mithril_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = MEDIEVAL_ITEMS.register("mithril_pickaxe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalToolsItemGroup())));

    public static final RegistryObject<Item> SILVER_KNIFE_BLADE = MEDIEVAL_ITEMS.register("silver_knife_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> SILVER_SWORD_BLADE = MEDIEVAL_ITEMS.register("silver_sword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> SILVER_AXE_BLADE = MEDIEVAL_ITEMS.register("silver_axe_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> SILVER_LONGSWORD_BLADE = MEDIEVAL_ITEMS.register("silver_longsword_blade", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalBladesItemGroup())));
    public static final RegistryObject<Item> SILVER_KNIFE = MEDIEVAL_ITEMS.register("silver_knife", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> SILVER_SWORD = MEDIEVAL_ITEMS.register("silver_sword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> SILVER_AXE = MEDIEVAL_ITEMS.register("silver_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> SILVER_BATTLE_AXE = MEDIEVAL_ITEMS.register("silver_battle_axe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> SILVER_LONGSWORD = MEDIEVAL_ITEMS.register("silver_longsword", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalWeaponsItemGroup())));
    public static final RegistryObject<Item> SILVER_PICKAXE = MEDIEVAL_ITEMS.register("silver_pickaxe", () -> new Item(new Item.Properties().tab(MedievalItemGroup.getMedievalToolsItemGroup())));

    public static void register(IEventBus eventBus) {
        MEDIEVAL_ITEMS.register(eventBus);
    }
}
