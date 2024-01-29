package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaComoInterfaz {
    public static void main(String[] args) {
        //Declro el objecto como clase, pero no es ok del to do...
        ArrayList<String> listaArray = new ArrayList<>();
        listaArray.add("Sarria");
        listaArray.add("Juno");
        listaArray.add("BeachHouse");
        listaArray.add("Second");
        imprimirArray(listaArray);

        LinkedList<String> listaLinked = new LinkedList<>(listaArray);
//        imprimirArray(listaLinked); <--no funciona

        imprimir(listaArray);
        imprimir(listaLinked);

        List<String> lista = new ArrayList<>(listaArray);
        lista.add("justice");
        imprimir(lista);

    }

    private static void imprimirArray(ArrayList<String> arrayList){
        for(String s:arrayList)
            System.out.print(" - " + s);
        System.out.println();
    }

    //NO TIENE SENTIDO REPETIR CÓDIGO !!!!!!!
    private static void imprimirLinked(LinkedList<String> listaEnlazada){
        for(String s:listaEnlazada)
            System.out.print(" - " + s);
        System.out.println();
    }

    private static void imprimir(List<String> lista){
        for(String s:lista)
            System.out.print(" - " + s);
        System.out.println();
    }

}
