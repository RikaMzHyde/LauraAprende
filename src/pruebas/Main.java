package pruebas;

public class Main {
    public static void main (String[] args) {

        Perro dog1 = new Perro("Bulldog");


        Perro dog2 = new Perro("Yorkshire");

        dog1.ladrar("coche");

        dog2.mear();

        Gato cat1 = new Gato(8);

        Gato cat2 = new Gato(7);

        cat2.dormir();

    }



}
