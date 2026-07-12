package stringtointeger;

import java.util.Scanner;

public class StringtoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String string = sc.nextLine();

        try {
            int convertedString = Integer.parseInt(string);
            System.out.println("Converted String : " + convertedString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }

        sc.close();
    }
}
