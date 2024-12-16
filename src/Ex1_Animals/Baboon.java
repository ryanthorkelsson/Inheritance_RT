package Ex1_Animals;

public class Baboon extends Animal{

    int numBerry;
    String name;

    public Baboon(String na,int n, String c){
        super(na);
        numBerry = n;
        name = c;
    }

    @Override
    public String toString() {
        return   super.name  + " eats "+ numBerry + " per day.";
    }
}
