package my.edu.tarc.roomdbdemo.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.roomdbdemo.R

class MyAdapter(private val productList: List<Product>): RecyclerView.Adapter<MyAdapter.myViewHolder> (){

    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val productName: TextView = itemView.findViewById(R.id.tvName)
        val productPrice: TextView = itemView.findViewById(R.id.tvPrice)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)

        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val currentProduct = productList[position]

        holder.productName.text = currentProduct.name
        holder.productPrice.text = currentProduct.price.toString()

    }

    override fun getItemCount(): Int {
        return productList.size
    }

}