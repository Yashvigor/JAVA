public class Admin {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new ThreadClass(account, "Thread1");
        Thread t2 = new ThreadClass(account, "Thread2");
        Thread t3 = new ThreadClass(account, "Thread3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total Balance: " + account.getBalance());
    }
}
