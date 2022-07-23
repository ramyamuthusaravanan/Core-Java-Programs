package org.Programs37;

public class Amstrong1 {

	public static void main(String[] args) {
		for (int n = 1; n <= 1000; n++) {
			int a, i = 0, j = 0;
			a = n;
			while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
			}
			 if (n == j) {
			System.out.println(n);
			}
			}
	}
}

// n =1 , 1 <=1000
//a = 1
//while(1>0)
//i = 1 % 10 = 1
//j = 0 + (1 * 1 *1) = 1 

//a = 1 /10 = 0 , 
//if (1==1) Armstrong
//while(0>0) false

//n=2 , 2<=1000
//a=2
//while(2>0)
//i= 2 % 10 = 2
//j= 0 + (2*2*2) = 8
//a= 2/10 = 0,
//if (2=8) false

//n=3 , 3<=1000
//a=3
//while(3>0)
//i=3%10 = 3
//j=0+(3*3*3) = 27
//a=3/10 = 0
//if (3==27) false

//n=153 , 153 <=1000
//a=153
//while<153>0)
//i=153 % 10 = 3
//j=0 + (3 * 3* 3) = 27
//a=153 / 10 = 15
//while(15>0)
//i=15 %10 = 5
//j=0+(5*5*5) = 125
//a=15/10 =1
//while(1>0)
//i=1%10 = 1
//j=0+(1*1*1)= 1
//if 153==153 ,its amstrong number....


//