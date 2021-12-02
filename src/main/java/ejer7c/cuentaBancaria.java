package ejer7c;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class cuentaBancaria {

    private String numCuenta;
    private String nif;
    private String nombre;
    private double saldoActual;
    private double interesAnual;
   
    
    
    public cuentaBancaria(String numCuenta, String nif, String nombre, double saldoActual, double interesAnual) {
        this.numCuenta = numCuenta;
        this.nif = nif;
        this.nombre = nombre;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
        
        //asigna 20 numeros aleatorios
        this.numCuenta=RandomStringUtils.randomNumeric(15).toUpperCase();
        
        if(this.interesAnual<0 || this.interesAnual>3){
            System.out.println("El interés debe estar entre 0 y 3");
        }
    }

    public cuentaBancaria(String nif, String nombre, double saldoActual, double interesAnual) {
        this.nif = nif;
        this.nombre = nombre;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
        
    //numeros random
        this.nif=RandomStringUtils.randomNumeric(9).toUpperCase();
        this.nombre=RandomStringUtils.randomNumeric(15).toUpperCase();
//        this.saldoActual=RandomDoubleUtils.randomNumeric(15).toUpperCase();
//        this.interesAnual=RandomStringUtils.randomNumeric(15).toUpperCase();
//        
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        if(this.interesAnual<0 || this.interesAnual>3){
            System.out.println("El interés debe estar entre 0 y 3");
        }
        this.interesAnual = interesAnual;
    }

    
    public double ingresarIntereses(){
        this.saldoActual = this.saldoActual + (this.interesAnual * this.saldoActual);
        return this.saldoActual;
    }
    
    public double ingresarDinero(double cantidad){
        cantidad=12000;
        this.saldoActual+=cantidad;
        return this.saldoActual;
    }
    
    public double retirarDinero(double cantidad){
        cantidad=12000;
        this.saldoActual-=cantidad;
        return this.saldoActual;
    }
    
    @Override
    public String toString() {
        return "Número de cuenta=" + numCuenta + "\n NIF=" + nif + "\n Nombre=" + nombre + "\n Saldo actual=" + saldoActual + "\n Interés anual=" + interesAnual;
    }

    
    
}
