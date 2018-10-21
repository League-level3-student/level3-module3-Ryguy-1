package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String test = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
				char x =Character.toLowerCase(s.charAt(i));
				test+=x;
			}else if(i%2==1) {
				char y =Character.toUpperCase(s.charAt(i));
				test+=y;
			}
		}
		return test;
	}

}
