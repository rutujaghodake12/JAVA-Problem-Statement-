/*
Iterate Animal Sounds array
Code Assignment:

On the right hand side, you have a static method  printAnimalSounds which accepts no input parameters and return void. Inside this method, you have a String array. Iterate this array using for loop or for each and during the each iteration, convert the String to upper case followed by printing the same on to the console

Expected Output:

"MOO!"
"BAA!"
"OINK!"
"MEOW!"
"WOOF!*/

public class Exercise24 {

    public static void printAnimalSounds() {

        String[] animalSounds = {
                "Moo!",
                "Baa!",
                "Oink!",
                "Meow!",
                "Woof!"
        };

        // Write the iteration logic below

        for(String sound:animalSounds){
            System.out.println(sound.toUpperCase());
        }

    }


}
