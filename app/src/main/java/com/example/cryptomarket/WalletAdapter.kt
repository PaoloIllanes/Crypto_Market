package com.example.cryptomarket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.cryptomarket.R

class WalletAdapter( var mCtx : Context , var resources : Int , var items : List<WalletModel> ) : ArrayAdapter<WalletModel>(mCtx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)
        val view : View  = layoutInflater.inflate(resources,null)


        val imageCrypto1 : ImageView = view.findViewById(R.id.crypto1)
        val imageCrypto2 : ImageView = view.findViewById(R.id.crypto2)
        val imageCrypto3 : ImageView = view.findViewById(R.id.crypto3)
        val numberWallet : TextView = view.findViewById(R.id.numberWallet)
        val hashWallet : TextView = view.findViewById(R.id.hashWallet)



        var mItem : WalletModel = items[position]

        imageCrypto1.setImageDrawable(mCtx.resources.getDrawable(mItem.imgCrypto1))
        imageCrypto2.setImageDrawable(mCtx.resources.getDrawable(mItem.imgCrypto2))
        imageCrypto3.setImageDrawable(mCtx.resources.getDrawable(mItem.imgCrypto3))

        numberWallet.text = mItem.numberWallet

        hashWallet.text = mItem.hashWallet





        return view
    }


}