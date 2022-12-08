package com.mariano.projectobase.views.users

import android.view.View
import com.mariano.projectobase.databinding.FragmentDetailHotelBinding
import com.mariano.projectobase.databinding.FragmentReservarBinding
import com.mariano.projectobase.views.BaseFragment

class ReservarFragment : BaseFragment<FragmentReservarBinding>() {

    override val viewBinding: FragmentReservarBinding
        get() = FragmentReservarBinding.inflate(layoutInflater)

    override fun setUpViews() {
        binding.dateRes.setOnClickListener{
            seleccion()
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