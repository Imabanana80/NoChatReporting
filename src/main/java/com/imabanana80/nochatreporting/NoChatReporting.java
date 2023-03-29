package com.imabanana80.nochatreporting;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoChatReporting extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println();
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onMessageSend(AsyncPlayerChatEvent e){
        e.setCancelled(true);
        Bukkit.broadcastMessage("<"+e.getPlayer().getName()+"> "+e.getMessage());
    }
}
