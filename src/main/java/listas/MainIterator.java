package listas;

import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("e","d","c","b","a"));

        for(String cadena:lista){
//            if(cadena.equals("a"))
//                lista.remove(cadena);
            System.out.print("--> " + cadena);

        }
        System.out.println();

        Iterator<String> iterador = lista.iterator();
        while(iterador.hasNext()){
            String cadena = iterador.next();
            if(cadena.equals("a"))
                iterador.remove();
            else
                System.out.print("--> " + cadena);
        }
        System.out.println("\n"+lista);

        Set<String> conjunto1 = new HashSet<>(lista);
        Set<String> conjunto2 = new LinkedHashSet<>(lista);
        Set<String> conjunto3 = new TreeSet<>(lista);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
        System.out.println(conjunto3);
    }



}
