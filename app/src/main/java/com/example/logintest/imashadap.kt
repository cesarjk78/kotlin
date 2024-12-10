package com.example.logintest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class imashadap : RecyclerView.Adapter<imashadap.ImageViewHolder>() {
    // Lista de imágenes
    private val images = intArrayOf(
        R.drawable.imagen_7,
        R.drawable.imagen_48,
        R.drawable.imagen_14,
        R.drawable.imagen_72,
        R.drawable.imagen_47,
        R.drawable.imagen_23,
        R.drawable.imagen_25,
        R.drawable.imagen_16,
        R.drawable.imagen_17,
        R.drawable.imagen_77,
        R.drawable.imagen_85,
        R.drawable.imagen_87,
        R.drawable.imagen_84,
        R.drawable.imagen_88,
        R.drawable.imagen158
    )

    // Descripciones correspondientes a las imágenes
    private val descriptions = arrayOf(
        "Online  Store for Computer Components (WEB/Mobile)",
        "Tecfood Reservations is an exclusive application designed for the Tecsup community, offering a convenient and efficient solution for reserving meals on campus. With a user-friendly interface and customized features, Tecfood Reservations simplifies the reservation process, ensuring a seamless and satisfying dining experience for students, professors, and administrative staff.",
        "An application offering short and concise lessons on a wide variety of topics (created and uploaded by users), designed for quick learning during short time periods. It could include formats like images, mini quizzes, documents, and short educational videos. Community feedback and ratings will play a crucial role.",
        "Our project is based on the creation of a web and mobile application for the small company VitaMarket, which currently sells natural and organic products digitally through social media in the city of Trujillo. This micro-company has chosen to acquire its own web application to expand its customer base, so an e-commerce application will be developed to achieve this goal.",
        "VirtualGym will be a platform that helps many people in various aspects, whether physically or emotionally.",
        "Our program is based on an intuitive and easy-to-use mobile application that allows citizens to report risk or crime situations instantly. This information is processed in real-time and is used to send alerts to all users near the incident's location. Additionally, the program integrates an advanced geolocation system that displays a real-time map showing the location of incidents and criminals identified by sectors.",
        "ClimaTec is software designed to inform people about natural phenomena and how they affect individuals, as well as identifying the areas affected and their respective temperatures.",
        "It is software designed to facilitate the buying and selling of new or used items among Tecsup community members, promoting the economic and environmental well-being of our institution's members.",
        "Tecfood Reservations is an exclusive application designed for the Tecsup community, offering a convenient and efficient solution for reserving meals on campus. With a user-friendly interface and customized features, Tecfood Reservations simplifies the reservation process, ensuring a seamless and satisfying dining experience for students, professors, and administrative staff.",
        "An app for facial emotion recognition that provides tips for each situation based on detected emotions.",
        "La Tia Veneno® is a web SPA (Single Page Application) for the Peruvian restaurant chain 'La Tia Veneno', where different food categories and menus will be displayed. Customers can select the meals they want to order, view them in the shopping cart, and complete the process with a virtual payment method.",
        "It is a program related to the citizen security of a district, responsible for sending an alert through a mobile application and displaying a mapping of criminals by sectors on a website.",
        "It is a web application whose purpose is for Tecsup students to confirm their attendance to classes and events held in person, as well as track all their attendances.",
        "It is an e-commerce web platform for selling clothing and sports accessories related to the Qatar 2022 World Cup.",
        "Home security control through the development of an application with the necessary features to better monitor what happens in our homes using all types of sensors."
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemsh_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position])
        holder.textView.text = descriptions[position]
    }

    override fun getItemCount(): Int {
        return images.size
    }

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.imageView)
        var textView: TextView = itemView.findViewById(R.id.textView)
    }
}
