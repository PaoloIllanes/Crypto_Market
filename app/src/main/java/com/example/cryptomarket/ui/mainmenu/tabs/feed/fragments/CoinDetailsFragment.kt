package com.example.cryptomarket.ui.mainmenu.tabs.feed.fragments

import WalletListAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.cryptomarket.R
import com.example.cryptomarket.databinding.FragmentCoinDetailsBinding
import com.example.cryptomarket.databinding.FragmentWalletBinding
import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.model.OwnedCoin

class CoinDetailsFragment: Fragment() {

    private lateinit var coins: Coin
    private val arg: CoinDetailsFragmentArgs by navArgs()
    private lateinit var binding: FragmentCoinDetailsBinding




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_coin_details, container, false)
        binding = FragmentCoinDetailsBinding.inflate(inflater, container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        coins = arg.coin

        val logos = view.findViewById<ImageView>(R.id.logocoin)
        val logoname = view.findViewById<TextView>(R.id.logoname)
        val logosub = view.findViewById<TextView>(R.id.logosub)
        val logoprice = view.findViewById<TextView>(R.id.logoprice)




        Glide.with(view).load(coins.logo_url).transform(CenterCrop(), RoundedCorners(2))
            .into(logos)
        logoname.text = coins.name
        logosub.text = coins.id
        logoprice.text = coins.price


    }



}

