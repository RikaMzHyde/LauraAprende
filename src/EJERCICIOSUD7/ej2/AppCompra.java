package EJERCICIOSUD7.ej2;

public class AppCompra {
    public static void main(String [] args){
        Producto p1 = new Leche(1);
        p1.gastoConIva();

        Producto p2 = new Salmon(0.5);
        p2.gastoConIva();

        Producto p3 = new Whisky(2);
        p3.gastoConIva();

        System.out.println("Leche: " + p1.gastoConIva() + " euros " + "Salmon: " + p2.gastoConIva() + " euros " + "Whisky: " + p3.gastoConIva() + " euros");
    }
}
