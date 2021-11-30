package ejer12cEmpleado;

/**
 *
 * @author alvaro
 */
public class prueba {

    public static void main(String[] args) {
        EmpleadosAlvaro prueba;

        prueba = new EmpleadosAlvaro("Dorkas", "Blackbood", "28727338H", 165.32, 2.64, 8, 32, true, 8);
        System.out.println(prueba.toString());
        
        //metodo calcular hora
        double hora = prueba.calculoHoraExtra();
        System.out.println("Cálculo del complemento correspondiente a las horas extra realizadas: " + hora);
        
        //metodo salario bruto
        double salarioBruto=prueba.calculoSueldoBruto();
        System.out.println("El salario bruto es de "+salarioBruto);
    }
}
