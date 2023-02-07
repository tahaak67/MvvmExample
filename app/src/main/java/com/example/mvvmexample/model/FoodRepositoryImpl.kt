package com.example.mvvmexample.model

import com.example.mvvmexample.ui.food.FoodItem

/**
 * Created by Taha Ben Ashur (https://github.com/tahaak67) on 07,Feb,2023
 */
class FoodRepositoryImpl:FoodRepository {

    private val foods = mutableListOf(
    FoodItem("Pizza","https://picsum.photos/200/300"),
    FoodItem("Burger","https://picsum.photos/200/300"),
    FoodItem("Croissant","https://picsum.photos/200/300")
    )

    override fun getFoodList(): List<FoodItem> {
        return foods
    }

    override fun removeItem() {
        foods.removeLast()
    }

    override fun addItem() {
        foods.add(
            FoodItem("Pizza","https://picsum.photos/200/300")
        )
    }
}