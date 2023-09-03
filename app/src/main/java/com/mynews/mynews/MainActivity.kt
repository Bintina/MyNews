package com.mynews.mynews

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.add
import androidx.fragment.app.commit
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
        inflater.inflate(R.menu.nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.popular_news_btn -> {
                navigateToPopular()
                true
            }
            R.id.business_news_btn -> {
                navigateToBusiness()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun navigateToPopular() {
        supportFragmentManager.commit { 
            setReorderingAllowed(true)
                add<PopularFragment>(R.id.fragment_container_view)
            Log.d("Popular Clicked", "Click Successful" )
        }
        
    }

    private fun navigateToBusiness() {
        TODO("Not yet implemented")
    }

}

private fun <T> FragmentTransaction.add(fragmentContainerView: Int) {

}
