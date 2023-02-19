package pruebas;
public class Gato{

    int bigotes;



    public Gato (int bigotes){ //te voy a pasar un int (bigotes)

        this.bigotes = bigotes; //hace referencia al int bigotes de la clase Gato

    }

    public int getBigotes(){
        return this.bigotes;   //  bigotes solo
    }

    public void setBigotes(int bigotes){
        this.bigotes = bigotes;
    }

    public void dormir(){

        System.out.println("El gato está durmiendo");


    }
}