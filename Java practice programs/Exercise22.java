/*Find Divisible Number using while loop and break statement
Code Assignment:

On the right hand side, you have a static method  findDivisibleNumber which accepts two int variables num1, num2. Write a logic inside this method using while loop and break statement to identify the first positive natural number that is exactly divisible by num1 and num2

Expected Output:

num1 = 2, num2 = 3 -> 6
num1 = 2, num2 = 5 -> 10
*/
public class Exercise22 {


    public static int findDivisibleNumber(int num1, int num2) {
        int Number=1;
        while(true){
            if(Number % num1==0 && Number % num2==0){
                break;
            }
            Number++;
        }
        return Number;

    }
}
