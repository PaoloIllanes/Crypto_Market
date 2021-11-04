package com.example.cryptomarket.data.feed.network

import android.util.Log
import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.Post
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.log


class FeedNetworkControllerImp: FeedNetworkController {
    val client = Retrofit.Builder().baseUrl("https://api.nomics.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    override suspend fun getAllCoins(): List<Coin> {
        return client.create(FeedAPI::class.java).getAllCoins("df1cb5ffc82ae73db7407e680e73dd8e3888d131","BTC,ETH,XRP,SHIB,ADA,DOGE,LTC","USD")

    }
}