package org.Programs37;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		a=a + b;
		System.out.println("a + b===" +a);
		b=a - b;
		System.out.println("a-b====" +b);
		a=a - b;
		System.out.println("a-b===="+a);
		
		System.out.println("Swapping numbers are");
		System.out.println(a);
		System.out.println(b);
	}

}

//Backend logic
//a = 12
//b=24

//a= 12 + 24 = 36
//b = 12 - 24 = 12
//a = 36 - 12 = 24

//swapped number are
//a =24 , b= 12;

