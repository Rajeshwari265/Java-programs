package ictjavaprograms;
import java.util.Scanner;
public class FibonacciFactorial {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Fibonacci series
	        System.out.print("Enter number of Fibonacci terms: ");
	        int n = sc.nextInt();

	        if (n <= 0) {
	            System.out.println("Enter a positive number");
	        } else {
	            int a = 0, b = 1;

	            System.out.print("Fibonacci: ");

	            for (int i = 1; i <= n; i++) {
	                System.out.print(a + " ");

	                int c = a + b;
	                a = b;
	                b = c;
	            }

	            System.out.println();
	        }

	        // Factorial using do-while
	        System.out.print("Enter number for factorial: ");
	        int num = sc.nextInt();

	        if (num < 0 || num > 20) {
	            System.out.println("Enter a number from 0 to 20");
	        } else {
	            long factorial = 1;
	            int i = 1;

	            do {
	                factorial = factorial * i;
	                i++;
	            } while (i <= num);

	            System.out.println("Factorial = " + factorial);
	        }

	        sc.close();
	    }
	}
