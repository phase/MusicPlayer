/**
 * Copyright (C) 2012 t7seven7t
 */
package com.phase.MusicPlayer;

import org.bukkit.entity.Player;

public interface MidiPlayer {

	public void tuneIn(Player player);
	
	public void tuneOut(Player player);
	
	public void stopPlaying();
	
	public boolean isNowPlaying();
	
	public void playNextSong();
	
	public void playSong(String midiName);
	
}
