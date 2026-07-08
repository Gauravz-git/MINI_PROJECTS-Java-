package number_format;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);

        try {
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("Valid Number: " + number);
        } catch (NumberFormatException e){
            System.out.println("input is not a valid number!!");
        }

        sc.close();
    }
}
