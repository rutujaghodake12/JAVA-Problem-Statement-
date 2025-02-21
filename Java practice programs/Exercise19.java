/*
Sum of first 100 numbers using while loop
Code Assignment:

On the right hand side, you have a static method  sumOfFirst100Numbers . Write a logic inside this method using while loop to sum all the natural numbers from 1 to 100

Expected Output:

5050
Once you completes writing your code, click on the Run tests button to know the result.

Any time, you want to start again from scratch, click on the Reset button*/
public class Exercise19 {

    public static int sumOfFirst100Numbers () {
        int sum = 0;
        int number = 1;

        // Write your logic below
        while(number<=100){
            sum+=number;
            number++;
        }
        return sum;

    }

}
