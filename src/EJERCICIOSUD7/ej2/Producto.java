package EJERCICIOSUD7.ej2;

//Ejercicio 1
public abstract class Producto{
    protected double gasto;

    public Producto(){
    }
    public Producto (double gasto){
        this.gasto = gasto;
    }
    public double getGasto(){
        return gasto;
    }
    public void setGasto(double gasto){
        this.gasto = gasto;
    }
    public abstract double gastoConIva();
}