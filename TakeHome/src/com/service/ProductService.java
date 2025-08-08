package com.service;

import com.bean.Product;
import com.dao.ProductDAO;

public class ProductService {
	private ProductDAO productDao;

    public ProductService(ProductDAO dao) {
        this.productDao = dao;
    }

    public Product getProductDetails(int code) {
        return productDao.getProductDetails(code);
    }

    public double calculatePrice(int quantity, double price) {
        return quantity * price;
    }

    public boolean validateProductCode(int code) {
        return code > 0 && String.valueOf(code).length() == 4;
    }

    public boolean validateQuantity(int quantity) {
        return quantity > 0;
    }
}
