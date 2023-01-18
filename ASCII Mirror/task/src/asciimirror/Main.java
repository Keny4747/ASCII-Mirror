package asciimirror;

import javax.swing.tree.RowMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;


public class Main {
    public static void main(String[] args) {

        String input = userInput();

        try {
            List<String> list = new ArrayList<>();
            List<String> lista = new ArrayList<>();

            list =Files.readAllLines(Paths.get(input));
            int max = maxLenght(list);

            for (String x : list) {
                lista.add(x.concat(" ".repeat(max - x.length())));
            }

            print(lista);

        } catch (IOException e) {
            System.out.println("File not found!");
        }

    }

    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        String input = scanner.nextLine();
        return input;
    }

    public static int maxLenght(List<String> a) {
        int max = 0;
        for (String x: a){
            max = Math.max(x.length(),max);
        }
        return max;
    }
    public static void print(List<String> lista){
        for (String x : lista){
            System.out.println(x + " | " + x);
        }
    }
}