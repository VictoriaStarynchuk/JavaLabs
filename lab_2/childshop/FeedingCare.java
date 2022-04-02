package labs_uni.lab_2.childshop;

public class FeedingCare extends ChildShop {
	
	//for category food (cereal)
	private String addsToFood;
	
	//for baby's pacifier, bottles
	private String shape;
	
	public FeedingCare(String category, int ageCategory, double size, String brand, double price, String addsToFood ,String shape) {
		super(category, ageCategory, size, brand, price);
		this.addsToFood = addsToFood;
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		return "Category: " + category + ", for age in month: " + ageCategory + 
				", size : " + size + ", brand: " + brand + ", price: " + price + 
				", adds to food: "+ addsToFood + ", shape: " + shape;
	}
	
	@Override
	public void welcome() {
		System.out.println("You're in Feeding Care Section!");
		
	}
	
	@Override
	public void getNumberOfPosition() {
		System.out.println("Feeding Care Section: " + getMaxProduct() + " product positions");
		
	}

	public void setAddsToFood(String addsToFood) {
		this.addsToFood = addsToFood;
	}
	public String getAddsToFood() {
		return addsToFood;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getShape() {
		return shape;
	}
	
	
}
