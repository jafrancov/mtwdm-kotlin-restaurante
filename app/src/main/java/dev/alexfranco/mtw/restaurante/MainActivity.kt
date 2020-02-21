package dev.alexfranco.mtw.restaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_acerca_de -> this.acercaDe()
            R.id.menu_platos_fuertes -> this.platosFuertes()
            R.id.menu_ensaladas -> true
            R.id.menu_bebidas -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun acercaDe() : Boolean {
        val intentAcercaDe = Intent(this, AcercaDe::class.java)
        startActivity(intentAcercaDe)
        return true
    }

    private fun platosFuertes(): Boolean {
        val intentPlatosFuertes = Intent(this, PlatosFuertes::class.java)
        startActivity(intentPlatosFuertes)
        return true
    }
}
