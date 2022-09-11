package string;

public class SpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BOOSTFear@!#$";
		
		String removedSpecChar ="";
		String specialCharFound="";
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count ++;
				specialCharFound = specialCharFound + str.charAt(i);
			}else {
				removedSpecChar = removedSpecChar + str.charAt(i);
				
			}
		}
		
		if(count ==0 ) {
			System.out.println("There are no Special character");
		}else {
			System.out.println("Special character found "+ count +" --> "+specialCharFound);
		}
//		System.out.println("Special Character found " + specialCharFound);
		System.out.println("String Without Special character --> " + removedSpecChar);
	}

}
