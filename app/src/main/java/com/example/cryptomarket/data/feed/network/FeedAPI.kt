package com.example.cryptomarket.data.feed.network

import com.example.cryptomarket.model.Coin
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface FeedAPI {
    @GET("/v1/currencies/ticker")
    suspend fun getAllCoins(
        @Query("key")key:String,
        @Query("ids")ids:String,
        @Query("convert")convert:String,
        ): List<Coin>
}