package ejer8cCafetera;


//Partes de una clase:

//-DEFINICIÓN
public class Cafetera {
    
//-ATRIBUTOS/CAMPOS
    private double capacidadMaxima;
    private double cantidadActual;
    
    
    
//--CONSTRUCTOR
    
    public Cafetera() {
        this.capacidadMaxima=1000;
        this.cantidadActual=0;
    }
          
    
    
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima=capacidadMaxima;
        if(capacidadMaxima<10){
            this.capacidadMaxima=10;
        }
        this.capacidadMaxima=this.cantidadActual;
    }
  
    
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima=capacidadMaxima;
        
        if(capacidadMaxima<10){
            this.capacidadMaxima=10;
        }
        
        this.cantidadActual=cantidadActual;
        
        if(this.cantidadActual>this.capacidadMaxima){
            this.cantidadActual=this.capacidadMaxima;
        }
    }
    
    
    
//--GETTER Y SETTER
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    
    
    
    
    
    
//-METODOS    
    public void llenarCafetera(int capacidadMaxima){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    public void servirTaza(double cantidadAServir){
        double cantidadPositiva = Math.abs(cantidadAServir); //math hace cualquier cantidad positiva
        
        if(cantidadPositiva>this.cantidadActual){
            this.cantidadActual=0;
        }else{
             this.cantidadActual-=cantidadPositiva;
        }
    }
    
    public void vaciarCafetera(int canti){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
