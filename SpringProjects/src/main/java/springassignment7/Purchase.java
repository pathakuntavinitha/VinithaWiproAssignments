package springassignment7;

public class Purchase {
	int purchaseId;
	String purchaseDate;
	Product product;
	public Purchase(int purchaseId, String purchaseDate, Product product) {
		super();
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.product = product;
	}
	 public void displayDetails() {
	        System.out.println("Purchase ID " +purchaseId);
	        System.out.println("Purchase Date " +purchaseDate);
	        System.out.println("Product ID " +product.getProductId());
	        System.out.println("Product Name " +product.getProductName());
	        System.out.println("Price " +product.getPrice());
	    }
	
}
