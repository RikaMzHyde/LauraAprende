package EJERCICIOSUD7.ej2;

public class Salmon extends Producto{
    private double kilos_salmon;

    public Salmon (double kilos_salmon){
        super();
        this.kilos_salmon = kilos_salmon;
    }

    public double getKilos_salmon(){
        return kilos_salmon;
    }
    public void setKilos_salmon(double kilos_salmon){
        this.kilos_salmon = kilos_salmon;
    }
    @Override
    public double gastoConIva(){
        this.gasto = this.kilos_salmon * 11.85 * 1.08;
        return this.gasto;
    }
}