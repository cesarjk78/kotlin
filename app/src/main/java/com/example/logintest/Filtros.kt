package com.example.logintest

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class Filtros : AppCompatActivity() {
    private var adapter: filtros2? = null
    private var filteredItems: MutableList<Item>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filtritos)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val searchField = findViewById<EditText>(R.id.searchField)

        // Datos originales
        val originalItems: MutableList<Item> = ArrayList()
        originalItems.add(
            Item(
                R.drawable.imagen_7,
                "Tienda Online WEB/Móvil de Componentes para computadora"
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_48,
                "Tecfood Reservas es una aplicación exclusiva diseñada para la comunidad de Tecsup, ofreciendo una solución conveniente y eficiente para realizar reservas de comidas en las instalaciones del campus."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_14,
                "Una aplicación que ofrece lecciones cortas y concisas sobre una amplia variedad de temas, diseñadas para el aprendizaje en breves períodos de tiempo."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_72,
                "Nuestro proyecto se basa en la creación de una aplicación web y móvil para la pequeña empresa VitaMarket, que actualmente vende productos naturales y orgánicos de forma digital a través de las redes sociales en la ciudad de Trujillo."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_47,
                "VirtualGym será una plataforma que ayude a muchas personas en varios aspectos, ya sea física o emocionalmente."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_23,
                "Nuestro programa se basa en una aplicación móvil intuitiva y fácil de usar que permite a los ciudadanos reportar situaciones de riesgo o delincuencia de manera instantánea. Esta información se procesa en tiempo real y se utiliza para enviar alertas a todos los usuarios cercanos a la ubicación del incidente, además, el programa integra un sistema de geolocalización avanzado que muestra un mapa en tiempo real con la ubicación de incidentes y delincuentes identificados por sectores."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_25,
                "ClimaTec es un software que busca informar a las personas acerca de los fenómenos naturales y sepan de qué forma afectan a las personas, así como también en qué zonas afecta y cuales las temperatura en dichas zonas."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_16,
                "Es un software diseñado para facilitar la compra y venta de artículos nuevos o usados entre miembros de la comunidad Tecsup, fomentando el bienestar económico y ambiental de los miembros de nuestra institución."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_17,
                "Tecfood Reservas es una aplicación exclusiva diseñada para la comunidad de Tecsup, ofreciendo una solución conveniente y eficiente para realizar reservas de comidas en las instalaciones del campus. Con una interfaz amigable y funciones personalizadas, Tecfood Reservas simplifica el proceso de reserva, garantizando una experiencia gastronómica fluida y satisfactoria para estudiantes, profesores y personal administrativo."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_77,
                "App de reconocimiento de emociones mediante manera fácial donde si muestra una emoción este mostrará un tip de ayuda para cada situación."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_85,
                "La Tia Veneno® es una app web SPA (Single Page Application) de la cadena de restaurantes peruana \"La Tia Veneno\", donde se mostrará las diferentes categorías de comida, y la lista de menús de cada una de estas. El cliente podrá seleccionar las comidas que pedirá, verlas en el carrito de pedidos y efectuar con el método de pago virtual."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_87,
                "Es un programa que está relacionado con la seguridad ciudadana de un Distrito, se encargará de enviar una alerta en un aplicativo móvil y mostrar un mapeo de delincuentes por sectores en un sitio web."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_84,
                "Es un aplicativo web cuya finalidad es que los alumnos de Tecsup confirmen su asistencia a clases y eventos organizados de manera presencial, además de hacer un seguimiento de todas sus asistencias."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_88,
                "Es una plataforma web tipo E-commerce de venta de ropa y accesorios deportivos relacionados al mundial Qatar 2022."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen158,
                "Control de seguridad en las viviendas mediante el desarrollo de un aplicativo con las características necesarias para tener un mejor control de lo que pasa en nuestras viviendas bajo el uso de todo tipo de sensores."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_37,
                "GeniusTec es una aplicación digital que brinda resúmenes cortos, información sintetizada del temario de los estudiantes de Tecsup, buscando así generar conocimientos previos de cada tema en específico antes de cada clase, además incorporará la posibilidad de compartir apuntes y una sección de preguntas frecuentes para aclarar dudas."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_75,
                "Es una aplicación web donde se muestre y venda todo tipo de componentes tecnológicos."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_78,
                "TuHogar: Es una plataforma donde podrás obtener una gran experiencia para poder encontrar en dónde gustaría vivir cuenta con departamento en alquiler o ventas variados en todo el PERÚ."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_4,
                "TuBodega.pe: Es una app la cual ayuda usuario a poder encontrar una bodega cerca de su localización la cual se mostrará en un mapa los puntos más cercanos."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_76,
                "Adoptame.pe: Es una aplicación móvil acompañada con una página web, con la finalidad de buscarles un hogar a animales que han sido abandonados y postear en caso de pérdidas."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_74,
                "App web para cadena de restaurantes en el que se podrán hacer pedidos desde su mesa usando la app (cada mesa tendrá su código QR relacionado a el número de la mesa para que el mozo sepa a qué mesa se le entregará el pedido)."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_73,
                "Aplicación y Web en modo (Restaurant), además de la ubicación sobre la tienda física. Administración de datos del producto, datos del cliente y consumos recientes."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_71,
                "AlohaHome es una aplicación que tiene como finalidad facilitar la búsqueda, compra, venta y alquiler de propiedades."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_70,
                "Rutrux: es una herramienta móvil la cual permite a los usuarios del transporte público en Trujillo conocer e identificar las rutas de viaje interurbano para su destino."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_67,
                "Friendship, es un prototipo con detector de voz, con el fin de reducir el bullying en el Perú."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_68,
                "Happy user es un aplicativo de seguimiento estudiantil, que busca garantizar la integridad y el desarrollo adecuado de los escolares."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_66,
                "Una aplicación web que se enfoque en monitorear a los estudiantes de secundaria de manera anónima y segura."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_54,
                "Nuestra aplicación está dirigida a velar por las necesidades, cuidados y atenciones de las mascotas."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_40,
                "Una aplicación para web y móvil que ofrece diferentes funcionalidades según el dispositivo."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_83,
                "Es un aplicativo de comida rápida que vende hamburguesas y pizzas, la cual tiene como finalidad que los usuarios hagan pedidos de manera virtual."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_82,
                "Es una aplicación que administra las reservas que realizan los clientes, indicando la mesa en donde están los clientes, los alimentos y bebidas que solicitan."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_86,
                "Dicho programa tiene como finalidad ayudar a las empresas a poder mejorar y facilitar el proceso de selección de personal."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_81,
                "Una página web que se encarga de administrar una plataforma de estudios para una institución educativa enfocada a dar cursos a un público diverso."
            )
        )
        originalItems.add(
            Item(
                R.drawable.imagen_80,
                "NoTriTol es un sistema el cual administrará y gestionará los negocios de las MYPES y además informará de las últimas noticias de economía."
            )
        )


        // Inicializar la lista filtrada con todos los datos
        filteredItems = ArrayList(originalItems)

        // Configurar el adaptador con los datos iniciales
        adapter = filtros2(filteredItems)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Agregar listener para la búsqueda
        searchField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                filterData(s.toString(), originalItems)
            }

            override fun afterTextChanged(s: Editable) {}
        })
    }

    private fun filterData(query: String, originalItems: List<Item>) {
        filteredItems!!.clear()
        for (item in originalItems) {
            if (item.description.lowercase(Locale.getDefault())
                    .contains(query.lowercase(Locale.getDefault()))
            ) {
                filteredItems!!.add(item)
            }
        }
        adapter!!.notifyDataSetChanged()
    }
}
