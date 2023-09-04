package com.mynews.mynews.business.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.mynews.mynews.R
import com.mynews.mynews.business.adapter.Adapter
import com.mynews.mynews.business.data.Datasource
import com.mynews.mynews.databinding.FragmentBusinessBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class BusinessFragment: Fragment(R.layout.fragment_business) {
    lateinit var adapter: Adapter

    private var _binding: FragmentBusinessBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBusinessBinding.inflate(inflater, container, false)
        initializeList()

        lifecycleScope.launch(Dispatchers.IO){
            Datasource.loadBusinessNews(adapter)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initializeList() {
        adapter = Adapter()
        binding.businessRecyclerView.adapter
    }
}