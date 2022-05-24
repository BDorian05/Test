import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers =new int[n];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}