package com.example.cryptomarket.model

import java.io.Serializable

data class OwnedCoin(val coin: Coin,
                     val qty: Double,
                     ):Serializable
