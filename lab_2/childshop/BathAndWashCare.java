package labs_uni.lab_2.childshop;

public class BathAndWashCare extends ChildShop {
	
	private String typeProduct;
	
	 public BathAndWashCare(String category, int ageCategory, double size, String brand, double price, String typeProduct) {
			super(category, ageCategory, size, brand, price);
			this.typeProduct = typeProduct;
		}
	 
	 @Override
		public String toString() {
			return "Category: " + category + ", for age in month: " + ageCategory + ", size : " + size + ", brand: " + brand + ", price: " + price + ", type of product: " + typeProduct;
		}

	@Override
	public void welcome() {
		System.out.println("You're in Bath and Wash Section!");
	}

	@Override
	public void getNumberOfPosition() {
		System.out.println("BathAndWashCare Section: " + getMaxProduct() + " product positions");
		
	}
	
	public void setTypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}
	
	public String getTypeProduct() {
		return typeProduct;
	}
}
