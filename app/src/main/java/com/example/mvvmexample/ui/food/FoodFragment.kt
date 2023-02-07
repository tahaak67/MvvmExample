package com.example.mvvmexample.ui.food

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.FragmentFoodBinding

class FoodFragment : Fragment(R.layout.fragment_food) {

    private var _binding: FragmentFoodBinding? =null
    private val binding get() = _binding!!

    private val viewModel by viewModels<FoodViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFoodBinding.bind(view)

        val adapter = FoodAdapter()

        binding.apply {
            recyclerView.adapter = adapter
            abAdd.setOnClickListener {
                viewModel.addFood()
            }
            abRemove.setOnClickListener {
                viewModel.removeFood()
            }
        }

        viewModel.foodList.observe(viewLifecycleOwner) { list ->
            Log.d("FoodFragment","List changed!")
            adapter.submitList(list)
            adapter.notifyDataSetChanged()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}