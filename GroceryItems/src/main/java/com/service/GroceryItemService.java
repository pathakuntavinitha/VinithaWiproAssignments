package com.service;

import java.util.List;

import com.entity.GroceryItem;

public interface GroceryItemService {
    GroceryItem save(GroceryItem item);
    List<GroceryItem> getAll();
    GroceryItem getById(Long id);
    GroceryItem update(Long id, GroceryItem item);
    void delete(Long id);
}