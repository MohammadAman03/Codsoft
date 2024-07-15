import java.util.Scanner;

public class atmInterface {
    private double balance;
    private int pin;

    public atmInterface(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == pin) {
            System.out.println("PIN is correct. Please choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash(scanner);
                    break;
                case 3:
                    depositCash(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    start();
            }
        } else {
            System.out.println("Invalid PIN. Please try again.");
            start();
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
        start();
    }

    private void withdrawCash(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Please try again.");
            withdrawCash(scanner);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
            start();
        }
    }

    private void depositCash(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
        start();
    }

    public static void main(String[] args) {
        atmInterface atm = new atmInterface(1234, 1000.0);
        atm.start();
    }
}