package com.ceylan.welcome.events;

import com.ceylan.welcome.items.Item;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;


import static org.bukkit.Bukkit.getServer;


public class welcomeEvents implements Listener {

    @EventHandler
    public static void onPlayerJoinServer(PlayerJoinEvent event) {

        addBowPlayer(event);
    }


    @EventHandler
    public static void bowTeleport(ProjectileHitEvent event) {
        if(event.getEntity().getShooter() instanceof Player){
            Player shooter = (Player) event.getEntity().getShooter();
            if(shooter.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase(Item.bow.getItemMeta().getDisplayName())){
                if(event.getHitBlock().getLocation() != null){
                    shooter.teleport(event.getHitBlock().getLocation().add(0,1,0));

                }
            }
        }
    }


    @EventHandler
    public static void damageEntityZero(EntityDamageByEntityEvent event) {
        event.setDamage(0);
    }

    public static void addBowPlayer(PlayerJoinEvent event){
        ItemStack arrow = new ItemStack(Material.ARROW, 1);
        Player player = event.getPlayer();

        if(!(player.getInventory().contains(Item.bow))){
            player.getInventory().setItem(4, Item.bow);
            player.getInventory().setItem(9,arrow);
        }
    }




}
