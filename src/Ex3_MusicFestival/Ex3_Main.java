package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Ex3_Main {

    public static void run(){

        ArrayList<Event> allEvents = new ArrayList<>();
        //MainStageEvents
        allEvents.add(new MainStageEvent("Walk of the Earth","Music") );
        allEvents.add(new MainStageEvent("M and M","Music") );
        allEvents.add(new MainStageEvent("Taylor Slow", "Music"));
        allEvents.add(new MainStageEvent("Kanye East", "Music"));
        allEvents.add(new MainStageEvent("Kendrick Lame R", "Music"));
        //NonMusicEvents
        allEvents.add(new NonMusicEvent("Curry Connection", "Food Truck","Truck 9"));
        ((NonMusicEvent) allEvents.get(5)).setRent(50);
        allEvents.add(new merchBooth("Tony's T-Shirts", "Merch" , "Tent 4",5,100));
        allEvents.add(new merchBooth("Pleasant Pants","Merch","Tent 19",5,38));
        allEvents.add(new merchBooth("Happy Hoodies","Merch","Tent 6",9,99));
        allEvents.add(new merchBooth("Tilted T-Shirts","Merch","Tent 5",10,101));
        allEvents.add(new merchBooth("Paradise Puffer Jackets","Merch","Tent 1",7,87));
        //SmallStageEvents
        allEvents.add(new SmallStageEvent("Bottle Caps","Music",300,500));
        allEvents.add(new SmallStageEvent("Kevin Fart","Comedy",600,700));
        allEvents.add(new SmallStageEvent("Woodallica","Music",100,57));
        allEvents.add(new SmallStageEvent("DC/AC","Music",320,510));
        allEvents.add(new SmallStageEvent("Justin Beaver","Music",15,30));


        ((MainStageEvent) allEvents.get(0)).addTech("Fireworks");
        ((MainStageEvent) allEvents.get(0)).addTech("Loud Speakers");


        while (true) {
            System.out.println();
            System.out.println("Choose from the following options.");

            System.out.println("1. Add new Event");
            System.out.println("2. Search For Events");
            System.out.println("3. Filter By Event Type");
            System.out.println("4. exit.");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                System.out.println("Add new Event");
                System.out.println();
                System.out.println("What type of Event would you like to add? (Ex. Main Stage, Small Stage, etc");
                String eventType = Library.input.nextLine();

                if(eventType.contains("main")){
                    System.out.println("What kind of performance is happening?");
                    String kind = Library.input.nextLine();
                    System.out.println("What is the arist's / performer's name?");
                    String name = Library.input.nextLine();
                    System.out.println("How many pieces of tech does the performance need?");
                    int techNum = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("What kind of tech does this performance need?");
                    allEvents.add(new MainStageEvent(name,kind));
                    for (int i = 0; i < techNum; i++) {
                        String tech = Library.input.nextLine();
                        ((MainStageEvent)allEvents.get(allEvents.size()-1)).addTech(tech);
                    }


                }
                if(eventType.contains("small")){
                    System.out.println("What kind of performance is happening?");
                    String kind = Library.input.nextLine();
                    System.out.println("What is the arist's / performer's name?");
                    String name = Library.input.nextLine();

                }
                if(eventType.contains("merch")){

                }
                if(eventType.contains("non")){

                }

            } else if (choice == 2) {
                System.out.println("Search for Events");
                System.out.println();
                System.out.println("What Event (Performer / name) are you searching for?");
                String findEvent = Library.input.nextLine();
                int eventIndex = searchForEvent(allEvents,findEvent);

                if(eventIndex != -1){

                    if(allEvents.get(eventIndex) instanceof MainStageEvent){
                        ((MainStageEvent) allEvents.get(eventIndex)).PrintAllInfo();
                    }
                    if(allEvents.get(eventIndex) instanceof SmallStageEvent){
                        ((SmallStageEvent) allEvents.get(eventIndex)).PrintAllInfo();

                    }
                    if(allEvents.get(eventIndex) instanceof merchBooth){
                        ((merchBooth) allEvents.get(eventIndex)).PrintAllInfo();
                    }
                    if(allEvents.get(eventIndex) instanceof NonMusicEvent){
                        ((NonMusicEvent) allEvents.get(eventIndex)).PrintAllInfo();
                    }

                }
                else{
                    System.out.println("Can't find event. Try again later.");
                }



            } else if (choice == 3) {
                System.out.println("Filter by Type");
                System.out.println("What kind of event would you like to see? (Main Stage, Small Stage, Food, Merchandise)");
                String eType = Library.input.nextLine();
                for (int i = 0; i < allEvents.size(); i++) {
                    if(eType.contains("main")){
                        if(allEvents.get(i) instanceof MainStageEvent){
                            allEvents.get(i).PrintEvent();
                        }
                    }
                    if(eType.contains("small")){
                        if(allEvents.get(i) instanceof SmallStageEvent){
                            allEvents.get(i).PrintEvent();
                        }
                    }
                    if(eType.contains("merch")){
                        if(allEvents.get(i) instanceof merchBooth){
                            allEvents.get(i).PrintEvent();
                        }
                    }
                    if(eType.contains("food")){
                        if(allEvents.get(i) instanceof NonMusicEvent && !(allEvents.get(i) instanceof merchBooth)){
                            allEvents.get(i).PrintEvent();
                        }
                    }
                }
                //if()

            } else if (choice == 4) {
                break;
            }

        } // while loop

        System.out.println("Thank you. Please come again.");

    }//run


    public static int searchForEvent (ArrayList<Event> list , String searchTerm){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase(list.get(i).getEventName())){
                return i;
            }
        }

        return -1;
    }
}//Main
