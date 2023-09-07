package com.mynews.mynews.business.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.databinding.ItemRowBinding
import com.mynews.mynews.model.News
import com.squareup.picasso.Picasso

class Adapter(): RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    var businessNewsList: List<News> = mutableListOf<News>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.mynews.mynews.business.adapter.Adapter.ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = businessNewsList.size

    override fun onBindViewHolder(holder: com.mynews.mynews.business.adapter.Adapter.ItemViewHolder, position: Int) {
        holder.businessBind(businessNewsList[position])
    }
    class ItemViewHolder(private val view: com.mynews.mynews.databinding.ItemRowBinding): RecyclerView.ViewHolder(view.root){
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
