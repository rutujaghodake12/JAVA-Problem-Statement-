/*
Finding if it is raining using Logical NOT operator and if, else statements
Code Assignment:

On the right hand side, you have a static method  isRaining that accepts a boolean value as an input. Write a logic inside this method using logical NOT operator and if, else statements to identify if it is raining or not.

If it is raining, the method should return a String value "I guess it's another day for indoor activities!" ,otherwise "I'll go for a walk."
Expected Output:

        !raining -> I'll go for a walk.
raining -> I guess it's another day for indoor activities!
        */
public class Exercise15 {

    public static String isRaining(boolean raining) {
        if(!raining){
            return "I'll go for a walk.";

        }
        else{
            return "I guess it's another day for indoor activities!";
        }
    }

}
