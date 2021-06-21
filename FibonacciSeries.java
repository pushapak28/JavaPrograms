package basicprograms;

import java.util.Scanner;

public class FibonaciSeries {

	static int a=0 , b=1 , c;
		static void Fibonacci(int n) {
			if(n>0) {
				c = a+b;
				a=b;
				b=c;
				System.out.print(" "+ c);
				Fibonacci(n-1);
			}
		}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
  // Method 1
  /*
		int a = 0;
		int b =1;
		int c;
		int n = sc.nextInt();
		
		System.out.print(a +" "+b);
		
		for(int i = 2;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
		*/
    //Method 2
		int n =sc.nextInt();
		System.out.print(a+" "+b);
		Fibonacci(n);
		
		
		sc.close();
	
	}

}
