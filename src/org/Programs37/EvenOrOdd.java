package org.Programs37;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even numbers"+n);
		}
		else {
			System.out.println("Oddnumbers"+n);
		}

	}

}

//backend logic
//n=23
//if(23 % 2 == 3)
//so odd number is 23
