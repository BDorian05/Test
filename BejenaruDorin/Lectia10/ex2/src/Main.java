import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Patient Patient =new Patient();
        Patient.name=sc.nextLine();
        Patient.callTheDoctor();
    }
}