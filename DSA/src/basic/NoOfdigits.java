package basic;

public class NoOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=12345;
		int count=0;
		while(i>0) {
			i = i/10;
			count++;
		}
		
		System.out.println(count);
	}

}
