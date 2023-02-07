package EJERCICIOSUD7.ej2;

public class Leche extends Producto {

    private int litros_leche;

    public Leche (int litros_leche){
        super();
        this.litros_leche = litros_leche;
    }

    public int getLitros_leche() {
        return litros_leche;
    }

    public void setLitros_leche(int litros_leche) {
        this.litros_leche = litros_leche;
    }


    @Override
    public double gastoConIva() {
        this.gasto = (double) this.litros_leche * 1.95 * 1.04;
        return this.gasto;
    }
}
