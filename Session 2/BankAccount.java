

public class BankAccount{
    int account_number ;
    String account_name ;
    int accountBalance;

    public static void main(String[] args) {
    }

    int deposit(double amount){
        if(amount>0){
            accountBalance += amount;
        }
        System.out.println("Cannot be negative");
        return 0;
    }
    int withdraw(int amount){
        if(accountBalance - amount >=0 && amount>0){
            accountBalance -= amount;
            return accountBalance;
        }
        
        System.out.println("Insufficient balance");
        return 0;
    }
    int transfer(BankAccount destAccount, int amount){

        if (accountBalance-amount>=0 && amount>0){
            destAccount.deposit(amount);
            accountBalance-=amount;
            // withdraw(amount) can be used;
            return accountBalance;
        }
        System.out.println("Insufficient balance");
        return 0 ;

    }
 
}
