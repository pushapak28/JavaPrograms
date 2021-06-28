package numberprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number " );
		int n  = sc.nextInt();
		sc.close();
		
		int reverse = 0;
		int remainder;
		//Method 1
		/*
		while(n!=0) {
			remainder = n%10;
			reverse = reverse*10+remainder;
			n = n/10;
		}
		System.out.println(reverse);
		*/
		
		//Method 2 
		/*
		for(;n!=0;n=n/10) {
			remainder = n%10;
			reverse = reverse*10+remainder;
		}
		System.out.println(reverse);
		*/
		
		
		
		

	}

}
