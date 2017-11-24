package de.unistuttgart.iaas.icetea;


import java.util.ArrayList;

/**
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class Playlist {
	private String name;
	private ArrayList <Song> songs = new ArrayList <Song>();
	
/**
 * Declares Playlist
 * @param name name of the playlist
 */
	public Playlist(String name) {
		this.name = name;
	
	
	}
/**
 * 	gets name of the playlist
 * @return name name of the playlist
 */
public String getName() {
	return name;
}
/**
 * gets songs of the playlist
 * @return songs songs of the playlist
 */
public ArrayList<Song> getSongs() {
	return songs;
}

/**
 * adds song to playlist
 * @param song song to add
 */
public void addSong(Song song) {
	songs.add(song);
}
}


