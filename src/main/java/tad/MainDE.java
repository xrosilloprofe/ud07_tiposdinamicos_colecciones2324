package tad;

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
        listaPersonas.addTail(new Persona("1A","uno","uno uno",31));
        listaPersonas.addTail(new Persona("2A","dos","dos dos",32));
        listaPersonas.addTail(new Persona("3A","tres","tres tres",33));
        System.out.println(Arrays.toString(listaPersonas.getAsArray(Persona.class)));
    }
}
