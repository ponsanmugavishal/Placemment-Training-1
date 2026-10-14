package Encapsulations;

import java.util.Scanner;
class Bank_account {
    private double balance;

    public double Get_balance() {
        return balance;
    }

    public void Withdraw(double ammount) {
       if (ammount <= balance) {
            balance -= ammount;
            System.out.println("Withdrawal successful. The new balance is: " + balance);
        } else {
            System.out.println("Insufficient funds");
        } 
    }

    public void Deposit(double ammount) {
        balance += ammount;
        System.out.println("Deposit successful. The new balance is: " + balance);
    }
}
public class bank {
    public static void main(String[] args) {
        Bank_account account = new Bank_account();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter \n1 to deposit,\n2 to withdraw,\n3 to check balance,\n4 to exit:");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.Deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.Withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Current balance: " + account.Get_balance());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    } 
}
