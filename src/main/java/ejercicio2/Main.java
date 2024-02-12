package ejercicio2;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PeliculaTO oppenheimer = new PeliculaTO("Oppenheimer");
        oppenheimer.addActor("Cillian Murphy","Oppenheimer");
        oppenheimer.addActor("Emily Blunt","como ella");
        oppenheimer.addDirector("Christopher Nolan");

        PeliculaTO sociedadNieve = new PeliculaTO("La Sociedad de la Nieve");
        sociedadNieve.addDirector("Juan Antonio Bayona");
        sociedadNieve.addActor("Enzo Vogrincic","muere");
        sociedadNieve.addActor("Agustín Pardella","vivo");

        PeliculaTO movie43 = new PeliculaTO("Movie 43");
        movie43.addDirector("James Gunn");
        movie43.addDirector("Peter Farrelly");
        movie43.addActor("Halle Berry","halle");
        movie43.addActor("Kate Winslet","kate");

        MemoryPeliculaDAO filmin = new MemoryPeliculaDAO();
        filmin.addAllPeliculas(List.of(oppenheimer,sociedadNieve,movie43));
        filmin.addAllPeliculas(List.of(oppenheimer,sociedadNieve,movie43));

        System.out.println(filmin);
        System.out.println(filmin.removePelicula(movie43));
        System.out.println(filmin.removePelicula(movie43));
        System.out.println(filmin);

        System.out.println("Peliculas Ordenadas");
        filmin.listaOrdenada().stream().forEach(System.out::println);

//        System.out.println("Peliculas Ordenadas");
//        filmin.getListaPeliculas().stream().
//                sorted().forEach(pelicula -> System.out.println("Pelicula -->" + pelicula));
//
//        List<PeliculaTO> peliculasOrdenadas = filmin.getListaPeliculas();
//        Collections.sort(peliculasOrdenadas);


    }
}
