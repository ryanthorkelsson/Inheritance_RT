package Ex3_MusicFestival;

import java.awt.font.LineBreakMeasurer;
import java.util.ArrayList;

class merchBooth extends NonMusicEvent{

    private int commissionPct;
    ArrayList<String> allItems;
    private int numSales;

    merchBooth (String name, String type, String loc,int com,int ns){
        super(name, type, loc);
        commissionPct = com /100;
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

    }//class
