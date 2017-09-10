package interfaces;

import java.util.Stack;

public class BackwardsString extends SpecialString {
	public BackwardsString(String s) {
		super(s);
	}
	
	Stack<Character> backwards = new Stack<>();
	String newText = "";
	public String funkifyText(String text) {
		for (int i = 0; i < text.length(); i++) {
			backwards.push(text.charAt(i));
		}
		for (int i = 0; i < text.length(); i++) {
			newText += backwards.pop();
		}
		return newText;
	}
}
