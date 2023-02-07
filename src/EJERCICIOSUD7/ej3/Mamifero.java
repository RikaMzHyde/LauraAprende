package EJERCICIOSUD7.ej3;

public class Mamifero extends Animal {

    public String comer() {
        return null;
    }


    public String nacer() {
        return null;
    }


    class Animal implements Alimentable {
        public String segunAlimento(String alimento) {
            if (alimento.equals("carne")) {
                return "carnívoro";
            } else if (alimento.equals("vegetales")) {
                return "herbívoro";
            } else {
                return "omnívoro";
            }
        }
    }

}
