package EJERCICIOSUD5;

import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String letras = "";
        int x = 0;

        System.out.println("Ingresa la frase a codificar: ");
        String frase = sc.nextLine();
        char [] arrayCaracteres = frase.toCharArray();

        System.out.print("Ingresa el número clave para codificar [0-26]: ");
        x = sc.nextInt();
        for(int i = 0; i <= arrayCaracteres.length-1; i++){
            char caracter = arrayCaracteres[i];
            System.out.print((char) (caracter + x));
            letras += (char) (caracter + x);
        }
        System.out.print("\nIngresa el número clave para decodificar [0-26]: ");
        x = sc.nextInt();
        char [] arrayletras = letras.toCharArray();
        for(int i = 0; i <= arrayletras.length-1; i++){
            char letra = arrayletras[i];
            System.out.print((char) (letra - x));
        }
        }






    }
