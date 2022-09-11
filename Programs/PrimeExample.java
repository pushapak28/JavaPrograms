package basicprograms;

import java.util.Scanner;

public class PrimeExample {
	
	static void primeNumber(int n) {
		boolean flag = false;
		int m =0;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n+" is not a Prime Number");
		}else {
				for(int i=2;i<=m;i++) {
					if(n%i==0) {
						System.out.println(n+" is not a Prime Number ");
						flag = true;
						break;
					}
				}
			
		
			if(flag==false) {
				System.out.println(n+" is a prime Number!");
			}
		
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Prime or not ");
		int n =sc.nextInt();
		primeNumber(n);
		sc.close();
		
		/*
		boolean flag = false;
		System.out.println("Enter number to check Prime or not ");
		
		int n =sc.nextInt();
		int m =0;
		m=n/2;
		
		if(n==0 || n==1) {
			System.out.println(n+" is not a Prime Number");
		}else {
				for(int i=2;i<=m;i++) {
					if(n%i==0) {
						System.out.println(n+" is not a Prime Number ");
						flag = true;
						break;
					}
				}
			
		
		if(flag==false) {
			System.out.println(n+" is a prime Number!");
		}
		}
		*/
		
	}

}
