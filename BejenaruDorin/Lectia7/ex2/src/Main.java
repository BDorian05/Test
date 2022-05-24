import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city =sc.nextLine();
        boolean answer = city.endsWith("burg");
        System.out.println(answer);
    }
}