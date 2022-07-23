package org.Programs37;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			}
		if(n==j) {
			System.out.println("It is panlidrome");
			}
		else {
			System.out.println("It is not a panlindrome");
			}
		}
	}

//Backend logic
//n=11
//a=11
//while(11>0)
//i=11 % 10 = 1
//j= 0 * 10 + 1 = 1
//a = 11 / 10 = 1

//while(1>0)
//i=1 % 10 = 1
//j= 1 * 10 + 1 = 11
//a = 1 / 10 = 0

//while(0>0) false
//if (11 = 11) , its palindrome
