package basic;

import java.util.Arrays;

public class changeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		
		change(arr);
		System.out.println(Arrays.toString(arr));
		

	}

	private static void change(int[] nums) {
		// TODO Auto-generated method stub
		nums[0]=99;
	}

}
