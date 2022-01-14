/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer11C;

/**
 *
 * @author alvaro
 */
public class Ventana {
    private boolean tintada; //para saber si esta tintada o no
    private boolean estado; //para saber si esta cerrada o abierta
    

//----------------------------------------------------
    public Ventana(boolean tintada, boolean estado) {
        this.tintada = tintada;
        this.estado = estado;
    }
    
//----------------------------------------------------
    public boolean isTintada() {
        return tintada;
    }

    public void setTintada(boolean tintada) {
        this.tintada = tintada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void bajar() {
        this.estado = true;
    }
    
    public void cerrar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Ventana{" + "tintada=" + tintada + ", estado=" + estado + '}';
    }
    
    
    
    
}
