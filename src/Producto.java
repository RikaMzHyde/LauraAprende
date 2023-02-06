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
    public void gasto(double gasto){
        this.gasto = gasto;
    }
    public abstract double gastoConIva();
}

public class Leche extends Producto{
    private int litros_leche;

    public int getLitros_leche(){
        return litros_leche;
    }
    public void setLitros_leche(int litros_leche){
        this.litros_leche = litros_leche;
    }
    @Override
    public abstract double gastoConIva(){
        super.gastoConIva(gasto = (double) litros_leche * 1.95 * 1.04);
    }
}

public class Salmon extends Producto{
    private double kilos_salmon;

    public double getKilos_salmon(){
        return kilos_salmon;
    }
    public void setKilos_salmon(double kilos_salmon){
        this.kilos_salmon = kilos_salmon;
    }
    @Override
    public abstract double gastoConIva(gasto = kilos_salmon * 11.85 * 1.08){
        super.gastoConIva();
    }
    //tengo que meter el gasto con iva del producto
}

public class Whisky extends Producto{
    private int litros_whisky;

    public int getLitros_whisky(){
        return litros_whisky;
    }
    public void setLitros_whisky(int litros_whisky){
        this.litros_whisky = litros_whisky;
    }
    @Override
    public abstract double gastoConIva(){
        super.gastoConIva(gasto = (double) litros_whisky * 11.90 * 1.21);
    }
    //tengo que meter el gasto con iva del producto
}