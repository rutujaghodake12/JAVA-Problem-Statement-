/*
Fetching Substring from a String


Code Assignment:

On the right hand side, you have a String variable with the name gift. Extract the substring value Surprise! from it and print the same on to the console



Expected Output:

Surprise!
*/public class SurpriseGift {

    public static void main (String[] args) {

        String gift = "Surprise! It's a puppy!";

        /* Write your code below */

        String G=gift.substring(0,9);
        System.out.println(G);
    }

}
