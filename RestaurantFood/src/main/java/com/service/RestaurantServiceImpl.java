package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Food;
import com.entity.Restaurant;
import com.exception.ResourceNotFoundException;
import com.repository.FoodRepository;
import com.repository.RestaurantRepository;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepo;

    @Autowired
    private FoodRepository foodRepo;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant getRestaurantById(Long id) {
        return restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
    }

    @Override
    public void deleteRestaurant(Long id) {
        Restaurant res = getRestaurantById(id);
        restaurantRepo.delete(res);
    }

    @Override
    public Food addFoodToRestaurant(Long restaurantId, Food food) {
        Restaurant restaurant = getRestaurantById(restaurantId);
        food.setRestaurant(restaurant);
        return foodRepo.save(food);
    }

    @Override
    public void deleteFood(Long foodId) {
        Food food = foodRepo.findById(foodId)
                .orElseThrow(() -> new ResourceNotFoundException("Food not found with id: " + foodId));
        foodRepo.delete(food);
    }
}
