package DSA;

class PrimeNumber {

    public static void main(String[] args) {

        int number = 13;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}


/*
go through this problem again !!!
*/