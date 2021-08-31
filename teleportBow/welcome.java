package com.ceylan.welcome;

import com.ceylan.welcome.events.welcomeEvents;
import com.ceylan.welcome.items.Item;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class welcome extends JavaPlugin {


    @Override
    public void onEnable(){
        Item.init();
        getServer().getPluginManager().registerEvents(new welcomeEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[CeysBow] : Plugin is enabled.");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "[CeysBow] : Plugin is disabled.");
    }


}
