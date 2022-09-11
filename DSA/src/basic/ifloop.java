package basic;

import java.util.Scanner;

public class ifloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		String city  = s.next();
		if(city=="Meerut") {
			System.out.println("City is Meerut");
			
		}else if(city=="Noida") {
			System.out.println("City is Noida");
			
		}else {
			System.out.println(city);
		}

	}

}
