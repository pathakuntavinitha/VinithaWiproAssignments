package com.spr;

import java.util.Date;

public class Purchase {
	 private int purchaseId;
	    private Date purchaseDate;
	    private Product product;

	    public Purchase(int purchaseId, Date purchaseDate, Product product) {
	        this.purchaseId = purchaseId;
	        this.purchaseDate = purchaseDate;
	        this.product = product;
	    }

	    public void displayPurchase() {
	        System.out.println("Purchase ID: " + purchaseId);
	        System.out.println("Purchase Date: " + purchaseDate);
	        product.displayProduct();
	    }

		public int getPurchaseId() {
			return purchaseId;
		}

		public void setPurchaseId(int purchaseId) {
			this.purchaseId = purchaseId;
		}

		public Date getPurchaseDate() {
			return purchaseDate;
		}

		public void setPurchaseDate(Date purchaseDate) {
			this.purchaseDate = purchaseDate;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public Purchase() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
