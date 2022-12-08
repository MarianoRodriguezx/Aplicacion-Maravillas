package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentDetailHotelBinding
import com.mariano.projectobase.databinding.FragmentHomeBinding
import com.mariano.projectobase.views.BaseFragment
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class DetailHotelFragment : BaseFragment<FragmentDetailHotelBinding>() {

    lateinit var name: String
    lateinit var img: String
    lateinit var img2: String
    lateinit var img3: String
    lateinit var price: String
    lateinit var description: String
    lateinit var calificacion: String

    override val viewBinding: FragmentDetailHotelBinding
        get() = FragmentDetailHotelBinding.inflate(layoutInflater)

    override fun setUpViews() {
        setData()

        binding.next.setOnClickListener {  }
    }

    override fun observeData() {
        val args = DetailHotelFragmentArgs.fromBundle(requireArguments())
        name = args.name
        img = args.img
        img2 = args.img2
        img3 = args.img3
        description = args.description
        price = args.price
        calificacion = args.qualification
    }

    private fun setData()
    {
        binding.nameHotel.text = name
        binding.description.text = description
        binding.priDt.text = price
        binding.qual.text = calificacion
        setCarousel()
    }

    private fun reservar()
    {

    }

    private fun setCarousel()
    {
        val list = mutableListOf<CarouselItem>()

        // Image URL with caption
        list.add(CarouselItem(imageUrl = img))
        list.add(CarouselItem(imageUrl = img2))
        list.add(CarouselItem(imageUrl = img3))


        binding.carousel.setData(list)
    }
}