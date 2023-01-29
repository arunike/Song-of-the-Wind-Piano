package com.richie.test;

// Import the required packages
import java.io.File;

import com.richie.util.PhonogramUtil;

/*
 * Define the Test class
 * This class is used to test the program
 */
public class Test {
    public static void main(String[] args) { // Main method
        String path = new File("").getAbsolutePath() + File.separator + "src/main/resources/notes" + File.separator; // Get the path of the notes file
        String notes = PhonogramUtil.getNotesByFile(path + "SongOfTheWind_180.notes"); // Get the notes
        String accompaniments = PhonogramUtil.getAccompanimentsByFile(path + "SongOfTheWind_180.accompaniments"); // Get the accompaniments
        PhonogramUtil.play(notes, accompaniments, 180); // Play the notes and accompaniments
    }
}