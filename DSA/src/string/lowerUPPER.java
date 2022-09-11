package string;

public class lowerUPPER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HELLO boostfear";
		int mid  = str.length()/2;
		
//		String lower = "";
//		String upper = "";
		
//		for(int i=0;i<str.length();i++) {
//			if(i<mid) {
//				lower = lower +  Character.toLowerCase(str.charAt(i));
//			}else {
//				upper = upper + Character.toUpperCase(str.charAt(i));
//			}
//		}
//		
		String s1 = str.substring(0,mid);
		String s2 = str.substring(mid);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(lower+upper);
		System.out.println(s1.toLowerCase()+s2.toUpperCase());
		

	}

}
