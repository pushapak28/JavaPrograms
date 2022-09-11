package basicprograms;

import java.util.Scanner;

public class PrimeNumberBetwen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to find prime number between ");
		System.out.println("Enter First  Number ");
		int start = sc.nextInt();
		
		System.out.println("Enter Second Number ");
		int end = sc.nextInt();
		sc.close();
		System.out.println("List of Prime Number's Between  "+start +" and "+end);
		int count =0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)){
				System.out.println(i);
				count ++;
			}
		}
		System.out.println("Number of Prime Number "+count);
	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
		
		return true;
	}

}
