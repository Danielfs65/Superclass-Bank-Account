public class CheckingAccount extends BankAccount {
    // Additional attribute
    private double interestRate;

    // Constructor
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    // Method to allow overdraft withdrawals with a fee
    public void processWithdrawal(double amount) {
        double fee = 30.0;
        if (amount > getBalance()) {
            System.out.println("Insufficient funds. Overdraft fee of $30 has been assessed.");
            double totalWithdrawal = amount + fee;
            super.withdrawal(getBalance()); // Empty the balance
            System.out.println("New Balance: -$" + (totalWithdrawal - getBalance()));
        } else {
            super.withdrawal(amount);
        }
    }

    // Display account information including interest rate
    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
