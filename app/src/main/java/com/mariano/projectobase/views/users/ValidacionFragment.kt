package com.mariano.projectobase.views.users

import android.animation.ObjectAnimator
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.core.animation.doOnEnd
import com.mariano.projectobase.databinding.FragmentDetailHotelBinding
import com.mariano.projectobase.databinding.FragmentValidacionBinding
import com.mariano.projectobase.views.BaseFragment

class ValidacionFragment : BaseFragment<FragmentValidacionBinding>() {

    override val viewBinding: FragmentValidacionBinding
        get() = FragmentValidacionBinding.inflate(layoutInflater)

    override fun setUpViews() {
        binding.progressBar.setProgressTintList(ColorStateList.valueOf(Color.parseColor("#b5a459")))
        binding.progressBar.max = 1000

        val currentProgress = 1000;

        val anim = ObjectAnimator.ofInt(binding.progressBar, "progress", currentProgress)
        anim.setDuration(2000)
        anim.doOnEnd {changeActivity()}
        anim.start()
    }

    private fun changeActivity()
    {
        val action = ValidacionFragmentDirections.actionValidacionFragmentToFinalFragment()
        navController.navigate(action)
    }

    override fun observeData() {

    }


}