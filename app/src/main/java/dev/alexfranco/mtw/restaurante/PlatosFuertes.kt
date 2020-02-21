package dev.alexfranco.mtw.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_platos_fuertes.*

class PlatosFuertes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platos_fuertes)

        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val platillos = ArrayList<Platillo>()

        platillos.add(Platillo("Platillo uno", R.drawable.platillo1))
        platillos.add(Platillo("Platillo dos", R.drawable.platillo2))
        platillos.add(Platillo("Platillo tres", R.drawable.platillo3))
        platillos.add(Platillo("Platillo cuatro", R.drawable.platillo4))

        val adapter = AdapterPlatillo(platillos)
        recycler.adapter = adapter
    }
}
