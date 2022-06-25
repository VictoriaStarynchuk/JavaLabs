package ua.lviv.iot.my_project;

import ua.lviv.iot.my_project.bank.RemoveBankNumber;

public class Main {

	public static void main(String[] args) {
		RemoveBankNumber removeBankNumber = new RemoveBankNumber();
		String text = "1111 1111 1111 1111" + "," + "1111567878965247" + "," + "1111174128961234" + ","
				+ "2222562459877896" + "," + "2222789652134512" + "," + "7575123412341234";
		System.out.println(text);
		String str = removeBankNumber.removeNumber(text, "1111");
		System.out.println(str);

	}

}
