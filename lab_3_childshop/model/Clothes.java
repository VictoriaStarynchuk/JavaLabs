package labs_uni.lab_3_childshop.model;

public class Clothes extends ChildShopGoods {

	private ClothesType clothesType;
	private String clothesColour;

	public Clothes(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, ClothesType clothesType, String clothesColour) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.clothesType = clothesType;
		this.clothesColour = clothesColour;
	}

	public ClothesType getClothesType() {
		return clothesType;
	}

	public void setClothesType(ClothesType clothesType) {
		this.clothesType = clothesType;
	}

	public String getClothesColour() {
		return clothesColour;
	}

	public void setClothesColour(String clothesColour) {
		this.clothesColour = clothesColour;
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", type of iteam: " + this.clothesType + ", colour: " + this.clothesColour + ".\n";
	}
}
