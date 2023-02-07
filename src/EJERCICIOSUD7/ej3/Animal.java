package EJERCICIOSUD7.ej3;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void comer(String alimento);
    public abstract String nacer();
}


