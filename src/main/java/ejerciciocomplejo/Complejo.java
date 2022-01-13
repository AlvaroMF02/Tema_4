/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1CComplejo;

/**
 *
 * @author Álvaro
 */
public class Complejo {
    //el numero complejo (z) tiene parte real y parte imagniaria z = (a, b)
    private double aReal;        // a=Re(z)
    private double bImaginaria;  //b=Im(z)
    
    //-------------CONSTRUCTORES-------------

    public Complejo(double aReal, double bImaginaria) {
        this.aReal = aReal;
        this.bImaginaria = bImaginaria;
    }
    
    public Complejo(double aReal, double bImaginaria, String algo) {
        this.aReal = 49;
        this.bImaginaria = 56;
        algo = "no se que hago";
    }
    

    //-------------GET/SET-------------

    public double getaReal() {
        return aReal;
    }

    public void setaReal(double aReal) {
        this.aReal = aReal;
    }

    public double getbImaginaria() {
        return bImaginaria;
    }

    public void setbImaginaria(double bImaginaria) {
        this.bImaginaria = bImaginaria;
    }
    
    //-------------TO-STRING-------------

    @Override
    public String toString() {
        return "Complejo" + "(a=" + aReal + ", b=" + bImaginaria+")";
    }
    
    //-------------METODOS-------------
    //https://www.problemasyecuaciones.com/complejos/sumar-restar-multiplicar-dividir-numeros-complejos-imaginarios-ejemplos-formulas.html
    
    private static Complejo suma(Complejo num1, Complejo num2){
        
//        Complejo resultado = new Complejo();
//       
//       double resultado1=num1.aReal+num2.aReal;
//       double resultado2=num1.bImaginaria+num2.bImaginaria;
//       
//       resultado.setA(resultado1);
        return (new Complejo(num1.aReal+ num2.aReal, num1.bImaginaria+num2.bImaginaria)); //codigo de jesus

    }
    
//    private static Complejo resta(Complejo num1, Complejo num2){
//        
//        double resultado;
//        resultado=(num1.aReal-num2.aReal , num1.bImaginaria-num2.bImaginaria);
//        
//        return resultado;
//        
//    }
}
