public class TicketSystem {
    private int ticketsAvailable = 10;

    public void bookTicket(int count) {
        if (ticketsAvailable>=count) {
            ticketsAvailable-=count;
            System.out.println(Thread.currentThread().getName() +
                " booked " + count + " tickets, Tickets left: " + ticketsAvailable);
        } else {
            System.out.println(Thread.currentThread().getName() +
                " tried to book " + count + " tickets , but only " + ticketsAvailable + " left.");
        }
    }

    public void cancelTicket(int count) {
        ticketsAvailable+=count;
        System.out.println(Thread.currentThread().getName() +
            " cancelled " + count + " tickets ,Tickets left: " + ticketsAvailable);
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }
}
