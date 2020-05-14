
/**
 * Vincent Nguyen
 * CS108
 */

//Generics class <T>
class CurrentAccount<T> extends Account<T> {

    private final double per_CHQ_Cost;

    public CurrentAccount(int idNo, double initialBalance, T bankCode, double per_CHQ_Cost) {
        super(idNo, initialBalance, bankCode);
        this.per_CHQ_Cost = per_CHQ_Cost;
    }

    public void clearCheque(double x) {
        withdraw(x+per_CHQ_Cost);
    }

}
