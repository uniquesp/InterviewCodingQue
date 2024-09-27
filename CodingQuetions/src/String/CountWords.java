package String;

public class CountWords {
	public static int countWords(String str) {	
		//Your code goes here
        int count = 0;
        if(str==null || str.isEmpty()){
            return 0;
        }
        
        String[] words = str.split("\\s+");
        return words.length;
	}
	
	public static void main(String[] args) {
		String str = "My name is sakshi";
		System.out.println(countWords(str));
	}
}
