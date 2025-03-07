package Family_Tree;

import java.util.ArrayList;

public class FamilyTreeMain {

    public static void run(){

        Person person1 = new Person("Bobbie","Mexico");
        //gen2
        person1.addChild(new Person("Susan","Canada"));
        person1.addChild(new Person("Jill","Canada"));
        person1.addChild(new Person("Bobette","Japan"));

        //gen 3
        person1.children.get(0).addChild(new Person("Zain","Japan"));
        person1.children.get(2).addChild(new Person("Bob III", "Belize"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
        person1.children.get(1).addChild((new Person ("Ryan", "Germany")));
        person1.children.get(1).addChild((new Person ("Brian", "Portugal")));

        //gen 4
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));       person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));
        person1.children.get(1).children.get(0).addChild(new Person("Bryan","Canada"));
        person1.children.get(1).children.get(0).addChild(new Person("Rian","Canada"));

        person1.children.get(1).children.get(0).children.get(0).addChild(new Person ("John","Sweden"));



    }//run

    public static int countFamily(Person ptemp){
        int num =0;

        return num;
    }

    public static void printCanadians(Person ptemp){



    }

    public static void printFamily(Person ptemp){

    }




}
