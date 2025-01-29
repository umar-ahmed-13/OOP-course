public class BankAccountUpdated {
    String account_number;
    String account_name ;
    double accountBalance;

    public static void main(String[] args) {
    }

    public String deposit(double amount){
        if(amount<0){
            
            throw new ArithmeticException("Amount cannot be negative");
        }
        if (accountBalance-amount<0){
            throw new ArithmeticException("Insuffient balance");
        }
        accountBalance += amount;
        return "Deposited: "+ Double.toString(amount);
        
    }
    public String withdraw(double amount){
        
        if(accountBalance - amount <0 ){
            throw new ArithmeticException("Insufficient balance");
            
        }
        if (amount<0){
            throw new ArithmeticException("Deposited amount cannot be negative");
        }
        
        accountBalance -= amount;
        return "Withdraw amount: "+ Double.toString(amount);
        
    }

    public String transfer(BankAccount destAccount, double amount){

        if (accountBalance-amount<0 ){
            throw new ArithmeticException("Insufficient balance");
        }
        
        if (destAccount == null){
            throw new NullPointerException("No destination account");
        }
        if (amount<0){
            throw new ArithmeticException("Amount cannot be negative");
        }
        destAccount.deposit(amount);
        withdraw(amount) ;
        return "Transferred amount: "+ Double.toString(amount) +" to account "+ destAccount;
        

    }
 


}
