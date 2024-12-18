package Ex3_MusicFestival;

import java.awt.font.LineBreakMeasurer;
import java.util.ArrayList;

class merchBooth extends NonMusicEvent{

    private int commissionPct;
    ArrayList<String> allItems;
    private int numSales;

    merchBooth (String name, String type, String loc,int com,int ns){
        super(name, type, loc);
        commissionPct = com;
        numSales = ns;

        allItems = new ArrayList<String>();
    }


    public void setRent(int r){
        rent = rent + (rent * commissionPct);
    }

    public void addItems() {
        System.out.println("What Item would you like to add?");
        String newItem = Library.input.nextLine();
        allItems.add(newItem);
    }
    public void PrintList(){
        for (int i = 0; i < allItems.size(); i++) {
            System.out.println(allItems.get(i));
        }
    }

    public void PrintAllInfo(){
        System.out.println("Name of Booth: " + super.getEventName() + "  Event Type: " + super.getEventType() + "  Event Location: " + super.getLocation());
        System.out.println("The items this booth is selling are:");
        PrintList();
        System.out.println("The commission that this booth is being charge per purchase is: " + commissionPct + "%");
        System.out.println("The number of item this booth has sold is: " + numSales);
    }

    }//class
