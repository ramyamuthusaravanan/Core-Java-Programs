package org.Programs37;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial number:");
		int n=sc.nextInt();
		int Fact=1;
		for(int i=1;i<=n;i++) {
			Fact=Fact*i;
			
		}
		System.out.println(Fact);
	}

}
//Backend logic
//n=5 , fact=1
//i=1 , 1<=5 
//fact = 1*1 = 1 , i=i+1 , i=2

//i=2 , 2<=5
//fact = 1*2 = 2 , i=3

//i=3 , 3<=5
//fact = 2*3 = 6 , i=4

//i=4 , 4<=5
//fact = 6*4 = 24 , i=5

//i=5 , 5<=5
//fact = 24*5 = 120 , i=6

//i=6 , 6<=5   false



