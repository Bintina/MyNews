package com.mynews.mynews.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.databinding.ItemRowBinding
import com.mynews.mynews.model.News
import com.squareup.picasso.Picasso

class Adapter() : RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    var newsList: List<News?> = mutableListOf<News>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(newsList[position])
    }

    override fun getItemCount(): Int = newsList.size

    class ItemViewHolder(private val view: ItemRowBinding) : RecyclerView.ViewHolder(view.root) {
        fun bind(news: News?) {

            Picasso.with(view.newsImage.context)
                .load(news?.multimedia?.firstOrNull()?.url)
                .placeholder(R.drawable.ic_android_black_24dp)
                .into(view.newsImage)

            //date holder
            view.date.text = news?.createdDate

            //caption holder
            view.caption.text = news?.abstract
        }

    }
}