package Collections;

import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args){
        List<String> listOfItems=new LinkedList<String>();
        listOfItems.add("Mike");
        listOfItems.add("Bob");
        listOfItems.add("Alice");

        for(String items:listOfItems){
            System.out.println(items);
        }
    }
}
