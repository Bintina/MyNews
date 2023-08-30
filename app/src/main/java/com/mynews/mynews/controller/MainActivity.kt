package com.mynews.mynews.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.adapter.Adapter
import com.mynews.mynews.data.Datasource
import com.mynews.mynews.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialiseList()

        lifecycleScope.launch(Dispatchers.IO) {
            Datasource.loadNews(adapter)
        }
    }

    private fun initialiseList() {
        adapter = Adapter()
        binding.recyclerView.adapter = adapter
    }
}