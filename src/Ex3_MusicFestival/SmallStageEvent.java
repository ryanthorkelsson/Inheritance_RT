package Ex3_MusicFestival;

import java.util.ArrayList;

class SmallStageEvent extends Event{

    private int capacity;
    ArrayList<String> allBands;
    private double artistPay;
    private int guests;

    public SmallStageEvent(String name, String type,int cap,int g) {
        super(name, type);
        super.setLocation("Small Stage");
        capacity = cap;
        guests = g;
    }


    public void PrintEvent(){
        System.out.println("Name:" + super.getEventName() + " Time: " + super.getTime() + " Location: " + super.getLocation());
    }

    public void changePay(){
        artistPay = 2 * guests;
    }

    public void PrintAllInfo(){
        System.out.println("Name of Event/Performer: " + super.getEventName() + "  Event Type: " + super.getEventType() + "  Event Location: " + super.getLocation());
        System.out.println("The capacity for this event is: " + capacity);
        System.out.println("The number of attendees for this event is: " + guests);
        changePay();
        System.out.println(super.getEventName() + " will be payed $" + artistPay + " for this event");
    }



}//class
