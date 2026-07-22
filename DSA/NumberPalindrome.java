package DSA;

public class NumberPalindrome {
    public static void main(String[] args) {

        int num = 121;
        int original = num;

        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        if (reverse == original) {
            System.out.println("Is a Palindrome Number.");
        } else {
            System.out.println("Is Not a Palindrome Number.");
        }
    }
}

/*
go through this problem again
*/