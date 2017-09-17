package interfaces;

public class MixedCapsString extends SpecialString {
	public MixedCapsString(String s) {
		super(s);
	}

	public String funkifyText(String text) {
		String newText = "";
		String letter = "";
		for (int i = 0; i < text.length(); i++) {
			if (i % 2 == 0) {
				letter = text.substring(i, i + 1).toLowerCase();
				newText += letter;
			} else if (i % 2 == 1){
				letter = text.substring(i, i + 1).toUpperCase();
				newText += letter;
			}
		}

		return newText;
	}
}
