import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Counter counter =new Counter();
        counter.current=sc.nextInt();
        counter.print();
    }
}