package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.GroceryItem;
import com.repository.GroceryItemRepository;

import java.util.List;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

    private final GroceryItemRepository repository;

    @Autowired
    public GroceryItemServiceImpl(GroceryItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public GroceryItem save(GroceryItem item) {
        return repository.save(item);
    }

    @Override
    public List<GroceryItem> getAll() {
        return repository.findAll();
    }

    @Override
    public GroceryItem getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public GroceryItem update(Long id, GroceryItem item) {
        item.setId(id);
        return repository.save(item);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}