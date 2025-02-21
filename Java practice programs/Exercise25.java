/*Sort Array of Foods
Code Assignment:

On the right hand side, you have a static method  sortFoods which accepts no input parameters and return void. Inside this method, you have a String array. Sort this array and covert the sorted array object into a String. At last print the String representation of sorted array onto the console using println() method

Expected Output:

[Banana, Marshmallow, Pancake, Pickle, Spaghetti]
*/
import java.util.Arrays;

public class Exercise25 {

    public static void sortFoods() {
        // Let's create an array to store food names
        String[] foods = {"Spaghetti", "Marshmallow", "Pickle", "Banana", "Pancake"};
        // Sort the array elements

        // Print the Array elements on to the console by converting the Array object into a String

        Arrays.sort(foods);

        String sortedFoodsString=Arrays.toString(foods);
        System.out.println(sortedFoodsString);
    }
    public static void main(String[]args){
        sortFoods();
    }


}
