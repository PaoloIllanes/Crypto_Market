package com.example.cryptomarket.data.feed

import android.content.Context
import com.example.cryptomarket.data.feed.network.FeedNetworkController
import com.example.cryptomarket.data.feed.persistency.FeedPersistencyController

import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.ui.isNetworkConnected
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FeedRepository(val network: FeedNetworkController, val persistency: FeedPersistencyController) {
    fun getAllCoinList(context: Context):Flow<List<Coin>>{
        return flow{
            emit(persistency.getCoinsList())
            try{
                if(isNetworkConnected(context)){
                    val coins = network.getAllCoins()

                        persistency.saveCoin(coins)


                        emit(coins)

                }
            }catch (e:Exception){}
        }
    }




}
