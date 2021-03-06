package com.example.cryptomarket.ui.mainmenu.tabs.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptomarket.data.feed.FeedDataSource
import com.example.cryptomarket.databinding.FragmentFeedBinding
import com.example.cryptomarket.ui.mainmenu.tabs.news.viewmodels.PostViewModel


class FeedFragment: Fragment() {
    private val coinListAdapter = CoinListAdapter()
    private lateinit var binding: FragmentFeedBinding
    private val feedViewModel: FeedViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.frv.adapter =coinListAdapter;
        binding.frv.layoutManager = LinearLayoutManager(context,  LinearLayoutManager.VERTICAL, false)


        coinListAdapter.setOnFeedItemClickListener {
            //
            val directions = FeedFragmentDirections.actiontocoin(it);
            findNavController().navigate(directions)

        }

        feedViewModel.coins.observe(viewLifecycleOwner){
            coinListAdapter.addAll(it)
        }

        feedViewModel.getAllCoins(requireContext())

        binding.deposit
            .setOnClickListener {
            val directions = FeedFragmentDirections.actionFeedFragment2ToDepositFragment();
            findNavController().navigate(directions)
        }


    }
}

