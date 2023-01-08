public class Animal {
    String nombre;
    int id;
    String tipo;

    public Animal (String nombre, int id, String tipo){
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;

    }
    public String getNombre(){
            return nombre;
    }
    public int getId(){ return id;}
    public void setNombre(String nombre){
       this.nombre = nombre;
    }

}


