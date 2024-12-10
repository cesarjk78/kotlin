package com.example.logintest;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Filtersh extends AppCompatActivity {

    private filtres2 adapter;
    private List<itemsh> filteredItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtresh);

        // Referencias a los elementos del layout
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        EditText searchField = findViewById(R.id.searchField);

        // Datos iniciales con imágenes y descripciones
        List<itemsh> originalItems = new ArrayList<>();
        originalItems.add(new itemsh(R.drawable.imagen_7, "Online store for computer components - WEB/Mobile."));
        originalItems.add(new itemsh(R.drawable.imagen_48, "Tecfood Reservations is an exclusive application designed for the Tecsup community, offering a convenient and efficient solution for meal reservations at campus facilities."));
        originalItems.add(new itemsh(R.drawable.imagen_14, "An application offering short and concise lessons on a wide range of topics, designed for learning in brief periods of time."));
        originalItems.add(new itemsh(R.drawable.imagen_72, "Our project involves creating a web and mobile application for the small business VitaMarket, currently selling natural and organic products digitally through social media in the city of Trujillo."));
        originalItems.add(new itemsh(R.drawable.imagen_47, "VirtualGym will be a platform that helps many people in various aspects, whether physically or emotionally."));
        originalItems.add(new itemsh(R.drawable.imagen_23, "Our program is based on a user-friendly mobile application that allows citizens to report risky situations or crime instantly. This information is processed in real-time and used to send alerts to all users nearby the incident's location. It also integrates an advanced geolocation system showing a real-time map with incident and identified criminal locations by sectors."));
        originalItems.add(new itemsh(R.drawable.imagen_25, "ClimaTec is a software that aims to inform people about natural phenomena and how they affect individuals, as well as which areas are affected and their temperatures."));
        originalItems.add(new itemsh(R.drawable.imagen_16, "It's a software designed to facilitate buying and selling new or used items among the Tecsup community, promoting economic and environmental well-being."));
        originalItems.add(new itemsh(R.drawable.imagen_17, "Tecfood Reservations is an exclusive application for the Tecsup community, providing a convenient and efficient solution for meal reservations at campus facilities. With a friendly interface and customized features, Tecfood Reservations streamlines the reservation process, ensuring a smooth and satisfying dining experience for students, faculty, and staff."));
        originalItems.add(new itemsh(R.drawable.imagen_77, "Emotion recognition app through facial mannerisms that provides tips for each situation when an emotion is displayed."));
        originalItems.add(new itemsh(R.drawable.imagen_85, "La Tia Veneno® is a SPA (Single Page Application) web app for the Peruvian restaurant chain \"La Tia Veneno\", featuring different food categories and menu listings for each. Customers can select their meals, view them in the cart, and complete the order with a virtual payment method."));
        originalItems.add(new itemsh(R.drawable.imagen_87, "It's a program related to citizen security in a district, responsible for sending alerts via a mobile application and displaying a mapping of criminals by sectors on a website."));
        originalItems.add(new itemsh(R.drawable.imagen_84, "It's a web app whose goal is to confirm attendance to classes and events organized on-site by Tecsup students, and to track all their attendances."));
        originalItems.add(new itemsh(R.drawable.imagen_88, "It's an e-commerce platform selling clothing and accessories related to the 2022 Qatar World Cup."));
        originalItems.add(new itemsh(R.drawable.imagen158, "Home security control through an application with necessary characteristics for better monitoring of what happens in our homes using all types of sensors."));
        originalItems.add(new itemsh(R.drawable.imagen_37, "GeniusTec is a digital application that provides short summaries and synthesized information of Tecsup students' syllabus, aiming to generate preliminary knowledge on each specific topic before classes. It will also include the ability to share notes and a frequently asked questions section."));
        originalItems.add(new itemsh(R.drawable.imagen_75, "It's a web application showcasing and selling all types of technological components."));
        originalItems.add(new itemsh(R.drawable.imagen_78, "TuHogar: A platform where you can get a great experience in finding a place to live with varied rental or sales options across Peru."));
        originalItems.add(new itemsh(R.drawable.imagen_4, "TuBodega.pe: An app that helps users find a nearby store, displayed on a map of the closest locations."));
        originalItems.add(new itemsh(R.drawable.imagen_76, "Adoptame.pe: A mobile application accompanied by a website, aimed at finding homes for abandoned animals and posting in case of losses."));
        originalItems.add(new itemsh(R.drawable.imagen_74, "Web app for a restaurant chain where orders can be made from the table using the app (each table has a QR code linked to the table number for the server to know which table the order will be delivered to)."));
        originalItems.add(new itemsh(R.drawable.imagen_73, "Application and website (Restaurant mode), as well as location data for the physical store. Product data management, customer data, and recent consumption."));
        originalItems.add(new itemsh(R.drawable.imagen_71, "AlohaHome is an application aimed at simplifying property search, purchase, sale, and rental."));
        originalItems.add(new itemsh(R.drawable.imagen_70, "Rutrux: A mobile tool that allows public transport users in Trujillo to identify interurban travel routes for their destination."));
        originalItems.add(new itemsh(R.drawable.imagen_67, "Friendship: A voice detection prototype aimed at reducing bullying in Peru."));
        originalItems.add(new itemsh(R.drawable.imagen_68, "Happy user is a student tracking app aimed at ensuring the proper integrity and development of students."));
        originalItems.add(new itemsh(R.drawable.imagen_66, "A web application focused on monitoring high school students in an anonymous and safe manner."));
        originalItems.add(new itemsh(R.drawable.imagen_54, "Our application is aimed at ensuring the needs, care, and attention of pets."));
        originalItems.add(new itemsh(R.drawable.imagen_40, "A web and mobile application offering different functionalities according to the device."));
        originalItems.add(new itemsh(R.drawable.imagen_83, "It's a fast food app selling hamburgers and pizzas, allowing users to place virtual orders."));
        originalItems.add(new itemsh(R.drawable.imagen_82, "It's an application that manages customer reservations, indicating the table where customers are, the foods, and beverages they order."));
        originalItems.add(new itemsh(R.drawable.imagen_86, "This program aims to help companies improve and facilitate the personnel selection process."));
        originalItems.add(new itemsh(R.drawable.imagen_81, "A website that manages a study platform for an educational institution focused on providing courses to a diverse audience."));
        originalItems.add(new itemsh(R.drawable.imagen_80, "NoTriTol is a system that manages and manages the business of micro and small enterprises (MYPES) and also informs about the latest economic news."));


        // Inicializar la lista filtrada y el adaptador
        filteredItems = new ArrayList<>(originalItems);
        adapter = new filtres2(filteredItems);

        // Configuración del RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Filtrar datos mientras se escribe en el campo de búsqueda
        searchField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterData(s.toString(), originalItems);
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    // Método para filtrar datos según el texto ingresado
    private void filterData(String query, List<itemsh> originalItems) {
        filteredItems.clear();
        for (itemsh item : originalItems) {
            if (item.getDescription().toLowerCase().contains(query.toLowerCase())) {
                filteredItems.add(item);
            }
        }
        adapter.notifyDataSetChanged();
    }
}
