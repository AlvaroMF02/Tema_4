package ejer10cCancion;

/**
 *
 * @author alvaro
 */
public class Prueba {

    public static void main(String[] args) {

        Cancion prueba;
        prueba = new Cancion("blblbl", "oaoaoao");

        System.out.println("El título de la canción es: " + prueba.getTituloCancion() + "\n"
                + "El autor es:" + prueba.getAutorCancion());

        System.out.println(prueba.toString());
    }

}
