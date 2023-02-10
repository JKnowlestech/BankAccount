class BankAccountTest {
    public static void main(String[] args) {
        BankAccount example = new BankAccount(200.00, 300.00);
        example.checkBalance();

        example.checkingDeposit(100);
        example.checkBalance();
        example.takeWithdraw("checking",50.50);
        example.checkBalance();
        example.takeWithdraw("checking", 30.50);
        example.checkBalance();      

    }
}