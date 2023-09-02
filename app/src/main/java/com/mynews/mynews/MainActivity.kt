package com.mynews.mynews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.lifecycle.lifecycleScope
import com.mynews.mynews.topstories.adapter.Adapter
import com.mynews.mynews.topstories.data.Datasource
import com.mynews.mynews.databinding.ActivityMainBinding
import com.mynews.mynews.topstories.controller.TopStoriesFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {

                setReorderingAllowed(true)
                add<TopStoriesFragment>(R.id.fragment_container_view)
            }
        }
    }

}
