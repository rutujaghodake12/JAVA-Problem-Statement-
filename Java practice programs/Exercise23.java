/*
Multiple String storage using Array
Code Assignment:

On the right hand side, you have a static method  storeStringsInArray which accepts no input parameters and return a String array. Write a logic inside this method to store three Strings "Woof!", "Meow!", "Quack!" inside an array with the same order. Before return this array from the method, please make sure to print the array  length on to the console

Expected Output:

3
["Woof!", "Meow!", "Quack!"]
*/
public class Exercise23 {

    public static String[] storeStringsInArray() {

        String []store =new String[3];
        store[0]="Woof!";
        store[1]="Meow!";
        store[2]="Quack!";
        System.out.println(store.length);
        return store;
    }

}