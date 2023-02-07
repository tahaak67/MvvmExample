package com.example.mvvmexample.model

import com.example.mvvmexample.ui.food.FoodItem

/**
 * Created by Taha Ben Ashur (https://github.com/tahaak67) on 07,Feb,2023
 */
interface FoodRepository {

    fun getFoodList(): List<FoodItem>
    fun removeItem()
    fun addItem()

}