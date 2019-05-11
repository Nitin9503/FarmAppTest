package StringConcept;

import AcceessModifierPractice.MidifierCocept;
import static AcceessModifierPractice.MidifierCocept.*;

public class StringConcept extends MidifierCocept {

	static {
		System.out.println("Hello sachin");

	}

	public static void main(String[] args) {

		MidifierCocept mc = new MidifierCocept();

		district();
		collageName();
		mc.setValue();
		String firstName = "Sachin";
		String middleName = "Pralhad";
		String lastName = "Patil";

		String str = lastName.concat(firstName);

		System.out.println("lastName.concat(firstName);" + getValue());

		System.out.println(firstName + " " + lastName);

		firstName.length();

		System.out.println("firstName.length();" + firstName.length());

		System.out.println("firstName.charAt(3);" + firstName.charAt(3));

		lastName = firstName;
		System.out.println("lastName.equals(firstName);" + lastName.equals(firstName));

		System.out.println("lastName.equalsIgnoreCase(firstName)" + lastName.equalsIgnoreCase(firstName));

		System.out.println("firstName.indexOf(4)" + firstName.indexOf('a'));

		System.out.println("firstName.substring(0)" + firstName.substring(3));

		System.out.println("firstName.substring(0)" + firstName.substring(3));

		System.out.println("firstName.substring(0)" + firstName.substring(2, 4));

		String friendName = "      Arjun    ";

		System.out.println("friendName.substring(0)" + friendName.trim());

		String tools = "Selenium-QTP-Appium";

		System.out.println("friendName.charAt(3)" + friendName.charAt(3));

		String toolsName[] = tools.split("-");
		System.out.println("toolsName" + toolsName);

		for (String str1 : toolsName) {
			System.out.println("str1" + str1);

		}

		String s1 = "Rahit";
		String s2 = "Kapam";

		System.out.println("s1" + s1);
		System.out.println("s2" + s2);
		s2 = "patil";
		System.out.println("s2" + s2);
		System.out.println("s1" + s1);

		String rain = "The rain has started here sachin";

		System.out.println("rain length" + rain.length());

		System.out.println("rain length=>" + rain.indexOf("s"));

		System.out.println("rain length=>" + rain.indexOf("s", rain.indexOf("s") + 1));
		System.out.println("rain length=>" + rain.indexOf("s", rain.indexOf("s") + 1 + 2));

	}

}
