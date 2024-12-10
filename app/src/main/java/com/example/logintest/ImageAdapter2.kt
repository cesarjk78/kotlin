package com.example.logintest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter2 : RecyclerView.Adapter<ImageAdapter2.ImageViewHolder>() {
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
        "GeniusTec es una aplicación digital que brinda resúmenes cortos, información sintetizada del temario de los estudiantes de Tecsup, buscando así generar conocimientos previos de cada tema en específico antes de cada clase, además incorporara la posibilidad de compartir apuntes y una sección de preguntas frecuentes para aclarar dudas.",
        "Es una aplicación web donde se muestre y venda todo tipo de componentes tecnologicos.",
        "TuHogar : Es una plataforma donde podrás obtener una gran experiencia para poder encontrar en dónde gustaría  vivir  cuenta con departamento en alquiler o ventas variados en todo el PERÚ   , la cual esta plataforma te permitirá en  observar en tiempo real(tipo streaming en vivo)  muy detalladamente habitaciones,baños,salas,cocina,etc; pero previamente el cliente debe realizar una cita con el proveedor para poder entrar al streaming y navegar todo el area que ofrece el departamento.",
        "TuBodega.pe : Es una app la cual ayuda usuario a poder encontrar \\r\\nuna bodega cerca de su localización la cual se mostrará en un mapa los \\r\\npuntos más cercanos. Ademas los usuarios registrados en la app\\r\\npueden agregar una bodega, junto con ello podemos darle una etiqueta \\r\\nde que se puede encontrar en la bodega (agente de banco, \\r\\nrecarga de saldo u otros) y el poder calificar estas bodegas siendo estas\\r\\nadministradas por el propietario (una vez verificado)  o la misma app.",
        "Adoptame.pe: Es una aplicacion movil acompañada con una pagina web, con la finalidad de buscarles un hogar a animales que han sido abandonados y postear en caso de perdidas las cuales se encontraran en su respectivo apartado. Nuestra meta es asociarnos con empresas que comparten nuestra vision sobre el cuidado de los animales ayudandonos con ciertas colaboraciones y donando para poder mejorar la aplicacion cada vez màs. Nuestras apps estaran disponibles para todos y sera muy facil de manejar pues se trata de un formato de vista y agregar contenido.",
        "App web para cadena de restaurante en el que se podran hacer pedidos desde su mesa usando la app (cada mesa tendra su codigo QR relacionada a el numero de la mesa para que el moso sepa a que mesa se le entregara el pedido), pedidos a domicilio y se podra ver el menu y promociones en tiempo real",
        "Aplicación y Web en modo(Restaurant), ademas de la úbicacion sobre la tienda fisica. Administración de datos del producto, datos del cliente, gustos del cliente por recientes consumos.",
        "AlohaHome es una aplicación que tiene como finalidad facilitar la búsqueda, compra, venta y alquiler de propiedades, permitiendo así que distintas personas en el país puedan realizar una búsqueda simple, eficiente y económica de propiedades en las que estén interesados. Así como realizar la venta de sus propiedades, ponerlas en alquiler, o arrendarlas de manera temporal según su conveniencia y situación. La aplicación se encuentra disponible tanto de manera web como en móviles, de tal manera que los usuarios puedan realizar un seguimiento de las propiedades en cualquier momento dado del día.",
        "Rutrux: es una herramienta móvil la cual permite a los usuarios del transporte público en Trujillo (El Porvenir, La Esperanza, Florencia de Mora, entre otros) conocer e identificar las rutas de viaje interurbano para su destino, RuTrux te indicará que numero y/o letra de bus se debe tomar y de que empresa es dicho bus junto a su ruta correspondiente.",
        "Friendship, es un prototipo con detector de voz, con el fin de reducir el bullying en el Perú .",
        "Happy user es un aplicativo de seguimiento estudiantil, que busca garantizar la integridad y el desarrollo adecuado de los escolares manteniendo un control de su entorno para así poder evitar el maltrato físico y verbal dentro de sus centros de estudio.",
        "Una aplicacion web que se enfoque en monitorear a los estudiantes de secundaria de manera  anonima y segura, con el fin de mantener la seguridad de los reportes de la persona en anonimato.",
        "Nuestra aplicación está dirigida a velar por las necesidades, cuidados y atenciones de los engreídos de la casa (las mascotas). Con esta aplicación podrás lleva el control del día a día tales como: apuntar visitas al veterinario más cercano a tu localidad, las desparasitaciones, vacunas, posibles alergias , utensilios y objetos para tu mascota.",
        "Una aplicación para web y móvil que ofrece diferentes funcionalidades según el dispositivo. En la versión web, se realizan preguntas para evaluar el estado de ánimo y el nivel de estrés, ayudando a identificar casos de bullying. En smartphones, se monitorea al usuario mediante preguntas interdiarias, utilizando inteligencia artificial para simular una conversación real y facilitar la interacción. Además, se incorporará un dispositivo para medir elementos relevantes del usuario, permitiendo un diagnóstico más preciso. Los resultados se enviarán al tutor del usuario para su seguimiento.",
        "Es un aplicativo de comida rapida que vende hamburguesas y pizzas, la cual tiene como finalidad que los usuarios hagan pedidos de manera virtual ya que incluye con el servicio de delivery",
        "Es una aplicacion que administra las reservas que realizan los clientes, indicando la mesa en donde están los clientes, los alimentos y bebidas que solicitan todo referente al hostal King Panther. Dicha aplicacion contará con una página web, y tambien con una app móvil para que el cliente pueda iniciar sesión, verificar y/o seleccionar lo mencionado previamente.",
        "Dicho programa tiene como finalidad ayudar a las empresas a poder mejorar y facilitar el proceso de selección de personal para el área que se necesite, dando su mejor opción.",
        "Una página web que se encarga de administrar una plataforma de estudios para una  institución educativa enfocada a dar cursos a un publico diverso.",
        "NoTriTol es un sistema el cual administrará y gestionará los negocios de las MYPES y además informará de las ultimas noticias de economia, alza de productos y todo relacionado sobre el tipo de negocio de la empresa con la cual trabajaremos."


    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
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
