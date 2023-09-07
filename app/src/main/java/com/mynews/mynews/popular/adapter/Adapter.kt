package com.mynews.mynews.popular.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.databinding.ItemRowBinding
import com.mynews.mynews.model.News
import com.squareup.picasso.Picasso

class Adapter() : RecyclerView.Adapter<com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder>() {

    var popularNewsList: List<News?> = mutableListOf<News>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: com.mynews.mynews.popular.adapter.Adapter.ItemViewHolder,
        position: Int
    ) {
        holder.popularBind(popularNewsList[position])
    }


    override fun getItemCount(): Int = popularNewsList.size

    class ItemViewHolder(private val view: ItemRowBinding) : RecyclerView.ViewHolder(view.root) {
        fun popularBind(news: News?) {

            val imageUrl = news?.media?.first()?.mediaMetadata?.first()?.url
            println("${news?.media}")
            Picasso.with(view.newsImage.context)
                .load(imageUrl)
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