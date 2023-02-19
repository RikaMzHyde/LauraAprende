package pruebas;
public class Perro { //clase perro

    public String raza;


    public Perro(String raza) { //Constructor

        this.raza = raza; //asignarle el valor al atributo

    }

    public void ladrar(String objeto) { //crear el método de ladrar

        System.out.println("El perro ladra a " + objeto);
    }

    String getRaza() {
        return this.raza; //this para especificar que nos referimos al atributo

    }

    void setRaza(String raza) { //los parámetros simepre llevan tipo
        this.raza = raza;
    }

    public void mear() { //crear el método de mear

        System.out.println("El perro se mea en la farola");

    }

    public void sentarse() { //crear el método de sentarse

        System.out.println("El perro se sienta al decirle \"sit\"");

    }
}