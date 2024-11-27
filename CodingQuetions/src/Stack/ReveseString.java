package Stack;

import java.util.Stack;

public class ReveseString {
	static void reverseStr(StringBuilder str) {
		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			s.push(str.charAt(i));
		}

		str.delete(0, str.length());

		while (!s.isEmpty()) {
			str.append(s.pop());
		}
	}

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("GeeksQuiz mine");
		reverseStr(str);
		System.out.println("Reversed string is: " + str);
	}
}
