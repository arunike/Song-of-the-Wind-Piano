package com.richie.play;

// Import the required packages
import com.richie.util.ConsoleOutputControlUtil;

/*
 * Define the Animation class
 * @param notes: The notes to be played
 * @param times: The time interval
 * This class is used to play the animation
 */
public class Animation extends Thread {
    // Variables initialization
    private String[] notes; 
    private int times;

    // Constructor
    public Animation(int times) { 
        this.times = times;
    }

    // Constructor
    public Animation(String[] notes, int times) {
        this.notes = notes;
        this.times = times;
    }

    public String[] getNotes() {
        return this.notes;
    }

    public void setNotes(String[] notes) {
        this.notes = notes;
    }

    public int getTimes() {
        return this.times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public Animation loadNotes(String notes) {
        this.notes = notes.split(" ");
        return this;
    }

    // Implementation of the animation method
    @Override
    public void run() {
        try {
            int times = this.times; // Get the time interval

            new Audio("audio/test.mp3").start(); // Play the audio file
            sleep(1000); // Wait for the audio file to be played

            for (String note : this.notes) { // Loop through the notes
                if (note.length() < 1) { // If the note is empty, skip
                    continue;
                }

                String n = note.replace("+", "").replace("-", ""); // Get the note

                if (n.equals("\n") || n.equals("\r")) { // If the note is a line break, skip
                    System.out.print("\n");

                    continue;
                }
                switch (n) { // Output the note
                    case "0":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("_",31));
                        break;
                    case "1":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2581",32));
                        break;
                    case "2":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2582",33));
                        break;
                    case "3":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2583",34));
                        break;
                    case "4":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2584",35));
                        break;
                    case "5":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2585",36));
                        break;
                    case "6":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2586",37));
                        break;
                    case "7":
                        System.out.print(ConsoleOutputControlUtil.getColoredOutputString("\u2587",32));
                        break;
                }

                System.out.print(" ");
                
                sleep(times); // Wait for the next note
            }
        } catch (InterruptedException e) { // Catch the exception
            throw new RuntimeException(e);
        }
    }
}
