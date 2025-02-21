/*
Sum of numbers using for loop
Code Assignment:

On the right hand side, you have a static method  sumOfNumbers which accepts a int variable number. Write a logic inside this method using for loop to sum all the natural numbers from 1 to given input number

Expected Output:

100 -> 5050
1000 -> 500500
Once you completes writing your code, click on the Run tests button to know the result.

Any time, you want to start again from scratch, click on the Reset button*/
public class Exercise21 {


    public static long sumOfNumbers(int number) {
        long sum = 0;
        for (int i=1;i<=number;i++){
            sum+=i;
        }
        return sum;
    }

}
