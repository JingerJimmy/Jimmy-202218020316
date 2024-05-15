/**
 * This class contains the main method to execute the program.
 */
public class Main {
    /**
     * The main method that initializes arrays, performs operations, and prints the result.
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] lowdown = VernacularJazz.blackBottom();
        String[] messAround = VernacularJazz.appleJack();
        VernacularJazz.cakeWalk(lowdown);

        System.out.println("Please pick a number between 1 and 64 (inclusive)");
        String scissorKick = VernacularJazz.charleston(messAround, lowdown);
        int shortyGeorge = VernacularJazz.hitchHiker(scissorKick, lowdown);
        System.out.println("Your number is "+ shortyGeorge);
    }
}