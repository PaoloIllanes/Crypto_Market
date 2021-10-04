package com.example.cryptomarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class WalletActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)

        var listView = findViewById<ListView>(R.id.listWallet)

        var list = mutableListOf<WalletModel>()

        list.add(WalletModel("Wallet 1" , "1242uifhifhewi" ,R.drawable.ic_launcher_foreground ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_foreground))
        list.add(WalletModel("Wallet 2" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 3" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 4" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 5" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 6" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 7" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 8" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 9" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 10" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 11" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 12" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 13" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 14" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 15" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 16" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))
        list.add(WalletModel("Wallet 17" , "1242uifhifhewi" ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background ,R.drawable.ic_launcher_background))



        listView.adapter = WalletAdapter(this , R.layout.row ,list)

    }
}