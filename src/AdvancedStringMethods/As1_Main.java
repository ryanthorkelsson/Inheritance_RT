package AdvancedStringMethods;

import TwoD_Arrays.Library;

import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {

    public static Scanner input = new Scanner( System.in );




    public static void run() {

        ArrayList <Message> allMessages = new ArrayList<>();

        allMessages.add(new Message("Client3: repeated login failure"));
        allMessages.add(new Message("Client2: filed password reset on file"));
        allMessages.add(new Message("Server1: file not found"));
        allMessages.add(new Message("Server3: ping not returned"));
        allMessages.add(new Message("Server1: write file error on disk DSK1"));
        allMessages.add(new Message("Server2: disk failure of DSK2"));
        allMessages.add(new Message("Server2: diskette diskette"));
        allMessages.add(new Message("Client3: diskette disk"));
        allMessages.add(new Message("Router1: missing packet"));
        allMessages.add(new Message("PC4: power surge detected"));




        System.out.println("Assign 1 Network Messages");

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                System.out.println("What message would you like to send?");
                String message = Library.input.nextLine();
                allMessages.add(new Message(message));

            } else if (option == 2) {
                System.out.println("Machine Type___Machine ID___Security Warning");
                for (int i = 0; i < allMessages.size(); i++) {
                    System.out.println( allMessages.get(i).getMachineType() + "___" + allMessages.get(i).getMachineId() + "___" + allMessages.get(i).getWarning() + ".");
                }

            } else if (option == 3) {
                System.out.println("What would you like to scan for?");
                String keyWord = Library.input.nextLine();
                System.out.println();
                System.out.println("Warning-----Scan result for " + keyWord);
                for (int i = 0; i < allMessages.size(); i++) {
                    System.out.println(allMessages.get(i).getWarning() + "-----" + allMessages.get(i).scanWarning(keyWord));
                }

            } else if (option == 4) {
                break;
            } else {
                System.out.println("That is not an available option");
            }
            System.out.println("Logging out. Good Bye.");        }//while

    }//main

}//class
