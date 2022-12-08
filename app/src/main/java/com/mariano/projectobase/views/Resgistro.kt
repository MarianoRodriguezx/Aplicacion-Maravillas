package com.mariano.projectobase.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.mariano.projectobase.R
import com.mariano.projectobase.VerificationCode

class Resgistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgistro)

        var submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            goToCode()
        }
    }

    fun goToCode(){
        startActivity(Intent(this, VerificationCode::class.java))
    }
}