package com.mynews.mynews.business.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mynews.mynews.R
import com.mynews.mynews.model.News
import com.squareup.picasso.Picasso

class Adapter(): RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    var newsList: List<News?> = mutableListOf<News>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.mynews.mynews.business.adapter.Adapter.ItemViewHolder {
        val binding = com.mynews.mynews.databinding.ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return com.mynews.mynews.business.adapter.Adapter.ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: com.mynews.mynews.business.adapter.Adapter.ItemViewHolder, position: Int) {
        holder.businessBind(newsList[position])
    }
    class ItemViewHolder(private val view: com.mynews.mynews.databinding.ItemRowBinding): androidx.recyclerview.widget.RecyclerView.ViewHolder(view.root){
        fun businessBind(news: News?) {
            //Image holder
            Picasso.with(view.newsImage.context)
                .load(news?.multimedia?.firstOrNull()?.url)
                .placeholder(R.drawable.ic_android_black_24dp)
                .into(view.newsImage)

            //location holder
            view.location.text = news?.subsection

            //date holder
            view.date.text = news?.createdDate

            //caption holder
            view.caption.text = news?.abstract

        }

    }
}
