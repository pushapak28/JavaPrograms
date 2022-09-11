package array;

public class MissingNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,3,4,5,6,8,9,10};
		
		int sum = (10*11)/2;
		int actualSum = 0;
		
		for (int i=0;i<arr.length;i++) {
			actualSum = actualSum+arr[i];
		}
		
		System.out.println("missing Number is "+ (sum - actualSum));

	}

}
