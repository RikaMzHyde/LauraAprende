package EJERCICIOSUD5;

import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cadena de texto: ");
        String cadena = sc.nextLine();
        char [] arrayCaracteres = cadena.toCharArray();
        boolean nums = true;
        for (int i = arrayCaracteres.length -1; i >= 0; i--) {
            char caracter = arrayCaracteres[i];
            System.out.print(caracter);
            if (caracter < '0' || caracter > '9') {
                nums = false;
            }
        }
        if (nums) {
            System.out.println("\nEs un número");
        }
    }

}
