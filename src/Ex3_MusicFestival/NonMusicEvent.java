package Ex3_MusicFestival;

class NonMusicEvent extends Event {
    public int rent;


    public NonMusicEvent(String name, String type, String loc ){
        super(name, type);
        super.setLocation(loc);
        this.rent = -1; // arbitrary default integer 

    }


    public void setRent(int r){
        this.rent = r;
    }

    public void setTime(){
        super.setTime("All day");
    }

    public void PrintAllInfo() {
        setTime();
        System.out.println("Name: " + super.getEventName() + "  Time: " + super.getTime() + " Location: " + super.getLocation());
        System.out.println("This event is being charged $" + rent + " for renting their space");
    }






}//class