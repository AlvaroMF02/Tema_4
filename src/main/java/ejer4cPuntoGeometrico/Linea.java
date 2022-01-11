package ejer4cPuntoGeometrico;

import java.util.Scanner;

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
    
//     public Linea(PuntoGeometrico puntoA,PuntoGeometrico puntoB) {
//        this.puntoA= puntoA;
//        this.puntoB= puntoB;
//    }
   
    //METODOS----------------------------------------------
    
      public mueveDerecha(int x){
          
          
         
        return x;
      }
    
      public mueveIzquierda(int x){
          
          
         
        return x;
      }
      
      
      public mueveArriba(int y){
          
          
         
        return y;
      }
      
      
      public mueveAbajo(int y){
          
          
         
        return y;
      }
      

      
    //---------------------------------------------------
    // GET y SET

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }
    //----------------------------------------------------
    //too String

    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }
    
    
}
