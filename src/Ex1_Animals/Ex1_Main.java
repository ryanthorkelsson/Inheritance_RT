package Ex1_Animals;

import java.util.ArrayList;

public class Ex1_Main {
    public static void run(){
        ArrayList<Animal> allAnimals = new ArrayList<>();

        allAnimals.add(new Animal("Max"));
        allAnimals.add(new Dog("Min"));
        allAnimals.add(new Rotweiller("cupcake"));
        allAnimals.add(new Shihtzu("Bubbles"));
        allAnimals.add(new Trout("John"));
//        allAnimals.add(new Baboon(("Fredrick", 57));
        allAnimals.add(new Baboon("Fredrick",57,"ape"));

//        for (int i = 0; i < allAnimals.size(); i++) {
////            System.out.println(allAnimals.get(i));
//            allAnimals.get(i).talk();
//        }

        System.out.println("What does the dogs say?");
        for (int i = 0; i < allAnimals.size(); i++) {
            if(allAnimals.get(i) instanceof Dog){
                allAnimals.get(i).talk();

            }
        }

        System.out.println(allAnimals.get(5));
        System.out.println("Stupid AP Question #1:");
        Animal a = new Rotweiller("Princess");
//        Rotweiller b = new Dog("Bunny");
        a.talk();
    }
}
