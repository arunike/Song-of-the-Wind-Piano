package com.richie.play;

// Import the required packages
import cn.hutool.core.io.resource.ResourceUtil;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Define the Audio class
 * @param path: The path of the audio file
 * This class is used to play audio files
 */
public class Audio {
    private Player player; // Define the player
    
    ExecutorService service = Executors.newCachedThreadPool(); // Define the thread pool

    // Constructor
    public Audio(String path) { 
        InputStream is = ResourceUtil.getStream(path); // Get the input stream of the audio file

        try { // Play the audio file
            player = new Player(is);
        } catch (JavaLayerException e) { // If an error occurs, print the error message
            e.printStackTrace();
        }
    }

    // Implementation of the start method
    public void start() {
        service.submit(() -> { // Submit the task to the thread pool
            try { // Play the audio file
                player.play();
            }
            catch (JavaLayerException e) { // If an error occurs, print the error message
                e.printStackTrace();
            }
        });
    }
}
