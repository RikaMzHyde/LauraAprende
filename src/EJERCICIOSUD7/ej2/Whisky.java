package EJERCICIOSUD7.ej2;

public class Whisky extends Producto{
    private int litros_whisky;

    public Whisky (int litros_whisky){
        super();
        this.litros_whisky = litros_whisky;
    }

    public int getLitros_whisky(){
        return litros_whisky;
    }
    public void setLitros_whisky(int litros_whisky){
        this.litros_whisky = litros_whisky;
    }
    @Override
    public double gastoConIva(){
        this.gasto = (double) this.litros_whisky * 11.90 * 1.21;
        return this.gasto;
    }
}