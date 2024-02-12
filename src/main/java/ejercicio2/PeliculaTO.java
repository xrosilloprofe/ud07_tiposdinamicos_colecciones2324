package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeliculaTO implements Comparable<PeliculaTO>{

    private String titulo;
    private Map<String,String> actores;
    private List<String> directores;
    private int id;
    private static int index=0;


    public PeliculaTO(String titulo) {
        this.titulo=titulo;
        actores = new HashMap<>();
        directores = new ArrayList<>();
        id=index++;
    }


    public int getId(){return id;}
    public String getTitulo(){return titulo;}

    public Map<String,String> getActores() {
        return actores;
    }



    public void addActor(String actor, String rol) {
        actores.put(actor,rol);
    }

    public void addDirector(String director) {
        directores.add(director);
    }

    @Override
    public String toString() {
        return "PeliculaTO{" +
                "titulo='" + titulo + '\'' +
                ", actores=" + actores +
                ", directores=" + directores +
                '}';
    }

    @Override
    public int compareTo(PeliculaTO pelicula){
        return getTitulo().compareTo(pelicula.getTitulo());
    }

    @Override
    public boolean equals(Object o){
        if(o==null || getClass() != o.getClass())
            return false;
        PeliculaTO peli = (PeliculaTO) o;
        return id==peli.getId() && titulo.equals(peli.getTitulo());
    }

}