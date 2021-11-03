import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

import com.example.cryptomarket.databinding.ListItemWalletBinding
import com.example.cryptomarket.model.FirebaseCoin
import com.example.cryptomarket.model.OwnedCoin

class WalletListAdapter(val cryptoList: ArrayList<FirebaseCoin>, val context: Context) :
    RecyclerView.Adapter<WalletListAdapter.WalletListViewHolder>() {

    class WalletListViewHolder(val binding: ListItemWalletBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletListViewHolder {
        val binding =
            ListItemWalletBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WalletListViewHolder(binding)
    }


    override fun onBindViewHolder(holder: WalletListViewHolder, position: Int) {
        val coin = cryptoList[position]
        with(holder) {
            binding.walletname.text = coin.name
            binding.walletval.text = "${coin.available}"
            Glide.with(holder.itemView).load(coin.imageUrl).into(binding.walletlogo)
        }
    }

    override fun getItemCount(): Int {
        return cryptoList.size

    }
}