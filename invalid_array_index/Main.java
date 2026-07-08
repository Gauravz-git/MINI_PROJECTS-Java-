package invalid_array_index;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Index: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}