public abstract class Account{
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Error!! , You cannot enter negative numbers");
        }else{
            balance = balance + amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public abstract void withdraw(double amount);
    public abstract void endOfMonth();
}
