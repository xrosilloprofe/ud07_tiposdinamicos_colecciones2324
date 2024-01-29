package listas;

import tad.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalLista {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(5);
        listaEnteros.add(7);
        System.out.println(listaEnteros.size());
        System.out.println(listaEnteros);
        listaEnteros.remove(0);
        System.out.println(listaEnteros);
        listaEnteros.addAll(List.of(11,13,17,19));
        System.out.println(listaEnteros);
        listaEnteros.set(2,23);
        System.out.println(listaEnteros);

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("1A","nuria","cano",42));
        listaPersonas.add(new Persona("2B","manuel","garcía",21));
        listaPersonas.add(new Persona("3C","jose","romero",31));
        listaPersonas.add(new Persona("4D","carmen","navarro",51));

        System.out.println(
                listaPersonas.contains(new Persona("1A","nuria","cano",55)));

//        for(Persona persona:listaPersonas){
//            System.out.println(persona);
//        }

        for(Persona persona:listaPersonas){
            if(persona.getNombre().contains("o")){
                listaPersonas.remove(persona);
            }
            System.out.println(persona);
        }

        Iterator<Persona> iteradorPersona = listaPersonas.iterator();
        Persona p;
        while(iteradorPersona.hasNext()){
            p = iteradorPersona.next();
            if(p.getNombre().contains("o")){
                iteradorPersona.remove();
                System.out.println("Hem esborrat a -->" + p);
            }

        }
        System.out.println(listaPersonas);




    }
}
