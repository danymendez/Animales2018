package com.example.vicente.animales2018.dummy;

import com.example.vicente.animales2018.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        String[] nombre = {
                "mis datos",
                "aguila",
                "caballo",
                "cangrejo",
                "conejo",
                "delfin",
                "gato",
                "pajaro",
                "perro",
                "Serpiente"
        };
        String[] descripcion = {
                "Nombre: Daniel Enrique Méndez Palacios Carnet: 2506952013",
                "Águila es el nombre dado a las mayores aves depredadoras. ... Como todas las aves de presa, las águilas poseen un pico grande, poderoso y puntiagudo para desprender la carne de su presa.",
                "El caballo es un mamífero cuadrúpedo, perisodáctilo, perteneciente a la familia de los équidos. ... A la hembra de los caballos se la denomina yegua, a la cría de caballo-yegua.",
                "Se llama cangrejos a diversos crustáceos del orden de los decápodos. Este orden, caracterizado por tener cinco pares de patas, incluye a los crustáceos de mayor tamaño, como langostas, gambas y camarones.",
                "Tiene orejas largas de hasta 7 cm las cuales le ayudan a regular la temperatura del cuerpo y una cola muy corta. Sus patas anteriores son más cortas que las posteriores.",
                "Los delfines son mamíferos acuáticos que viven en casi todos los mares del planeta. Su cuerpo es alargado con una aleta dorsal y dos laterales que cambian de forma y tamaño según la especie.",
                "El gato doméstico es un animal pequeño, principalmente carnívoro (Felis catus), que pertenece a la familia de los Felinos. ... Como casi todos los miembros de la familia felina, el gato doméstico tiene uñas retráctiles, buen oído y olfato, una notable visión nocturna y un cuerpo compacto, musculoso y muy flexible.",
                "Definición de pájaro. ... Además pueden emitir sonidos agradables; es por esto último que muchas veces se los menciona como pájaros cantores o aves de percha. Cabe mencionar que poseen un pico córneo sin dientes.",
                "El perro es un animal mamífero y cuadrúpedo que fue domesticado hace unos 10.000 años y que, actualmente, convive con el hombre como una mascota. Su nombre científico es Canis lupus familiaris.",
                "Las serpientes se caracterizan por la ausencia de extremidades. Algunas poseen mordeduras venenosas que utilizan para matar a sus presas antes de ingerirlas.",
        };
       final Integer[] imagen = {
               R.drawable.perfilapp,
                R.drawable.aguila,
                R.drawable.caballo,
                R.drawable.cangrejo,
                R.drawable.conejo,
                R.drawable.delfin,
                R.drawable.gato,
                R.drawable.pajaro,
                R.drawable.perro,
                R.drawable.serpiente,
        };
        for(int i=0; i< nombre.length; i++){
            ITEMS.add ( new DummyItem ( (i+1), nombre[i], descripcion[i], imagen[i] ) );
            ITEM_MAP.put ( String.valueOf ( i+1 ), new DummyItem ( (i+1), nombre[i], descripcion[i], imagen[i] ) );
        }
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder ();
        builder.append ( "Details about Item: " ).append ( position );
        for (int i = 0; i < position; i++) {
            builder.append ( "\nMore details information here." );
        }
        return builder.toString ();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final int id;
        public final String nombre;
        public final String descripcion;
        public final Integer imagen;

        public DummyItem(int Id, String Nombre, String Descripcion, Integer Imagen) {
            this.id = Id;
            this.nombre = Nombre;
            this.descripcion = Descripcion;
            this.imagen = Imagen;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
}
