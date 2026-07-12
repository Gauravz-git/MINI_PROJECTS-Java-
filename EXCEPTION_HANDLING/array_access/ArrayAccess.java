/*
 ArrayAccess

Create an array of 5 elements.
Ask the user for an index.
Handle invalid indexes.
*/


package array_access;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index: ");
        int index = sc.nextInt();

        try {
                System.out.println("Element at index " + index + " is: " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}
