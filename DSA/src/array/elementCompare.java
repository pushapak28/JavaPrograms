package array;

import java.util.Arrays;

public class elementCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,5,6,7,3};
		int[] b = {3,6,5,7,2,4};
		
		if(arrEqual(a, b)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}
	
	public static boolean arrEqual(int[] a, int []b) {
		if(a.length!=b.length) {

			return false;	
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i =0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false; 
			}
		}
		return true;
		
	}

}
