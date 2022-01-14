package ejer11C;

/**
 *
 * @author alvaro
 */
public class Puerta {
    private boolean estado;     //para saber si esta abierta o cerrada
    private Ventana ventana;    //llamo a la clase ventana

    public Puerta(boolean estado, Ventana ventana) {
        this.estado = estado;
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = true;
    }
    
    public void cerrar() {
        this.estado = true;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    //ventana tambien debe tener el toostring porque si no saldria el hueco donde esta la memoria
    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ventana=" + ventana + '}';
    }


}
