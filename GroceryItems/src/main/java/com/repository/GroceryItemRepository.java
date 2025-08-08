package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}


