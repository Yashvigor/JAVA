public class ThreadClass extends Thread {
    private BankAccount account;

    public ThreadClass(BankAccount account, String name) {
        super(name);
        this.account = account;
    }
    public void run() {
        for (int i=0;i<3;i++) {
            account.deposit(100);
        try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.withdraw(50);
        }
    }
}
