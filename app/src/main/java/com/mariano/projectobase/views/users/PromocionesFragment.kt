package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentProfileBinding
import com.mariano.projectobase.databinding.FragmentPromocionesBinding
import com.mariano.projectobase.utils.models.Hotel
import com.mariano.projectobase.views.BaseFragment
import com.mariano.projectobase.views.adapters.HotelesAdapter

class PromocionesFragment : BaseFragment<FragmentPromocionesBinding>(), HotelesAdapter.OnHotelClickListener {

    override val viewBinding: FragmentPromocionesBinding
        get() = FragmentPromocionesBinding.inflate(layoutInflater)

    override fun setUpViews() {
        setList()
    }

    private fun setAdapter(list: List<Hotel>){
        val adapter = HotelesAdapter(list, this)
        binding.rvcHtp.setHasFixedSize(true)
        binding.rvcHtp.adapter = adapter
    }

    private fun setList()
    {
        var hoteles:MutableList<Hotel> = mutableListOf()

        hoteles.add(Hotel
            (1,
            "Hotel ALO! Express",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/215836105.jpg?k=cc223277c5e61c2c79f6174c90282e1b824c5e80ad9b1b4a4e0738dc7eda9620&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/215836141.jpg?k=989c1cf987c1ede36f7566a98373e9e56879b350268f382e760a7fa51b76a316&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/215836153.jpg?k=986cdcfa370f2579aa4242c2b424c20572e4e6c9c571bf6c7b66ebcb60499895&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/215836138.jpg?k=02f623164b465a533c80790e13742c1f582c92c00c73526134b64f7527f5bd33&o=&hp=1",
            "$150.00 x Noche  -15% de Descuento",
            "El Hotel ALO! Express ofrece WiFi gratuita en todas las instalaciones y se encuentra en Torreón, a 12 km del estadio Corona y a 24 km de Benito Juárez.",
            "4.5")
        )

        hoteles.add(Hotel
            (2,
            "Ibis Torreon",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/383350441.jpg?k=97f7df4bba0be473a347a74e26f2f84dc315329e2b72a4cbe855468c1277fca2&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/380157781.jpg?k=4c47c62fea498c73b77e53bd5a9884e74828ebc135d452f3639686b1e54668d1&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/380157777.jpg?k=08eb90ce85c55534e37303f3a4c8831b8e03c1e27df312c3ed44e9d1b5377de5&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/380157794.jpg?k=31df7dd9e229ff9a4278a9f7cc1b9da25996db321bc55c49852abe2d1ea180b2&o=&hp=1",
            "$450.00 x Noche -15% de Descuento",
            "El Ibis Torreon se encuentra en Torreón, a 3,7 km del estadio Corona, y ofrece bar, jardín y vistas a la ciudad. Cuenta con restaurante, recepción 24 horas, servicio de habitaciones y WiFi gratuita en todas las instalaciones. El hotel dispone de habitaciones familiares.",
            "4.0")
        )


        hoteles.add(Hotel
            (5,
            "City Express",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/205039360.jpg?k=5d0a81a8fa993983b56dd826fb76cb256f3e538aff6bd46a7e46ab5d71decd2f&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/333309756.jpg?k=34b91c4ff4e8ef915a0f50a0344baff6d0a32a350943f725a3c0e12444687a90&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/205039332.jpg?k=69e2e7411f8e95b55969cb264f4f6c348030edd3c987c377ef936d34d193d11c&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/205039305.jpg?k=83569a0a9128f490291a6ea0ffdb86c24049b2f772e19ae724c77241d283f2a3&o=&hp=1",
            "$250.00 x Noche -15% de Descuento",
            "Este hotel moderno está al lado del centro comercial Galería Laguna, en Torreón. Ofrece servicio gratuito de traslado a cualquier destino situado en un radio de 10 km. El establecimiento dispone de gimnasio, conexión Wi-Fi gratuita y desayuno continental gratuito.",
            "4.5")
        )

        setAdapter(hoteles)
    }

    override fun observeData() {

    }

    override fun onHotelClick(hotel: Hotel) {
        val action = PromocionesFragmentDirections.actionPromocionesFragmentToDetailHotelFragment(hotel.name, hotel.img, hotel.img2, hotel.img3, hotel.qualifiquations, hotel.price, hotel.description)
        navController.navigate(action)
    }


}