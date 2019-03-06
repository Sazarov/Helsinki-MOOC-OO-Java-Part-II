import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        String testString = "1\npekka\n088\n2\njuk\n2\npekka\nx"; // add and find number by name
        String testString2 = "1\npekka\n088\n1\npekka\n066\n2\npekka\nx"; // add 2 numbers
        String testString3 = "1\npekka\n088\n3\n088\nx"; // search by phone number
        String testString4 = "4\npekka\npekka's address\nline2\n5\npekka\nx"; // add address and search for personal info
        String testString5 = "4\npekka\npekka's address\nline2\n5\npekka\n6\npekka\n5\npekka\nx"; // add PI, search, remove PI, search
        String testString6 =  "1\njukka\n02-212121\n4\npekka\nmannerheimintie\nhelsinki\n1\npekka\n09-12345\n5\npekka\n6\npekka\n"
                + "2\npekka\nx\n";
        String testString7 = ""
                + "1\njukka\n02-212121\n"
                + "4\npekka\nmannerheimintie\nhelsinki\n"
                + "1\npekka\n09-12345\n"
                + "1\npekka\n09-54321\n"
                + "7\nkk\n"
                + "x\n";
        Scanner reader = new Scanner(System.in);
//        Scanner reader = new Scanner(testString7);
        
        UserInterface ui = new UserInterface(reader);
        ui.start();
    }
}
