import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] date = data.split("-");
        String YYY = date[0];
        String MM = date[1];
        String DD = date[2];
        System.out.println(date[1] +"/" +date[2]+"/" + date[0]);
    }
}