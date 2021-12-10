package ejer4cPuntoGeometrico;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
        
        PuntoGeometrico punto1=new PuntoGeometrico(3,13);
        System.out.println(punto1);
        
        PuntoGeometrico punto2=new PuntoGeometrico(1,12);
        System.out.println(punto2);
        
        punto1.setX(8);
        System.out.println(punto1);

    }
}
