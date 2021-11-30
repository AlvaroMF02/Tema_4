package ejer12cEmpleado;

/**
 *
 * @author alvaro
 */
public class EmpleadosAlvaro {

    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String nifEmpleado;
    private double sueldoBaseEmpleado;
    private double horaExtraEmpleado;
    private int cantidadHorasExtraAlMesEmpleado;
    private int irpfEmpleado;
    private boolean casadoEmpleado;
    private int numHijosEmpleado;

    //constructor
    public EmpleadosAlvaro(String nombreEmpleado, String apellidoEmpleado, String nifEmpleado,
            double sueldoBaseEmpleado, double horaExtraEmpleado, int cantidadHorasExtraAlMesEmpleado,
            int irpfEmpleado, boolean casadoEmpleado, int numHijosEmpleado) {

        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.nifEmpleado = nifEmpleado;
        this.sueldoBaseEmpleado = sueldoBaseEmpleado;
        this.horaExtraEmpleado = horaExtraEmpleado;
        this.cantidadHorasExtraAlMesEmpleado = cantidadHorasExtraAlMesEmpleado;
        this.irpfEmpleado = irpfEmpleado;
        if(irpfEmpleado<1 || irpfEmpleado>20){
            System.out.println("El IRPF mo es el correcto");
        }
        this.casadoEmpleado = casadoEmpleado;
        this.numHijosEmpleado = numHijosEmpleado;
        
    }

    //get set
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getNifEmpleado() {
        return nifEmpleado;
    }

    public void setNifEmpleado(String nifEmpleado) {
        this.nifEmpleado = nifEmpleado;
    }

    public double getSueldoBaseEmpleado() {
        return sueldoBaseEmpleado;
    }

    public void setSueldoBaseEmpleado(double sueldoBaseEmpleado) {
        this.sueldoBaseEmpleado = sueldoBaseEmpleado;
    }

    public double getHoraExtraEmpleado() {
        return horaExtraEmpleado;
    }

    public void setHoraExtraEmpleado(double horaExtraEmpleado) {
        this.horaExtraEmpleado = horaExtraEmpleado;
    }

    public int getCantidadHorasExtraAlMesEmpleado() {
        return cantidadHorasExtraAlMesEmpleado;
    }

    public void setCantidadHorasExtraAlMesEmpleado(int cantidadHorasExtraAlMesEmpleado) {
        this.cantidadHorasExtraAlMesEmpleado = cantidadHorasExtraAlMesEmpleado;
    }

    public int getIrpfEmpleado() {
        return irpfEmpleado;
    }

    public void setIrpfEmpleado(int irpfEmpleado) {
        if(irpfEmpleado<1 || irpfEmpleado>20){
            System.out.println("El IRPF mo es el correcto");
        }
        this.irpfEmpleado = irpfEmpleado;
    }

    public boolean isCasadoEmpleado() {
        return casadoEmpleado;
    }

    public void setCasadoEmpleado(boolean casadoEmpleado) {
        this.casadoEmpleado = casadoEmpleado;
    }

    public int getNumHijosEmpleado() {
        return numHijosEmpleado;
    }

    public void setNumHijosEmpleado(int numHijosEmpleado) {
        this.numHijosEmpleado = numHijosEmpleado;

    }


    public double calculoHoraExtra() {
        double resultado = cantidadHorasExtraAlMesEmpleado * horaExtraEmpleado;
        return resultado;
    }

    public double calculoSueldoBruto() {
        double resultado = sueldoBaseEmpleado + horaExtraEmpleado;
        return resultado;
    }
    
    public double calculoDelIrpf() {
        int irpf=this.irpfEmpleado-this.numHijosEmpleado;
        
        if(this.casadoEmpleado=true){
            irpf-=2;
        }
        return irpf;
    }

    public double calculoSueldoNeto() {
        double resultado = this.calculoSueldoBruto()-this.calculoDelIrpf();
        return resultado;
    }
    
    public void escribirBasicInfo() {
        System.out.println("Nombre= " + nombreEmpleado + "\n Apellidos= "
                + apellidoEmpleado + "\n NIF= " + nifEmpleado + "Casado= " + casadoEmpleado
                + "\n Cantidad Hijos= " + numHijosEmpleado);
    }
    
    public void escribirAllInfo() {
        System.out.println("Nombre= " + nombreEmpleado + "\n Apellidos= "
                + apellidoEmpleado + "\n NIF= " + nifEmpleado + "Casado= " + casadoEmpleado
                + "\n Cantidad Hijos= " + numHijosEmpleado+ "\n Sueldo= "
                + sueldoBaseEmpleado+ "\n Cantidad Horas Extra= " + cantidadHorasExtraAlMesEmpleado
                + "\n Calculo sueldo bruto= " + calculoSueldoBruto() + "\n Retención del IRPF" + calculoDelIrpf()
                + "\n Calculo sueldo neto" + calculoSueldoNeto() );
    }
    
     @Override
    public String toString() {
        return "Empleado{" + "\n Nombre= " + nombreEmpleado + "\n Apellidos= "
                + apellidoEmpleado + "\n NIF= " + nifEmpleado + "\n Sueldo= "
                + sueldoBaseEmpleado + "\n Horas Extras= " + horaExtraEmpleado
                + "\n Cantidad Horas Extra= " + cantidadHorasExtraAlMesEmpleado
                + "\n IRPF= " + irpfEmpleado + "\n Casadx= " + casadoEmpleado
                + "\n Cantidad Hijos= " + numHijosEmpleado + '}';
    }
}
