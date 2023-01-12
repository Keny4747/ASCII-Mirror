package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String input = userInput();
        File file = new File(input);

        try {
            Scanner read = new Scanner(file);
            while(read.hasNext()){
                System.out.println(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        String input = scanner.nextLine();

        return input;
    }
    public static void printAnimal(){

    }
}