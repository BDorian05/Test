import java.util.Scanner;

public class Main {
    public static int extractInt(double d){
        int extractInt = (int) (d /1);
        return extractInt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d =sc.nextDouble();
        System.out.println(extractInt(d));
    }
}