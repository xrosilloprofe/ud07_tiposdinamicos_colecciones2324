package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class PeliculaTO {

    String titulo;

    List<String> actores;

    List<String> directores;



    public PeliculaTO(String titulo) {
        this.titulo=titulo;
        actores = new ArrayList<>();
        directores = new ArrayList<>();
    }



    public List<String> getActores() {
        return actores;
    }



    public void addActor(String actor) {
        actores.add(actor);
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
}