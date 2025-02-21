/*Find if a String is empty or not


Code Assignment:

On the right hand side, you have couple of String variables with the name text and emptyString. Validate if these Strings are empty or not and print the output in the same order



Expected Output:

false
true
*/
public class EmptyStringDetector {


    public static void main (String[] args) {

        String text = "Hello, Java!";
        String emptyString = "";

        // Write your code below
        boolean isEmpty=text.isEmpty();
        boolean isNull=emptyString.isEmpty();
        System.out.println(isEmpty);
        System.out.println(isNull);

    }


}
