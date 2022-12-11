package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentDetailHotelBinding
import com.mariano.projectobase.databinding.FragmentMetodosPagoBinding
import com.mariano.projectobase.views.BaseFragment

class Metodos_Pago_Fragment : BaseFragment<FragmentMetodosPagoBinding>() {

    override val viewBinding: FragmentMetodosPagoBinding
        get() = FragmentMetodosPagoBinding.inflate(layoutInflater)

    override fun setUpViews() {
        binding.mastercard.setOnClickListener{
            onDestiny()
        }

        binding.paypal.setOnClickListener{
            onDestiny()
        }

        binding.visa.setOnClickListener{
            onDestiny()
        }
    }

    private fun onDestiny()
    {
        val action = Metodos_Pago_FragmentDirections.metodosFragmentToValidacionFragment()
        navController.navigate(action)
    }

    override fun observeData() {

    }
}