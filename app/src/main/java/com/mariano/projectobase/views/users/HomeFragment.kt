package com.mariano.projectobase.views.users

import com.mariano.projectobase.databinding.FragmentHomeBinding
import com.mariano.projectobase.utils.models.Hotel
import com.mariano.projectobase.views.BaseFragment
import com.mariano.projectobase.views.adapters.HotelesAdapter

class HomeFragment : BaseFragment<FragmentHomeBinding>(), HotelesAdapter.OnHotelClickListener {


    override fun setUpViews() {
        setList()
    }

    override fun observeData() {

    }

    private fun setAdapter(list: List<Hotel>){
        val adapter = HotelesAdapter(list, this)
        binding.rvcHt.setHasFixedSize(true)
        binding.rvcHt.adapter = adapter
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
            "$150.00 x Noche",
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
            "$450.00 x Noche",
            "El Ibis Torreon se encuentra en Torreón, a 3,7 km del estadio Corona, y ofrece bar, jardín y vistas a la ciudad. Cuenta con restaurante, recepción 24 horas, servicio de habitaciones y WiFi gratuita en todas las instalaciones. El hotel dispone de habitaciones familiares.",
            "4.0")
        )

        hoteles.add(Hotel
            (3,
            "Fresno Galerias",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/193889695.jpg?k=dcea8dc0c30874b5c787e1dc078714ea592a33b9b02d4db073b1987439a38137&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/193889641.jpg?k=0eda9505b44722c0b17223c0bb72f6080faace9f4fc1e66cb2a068829c3305bb&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/128534328.jpg?k=d7a65ba48b479d297a505e4b8cc97d2b12e9230ac8e900497cf664d0304d3d3b&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/286336421.jpg?k=f6ad226254b98db1623a7c9c2438a3261f549b5623e012109ee999a699343f26&o=&hp=1",
            "$350.00 x Noche",
            "El Fresno Galerías, situado a solo 5 minutos en coche del aeropuerto internacional de Torreón, ofrece un servicio gratuito de enlace con al aeropuerto y de traslado a los alrededores. Además, cuenta con piscina al aire libre, gimnasio, WiFi gratis y aparcamiento gratuito.",
            "3.0")
        )

        hoteles.add(Hotel
            (4,
            "Hampton Inn",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/152365253.jpg?k=a4a78f736508aaf958ac3829e9ce661e2e2271f260cf3eeb59da7b2acb07e6dd&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/152370462.jpg?k=2a86faa05595abb9c001541975e39479d5905d7098f6fa16c86d696e834bcd68&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/123737970.jpg?k=0ec1669c60788bb16ee41a38d83b139dc35496b2391ed34b7f0428b41a137247&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/152370494.jpg?k=c19e273efbce46319c96c8b951bd835e4f9f5ea8f4ca2ef5b5de242c273a625b&o=&hp=1",
            "$550.00 x Noche",
            "Este hotel ofrece comodidades modernas y está situado en la ciudad mexicana de Torreón, en Coahuila, cerca de varios lugares de interés. Hay servicio gratuito de traslado desde el hotel hasta el aeropuerto.",
            "2.0")
        )

        hoteles.add(Hotel
            (5,
            "City Express",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/205039360.jpg?k=5d0a81a8fa993983b56dd826fb76cb256f3e538aff6bd46a7e46ab5d71decd2f&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/333309756.jpg?k=34b91c4ff4e8ef915a0f50a0344baff6d0a32a350943f725a3c0e12444687a90&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/205039332.jpg?k=69e2e7411f8e95b55969cb264f4f6c348030edd3c987c377ef936d34d193d11c&o=&hp=1",
            "https://cf.bstatic.com/xdata/images/hotel/max1024x768/205039305.jpg?k=83569a0a9128f490291a6ea0ffdb86c24049b2f772e19ae724c77241d283f2a3&o=&hp=1",
            "$250.00 x Noche",
            "Este hotel moderno está al lado del centro comercial Galería Laguna, en Torreón. Ofrece servicio gratuito de traslado a cualquier destino situado en un radio de 10 km. El establecimiento dispone de gimnasio, conexión Wi-Fi gratuita y desayuno continental gratuito.",
            "4.5")
        )

        setAdapter(hoteles)
    }

    override val viewBinding: FragmentHomeBinding
        get() = FragmentHomeBinding.inflate(layoutInflater)

    override fun onHotelClick(hotel: Hotel) {
        val action = HomeFragmentDirections.actionHomeToDetailHotel(hotel.name, hotel.img, hotel.img2, hotel.img3, hotel.qualifiquations, hotel.price, hotel.description)
        navController.navigate(action)
    }
}