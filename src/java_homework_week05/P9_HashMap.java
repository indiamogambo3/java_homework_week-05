package java_homework_week05;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class P9_HashMap {

    public static void main(String[] args) {

        colours();
    }

    public static void colours() {

        Map<String, Integer> colourNumber = new HashMap<>();
        colourNumber.put("Yellow", 1);
        colourNumber.put("Red", 2);
        colourNumber.put("Orange", 3);
        colourNumber.put("Purple", 4);
        colourNumber.put("Blue", 5);
        colourNumber.put("Green", 6);

        for (Map.Entry<String, Integer> colourNum : colourNumber.entrySet()) {
            System.out.println(colourNum.getKey() + " = " + colourNum.getValue());
        }

    }


}
