public class TestBankAccount {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("John", "Doe", 12345, 1.5);

        // Test deposit method
        checkingAccount.deposit(500.00);
        checkingAccount.displayAccount();

        // Test withdrawal method
        checkingAccount.withdrawal(100.00);
        checkingAccount.displayAccount();

        // Test overdraft withdrawal method
        checkingAccount.processWithdrawal(450.00);
        checkingAccount.displayAccount();
    }
}
