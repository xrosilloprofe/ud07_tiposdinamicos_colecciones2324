package sets;

import model.Persona;

import java.time.LocalDate;
import java.util.*;

public class MainSet {
    public static void main(String[] args) {


        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("1A","nuria","cano", LocalDate.of(1974,12,15)));
        listaPersonas.add(new Persona("2B","manuel","garcía",LocalDate.of(1987,4,10)));
        listaPersonas.add(new Persona("3C","jose","romero",LocalDate.of(1998,10,2)));
        listaPersonas.add(new Persona("4D","carmen","navarro",LocalDate.of(2000,2,19)));
        listaPersonas.add(new Persona("5A","jaime","cano", LocalDate.of(1994,2,15)));
        listaPersonas.add(new Persona("6B","matthew","garcía",LocalDate.of(1967,9,10)));
        listaPersonas.add(new Persona("7C","marcos","romero",LocalDate.of(1988,11,2)));
        listaPersonas.add(new Persona("8D","alex","navarro",LocalDate.of(2005,3,19)));
        listaPersonas.add(new Persona("8D","alex","navarro",LocalDate.of(2005,3,19)));
        listaPersonas.add(new Persona("8D","alex","navarro",LocalDate.of(2005,3,19)));
        listaPersonas.add(new Persona("8D","alex","navarro",LocalDate.of(2005,3,19)));
        listaPersonas.add(new Persona("7C","marcos","romero",LocalDate.of(1988,11,2)));
        listaPersonas.add(new Persona("7C","marcos","romeror",LocalDate.of(1988,11,2)));
        listaPersonas.add(new Persona("7C","marcos","romeror",LocalDate.of(1988,11,2)));

        Set<Persona> personaSet = new HashSet<>(listaPersonas);
        personaSet.addAll(listaPersonas);
        System.out.println(personaSet);

        Set<Persona> personaTreeSet = new TreeSet<>(listaPersonas);
        System.out.println(personaTreeSet);

        Set<Persona> personaLinkedSet = new LinkedHashSet<>(listaPersonas);
        System.out.println(personaLinkedSet);
    }
}
