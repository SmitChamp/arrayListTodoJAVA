package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scn =new Scanner(System.in);
    private static Perform perform = new Perform();

    public static void main(String[] args) {

        boolean open = true;
        try{

        printCommand();

         while (open) {
             System.out.println("Press 7 to look for Commands");
             System.out.println("Enter Your Command");
             int command = scn.nextInt();
             switch (command) {
                 case 1:
                     addItem();
                     break;
                 case 2:
                     addItemAtPosition();
                     break;
                 case 3:
                     removeItem();
                     break;
                 case 4:
                     updateTODO();
                     break;
                 case 5:
                     printTODO();
                     break;
                 case 6:
                     searchTODO();
                     break;
                 case 7:
                     printCommand();
                     break;
                 case 8:
                     open = false;
                     break;
                 default:
                     System.out.println("Wrong Input");
                     break;
             }
         }
         }
         catch (Exception e)
        {
            System.out.println("Wrong Input");
            System.out.println("Application Quit");
        }

    }

    private static void printCommand()
    {
        System.out.println("\n"+" 1: Add TODO Items:" +
                "\n"+" 2: Add TODO Items at Position:" +"\n"+" 3: Delete Item"+"\n"+" 4. Update TODO List"+"\n"+
                " 5: Print TODO List"+"\n"+" 6: Search Item"+"\n"+" 7: Print Commands"+"\n"+" 8: Exit");

    }

    private static void addItem()
    {
        System.out.print("Enter Item: ");
        String string = scn.next();
        perform.addString(string);
    }

    private static void addItemAtPosition()
    {
        int position;
        String string;
        System.out.println("Enter Position where you want to add Item");
        position = scn.nextInt();
        System.out.println("Enter Item: ");
        string = scn.next();
        perform.addStringAtPosition((position-1), string);
    }

    private static void removeItem()
    {
        System.out.println("Enter the Position of Item to be removed ");
        int position = scn.nextInt();
        perform.delete(position-1);
    }

    private static void updateTODO()
    {
        int position;
        String string;
        System.out.println("Enter Position to update");
        position = scn.nextInt();
        System.out.println("Enter Item: ");
        string = scn.next();
        perform.update((position-1), string);
    }

    private static void searchTODO()
    {
        String string;
        System.out.println("Enter Item: ");
        string = scn.next();
        int result = perform.search(string);
        if (result == -1)
        {
            System.out.println("No Item Found");
        }
        else
        {
            System.out.println("Item found at position: "+(result+1));
        }
    }

    private static void printTODO()
    {
        perform.print();
    }

}



