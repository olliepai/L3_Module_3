package interfaces;

import java.util.Stack;

public class BackwardsString extends SpecialString {
	public BackwardsString(String s) {
		super(s);
	}
	
	Stack<Character> backwards = new Stack<Character>();
	
	public String funkifyText(String text) {
		String newText = "";
		for (int i = text.length() - 1; i > -1; i--) {
			newText += text.charAt(i);
		}
		
		return newText;
	}
}
