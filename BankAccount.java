public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
//Create a class member (static) that has the number of accounts created thus far.
    private static int numberOfPeople = 0;
//Create a class member (static) that tracks the total amount of money stored in every account created.
    private static double totalAmount = 0.0;
    
    //In the constructor, be sure to increment the account count.
    //When i make instance it needs to have access to constructor so it needs to be public
    
    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfPeople ++;
        totalAmount = totalAmount + checkingBalance + savingsBalance; 
    }
    
    // Getter users checking balance
    public double getcheckingBalance() {
        return checkingBalance;
    }

    //Setter
    private void setcheckingBalance(double amount) {
        checkingBalance = checkingBalance + amount;
    }

    //Getter users savings balance
    public double getsavingsBalance() {
        return savingsBalance;
    }
    
    //Setter
    private void setsavingsBalance(double amount) {
        savingsBalance = savingsBalance + amount;
    }

//Deposit to Checking
    public void checkingDeposit(double amount){
        setcheckingBalance(amount);
        double checking = getcheckingBalance();
        System.out.println(checking);
    }

//Make Withdraw
public void takeWithdraw(String accountType, double amount){
        // setcheckingBalance(0 - amount);
        // double checking = getcheckingBalance();
        String account = accountType.toLowerCase();
        double amountNegative = (0 - amount); 
        if (account.equals("checking")){
            if (checkingBalance - amount >= 0){
                setcheckingBalance(amountNegative);
            } else System.out.println("Insufficient funds.");
        } else if (account.equals("savings")){
            if (savingsBalance - amount >= 0){
                setsavingsBalance(amountNegative);
            } else System.out.println("Insufficient funds.");
        } else System.out.println("Invalid account.");
    }

//Check Balances
public void checkBalance() {
    double checks = getcheckingBalance();
    double saves = getsavingsBalance();
    System.out.println("Checking Balance: " + checks + " Savings Balance: " + saves);
}

}



//Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored... 

//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
//--like doing deposit but doing negative
//Create a method to see the total money from the checking and saving.
//--line 41 and 42 use getters
//Users should not be able to set any of the attributes from the class.