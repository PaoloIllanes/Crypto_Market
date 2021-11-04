package com.example.cryptomarket.model
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Coin(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("logo_url") val logo_url: String,
    @SerializedName("price") val price: String): Serializable
