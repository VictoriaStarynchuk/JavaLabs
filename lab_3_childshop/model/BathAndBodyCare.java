package labs_uni.lab_3_childshop.model;

public class BathAndBodyCare extends ChildShopGoods {

	private PackSize packSize;

	public BathAndBodyCare(String category, String nameOfProduct, AgeCategory ageCategory, String brand, int price,
			Gender whatGender, PackSize packSize) {
		super(category, nameOfProduct, ageCategory, brand, price, whatGender);
		this.packSize = packSize;
	}

	public void setPackSize(PackSize packSize) {
		this.packSize = packSize;
	}

	public PackSize getPackSize() {
		return packSize;
	}

	@Override
	public String toString() {
		return "Category: " + this.category + ", product: " + this.nameOfProduct + ", for age in month: "
				+ this.ageCategory + ", brand: " + this.brand + ", price: " + this.price + " UAH" + ", gender: "
				+ this.whatGender + ", size of pack: " + this.packSize + ".\n";

	}
}
