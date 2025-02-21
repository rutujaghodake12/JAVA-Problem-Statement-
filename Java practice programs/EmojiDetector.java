/*Searching for a value in String


Code Assignment:

On the right hand side, you have a String variable with the name message. Validate the String value if it contains  😊 using contains method and print the boolean output on to the console



Expected Output:

true
*/public class EmojiDetector {

    public static void main (String[] args) {

        String message = "I love coding! 😊";

        /* Write your code below */
        boolean b1= message.contains("😊");
        System.out.println(b1);
    }

}
