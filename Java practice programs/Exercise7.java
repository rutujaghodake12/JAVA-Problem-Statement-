/*
Trying explicit casting
Imagine you're a clumsy scientist trying to measure the depth of a pool with a not-so-accurate measuring device. Your measuring device gives you measurements in float (decimal) values, but your lab assistant can only record whole numbers (integers). Your task is to convert these float measurements to integers for recording 🧪🤓
PROBLEM STATEMENT
Write a Java code that create a float variable and cast it into int by following the below instructions,
declare a float variable with the name measurement and assign a value 4.75 to it
declare a int variable with the name recordedDepth and assign a value to it by performing explicit casting using the float variable measurement
print the value inside the variable recordedDepth using the System.out.println() statement
Expected Output:
4
*/
public class Exercise7 {

    public static void main (String[] args) {

        /* Write your code below */

        float measurement=4.75f;
        int recordedDepth=(int)measurement;
        System.out.println(recordedDepth);
    }

}
