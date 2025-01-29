import java.time.LocalDate;
import java.time.LocalDateTime;


public class CreditCard {
    double maxLimit = 500000;
    double dailyLimit = 100000;
    double perTransactionLimit = 20000;
    double usedCredit = 0;
    LocalDateTime startTime = LocalDate.now().atStartOfDay();
    LocalDateTime endTime = startTime.plusHours(24);
    LocalDateTime lastUseDateTime;
 
    public static void main(String[] args) {
        // LocalDateTime startTime = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0);
        
        
    }
    public String transaction(double amount){
        
        
        lastUseDateTime = LocalDateTime.now();
        if(lastUseDateTime.isAfter(endTime)){
            usedCredit = 0;
            endTime = endTime.plusHours(24);

        }

        if ( amount> perTransactionLimit ){
            throw new ArithmeticException("Exceeded transaction limit");
        }
        if (amount<0){
            throw new ArithmeticException("Amount cannot be negative");
        }
        if(amount + usedCredit>dailyLimit){
            throw new ArithmeticException("Transaction exceeds daily limit");
        }
        usedCredit += amount;
        return "Transaction credit use: " +amount;
    }

    public String payBill(double amount){
        if (amount<0){
            throw new ArithmeticException("Amount cannot be negative");
        }
        if(amount + usedCredit>maxLimit){
            throw new ArithmeticException("Transaction exceeds maximum limit");
        }
        
        usedCredit +=amount;
        return "Bill paid: " +Double.toString(amount);
    }
}
