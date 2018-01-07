package july.julyProj.min.model;

public class ProductMo {
	private int prodIdx;
	private String category;
	private String product;
	private String price;
	private String size;
	private int useable;
	
	public ProductMo(String Category, String Product, String Price, String Size, int Useable) {
		category = Category;
		product = Product;
		price = Price;
		size = Size;
		useable = Useable;
	}
	
	public ProductMo() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int getProIdx() {
		return prodIdx;
	}
	public void setProIdx(int prodIdx) {
		this.prodIdx = prodIdx;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getUseable() {
		return useable;
	}
	public void setUseable(int useable) {
		this.useable = useable;
	}
	@Override
	public String toString() {
		return "ProductMo [prodIdx=" + prodIdx + ", category=" + category + ", product=" + product + ", price=" + price
				+ ", size=" + size + ", useable=" + useable + "]";
	}
	
}
