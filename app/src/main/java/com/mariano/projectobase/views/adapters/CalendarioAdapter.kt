package com.mariano.projectobase.views.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mariano.projectobase.R
import com.mariano.projectobase.utils.models.Calendario
import com.mariano.projectobase.utils.models.Hotel
import com.squareup.picasso.Picasso

class CalendarioAdapter(private var list: List<Calendario>, private var listener: CalendarioAdapter.OnCalendarioClickListener) :
    RecyclerView.Adapter<CalendarioAdapter.ViewHolder>() {

    interface OnCalendarioClickListener {
        fun onCalendarioClick(calendario: Calendario)
    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val image = item.findViewById<ImageView>(R.id.detail_imggg)
        val name = item.findViewById<TextView>(R.id.namew)
        val total_noche = item.findViewById<TextView>(R.id.total_noche)
        val fecha = item.findViewById<TextView>(R.id.fecha)
        val total = item.findViewById<TextView>(R.id.total)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.item_calendario, parent, false)
        return CalendarioAdapter.ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hoteles = list[position]

        Picasso.get().load(hoteles.img).into(holder.image)
        holder.name.text = hoteles.name
        holder.total_noche.text = hoteles.total_noches
        holder.fecha.text = hoteles.fecha
        holder.total.text = hoteles.total_pagar

    }

    override fun getItemCount(): Int {
        return list.size
    }
}