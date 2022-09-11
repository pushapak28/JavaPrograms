package basicprograms;

import java.util.Scanner;

public class PrimeExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check Prime Number ");
		int n =sc.nextInt();
		
		if(isPrime(n)) {
			System.out.println(n + " is a Prime Number");
		}else {
			System.out.println(n+" is not a Prime Number");
		}
		sc.close();

	}

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		else {
			for (int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}
			
		}
		return true;
	}

}
