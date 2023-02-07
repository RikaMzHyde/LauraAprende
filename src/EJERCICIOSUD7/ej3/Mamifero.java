package EJERCICIOSUD7.ej3;

public class Mamifero extends Animal implements Alimentable {

    public Mamifero(String nombre) {
        super(nombre);
    }


    @Override
    public String segunAlimento(String alimento) {
        if (alimento.equals("carne")) {
            return "Es carnívoro";
        } else if (alimento.equals("vegetales")) {
            return "Es herbívoro";
        } else {
            return "Es omnívoro";
        }
    }

    @Override
    public void comer(String alimento) {
        System.out.println("El " + this.nombre + " come " + alimento);
    }

    @Override
    public String nacer() {
        return "Los mamíferos son vivíparos";
    }
}
