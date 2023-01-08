public class UD5PRACTICAS {
    public static void main(String[] args) {
        String cadena = "Hola 2023!";
        char [] arrayCaracteres = cadena.toCharArray();
        for (int i = arrayCaracteres.length -1; i >= 0; i--) {
            System.out.print(arrayCaracteres[i]);
        }
    }

}
