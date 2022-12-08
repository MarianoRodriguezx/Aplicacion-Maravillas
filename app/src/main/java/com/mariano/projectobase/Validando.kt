package com.mariano.projectobase

import android.animation.ObjectAnimator
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import androidx.core.animation.doOnEnd
import com.mariano.projectobase.views.Login

class Validando : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validando)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#b5a459")));
        progressBar.max = 1000;

        val currentProgress = 1000;

        val anim = ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
        anim.setDuration(2000)
        anim.doOnEnd {changeActivity()}
        anim.start()
    }

    fun changeActivity(){
        startActivity(Intent(this, Qrcode::class.java))
    }
}