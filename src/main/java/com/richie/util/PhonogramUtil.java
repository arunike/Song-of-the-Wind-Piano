package com.richie.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import com.richie.play.Animation;
import com.richie.play.AudioPlay;

public class PhonogramUtil {
    public static String getNotesByFile(String path) {
        return getString(path);
    }

    public static String getAccompanimentsByFile(String path) {
        return getString(path);
    }

    private static String getString(String path) {
        List<String> strings = FileUtil.readLines(path, StandardCharsets.UTF_8);
        strings = strings.parallelStream().map(s -> {
            s = s.trim();
            return " " + s + " \n";
        }).collect(Collectors.toList());

        return StrUtil.join("", strings);
    }

    public static void play(String notes, String accompaniments, int times) {
        new AudioPlay(times).loadNotes(notes).start();
        new AudioPlay(times).loadNotes(accompaniments).start();
        new Animation(times).loadNotes(notes).start();
    }
}
