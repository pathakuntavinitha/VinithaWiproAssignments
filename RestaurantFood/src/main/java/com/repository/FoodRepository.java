package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
