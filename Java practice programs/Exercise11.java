/*
Compare two Strings


Code Assignment:



On the right hand side, you have couple of String variables with the name str1 and str2. Compare the two Strings ignoring their case and print the result on to the console.



Expected Output:

true
*/
public class Exercise11 {

    public static void main (String[] args) {
        /* code */
        String str1 = "Java Developer";
        String str2 = "java developer";
        boolean isSame = str1.equalsIgnoreCase(str2);
        System.out.println(isSame);
    }

}
