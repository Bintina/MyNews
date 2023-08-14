package com.mynews.mynews.adapter.popular

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.mynews.mynews.R
import com.mynews.mynews.adapter.Adapter
import com.mynews.mynews.model.NewsItem
import com.mynews.mynews.model.PopularResult
import com.squareup.picasso.Picasso

class PopularAdapter(private val context: Context) : RecyclerView.Adapter<PopularAdapter.ItemViewHolder>() {
    var popularNewsList: List<PopularResult?> = mutableListOf()


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val card: CardView = view.findViewById(R.id.card_contents)
        val image: ImageView = view.findViewById(R.id.news_image)
        val location: TextView = view.findViewById(R.id.location)
        val date: TextView = view.findViewById(R.id.date)
        val caption: TextView = view.findViewById(R.id.caption)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val newsInPosition = popularNewsList[position]
        val newsImageUrl = newsInPosition?.popularMedia?.first()?.popularMediaMetadata?.first()?.popularUrl

        //Image holder
        Picasso.with(context)
            .load(newsImageUrl)
            .placeholder(R.drawable.ic_android_black_24dp)
            .into(holder.image)

        //location holder
        holder.location.text = newsInPosition?.popularSubsection

        //date holder
        holder.date.text = newsInPosition?.popularPublishedDate

        //caption holder
        holder.caption.text = newsInPosition?.popularTitle

        //holder.caption?.text =
    }


    override fun getItemCount(): Int = popularNewsList.size
}