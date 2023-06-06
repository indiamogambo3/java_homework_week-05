package java_homework_week05;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */

import java.util.ArrayList;

public class P7_ArrayListEmptyOrNot {

    public static void main(String[] args) {

        isEmpty();
    }

    public static void isEmpty() {

        ArrayList<String> colours = new ArrayList();

        colours.add("Yellow");
        colours.add("Red");
        colours.add("Orange");
        colours.add("Purple");
        colours.add("Blue");
        colours.add("Green");

        System.out.println("The list of arrays is: " + colours);

        if (colours.isEmpty()) {
            System.out.println("Array list is empty.");
        } else {
            System.out.println("Array list is not empty");
        }
    }


}
