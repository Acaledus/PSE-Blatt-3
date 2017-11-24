package de.unistuttgart.iaas.icetea;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class Song {
	private String name;
	private String path;
	
/**
 * Describes Song
 * @param name the name of the song
 * @param path path of the song
 */
	public Song(String name, String path) {
		this.name = name;
		this.path = path;
	}
/**
 * 	Gets name of the song
 * @return name the name of the Song
 */
	public String getName() {
		return name;
}
/**
 *  Gets path of the song
 * @return
 */
	public String getPath() {
		return path;
	}
/**
 * Returns URL path of the song
 * @return songURL the URL path of the song
 */
	public URL getURL() {
		URL songURL = null;
		try {
			songURL = new URL(getPath());
		} catch (MalformedURLException e) {

			e.printStackTrace();
		}

		return songURL;
	}
}
