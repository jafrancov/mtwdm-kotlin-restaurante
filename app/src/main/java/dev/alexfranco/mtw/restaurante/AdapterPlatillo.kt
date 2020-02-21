package dev.alexfranco.mtw.restaurante

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.content_item.view.*

class AdapterPlatillo (var list:ArrayList<Platillo>): RecyclerView.Adapter<AdapterPlatillo.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        fun bindItems(data:Platillo) {
            itemView.txtTexto.text = data.nombre
            Glide.with(itemView.context).load(data.thumbnail).into(itemView.imvImagen)

            itemView.setOnClickListener {
                val intentPlatilloDetalle = Intent(itemView.context, PlatilloDetalle::class.java)
                intentPlatilloDetalle.putExtra("platillo", data.nombre)
                intentPlatilloDetalle.putExtra("imagen", data.thumbnail)
                itemView.context.startActivity(intentPlatilloDetalle)
//                Toast.makeText(itemView.context, "Platillo ${data.nombre}", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPlatillo.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.content_item, parent, false)
        return AdapterPlatillo.ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: AdapterPlatillo.ViewHolder, position: Int) {
        holder.bindItems(list[position])
    }
}
