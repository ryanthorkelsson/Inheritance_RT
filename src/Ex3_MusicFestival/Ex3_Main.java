package Ex3_MusicFestival;

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
            System.out.println("4. Print by type");
            System.out.println("5. Add Tech for Main Stage Events");
            System.out.println("6. exit.");

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
                    allEvents.add(new MainStageEvent(name,kind));

                }
                if(eventType.contains("small")){
                    System.out.println("What kind of performance is happening?");
                    String kind = Library.input.nextLine();
                    System.out.println("What is the arist's / performer's name?");
                    String name = Library.input.nextLine();
                    System.out.println("What is the attendance capacity of this event?");
                    int cap = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("How many attendees are going to be at this event?");
                    int guests = Library.input.nextInt();
                    Library.input.nextLine();
                    allEvents.add(new SmallStageEvent(name,kind,cap,guests));

                }
                if(eventType.contains("merch")){
                    System.out.println("WHat is the name of this merchandise booth?");
                    String name = Library.input.nextLine();
                    System.out.println("What tent number is this booth located?");
                    String loc = Library.input.nextLine();
                    System.out.println("What is the percent commission this booth being charged?");
                    int com = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("How many items has this booth sold?");
                    int ns = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("How many items are being sold here?");
                    int numItems = Library.input.nextInt();
                    Library.input.nextLine();

                    allEvents.add(new merchBooth(name, "merch", loc, com, ns));

                    int foundBooth = searchForEvent(allEvents, name);

                    for (int i = 0; i <numItems ; i++) {
                        System.out.println("What item would you like to sell?");
                        String newItem = Library.input.nextLine();
                        ((merchBooth) allEvents.get(foundBooth)).addItems(newItem);
                    }
                }
                if(eventType.contains("non")){
                    System.out.println("What is the name of this event?");
                    String name = Library.input.nextLine();
                    System.out.println("What kind of station / event is this?");
                    String type = Library.input.nextLine();
                    System.out.println("What is the location of this event?");
                    String loc = Library.input.nextLine();
                    System.out.println("What is this station being charged for rent?");
                    int rent = Library.input.nextInt();
                    Library.input.nextLine();

                    allEvents.add(new NonMusicEvent(name,type,loc));
                    int newNonMusic = searchForEvent(allEvents,name);

                    ((NonMusicEvent) allEvents.get(newNonMusic)).setTime();
                    ((NonMusicEvent) allEvents.get(newNonMusic)).setRent(rent);
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
                    if(allEvents.get(eventIndex) instanceof NonMusicEvent && !(allEvents.get(eventIndex) instanceof merchBooth)){
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
                System.out.println("Print events by type");

                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof NonMusicEvent){
                        ((NonMusicEvent) allEvents.get(i)).PrintAllInfo();
                    }
                }
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof MainStageEvent){
                        ((MainStageEvent) allEvents.get(i)).PrintAllInfo();
                    }
                }
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof SmallStageEvent){
                        ((SmallStageEvent) allEvents.get(i)).PrintAllInfo();
                    }
                }



            }
            else if (choice == 5) {
                System.out.println("Add tech");
                System.out.println();
                System.out.println("What performance do you want to add tech to?");
                String artistTech = Library.input.nextLine();
                int artistIndex = searchForEvent(allEvents,artistTech);
                if(artistIndex == -1){
                    System.out.println("This performance can't be found. Try again later.");
                }
                if(artistIndex != -1){
                    if(allEvents.get(artistIndex) instanceof MainStageEvent){
                        System.out.println("How many pieces of tech would you like to add?");
                        int techAdd = Library.input.nextInt();
                        Library.input.nextLine();
                        if(techAdd > 0){
                            for (int i = 0; i < techAdd; i++) {
                                System.out.println("What piece of tech would you like to add to this performance?");
                                String newTech = Library.input.nextLine();
                                ((MainStageEvent) allEvents.get(artistIndex)).addTech(newTech);
                            }

                        }
                        else{
                            System.out.println("Invalid number of tech pieces.");
                        }
                    }
                    else{
                        System.out.println("This is not a main stage event");
                    }
                }// artistIndex != -1
            }// choice 5
            else if (choice == 6) {
                break;
            }// choice 6

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
