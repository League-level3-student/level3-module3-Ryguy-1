package _00_Text_Funkifier;

public class NewString extends SpecialString{
	public NewString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String test = "";
		for (int i = 0; i < s.length(); i++) {
			char x = Character.toUpperCase(s.charAt(i));
			test+=x;
		}
		return test;
	}

}
