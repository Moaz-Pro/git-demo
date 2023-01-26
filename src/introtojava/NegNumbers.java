package introtojava;

import java.util.Scanner;

public class NegNumbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		if (num > 0) {
			System.out.println(num + " is positive.");
		} else if (num < 0) {
			System.out.println(num + " is negative.");
		} else {
			System.out.println(" is zero.");
		}
	}
}

