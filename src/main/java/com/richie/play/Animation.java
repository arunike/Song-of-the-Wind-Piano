package com.richie.play;

import com.richie.util.ConsoleOutputControlUtil;

public class Animation extends Thread {
    private String[] notes;
    private int times;

    public Animation(int times) {
        this.times = times;
    }

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

    @Override
    public void run() {
        try {
            int times = this.times;

            new Audio("audio/test.mp3").start();
            sleep(1000);

            for (String note : this.notes) {
                if (note.length() < 1) {
                    continue;
                }

                String n = note.replace("+", "").replace("-", "");

                if (n.equals("\n") || n.equals("\r")) {
                    System.out.print("\n");

                    continue;
                }
                switch (n) {
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
                
                sleep(times);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
