package de.unistuttgart.iaas.icetea;

import java.net.URL;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

/**
 * Class which connects to the BasicPlayer and is used to control it
 *
 * @author Fabian Bühler
 * @author Sandro Speth
 * @author Tobias Wältken
 * @version 1.0
 */
public class PlayerCore {
	
	/** is the actual player */
	private BasicPlayer player;
	
	/**
	 * Standard Constructor
	 *
	 * @param listener is a listener for the player
	 */
	public PlayerCore(BasicPlayerListener... listeners) {
		this.player = new BasicPlayer();

		for (BasicPlayerListener listener : listeners) {
			this.player.addBasicPlayerListener(listener);
		}
	}
	
	/**
	 * let's the player load the given file
	 *
	 * @param url is the URL to open 
	 */
	public void open(URL url) {
		try {
			this.player.open(url);
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}

	/**
	 * plays the loaded song
	 */
	public void play() {
		try {
			this.player.play();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * pauses the current song
	 */
	public void pause() {
		try {
			this.player.pause();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * resumes a paused song
	 */
	public void resume() {
		try {
			this.player.resume();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * stops the current song
	 */
	public void stop() {
		try {
			this.player.stop();
		} catch (BasicPlayerException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * used for testing
	 *
	 * @param args remains unused
	 */
	public static void main(String[] args) {
		PlayerCore player = new PlayerCore();
		player.open(PlayerCore.class.getClassLoader().getResource("expl/The Complex.mp3"));
		player.play();
		
		//TODO test here
	}
}
