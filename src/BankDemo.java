public class BankDemo {
    public static void main(String[] args){
        Account [] accounts = {new SavingsAccount(9990, 50), new CurrentAccount(9991, 40)};
        for (Account a : accounts){
            a.withdraw(46);
            a.endOfMonth();
            System.out.printf("Balance at end of month: %.2f%n%n", a.getBalance());
        }
    }
}
