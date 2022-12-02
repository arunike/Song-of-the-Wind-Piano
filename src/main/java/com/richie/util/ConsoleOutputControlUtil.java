package com.richie.util;

public class ConsoleOutputControlUtil {
    /**
     * Through the \033 special escape character to achieve output format control
     * 
     * @param fontColor, 30-Black 31-Red 32-Green 33-Yellow 34-Blue 35-Purple 36-Dark Green 37-White
     * @param fontType, 0-Default 1-Bold 2-Dim 3-Underline 4-Blink 5-Reverse 6-Hidden
     * @param backgroundColor, 40-Black 41-Red 42-Green 43-Yellow 44-Blue 45-Purple 46-Dark Green 47-White
     */
    public static String getFormatOutputString(String content, int fontColor, int fontType, int backgroundColor) {
        return String.format("\033[%d;%d;%dm%s\033[0m", fontColor, fontType, backgroundColor, content);
    }

    /**
     * Through the \033 special escape character to achieve output format control, get the font output with color
     *
     * @param fontColor, 30-Black 31-Red 32-Green 33-Yellow 34-Blue 35-Purple 36-Dark Green 37-White
     */
    public static String getColoredOutputString(String content, int fontColor) {
        return String.format("\033[%dm%s\033[0m", fontColor, content);
    }

    /**
     * Through the \033 special escape character to achieve output format control, get the font output with background color
     *
     * @param backgroundColor, 40-Black 41-Red 42-Green 43-Yellow 44-Blue 45-Purple 46-Dark Green 47-White
     */
    public static String getBackgroundColoredOutputString(String content, int backgroundColor) {
        return String.format("\033[%dm%s\033[0m", backgroundColor, content);
    }

    /**
     * Accept a sequence identifier and generate a colored output string in sequence
     */
    public static String orderedColorString(String content, int i) {
        int tmpColor = 31 + (i % 7);
        return String.format("\033[%dm%s\033[0m", tmpColor, content);
    }
}
