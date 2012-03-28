package com.precipicegames.zeryl.hungerbegone;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 *
 * @author Zeryl
 */
public class HungerBeGonePlayerListener implements Listener {
    private final HungerBeGone plugin;
    
    public HungerBeGonePlayerListener(HungerBeGone instance) {
        plugin = instance;
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerMove(PlayerMoveEvent event) {
        event.getPlayer().setFoodLevel(18);
    }
}
