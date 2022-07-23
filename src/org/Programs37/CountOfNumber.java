package org.Programs37;

import java.util.Scanner;

public class CountOfNumber {

	public static void main(String[] args) {
		System.out.println("enter the numbers you want to count");
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=0;
		while(n>0) {
			n=n/10;
			i++;
		}
		System.out.println("No of digits present: "+i);

	}

}

//back endlogic
//n=12345
//while(12345>0)
//n=12345 / 10 = 1234
//i=1;

//while(1234>0)
//n=1234 / 10 = 123
//i=2;

//while(123>0)
//n=123/10 = 12
//i=3;

//while(12>0)
//n=12/10 = 1
//i=4;

//while(1>0)
//n=1/10 = 0
//i=5;

//while(0>0) false , print i=5;
