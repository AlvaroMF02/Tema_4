-package ejer4cPuntoGeometrico;

/**
 *
 * @author alvaro
 */
public class PuntoGeometrico {
    //---------------------------------------------------
    
    private double x;
    private double y;
    
    //---------------------------------------------------

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //parametrizado por defecto
    public PuntoGeometrico() {
        this.x = 2;
        this.y = 2;
    }
    
    
    //---------------------------------------------------
    //getter y setter
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //---------------------------------------------------

    @Override
    public String toString() {
        return "PuntoGeometrico{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
