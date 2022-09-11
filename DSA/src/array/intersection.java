
package array;

import java.util.HashSet;
import java.util.Set;

public class intersection {
	static Set<Integer> s1 = new HashSet<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,4,5,6,7,2,9};
		int[] arr2 = {10,24,36,42,5,6,7,2,9};
		
//		intersection(arr1,arr2);
		printintersection(arr1,arr2);
		printUnion(arr1,arr2);
		
	}
	static void printUnion(int[] arr1, int[] arr2) {
		
		for(int i=0;i< arr1.length;i++) {
			s1.add(arr1[i]);
		}
		for(int i=0;i< arr2.length;i++) {
			s1.add(arr2[i]);
		}
		System.out.println("Array Union " + s1);
	}
	static void printintersection(int[] arr1,int[]arr2){
		
		
		
		for(int i=0;i<arr1.length;i++) {
			s1.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(s1.contains(arr2[i])){
				System.out.println("intersected ele "+ arr2[i]);
			}
			
		}
		
		
	}

}
