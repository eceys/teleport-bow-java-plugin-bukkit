package com.ceylan.welcome.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Item {

    public static ItemStack bow;

    public static void init(){
        createBow();
    }

    private static void createBow(){
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Teleport Bow");
        List<String> lore = new ArrayList<>();
        lore.add("§7Teleport anywhere.");
        lore.add("§7Be careful");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.getItemMeta().setUnbreakable(false);
        item.setItemMeta(meta);
        bow = item;
    }
}
