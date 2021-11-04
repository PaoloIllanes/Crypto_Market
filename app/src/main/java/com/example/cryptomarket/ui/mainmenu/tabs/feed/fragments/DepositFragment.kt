package com.example.cryptomarket.ui.mainmenu.tabs.feed.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.cryptomarket.databinding.FragmentDepositBinding
import com.example.cryptomarket.databinding.FragmentWalletBinding
import com.example.cryptomarket.model.Coin
import com.example.cryptomarket.ui.mainmenu.tabs.wallet.fragments.WalletFragment


class DepositFragment: Fragment() {

    private lateinit var coins: Coin
    private val arg: CoinDetailsFragmentArgs by navArgs()
    private lateinit var binding: FragmentDepositBinding





    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_deposit, container, false)
        binding = FragmentDepositBinding.inflate(inflater, container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button3.setOnClickListener(){

        }
//


    }



}

