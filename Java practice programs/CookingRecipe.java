/*
Replacing a part of a String


Code Assignment:

On the right hand side, you have a String variable with the name recipe. Inside it's value, replace pepper with cinnamon and print the updated String value on to the console



Expected Output:

Add salt and cinnamon to taste.*/
public class CookingRecipe {

    public static void main (String[] args) {

        String recipe = "Add salt and pepper to taste.";

        // Write your code below
        String R =recipe.replace("pepper","cinnamon");
        System.out.println(R);
    }

}