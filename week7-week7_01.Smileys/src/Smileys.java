
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("arto");
        printWithSmileys("matti");
        printWithSmileys("Mikael");
        printWithSmileys("Interface");
        System.out.println();
    }

    private static void printWithSmileys(String string) {
        String oddLengthElement = (string.length() % 2 == 1) ? " " : "";
        String middleRow = ":) " + string + oddLengthElement + " :)";

        printFullLineOfSmileys(middleRow.length()/2);
        System.out.println("");
        System.out.println(middleRow);
        printFullLineOfSmileys(middleRow.length()/2);
        System.out.println("");


    }

    public static void printFullLineOfSmileys(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
    }
}
