import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Account account =new Account();
        account.getOwnerName();
        account.getBalance();
        account.isLocked();
        System.out.println(account.getOwnerName());
        System.out.println(account.getBalance());
        System.out.println(account.isLocked());
    }
}