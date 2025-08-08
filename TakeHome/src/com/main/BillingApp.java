package com.main;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bean.Product;
import com.dao.ProductDaoImpl;
import com.service.ProductService;

public class BillingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Setup DataSource and JdbcTemplate
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // Or relevant driver
        ds.setUrl("jdbc:mysql://localhost:3306/product");
        ds.setUsername("root");
        ds.setPassword("Vinitha@123");

        ProductDaoImpl dao = new ProductDaoImpl(new JdbcTemplate(ds));
        ProductService service = new ProductService(dao);

        while (true) {
            System.out.println("1. Generate Bill by entering code and quantity");
            System.out.println("2. Exit");
            int choice = sc.nextInt();

            if (choice == 2) break;
            else if (choice != 1) {
                System.out.println("Enter option 1 to 2 only");
                continue;
            }

            int code;
            while (true) {
                System.out.println("Enter product_code");
                code = sc.nextInt();
                if (!service.validateProductCode(code)) {
                    System.out.println("Invalid product_code, it should be >0 and 4 digit +ve number");
                } else break;
            }

            int qty;
            while (true) {
                System.out.println("Enter quantity");
                qty = sc.nextInt();
                if (!service.validateQuantity(qty)) {
                    System.out.println("Invalid quantity, it should be >0");
                } else break;
            }

            try {
                Product p = service.getProductDetails(code);
                System.out.println("Product Name: " + p.getProduct_name());
                System.out.println("Product Category: " + p.getProduct_category());
                System.out.println("Product Description: " + p.getProduct_description());
                System.out.println("Product Price(Rs): " + p.getProduct_price());
                System.out.println("Quantity: " + qty);
                System.out.println("Total Bill Amount: Rs." + service.calculatePrice(qty, p.getProduct_price()));
            } catch (Exception e) {
                System.out.println("Product not found with code: " + code);
            }
        }

	}

}
