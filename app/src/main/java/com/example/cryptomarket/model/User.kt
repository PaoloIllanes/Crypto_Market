package com.example.cryptomarket.model

data class User(val name: String,
                val funds: Double,
                val ownedCoins:List<FirebaseCoin>
)
