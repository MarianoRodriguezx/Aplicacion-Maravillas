package com.mariano.projectobase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mariano.projectobase.views.MainActivity

class VerificationCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)
        var submit = findViewById<Button>(R.id.submit)
        submit.setOnClickListener {
            goToMain()
        }
    }

    fun goToMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }
}