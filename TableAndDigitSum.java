package ictjavaprograms;
import java.util.Scanner;
public class TableAndDigitSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Multiplication table using for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Sum of digits using while loop
        int temp = Math.abs(n);
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}