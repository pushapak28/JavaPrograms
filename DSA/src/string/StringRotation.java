package string;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ABCD";
		String str2 = "CDAB";	
		
		if(isRotated(str1, str2)) {
			System.out.println("String Roated");
		}else {
			System.out.println("String Not Rotated");
		}
	}
	
	public static boolean isRotated(String str1  ,String str2) {
		
		return (str1.length()==str2.length()) && ((str1+str1).indexOf(str2) !=-1);
		
	}

}
