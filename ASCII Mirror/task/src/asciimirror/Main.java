package asciimirror;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = userInput(scanner);
        System.out.printf("%s%n", input);
        System.out.println("            ^__^");
        System.out.println("    _______/(oo)");
        System.out.println("/\\/(       /(__)");
        System.out.println("   | w----||    ");
        System.out.println("   ||     ||    ");

    }

    public static String userInput(Scanner scanner) {
        System.out.println("Input the file path:");
        String input = scanner.nextLine();

        return input;
    }
}