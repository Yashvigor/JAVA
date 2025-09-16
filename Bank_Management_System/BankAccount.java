public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance=initialBalance;
    }

    public void deposit(double amount) {
        balance+=amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + " and Balance: " + balance);
    }

    public void withdraw(double amount) {
        if(balance>=amount) {
            balance-=amount;
            System.out.println(Thread.currentThread().getName() + " withdraw " + amount + " and Balance: " + balance);
        } else{
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds! | Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
