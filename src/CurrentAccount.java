class CurrentAccount extends Account{
    private final double overdraftLimit = -10;
    private final double maintanance = 2;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount){
        if (balance - amount < overdraftLimit){
            System.out.printf("Account %d: withdrawal of %.2f rejected. It would exceed the overdraft limit of %.2f.%n", accountNumber, amount, -overdraftLimit);
        }else {
            balance = balance - amount;
            System.out.printf("Account %d: withdrew %.2f. New balance: %.2f%n", accountNumber, amount, balance);
        }
    }
    @Override
    public void endOfMonth(){
            balance = balance - maintanance;
        System.out.printf("Account %d: monthly fee of %.2f charged. New balance: %.2f%n", accountNumber, maintanance, balance);
        }
}
