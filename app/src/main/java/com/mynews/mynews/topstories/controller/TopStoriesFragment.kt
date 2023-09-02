package com.mynews.mynews.topstories.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.mynews.mynews.R
import com.mynews.mynews.databinding.FragmentTopStoriesBinding
import com.mynews.mynews.topstories.adapter.Adapter
import com.mynews.mynews.topstories.data.Datasource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TopStoriesFragment : Fragment(R.layout.fragment_top_stories) {

    lateinit var adapter: Adapter

    private var _binding: FragmentTopStoriesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTopStoriesBinding.inflate(inflater, container, false)
        initializeList()

        lifecycleScope.launch(Dispatchers.IO) {
            Datasource.loadNews(adapter)
        }

        //inflate the layout for this fragment
        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initializeList() {
        adapter = Adapter()
        binding.recyclerView.adapter = adapter
    }

}