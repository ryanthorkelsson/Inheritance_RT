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
                    System.out.println("What kind of perfomance is happening?");
                    String kind = Library.input.nextLine();
                    System.out.println("What is the arist's / performer's name?");
                    String name = Library.input.nextLine();
                    allEvents.add(new MainStageEvent(name,kind));
                }
                if(eventType.contains("small")){

                }
                if(eventType.contains("merch")){

                }
                if(eventType.contains("non")){

                }

            } else if (choice == 2) {
                System.out.println("Search for Events");
            } else if (choice == 3) {
                System.out.println("Filter by Type");
            } else if (choice == 4) {
                break;
            }

        } // while loop

        System.out.println("Thank you. Please come again.");

    }//run
}//Main
