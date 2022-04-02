package labs_uni.lab_2.childshop.main;

import labs_uni.lab_2.childshop.*;

public class Main {

	public static void main(String[] args) {
		
		BodyCare section1 = new BodyCare("cream", 5, 0, "Dove", 50.4, "for body");
		section1.welcome();
		section1.greeting();
		section1.setMaxProduct(20);
		section1.getNumberOfPosition();
		System.out.println(section1);
		System.out.println();

		BathAndWashCare section2 = new BathAndWashCare("pampers", 12, 2, "Bunny", 300, "for boys and girls");
		section2.welcome();
		section2.greeting();
		section2.setMaxProduct(10);
		section2.getNumberOfPosition();
		System.out.println(section2);
		System.out.println();
		
		FeedingCare section3 = new FeedingCare("cereal", 6, 0, "Gerber", 90.9, "pumpkin, dry milk", "cartoon pack");
		section3.welcome();
		section3.greeting();
		section3.setMaxProduct(8);
		section3.getNumberOfPosition();
		System.out.println(section3);
		System.out.println();
}
}
