package com.mynews.mynews.business.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.business.model.BusinessNews
import com.mynews.mynews.databinding.ItemRowBinding
import com.squareup.picasso.Picasso

class Adapter(): RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    var businessNewsList: List<BusinessNews> = mutableListOf<BusinessNews>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = businessNewsList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.businessBind(businessNewsList[position])
    }
    class ItemViewHolder(private val view: ItemRowBinding): RecyclerView.ViewHolder(view.root){
        fun businessBind(news: BusinessNews?) {
            //Image holder
            Picasso.with(view.newsImage.context)
                .load(news?.multimedia?.firstOrNull()?.url)
                .placeholder(R.drawable.ic_android_black_24dp)
                .into(view.newsImage)

            //location holder
            view.location.text = news?.subsection

            //date holder
            view.date.text = news?.published_date

            //caption holder
            view.caption.text = news?.abstract

        }

    }
}
