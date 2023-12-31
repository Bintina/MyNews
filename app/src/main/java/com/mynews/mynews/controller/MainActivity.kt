package com.mynews.mynews.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.adapter.Adapter
import com.mynews.mynews.data.Datasource

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialiseList()

        Datasource.loadNews(this, adapter)
    }

    private fun initialiseList() {
        adapter = Adapter(this)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = adapter
    }
}