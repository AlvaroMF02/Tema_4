package ejer11C;

/**
 *
 * @author alvaro
 */
public class Motor {
    private double cilandrada; //1.4, 2.6 ...
    private boolean estado; //para ver si esta encendido(T) o apagado(F)

    
    //---------------------------------------------------
    public Motor(double cilandrada, boolean estado) {
        this.cilandrada = cilandrada;
        this.estado = estado;
    }

    public double getCilandrada() {
        return cilandrada;
    }

    public void setCilandrada(double cilandrada) {
        this.cilandrada = cilandrada;
    }

    public boolean isEstado() {
        return estado;
    }
        //ppppppppppppp
    public void arrancar(boolean estado) {
        this.estado = true;
    }
    
    public void apagar(boolean estado) {
        this.estado = false;
    }
    
    //---------------------------------------------------

    @Override
    public String toString() {
        return "Motor{" + "cilandrada=" + cilandrada + ", estado=" + estado + '}';
    }
    
    
    
    
}
