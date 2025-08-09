package com.service;

import java.util.List;

import com.entity.Food;
import com.entity.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurantById(Long id);
    void deleteRestaurant(Long id);
    Food addFoodToRestaurant(Long restaurantId, Food food);
    void deleteFood(Long foodId);
}
