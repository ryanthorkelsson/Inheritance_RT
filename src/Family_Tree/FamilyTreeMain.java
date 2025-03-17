package Family_Tree;



import java.util.ArrayList;

public class FamilyTreeMain {

    public static int num =0;


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
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belize"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));
        person1.children.get(1).children.get(0).addChild(new Person("Bryan","Canada"));
        person1.children.get(1).children.get(0).addChild(new Person("Rian","Canada"));

        person1.children.get(1).children.get(0).children.get(0).addChild(new Person ("John","Sweden"));

//        printFamily(person1);
        System.out.println(countFamily(person1));
//        printCanadians(person1);
        printFromHere("Ryan",person1);



    }//run

    public static int countFamily(Person ptemp){
        num ++;
        int numChildren = ptemp.children.size() -1;
        for (int i = 0; i <= numChildren; i++) {
            countFamily(ptemp.children.get(i));
        }

        return num;
    }

    public static void printCanadians(Person ptemp){
        int numchildren = ptemp.children.size() -1;

        for (int i = 0; i <= numchildren; i++) {
            printCanadians(ptemp.children.get(i));
        }
        if(ptemp.country.equals("Canada")){
            ptemp.printPerson();
        }


    }

    public static void printFamily(Person ptemp){
       int numchildren = ptemp.children.size() -1;
        ptemp.printPerson();
        for (int i = 0; i <= numchildren; i++) {
            printFamily(ptemp.children.get(i));
        }
    }

    public static void printFromHere (String n,Person ptemp){
        Person p = findPerson(n,ptemp);
        printFamily(p);
    }

    public static Person findPerson(String n, Person p){
        for (int i = 0; i < p.children.size(); i++) {
            if(p.children.get(i).name.equalsIgnoreCase(n)){
                return p.children.get(i);
            }
            findPerson(n,p.children.get(i));
        }


        return null;
    }







}
