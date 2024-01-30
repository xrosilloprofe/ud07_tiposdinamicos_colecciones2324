package tad;

import model.Persona;

import java.time.LocalDate;
import java.util.Arrays;

public class MainDE {
    public static void main(String[] args) {
        ListaDE<String> listacadenas = new ListaDE<>();
        listacadenas.addHead("salman");
        listacadenas.addHead("vicent");
        listacadenas.addHead("alejandro");
        listacadenas.addHead("santi");
        listacadenas.addTail("carlos");
        listacadenas.addTail("lia");
        System.out.println(listacadenas);
        listacadenas.removeHead();
        listacadenas.removeHead();
        System.out.println(Arrays.toString(listacadenas.getAsArray(String.class)));


        ListaDE<Integer> listaEnteros = new ListaDE<>();
        listaEnteros.addHead(1);
        listaEnteros.addHead(2);
        listaEnteros.addHead(3);
        System.out.println(listaEnteros);

        ListaDE<Persona> listaPersonas = new ListaDE<>();
        listaPersonas.addTail(new Persona("1A","uno","uno uno", LocalDate.of(1999,12,21)));
        listaPersonas.addTail(new Persona("2A","dos","dos dos",LocalDate.of(2002,2,13)));
        listaPersonas.addTail(new Persona("3A","tres","tres tres",LocalDate.of(1984,6,5)));
        System.out.println(Arrays.toString(listaPersonas.getAsArray(Persona.class)));
    }
}
