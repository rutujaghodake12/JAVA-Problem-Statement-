/*
Calculate Factorial using do while statement
Code Assignment:

On the right hand side, you have a static method  calculateFactorial that accepts a int variable n. Write a logic inside this method using do while loop to calculate the factorial of the given number and return the same,

A factorial of a non-negative integer n, denoted as n!, is the product of all positive integers less than or equal to n

In mathematical terms, the factorial of n is calculated as:

n!=n×(n−1)×(n−2)×…×2×1

For example:

0!=1 (by convention)

1!=1

2!=2×1=2

3!=3×2×1=6

4!=4×3×2×1=24

and so on...

Once you completes writing your code, click on the Run tests button to know the result.

Any time, you want to start again from scratch, click on the Reset button

*/

public class Exercise20 {

    public static long calculateFactorial(int n) {
        long factorial = 1;
        int number = 1;

        // Write your logic below using do while
        do{
            factorial*=number;
            number++;
        }
        while(number<=n);
        return factorial;
    }

}
