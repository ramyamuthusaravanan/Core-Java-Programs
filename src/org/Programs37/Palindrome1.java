package org.Programs37;

public class Palindrome1 {

	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			int a , i=0,j=0;
			a=n;
			while(a>0) {
				i= a %10;
				j=(j*10)+i;
				a=a/10;
			}
			if(n==j) {
				System.out.println(n);
			}
		}

	}

}

//Backend logic
//n=1
//a=1
//while(1>0)
//i=1 % 10 = 1
//j= 0 * 10 + 1 = 1
//a = 1 / 10 = 0
//if(1=1) its palindrom

//while(2>0)
//i=2 % 10 = 2
//j= 0 * 10 + 2 = 2
//a = 2/10 = 0
//if(2==2) its palindrome
//its goes on upto 9 after 11


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

//while(0>0) false
//if (11 = 11) , its palindrome
