package string;

public class OccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Pushapak";
//		System.out.println(str.replaceAll("a", ""));
		
		char ch = 'a';
		
		removeChar(str, ch);
	}
		static void removeChar(String str , char c) {
				
			String finalstr = "";
			
			for (int i=0;i<str.length();i++) {
				if(str.charAt(i)!=c) {
					finalstr = finalstr+str.charAt(i);
				}
			}
			
			System.out.println(finalstr);
		}

}
