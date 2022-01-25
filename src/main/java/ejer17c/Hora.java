/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer17c;

import java.time.LocalTime;

/**
 *
 * @author Álvaro
 */
public class Hora {
    //--------------ATRIBUTOS--------------
    
    private String hora;
    private String minutos;
    private String segundos;
    
    //-------------CONSTRUCTORES------------

    public Hora(String hora, String minutos, String segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        
    }
    
    public Hora() {
        this.hora = "00:";
        this.minutos = "00:";
        this.segundos = "00";
    }
    
    //----------------METODOS-----------------
    
    private void horaCorrecta(LocalTime hora,LocalTime minutos,LocalTime segundos){
        LocalTime ahora = LocalTime.now();
        
        if ((ahora!=hora)&&(ahora!=minutos)&&(ahora!=segundos)){
            this.hora="12:";
            this.minutos="0:";
            this.segundos="0";
        }else{
            System.out.println("La hora es correcta");
        }
    }
    
    //me quede en el  primer metodo y ni siquiera esta terminado :)
    
}
