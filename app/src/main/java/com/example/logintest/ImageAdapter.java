package com.example.logintest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    // Lista de imágenes
    private final int[] images = {
            R.drawable.imagen_7, R.drawable.imagen_48, R.drawable.imagen_14,
            R.drawable.imagen_72, R.drawable.imagen_47, R.drawable.imagen_23, R.drawable.imagen_25, R.drawable.imagen_16, R.drawable.imagen_17, R.drawable.imagen_77,
            R.drawable.imagen_85, R.drawable.imagen_87, R.drawable.imagen_84, R.drawable.imagen_88, R.drawable.imagen158
    };

    // Descripciones correspondientes a las imágenes
    private final String[] descriptions = {
            "Tienda Online WEB/Móvil de Componentes para computadora",
            "Tecfood Reservas es una aplicación exclusiva diseñada para la comunidad de Tecsup, ofreciendo una solución conveniente y eficiente para realizar reservas de comidas en las instalaciones del campus. Con una interfaz amigable y funciones personalizadas, Tecfood Reservas simplifica el proceso de reserva, garantizando una experiencia gastronómica fluida y satisfactoria para estudiantes, profesores y personal administrativo.",
            "Una aplicación que ofrece lecciones cortas y concisas sobre una amplia variedad de temas (también realizadas  y subidas por los usuarios), diseñadas para el aprendizaje en breves períodos de tiempo. Podría incluir formatos como imágenes, mini quizzes, documentos, y breves videos educativos. La valoración por parte de la comunidad será importante.",
            "Nuestro proyecto se basa en la creación de una aplicación web y móvil para la pequeña empresa VitaMarket, que actualmente vende productos naturales y orgánicos de forma digital a través de las redes sociales en la ciudad de Trujillo. Esta micro-empresa ha optado por adquirir una aplicación web propia para expandir su rango de clientes, por lo que para lograr tan fin, se desorrollará una aplicación de comercio electrónico.",
            "VirtualGym será una plataforma que ayude a muchas personas en varios aspectos, ya sea física o emocionalmente.",
            "Nuestro programa se basa en una aplicación móvil intuitiva y fácil de usar que permite a los ciudadanos reportar situaciones de riesgo o delincuencia de manera instantánea. Esta información se procesa en tiempo real y se utiliza para enviar alertas a todos los usuarios cercanos a la ubicación del incidente, además, el programa integra un sistema de geolocalización avanzado que muestra un mapa en tiempo real con la ubicación de incidentes y delincuentes identificados por sectores.",
            "ClimaTec es un software que busca informar a las personas acerca de los fenómenos naturales y sepan de qué forma afectan a las personas, así como también en qué zonas afecta y cuales las temperatura en dichas zonas.",
            "Es un software diseñado para facilitar la compra y venta de artículos nuevos o usados entre miembros de la comunidad Tecsup, fomentando el bienestar económico y ambiental de los miembros de nuestra institución.",
            "Tecfood Reservas es una aplicación exclusiva diseñada para la comunidad de Tecsup, ofreciendo una solución conveniente y eficiente para realizar reservas de comidas en las instalaciones del campus. Con una interfaz amigable y funciones personalizadas, Tecfood Reservas simplifica el proceso de reserva, garantizando una experiencia gastronómica fluida y satisfactoria para estudiantes, profesores y personal administrativo.",
            "app de reconocimiento de emociones mediante manera fácial donde si muestra una emoción este mostrará un tip de ayuda para cada situación.",
            "La Tia Veneno® es una app web SPA (Single Page Application) de la cadena de restaurantes peruana \\\"La Tia Veneno\\\", donde se mostrará las diferentes categorias de comida, y las lista de menus de cada una de estas. El cliente podra seleccionar las comidas que pedira, verlo en el carrito de pedidos y efectuar con el metodo de pago virtual.",
            "Es un programa que esta relacionado con la seguridad ciudadana de un Distrito, se encargara de enviar una alerta en un aplicativo movil y mostrar un mapeo de delincuetes por sectores un sitio web.",
            "Es un aplicativo web cuya finalidad es que los alumnos de Tecsup confirmen su asistencia a clases y eventos organizados de manera presencial, además de hacer un seguimiento de todas sus asistencias.",
            "Es una plataforma web  tipo E-commerce de venta de ropa y accesorios deportivos relacionados al mundial Qatar 2022.",
            "Control de seguridad en las viviendas mediante el desarrollo de un aplicativo con las características necesarias para tener un mejor control de lo que pasa en nuestras viviendas bajo el uso de todo tipo de sensores"
    };

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.textView.setText(descriptions[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }


}
