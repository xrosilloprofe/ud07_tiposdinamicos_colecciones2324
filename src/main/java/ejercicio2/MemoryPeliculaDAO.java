package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class MemoryPeliculaDAO {
    private List<PeliculaTO> listaPeliculas;

    public MemoryPeliculaDAO(){
        listaPeliculas= new LinkedList<>();
    }

    public void addPelicula(PeliculaTO pelicula){
        if(!listaPeliculas.contains(pelicula))
            listaPeliculas.add(pelicula);
    }

    public void addAllPeliculas(List<PeliculaTO> peliculas){
        for(PeliculaTO pelicula:peliculas)
            addPelicula(pelicula);
    }

    public List<PeliculaTO> getListaPeliculas(){ return listaPeliculas;}





}
