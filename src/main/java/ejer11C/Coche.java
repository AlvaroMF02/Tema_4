package ejer11C;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Coche {
    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    private Rueda ruedaDelantIzq;
    private Rueda ruedaDelantDer;
    private Rueda ruedaTraseraIzq;
    private Rueda ruedaTraseraDer;
    
    private ArrayList<Rueda> listaRueda;    //puede hacer que las cuatro ruedas se queden en un array
                                            //no haria falta escribir tanto, es como un array

    public Coche(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, Rueda ruedaDelantIzq, Rueda ruedaDelantDer, Rueda ruedaTraseraIzq, Rueda ruedaTraseraDer) {
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.ruedaDelantIzq = ruedaDelantIzq;
        this.ruedaDelantDer = ruedaDelantDer;
        this.ruedaTraseraIzq = ruedaTraseraIzq;
        this.ruedaTraseraDer = ruedaTraseraDer;
    }
    
    
    //constructor vacio que deja todo a null si no se escribe nada
    
    public Coche(){
        
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public Rueda getRuedaDelantIzq() {
        return ruedaDelantIzq;
    }

    public void setRuedaDelantIzq(Rueda ruedaDelantIzq) {
        this.ruedaDelantIzq = ruedaDelantIzq;
    }

    public Rueda getRuedaDelantDer() {
        return ruedaDelantDer;
    }

    public void setRuedaDelantDer(Rueda ruedaDelantDer) {
        this.ruedaDelantDer = ruedaDelantDer;
    }

    public Rueda getRuedaTraseraIzq() {
        return ruedaTraseraIzq;
    }

    public void setRuedaTraseraIzq(Rueda ruedaTraseraIzq) {
        this.ruedaTraseraIzq = ruedaTraseraIzq;
    }

    public Rueda getRuedaTraseraDer() {
        return ruedaTraseraDer;
    }

    public void setRuedaTraseraDer(Rueda ruedaTraseraDer) {
        this.ruedaTraseraDer = ruedaTraseraDer;
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + 
        ", puertaCopiloto=" + puertaCopiloto + ", ruedaDelantIzq=" + ruedaDelantIzq + 
        ", ruedaDelantDer=" + ruedaDelantDer + ", ruedaTraseraIzq=" + ruedaTraseraIzq + 
        ", ruedaTraseraDer=" + ruedaTraseraDer + '}';
    }
    
    
    
}
