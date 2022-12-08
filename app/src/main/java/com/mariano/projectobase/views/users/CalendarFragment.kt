package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentCalendarBinding
import com.mariano.projectobase.views.BaseFragment

class CalendarFragment : BaseFragment<FragmentCalendarBinding>() {
    override fun setUpViews() {

    }

    override fun observeData() {

    }

    override val viewBinding: FragmentCalendarBinding
        get() = FragmentCalendarBinding.inflate(layoutInflater)
}