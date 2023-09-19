package com.mynews.mynews

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.mynews.mynews.business.controller.BusinessFragment
import com.mynews.mynews.databinding.ActivityMainBinding
import com.mynews.mynews.popular.controller.PopularFragment
import com.mynews.mynews.topstories.controller.TopStoriesFragment


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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.popular_btn -> {
                navigateToPopular()
                true
            }

            R.id.business_btn -> {
                navigateToBusiness()
                true
            }

            R.id.top_stories_btn -> {
                navigateToTop()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun navigateToTop() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<TopStoriesFragment>(R.id.fragment_container_view)
        }
    }

    private fun navigateToPopular() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<PopularFragment>(R.id.fragment_container_view)
        }
    }

    private fun navigateToBusiness() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BusinessFragment>(R.id.fragment_container_view)
        }
    }
}
