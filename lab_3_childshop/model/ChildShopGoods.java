package labs_uni.lab_3_childshop.model;

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

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public AgeCategory getAgeCategory() {
		return ageCategory;
	}

	public void setAgeCategory(AgeCategory ageCategory) {
		this.ageCategory = ageCategory;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public Gender getwhatGender() {
		return whatGender;
	}

	public void setwhatGender(Gender whatGender) {
		this.whatGender = whatGender;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ".";

	}

}
