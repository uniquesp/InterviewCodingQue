package TestQuetions;

import java.io.*;
import java.util.*;

public class ValidParenthesesQue {
	
	public static boolean validParentheses(String s) {
		boolean result = false;
		int n = s.length();
		Stack<Character> stk = new Stack<>();
		
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[') {
				stk.push(s.charAt(i));
			}else if(s.charAt(i)==')') {
				if(!stk.isEmpty() && stk.peek()=='(') {
					stk.pop();
				}else {
					return false;
				}
			}else if(s.charAt(i)=='}') {
				if(!stk.isEmpty() && stk.peek()=='{') {
					stk.pop();
				}else {
					return false;
				}
			}else if(s.charAt(i)==']') {
				if(!stk.isEmpty() && stk.peek()=='[') {
					stk.pop();
				}else {
					return false;
				}
			}
		}
//		if(!stk.isEmpty()) {
//			result = true;
//		}
		
		return stk.isEmpty();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		System.out.println(validParentheses(str));
	}
}
