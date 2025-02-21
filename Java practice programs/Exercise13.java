/*
String Concatenation
Code Assignment:

On the right hand side, you have couple of String variables and a int variable with the names pizzaSize, pizzaToppings, numberOfSlices . Using the String concatenation and the above variables, build a String that holds below value and finally print the same onto the console.
I would like to order a large pizza with pepperoni toppings, please. Oh, and cut it into 8 slices! 🍕

Expected Output:

I would like to order a large pizza with pepperoni toppings, please. Oh, and cut it into 8 slices! 🍕*/
public class Exercise13 {

    public static void main(String[] args) {
        String pizzaSize = "large";
        String pizzaToppings = "pepperoni";
        int numberOfSlices = 8;

        // Construct the pizza order message using string concatenation
        String pizza=("I would like to order a "+ pizzaSize +" pizza with " + pizzaToppings +  " toppings, please. Oh, and cut it into " + numberOfSlices + " slices! 🍕");
        System.out.println(pizza);
    }

}
