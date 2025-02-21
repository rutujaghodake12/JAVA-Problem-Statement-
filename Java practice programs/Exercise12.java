/*Calculating sum using Addition Operator
Code Assignment:

On the right hand side, you have a multiple int variables startingTreasure, clue1, clue2, clue3 holding various int values inside them. Add all of them using addition operator. The total sum value should be printed on to the console

Expected Output:

4250
*/
public class Exercise12 {

    public static void main (String[] args) {
        // Let's simulate a treasure hunt!
        int startingTreasure = 1000; // Initial treasure
        int clue1 = 500; // Treasure found after solving the first clue
        int clue2 = 750; // Treasure found after solving the second clue
        int clue3 = 2000; // Treasure found after solving the final clue

        // Calculate the total treasure found and print the same on to the console
        int total_treasure_found=startingTreasure+clue1+clue2+clue3;
        System.out.println(total_treasure_found);
    }

}
