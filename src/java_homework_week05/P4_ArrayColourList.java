package java_homework_week05;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

import java.util.ArrayList;

public class P4_ArrayColourList {

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

        for (String colourList : colours) {

            System.out.println(colourList + ", ");
        }
    }

}
