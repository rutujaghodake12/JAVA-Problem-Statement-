/*
Rank Calculator using Ternary operator
Code Assignment:

On the right hand side, you have a static method  rankCalculator  that accepts a int variable  score as an input and return a String value as an output. Write a logic inside this method using ternary operator to calculate the rank based on the score. Below is the expected output

Expected Output:

score >= 90 -> "Grandmaster"
score >= 80 -> "Master"
score >= 70 -> "Expert"
score >= 60 -> "Intermediate"
score < 60 -> "Beginner"*/
public class Exercise17 {

    public static String rankCalculator(int score)
    {
        // Write your code below
        return score >= 90 ? "Grandmaster":
                score >=80? "Master":
                        score>=70? "Expert":
                                score >=60 ? "Intermediate":
                                        "Beginner";
    }

}
