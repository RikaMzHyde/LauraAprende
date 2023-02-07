package EJERCICIOSUD7.ej3;

import java.util.Scanner;

public class AppAnimal {
    public static void main(String [] args){
        Mamifero m = new Mamifero();
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué animal es?");
        String nombre = sc.nextLine();
        System.out.print("Indica qué come el Tigre: [carne, vegetales, ambos]");
        String alimento = sc.nextLine();



    }
}
