package com.mariano.projectobase.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.mariano.projectobase.App
import com.mariano.projectobase.R
import com.mariano.projectobase.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {

            if (binding.email.text.isEmpty() || binding.password.text.isEmpty())
            {
                //val contextView = findViewById<View>(R.layout.activity_login)

                Toast.makeText(this, "Falta correo y/o contraseña", Toast.LENGTH_SHORT).show()
            }

            else
            {
                reenviar_pantalla(1, binding.email.text.toString())
            }
        }

        binding.btnreg.setOnClickListener {
            reenviar_pantalla(2, "default")
        }
        /*binding.txt.setOnClickListener{reenviar_pantalla()}*/
    }

    private fun reenviar_pantalla(i: Int, email: String)
    {
        if ( i == 1 )
        {
            val app = App.getInstance()
            val editor = app.getSharedPrefs().edit()
            editor.putString("email", email)
            editor.commit()

            Handler().postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 200)
        }

        else
        {
            Handler().postDelayed({
                val intent = Intent(this, Resgistro::class.java)
                startActivity(intent)
                finish()
            }, 200)
        }

    }
}