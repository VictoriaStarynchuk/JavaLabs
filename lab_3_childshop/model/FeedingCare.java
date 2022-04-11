package labs_uni.lab_3_childshop.model;

public class FeedingCare extends ChildShopGoods {

	// for category food (cereal)
	private String addsToFood;
	private String expeirenceDate;

	public FeedingCare(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, String addsToFood, String expeirenceDate) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.addsToFood = addsToFood;
		this.expeirenceDate = expeirenceDate;
	}

	public void setAddsToFood(String addsToFood) {
		this.addsToFood = addsToFood;
	}

	public String getAddsToFood() {
		return addsToFood;
	}

	public void setExperienceDate(String expeirenceDate) {
		this.expeirenceDate = expeirenceDate;
	}

	public String getExpeirenceDate() {
		return expeirenceDate;
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", food adding: " + this.addsToFood + ", expiry date: " + this.expeirenceDate
				+ ".\n";

	}
}
