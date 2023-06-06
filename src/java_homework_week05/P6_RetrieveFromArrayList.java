package java_homework_week05;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class P6_RetrieveFromArrayList {

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

        System.out.println(colours);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an index number:");
        int index = scanner.nextInt();

        if (index < colours.size()) {
            System.out.println(colours.get(index));
        } else {
            System.out.println("Invalid index entered.");
        }

        scanner.close();


    }


}
