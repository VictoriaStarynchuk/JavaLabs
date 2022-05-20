package ua.lviv.iot.my_project.bank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveBankNumber {

	public String removeNumber(String text, String delete_number) {

		String regex1 = delete_number + " \\d{4} \\d{4} \\d{4}";
		String regex2 = delete_number + "\\d{12}";
		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);
		Matcher matcher1 = p1.matcher(text);
		Matcher matcher2 = p2.matcher(text);

		while (matcher1.find()) {
			text = text.replaceAll(regex1, "deleted");
		}
		while (matcher2.find()) {
			text = text.replaceAll(regex2, "deleted");
		}

		return text;
	}
}


