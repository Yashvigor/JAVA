public class Admin {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        Thread t1 = new ThreadClass(ticketSystem,"1st-User");
        Thread t2 = new ThreadClass(ticketSystem,"2nd-User");
        Thread t3 = new ThreadClass(ticketSystem,"3rd-User");
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

        System.out.println("Total tickets available: " + ticketSystem.getTicketsAvailable());
    }
}
