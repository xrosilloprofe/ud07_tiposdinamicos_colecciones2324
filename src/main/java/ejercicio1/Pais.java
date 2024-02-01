package ejercicio1;

public class Pais implements Comparable<Pais>{
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
        return "Pais: "+nombre;
    }

    @Override
    public int hashCode(){return nombre.hashCode()+poblacion;}

    @Override
    public boolean equals(Object o){
        if(o==null || !(o instanceof Trabajador))
            return false;
        Pais pais=(Pais) o;
        return (pais.nombre.equals(nombre));
    }

    @Override
    public int compareTo(Pais o) {
        return nombre.compareTo(o.getNombre());
    }
}
