import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int[] x = {0,4,9,56,32,11,40};
        /*String[] x = {"Perro", "Gato","Pato","Oso","Ñu","Pájaro"};

        Animal ani1 = new Animal( 1234, "Mamífero");
       /* for (int i = x.length; i > 0; i--){

            System.out.println("El valor de i es igual a: " + (i) +
                    " y el valor de x[" + (i) + "-1] es: " +
                    x[i-1]);
        }
        System.out.println("La longitud de nuestro array es: " + x.length);
        ani1.setNombre("Perro");
        System.out.println(ani1.getNombre());*/


        String[] names = new String[5];
        Animal[] animales = new Animal[names.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca 5 valores de tipo String: ");
        for(int x = 0; x < names.length; x++){
            System.out.println("Valor " + (x+1) + " : ");
            names[x] = sc.nextLine();
        }
        for(int i = 0; i < names.length; i++){
            //crear objeto animal, nombre será el nombre que l hayamos dado según la posicion acutal del name que tengamos, y la id será el número de posición y tipo sea mamífero siempre
            //Animal ani1 = new Animal(names[i],i,"Mamífero");
            animales[i] = new Animal(names[i],i,"Mamífero");
        }//recorrer animales y que saque nombre e id
        for(Animal an: animales){
            System.out.println("El animal que ha introducido es: " + an.getNombre() + " y su id es: " + an.getId());
        }






    }





}