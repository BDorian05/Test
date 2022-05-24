import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prime = sc.nextLine();
        String second = sc.nextLine();
        String noWhitespaces1 = prime.replace(" ", "");
        String noWhitespaces2 = second.replace(" ", "");
        int length1 = noWhitespaces1.length();
        int length2 = noWhitespaces2.length();
        boolean compare = length1 == length2;
        System.out.println(compare);
    }
}