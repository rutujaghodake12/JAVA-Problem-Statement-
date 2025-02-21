/*
Check if a number is even or odd using modulus operator and if, else statements
Code Assignment:

On the right hand side, you have a static method  checkEven that accepts a int value as an input. Write a logic inside this method using modulus operator and if, else statement to identify if the given provided number is a even or odd number.

If the given number is a even number, the method should return a String value "EVEN",otherwise "ODD"

Expected Output:

14 -> EVEN
7 -> ODD*/
public class Exercise14 {

    public static String checkEven(int inputNum) {
        // Write your code below


        if(inputNum%2==0)
        {
            return"EVEN";
        }
        else
        {
            return"ODD";
        }
    }

}
