package dev.alexfranco.mtw.restaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_platillo_detalle.*

class PlatilloDetalle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platillo_detalle)

        val platillo = intent.getStringExtra("platillo")
        val imagen = intent.getIntExtra("imagen", 0)

        txtPlatillo.text = platillo
        imgPlatillo.setImageResource(imagen)
    }
}
