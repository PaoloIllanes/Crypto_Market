package com.example.cryptomarket.ui.mainmenu.tabs.wallet.fragments

import WalletListAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptomarket.R
import com.example.cryptomarket.databinding.FragmentFeedBinding
import com.example.cryptomarket.databinding.FragmentWalletBinding
import com.example.cryptomarket.model.FirebaseCoin
import com.example.cryptomarket.model.User

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class WalletFragment : Fragment() {
    lateinit var firebaseAuth: FirebaseAuth
    val db = Firebase.firestore
    private lateinit var binding: FragmentWalletBinding
    private var user: User? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWalletBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        firebaseAuth = FirebaseAuth.getInstance()
        var currentUser = firebaseAuth.currentUser

        loadAllData(currentUser!!.uid)

    }

    fun loadAllData(userId: String) {
        val cryptoList = ArrayList<FirebaseCoin>()
//        var ref = db.collection("cryptos")
//        ref.get()
//            .addOnSuccessListener {
//                if (it.isEmpty) {
//                    Toast.makeText(context, "No cryptos found", Toast.LENGTH_SHORT).show()
//                    return@addOnSuccessListener
//                }
//                for (doc in it) {
//                    val cryptoModel = doc.toObject(FirebaseCoin::class.java)
//                    cryptoList.add(cryptoModel)
//                }
//                binding.wallrecycle.apply {
//                    layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
//                    adapter = WalletListAdapter(cryptoList, context)
//                }
//            }
        db.collection("cryptos").addSnapshotListener { snapshot, e ->
            cryptoList.clear()
            for (doc in snapshot!!.documents) {
                val cryptoModel = doc.toObject(FirebaseCoin::class.java)
                cryptoList.add(cryptoModel!!)
            }
            binding.wallrecycle.apply {
                layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
                adapter = WalletListAdapter(cryptoList, context)
            }
        }
    }

    fun onBuyCrypoClicked(coin: FirebaseCoin){
        if(coin.available > 0){
            for(userCrypto in user!!.ownedCoins!!){
                if(userCrypto.name == coin.name){
                    userCrypto.available += 1
                    break
                }
            }
            coin.available--
            updateCrypto(coin)
        }
    }

    fun updateCrypto(crypto: FirebaseCoin) {
        db.collection("cryptos").document(crypto.getDocumentId())
            .update("available", crypto.available)
    }
}