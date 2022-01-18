package ejer15c;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

/**
 *
 * @author Álvaro
 */
public class Fecha {
    
    //---------------ATRIBUTOS---------------
    
    private int dia;
    private int mes;
    private int anio;
    
    
    
    //---------------CONSTRUCTORES---------------

    public Fecha(int dia, int mes, int anio) {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }
     
    public Fecha(int dia, int mes, int anio,int pep) {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
        
        LocalDate hoy = LocalDate.now();
        
        if ((dia>31 || dia<1)||(mes>12 || mes<1)||(anio>hoy.getYear())){
            throw new IllegalArgumentException("fecha incorrecta");         //lanzo una excepción con throw new
        }   
        
    }
    
    //-------------------METODOS-------------------
    
    static void comprobarFecha(int dia, int mes, int anio){
        if ((dia>31 || dia<1)||(mes>12 || mes<1)||(anio>2022)){
            throw new IllegalArgumentException("fecha incorrecta");
        }
    }
    
    //Para  ver si el año es bisiesto
    static void bisiesto(LocalDate hoy){
        if (hoy.isLeapYear()){
            System.out.println("Este año es bisiesto");
        }
    }
    
    //Devuelve el numero de dias que tiene un mes
    static void diasMes(LocalDate hoy){
        System.out.println("Días del mes actual " + hoy.lengthOfMonth());
    }
    
    //Muestra fecha en este formato "02-09-2003"
    static void mostrarFechaCorta(LocalDate hoy){
        System.out.println(hoy.getDayOfMonth() +"-"+hoy.getMonthValue()+"-"+hoy.getYear());
    }
    
    //Muestra fecha en este formato "martes 2 de septiembre de 2003"
    static void mostrarFechaLarga(LocalDate hoy){
           
    }
    
    //devolverá el día de la semana de la fecha (7 para domingo, 6 para sábado, etc). El 1-1-1900 fue domingo.
    static void diaSemana(LocalDate hoy){
           
    }
    
    //devolverá el número de días entre ambas fechas
    static void diasEntreFechas(Temporal fecha1, Temporal fecha2){
        LocalDate hoy;
        long diferenciaDias = ChronoUnit.DAYS.between(fecha1, fecha2);
        System.out.println("Entre las dos fechas hay " + diferenciaDias+"días");
           
    }
    
    //Pasa al dia siguiente
    static void siguiente(LocalDate hoy){
           LocalDate diaSiguiente = hoy.plus(-1, ChronoUnit.DAYS);
        System.out.println("Dentro de una semana " + diaSiguiente);
    }
    
    //Pasa al dia anterior
    static void anterior(LocalDate hoy){
           LocalDate diaAnterior = hoy.plus(-1, ChronoUnit.DAYS);
        System.out.println("Dentro de una semana " + diaAnterior);
    }
    
    
    //-------------------GET-SET-------------------

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if ((dia>31 || dia<1)){
            throw new IllegalArgumentException("fecha incorrecta");
        }
        
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if ((mes>12 || mes<1)){
            throw new IllegalArgumentException("fecha incorrecta");
        }
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if ((anio>2022)){
            throw new IllegalArgumentException("fecha incorrecta");
        }
        this.anio = anio;
    }
    
    
    
    
}
