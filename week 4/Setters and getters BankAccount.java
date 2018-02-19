public class BankAccount
{
    double balance;
    
    public void deposit(double bal){
        this.balance = this.balance + bal;
    }
    
    public void withdraw(double bal){
        this.balance = this.balance - bal;
    }
    
    public void setBalance(double bal){
        this.balance = bal;
    }
    
    public double getBalance(){
        return this.balance;
    }
}