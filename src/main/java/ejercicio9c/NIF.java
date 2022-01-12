/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9c;

/**
 *
 * @author alvaro
 */
public class NIF {
    private char letraDni;
    private String numeroDni;

    
    //-------------------CONSTRUCTOR-------------------

    private NIF(String numeroDni) {
        
        this.numeroDni=numeroDni;
        this.letraDni=calculoDni();
         
       
    }
    
    
    //---------------------METODOS---------------------
    
    private char calculoDni(){
    
        char letra=' ';
        int comprobacion=numeroDni.length(); //mide la cantidad de caracteres
        
        
        if (comprobacion>8){
            letra=' ';
        }else{
            
           int divisionNum=Integer.parseInt(this.numeroDni);
           
           int letraDni=divisionNum % 23;
           
           switch (letraDni){
            
            case 0:
                letra='T';
                break;
                
            case 1:
                letra='R';
                break;
                
            case 2:
                letra='W';
                break;
                
            case 3:
                letra='A';
                break;
                
            case 4:
                letra='G';
                break;    
            
            case 5:
                letra='M';
                break;
            
            case 6:
                letra='Y';
                break;
                
            case 7:
                letra='F';
                break;
                
            case 8:
                letra='P';
                break;
                
            case 9:
                letra='D';
                break;    
            
            case 10:
                letra='X';
                break;
                
            case 11:
                letra='B';
                break;
                
            case 12:
                letra='N';
                break;
                
            case 13:
                letra='J';
                break;
                
            case 14:
                letra='Z';
                break;    
            
            case 15:
                letra='S';
                break;
            
            case 16:
                letra='Q';
                break;
                
            case 17:
                letra='V';
                break;
                
            case 18:
                letra='H';
                break;
                
            case 19:
                letra='L';
                break;    
            
            case 20:
                letra='C';
                break;
                
            case 21:
                letra='K';
                break;
                
            case 22:
                letra='E';
                break;
                
        }
        }

        return letra;
        
    }

    @Override
    public String toString() {
        return "NIF{" + "letraDni=" + letraDni + ", numeroDni=" + numeroDni + '}';
    }
    

    
    public static void main(String[] args) {
        NIF nif1=new NIF("26510773");
        System.out.println(nif1.toString());
        
    }
}

