package com.mynews.mynews.popular.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.mynews.mynews.R
import com.mynews.mynews.databinding.FragmentPopularBinding
import com.mynews.mynews.popular.adapter.Adapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PopularFragment: Fragment(R.layout.fragment_popular) {
    lateinit var adapter: Adapter

    private var _binding: FragmentPopularBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPopularBinding.inflate(inflater,container, false)
        initializeList()

        lifecycleScope.launch(Dispatchers.IO) {
            com.mynews.mynews.data.DataSource.loadPopularNews(adapter)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun initializeList() {
        adapter = Adapter()
        binding.popularRecyclerView.adapter = adapter
    }
}