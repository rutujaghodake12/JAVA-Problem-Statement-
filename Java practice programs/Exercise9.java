/*Let's concat Strings
Scenario:

In a bustling coffee shop named "ByteBrew," a group of enthusiastic programmers gathers to exchange ideas and share programming challenges. Among them is a budding developer named Alex, who is eager to demonstrate their newly acquired Java skills by creating a program that combines strings in different ways.
Code Assignment:

Alex decides to create a Java class named "StringConcatenator" with a main method. In this class, Alex aims to implement string concatenation logic to combine multiple strings into one coherent message. The goal is to showcase the versatility of Java's string manipulation capabilities. Finally, Alex prints the concatenated message to the console, demonstrating the power of string manipulation in Java.

Imagine you as Alex and follow the below instructions to build the Java programme,

Create a Java class with the name StringConcatenator

Build main method inside the StringConcatenator class

Create three String variables inside main method with the below names and values inside them,

greeting ->  Hello,

name -> Alex.

message -> Welcome to elite Java Club!

Finally concat all the above String variables and assign the output to a String variable personalizedMessage

Print the personalizedMessage on to the console

Expected Output:

Hello,Alex.Welcome to elite Java Club!


Once you completes writing your code, click on the Run tests button to know the result.

Any time, you want to start again from scratch, click on the Reset button
*/
public class Exercise9{
    public static void main (String[] args) {

        String greeting="Hello,";
        String name="Alex.";
        String message="Welcome to elite Java Club!";
        String personalizesMessage=greeting.concat("")+name.concat("") + message.concat("");
        System.out.println(personalizesMessage);
    }
}
