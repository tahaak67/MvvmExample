package com.example.mvvmexample.ui.food

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmexample.model.FoodRepository
import com.example.mvvmexample.model.FoodRepositoryImpl

/**
 * Created by Taha Ben Ashur (https://github.com/tahaak67) on 07,Feb,2023
 */
class FoodViewModel: ViewModel() {

    private var _foodList: MutableLiveData<List<FoodItem>> = MutableLiveData(emptyList())
    val foodList: LiveData<List<FoodItem>> get() = _foodList
    private val repository: FoodRepository = FoodRepositoryImpl()

    init {
        getListOfFood()
    }

    fun getListOfFood(){
        _foodList.value = repository.getFoodList()
    }

    fun removeFood(){
        repository.removeItem()
        getListOfFood()
    }

    fun addFood(){
        repository.addItem()
        getListOfFood()
    }
}