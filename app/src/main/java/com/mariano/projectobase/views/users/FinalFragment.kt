package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentDetailHotelBinding
import com.mariano.projectobase.databinding.FragmentFinalBinding
import com.mariano.projectobase.views.BaseFragment

class FinalFragment : BaseFragment<FragmentFinalBinding>() {

    override val viewBinding: FragmentFinalBinding
        get() = FragmentFinalBinding.inflate(layoutInflater)

    override fun setUpViews() {
        binding.submit.setOnClickListener {
            onDestiny()
        }
    }

    private fun onDestiny()
    {
        val action = FinalFragmentDirections.finalFragmentToHomeFragment()
        navController.navigate(action)
    }

    override fun observeData() {

    }

}