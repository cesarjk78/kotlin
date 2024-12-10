package com.example.logintest

import java.util.Random

object popular {
    // Lista de descripciones de proyectos
    private val descriptions = arrayOf(
        "Tienda Online WEB/Móvil de Componentes para computadora",
        "Tecfood Reservas es una aplicación exclusiva diseñada para la comunidad de Tecsup...",
        "Una aplicación que ofrece lecciones cortas y concisas sobre una amplia variedad de temas...",
        "Nuestro proyecto se basa en la creación de una aplicación web y móvil para la pequeña empresa VitaMarket...",
        "VirtualGym será una plataforma que ayude a muchas personas en varios aspectos, ya sea física o emocionalmente...",
        "Nuestro programa se basa en una aplicación móvil intuitiva para reportar situaciones de riesgo o delincuencia...",
        "ClimaTec es un software que busca informar sobre fenómenos naturales y su impacto en la población...",
        "Es un software diseñado para facilitar la compra y venta de artículos nuevos o usados entre miembros de la comunidad Tecsup...",
        "Aplicación para reconocimiento de emociones faciales y brindar recomendaciones...",
        "La Tia Veneno® es una app web SPA de la cadena de restaurantes peruana 'La Tia Veneno'...",
        "Aplicación móvil para seguridad ciudadana que muestra alertas y un mapa de delincuentes...",
        "Aplicación para confirmar asistencia a clases y eventos de Tecsup...",
        "Plataforma E-commerce para venta de ropa y accesorios deportivos relacionados al mundial Qatar 2022...",
        "Control de seguridad en viviendas mediante sensores..."
    )

    // Lista de imágenes
    private val images = intArrayOf(
        R.drawable.imagen_7, R.drawable.imagen_48, R.drawable.imagen_14,
        R.drawable.imagen_72, R.drawable.imagen_47, R.drawable.imagen_23,
        R.drawable.imagen_25, R.drawable.imagen_16, R.drawable.imagen_17,
        R.drawable.imagen_77, R.drawable.imagen_85, R.drawable.imagen_87,
        R.drawable.imagen_84, R.drawable.imagen_88, R.drawable.imagen158,
    )

    val randomDescription: String
        // Método para obtener una descripción aleatoria
        get() {
            val random = Random()
            val randomIndex = random.nextInt(descriptions.size)
            return descriptions[randomIndex]
        }

    val randomImage: Int
        // Método para obtener una imagen aleatoria
        get() {
            val random = Random()
            val randomIndex = random.nextInt(images.size)
            return images[randomIndex]
        }
}
