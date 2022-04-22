package ua.lviv.iot.my_project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Clothes extends ChildShopGoods {

	private ClothesType clothesType;
	private String clothesColour;

	public Clothes(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, ClothesType clothesType, String clothesColour) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.setClothesType(clothesType);
		this.setClothesColour(clothesColour);
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", type of iteam: " + this.clothesType + ", colour: " + this.clothesColour + ".\n";
	}
}
