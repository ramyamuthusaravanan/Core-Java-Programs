package org.Programs37;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers below");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b = sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Swapping numbers are");
		System.out.println(a);
		System.out.println(b);
	}
}

//back endlogic
//a=12 , b=24
//c=12
//a=24
//b=12
//swapping numbers are
//print a = 24 , b=12;


