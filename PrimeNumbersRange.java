package ictjavaprograms;
import java.util.Scanner;
public class PrimeNumbersRange {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }

            boolean prime = true;

            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}