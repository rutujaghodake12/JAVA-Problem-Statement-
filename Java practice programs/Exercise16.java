/*Funny food decision using Logical AND, OR operator and if, else statements
Code Assignment:

On the right hand side, you have a static method  funnyFoodDecision that accepts three boolean values  isHungry, hasPizza, hasBurger as an input and return a String value as an output. Write a logic inside this method using logical AND, OR operator and if, else statements to achieve the below expected output

Expected Output:

isHungry = true, hasPizza = true, hasBurger = true -> "I'm hungry and I have both pizza and burger! Let's feast!"

isHungry = true, hasPizza = true, hasBurger = false -> "I'm hungry and I have pizza! Let's enjoy some slices!"

isHungry = true, hasPizza = false, hasBurger = true -> "I'm hungry and I have a burger! Let's munch on it!"

isHungry = false -> "I'm not hungry. Let's wait for the next mealtime!"
*/
public class Exercise16 {

    public static String funnyFoodDecision(boolean isHungry, boolean hasPizza,
                                           boolean hasBurger)
    {
        // Write your logic below
        if(isHungry  && hasPizza && hasBurger )
        {
            return"I'm hungry and I have both pizza and burger! Let's feast!";

        }
        else if( isHungry&&hasPizza   )
        {
            return "I'm hungry and I have pizza! Let's enjoy some slices!";
        }
        else if(isHungry && hasBurger)
        {

            return "I'm hungry and I have a burger! Let's munch on it!";
        }
        else{
            return "I'm not hungry. Let's wait for the next mealtime!";
        }
    }

}
