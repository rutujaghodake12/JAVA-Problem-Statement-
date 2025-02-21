/*
Convert String to double data type
Code Assignment:

On the right hand side, you have a String variables with the name priceInString with a double value inside it. Convert the same into a double numeric value with the help of parsing and print the double variable on to the console.



Expected Output:

999.99
*/
public class StringToDouble {

    public static void main (String[] args) {

        String priceInString = "999.99";
        // Write your code below
        Double num=Double.parseDouble(priceInString);
        System.out.println(num);
    }

}
