package com.mariano.projectobase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.mariano.projectobase.views.MainActivity

class Notificaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificaciones)
        var back_img = findViewById<ImageView>(R.id.back_img)
        back_img.setOnClickListener {
            goToMain()
        }
    }

    fun goToMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }
}