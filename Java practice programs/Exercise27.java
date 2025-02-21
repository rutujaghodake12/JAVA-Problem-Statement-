/*
Arithmetic Operations using Scanner
Code Assignment:

On the right hand side, you have a main method. Inside this method, write down a logic to accept two numbers and the Arithmetic operation to perform using Scanner. The println statements inside the method can provide you a hint at what place an input needs to be accepted using Scanner.

Once the input numbers and arithmetic operation choice is accepted, perform the corresponding operation.

Expected Output:

num1 = 5, num2 = 3, choice = 1 -> Result = 8
num1 = 5, num2 = 3, choice = 2 -> Result = 2
num1 = 5, num2 = 3, choice = 3 -> Result = 15
num1 = 5, num2 = 3, choice = 4 -> Result = 1
*/
import java.util.Scanner;

public class Exercise27 {

    public static void main(String[] args)  {
        // Accept Arithmetic operation choice here and perform the corresponding operation
        //BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Operations using BufferedReader!");
        System.out.print("Please enter the first number: ");
        int num1=scanner.nextInt();
        // Accept first number num1 here

        System.out.print("Please enter the second number: ");
        int num2=scanner.nextInt();
        // Accept first number num2 here

        System.out.println("Which operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");

        // Accept Arithmetic operation choice here and perform the corresponding operation
        int choice=scanner.nextInt();
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
        scanner.close();


    }

}
