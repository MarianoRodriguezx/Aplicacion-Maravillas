package com.mariano.projectobase.views.users

import android.content.Intent
import android.view.View
import com.mariano.projectobase.databinding.FragmentDetailHotelBinding
import com.mariano.projectobase.databinding.FragmentReservarBinding
import com.mariano.projectobase.views.BaseFragment
import com.mariano.projectobase.views.MainActivity

class ReservarFragment : BaseFragment<FragmentReservarBinding>() {

    override val viewBinding: FragmentReservarBinding
        get() = FragmentReservarBinding.inflate(layoutInflater)

    override fun setUpViews() {
        binding.dateRes.setOnClickListener{
            seleccion()
        }
        binding.submit.setOnClickListener {

        }
    }

    override fun observeData() {

    }

    private fun seleccion()
    {
        binding.datepk.visibility = View.VISIBLE
        binding.opt.visibility = View.GONE
    }
}