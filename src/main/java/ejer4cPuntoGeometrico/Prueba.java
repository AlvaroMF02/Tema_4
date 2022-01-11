package ejer4cPuntoGeometrico;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        double movida; //guarda cuanto moverá los puntos de la linea
        
        PuntoGeometrico punto1=new PuntoGeometrico(3,13);
        System.out.println(punto1);
        
        PuntoGeometrico punto2=new PuntoGeometrico(1,12);
        System.out.println(punto2);
        
        punto1.setX(8);
        System.out.println(punto1);
        
        //prueba con mueveDerecha
        System.out.println("La línea se moverá a la derecha los puntos que deseé");
        movida=teclado.nextDouble();
    }
}
