package com.example.cardapio.dtos;

import com.example.cardapio.entities.Food;

public record FoodResponseDTO(Long id, String title, String image, Float price) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
