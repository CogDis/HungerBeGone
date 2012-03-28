package com.precipicegames.zeryl.hungerbegone;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

/**
 *
 * @author Zeryl
 */
public class HungerBeGone extends JavaPlugin {
    
    private final HungerBeGonePlayerListener playerListener = new HungerBeGonePlayerListener(this);
    
    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        PluginDescriptionFile pdf = this.getDescription();
        pm.registerEvents(playerListener, this);
        
        System.out.println(pdf.getName() + " is now enabled.");
    }
    
    @Override
    public void onDisable() {
        PluginDescriptionFile pdf = this.getDescription();
        System.out.println(pdf.getName() + " is now disabled.");
    }
}
