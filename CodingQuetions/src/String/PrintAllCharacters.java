package String;

public class PrintAllCharacters {
	public static void main(String args[]) {
		String str = "Sakshi Pharande";
		String reverse = "";
		
		for(int i=0;i<str.length();i++) {
			reverse = str.charAt(i) + reverse;	
		}
		System.out.println(reverse);
		
	}
}
