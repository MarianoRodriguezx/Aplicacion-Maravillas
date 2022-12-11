package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentCalendarBinding
import com.mariano.projectobase.utils.models.Calendario
import com.mariano.projectobase.utils.models.Hotel
import com.mariano.projectobase.views.BaseFragment
import com.mariano.projectobase.views.adapters.CalendarioAdapter
import com.mariano.projectobase.views.adapters.HotelesAdapter

class CalendarFragment : BaseFragment<FragmentCalendarBinding>(), CalendarioAdapter.OnCalendarioClickListener {
    override fun setUpViews() {
        setList()
    }

    override fun observeData() {

    }

    private fun setList()
    {
        var hoteles:MutableList<Calendario> = mutableListOf()

        hoteles.add(
            Calendario(
                1,
                "Hotel Ibis",
                "https://cf.bstatic.com/xdata/images/hotel/max1024x768/383350441.jpg?k=97f7df4bba0be473a347a74e26f2f84dc315329e2b72a4cbe855468c1277fca2&o=&hp=1",
                "5 Noches",
                "$250.00",
                "27/11/2023"
            )
        )

        setAdapter(hoteles)
    }

    private fun setAdapter(list: List<Calendario>){
        val adapter = CalendarioAdapter(list, this)
        binding.rvcHtcc.setHasFixedSize(true)
        binding.rvcHtcc.adapter = adapter
    }

    override val viewBinding: FragmentCalendarBinding
        get() = FragmentCalendarBinding.inflate(layoutInflater)

    override fun onCalendarioClick(calendario: Calendario) {
        val action = CalendarFragmentDirections.actionCalendarFragmentToCodigoQrFragment2()
        navController.navigate(action)
    }
}