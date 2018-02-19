public class BankAccount{
    double balance;
    public BankAccount(double bal){
        this.balance = bal; 
    }
    
    public void withdraw(double bal){
        this.balance = this.balance - bal;
    }
    
    public void deposit(double bal){
        this.balance = this.balance + bal;
    }
}