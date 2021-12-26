//Class for the E-wallet that supports depositing and withdrawing.
public class Ewallet {
    private float balance;

    public Ewallet(float bal){
        balance=bal;
    }

    public void deposit(float val){
        balance+=val;
    }
    public void withdraw(float val){
        balance-=val;
    }
}
