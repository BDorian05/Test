import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Clock clock=new Clock();
        clock.hours=10;
        clock.minutes=59;
        // clock.hours=sc.nextInt();
        // clock.minutes=sc.nextInt();
        clock.next();
    }
}