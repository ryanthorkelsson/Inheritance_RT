package Ex2_Restaurant;


import java.util.ArrayList;

public class Ex2_Main {

    public static void run() {
        ArrayList<Employee> allEmps = new ArrayList<>();

//        Employee a = new Employee();
//        System.out.println(a.getName());

        allEmps.add(new Manager(50000));
        allEmps.add(new Manager(40000));
        allEmps.add(new Worker(15.00));
        allEmps.add(new Worker(18.50));

        for(Employee e: allEmps){
            System.out.println(e.getPay());
        }
    }//run
}//Ex2_Main
