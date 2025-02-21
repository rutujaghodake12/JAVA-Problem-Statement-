/*
Mood Analyzer using Switch expression
Code Assignment:

On the right hand side, you have a static method  moodAnalyzer that accepts a String value as an input. Write a logic inside this method using Switch expression  to return an emoji expression based on the mood provided.

Expected Output:

"HAPPY" -> "😀"
"SAD" -> "😞"
"TIRED" -> "🥱"
"EXCITED" -> "😱"
default -> "🤔"*/
public class Exercise18 {

    public static String moodAnalyzer (String mood) {

        // Write your switch expression below and return String
        switch (mood){
            case "HAPPY":
                return "😀";
            case "SAD":
                return "😞";
            case "TIRED":
                return "🥱";
            case "EXCITED":
                return "😱";
            default :
                return "🤔";
        }
    }

}
