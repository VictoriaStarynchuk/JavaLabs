package labs_uni.lab_2.childshop;

public class  BodyCare extends ChildShop  {

	//defines if it for face,teeth, hair
	private String typeOfProduct;
	
	public BodyCare() {};
	
	public BodyCare(String category, int ageCategory, double size, String brand, double price, String typeOfProduct) {
		super(category, ageCategory, size, brand, price);
		this.typeOfProduct = typeOfProduct;
	}
	
	@Override
	public String toString() {
		return "Category: " + category + ", for age in month: " + ageCategory + ", size : "+ 
					size + ", brand: " + brand + ", price: " + price +
						",type of product: " + typeOfProduct;
	}
	
	@Override
	public void welcome() {
		System.out.println("You're in Body Care Section!");
	}

	@Override
	public void getNumberOfPosition() {
		System.out.println("Body Care Section: " + getMaxProduct() + " product positions");
		
	}

	public void setTypeofproduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}
	
	public String getTypeofproduct() {
		return typeOfProduct;
	}
}
