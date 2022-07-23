package org.Programs37;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("Enter the sum of digits");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0) {
		i=a%10;
		j=j+i;
		a=a/10;
		}
		System.out.println("Sum of the digits "+j);
		}
	}

//backendlogic
//n=123
//a=123
//while(123>0)
//i=123 % 10 = 3
//j=0+3 = 3
//a= 123/10 = 12

//while(12>0)
//i=12 % 10 = 2
//j=3 + 2 = 5
//a= 12/10 = 1

//while(1>0)
//i=1%10 = 1
//j=5 +1 = 6
//a=1/10 = 0

//while(0>0) false
