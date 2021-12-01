package ejer8cCafetera;

/**
 *
 * @author alvaro
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    
    //CONSTRUCTOR
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }

  
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    public int llenarCafetera(int capacidadMaxima){
        capacidadMaxima=1000;
     return capacidadMaxima;
    }
    
    public double servirTaza(double cantidadAServir){
        
        this.cantidadActual-=cantidadAServir;
    }
    
}
