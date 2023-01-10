package EJERCICIOSUD5;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String [] args){
        int num;
        int elec;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String cont = "";
        for(int i = 0; i < 10; i++ ){
            num = 1 + random.nextInt(10);
            cont += num + " ";
        }
        for(int i = 0; i < cont.length(); i++){
            System.out.print(cont.charAt(i));
        }
        String[] numeros = cont.split(" ");
        do{
            System.out.println("\n1) Mostrar el array.");
            System.out.println("2) Conocer el mayor de los números.");
            System.out.println("3) Obtener la media de  los números.");
            System.out.println("4) Salir.");
            System.out.print("Escoja una opción: ");
            elec = sc.nextInt();


            switch (elec){
                case 1:
                    System.out.print("Array: ");
                    for (int i = 0; i < cont.length(); i++) {
                        System.out.print(cont.charAt(i));
                    }
                    break;
                case 2:
                    int mayor = 0;
                    for (int i = 0; i < numeros.length; i++) {
                        int numero = Integer.parseInt(numeros[i]);
                        if (numero > mayor) {
                            mayor = numero;
                        }
                    }
                    System.out.println("Máximo: " + mayor);
                    break;
                case 3:
                    double sum = 0;
                    for (int i = 0; i < numeros.length; i++) {
                        sum += Integer.parseInt(numeros[i]);
                    }
                    double media = (double) sum / numeros.length;
                    System.out.println("Media: " + media);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida, selecciona una opción válida.");
                    break;
            }
        }while (elec != 4);


    }
}
//for(int i = 0; i < cont.length(); i++){
//if(Integer.parseInt(String.valueOf(cont.charAt(i))) > mayor){
//mayor = Integer.parseInt(String.valueOf(cont.charAt(i)));
//}
//}
//System.out.println("El mayor número es: " + mayor);
//break;
//case 3:
//double sum = 0;
//for(int i = 0; i < cont.length(); i++){
//sum += Integer.parseInt(String.valueOf(cont.charAt(i)));
//}
//double media = sum/10;
//System.out.println("La media de los números es: " + media);
//break;
//case 4:
//System.out.println("Saliendo del programa...");
//break;
//default:
//System.out.println("Opción inválida, por favor seleccione una opción válida.");
//break;
//}
//} while(elec != 4);

