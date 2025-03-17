package Family_Tree;

import java.util.ArrayList;

public class Person {

    public String name;
    public String country;
    public ArrayList <Person> children;

    public Person (String n, String c){
        name =n;
        country =c;
        children = new ArrayList<>();

    }

    public void addChild(Person p){
        children.add(p);
    }


    public void printPerson(){
        System.out.println("Name: " + name + "| Country: " + country);
    }


}//class
