/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer11C;

/**
 *
 * @author alvaro
 */
public class Rueda {
    private int diametro;   //diametro de la rueda en cm
    private boolean estado; //estado, inflado desinflado

    public Rueda(int diametro, boolean estado) {
        this.diametro = diametro;
        this.estado = estado;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public boolean isEstado() {
        return estado;
    }
        //metodos
    public void inflar(boolean estado) {
        this.estado = true;
    }
    
    public void desinflar(boolean estado) {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Rueda{" + "diametro=" + diametro + ", estado=" + estado + '}';
    }
    
    
    
}
