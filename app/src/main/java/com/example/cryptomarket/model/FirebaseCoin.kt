package com.example.cryptomarket.model

class FirebaseCoin(val name: String = "", val imageUrl: String = "", var available: Int = 0) {
    fun getDocumentId(): String {
        return name.lowercase()
    }
}