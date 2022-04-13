package ua.lviv.iot.my_project.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public abstract class ChildShopGoods {

	protected String category;
	protected String nameOfProduct;
	protected AgeCategory ageCategory;
	protected String brand;
	protected int price;
	protected Gender whatGender;

	protected ChildShopGoods(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender) {
		this.category = category;
		this.nameOfProduct = nameOfProduct;
		this.ageCategory = ageCategory;
		this.brand = brand;
		this.price = price;
		this.whatGender = whatGender;
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ".";

	}
	

}
