package ua.lviv.iot.my_project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FeedingCare extends ChildShopGoods {

	// for category food (cereal)
	private String addsToFood;
	private String expeirenceDate;

	public FeedingCare(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, String addsToFood, String expeirenceDate) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.setAddsToFood(addsToFood); 
		this.setExpeirenceDate(expeirenceDate);
	}
	
	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", food adding: " + this.addsToFood + ", expiry date: " + this.expeirenceDate
				+ ".\n";

	}
}
