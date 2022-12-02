package com.richie.test;

import java.io.File;

import com.richie.util.PhonogramUtil;

public class Test {
    public static void main(String[] args) {
        String path = new File("").getAbsolutePath() + File.separator + "src/main/resources/notes" + File.separator;
        String notes = PhonogramUtil.getNotesByFile(path + "SongOfTheWind_180.notes");
        String accompaniments = PhonogramUtil.getAccompanimentsByFile(path + "SongOfTheWind_180.accompaniments");
        PhonogramUtil.play(notes, accompaniments, 180);
    }
}