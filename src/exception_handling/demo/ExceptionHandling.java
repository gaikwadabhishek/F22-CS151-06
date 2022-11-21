package exception_handling.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionHandling {
	public static void main(String[] args) {
		String s = "Abhishek1!";
		boolean passwordOk = true;
		try {
			if (passwordExpectations(s)) {
				System.out.println("passed");
			} else {
				System.out.println("failed");
			}
		} catch (NullPointerException|MissingSpecialCharacter e) {
			System.out.println("handled");
			passwordOk = false;
		}
		
		System.out.println(passwordOk);
	}

	private static boolean passwordExpectations(String s) throws MissingSpecialCharacter {
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		boolean b = m.find();

		if (!b)
			throw new MissingSpecialCharacter();
		return b;
	}
}
