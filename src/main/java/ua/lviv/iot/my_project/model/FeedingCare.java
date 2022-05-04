package ua.lviv.iot.my_project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FeedingCare extends ChildShopGoods {

	
	private String addsToFood;
	private String expeirenceDate;

	public FeedingCare(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, String addsToFood, String expeirenceDate) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.addsToFood = addsToFood; 
		this.expeirenceDate = expeirenceDate;
	}
	
	@Override
	public String getHeaders() {
		return super.getHeaders() + ", addsToFood , expeienceDate";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + "," + addsToFood + "," + expeirenceDate;
	}
	
	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", food adding: " + this.addsToFood + ", expiry date: " + this.expeirenceDate
				+ ".\n";

	}
}
