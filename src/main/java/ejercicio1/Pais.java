package ejercicio1;

public class Pais {
    private String nombre;
    private int poblacion;

    public Pais(String nombre, int poblacion){
        this.nombre=nombre;
        this.poblacion=poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return "Pais: "+nombre+" con población: "+poblacion;
    }

}
