/*
Arithmetic Operations using BufferedReader
Code Assignment:

On the right hand side, you have a main method. Inside this method, write down a logic to accept two numbers and the Arithmetic operation to perform using BufferedReader. The println statements inside the method can provide you a hint at what place an input needs to be accepted using BufferedReader.

Once the input numbers and arithmetic operation choice is accepted, perform the corresponding operation.

Expected Output:

num1 = 5, num2 = 3, choice = 1 -> Result = 8
num1 = 5, num2 = 3, choice = 2 -> Result = 2
num1 = 5, num2 = 3, choice = 3 -> Result = 15
num1 = 5, num2 = 3, choice = 4 -> Result = 1
Once you completes writing your code, validate your code by comparing with my solution manually. You will not be able to validate your results using Run tests

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise26 {

    public static void main(String[] args) throws IOException {

        // Declare the object of BufferedReader
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
        System.out.print("Please enter the first number: ");
        double num1=Double.parseDouble(reader.readLine());
        // Accept first number num1 here

        System.out.print("Please enter the second number: ");
        double num2=Double.parseDouble(reader.readLine());
        // Accept first number num2 here

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        // Accept Arithmetic operation choice here and perform the corresponding operation
        int choice=Integer.parseInt(reader.readLine());
        double result=0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("The result is: " + result);


    }

}