package ejer4cPuntoGeometrico;
/**
 *
 * @author alvaro
 */
public class Linea {
    
    //---------------------------------------------------
    
    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    
    //---------------------------------------------------
    
    public Linea(PuntoGeometrico punto1, PuntoGeometrico punto2) {
        punto1= new PuntoGeometrico(0,0);
        punto2= new PuntoGeometrico(1,1);
    }
    
     public Linea( double puntoA, double puntoB) {
        this.puntoA= puntoA;
        this.puntoB= puntoB;
    }
    
    
    
    //---------------------------------------------------
}
