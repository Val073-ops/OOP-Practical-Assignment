class SavingsAccount extends Account{
    private final double minimumBalance = 10.00;
    private final double interest = 0.05;

    public SavingsAccount(int accountNumber, double balance){
        super(accountNumber, balance);

    }
    @Override
    public void withdraw(double amount){
        if (balance - amount < minimumBalance){
            System.out.printf("Account %d: withdrawal of %.2f rejected. Balance would fall below the minimum of %.2f.%n", accountNumber, amount, minimumBalance);
        }else {
            balance = balance - amount;
            System.out.printf("Account %d: withdrew %.2f. New balance: %.2f%n", accountNumber, amount, balance);
        }
    }
    @Override
    public void endOfMonth(){
        balance = (balance * interest) + balance;
        System.out.printf("Account %d: interest added. New balance: %.2f%n", accountNumber, balance);
    }
}
