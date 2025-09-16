public class ThreadClass extends Thread {
    private TicketSystem ticketSystem;

    public ThreadClass(TicketSystem ticketSystem,String name) {
        super(name);
        this.ticketSystem = ticketSystem;
    }
    public void run() {
        ticketSystem.bookTicket(1);
        sleepBriefly();
        ticketSystem.cancelTicket(1);
        sleepBriefly();
        ticketSystem.bookTicket(2);
        sleepBriefly();
        ticketSystem.cancelTicket(1);
        sleepBriefly();
        ticketSystem.bookTicket(3);
        sleepBriefly();
    }

    private void sleepBriefly() {
        try {
            Thread.sleep(50); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
