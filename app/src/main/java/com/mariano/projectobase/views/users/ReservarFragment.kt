package com.mariano.projectobase.views.users

import android.view.View
import android.widget.Toast
import com.mariano.projectobase.databinding.FragmentReservarBinding
import com.mariano.projectobase.views.BaseFragment

class ReservarFragment : BaseFragment<FragmentReservarBinding>() {

    override val viewBinding: FragmentReservarBinding
        get() = FragmentReservarBinding.inflate(layoutInflater)

    override fun setUpViews() {

        binding.submit.setOnClickListener {
            if (binding.totalPer.text.isNullOrEmpty())
            {

            }

            else
            {
                onDestiny()
            }

        }
    }

    private fun onDestiny()
    {
        val action = ReservarFragmentDirections.reservarFragmentToMetodosPagoFragment()
        navController.navigate(action)
    }

    override fun observeData() {

    }



        private fun seleccion()
    {
        binding.datepk.visibility = View.VISIBLE
        binding.opt.visibility = View.GONE
    }
}