package org.Programs37;

public class OddEvenCount {

	public static void main(String[] args) {
		int evencount = 0, oddCount=0;
		for (int i = 1; i <= 100; i++) {
		if (i % 2 == 0) {
		evencount++;
		}
		else {
		oddCount++;
		}
		}
		System.out.println("Even count is "+evencount);
		System.out.println("Odd count is "+oddCount); 
		}
		}

//backend logic
//i=1 , 1<=100
//if(1 % 2 == 1)
//odd count = 1 ,i=1 + 1
//i=2 , 2<=100
//if(2 % 2 == 0)
//even count = 1 , i=2 +1 

//i=3, 3<=100
//if(3 % 2 == 3 )
//odd count = 2 , i=3+1

//i=4 , 4<=100
//if(4% 2 ==0)
//even count = 2
