package EJERCICIOSUD7.ej3;

import java.util.Scanner;

public class AppAnimal {
    public static void main(String [] args){
        Mamifero m;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué animal es?");
        String nombre = sc.nextLine();
        m = new Mamifero(nombre);
        System.out.println("Indica qué come el Tigre: [carne, vegetales, ambos]");
        String alimento = sc.nextLine();
        m.comer(alimento);
        System.out.println(m.segunAlimento(alimento));
        System.out.println(m.nacer());
    }
}
