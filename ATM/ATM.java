package ATM;

import java.util.Scanner;

class ATMmchine {
    float balance = 0; // initial balance
    int PIN = 1234;

     public ATMmchine(){
        checkPin();
     }

    public void checkPin() {
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Invalid PIN entered");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= ATM Menu =========");
            System.out.println("\n1. Check A/C Balance");
            System.out.println("\n2. Withdraw Money");
            System.out.println("\n3. Deposit Money");
            System.out.println("\n4. Exit");
            System.out.println("\nEnter your choice: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Visit Again");
                    return; // exit the menu
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    public void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Enter a valid amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }

    public void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        float amount = sc.nextFloat();

        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
        } else {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("Updated balance: ₹" + balance);
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        ATMmchine obj = new ATMmchine();
        // obj.checkPin();
    }
}

