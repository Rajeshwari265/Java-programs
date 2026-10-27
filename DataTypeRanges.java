package ictjavaprograms;

public class DataTypeRanges {
	 public static void main(String[] args) {
	        System.out.println("Byte Min: " + Byte.MIN_VALUE);
	        System.out.println("Byte Max: " + Byte.MAX_VALUE);

	        System.out.println("Short Min: " + Short.MIN_VALUE);
	        System.out.println("Short Max: " + Short.MAX_VALUE);

	        System.out.println("Int Min: " + Integer.MIN_VALUE);
	        System.out.println("Int Max: " + Integer.MAX_VALUE);

	        System.out.println("Long Min: " + Long.MIN_VALUE);
	        System.out.println("Long Max: " + Long.MAX_VALUE);

	        System.out.println("Float Min: " + Float.MIN_VALUE);
	        System.out.println("Float Max: " + Float.MAX_VALUE);

	        System.out.println("Double Min: " + Double.MIN_VALUE);
	        System.out.println("Double Max: " + Double.MAX_VALUE);

	        int number = Integer.MAX_VALUE;
	        System.out.println("After overflow: " + (number + 1));
	    }
	}