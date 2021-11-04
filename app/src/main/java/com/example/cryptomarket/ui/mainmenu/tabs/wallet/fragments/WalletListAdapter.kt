import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

import com.example.cryptomarket.databinding.ListItemWalletBinding
import com.example.cryptomarket.model.OwnedCoin

class WalletListAdapter:RecyclerView.Adapter<WalletListViewHolder>(){
    val elementList: MutableList<OwnedCoin> = mutableListOf()

    fun addAll(newElementList: List<OwnedCoin>) {
        elementList.clear()
        elementList.addAll(newElementList)
        notifyDataSetChanged()
    }

    fun add(newElement: OwnedCoin){
        elementList.add(newElement)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletListViewHolder {
        val binding =
            ListItemWalletBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WalletListViewHolder(binding)
    }


    override fun onBindViewHolder(holder: WalletListViewHolder, position: Int) {
        holder.bind(elementList[position])

    }

    override fun getItemCount(): Int {
        return elementList.size

    }
}

class WalletListViewHolder(val binding: ListItemWalletBinding):
RecyclerView.ViewHolder(binding.root) {


    fun bind(ownedCoin: OwnedCoin) {
        Glide.with(itemView)
            .load(ownedCoin.coin.logo_url)
            .transform(CenterCrop(),RoundedCorners(24))
            .into(binding.walletlogo)
        binding.walletname.text = ownedCoin.coin.name
        binding.walletshort.text = "${ownedCoin.coin.price} USD"
        binding.walletval.text = "${ownedCoin.qty}"
    }
}