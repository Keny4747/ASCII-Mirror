package asciimirror;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String input = userInput();

        try {
            List<String> list = new ArrayList<>();

            list =Files.readAllLines(Paths.get(input));
            int max = maxLenght(list);

            List<String> lista = reverseInit(list,max);


            print(lista);

        } catch (IOException e) {
            System.out.println("File not found!");
        }catch (InvalidPathException e ){
            System.out.println("File not found");
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
            System.out.println(x);
        }
    }
    public static List<String> reverseInit(List<String> list, int max){
        List<String> result_str= new ArrayList<>();
        for (String s:list) {
            StringBuilder sb=new StringBuilder();
            sb.append(s);
            sb.append(" ".repeat(max-s.length()));
            StringBuilder res = new StringBuilder();
            res.append(sb);
            res.append(" | ");
            sb.reverse();
            for (int i=0;i<sb.length();i++) {
                switch(sb.charAt(i)){
                    case '\\': res.append("/");break;
                    case '/': res.append("\\");break;
                    case '}': res.append("{");break;
                    case '{': res.append("}");break;
                    case ']': res.append("[");break;
                    case '[': res.append("]");break;
                    case ')': res.append("(");break;
                    case '(': res.append(")");break;
                    case '<': res.append(">");break;
                    case '>': res.append("<");break;
                    default: res.append(sb.charAt(i));break;
                }
            }
            result_str.add(res.toString());
        }
        return result_str;
    }
}