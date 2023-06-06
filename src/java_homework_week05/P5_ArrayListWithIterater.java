package java_homework_week05;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class P5_ArrayListWithIterater {

    public static void main(String[] args) {

        coloursList();
    }

    public static void coloursList() {

        ArrayList<String> colours = new ArrayList();
        colours.add("Yellow");
        colours.add("Red");
        colours.add("Orange");
        colours.add("Purple");
        colours.add("Blue");
        colours.add("Green");

        ListIterator<String> iterator = colours.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }


    }


}
