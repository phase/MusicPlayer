/**
 * Copyright (C) 2012 t7seven7t
 */
package com.phase.MusicPlayer;

import org.bukkit.Sound;

public class Instrument {
	
	public static Sound getInstrument(int patch, int channel) {
		
		if (channel == 9) { // Drums  - Usually 10, but Java starts at 0 instead of 1, so it is 9.
			return Sound.NOTE_BASS_DRUM;
		}
		
		if ((patch >= 28 && patch <= 40) || (patch >= 44 && patch <= 46)) { // Guitars & bass
			return Sound.NOTE_BASS_GUITAR;
		}
		
		if (patch >= 113 && patch <= 119) { // Percussive
			return Sound.NOTE_STICKS;
		}
		
		if (patch >= 120 && patch <= 127) { // Misc.
			return Sound.NOTE_SNARE_DRUM;
		}
		
		return Sound.NOTE_PIANO;
		
	}
	
}
