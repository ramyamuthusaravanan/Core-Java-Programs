package org.Programs37;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check wheater it is amstong number or not?");
		int n = sc.nextInt();
		int a, i = 0, j = 0;
		a = n;
		while (a > 0) {
			i = a % 10;
			j = (i * i * i) + j;
			a = a / 10;
		}
		if (n == j) {
			System.out.println("It is amstrong");
		} else {
			System.out.println("It is not a amstrong");
		}

	}

}

// n=153
//a = 153
//while(153>0)
//i=153 % 10 = 3
//j= (3 * 3* 3) + 0 = 27;
//a=153 / 10 = 15

//while(15>0)
//i = 15 % 10 = 5
//j = (5*5*5) + 27 = 152
//a = 15 / 10 = 1

//while(1>0)
//i = 1 % 10 = 1
//j = (1 * 1 * 1) + 152 = 153
//a=1 / 10 = 0

//while(0>0) false

//if(153 = 153) its Amstrong Number