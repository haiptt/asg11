
public class TransactionRecord{
    private int account;
    private double amount;

    public TransactionRecord(int acc, double amo){
        account = acc;
        amount = amo;
    }
    public TransactionRecord(){
        this.account =0;
        this.amount = 0.0;
    }

    public void setAccount(int acc){
        account = acc;
    }

    public int getAccount(){
        return account;
    }

    public void setAmount(double amo){
        amount = amo;
    }
    public double getAmount(){
        return amount;
    }
}
