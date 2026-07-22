package DSA;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        //logic
        int reversedNumber = 0;

        while(num != 0) {
            int lastDigit = num % 10;  //fetch the last digit of number.
            num = num / 10;           //remove the last digit of number.
            reversedNumber = reversedNumber * 10 + lastDigit; //reverse each digit
        }

        System.out.println("Reversed Number: "  + reversedNumber);

        sc.close();
    }
}


/*
go through this problem again !!!!
*/
