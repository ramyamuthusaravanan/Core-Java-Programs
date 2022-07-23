package org.Programs37;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		//int f=1%10;
		//System.out.println(f);
		int a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		
		//System.out.println("Value of i=a%10" + i);
		j=(j*10)+i;
		//System.out.println("Value of j=(j*10)+i" + j);
		a=a/10;
		//System.out.println("Value of a=a/10" + a);
		
		}
		System.out.println("The reverse number is "+j);
	}

}

//Backend logic

//n=12345 , i=0,j=0
//a=n , a=12345
//while(12345>0)
//i=12345 % 10 = 5
//j=0*10 + 5 =5
//a=12345 / 10 = 1234

//while(1234>0)
//i=1234 % 10 = 4
//j=(5*10) + 4 = 54
//a=1234 / 10 = 123

//while(123>0)
//i=123 % 10 = 3
//j=(54*10)+3 = 543
//a=123 / 10 = 12

//while(12>0)
//i=12 % 10 = 2
//j=(543 * 10) + 2 = 5432
//a=12 / 10 = 1

//while(1>0)
//i=1 % 10 = 1
//j=5432 *10 + 1 = 54321
//a=1/10 = 0

//while(0>0) false
