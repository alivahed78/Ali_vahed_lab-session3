/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.lab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kِlling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
       
        return files.size();
        
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        List list = new ArrayList(files.indexOf(index));
        Collections.sort(list);
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(int i=0 ; i<=files.size() ;i++){
            System.out.printf(files.toString());
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
   
    public void startPlaying(int index)
    {
         
        
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        MusicPlayer sp = new MusicPlayer();
        sp.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        return false;
        // The return value.
        // Set according to whether the index is valid or not.
       
    }
}