package de.unistuttgart.iaas.icetea;

import java.io.File;
import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

/**
 * Class which connects to the BasicPlayer and is used to control it
 * @author Daniel Capkan, Matrikelnummer: 3325960, st156303@stud.uni-stuttgart.de
 * @author Mario Scheich, Matrikelnummer: 3232655 , st151491@stud.uni-stuttgart.de
 * @author Florian Walcher, Matrikelnummer: 3320185, st156818@stud.uni-stuttgart.de
 */
public class PlayerCore {

	/**
	 * Is the actual player
	 */
	private BasicPlayer player;

	/**
	 * Standard Constructor
	 * @param listener A listener for the player
	 */
	public PlayerCore(BasicPlayerListener... listeners) {
		this.player = new BasicPlayer();

		for (BasicPlayerListener listener : listeners) {
			this.player.addBasicPlayerListener(listener);
		}
	}

	/**
	 * Lets the player load the given file
	 * @param url The URL to open
	 */
	public void open(URL url) {
		try {
			this.player.open(url);
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	public void open(File song) {
		try {
			this.player.open(song);
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Plays the loaded song
	 */
	public void play() {
		try {
			this.player.play();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Pauses the current song
	 */
	public void pause() {
		try {
			this.player.pause();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Resumes a paused song
	 */
	public void resume() {
		try {
			this.player.resume();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Stops the current song
	 */
	public void stop() {
		try {
			this.player.stop();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the status of the player
	 */
	public int getStatus() {
		return player.getStatus();
	}

	/**
	 * Used for testing
	 * @param args remains unused
	 */
	public static void main(String[] args) {
		PlayerCore player = new PlayerCore();
		player.open(PlayerCore.class.getClassLoader().getResource("expl/The Complex.mp3"));
		player.play();
	}
}
