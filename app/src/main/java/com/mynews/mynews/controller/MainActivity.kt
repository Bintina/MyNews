package com.mynews.mynews.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.R.id.popular_btn
import com.mynews.mynews.adapter.Adapter
import com.mynews.mynews.data.Datasource
import com.mynews.mynews.model.NewsItem

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter

    lateinit var popularBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialiseList()

        Datasource.loadNews(this, adapter)

        popularBtn = findViewById(com.mynews.mynews.R.id.popular_btn)
        popularBtn.setOnClickListener {
            openPopular()
        }
    }

    private fun initialiseList() {
        adapter = Adapter(this)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = adapter
    }

    private fun openPopular() {
        val intent = Intent(this, PopularNewsActivity::class.java)
        startActivity(intent)
    }

}