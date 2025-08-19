class Event {
    private int eventId;
    private String eventName;
    private int date;
    private String venue;

    Event(int eventId, String eventName, int date, String venue) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
    }

    public void displayEventDetails() {
        System.out.println("The Event Id is " + eventId);
        System.out.println("The Event Name is " + eventName);
        System.out.println("The Date of the Event is " + date);
        System.out.println("The Venue of the Event is " + venue);
    }
}

class CodingEvent extends Event implements Registrable {
    private int maxSize;
    private int duration;
    private String theme;
    private String[] participants;
    private int count = 0;

    CodingEvent(int eventId, String eventName, int date, String venue, int maxSize, int duration, String theme) {
        super(eventId, eventName, date, venue);
        this.maxSize = maxSize;
        this.duration = duration;
        this.theme = theme;
        this.participants = new String[maxSize];
    }

    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("The Maximum Team size is " + maxSize);
        System.out.println("The duration of this Event is " + duration+ " hours");
        System.out.println("The Theme of this Event is " + theme);
    }

    public void registerParticipant(String name) {
        if (count < maxSize) {
            participants[count++] = name;
            System.out.println("The Registered Name is " + name);
        } else {
            System.out.println("Registration full for Coding Event");
        }
    }

    public void showParticipants() {
        System.out.println("Participants in Coding Event:");
        for (int i = 0; i < count; i++) {
            System.out.println(participants[i]);
        }
    }
}

class RoboticsEvent extends Event implements Registrable {
    private int maxSize;
    private int duration;
    private String theme;
    private String[] participants;
    private int count = 0;

    RoboticsEvent(int eventId, String eventName, int date, String venue, int maxSize, int duration, String theme) {
        super(eventId, eventName, date, venue);
        this.maxSize = maxSize;
        this.duration = duration;
        this.theme = theme;
        this.participants = new String[maxSize];
    }

    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("The Maximum Team size is " + maxSize);
        System.out.println("The duration of this Event is " + duration+" hours");
        System.out.println("The Theme of this Event is " + theme);
    }

    public void registerParticipant(String name) {
        if (count < maxSize) {
            participants[count++] = name;
            System.out.println("The Registered Name is " + name);
        } else {
            System.out.println("Registration full for Robotics Event");
        }
    }

    public void showParticipants() {
        System.out.println("Participants in Robotics Event:");
        for (int i = 0; i < count; i++) {
            System.out.println(participants[i]);
        }
    }
}

class HackathonEvent extends Event implements Registrable {
    private int maxSize;
    private int duration;
    private String theme;
    private String[] participants;
    private int count = 0;

    HackathonEvent(int eventId, String eventName, int date, String venue, int maxSize, int duration, String theme) {
        super(eventId, eventName, date, venue);
        this.maxSize = maxSize;
        this.duration = duration;
        this.theme = theme;
        this.participants = new String[maxSize];
    }

    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("The Maximum Team size is " + maxSize);
        System.out.println("The duration of this Event is " + duration+" hours");
        System.out.println("The Theme of this Event is " + theme);
    }

    public void registerParticipant(String name) {
        if (count < maxSize) {
            participants[count++] = name;
            System.out.println("The Registered Name is " + name);
        } else {
            System.out.println("Registration full for Hackathon Event");
        }
    }

    public void showParticipants() {
        System.out.println("Participants in Hackathon Event:");
        for (int i = 0; i < count; i++) {
            System.out.println(participants[i]);
        }
    }
}
