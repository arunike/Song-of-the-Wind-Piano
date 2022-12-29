# Song of the Wind Piano Play

## Description
<p> Used Java to implement a piano play. Song of the wind is a famous song in China. It is a song about the wind. The wind is a symbol of freedom.
</p>

<p> The Java program supports the following functions:
</p>
<ol type='1'> 
    <li>35 notes supported for input in main and accompaniment:
        <ul>
            <li>A total of 35 notes representing double bass, bass, midrange, treble, and double treble.</li>
            <li>"1--" ~ "7--"， "1-" ~ "7-"， "1" ~ "7"， "1+" ~ "7+"， "1++" ~ "7++".</li>
        </ul>
    </li>
    <li>Manually enter the notes to be played automatically in the main (.note) and accompaniment (.accompaniments) respectively.
        <ol type='a'>
            <li>
                Each note is separated by a space (any number of spaces, it is recommended that each note takes up 4 placeholders including spaces, so that the main and accompaniment notes are aligned).
            </li>
            <li>
                Entering the character "0" will double the sound length.
            </li>
            <li>
                Inputting any character other than the above 35 notes and "0" will not have any effect on playing.
            </li>
            <li>
                If you start a new line, you simple just need to add a space at the end of the previous line and the beginning of the next line.
            </li>
        </ol>
    </li>
    <li>
        The interval between every two notes in the sound length is milliseconds (ms),
        It is recommended to enter the shortest interval of the entire score, and the remaining longer intervals can be solved by doubling the delay.
    </li>
</ol>
