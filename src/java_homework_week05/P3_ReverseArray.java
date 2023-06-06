package java_homework_week05;

/**
 * 3. Write a Java program to reverse an array of integer values
 */

import java.util.Arrays;

public class P3_ReverseArray {

    public static void main(String[] args) {

        int[] array = new int[]{12, 24, 10, 36, 52};
        System.out.println("Actual order of array: " + Arrays.toString(array));
        System.out.println("Reverse order of array is: ");
        reverseArray(array);
    }

    public static void reverseArray(int[] list) {
        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }

}

