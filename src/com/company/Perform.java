package com.company;

import java.util.ArrayList;

public class Perform {

    private static ArrayList<String> al = new ArrayList<String>();

    void addString(String string)
    {
        al.add(string);
    }

    void addStringAtPosition(int pos, String string)
    {
        al.add(pos, string);
    }

    void delete(int pos)
    {
        al.remove(pos);
        System.out.println("Item Removed");
    }

    void update(int pos, String string)
    {
        al.set(pos, string);
    }

    int search(String string)
    {
       return al.indexOf(string);
    }

    void print()
    {
        System.out.println("Items in the List are:");
        for(int i=0; i<al.size(); i++)
        {
            System.out.println("At position "+(i+1)+": "+al.get(i));
        }
    }


}
