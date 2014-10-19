/**
 * Copyright (C) 2012 t7seven7t
 */
package com.phase.MusicPlayer;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
	private final MusicPlayer plugin;
	
	public PlayerListener(final MusicPlayer plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		if (plugin.getMidiPlayer() != null)
			plugin.getMidiPlayer().tuneOut(event.getPlayer());
	}
	
	@EventHandler
	public void playerJoin(PlayerJoinEvent e){
		if (plugin.getMidiPlayer() != null)
			plugin.getMidiPlayer().tuneIn(e.getPlayer());
	}
	
}
