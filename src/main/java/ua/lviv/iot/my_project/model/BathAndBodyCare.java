package ua.lviv.iot.my_project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BathAndBodyCare extends ChildShopGoods {

	private PackSize packSize;

	public BathAndBodyCare(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, PackSize packSize) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.packSize = packSize;
	}
	
	
	@Override
	public String getHeaders() {
		return super.getHeaders() + ", packSize";
	}
	
	@Override
	public String toCSV() {
		return super.toCSV() + "," + packSize;
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", size of pack: " + this.packSize + ".\n";

	}
}
