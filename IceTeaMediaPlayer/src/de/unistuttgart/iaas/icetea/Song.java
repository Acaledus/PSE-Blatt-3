package de.unistuttgart.iaas.icetea;

import java.net.URL;
import java.net.MalformedURLException;

/**
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class Song {
	private String name;
	private String path;

	/**
	 * Erzeugt einen neuen Song, der einen Namen und Pfad hat.
	 * @param name Der Name des neuen Songs
	 * @param path Der Pfad des neuen Songs
	 */
	public Song(String name, String path) {
		this.name = name;
		this.path = path;
	}

	/**
	 * @return Den Namen des Songs
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Den Pfad dees Songs
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @return Den URL-Pfad des Songs
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
