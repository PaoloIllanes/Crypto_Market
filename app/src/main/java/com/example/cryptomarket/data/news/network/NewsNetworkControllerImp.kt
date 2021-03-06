package com.example.cryptomarket.data.news.network

import com.example.cryptomarket.model.Post
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class NewsNetworkControllerImp: NewsNetworkController {
    val client = Retrofit.Builder().baseUrl("http://10.0.2.2:3000/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NewsAPI::class.java)

    override suspend fun getAllPosts(): List<Post> {
        return client.getAllPosts()
    }
}