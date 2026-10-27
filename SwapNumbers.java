package ictjavaprograms;

public class SwapNumbers {
	 public static void main(String[] args) {
	        int a = 10, b = 20;

	        // Method 1: Temporary variable
	        int temp = a;
	        a = b;
	        b = temp;
	        System.out.println("Temp swap: a=" + a + ", b=" + b);

	        // Reset values
	        a = 10;
	        b = 20;

	        // Method 2: Arithmetic operators
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        System.out.println("Arithmetic swap: a=" + a + ", b=" + b);

	        // Reset values
	        a = 10;
	        b = 20;

	        // Method 3: XOR operator
	        a = a ^ b;
	        b = a ^ b;
	        a = a ^ b;
	        System.out.println("XOR swap: a=" + a + ", b=" + b);
	    }
	}
