package com.mariano.projectobase

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.mariano.projectobase.views.MainActivity

class OpcionesPago : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_opciones_pago)
        var paypal = findViewById<ImageView>(R.id.paypal)
        paypal.setOnClickListener {
            goToValidando()
        }

        setContentView(R.layout.activity_opciones_pago)
        var mastercard = findViewById<ImageView>(R.id.mastercard)
        mastercard.setOnClickListener {
            goToValidando()
        }

        setContentView(R.layout.activity_opciones_pago)
        var visa = findViewById<ImageView>(R.id.visa)
        visa.setOnClickListener {
            goToValidando()
        }
    }

    fun goToValidando(){
        startActivity(Intent(this, Validando::class.java))
    }
}