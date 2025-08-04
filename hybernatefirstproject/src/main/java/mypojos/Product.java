package mypojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column
private String productname;
@Column
private float price;
public Product() { }
public Product(String productname, float price) {
	super();
	this.productname = productname;
	this.price = price;
}

public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public float getPrice() {
	return price;
}
public void setPrice(float  d) {
	this.price = d;
}
@Override
public String toString() {
	return "Product [id=" + id + ", productname=" + productname + ", price=" + price + "]";
}

}
