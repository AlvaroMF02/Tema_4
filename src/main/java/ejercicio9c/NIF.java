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

    public NIF(String Dni) {
        
        int numeroDni=Integer.parseInt(Dni);
        
        
 
    }

    
    //---------------------METODOS---------------------
    
    private int calculoDni(int numeros){
    
        int divisionNum=numeros%23;
        
        switch (divisionNum){
            
            case 0:
                letraDni='T';
                break;
                
            case 1:
                letraDni='R';
                break;
                
            case 2:
                letraDni='W';
                break;
                
            case 3:
                letraDni='A';
                break;
                
            case 4:
                letraDni='G';
                break;    
            
            case 5:
                letraDni='M';
                break;
            
            case 6:
                letraDni='Y';
                break;
                
            case 7:
                letraDni='F';
                break;
                
            case 8:
                letraDni='P';
                break;
                
            case 9:
                letraDni='D';
                break;    
            
            case 10:
                letraDni='X';
                break;
                
            case 11:
                letraDni='B';
                break;
                
            case 12:
                letraDni='N';
                break;
                
            case 13:
                letraDni='J';
                break;
                
            case 14:
                letraDni='Z';
                break;    
            
            case 15:
                letraDni='S';
                break;
            
            case 16:
                letraDni='Q';
                break;
                
            case 17:
                letraDni='V';
                break;
                
            case 18:
                letraDni='H';
                break;
                
            case 19:
                letraDni='L';
                break;    
            
            case 20:
                letraDni='C';
                break;
                
            case 21:
                letraDni='K';
                break;
                
            case 22:
                letraDni='E';
                break;
                
        }
        
        return letraDni;
    }
    


}
