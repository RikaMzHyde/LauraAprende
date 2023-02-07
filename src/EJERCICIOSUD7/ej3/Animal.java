package EJERCICIOSUD7.ej3;

public class Animal {

    protected String nombre;

    public Animal(){
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void comer(String alimento, String nacer){
        System.out.println("El " + this.nombre + " come " + alimento);
    }
}


