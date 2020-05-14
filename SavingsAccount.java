
/**
 * Vincent Nguyen
 * CS108
 */

class SavingsAccount<T> extends Account<T> implements Interest{

    public double per_CHQ_Cost;
    public double min_Balance;

    public SavingsAccount(int idNo, double initialBalance, T bankCode, double per_CHQ_Cost, double min_Balance) {
        super(idNo, initialBalance, bankCode);
        this.per_CHQ_Cost = per_CHQ_Cost;
        this.min_Balance = min_Balance;
    }

    public void clearCheque(double x) {
        super.withdraw(x + per_CHQ_Cost);
    }

    @Override
    public double monthlyInterest() {
        
        double interest;

        interest = getBalance() * (ANNUAL_INTEREST / 12);
        if (interest > min_Balance) {
            return interest;
        }

        return 0;

    }
}
