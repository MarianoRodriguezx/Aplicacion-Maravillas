package com.mariano.projectobase.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mariano.projectobase.R
import com.mariano.projectobase.utils.models.Hotel
import com.squareup.picasso.Picasso

class HotelesAdapter(private var list: List<Hotel>, private var listener: OnHotelClickListener):RecyclerView.Adapter<HotelesAdapter.ViewHolder>() {

    interface OnHotelClickListener {
        fun onHotelClick(hotel: Hotel)
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val price = item.findViewById<TextView>(R.id.price)
        val qualification = item.findViewById<TextView>(R.id.qualf)
        val detail_img = item.findViewById<ImageView>(R.id.detail_img)
        val name = item.findViewById<TextView>(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.item_hotel, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hoteles = list[position]

        holder.name.text = hoteles.name
        holder.qualification.text = hoteles.qualifiquations
        holder.price.text = hoteles.price
        Picasso.get().load(hoteles.img_enc).into(holder.detail_img)

        holder.itemView.setOnClickListener{
            listener.onHotelClick(hoteles)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}