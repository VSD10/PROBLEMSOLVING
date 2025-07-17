import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        int choice = Integer.parseInt(sc.nextLine());

        if (choice == 1) {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
            String input = sc.nextLine();
            String[] details = input.split(",");

            Account account = new SavingsAccount(details[0], details[1], details[2], details[3]);
            account.display();

        } else if (choice == 2) {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
            String input = sc.nextLine();
            String[] details = input.split(",");

            Account account = new CurrentAccount(details[0], details[1], details[2], details[3]);
            account.display();
        } else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }
}