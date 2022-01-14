package ejer11C;

/**
 *
 * @author alvaro
 */
public class zPrueba {
    public static void main(String[] args) {
        
        Motor m = new Motor(2.0, false);
        
        Ventana v1 = new Ventana(true,true);
        Ventana v2 = new Ventana(true,true);
        Ventana v3 = v2;
        
        Puerta pp = new Puerta(false, v1);
        Puerta pc = new Puerta(false,new Ventana(true,true));
        
        Rueda rdi = new Rueda(50, true);
        Rueda rdd = new Rueda(50, true);
        Rueda rti = new Rueda(50, true);
        Rueda rtd = new Rueda(50, true);
        
        
        
        Coche auto = new Coche(m, pp, pc, rti, rtd, rti, rtd);
        
        Coche auto2=new Coche(new Motor(2.0, false),
            new Puerta(false, new Ventana(true, true)),
            new Puerta(false, new Ventana(true, true)),
                new Rueda(50, true),
                new Rueda(50, true),
                new Rueda(50, true),
                new Rueda(50, true));
        
        System.out.println("Auto 2");   
        System.out.println(auto2);
        
        System.out.println("Poner la ventana sin tintar");
        auto2.getPuertaPiloto().getVentana().setTintada(false);
        System.out.println(auto2);

        System.out.println("Diametro de la rueda dellantera izquierda");
        System.out.println(auto2.getRuedaDelantIzq().getDiametro());
        
        System.out.println("Arrancar el motor");
        auto2.getMotor().arrancar(true);
        
//        
//        System.out.println(auto);
//        
////        rtd.desinflar();
//        
//        
//        System.out.println(auto);

        
    }
}
