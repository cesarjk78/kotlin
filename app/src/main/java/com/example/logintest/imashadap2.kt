package com.example.logintest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class imashadap2 : RecyclerView.Adapter<imashadap2.ImageViewHolder>() {
    // Lista de imágenes
    private val images = intArrayOf(
        R.drawable.imagen_37,
        R.drawable.imagen_75,
        R.drawable.imagen_78,
        R.drawable.imagen_4,
        R.drawable.imagen_76,
        R.drawable.imagen_74,
        R.drawable.imagen_73,
        R.drawable.imagen_71,
        R.drawable.imagen_70,
        R.drawable.imagen_67,
        R.drawable.imagen_68,
        R.drawable.imagen_66,
        R.drawable.imagen_54,
        R.drawable.imagen_40,
        R.drawable.imagen_83,
        R.drawable.imagen_82,
        R.drawable.imagen_86,
        R.drawable.imagen_81,
        R.drawable.imagen_80
    )

    // Descripciones correspondientes a las imágenes
    private val descriptions = arrayOf(
        "GeniusTec is a digital application that provides short summaries and synthesized information on Tecsup students' syllabus, aiming to generate prior knowledge of each specific topic before each class. It also incorporates the ability to share notes and a FAQ section to clarify doubts.",
        "It is a web application where all kinds of technological components are displayed and sold.",
        "TuHogar: A platform where you can have a great experience finding a place you'd like to live. It offers a variety of apartments for rent or sale across Peru. This platform allows real-time viewing (live streaming) of rooms, bathrooms, living rooms, kitchens, etc., but the client must schedule an appointment with the provider to access the streaming and explore the offered area.",
        "TuBodega.pe: An app that helps users find a nearby convenience store, displaying the closest points on a map. Additionally, registered users can add stores, tag them with services available (bank agents, balance top-ups, etc.), and rate them. These stores can be managed by their owners (once verified) or by the app itself.",
        "Adoptame.pe: A mobile application accompanied by a website aimed at finding homes for abandoned animals and posting cases of lost pets, organized in respective sections. Our goal is to partner with companies that share our vision of animal care, helping with collaborations and donations to continuously improve the application. Our apps will be available to everyone and will be very user-friendly, focusing on content viewing and adding.",
        "A web app for a restaurant chain where customers can place orders from their tables using the app (each table will have a QR code linked to the table number, so the waiter knows where to deliver the order), order deliveries, and view the menu and promotions in real-time.",
        "An application and website in 'Restaurant' mode, along with the physical store's location. It includes product data management, customer data, and customer preferences based on recent consumption.",
        "AlohaHome is an application designed to facilitate the search, purchase, sale, and rental of properties, allowing people across the country to perform a simple, efficient, and economical property search. It also enables users to sell, rent, or lease properties temporarily based on their convenience and situation. The application is available as both a web and mobile version, allowing users to track properties at any time of the day.",
        "Rutrux: A mobile tool that allows public transport users in Trujillo (El Porvenir, La Esperanza, Florencia de Mora, etc.) to identify interurban travel routes to their destination. RuTrux will indicate the number and/or letter of the bus to take and its corresponding company along with its route.",
        "Friendship is a prototype with voice detection, aiming to reduce bullying in Peru.",
        "Happy User is a student monitoring application designed to guarantee the integrity and proper development of students by controlling their environment to prevent physical and verbal abuse in schools.",
        "A web application focused on anonymously and securely monitoring high school students to ensure the safety of report anonymity.",
        "Our application is designed to meet the needs, care, and attention of household pets. With this application, you can track daily activities such as scheduling visits to the nearest veterinarian, deworming, vaccinations, potential allergies, and essential items for your pet.",
        "A web and mobile application offering different functionalities depending on the device. On the web version, users answer questions to assess their mood and stress levels, helping identify cases of bullying. On smartphones, users are monitored with inter-daily questions, utilizing artificial intelligence to simulate real conversations for easier interaction. Additionally, a device will measure relevant user elements, allowing for a more accurate diagnosis. The results will be sent to the user's tutor for follow-up.",
        "A fast-food app selling burgers and pizzas, enabling users to place orders virtually, including delivery services.",
        "An application that manages customer reservations, indicating their table, food, and drinks ordered—all related to the King Panther hostel. This application will have both a web page and a mobile app so that customers can log in, verify, and/or select the mentioned options.",
        "This program aims to help companies improve and simplify the personnel selection process for the required area, offering the best options.",
        "A website managing a study platform for an educational institution focused on providing courses to a diverse audience.",
        "NoTriTol is a system designed to manage and oversee SME businesses. It also informs about the latest economic news, product price increases, and all related business updates for the companies we work with."


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
