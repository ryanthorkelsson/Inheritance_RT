package Ex3_MusicFestival;

import java.util.ArrayList;

class SmallStageEvent extends Event{

    private int capacity;
    ArrayList<String> allBands;
    private double artistPay;

    public SmallStageEvent(String name, String type,int cap,double pay) {
        super(name, type);
        super.setLocation("Small Stage");
        capacity = cap;
        artistPay = pay;
    }


    public void PrintEvent(){
        System.out.println("Name:" + super.getEventName() + " Time: " + super.getTime() + " Location: " + super.getLocation());
    }



}
