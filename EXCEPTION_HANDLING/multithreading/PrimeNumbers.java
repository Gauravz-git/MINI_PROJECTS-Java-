import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        //prime number logic
        if (num <= 1) {
            System.out.println("is not a prime number");
        } else {
            System.out.println(" is a prime number");
        }

        sc.close();
    }
}
