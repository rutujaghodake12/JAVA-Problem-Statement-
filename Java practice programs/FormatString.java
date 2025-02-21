/*
Trying printf() method


Code Assignment:

On the right hand side, you have a String variables with the name item, quantity and pricePerUnit. Using these variable and printf method, display the message on to the console based on the expected output give below.



Expected Output:

Don't forget to buy 7 bananas at $1.99 each!
*/
public class FormatString {

    public static void main (String[] args) {

        String item = "bananas";
        int quantity = 7;
        double pricePerUnit = 1.99;
        // Write your code below
        System.out.printf("Don't forget to buy %d %s at $%.2f each!",quantity,item,pricePerUnit);
    }

}
