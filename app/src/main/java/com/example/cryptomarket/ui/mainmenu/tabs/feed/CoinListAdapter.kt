package com.example.cryptomarket.ui.mainmenu.tabs.feed

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.model.Coin
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.R
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import retrofit2.http.Url
import java.net.URL
import java.net.URLEncoder


class CoinListAdapter:RecyclerView.Adapter<FeedListViewHolder>()  {
    val elementList: MutableList<Coin> = mutableListOf()
    private var onFeedItemClickListener: ((coin: Coin) -> Unit)? = null


    fun addAll(newElementList: List<Coin>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }
    fun setOnFeedItemClickListener(onFeedItemClickListener:  ((coin: Coin) -> Unit)?) {
        this.onFeedItemClickListener = onFeedItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_feed, parent, false)
        return FeedListViewHolder(view)
    }


    override fun onBindViewHolder(holder: FeedListViewHolder, position: Int) {
        holder.bind(elementList[position])
        holder.itemView.setOnClickListener {
            onFeedItemClickListener?.invoke(elementList[position])
        }

    }



    override fun getItemCount(): Int {
        return elementList.size

    }
}

class FeedListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val logo = itemView.findViewById<ImageView>(R.id.coinlogo)
    private val coinName = itemView.findViewById<TextView>(R.id.coinname)
    private val coinDesc = itemView.findViewById<TextView>(R.id.coinshort)
    private val coinVal = itemView.findViewById<TextView>(R.id.coinval)

    fun bind(coin: Coin) {

        GlideToVectorYou
            .init()
            .with(logo.context)
            .load(coin.logo_url.toUri(), logo);

//        GlideToVectorYou
//            .init()
//            .with(this)
//            .load( coin.imageUrl.toUri(), imageview);

//        Glide.with(itemView)
//            .load(coin.imageUrl)
//            .transform(CenterCrop(),RoundedCorners(24))
//            .into(logo)
        coinName.text = coin.name
        coinDesc.text = coin.id
        coinVal.text = "${coin.price} $"

    }
}