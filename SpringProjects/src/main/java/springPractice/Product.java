package springPractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("productobject")
public class Product {
	@Value("1")
	String prodid;
	@Value("Perfume")
	String prodname;
	
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	@Override
	public String toString() {
		return "Product id" + getProdid() + "Product name" + getProdname();
	}
	public static void main(String arg[])
	{
		
	}
	

}
