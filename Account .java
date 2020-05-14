
/**
 * Vincent Nguyen
 * CS108
 */

abstract class Account <T> {
    
    private final int idNo;
    private double initialBalance;
    private T bankCode;
    
    public Account(int idNo, double initialBalance, T bankCode) {
        this.idNo = idNo;
        this.initialBalance = initialBalance;
        this.bankCode = bankCode;
    }

    public int getIdNo() {
        return idNo;
    }

    public double getBalance() {
        return initialBalance;
    }
    
    public void deposit(double d){
        if(d <= 0)
            throw new IllegalArgumentException();
        
        initialBalance += d;
        
    }

    public T getBankCode() {
        return bankCode;
    }
    
    public void withdraw(double d){
        if(d > initialBalance)
            throw new IllegalArgumentException();
        initialBalance -= d;
    }
    
}
