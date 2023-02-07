package com.example.mvvmexample.ui.settings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.mvvmexample.R
import com.example.mvvmexample.databinding.FragmentSettingsBinding


class SettingsFragment :Fragment(R.layout.fragment_settings) {

    private var _binding: FragmentSettingsBinding? =null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}