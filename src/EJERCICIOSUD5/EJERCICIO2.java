package EJERCICIOSUD5;

public class EJERCICIO2 {
    public static void main(String[] args){
        String cadena = "En mi próxima vida, creeré en la reencarnación";

        int longitud = cadena.length();
        System.out.println("Longitud: " + longitud);

        char caracter = cadena.charAt(7);
        System.out.println("En posición 7: " + caracter);

        String subcadena = cadena.substring(19, 26);
        System.out.println("Subcadena: " + subcadena);

        int indice = cadena.indexOf('x');
        System.out.println("Posición del caracter 'x': " + indice);

        String mayusculas = cadena.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);

        char primerCaracter = cadena.charAt(0);
        if (primerCaracter == 'E') {
            System.out.println("Comienza por E");
        } else {
            System.out.println("No comienza por E");
        }

    }
}
