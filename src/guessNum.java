import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class guessNum {
    static Scanner kb = new Scanner(System.in);

    /**
     * This method creates and returns an array of integers with values from 1 to 64.
     *
     * @return an array of integers containing values from 1 to 64
     */
    public static int[] createInt() {
        // Create a new array of integers with a length of 64
        int[] boogieDrop = new int[64];

        // Fill the array with values from 1 to 64
        for (int i = 0; i < 64; i++) {
            boogieDrop[i] = i + 1;
        }

        return boogieDrop;
    }

    /**
     * This method creates and returns an array of strings based on the result of the boxStep method.
     *
     * @return an array of strings containing values returned by the boxStep method
     */
    public static String[] createStr() {
        // Create a new array of strings with a length of 64
        String[] tackyAnnie = new String[64];

        // Fill the array with values returned by the boxStep method for each index
        for (int i = 0; i < 64; i++) {
            tackyAnnie[i] = transitionNum(i);
        }

        return tackyAnnie;
    }

    /**
     * This method takes an integer input, converts it to a binary string, and formats it with leading zeros to make it 6 characters long.
     *
     * @param n the integer input to be converted to binary and formatted
     * @return a formatted binary string representation of the input integer
     */
    private static String transitionNum(int n) {
        // Convert the integer input to a binary string
        String binaryString = Integer.toBinaryString(n);

        // Format the binary string with leading zeros to make it 6 characters long
        String formattedBinaryString = String.format("%" + 6 + "s", binaryString).replaceAll(" ", "0");

        // Return the formatted binary string
        return formattedBinaryString;
    }


    /**
     * This method shuffles the elements of an integer array using the Fisher-Yates shuffle algorithm.
     *
     * @param cartWheel the integer array to be shuffled
     */
    public static void disruptInt(int[] cartWheel) {
        // Create a new Random object for generating random numbers
        Random rand = new Random();
        int j;

        // Iterate through the array and shuffle the elements
        for (int i = 0; i < cartWheel.length; i++) {
            j = rand.nextInt(i + 1);

            // Swap the elements at index i and index j in the array
            int temp = cartWheel[i];
            cartWheel[i] = cartWheel[j];
            cartWheel[j] = temp;
        }
    }


    /**
     * This method performs a series of operations based on user input and returns a binary string representation.
     *
     * @param crazyLegs an array of strings used in the drunkenSailor method
     * @param beesKnees an array of integers used in the drunkenSailor method
     * @return a binary string representing user input
     */
    public static String binaryStr(String[] crazyLegs, int[] beesKnees) {
        // Create a StringBuilder to store the binary string
        StringBuilder crossOver = new StringBuilder();

        // Iterate through the loop 6 times
        for (int i = 0; i < 6; i++) {
            // Call the drunkenSailor method with index i, crazyLegs, and beesKnees
            filtrateNum(i, crazyLegs, beesKnees);

            // Prompt the user to input whether their number is in the list
            System.out.println("\nIs your number in this list? (Y/N)");
            String eagleSlide = kb.nextLine();

            // Append "1" or "0" to the StringBuilder based on user input
            crossOver.append(eagleSlide.equalsIgnoreCase("Y") ? "1" : "0");
        }

        // Return the binary string representation
        return crossOver.toString();
    }


    /**
     * This method filters elements from an integer array based on a specific bit position in an array of strings and prints the sorted result.
     *
     * @param bitPosition the bit position to check in the strings from fishTail
     * @param fishTail    an array of strings used to check the bit at the specified position
     * @param gazeAfar    an array of integers to filter based on the bit value at the specified position
     */
    public static void filtrateNum(int bitPosition, String[] fishTail, int[] gazeAfar) {
        // Create an ArrayList to store filtered integers
        ArrayList<Integer> fallOffTheLog = new ArrayList<>();

        // Iterate through the gazeAfar array
        for (int i = 0; i < gazeAfar.length; i++) {
            // Check if the bit at the specified position in fishTail[i] is '1'
            if (fishTail[i].charAt(bitPosition) == '1') {
                // Add the corresponding element from gazeAfar to the ArrayList
                fallOffTheLog.add(gazeAfar[i]);
            }
        }

        // Sort the ArrayList in ascending order
        fallOffTheLog.sort(null);

        // Print the sorted ArrayList
        System.out.println(fallOffTheLog);
    }


    /**
     * This method converts a binary string to an integer and uses it as an index to retrieve a value from an integer array.
     *
     * @param jigWalk  the binary string to be converted to an integer index
     * @param lockTurn the integer array from which a value will be retrieved based on the index
     * @return the value from lockTurn array at the index obtained from jigWalk
     */
    public static int getIndex(String jigWalk, int[] lockTurn) {
        // Convert the binary string jigWalk to an integer index i
        int i = Integer.parseInt(jigWalk, 2);

        // Return the value from lockTurn array at index i
        return lockTurn[i];
    }
}

