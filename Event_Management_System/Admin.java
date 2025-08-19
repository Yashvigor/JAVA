public class Admin {
    public static void main(String args[]) {
        Event e1 = new CodingEvent(1,"Code fest",11,"CSPIT",10,24,"Code Rush");
        Event e2 = new RoboticsEvent(2,"Robo fest",12,"DEPSTAR",10,48,"Robo Contest");
        Event e3 = new HackathonEvent(3,"WIT Hackathon",13,"CMPICA",10,64,"Hackers");

       
        Registrable r1 = (Registrable) e1;
        Registrable r2 = (Registrable) e2;
        Registrable r3 = (Registrable) e3;
      
        e1.displayEventDetails();
        e2.displayEventDetails();
        e3.displayEventDetails();

        r1.registerParticipant("Yashvi Gor");
        r1.registerParticipant("Kalp Gor");
        r1.registerParticipant("Het Pandya");

        r2.registerParticipant("Mauli Rami");
        r2.registerParticipant("Nishva Patel");
        r2.registerParticipant("Vedant Bhatt");

        r3.registerParticipant("Twisha Modi");
        r3.registerParticipant("Neha Chauhan");
        r3.registerParticipant("Dhwani Pandya");

        r1.showParticipants();
        r2.showParticipants();
        r3.showParticipants();
                  
    }
}
