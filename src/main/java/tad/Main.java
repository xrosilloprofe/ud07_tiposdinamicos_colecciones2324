package tad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lista listaEnteros = new Lista();
        listaEnteros.removeHead();
        listaEnteros.removeTail();
        listaEnteros.addHead(5);
        listaEnteros.addHead(10);
        listaEnteros.addHead(15);
        System.out.println(listaEnteros);
        listaEnteros.addTail(0);
        listaEnteros.addTail(-5);
        System.out.println(listaEnteros);
//        listaEnteros.removeHead();
//        listaEnteros.removeTail();
//        System.out.println(listaEnteros);
        System.out.println("5? -> " + listaEnteros.contains(5));
        System.out.println("9? -> " + listaEnteros.contains(9));
        System.out.println(listaEnteros.get(2));
        System.out.println(listaEnteros.get(0));
        System.out.println(listaEnteros.remove(2));
        System.out.println(listaEnteros);
        listaEnteros.addAll(new int[]{1,2,3,4,5});
        System.out.println(listaEnteros);
        System.out.println(Arrays.toString(listaEnteros.getAsArray()));

    }
}
