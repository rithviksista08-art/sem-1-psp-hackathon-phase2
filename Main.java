import java.util.Scanner;
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int n, String name, double b) {
        accountNumber = n;
        accountHolderName = name;
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    double checkBalance() {
        return balance;
    }
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int n = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double b = sc.nextDouble();

        BankAccount a = new BankAccount(n, name, b);

        System.out.print("Enter Deposit: ");
        a.deposit(sc.nextDouble());

        System.out.print("Enter Withdrawal: ");
        a.withdraw(sc.nextDouble());

        a.displayAccount();
    }
}
