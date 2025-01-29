public class Test {
    public static void main(String[] args) {
        
    
    BankAccount umar = new BankAccount();
    umar.accountBalance= 0;
    // System.out.println(umar.account_name);
    umar.deposit(5000);
    // System.out.println(umar.accountBalance);
    umar.withdraw(5000);
    System.out.println(umar.accountBalance+"this");
    BankAccount person2 =new BankAccount();
    
    person2.accountBalance= 100;
    System.out.println(person2.accountBalance);
    System.out.println(umar.accountBalance);
    int ans = umar.transfer(person2, 6000);

    System.out.println(ans+" sss");
    System.out.println(person2.accountBalance);
    }
}


