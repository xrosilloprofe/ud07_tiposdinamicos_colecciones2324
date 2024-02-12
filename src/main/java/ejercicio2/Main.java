package ejercicio2;

public class Main {
    public static void main(String[] args) {
        PeliculaTO oppenheimer = new PeliculaTO("Oppenheimer");
        oppenheimer.addActor("Cillian Murphy");
        oppenheimer.addActor("Emily Blunt");
        oppenheimer.addDirector("Christopher Nolan");

        PeliculaTO sociedadNieve = new PeliculaTO("La Sociedad de la Nieve");
        sociedadNieve.addDirector("Juan Antonio Bayona");
        sociedadNieve.addActor("Enzo Vogrincic");
        sociedadNieve.addActor("Agustín Pardella");

        PeliculaTO movie43 = new PeliculaTO("Movie 43");
        movie43.addDirector("James Gunn");
        movie43.addDirector("Peter Farrelly");
        movie43.addActor("Halle Berry");
        movie43.addActor("Kate Winslet");



    }
}
