/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.lab;

/**
 *
 * @author Ali
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }
    

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        System.out.println(filename + " is playing...");
		isPlaying = true;
    }
    
    public void stop()
    {
        System.out.println("player is stopped!");
		isPlaying = false;
    }
    
    

}