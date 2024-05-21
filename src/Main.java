/**
 * This class contains the main method to execute the program.
 */
public class Main {
    /**
     * The main method that initializes arrays, performs operations, and prints the result.
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] lowdown = guessNum.createInt();
        String[] messAround = guessNum.createStr();
        guessNum.disruptInt(lowdown);

        System.out.println("Please pick a number between 1 and 64 (inclusive)");
        String scissorKick = guessNum.binaryStr(messAround, lowdown);
        int shortyGeorge = guessNum.getIndex(scissorKick, lowdown);
        System.out.println("Your number is "+ shortyGeorge);
    }
}