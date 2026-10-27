package ictjavaprograms;

public class TypeCasting {
	 public static void main(String[] args) {
	        int a = 100;

	        // Widening: int to double
	        double d1 = a;
	        System.out.println("Int to double: " + d1);

	        double d = 123.78;

	        // Narrowing: decimal part is lost
	        int b = (int) d;
	        System.out.println("Double to int: " + b);

	        int number = 130;

	        // Byte range is -128 to 127
	        byte c = (byte) number;
	        System.out.println("Int to byte: " + c);
	    }
	}