package com.mynews.mynews.popular.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.databinding.ItemRowBinding
import com.mynews.mynews.popular.model.PopularNews
import com.mynews.mynews.topstories.adapter.Adapter
import com.squareup.picasso.Picasso

class Adapter() : RecyclerView.Adapter<com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder>() {

    var popularNewsList: List<PopularNews> = mutableListOf<PopularNews>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder, position: Int) {
        holder.popularBind(popularNewsList[position])
    }


    override fun getItemCount(): Int = popularNewsList.size

    class ItemViewHolder(private val view: ItemRowBinding) : RecyclerView.ViewHolder(view.root) {
        fun popularBind(news: PopularNews?) {
            Picasso.with(view.newsImage.context)
                .load(news?.media?.firstOrNull()?.media_metadata?.firstOrNull()?.url)
                .placeholder(R.drawable.ic_android_black_24dp)
                .into(view.newsImage)

            //date holder
            view.date.text = news?.published_date

            //caption holder
            view.caption.text = news?.abstract
        }

    }

}