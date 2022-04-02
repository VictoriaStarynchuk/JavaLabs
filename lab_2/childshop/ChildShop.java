package labs_uni.lab_2.childshop;

public abstract class ChildShop {
	
	private int maxProduct;

	protected String category;
	protected int ageCategory;
	protected double size;
	protected String brand;
	protected double price;
	
	public ChildShop(){
		this.category = "unknown";
		this.ageCategory = 0;
		this.size = 0;
		this.brand = "unknown";
		this.price = 0;
	}
	
	public ChildShop(String category, Integer ageCategory, Double size, String brand, Double price ){
		this.category = category;
		this.ageCategory = ageCategory ;
		this.size = size;
		this.brand = brand;
		this.price = price;
	}
	 
	public abstract void getNumberOfPosition();
	
	public abstract void welcome(); 
	
	public void greeting() {
		System.out.println("Welcome to our shop!");}
	
	
	public int getMaxProduct() {
		return maxProduct;
	}
	
	public void setMaxProduct(int maxProduct) {
		this.maxProduct = maxProduct;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setAgeCategory(int ageCategory) {
		this.ageCategory = ageCategory;
	}
	
	public int getAgeCategory() {
		return ageCategory;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public double getSize() {
		return size;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}
